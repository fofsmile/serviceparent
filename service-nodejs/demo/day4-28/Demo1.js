var express = require('express');
var bodyParser= require('body-parser');
var app = express();
app.use(bodyParser.urlencoded({extended:false}));
// app.all("/hello",function (req,res) {
//     console.log('get request');
//     console.log(req.query.userName);
//     res.send(req.query.userName);
// });
app.post("/hello",function (req,res) {
   console.log('post request');
   res.send(req.body.userName);
});
app.listen(3000);