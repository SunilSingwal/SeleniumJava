package CoreJava2.CoreJava2;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead1 {

	public static void main(String[] args) throws BiffException, IOException {
		
          File f = new File("../FileHandling/Book1.xls");
          Workbook wk = Workbook.getWorkbook(f);
          Sheet ws = wk.getSheet(0);   //first sheet
          int r = ws.getRows();      //no. of rows
          int c = ws.getColumns();  //no. of columns
          
          for(int i = 0; i<r; i++)
          {
        	  for(int j = 0; j<c; j++)
        	  {
        		  Cell c1 = ws.getCell(j, i);
        		  System.out.println(c1.getContents());
        		  
        	  }
          }
          
          

	}

}
