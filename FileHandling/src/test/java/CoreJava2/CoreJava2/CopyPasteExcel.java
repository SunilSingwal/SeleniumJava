package CoreJava2.CoreJava2;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CopyPasteExcel {

	public static void main(String[] args) throws IOException, BiffException, RowsExceededException, WriteException {

		File f = new File("../FileHandling/Book1.xls");
        Workbook wk = Workbook.getWorkbook(f);
        Sheet ws = wk.getSheet(0);   //first sheet
        int r = ws.getRows();      //no. of rows
        int c = ws.getColumns();  //no. of columns
        
        File f2 = new File("../FileHandling/Book3.xls");
        WritableWorkbook wt = Workbook.createWorkbook(f2);
        WritableSheet ws2 = wt.createSheet("Sheet_1", 0);
        
        for(int i = 0; i<r; i++)
        {
      	  for(int j = 0; j<c; j++)
      	  {
      		  Cell c1 = ws.getCell(j, i);
      		  System.out.println(c1.getContents());
      		  String s=c1.getContents();
      		  
      		  Label l = new Label(j, i, s);
      		  ws2.addCell(l);       //Attached label with sheet
      		  
      	  }
        }
        wt.write();
        wt.close();
  	}

  }
