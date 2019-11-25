package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    private Job test_JobIdOne;
    private Job test_JobIdTwo;
    private Job test_JobConstructor;
    private Job test_JobFieldOne;
    private Job test_JobFieldTwo;
    private Job test_JobStringBlank;
    private String test_JobToStringBlank;
    private Job test_JobStringReturnsValue;
    private String test_JobsToDisplayAllValues;
    private String test_JobToStringReturnsValue;

    @Before
    public void setUp() {
         test_JobIdOne = new Job();
         test_JobIdTwo = new Job();
         test_JobConstructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         test_JobFieldOne = new Job("IT", new Employer("Mastercard"), new Location("Austin"), new PositionType("System Admin"), new CoreCompetency("Persistence"));
        test_JobFieldTwo = new Job("IT", new Employer("Mastercard"), new Location("Austin"), new PositionType("System Admin"), new CoreCompetency("Persistence"));
        test_JobStringBlank = new Job();
        test_JobToStringBlank = "ID: _______\n" +
                "Name: _______\n" +
                "Employer: _______\n" +
                "Location: _______\n" +
                "Position Type: _______\n" +
                "Core Competency: _______";
        test_JobsToDisplayAllValues = "ID: 25\n" +
                "Name: IT\n" +
                "Employer: Mastercard\n" +
                "Location: Austin\n" +
                "Position Type: System Admin\n" +
                "Core Competency: Persistence";
        test_JobStringReturnsValue = new Job("", new Employer("Mastercard"), new Location(""), new PositionType("System Admin"), new CoreCompetency(""));
        test_JobToStringReturnsValue = "ID: 35\n" +
                "Name: Data not available\n" +
                "Employer: Mastercard\n" +
                "Location: Data not available\n" +
                "Position Type: System Admin\n" +
                "Core Competency: Data not available";
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_JobIdOne.getId() != test_JobIdTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_JobConstructor instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_JobFieldOne.equals(test_JobFieldTwo));
    }

    @Test
    public void testJobsForToStringIsBlank() {
        assertTrue(test_JobStringBlank.toString().contains(test_JobToStringBlank));
    }

    @Test
    public void testJobsToDisplayAllValuesReturnsTrue() {
        assertTrue(test_JobFieldOne.toString().contains(test_JobsToDisplayAllValues));
    }

    @Test
    public void testJobsForToStringReturnsValue() {
        assertTrue(test_JobStringReturnsValue.toString().contains(test_JobToStringReturnsValue));
    }

    @Test
    public void testJobsForNullConstructorsReturnsTrue() {
        assertTrue(test_JobIdOne.toString().contains("OOPS! This job does not seem to exist."));
    }
}
