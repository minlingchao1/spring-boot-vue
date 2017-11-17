<template>
	<div class="row">
		<div class="col-6">
			<h1>Login</h1>
			<form @submit.prevent="handleSubmit">
				<p>
					<label>Email</label>
					<input id="input__text" type="text" placeholder="Email" v-model="email" />
					<div v-if="errors.email.length" class="errors">
						<div v-for="error in errors.email">
							{{error}}
						</div>
					</div>
				</p>
				<p>
					<label>Password</label>
					<input id="input__text" type="password" placeholder="Password" v-model="password" />
					<div v-if="errors.password.length" class="errors">
						<div v-for="error in errors.password">
							{{error}}
						</div>
					</div>
				</p>
				<p>
					<input type="submit" value="Login"/>
				</p>
			</form>
		</div>
	</div>
</template>

<script>
import UserService from '@/services/UserService';

export default {
	name: 'Login',
	data() {
		return {
			email: '',
			password: '',
			errors: {
				email: [],
				password: []
			}
		};
	},
	methods: {
		validateForm() {
			let isValid = true;
			const errors = {
				email: [],
				password: []
			};

			if (!this.email.length) {
				errors.email.push('Adres email jest wymagany.');
				isValid = false;
			}

			if (this.email.indexOf('@') === -1) {
				errors.email.push('Nieprawdiłowy format adresu email.');
				isValid = false;
			}

			if (!this.password.length) {
				errors.password.push('Hasło jest wymagane.');
				isValid = false;
			}

			return { isValid, errors };
		},
		async handleSubmit() {
			const validationResult = this.validateForm();

			if (!validationResult.isValid) {
				this.errors = validationResult.errors;
				return false;
			}

			const user = {
				email: this.email,
				password: this.password
			};

			const response = await UserService.save(user);
			console.log(response);
		}
	}
};
</script>

<style scoped>
.errors {
	color: red;
	font-size: 12px;
	text-transform: uppercase;
}
</style>
