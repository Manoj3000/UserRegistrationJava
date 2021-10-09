package com.bridgelabz.regex;

@FunctionalInterface
public interface IValidator {
	void validator(String data) throws InvalidException;
}
