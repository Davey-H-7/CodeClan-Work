import {useState, useEffect} from "react";
import LaunchSelector from "../components/LaunchSelector";
import LaunchDetails from "../components/LaunchDetails";
import styled from 'styled-components'


const Title = styled.h1`
  text-align: center;
  font-size: 2em;
  background-color: #062c43;
  color: #fff;
  margin: 0;
  padding: 1em;
`



const LaunchContainer = () => {

  const [launch, setLaunch] = useState(null);
  const [selectedLaunchId, setSelectedLaunchId] = useState(1);

  useEffect(() => {
    getLaunch();
  }, [selectedLaunchId]);

  const getLaunch = async () => {
    const launchResponse = await fetch(`https://api.spacexdata.com/v3/launches/${selectedLaunchId}`)
    const launchData = await launchResponse.json()
    setLaunch(launchData)
  }

  const increaseSelectedLaunch = () => {
    const nextLaunchIndex = selectedLaunchId + 1;
    if (nextLaunchIndex <= 110){
      setSelectedLaunchId(nextLaunchIndex);
    }
  }

  const decreaseSelectedLaunch = () => {
    const nextLaunchIndex = selectedLaunchId - 1;
    if (nextLaunchIndex >= 1){
      setSelectedLaunchId(nextLaunchIndex);
    }
  }

  return (
    <>
      <Title>SpaceX Launch Details</Title>
      <LaunchSelector 
        launchIncrease={increaseSelectedLaunch}
        launchDecrease={decreaseSelectedLaunch}
      />
      <LaunchDetails 
        launch={launch}
      />
    </>
  )
}

export default LaunchContainer;