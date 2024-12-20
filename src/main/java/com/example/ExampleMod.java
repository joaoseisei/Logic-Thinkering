package com.example;

import com.example.block.ToggleMiningCommand;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "logicthinkering";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String nomeMod = "logicthinkering";

	@Override
	public void onInitialize() {
		Itens.Inicializa();
		Blocos.Inicializa();
		ToggleMiningCommand.register();
		LOGGER.info("OK");
	}
}