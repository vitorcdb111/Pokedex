import axios from 'axios';

var instance = axios.create({
    baseURL: "http://localhost:8080/",
    headers: {
        'Content-type': 'application/json'
    }

})

export default instance;