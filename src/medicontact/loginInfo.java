/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicontact;

/**
 *
 * @author grm-5
 */
public class loginInfo extends medico implements java.io.Serializable{
    private String user;
    private String password;

	  public String getUser() {
		    return user;
	  }

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        
}
