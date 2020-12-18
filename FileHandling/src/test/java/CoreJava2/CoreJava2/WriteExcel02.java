package CoreJava2.CoreJava2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {

		File f = new File("../FileHandling/WriteSheet2.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Sheet_1", 0);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rowCount");
		int rowCount = scan.nextInt();
		
		System.out.println("Enter the colCount");
		int colCount = scan.nextInt();
		
		
//		System.out.println("Enter the content you want to write");
//		String s = scan.next();
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if((i==rowCount) && (j==colCount))
				{
					System.out.println("Enter the content you want to write");
					String s = scan.next();
					Label l = new Label(colCount, rowCount, s);
					ws.addCell(l);
					
				}
			}
		}
		wk.write();
		wk.close();
		
		
		
	}

}
