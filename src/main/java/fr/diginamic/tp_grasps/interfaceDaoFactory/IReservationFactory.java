package fr.diginamic.tp_grasps.interfaceDaoFactory;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

import java.time.LocalDateTime;

public interface IReservationFactory {

    public Reservation getInstance(LocalDateTime localDateTime, Client client, int nbPlace);
}
