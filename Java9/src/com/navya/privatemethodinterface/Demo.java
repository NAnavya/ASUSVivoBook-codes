package com.navya.privatemethodinterface;

public interface Demo {
	default void cal() {
		sayprivate();
	}
	private void sayprivate() {
		System.out.println("hii");
	}

}
