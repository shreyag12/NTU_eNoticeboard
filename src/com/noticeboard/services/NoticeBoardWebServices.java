package com.noticeboard.services;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("noticeservices")
public class NoticeBoardWebServices extends ResourceConfig {
	public NoticeBoardWebServices() {
		packages("com.fasterxml.jackson.jaxrs.json");
		packages("com.noticeboard.services");
	}
}