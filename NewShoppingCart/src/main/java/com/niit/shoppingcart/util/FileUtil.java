package com.niit.shoppingcart.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	public static Logger log= LoggerFactory.getLogger(FileUtil.class);
	
	public static void imageUpload(String path, MultipartFile file, String filename)
	{
	log.debug("The FileUtil Method is started");
	
	if(! file.isEmpty())
	{
		//We need to create a directory to save the file
		try {
			byte[]bytes=file.getBytes();
			//Now creating a directory to save the file
			File dir=new File(path);
			if(!dir.exists())
			{
				dir.mkdirs();  //New Directory is created
			}
			//Now creating a file in server
			File serverFile=new File(dir.getAbsolutePath()+File.separator+filename);
			
			BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();
			
			log.info("The location of server file is" +serverFile.getAbsolutePath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	log.debug("The FileUtil method has been executed");
	
	}
}
