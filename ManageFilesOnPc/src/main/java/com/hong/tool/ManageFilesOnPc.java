package com.hong.tool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

//import org.apache.commons.lang.StringUtils;
public class ManageFilesOnPc {

	public static void main(String[] args) {
		// TODO check input
		String choice = "1";
		try {
			chooseFunction(choice);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void chooseFunction(String choice) throws IOException {
		if (StringUtils.isEmpty(choice)) {
			choice = "1";
		}
		switch (choice) {
		case "1":
			findSameFiles();
			break;

		default:
			break;
		}

	}

	private static void findSameFiles() throws IOException {
		// TODO check input of direction
		String path = "I:\\testDir";
//		List<String> fileList = new ArrayList<>();
//		fileList = FindSameFiles.findFiles(path);
//		System.out.println("fileList = " + fileList);
		Map<String,Map<String,String>> fileInfoMap = new HashMap<>();
		fileInfoMap = FindSameFiles.findFiles(path);
		System.out.println("fileInfoMap = " + fileInfoMap);
	}

}
