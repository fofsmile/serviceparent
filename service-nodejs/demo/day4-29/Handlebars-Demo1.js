var express = require('express');
var handlebars = require('express3-handlebars').create({__dirname:'main'});
var path = require('path');
var app = express();
app.engine('handlebars',handlebars.engine);
app.set('views',path.join(__dirname,'views'));
app.set('view engine','handlebars');

app.get("/hello",function (req,res) {
    //console.log(path);
    console.log(__dirname);
   res.render('hello',{hello:'hello world'});
});
app.listen(3000);



