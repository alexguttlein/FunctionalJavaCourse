package org.formacion;

import java.util.Collection;
import java.util.List;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();

	default void addAll(Collection collection){
		for(Object o: collection){
			add(o);
		}
	}

	
}
