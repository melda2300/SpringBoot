package springBoot.MyProje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
localHost:8080/Reader/Read
 */
@RestController
@RequestMapping(path = "/Reader")
public class MyController {

    @Autowired
    @Qualifier("excelFileReader")
    private Reader reader;


    @GetMapping(path = "/Read")
    public String read() {
        return this.reader.readFile();
    }

}
