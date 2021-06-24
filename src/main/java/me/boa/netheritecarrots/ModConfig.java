package me.boa.netheritecarrots;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "netheritecarrots")
public class ModConfig extends PartitioningSerializer.GlobalData {
    public Settings SETTINGS = new Settings();

    @Config(name = "general")
    public static class Settings implements ConfigData {
        @Comment("""
                ***********************
                Netherite Carrot Settings
                + Duration is in seconds
                + Set duration to 0 to disable
                + Amplifer is 1 minus the Level
                ***********************""")
        public int fireResistanceDuration = 300;
        public int fireResistanceAmplifer = 0;
        public int resistanceDuration = 292;
        public int resistanceAmplifer = 1;
        public int regenerationDuration = 90;
        public int regenerationAmplifer = 0;
        @Comment("1639 seconds == infinite duration")
        public int absorptionDuration = 1639;
        public int absorptionAmplifer = 1;
    }
}