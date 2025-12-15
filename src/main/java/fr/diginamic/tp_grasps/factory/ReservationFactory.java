package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.interfaceDaoFactory.IReservationFactory;

import java.time.LocalDateTime;

public class ReservationFactory implements IReservationFactory
{
    @Override
    public Reservation getInstance(LocalDateTime dateReservation, Client client, int nbPlace)
    {
        Reservation reservation = new Reservation(dateReservation);
        reservation.setClient(client);
        reservation.setNbPlaces(nbPlace);

        return reservation;
    }
}
