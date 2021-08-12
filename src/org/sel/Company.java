package org.sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Company {
public static void main(String[] args) throws IOException {
	File f=new File("E://add//sub//mul//inheritance.txt");
File f1=new File("E://add//sub//mul//abstraction.txt");
boolean b = f1.createNewFile();
System.out.println(b);
FileUtils.copyFile(f, f1);
List<String> list = FileUtils.readLines(f1);
for (String string : list) {
	System.out.println(string);
}

}
}
