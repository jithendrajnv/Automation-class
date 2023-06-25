package testngbasics;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Demo1 {

	public static void main(String[] args) {

		String s="MANISH KUMAR TIWARI";
		
		String[] b=s.split(" ");
		
		for (int i=0;i<b.length;i++)
		{
			 char c=b[i].charAt(0);
			 
			 System.out.print(c);
			
		}
	}

}
