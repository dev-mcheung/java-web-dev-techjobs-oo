package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    private static String emptyString(String aValue) {
        if (aValue.isEmpty()) {
            return "Data not available";
        }
        return aValue;
    }

    // toString Method
    @Override
    public String toString() {
        String blankLine = "_______";

        if (this.name == null) {
            return "ID: _______\n" +
                    "Name: _______\n" +
                    "Employer: _______\n" +
                    "Location: _______\n" +
                    "Position Type: _______\n" +
                    "Core Competency: _______\n" +
                    "OOPS! This job does not seem to exist.";
        } else {
            return "ID: " + id + "\n" +
                    "Name: " + Job.emptyString(this.name) + "\n" +
                    "Employer: " + Job.emptyString(this.employer.toString()) + "\n" +
                    "Location: " + Job.emptyString(this.location.toString()) + "\n" +
                    "Position Type: " + Job.emptyString(this.positionType.toString()) + "\n" +
                    "Core Competency: " + Job.emptyString(this.coreCompetency.toString());
        }
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
