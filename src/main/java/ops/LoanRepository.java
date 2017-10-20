package ops;
import org.springframework.data.repository.CrudRepository;

//This will be auto implemented by Spring into a bean called LoanRepository
//CRUD stands for Create,read,Update,Delete
public interface LoanRepository extends CrudRepository<Loan, Long>{

}
