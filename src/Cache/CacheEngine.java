/**
 * 
 */
package Cache;

import Cache.Drive.AbstractDrive;
import Cache.Drive.Implements.FileDrive;
import Cache.Drive.Implements.RedisDrive;

/**
 * @author adm
 *
 */
public class CacheEngine {
	protected AbstractDrive drive;
	
	public void loadDrive(AbstractDrive drive) {
		this.drive = drive;
	}
	
	public void put(String key, String value) {
		this.drive.put(key, value);
	}
	
	public void get(String key) {
		this.drive.get(key);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		FileDrive fileDrive = new FileDrive();
		RedisDrive redisDrive = new RedisDrive();
		CacheEngine cache = new CacheEngine();
		cache.loadDrive(redisDrive);
		cache.put("name", "megaads");
		cache.get("name");
	}

}
