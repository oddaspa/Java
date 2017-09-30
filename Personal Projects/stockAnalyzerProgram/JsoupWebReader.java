package stockAnalyzerProgram;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;




public class JsoupWebReader {
	public void parseData(){
        String url = "http://stackoverflow.com/help/on-topic";
        try {
            Document doc = Jsoup.connect(url).get();
            Element essay = doc.select("div.col-section").first();
            String essayText = essay.text();
            jTextAreaAdem.setText(essayText);


        } catch (IOException ex) {
            Logger.getLogger(formAdem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public static void main(String[] args) {
	public String getPlainText(Element element){
		
	}
}
}