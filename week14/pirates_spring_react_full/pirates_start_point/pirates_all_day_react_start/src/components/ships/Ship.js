import React from 'react';

const Ship = ({ship, pirates}) => {

	let pirateList = [];

	for(let pirate of pirates){
		if (pirate.ship.name === ship.name){
		pirateList.push(pirate)
	}}

	const pirateNodes = pirateList.map((pirate) =>{
		return <p> {pirate.firstName} {pirate.lastName}</p>
	})




	return (
		<div className="component">
			<p className="name">
				{ship.name}
			</p>

			<p>Pirates:</p>
			{pirateNodes}

		</div>
	)
}

export default Ship;
