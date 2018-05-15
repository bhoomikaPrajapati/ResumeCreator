package com.resumecreator.formates;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.resumecreator.customeview.CustomDashedLineSeparator;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleResumeFormat1 {


    public Boolean write(String fname, String fcontent) {
        try {
            String fpath = "/sdcard/" + fname + ".pdf";
            File file = new File(fpath);

            if (!file.exists()) {
                file.createNewFile();
            }

            Font bfBold12 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
            Font bf12 = new Font(Font.FontFamily.TIMES_ROMAN, 12);

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file.getAbsoluteFile()));
            document.open();

            createResumeLayout(document);

            document.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;

        }
    }

    private void createResumeLayout(Document document) throws DocumentException {

        Font headerText = new Font(Font.FontFamily.TIMES_ROMAN, 20);
        Paragraph p = new Paragraph("NAME: ", headerText);
        document.add(p);


        CustomDashedLineSeparator separator = new CustomDashedLineSeparator();
        separator.setDash(10);
        separator.setGap(7);

        separator.setLineWidth(3);
        Chunk linebreak = new Chunk(separator);
        document.add(linebreak);




        /*Table format*/
        for (int i = 0; i < 5; i++) {

            PdfPTable table = new PdfPTable(3);
            table.setWidthPercentage(100);
            table.addCell(getCell("Text to the left", PdfPCell.ALIGN_LEFT));
            table.addCell(getCell("Text in the middle", PdfPCell.ALIGN_CENTER));
            table.addCell(getCell("Text to the right", PdfPCell.ALIGN_RIGHT));
            document.add(table);
        }
    }

    public PdfPCell getCell(String text, int alignment) {

        Font bfBold12 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, new BaseColor(153, 204, 255));
        PdfPCell cell = new PdfPCell(new Phrase(text, bfBold12));
        cell.setPadding(0);
        cell.setHorizontalAlignment(alignment);
        cell.setBorder(PdfPCell.NO_BORDER);

        return cell;
    }
}
