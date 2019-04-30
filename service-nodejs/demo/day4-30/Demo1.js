var  express  = require('express');
var app = express();
var userInfo = [

];
app.get('/user/:name',function (req,res) {
    res.send(req.params.name);
});
app.listen(3000);
