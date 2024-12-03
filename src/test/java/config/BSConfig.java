package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface BSConfig  extends Config {
    @Key("accessKey")
    String getAccessKey();

    @Key("userName")
    String getUserName();

    @Key("url")
    String getUrl();

    @Key("device")
    @DefaultValue("Google Pixel 7 Pro")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("13.0")
    String getOSVersion();

    @Key("app")
    @Config.DefaultValue("bs://sample.app")
    String getApp();
}
