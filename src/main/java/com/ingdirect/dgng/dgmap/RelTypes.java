package com.ingdirect.dgng.dgmap;

import org.neo4j.graphdb.RelationshipType;

enum RelTypes implements RelationshipType {
	IMPLEMENTS, 
	EXTENDS, 
	USE, 
	IMPLEMENTED_BY, 
	EXTENDED_BY, 
	USED_BY;
}