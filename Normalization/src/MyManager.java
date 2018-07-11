
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Thai Bao
 */
public class MyManager {
    
    public void loadFile(String input, String output) {
        try {
            FileReader fr = new FileReader(input);
            FileWriter fw = new FileWriter(output);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = "";
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    line = removeSpace(line);
                    line = normalSign(line);
                    line = upperCase(line);
                    line = cleanQuotes(line);
                    line = dotEnd(line);
                    bw.write(line + System.lineSeparator());
                }
            }
            br.close();
            bw.close();
            fr.close();
            fw.close();
        } catch (FileNotFoundException f) {
            System.out.println("File Input not found");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }  
    }
    
    public String removeSpace(String line) {
        line = line.replaceAll("\\s+", " ");
        return line;
    }
    
    public String normalSign(String text) {
        text = text.replaceAll("[.][ ]", ". ");
        text = text.replaceAll("[,][ ]", ", ");
        text = text.replaceAll("[:][ ]", ": ");
        text = text.replaceAll("[ ][.]", ".");
        text = text.replaceAll("[ ][,]", ",");
        text = text.replaceAll("[ ][:]", ":");
        return  text;
    }
    
    public String upperCase(String line) {
        line = line.toLowerCase();
        StringBuffer tb = new StringBuffer(line);   
        boolean isFirst = true;
        for (int i = 0; i < tb.length(); i++) {
            if (Character.isAlphabetic(tb.charAt(i)) && isFirst) {
                tb.setCharAt(i, Character.toUpperCase(tb.charAt(i)));
                isFirst = false;
            }
            if (tb.charAt(i) == '.') {
                isFirst = true;
            }
        }
        return tb.toString();
    }
    
    public String cleanQuotes(String text) {
        StringBuffer sb = new StringBuffer(text);
        StringBuffer sp = new StringBuffer(" ");
        boolean isQuotes = false;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '"' && !isQuotes) {
                isQuotes = true;
                if (sb.charAt(i - 1) != ' ') {
                    sb.insert(i, " ");
                    i++;
                }
                if (sb.charAt(i + 1) == ' ') {
                    sb.deleteCharAt(i + 1);
                }
                
            } else if (sb.charAt(i) == '"' && isQuotes) {
                isQuotes = false;
                
                if (sb.charAt(i - 1) == ' ') {
                    sb.deleteCharAt(i - 1);
                }
                if (sb.charAt(i + 1) != ' ') {
                    sb.insert(i, " ");
                    i++;
                }
            }
        }

        return sb.toString();
    }
    
    public String dotEnd(String line) {
        if (!line.endsWith(".")) {
            line = line + ".";
        }
        return line;
    }
}
