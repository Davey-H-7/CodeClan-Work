use zoo;

db.dropDatabase();

db.animals.insertMany([
{
    name: "Janet",
    type: "Polar Bear"
},
{
    name: "Zoltar",
    type: "Penguin",
    age: 5
}

])