package ops;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells hibernate to make a table using this class
@Table(name="loans")
public class Loan{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lid;
	private String lname;
	private String lvendor;
	private Integer lprice;

	public Long getLid(){
		return lid;
	}

	public void setLid(Long id){
		this.lid = id;
	}

	public String getLname(){
	return lname;}

	public void setLname(String name){
	this.lname = name;}

	public String getLvendor(){
	return lvendor;}

	public void setLvendor(String vendor){
	this.lvendor = vendor;}

	public Integer getLprice(){
	return lprice;}

	public void setLprice(Integer price){
	this.lprice = price;}

}
