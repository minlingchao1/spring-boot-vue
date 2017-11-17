<template>
	<div class="row is-center">
		<div class="col-6">
			<h1>Login</h1>
			<form @submit.prevent="handleSubmit">
				<p>
					<label>Email</label>
					<input id="input__text" type="text" placeholder="Email" v-model="email" />
				</p>
				<p>
					<label>Password</label>
					<input id="input__text" type="password" placeholder="Password" v-model="password" />
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
			email: '',
			password: ''
		};
	},
	methods: {
		async handleSubmit() {
			const response = await AuthenticationService.login({
				email: this.email,
				password: this.password
			});
			this.$store.dispatch('setToken', '123456');
			this.$router.push({ path: '/' });
		}
	}
};
</script>