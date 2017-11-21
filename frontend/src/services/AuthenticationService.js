import axios from 'axios';
import config from './config';
import $ from 'jquery';

class AuthenticationService {
	static login(data) {
		return axios.post('http://localhost:4040/login', data);
	}
};

export default AuthenticationService;