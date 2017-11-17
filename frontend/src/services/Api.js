import axios from 'axios';
import config from '../config';

const { port } = config;

export default axios.create({
	baseURL: `http://localhost:${port}/api/`
});
