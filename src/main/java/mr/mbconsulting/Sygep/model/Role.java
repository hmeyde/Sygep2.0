package mr.mbconsulting.Sygep.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;

public enum  Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }
}
