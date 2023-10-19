// var name = 'Jill'


// var secretsFunction = function() { 
//     var pinCode = [0,0,0,0];
//     console.log('pinCode:', pinCode);
//     console.log('name inside function', name);
// }

// secretsFunction()


// use let to keep scope of variable within block rather than function
//define cariables at 
// var filterNamesByFirstLetter = function(names, letter){
//     let filteredNames = []
//     for (let name of names){
//         if(name[0] === letter){
//             filteredNames.push(name)
//         }
//     }
//     return filteredNames
// }

// var students = ['Alice', 'Bob', 'Zoltan', 'Gary', 'Artem']
// var filteredStudents = filterNamesByFirstLetter(students, 'A')
// console.log('filteredStudents:', filteredStudents);

// const variable cannot be changed after being defined
let calculateEnergy = function(mass){
    const speedOfLight = 299792458
    return mass * speedOfLight **2
}

let energy = calculateEnergy(75)
console.log(energy);

const song = {
    title: 'Raspberry Beret',
    artist: 'Prince'
}

console.log('song before mutation:', song);
song.title = 'When Doves Cry'
console.log('song after mutation:', song);