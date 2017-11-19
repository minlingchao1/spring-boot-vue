import axios from 'axios';
import config from './config';

const { domain, url, port } = config;

export default axios.create({
	baseURL: `${domain}:${port}${url}`
});
