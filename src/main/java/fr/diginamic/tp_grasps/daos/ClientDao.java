package fr.diginamic.tp_grasps.daos;

import java.util.List;
import java.util.Optional;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.interfaceDaoFactory.IClientDao;

public class ClientDao implements IClientDao {

	@Override
	public Client extraireClient(String id) {
		
		Optional<Client> opt = List.of(clients).stream().filter(c->c.getIdentifiantClient().equals(id)).findAny();
        return opt.orElse(null);
    }

}
