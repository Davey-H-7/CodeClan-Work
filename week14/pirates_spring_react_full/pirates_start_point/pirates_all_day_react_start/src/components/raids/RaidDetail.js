import React from 'react';
import Raid from "./Raid";

const RaidDetail = ({ raid, handleDelete, pirates }) => {

    if (raid) {

        return (
            <div className="component">
                <Raid raid={raid} pirates = {pirates} />
            </div>
        )
    }

    return (
        <p>Loading.....</p>
    )
}

export default RaidDetail;