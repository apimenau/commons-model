/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-model
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 

package com.epam.ta.reportportal.ws.model.settings;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Configurable email setting for project object
 * 
 * @author Andrei_Ramanchuk
 */
@JsonInclude(Include.NON_NULL)
public class ServerEmailResource implements Serializable {
	/**
	 * Generated SVUID
	 */
	private static final long serialVersionUID = 2573744596368345366L;

	@NotNull
	private String host;

	private Integer port;

	private String protocol;

	private Boolean authEnabled;

	private Boolean starTlsEnabled;

	private Boolean sslEnabled;

	private String username;

	private String password;

	private String from;

	@JsonIgnore
	private boolean debug;

	public ServerEmailResource() {
	}

	public ServerEmailResource(String host, Integer port, String protocol, Boolean authEnabled, Boolean starTlsEnabled, Boolean sslEnabled,
                               String username, String password, String from, Boolean debug) {
		this.host = host;
		this.port = port;
		this.protocol = protocol;
		this.authEnabled = authEnabled;
		this.starTlsEnabled = starTlsEnabled;
		this.sslEnabled = sslEnabled;
		this.username = username;
		this.password = password;
		this.from = from;
		this.debug = debug;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Boolean getAuthEnabled() {
		return authEnabled;
	}

	public void setAuthEnabled(Boolean authEnabled) {
		this.authEnabled = authEnabled;
	}

	public Boolean getStarTlsEnabled() {
		return starTlsEnabled;
	}

	public void setStarTlsEnabled(Boolean starTlsEnabled) {
		this.starTlsEnabled = starTlsEnabled;
	}

	public Boolean getSslEnabled() {
		return sslEnabled;
	}

	public void setSslEnabled(Boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ServerEmailResource{");
		sb.append("host='").append(host).append('\'');
		sb.append(", port=").append(port);
		sb.append(", protocol='").append(protocol).append('\'');
		sb.append(", authEnabled=").append(authEnabled);
		sb.append(", starTlsEnabled=").append(starTlsEnabled);
		sb.append(", sslEnabled=").append(sslEnabled);
		sb.append(", username='").append(username).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", from='").append(from).append('\'');
		sb.append(", debug=").append(debug);
		sb.append('}');
		return sb.toString();
	}
}
