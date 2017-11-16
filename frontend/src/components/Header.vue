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
				<router-link to="/add-post">
					Add Post
				</router-link>
			</div>
		</nav>
	</header>
</template>

<script>
export default {
	name: 'Header'
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