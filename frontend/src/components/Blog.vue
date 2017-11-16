<template>
	<div class="posts">
		<h1>Blog</h1>
		<div class="row">
			<div :key="post.id" v-for="post in posts" class="col-3">
				<post-component :post="post" />
			</div>
		</div>
	</div>
</template>

<script>
import Post from './Post';
import PostsService from '@/services/PostsService';

export default {
	name: 'Blog',
	components: {
		'post-component': Post
	},
	data() {
		return {
			posts: [
				{
					id: 1,
					name: 'Learn Vue.je',
					content: 'Lorem ipsum dolor sit amet...',
					slug: 'adsasdasdas'
				},
				{
					id: 2,
					name: 'Spring Boot Applications for Dummies',
					content: 'Sit amet elis dolor lorem',
					slug: 'cxzczczccxz'
				}
			]
		}
	},
	async created () {
		const posts = await PostsService.getAll();
		console.log(posts);
	}
};
</script>

<style scoped>
	article {
		margin-bottom: 20px;
	}
</style>