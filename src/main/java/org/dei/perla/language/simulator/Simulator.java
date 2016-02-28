package org.dei.perla.language.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dei.perla.core.PerLaSystem;
import org.dei.perla.core.Plugin;
import org.dei.perla.core.channel.http.HttpChannelPlugin;
import org.dei.perla.core.channel.simulator.SimulatorChannelPlugin;
import org.dei.perla.core.channel.simulator.SimulatorMapperFactory;
import org.dei.perla.core.message.json.JsonMapperFactory;
import org.dei.perla.core.message.urlencoded.UrlEncodedMapperFactory;

public class Simulator {
	
	 private static final List<Plugin> plugins;
	    static {
	        List<Plugin> ps = new ArrayList<>();
	        ps.add(new JsonMapperFactory());
	        ps.add(new UrlEncodedMapperFactory());
	        ps.add(new SimulatorMapperFactory());
	        ps.add(new HttpChannelPlugin());
	        
	        plugins = Collections.unmodifiableList(ps);
	    }	
	PerLaSystem system= new PerLaSystem(plugins);

}
