package fr.diginamic.tp_grasps.daos;

import java.util.List;
import java.util.Optional;

import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.interfaceDaoFactory.ITypeResarvationDao;

public class TypeReservationDao implements ITypeResarvationDao {
	
	@Override
	public TypeReservation extraireTypeReservation(String type) {
		
		Optional<TypeReservation> opt = List.of(types).stream().filter(t->t.getType().equals(type)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
}
