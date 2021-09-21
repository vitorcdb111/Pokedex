<template>
  <div class="top-screen-container">
    <div id="about-screen" class="right-panel-screen">
       Weight: {{pokemon.weight}}kg 
      <spanv-for="pokemon in retorno" v-bind:key="pokemon.id" >
        Height: {{pokemon.height}}cm
      </span>
    </div>
  </div>
</template>
