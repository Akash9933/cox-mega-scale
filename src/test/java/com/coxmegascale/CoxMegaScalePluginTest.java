package com.coxmegascale;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CoxMegaScalePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CoxMegaScalePlugin.class);
		RuneLite.main(args);
	}
}