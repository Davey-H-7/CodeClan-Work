const Decorator = function(){
    this.paintStock = []
}

Decorator.prototype.addToStock = function(can){
    this.paintStock.push(can);

}

Decorator.prototype.calculateLitres = function(){
    let total = 0
    for (can of this.paintStock){
    total += can.volume
    }
    return total
}

Decorator.prototype.checkIfEnoughPaint = function(room){
    paint = this.calculateLitres()
    if (paint >= room.area){
        return true
    }
    else{
        return false
    }
}

Decorator.prototype.paintRoom = function(room){
if(this.checkIfEnoughPaint(room)){
    room.painted = true
    this.reducePaint(room)
}
    
}

Decorator.prototype.reducePaint = function(room){
    let newStock =[]
    let areaToPaint = room.area
    for(let can of this.paintStock){
        if(can.volume > areaToPaint){
            can.volume -= areaToPaint
            newStock.push(can)
        }
        areaToPaint -= can.volume
    }
    this.paintStock = newStock
}




module.exports = Decorator