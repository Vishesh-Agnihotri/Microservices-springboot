package com.example.demo.model;

public class IPLPlayer {
    private String name;
    private String team;
    private String role; // e.g., Batsman, Bowler, All-Rounder, Wicket-Keeper
    private int age;
    private int matchesPlayed;
    private int runsScored;
    private int wicketsTaken;
    private double strikeRate;
    private double economyRate;

    // Constructor
    public IPLPlayer(String name, String team, String role, int age, int matchesPlayed,
                     int runsScored, int wicketsTaken, double strikeRate, double economyRate) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.strikeRate = strikeRate;
        this.economyRate = economyRate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getMatchesPlayed() { return matchesPlayed; }
    public void setMatchesPlayed(int matchesPlayed) { this.matchesPlayed = matchesPlayed; }

    public int getRunsScored() { return runsScored; }
    public void setRunsScored(int runsScored) { this.runsScored = runsScored; }

    public int getWicketsTaken() { return wicketsTaken; }
    public void setWicketsTaken(int wicketsTaken) { this.wicketsTaken = wicketsTaken; }

    public double getStrikeRate() { return strikeRate; }
    public void setStrikeRate(double strikeRate) { this.strikeRate = strikeRate; }

    public double getEconomyRate() { return economyRate; }
    public void setEconomyRate(double economyRate) { this.economyRate = economyRate; }

    @Override
    public String toString() {
        return "IPLPlayer{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", runsScored=" + runsScored +
                ", wicketsTaken=" + wicketsTaken +
                ", strikeRate=" + strikeRate +
                ", economyRate=" + economyRate +
                '}';
    }
}

