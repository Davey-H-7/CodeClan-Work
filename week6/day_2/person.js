const Person = function(name, pet){
    this.name = name
    this.pet = pet

}

Person.prototype.greet = function(){
    return 'Hi! My name is ' + this.name

}

Person.prototype.feedpet = function(food){
    console.log(`${this.name} fed ${this.pet.name} a ${food}`);
    this.pet.eat(food)
}

module.exports = Person

// const shaggy = new Person('Shaggy Rogers')
// console.log('shaggy:', shaggy.name)
// console.log(shaggy.greet());

// const velma = new Person('Velma Dinkley')
// console.log(velma.greet());
