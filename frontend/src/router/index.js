import Vue from 'vue'
import Router from 'vue-router'
import { routes } from './routes'
import store from '@/store/store';

Vue.use(Router)

const router = new Router({
  mode: 'history',
  routes
});

router.beforeEach((to, from, next) => {
  if (to.matched.some(record => record.meta.requiresAuth)) {
    if (!store.state.isLoggedIn) {
      next({
        path: '/login'
      })
    } else {
      next()
    }
  } else {
    next()
  }
})

export default router;