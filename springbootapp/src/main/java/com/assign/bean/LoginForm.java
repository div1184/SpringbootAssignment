package com.assign.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
/**
 *  This class to generate login entry details assigned with value object
 * @author admin
 *
 */
public class LoginForm {
    @NotBlank
    @Size(min=3, max = 60)
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    @Size(min=3, max = 60)
    private String imageId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
    
    
}