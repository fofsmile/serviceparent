var express = require('express');
var app = express();
var users = [
    {id:0,userName:'test',password:123456},
    {id:0,userName:'test',password:123456},
    {id:0,userName:'test',password:123456}
];
app.all('/getUser',function (req,res) {
   console.log('request in ');
   res.json(users);
});
app.listen(3000);
