import Vue from 'vue';
import Vuex from 'vuex';

import AuthenticationService from '@/services/AuthenticationService';

Vue.use(Vuex);

const LOGIN = "LOGIN";
const LOGOUT = "LOGOUT";

export default new Vuex.Store({
	state: {
		isLoggedIn: !!localStorage.getItem('token')
	},
	mutations: {
		[LOGIN] (state, token) {
			state.isLoggedIn = true;
		},
		[LOGOUT] (state) {
			state.isLoggedIn = false
		}
	},
	actions: {
		async login({ commit }, creds) {
			const repsonse = await AuthenticationService.login(creds);
			const token = repsonse.data.token;

			localStorage.setItem('token', token);
			commit(LOGIN, token);
		},
		logout({ commit }) {
			localStorage.removeItem('token');
			commit(LOGOUT);
		}
	},
	getters: {
		isLoggedIn: state => state.isLoggedIn
	}
});
