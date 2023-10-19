// var sports = [];
// var sports = ['football', 'tennis', 'rugby'];
// console.log(sports.length);

// var firstSport =sports[0]
// console.log(firstSport);

// sports.push('curling');
// sports.push('snooker');

// console.log(sports);
// sports.pop();

// console.log(sports);

// sports.unshift('basketball')
// console.log(sports);
// sports.shift();

// console.log(sports);

// var removedSport = sports.splice(2, 1);
// console.log(sports);

// for( var currentSport of sports){
//     var uppercasedSport = currentSport.toUpperCase()
//     console.log(uppercasedSport);
// }


// var numbers = [1,2,3,3,4,5];
// for(var i = 0; i < numbers.length; i++){
//     if(numbers[i] == numbers[i -1 ]){
//         console.log('found it');
//     }
// }

var movie ={
    title: 'It\'s a wonderful life',
    year: 1946,
    language: 'Spanish'
}
console.log('movie: ', movie);

var title = movie.title
console.log('title:', title);

movie.cast = ['James Stewart', 'Donna Read']
console.log('movie:', movie);

movie.language = 'English'
console.log('movie:', movie);

movie['language'] = 'French';
console.log('movie:',movie);

movie['rating'] = 4;
console.log('movie:', movie)

// variables with special characters i.e. - must be created using below method
movie['subtitle-language'] = 'German';
console.log('movie', movie);

var propertyToAccess = 'subtitle-language'
console.log(movie[propertyToAccess]);

delete movie.rating
console.log(movie);

movie.ratings ={
    critic: 94,
    audience: 95
}
console.log(movie);

for (var key in movie){
    var value = movie[key]
    console.log(`The ${key} is ${value}`);
}

var keys = Object.keys(movie)
console.log('keys', keys);