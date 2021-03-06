package de.ljfa.iceshards.compat;

import cpw.mods.fml.common.event.FMLInterModComms;

public class EnderIOCompat {

    public static void addSAGMillRecipes() {
        FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill",
            "<recipeGroup name=\"GlassShards\">" +
              //SAG Mill: ice -> ice shards
              "<recipe name=\"Ice\" energyCost=\"1000\">" +
                "<input>" +
                  "<itemStack modID=\"minecraft\" itemName=\"ice\" />" +
                "</input>" +
                "<output>" +
                  "<itemStack modID=\"ice_shards\" itemName=\"ice_shards\" />" +
                "</output>" +
              "</recipe>" +
              //SAG Mill: packed ice -> ice shards
              "<recipe name=\"Packed Ice\" energyCost=\"1000\">" +
                "<input>" +
                  "<itemStack modID=\"minecraft\" itemName=\"packed_ice\" />" +
                "</input>" +
                "<output>" +
                  "<itemStack modID=\"ice_shards\" itemName=\"ice_shards\" />" +
                "</output>" +
              "</recipe>" +
              //SAG Mill: ice shards -> snow
              "<recipe name=\"Ice Shards\" energyCost=\"800\">" +
                "<input>" +
                  "<itemStack oreDictionary=\"shardsIce\" />" +
                "</input>" +
                "<output>" +
                  "<itemStack modID=\"minecraft\" itemName=\"snowball\" number=\"2\" />" +
                "</output>" +
              "</recipe>" +
            "</recipeGroup>");
    }
}
