<template>
  <div class="search-container">
    <input v-model="searchPokemonData.pokemon" id="name-input" type="text" placeholder="Name / id" required/>

    <div id="search-btn" class="ball-container" @click="search()">
      <div class="upper-half-ball"></div>
      <div class="bottom-half-ball"></div>
      <div class="center-ball"></div>
      <div class="center-line"></div>
    </div>
  </div>  
</template>

<script>
import service from "@/services/service";
export default{
  name: "Search",
  data(){
    return{
      searchPokemonData:{
        pokemon: ""
      }
    }
  },
  methods:
    {
      search()
      {
        service.pokemon.gottaCatch(this.searchPokemonData.pokemon)
        .then((response) => {
          console.log(response);
        })
        .catch((e) => {
          console.log(e);
        })        
      }
    }
}    
</script>