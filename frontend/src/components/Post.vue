<template>
	<article class="card">
		<header>
			<h4>{{post.name}}</h4>
		</header>
		<p>{{post.content}}</p>
		<footer class="is-right">
			<router-link  class="button primary" :to="{ path: link }">Read More</router-link>
		</footer>
	</article>
</template>

<script>
	export default {
		name: 'Post',
		props: ['post'],
		data () {
			return {
				link: `/blog/${this.post.slug}`
			}
		}
	}
</script>