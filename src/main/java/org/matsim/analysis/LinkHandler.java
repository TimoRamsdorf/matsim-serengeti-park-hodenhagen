package org.matsim.analysis;

import org.matsim.api.core.v01.events.LinkLeaveEvent;
import org.matsim.api.core.v01.events.handler.LinkLeaveEventHandler;

import java.util.LinkedList;
import java.util.List;

public class LinkHandler implements LinkLeaveEventHandler {

	private static final String linkId = "7232382780000f";
	private final List<Double> times = new LinkedList<>();

	@Override
	public void handleEvent(LinkLeaveEvent linkLeaveEvent) {
		if (linkId.equals(linkLeaveEvent.getLinkId().toString())) {
			times.add(linkLeaveEvent.getTime());
		}
	}

	public void output() {
		for (int i = 0; i < 23; i++) {
			int finalI = i;
			long count = times.stream().filter(time -> time >= finalI * 3600 && time < (finalI + 1) * 3600).count();
			System.out.println(i + " - " + (i + 1) + " Uhr: " + count + " Autos");
		}
	}
}
