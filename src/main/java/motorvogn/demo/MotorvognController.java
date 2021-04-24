package motorvogn.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    private final List<Motorvogn> alleMotorvogner = new ArrayList<>();
    private final List<Bil> bilRegister = new ArrayList<>();

    public MotorvognController(){
        Bil bil1 = new Bil("Volvo", "V30");
        bilRegister.add(bil1);
        Bil bil2 = new Bil("Volvo", "V70");
        bilRegister.add(bil2);
        Bil bil3 = new Bil("Volvo", "V91");
        bilRegister.add(bil3);
        Bil bil4 = new Bil("Audi", "Q7");
        bilRegister.add(bil4);
        Bil bil5 = new Bil("Audi", "A8");
        bilRegister.add(bil5);
        Bil bil6 = new Bil("Nissan", "Leaf");
        bilRegister.add(bil6);
        Bil bil7 = new Bil("Nissan", "Ariya");
        bilRegister.add(bil7);

    }

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(){
        return bilRegister;
    }

    @PostMapping("/lagre")
    public void lagre(Motorvogn motorvogn){
        alleMotorvogner.add(motorvogn);
    }
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return alleMotorvogner;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleMotorvogner.clear();
    }
}
