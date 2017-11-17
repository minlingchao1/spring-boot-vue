import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
	strict: true,
	state: {
		token: null,
		isLoggedIn: false
	},
	mutations: {
		setToken(state, token) {
			state.token = token;
			state.isLoggedIn = token ? true : false;
		}
	},
	actions: {
		setToken({ commit }, token) {
			commit('setToken', token);
		}
	}
});
