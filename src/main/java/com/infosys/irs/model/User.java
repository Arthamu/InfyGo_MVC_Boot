package com.infosys.irs.model;

import javax.validation.constraints.Pattern;

public class User {
	
	@Pattern(regexp="^[a-zA-Z0-9]{4,15}+$", message="UserId contain a-z 0-9 and 4 to 15 charaters")
    private String userId;
	@Pattern(regexp="^[a-zA-Z0-9]{8,15}+$", message="Password must contain [a-zA-Z0-9] and must be of 8 to 15 characters")
    private String password;
	@Pattern(regexp="^[a-zA-Z0-9]{4,15}+$",message="Invalid")
    private String name;
	@Pattern(regexp="^[a-zA-Z0-9]{4,15}+$",message="Invalid")
    private String city;
	@Pattern(regexp="^[A-Za-z0-9+_.-]+@(.+)$",message="Invalid")
    private String email;
	@Pattern(regexp="[0-9] {10}")
    private String phone;
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{userId:" + userId + ", password:" + password + ", name:" + name + ", city:" + city + ", email:" + email
				+ ", phone:" + phone + "]";
	}


    
}