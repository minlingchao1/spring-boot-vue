<template>
	<div class="single-post">
		<h1>{{post.name}}</h1>
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
				content: ''
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