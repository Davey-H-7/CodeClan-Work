import React from 'react';
import Ship from "./Ship";

const ShipDetail = ({ ship, handleDelete, pirates }) => {

    if (ship) {

        return (
            <div className="component">
                <Ship ship={ship} pirates = {pirates} />
            </div>
        )
    }

    return (
        <p>Loading.....</p>
    )
}

export default ShipDetail;