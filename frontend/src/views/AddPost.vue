<template>
	<div>
		<h1>Add new Post</h1>
		<form @submit.prevent="handleSubmit">
			<p>
				<label>Post name</label>
				<input id="input__text" type="text" placeholder="Lorem ipsum" v-model="name" />
			</p>
			<p>
				<label>Post slug</label>
				<input id="input__text" type="text" placeholder="lorem-ipsum" v-model="slug" />
			</p>
			<p>
				<label>Post content</label>
				<textarea rows="8" cols="48" placeholder="Enter your content here" v-model="content"></textarea>
			</p>
			<p>
				<input type="submit" value="Save &amp; Back"/>
			</p>
		</form>
	</div>
</template>

<script>
import PostsService from '@/services/PostsService';

export default {
	name: 'AddPost',
	data () {
		return {
			name: '',
			slug: '',
			content: ''
		};
	},
	methods: {
		async handleSubmit () {
			const data = {
				name: this.name,
				slug: this.slug,
				content: this.content
			};
			const response = await PostsService.save(data);
			console.log(response);
		}
	}
};
</script>