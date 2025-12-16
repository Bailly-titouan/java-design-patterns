package fr.diginamic.singleton;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LoadConfigurationSingleton
{
    private final ResourceBundle configuration;

    private LoadConfigurationSingleton()
    {
        configuration = ResourceBundle.getBundle("configuration");
    }

    private static LoadConfigurationSingleton INSTANCE = new LoadConfigurationSingleton();

    public static LoadConfigurationSingleton getInstance()
    {
        return INSTANCE;
    }

    public String getValeurFromConfig(String variableName) throws MissingResourceException
    {
        return configuration.getString(variableName);
    }
}
