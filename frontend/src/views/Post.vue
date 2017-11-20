<template>
	<div class="single-post">
		<h1 class="single-post__title">{{post.name}}</h1>
		<div class="single-post__author">Autor: {{post.account.email}}</div>
		<p>
			{{post.content}}
		</p>
	</div>
</template>

<script>
import PostsService from '@/services/PostsService';

export default {
	name: 'Single',
	data () {
		return {
			post: {
				name: '',
				content: '',
				account: {
					email: ''
				}
			}
		};
	},
	async created () {
		const slug = this.$route.params.slug;
		const response = await PostsService.getPostBySlug(slug);
		this.post = response.data;
	}
};
</script>

<style>
.single-post__title {
	margin-bottom: 0;
}
.single-post__author {
	margin-bottom: 20px;
	color: #555;
	font-size: 12px;
	font-weight: bold;
}
</style>
