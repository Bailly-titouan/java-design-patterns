package fr.diginamic.tp_grasps.interfaceDaoFactory;

import fr.diginamic.tp_grasps.beans.Client;

public interface IClientDao
{
    static Client[] clients = {new Client("1", true), new Client("2", true), new Client("3", false)};

    public abstract Client extraireClient(String id);
}
