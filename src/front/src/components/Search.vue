<template>
  <div class="search-container">
    <input id="name-input" type="text" placeholder="Name / id" />

    <div id="search-btn" class="ball-container" @click="teste()">
      <div class="upper-half-ball"></div>
      <div class="bottom-half-ball"></div>
      <div class="center-ball"></div>
      <div class="center-line"></div>
    </div>
  </div>  
</template>


methods:
{
  teste()
  {
    console.log("entrouuu");
    alert("Teste");
  }
},