package student_database;

public class Student {
 
	private String name,USN,sec,email,mob,branch;
    private int sem;
    
    public Student() {}
    
    public Student(String name,String USN,int sem,String branch,String sec,String email,String mob)
    {
    	super();
    	this.name=name;
    	this.USN=USN;
    	this.sem=sem;
    	this.branch=branch;
    	this.sec=sec;
    	this.email=email;
    	this.mob=mob;
    }
    
    public String getName() {             //1
    	return name;
    }
    public void setName(String name) {
        this.name=name;	
    }
    
    public String getUSN() {            //2
    	return USN;
    }
    public void setUSN(String USN) {
    	this.USN=USN;
    }
    
    public int getSem() {              //3
        return sem; 	
    }
    public void setSem(int sem) {
    	this.sem=sem;
    }
    
    public String getBranch() {         //4
    	return branch;
    }
    public void setBranch(String branch) {
    	this.branch=branch;
    }
    
   
    public String getSection() {        //5
    	return sec;
    }
    public void setSection(String sec) {
    	this.sec=sec;
    }
    
    public String getEmail() {        //6
    	return email;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
    
    public String getMobile() {       //7
    	return mob;
    }
    public void setMobile(String mob) {
    	this.mob=mob;
    }
    
    
}
