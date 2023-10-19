const assert = require('assert')
const Taxi = require('../taxi.js')

describe('Taxi', function(){
    let taxi

    beforeEach(function(){
        //arrange
        taxi = new Taxi('Toyota', 'Prius')
    })

    it('should have a manufacturer', function(){
        //act
        const actual = taxi.manufacturer;
        //assert
        assert.strictEqual(actual, 'Toyota')
    })

    it('should have a model', function(){
        //act
        const actual = taxi.model;
        //assert
        assert.strictEqual(actual, 'Prius')
    })

    it('should start with no passengers', function(){
        const actual = taxi.passengers;
        assert.deepStrictEqual(actual, [])
    })
    it('should be able to add a passenger', function(){
        taxi.addPassenger('Mike')
        const actual = taxi.numberOfPassengers()
        assert.strictEqual(actual, 1)
    })

})