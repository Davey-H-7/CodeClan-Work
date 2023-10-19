const assert = require('assert');

const firstArray = [1, 2, 3]
const secondArray = [1, 2, 3]

// fails
// assert.equal(firstArray, secondArray)

// passes
assert.deepEqual(firstArray, secondArray)
// assert.strictEqual(1, '1')