package com.sys.bio.back.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sys.bio.back.models.user.Authority;
import com.sys.bio.back.models.user.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private boolean enabled = true;
    private String image;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    @JsonIgnore
    private Set<UserRole> userRoles = new HashSet<>();
    private String photo;



    @Override
    public Collection<? extends Authority> getAuthorities() {
        Set<Authority> authorities = new HashSet<>();
        this.userRoles.forEach(userRole -> {
            authorities.add(new Authority(userRole.getRole().getName()));
        });
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
