package ops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import ops.Loan;
import ops.LoanRepository;

@Controller    // This means that this class is a Controller
public class LoanController {
        @Autowired // This means to get the bean called userRepository
	private LoanRepository loanRepository;

	@RequestMapping("/")
	public String display(Model model)
	{
		model.addAttribute( "loanobj", new Loan());
		return "home";
	}

	@PostMapping("/add") 
	public @ResponseBody String addNewLoan(@ModelAttribute Loan loan){
		loanRepository.save(loan);
                return "Saved";
	}

	@RequestMapping("/delete")
	public @ResponseBody String deleteLoan(){
		Loan l = loanRepository.findOne(new Long(2));
		if (l == null){
			return "Not found";
		}
		loanRepository.delete(l);
		return "deleted";

	}

	@RequestMapping("/all")
	public @ResponseBody Iterable<Loan> getAllLoans(){
        	//This returns a JSON or XML with the users
        	return loanRepository.findAll();
	}
}

