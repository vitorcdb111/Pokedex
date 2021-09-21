import axios from '@/plugins/axios';

var service = {

    pokemon: {
        gottaCatch(pokemon){
            return axios.get('/pokedex/' + pokemon);
        }
    }
}

export default service;