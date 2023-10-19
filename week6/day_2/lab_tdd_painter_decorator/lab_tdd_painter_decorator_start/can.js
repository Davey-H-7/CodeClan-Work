const Can = function(volume){
this.volume = volume
this.isCanEmpty = false

}

Can.prototype.empty = function(){
    this.isCanEmpty = true;
}

module.exports = Can