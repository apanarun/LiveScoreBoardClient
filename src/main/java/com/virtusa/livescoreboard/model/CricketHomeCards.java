package com.virtusa.livescoreboard.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CricketHomeCards")
public class CricketHomeCards {
	
	@Id
	String id;
	String seriesname;
	String date;
	String duration;
	String footer;
	String gametype;
	String location;
	String team1;
	String team2;
	Integer score1;
	Integer score2;
	Integer noOfOvers;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeriesname() {
		return seriesname;
	}
	public void setSeriesname(String seriesname) {
		this.seriesname = seriesname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public String getGametype() {
		return gametype;
	}
	public void setGametype(String gametype) {
		this.gametype = gametype;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getScore1() {
		return score1;
	}
	public void setScore1(Integer score1) {
		this.score1 = score1;
	}
	public Integer getScore2() {
		return score2;
	}
	public void setScore2(Integer score2) {
		this.score2 = score2;
	}
	public Integer getNoOfOvers() {
		return noOfOvers;
	}
	public void setNoOfOvers(Integer noOfOvers) {
		this.noOfOvers = noOfOvers;
	}
	
	
}
