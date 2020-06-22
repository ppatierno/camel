
/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.sheets.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component GoogleSheets
 */
public enum GoogleSheetsApiName implements ApiName {

    SPREADSHEETS("spreadsheets"),

    DATA("data");


    private static final GoogleSheetsApiName[] VALUES = values();
    
    private final String name;

    private GoogleSheetsApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static GoogleSheetsApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].name.equals(value)) {
                return VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
