import React from 'react';
import { Route, Routes, useParams } from 'react-router-dom';
import ShipList from '../components/ships/ShipList';
import ShipDetail from '../components/ships/ShipDetail';


const ShipContainer = ({pirates, ships}) => {


  const findShipById = (id) => {
    return ships.find((ship) => {
      return ship.id === parseInt(id);
    })
  }

  const ShipDetailWrapper = () => {
    const { id } = useParams();
    let foundShip = findShipById(id)
    return <ShipDetail ship={foundShip} handleDelete={handleDelete} />;
  };

  const handleDelete = (id) => {
    // TODO: use API to delete by ID
    window.location = '/ships';
  }

  return (
    <Routes>
      <Route path="/:id" element={
        <ShipDetailWrapper />
      } />
      <Route path="/" element={<ShipList ships={ships} pirates = {pirates} />} />
    </Routes>
  )

}

export default ShipContainer;
