<template>
  <div id="app" class="container">
    <header-component></header-component>
    <router-view/>
    <footer-component></footer-component>
  </div>
</template>

<script>
import Header from '@/components/Header';
import Footer from '@/components/Footer';

export default {
  name: 'app',
  components: {
    'header-component': Header,
    'footer-component': Footer,
  }
};
</script>
