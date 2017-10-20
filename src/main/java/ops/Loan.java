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
	private Integer lid;
	private String lname;
	private String lvendor;
	private Integer lprice;

	public Integer getId(){
	return lid;}

	public void setId(Integer id){
	this.lid = id;}

	public String getName(){
	return lname;}

	public void setName(String name){
	this.lname = name;}

	public String getVendor(){
	return lvendor;}

	public void setVendor(String vendor){
	this.lvendor = vendor;}

	public Integer getPrice(){
	return lprice;}

	public void setPrice(Integer price){
	this.lprice = price;}

}
