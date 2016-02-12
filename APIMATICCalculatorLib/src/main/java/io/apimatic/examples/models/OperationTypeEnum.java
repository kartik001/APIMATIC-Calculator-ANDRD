/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/12/2016
 */
package io.apimatic.examples.models;
public enum OperationTypeEnum {
    SUM, //Represents the sum operator
    SUBTRACT, //Represents the subtract operator
    MULTIPLY, //Represents the multiply operator
    DIVIDE; //Represents the divide operator
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
	@com.fasterxml.jackson.annotation.JsonCreator
	public static OperationTypeEnum fromString(String toConvert) {
        return OperationTypeEnum.valueOf(toConvert);
    }

	/**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
	@com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 