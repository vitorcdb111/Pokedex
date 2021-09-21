<template>
  <div class="bottom-screens-container">
    <div v-for="pokemon in $parent.retorno" v-bind:key="pokemon.id" id="type-screen" class="right-panel-screen"> {{pokemon.types}}</div> 
    <div v-for="pokemon in $parent.retorno" v-bind:key="pokemon.id" id="id-screen" class="right-panel-screen">#{{pokemon.id}}</div>
  </div>
</template>