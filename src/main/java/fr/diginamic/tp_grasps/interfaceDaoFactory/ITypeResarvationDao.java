package fr.diginamic.tp_grasps.interfaceDaoFactory;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface ITypeResarvationDao {

    static TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9, 0.0)};

    public TypeReservation extraireTypeReservation(String type);
}
