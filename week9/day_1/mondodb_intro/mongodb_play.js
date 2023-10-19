use zoo;

const id = ObjectId('65118f7303ce969959c79031')
db.animals.findOne({_id: id})

db.animals.updateOne(
    {_id: id},
    {$set: {name: "Kowalski"}}
);

db.animals.deleteOne(
    {_id: id}
);
