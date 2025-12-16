package fr.diginamic.tp_singleton;

import fr.diginamic.singleton.LoadConfigurationSingleton;
import org.junit.Test;

import java.util.MissingResourceException;

import static org.junit.Assert.*;

public class SingletonTest
{
    @Test
    public void testGetDbUrlFromConfigurationSingleton()
    {
        LoadConfigurationSingleton configurationInstance = LoadConfigurationSingleton.getInstance();

        String valeur = configurationInstance.getValeurFromConfig("db.url");
        assertEquals(valeur, "jdbc:mysql://localhost:3306/mabase");
    }

    @Test
    public void testGetDbUserFromConfigurationSingleton()
    {
        LoadConfigurationSingleton configurationInstance = LoadConfigurationSingleton.getInstance();

        String valeur = configurationInstance.getValeurFromConfig("db.user");
        assertEquals(valeur, "root");
    }

    @Test
    public void testGetDbPasswordFromConfigurationSingleton()
    {
        LoadConfigurationSingleton configurationInstance = LoadConfigurationSingleton.getInstance();

        String valeur = configurationInstance.getValeurFromConfig("db.password");
        assertEquals(valeur, "1234");
    }

    @Test
    public void testInexistantValueFromConfigurationSingleton()
    {
        LoadConfigurationSingleton configurationInstance = LoadConfigurationSingleton.getInstance();

        assertThrows(MissingResourceException.class, () -> configurationInstance.getValeurFromConfig("don't exist"));
    }
}
