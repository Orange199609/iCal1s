package iCalculator;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class TxtFileFilter extends FileFilter{
	public String getDescription() {    
        return "*.txt;";    
    }    
    
    public boolean accept(File file) {    
        String name = file.getName();    
        return file.isDirectory() || name.toLowerCase().endsWith(".txt") ;  // 仅显示目录和txt文件  
    }    
}
