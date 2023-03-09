/**
 * 
 */
package Cache.Drive.Implements;

import Cache.Drive.AbstractDrive;

/**
 * @author adm
 *
 */
public class FileDrive extends AbstractDrive{

	@Override
	public void put(String key, String value) {
		System.out.println("Added item with key is " + key + " and value is " + value + " to File");
	}

	@Override
	public void get(String key) {
		System.out.println("Get data with key is " + key + " from File");
	}

}
