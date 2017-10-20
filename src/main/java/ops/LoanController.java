package ops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ops.Loan;
import ops.LoanRepository;

@Controller    // This means that this class is a Controller
public class LoanController {
        @Autowired // This means to get the bean called userRepository
	private LoanRepository loanRepository;

	@RequestMapping("/")
	public String display()
	{
		return "home";
	}

	@RequestMapping("/add") //Map only get requests
	public @ResponseBody String addNewLoan(){
                Loan l = new Loan();
                l.setName("Ayushi");
                l.setVendor("Bajaj");
                l.setPrice(100);
		loanRepository.save(l);
                return "Saved";
	}

	@RequestMapping("/all")
	public @ResponseBody Iterable<Loan> getAllLoans(){
        	//This returns a JSON or XML with the users
        	return loanRepository.findAll();
	}
}

