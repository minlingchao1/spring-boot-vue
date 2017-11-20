<template>
	<article class="card">
		<header>
			<h4 class="post__title">
				<router-link :to="{ path: link }">
					{{post.name}}
				</router-link>
			</h4>
			<div class="post-author">Autor: {{post.account.email}}</div>
		</header>
		<p>{{post.content | truncate(100)}}</p>
		<footer class="is-right">
			<router-link  class="button primary" :to="{ path: link }">
				Read More &raquo;
			</router-link>
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

<style>
.post-author {
	color: #555;
	font-size: 12px;
	font-weight: bold;
}
.post__title {
	margin-bottom: 0!important;
}
</style>
