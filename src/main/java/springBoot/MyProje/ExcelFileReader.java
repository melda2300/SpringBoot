package springBoot.MyProje;

import org.springframework.stereotype.Component;

@Component
public class ExcelFileReader extends Reader {
    @Override
    public String readFile(){
        return "EXCEL FİLE";
    }
}
