const assert = require('assert')
const Decorator = require('../decorator.js')
const Can = require('../can.js')
const Room = require('../room.js')

describe('Decorator', function(){

    let decorator
    let can1
    let can2
    let can3
    let room
    
    this.beforeEach(function(){
        decorator = new Decorator();
        can1 = new Can(5)
        can2 = new Can(20)
        can3 = new Can(10)
        room = new Room(20)
    })


    it('should have paint stock', function(){

        const actual = decorator.paintStock;
        assert.deepStrictEqual(actual, [])
    })

    it('should add paint can to stock', function(){

        decorator.addToStock(can1)
        const actual = decorator.paintStock;
        assert.deepStrictEqual(actual, [can1])
    })

    it('should be able to calculate total litres in stock', function(){

        decorator.addToStock(can1)
        decorator.addToStock(can2)
        const actual = decorator.calculateLitres()
        assert.strictEqual(actual, 25)

    })

    it('should be able to check if it has enough paint for a room', function(){
        decorator.addToStock(can1)
        decorator.addToStock(can2)
        const actual = decorator.checkIfEnoughPaint(room)
        assert.strictEqual(actual, true)
    })

    it('should be able to paint room if succicient paint', function(){
        decorator.addToStock(can1)
        decorator.addToStock(can2)
        decorator.paintRoom(room)
        assert.strictEqual(room.painted, true)
    })

    it('should be able to decrease paint in stock when painting a room', function(){
        decorator.addToStock(can1)
        decorator.addToStock(can2)
        decorator.paintRoom(room)
        actual = decorator.calculateLitres()
        assert.strictEqual(actual, 5)
    })




})