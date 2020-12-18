package CoreJava2.CoreJava2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead4 {
	
	//Read range of rows from ReadSheet2

	public static void main(String[] args) throws BiffException, IOException {

		File f= new File("../FileHandling/ReadSheet2.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial row no.");
		int startrow = scan.nextInt();
		
		System.out.println("Enter the end row no.");
		int endrow = scan.nextInt();
		
		
		int r = ws.getRows();
		int c = ws.getColumns();
		
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		if((i>=startrow) && (i<=endrow))
        		{
        			Cell c1 = ws.getCell(j, i);
        			System.out.println(c1.getContents());
        			System.out.println("done");
        			
        		}
        		scan.close();
        	}
        }

	}

}
