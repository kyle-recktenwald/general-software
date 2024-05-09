package com.krecktenwald.generalsoftware.pdf_generation;

import com.krecktenwald.generalsoftware.io.IoUtil;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PdfGenerator {
    public static void main(String[] args) throws IOException {
        PdfGenerator pdfGenerator = new PdfGenerator();
        IoUtil ioUtil = new IoUtil();
        String markdownString = ioUtil.stringFromResourceFile("AWS_Training/Developer_Associate_Certification/AWS_Technnical_Essentials/Module_1_Introduction_to_AWS.md");
        String html = pdfGenerator.convertMarkdownStringToHtml(markdownString);
        System.out.println(html);
        pdfGenerator.htmlToPdf(html);
    }

    private String convertMarkdownStringToHtml(String string) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(string);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }

    private void htmlToPdf(String htmlContent) {
        try {
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(htmlContent);
            OutputStream outputStream = new FileOutputStream("/Users/krecktenwald/Desktop/output/output.pdf");
            renderer.layout();
            renderer.createPDF(outputStream);
            outputStream.close();
            System.out.println("PDF generated successfully!");
        } catch (Exception e) {
            System.err.println("Error generating PDF: " + e.getMessage());
        }
    }
}
