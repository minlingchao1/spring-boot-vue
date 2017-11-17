<template>
  <div class="home-text">
    <h1>{{ msg }}</h1>
    <p>
      Lorem ipsum dolor sit amet, consectetur adipiscing elit. In mattis pellentesque pellentesque. Nam ullamcorper, risus ut tempor vestibulum, nulla urna rutrum augue, nec iaculis erat diam nec ex. Nulla id eros in risus efficitur suscipit eu id nulla. Donec molestie purus nec euismod sollicitudin. Quisque sagittis venenatis dignissim. Nullam sit amet enim a lectus tempus faucibus a vitae justo. Duis ullamcorper, risus a tincidunt condimentum, purus metus vehicula dolor, eget laoreet ligula risus euismod tortor. Nullam lobortis, massa a tempus auctor, tellus mi cursus quam, vel tempus ex turpis sit amet mauris. Quisque nec ullamcorper justo, nec varius dolor. Cras ac tincidunt eros. Nam accumsan metus nulla, sit amet vulputate purus tempor sed. Integer tincidunt justo in nisl congue cursus in ac nulla.
    </p>
    <div class="is-center">
      <router-link class="button primary" to="/blog">Learn More</router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
      msg: 'Vue.js & Spring Boot App'
    }
  }
}
</script>

<style scoped>
.home-text {
  text-align: justify;
  margin-bottom: 20px;
}
</style>
