import Vue from 'vue';
import Vuex from 'vuex';

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
		login({ commit }, token) {
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
