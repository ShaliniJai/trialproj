package com.me.iTextTrial.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.me.iTextTrial.bean.ProfSum;
import com.me.iTextTrial.bean.YearlyCost;
import com.me.iTextTrial.util.ExtendedColor;

public class PdfView extends AbstractPdfView {
	
    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	int contractLength = 5;
        response.setHeader("Content-Disposition", "attachment; filename=\"ProfSum-Report.pdf\"");

        List<ProfSum> profSumList = (List<ProfSum>) model.get("profSum");
        
        Font docfont = FontFactory.getFont(FontFactory.TIMES);
        docfont.setColor(BaseColor.BLACK);
        docfont.setStyle(0);
        document.add(new Paragraph("ProfSum Report", docfont));

       // PdfPTable table = new PdfPTable(users.stream().findAny().get().getColumnCount()+contractLength-1);
        PdfPTable table = new PdfPTable(8);
        table.setWidths(new float[] { 2, 2, 1, 1, 1, 1, 1, 1 });
        table.setWidthPercentage(100.0f);
        table.setSpacingBefore(10);

        // define font for table header row
        Font font = FontFactory.getFont(FontFactory.TIMES);
        font.setColor(BaseColor.BLACK);

        // define table header cell
        PdfPCell headerCell = new PdfPCell();
        headerCell.setBackgroundColor(BaseColor.WHITE);
        headerCell.setPadding(5);

        // write table header
       /* headerCell.setPhrase(new Phrase("Task Category", font));        
        table.addCell(headerCell);*/

        headerCell.setPhrase(new Phrase("Cost Category", font));
        headerCell.setColspan(2);
        table.addCell(headerCell);

        headerCell = new PdfPCell();	
        headerCell.setPhrase(new Phrase("Average", font));
        table.addCell(headerCell);

        for(int i=1; i<=contractLength;i++)
        {
        	headerCell.setPhrase(new Phrase("Year "+i, font));
	        table.addCell(headerCell);
        }

        int count=0;
        for(ProfSum profSum : profSumList){
        	
        	PdfPCell cell = new PdfPCell();
        	cell.setPadding(5);
        	
        	if(count == 0 || count == 5 || count == 12 || count == 15 || count == 19 || count == 20)
        	{
	        	cell.setPhrase(new Phrase(profSum.getTaskCategory(), font));
	        	cell.setRowspan(5);
		        table.addCell(cell);
        	}
	        cell = new PdfPCell();
        	
        	if((count+1) % 2 == 0)
        		cell.setBackgroundColor(BaseColor.WHITE);
        	else        		
        		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);        	
        	
	    	cell.setPhrase(new Phrase(profSum.getCostCategory(), font));
	        table.addCell(cell);
	        
	    	cell.setPhrase(new Phrase(profSum.getAverage().toString(), font));
	        table.addCell(cell);
	        
	        for(YearlyCost yearlyCost : profSum.getYearlyCost())
	        {
	        	cell.setPhrase(new Phrase(yearlyCost.getCost().toString(), font));
		        table.addCell(cell);
	        }
	        
	        if(count == 4 || count == 11 || count == 16 || count == 20 || count == 23)
	        {
	        	cell = new PdfPCell();
	        	cell.setBackgroundColor(ExtendedColor.LIGHT_BLUE);
	        	cell.setMinimumHeight(20);
	        	cell.setColspan(8);
	        	table.addCell(cell);
	        }
	        
	        count++;
        }

        document.add(table);
    }
}
