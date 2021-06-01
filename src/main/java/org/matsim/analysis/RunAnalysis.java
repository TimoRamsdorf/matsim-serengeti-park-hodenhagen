package org.matsim.analysis;

import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.events.EventsUtils;

public class RunAnalysis {

	public static void mainSimpleExample(String[] args) {
		EventsManager manager = EventsUtils.createEventsManager();
		SimpleEventsHandler handler = new SimpleEventsHandler();
		manager.addHandler(handler);
		EventsUtils.readEvents(manager, "/home/timo/matsim-serengeti-park-hodenhagen/scenarios/serengeti-park-v1.0/output/output-serengeti-park-v1.0-run1/serengeti-park-v1.0-run1.output_events.xml");
	}

	public static void main(String[] args) { // Analize link
		EventsManager manager = EventsUtils.createEventsManager();
		LinkHandler handler = new LinkHandler();
		manager.addHandler(handler);
		EventsUtils.readEvents(manager, "/home/timo/matsim-serengeti-park-hodenhagen/scenarios/serengeti-park-v1.0/output/output-serengeti-park-v1.0-run1/serengeti-park-v1.0-run1.output_events.xml");
		handler.output();
	}
}
