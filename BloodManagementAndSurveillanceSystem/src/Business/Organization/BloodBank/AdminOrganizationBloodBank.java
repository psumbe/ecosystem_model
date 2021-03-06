/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.BloodBank;

import Business.Organization.Hospital.*;
import Business.Organization.*;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prajakta
 */
public class AdminOrganizationBloodBank extends Organization{

    public AdminOrganizationBloodBank() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
