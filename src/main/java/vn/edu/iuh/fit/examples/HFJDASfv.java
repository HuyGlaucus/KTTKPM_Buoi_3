package vn.edu.iuh.fit.examples;

import java.io.File;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

public class HFJDASfv {

	public static void main(String[] args)throws Exception {
		File file=new File("C:\\Users\\huyoi\\Downloads\\KTTKPM_Buoi_03\\KTTKPM_Buoi_03\\KTTKPM_Buoi_03\\src\\main\\java\\vn\\edu\\iuh\\fit\\examples\\DirExplorer.java");
//		JavaParser parser=new JavaParser();
//		ParseResult<CompilationUnit> cu=parser.parse(file);
		CompilationUnit cu1= StaticJavaParser.parse(file);
		List<MethodDeclaration> methods= cu1.findAll(MethodDeclaration.class);
		for(MethodDeclaration m:methods)
		System.out.println(m);
	}
	
}
