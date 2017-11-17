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
			posts: []
		}
	},
	async created () {
		const response = await PostsService.getAll();
		this.posts = response.data;
	}
};
</script>

<style scoped>
	article {
		margin-bottom: 20px;
	}
</style>