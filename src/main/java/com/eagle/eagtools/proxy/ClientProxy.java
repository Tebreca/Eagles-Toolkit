package com.eagle.eagtools.proxy;

import com.eagle.eagtools.init.Eagblocks;
import com.eagle.eagtools.init.Eagitems;

public class ClientProxy extends ServerProxy {
	@Override
	public  void registerRenders(){
		Eagitems.registerRenders();
		
	}
}
