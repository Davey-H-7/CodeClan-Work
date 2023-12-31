import React from 'react';
import Ship from './Ship.js';


const ShipList = ({ships, pirates}) => {
	const shipNodes = ships.map((ship) => {
		return (<li key={ship.id} className="component-item">
			<Ship ship={ship} pirates = {pirates} />
		</li>
		)
	})

	return (
		<ul className="component-list">
			{shipNodes}
		</ul>

	)
}
export default ShipList;
