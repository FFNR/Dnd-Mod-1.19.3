package net.ffnr.dndmod;

import net.fabricmc.api.ClientModInitializer;
import net.ffnr.dndmod.event.KeyInputHandler;
import net.ffnr.dndmod.networking.ModMessages;

public class DndModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
    }
}
