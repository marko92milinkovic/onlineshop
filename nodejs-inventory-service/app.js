const Eureka = require('eureka-js-client').Eureka;

// example configuration
// example configuration
const client = new Eureka({
    // application instance information
    instance: {
        app: 'jqservice',
        hostName: 'localhost',
        ipAddr: '127.0.0.1',
        port: {
            '$': 3000,
            '@enabled': 'true',
        },
        vipAddress: 'jq.test.something.com',
        statusPageUrl: 'http://localhost:3000/info',
        dataCenterInfo: {
            '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
            name: 'MyOwn',
        },
    },
    eureka: {
        // eureka server host / port
        host: '127.0.0.1',
        port: 8761,
        servicePath: '/eureka/apps/'
    },
});

function connectToEureka() {
    client.logger.level('debug');
    client.start(function (error) {
        console.log('########################################################');
        console.log(JSON.stringify(error) || 'Eureka registration complete');
    });
}

connectToEureka();

const express = require('express');
const app = express();

// respond with "hello world" when a GET request is made to the homepage
app.get('/get', function (req, res) {
    console.log('hello. there is a new request');
    res.send('hello world')
});

app.listen(3000);