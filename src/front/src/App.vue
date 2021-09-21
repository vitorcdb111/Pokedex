<template>
   <div id="app">    
      <div class="logo">
        <img alt="Pokedex logo" src="./assets/images/pokedex-logo.png" style="width: 600px;">
      </div>

      <Search/>    

      <div id="pokedex">
        <!-- Left-Panel -->                        
        <div id="left-panel">
          <TopLights/>
          <CenterScreen/>
          <BottomButtons/>
        </div>
        <!-- End of Left-panel -->
        <!-- Right-panel -->
        <div id="right-panel">
          <BlankContainer/>
          <TopScreen/>
          <BlueButtons/>
          <CenterButtons/>
          <BottomScreen/>
        </div>
        <!-- End of Right-panel -->
      </div>
  </div>
</template>

<script>
import TopLights from './components/TopLights.vue'
import CenterScreen from './components/CenterScreen.vue'
import BottomButtons from './components/BottomButtons.vue'
import BlankContainer from './components/BlankContainer.vue'
import TopScreen from './components/TopScreen.vue'
import BlueButtons from './components/BlueButtons.vue'
import CenterButtons from './components/CenterButtons.vue'
import BottomScreen from './components/BottomScreen.vue'
import Search from './components/Search.vue'

export default {
  name: 'App',
  components:
  {
    TopLights,
    CenterScreen,
    BottomButtons,  
    BlankContainer,  
    TopScreen,
    BlueButtons,
    CenterButtons,
    BottomScreen,
    Search
  }
};
</script>

<style>
@import './assets/css/style.css';
</style>
