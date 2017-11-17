import Home from '@/views/Home';
import AddPost from '@/views/AddPost';
import Post from '@/views/Post';
import Blog from '@/views/Blog';
import Login from '@/views/Login';

export const routes = [
	{
		path: '/',
		name: 'Home',
		component: Home
	},
	{
		path: '/blog',
		name: 'Blog',
		component: Blog
	},
	{
		path: '/add-post',
		name: 'AddPost',
		component: AddPost
	},
	{
		path: '/blog/:slug',
		name: 'Post',
		component: Post
	},
	{
		path: '/login',
		name: 'Login',
		component: Login
	}
];
