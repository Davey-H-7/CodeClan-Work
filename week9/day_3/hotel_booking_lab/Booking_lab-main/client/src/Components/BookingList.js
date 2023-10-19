import React from 'react'
import Booking from './Booking';

const BookingList = ({bookings, onDeleteBooking}) => {

    const foundBookings = bookings.map((booking, index) => {
        return <Booking key={booking._id} booking={booking} onDeleteBooking={onDeleteBooking}/>
    })

    return ( 
        <>
            <ul>
                {foundBookings}
            </ul>
        </>

     );
}
 
export default BookingList
