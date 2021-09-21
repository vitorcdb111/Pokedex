<template>
   <div id="app">    
      <div class="logo">
        <img alt="Pokedex logo" src="./assets/images/pokedex-logo.png" style="width: 600px;">
      </div>

      <div class="search-container">
        <input v-model="pokemon" id="name-input" type="text" placeholder="Name / id" required/>

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
          <div class="left-top-container">
            <svg height="100" width="225" class="left-svg">
              <polyline
                  points="0,75 70,75 90,38 224,38"
                  style="fill: none; stroke: black; stroke-width: 3"
              />
            </svg>
            <div class="lights-container">
              <div class="big-light-boarder">
                <div class="big-light blue">
                  <div class="big-dot light-blue"></div>
                </div>
              </div>
              <div class="small-lights-container">
                <div class="small-light red">
                  <div class="dot light-red"></div>
                </div>
                <div class="small-light yellow">
                  <div class="dot light-yellow"></div>
                </div>
                <div class="small-light green">
                  <div class="dot light-green"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="screen-container">
            <div class="screen">
              <div class="top-screen-lights">
                <div class="mini-light red"></div>
                <div class="mini-light red"></div>
              </div>
              <div v-if="tipos.length" :style="estiloImagem"></div>
              <div v-else id="main-screen"></div>
              <div class="bottom-screen-lights">
                <div class="small-light red">
                  <div class="dot light-red"></div>
                </div>
                <div class="burger">
                  <div class="line"></div>
                  <div class="line"></div>
                  <div class="line"></div>
                  <div class="line"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="buttons-container">
            <div class="upper-buttons-container">
              <div class="big-button"></div>
              <div class="long-buttons-container">
                <div class="long-button red"></div>
                <div class="long-button light-blue"></div>
              </div>
            </div>
            <div class="nav-buttons-container">
              <div class="dots-container">
                <div>.</div>
                <div>.</div>
              </div>
              <div v-if="tipos.length" class="green-screen">
                <span id="name-screen"> {{retorno.name}}</span>
              </div>
              <div v-else class="green-screen">
                  <span id="name-screen2">bulbasaur</span>
              </div>
              <div class="right-nav-container">
                <div class="nav-button">
                  <div class="nav-center-circle"></div>
                  <div class="nav-button-vertical"></div>
                  <div class="nav-button-horizontal">
                    <div class="border-top"></div>
                    <div class="border-bottom"></div>
                  </div>
                </div>
                <div class="bottom-right-nav-container">
                  <div class="small-light red">
                    <div class="dot light-red"></div>
                  </div>
                  <div class="dots-container">
                    <div class="black-dot">.</div>
                    <div class="black-dot">.</div>
                    <div class="black-dot">.</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- End of Left-panel -->
        <!-- Right-panel -->
        <div id="right-panel">
          <div class="left-top-container">
            <svg height="100" width="225" class="left-svg">
              <polyline
                  points="0,75 70,75 90,38 224,38"
                  style="fill: none; stroke: black; stroke-width: 3"
              />
            </svg>
            <div class="lights-container">
              <div class="big-light-boarder">
                <div class="big-light blue">
                  <div class="big-dot light-blue"></div>
                </div>
              </div>
              <div class="small-lights-container">
                <div class="small-light red">
                  <div class="dot light-red"></div>
                </div>
                <div class="small-light yellow">
                  <div class="dot light-yellow"></div>
                </div>
                <div class="small-light green">
                  <div class="dot light-green"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="top-screen-container">
            <div v-if="tipos.length" id="about-screen" class="right-panel-screen">
              Weight: {{retorno.weight}}kg
              Height: {{retorno.height}}cm
            </div>
            <div v-else  class="right-panel-screen">
              Weight: 69kg
              Height: 7cm
            </div>
          </div>
          <div class="square-buttons-container">
            <div class="blue-squares-container">
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
              <div class="blue-square"></div>
            </div>
          </div>
          <div class="center-buttons-container">
            <div class="center-left-container">
              <div class="small-reds-container">
                <div class="small-light red">
                  <div class="dot light-red"></div>
                </div>
                <div class="small-light red">
                  <div class="dot light-red"></div>
                </div>
              </div>
              <div class="white-squares-container">
                <div class="white-square"></div>
                <div class="white-square"></div>
              </div>
            </div>
            <div class="center-right-container">
              <div class="thin-buttons-container">
                <div class="thin-button"></div>
                <div class="thin-button"></div>
              </div>
              <div class="yellow-button yellow">
                <div class="big-dot light-yellow"></div>
              </div>
            </div>
          </div>
          <div v-if="tipos.length" class="bottom-screens-container">
            <div v-for="type in tipos" v-bind:key="type.id" id="type-screen" class="right-panel-screen">
              {{type.type.name}}
            </div>
            <div id="id-screen" class="right-panel-screen">#{{retorno.id}}</div>
          </div>
          <div v-else class="bottom-screens-container">
            <div class="right-panel-screen">
              grass
            </div>
            <div class="right-panel-screen">
              poison
            </div>
            <div class="right-panel-screen">#1</div>
          </div>
        </div>
        <!-- End of Right-panel -->
      </div>
  </div>
</template>

<script>
import service from "@/services/service";

export default {
  name: 'App',
  data(){
    return{
      retorno:[],
      tipos:[],
      pokemon: "",
      background: "",
    }
  },
  methods:
  {
    search()
    {
      service.pokemon.gottaCatch(this.pokemon)
      .then((response) => {
        let id = ('00' + response.data.id).slice(-3);
        this.background = `url(https://assets.pokemon.com/assets/cms2/img/pokedex/full/${id}.png)`;
        this.tipos = response.data.types;
        this.retorno = response.data;
      })
      .catch((e) => {
        console.log(e);
      })
    }
  },
  computed:
  {
    estiloImagem()
    {
      return {
        'height': '100%',
        'width': '80%',
        'justify-self': 'center',
        'background-color': 'var(--main-screen-bg-color)',
        'border': 'solid black 2px',
        'border-radius': '5%',
        'background-image': this.background,
        'background-position': 'center',
        'background-repeat': 'no-repeat',
        'background-size': 'contain',
      }
    }
  }
};  
</script>

<style>
@import './assets/css/style.css';
</style>
