<script lang="ts">
import HelloScala from "@/components/HelloScala.vue";
import NavigationHeader from "@/components/NavigationHeader.vue";
import {defineComponent} from "vue";
import VueParticles from "@/components/VueParticles.vue";

export default defineComponent({
  components: {
    VueParticles,
    NavigationHeader,
    HelloScala,
  },
  data() {
    return {}
  },
  created() {
  },
  mounted() {

  },
  beforeUnmount() {
  },
  methods: {
    demoMethod() {

    }
  }
})
</script>

<template>
  <VueParticles/>
  <div>

    <nav id="navigation-header" class="light-blue lighten-1 header-background" role="navigation">
      <NavigationHeader></NavigationHeader>
    </nav>


    <div id="index-banner">
      <HelloScala msg="Hello"></HelloScala>
    </div>
    <footer class="page-footer orange">
      <div class="container">
        <div class="row">
          <div class="col l6 s12">
            <h5 class="white-text">Company Bio</h5>
            <p class="grey-text text-lighten-4">
              We are a team of frantic geeks on this project like it's our full time job.
              Any amount would help support and continue development on this project and is greatly appreciated.
            </p>


          </div>
          <div class="col l3 s12">
            <h5 class="white-text">Settings</h5>
            <ul>
              <li><a class="white-text" href="#!">Link 1</a></li>
              <li><a class="white-text" href="#!">Link 2</a></li>
              <li><a class="white-text" href="#!">Link 3</a></li>
              <li><a class="white-text" href="#!">Link 4</a></li>
            </ul>
          </div>
          <div class="col l3 s12">
            <h5 class="white-text">Connect</h5>
            <ul>
              <li><a class="white-text" href="#!">Link 1</a></li>
              <li><a class="white-text" href="#!">Link 2</a></li>
              <li><a class="white-text" href="#!">Link 3</a></li>
              <li><a class="white-text" href="#!">Link 4</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="footer-copyright">
        <div class="container">
          Made by <a class="orange-text text-lighten-3" href="#">Hello Scala</a>
        </div>
      </div>
    </footer>
  </div>

</template>

<style scoped>
.header-background {
  background: linear-gradient(to right, #f44336 41%, #1a237e 59%);
}

div#index-banner {
  height: 620px;
}

</style>