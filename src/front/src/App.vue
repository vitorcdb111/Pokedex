<template>
   <div id="app">    
      <div class="logo">
        <img alt="Pokedex logo" src="./assets/images/pokedex-logo.png" style="width: 600px;">
      </div>

      <div class="search-container">
        <input v-model="searchPokemonData.pokemon" id="name-input" type="text" placeholder="Name / id" required/>

        <div id="search-btn" class="ball-container" @click="search()">
          <div class="upper-half-ball"></div>
          <div class="bottom-half-ball"></div>
          <div class="center-ball"></div>
          <div class="center-line"></div>
        </div>
      </div>  

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
import service from "@/services/service";

export default {
  name: 'App',
  data(){
    return{
      searchPokemonData:{
        pokemon: "",
        retorno:[],
      }
    }
  },
  methods:
  {
    search()
    {
      service.pokemon.gottaCatch(this.searchPokemonData.pokemon)
      .then((response) => {
        console.log("response");
        console.log(response);
        console.log("response 2");
        console.log(response.data);
        this.retorno = response.data;
      })
      .catch((e) => {
        console.log(e);
      })        
    }
  },
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
  }
};  
</script>

<style>
@import './assets/css/style.css';
</style>
