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
export default {
	name: 'Login',
	data() {
		return {
			username: '',
			password: ''
		};
	},
	methods: {
		handleSubmit() {
			this.$store.dispatch('login', {
				username: this.username,
				password: this.password
			}).then(() => {
				this.$router.push({ path: '/' });
			});
		}
	}
};
</script>