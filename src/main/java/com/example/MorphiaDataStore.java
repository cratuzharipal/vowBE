package com.example;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.annotations.Entity;

import com.mongodb.MongoClient;
@Entity
public class MorphiaDataStore {

	private static MorphiaDataStore mds=null;
	private static Datastore datastore=null;


	private MorphiaDataStore(){}

	public MorphiaDataStore getInstance()
	{

		if(mds==null)
		{
			synchronized (MorphiaDataStore.class) {
				if(mds==null)
					mds=new MorphiaDataStore();	
			}
		}
		return mds;
	}

	public Datastore getConnection()
	{
		final Morphia morphia = new Morphia();


		// tell morphia where to find your classes
		// can be called multiple times with different packages or classes
		morphia.mapPackage("com.entity");

		// create the Datastore connecting to the database running on the default port on the local host
		datastore = morphia.createDatastore(new MongoClient(), "test");
		//datastore.getDB().dropDatabase();
		return datastore;
	}
}
