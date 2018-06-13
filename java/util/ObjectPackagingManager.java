package util;

import java.io.IOException;

public interface ObjectPackagingManager {
	
	int objectSize();
	
	Object bytesToObject(byte[] data, int offs);
	
	void objectToBytes(Object object, byte[] data, int offs);
	
}
