import React from 'react';
import { Route, Routes, useParams } from 'react-router-dom';
import RaidList from '../components/raids/RaidList';
import RaidDetail from '../components/raids/RaidDetail';



const RaidContainer = ({raids}) => {

  const findRaidById = (id) => {
    return raids.find((raid) => {
      return raid.id === parseInt(id);
    })
  }

  const RaidDetailWrapper = () => {
    const { id } = useParams();
    let foundRaid = findRaidById(id)
    return <RaidDetail raid={foundRaid} handleDelete={handleDelete} />;
  };

  const handleDelete = (id) => {
    // TODO: use API to delete by ID
    window.location = '/raids';
  }

  return (
    <Routes>
      <Route path="/:id" element={
        <RaidDetailWrapper />} />
      <Route path="/" element={<RaidList raids={raids} />} />
    </Routes>
  )

}

export default RaidContainer;
