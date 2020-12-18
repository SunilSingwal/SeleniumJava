package CoreJava2.CoreJava2;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel01 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {

      File f = new File("../FileHandling/Book2.xls");
      WritableWorkbook wk = Workbook.createWorkbook(f);
      WritableSheet ws = wk.createSheet("Sheet_1", 0);
      
      for(int i=0; i<2; i++)
      {
    	  for(int j=0; j<3; j++)
    	  {
    		  Label l = new Label(j, i, "Automation");
    		  ws.addCell(l);       //Attached label with sheet
    		  
    	  }
      }
      wk.write();
      wk.close();
	}

}
