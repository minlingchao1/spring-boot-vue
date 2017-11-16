import HomePage from '@/components/HomePage'
import AddPost from '@/components/AddPost'
import Single from '@/components/Single'
import Blog from '@/components/Blog'

export const routes = [
	{
		path: '/',
		name: 'HomePage',
		component: HomePage
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
		name: 'Single',
		component: Single
	}
];