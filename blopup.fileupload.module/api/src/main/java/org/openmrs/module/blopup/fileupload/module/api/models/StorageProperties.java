package org.openmrs.module.blopup.fileupload.module.api.models;

import org.springframework.context.annotation.Configuration;

@Configuration("storage")
public class StorageProperties {
	
	/**
	 * Folder location for storing files
	 */
	private String location = "upload-dir";
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
}
