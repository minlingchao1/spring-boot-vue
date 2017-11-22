<template>
	<div class="row is-center">
		<div class="col-6">
			<h1>Login</h1>
			<form @submit.prevent="handleSubmit">
				<p>
					<label>Username</label>
					<input type="text" placeholder="Username" v-model="username" />
				</p>
				<p>
					<label>Password</label>
					<input type="password" placeholder="Password" v-model="password" />
				</p>
				<p>
					<input type="submit" value="Login"/>
				</p>
			</form>
		</div>
	</div>
</template>

<script>
import AuthenticationService from '@/services/AuthenticationService';

export default {
	name: 'Login',
	data() {
		return {
			username: '',
			password: ''
		};
	},
	methods: {
		async handleSubmit() {
			try {
				const response = await AuthenticationService.login({
					username: this.username,
					password: this.password
				});
				
				if (response.status === 200) {
					this.$store.dispatch('login', response.data.token);
					this.$router.push({ path: '/' });
				}
			} catch (e) {
				throw new Error(e);
			}
		}
	}
};
</script>