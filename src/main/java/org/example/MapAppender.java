package org.example;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Plugin(
		name = "MapAppender",
		category = Core.CATEGORY_NAME,
		elementType = Appender.ELEMENT_TYPE)
public class MapAppender extends AbstractAppender {

	private final ConcurrentMap<String, LogEvent> eventMap = new ConcurrentHashMap<>();

	protected MapAppender(String name, Filter filter) {
		super(name, filter, null);
	}

	@PluginFactory
	public static MapAppender createAppender(
			@PluginAttribute("name") String name,
			@PluginElement("Filter") Filter filter) {
		return new MapAppender(name, filter);
	}

	@Override
	public void append(LogEvent event) {
		eventMap.put(Instant.now().toString(), event);
	}

}
