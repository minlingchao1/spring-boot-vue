<template>
	<header>
		<nav class="nav">
			<div class="nav-left">
				<router-link class="logo" to="/">
					Dead Simple Blog
				</router-link>
			</div>
			<div class="nav-right">
				<router-link to="/blog">
					Blog
				</router-link>
				<router-link v-show="$store.state.isLoggedIn" to="/add-post">
					Add Post
				</router-link>
				<router-link v-show="!$store.state.isLoggedIn" to="/login">
					Login
				</router-link>
				<a href="#" @click.prevent="handleLogout" v-show="$store.state.isLoggedIn">
					Logout
				</a>
			</div>
		</nav>
	</header>
</template>

<script>
export default {
	name: 'Header',
	methods: {
		handleLogout() {
			this.$store.dispatch('setToken', null);
			this.$router.push({ path: '/' });
		}
	}
};
</script>

<style scoped>
	.logo {
		font-weight: bold;
		padding: 0;
		text-transform: uppercase;
	}
	.nav {
		border-bottom: 1px solid #ccc;
	}
</style>