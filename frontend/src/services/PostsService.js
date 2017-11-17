import Api from './Api';

class Posts {
	static getAll() {
		return Api.get(`posts`);
	}

	static getPostBySlug(slug) {
		const url = `posts?slug=${slug}`; 
		return Api.get(url);
	}

	static save(data) {
		const url = `posts`;
		return Api.post(url, data);
	}
};

export default Posts;