const assert = require('assert')
const Can = require('../can.js')

describe('Can', function(){

    let can

    this.beforeEach(function(){
        //arrange
        can = new Can(20);
    })

    it('should have a volume', function(){

        const actual = can.volume;
        assert.strictEqual(actual,20)
    })

    it('should not be empty', function(){

        const actual = can.isCanEmpty;
        assert.strictEqual(actual, false)
    })

    it('can be emptied', function(){
        can.empty()
        const actual = can.isCanEmpty;
        assert.strictEqual(actual, true)
    })
})