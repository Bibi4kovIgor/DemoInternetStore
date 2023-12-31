//package edu.lemon.DemoInternetStore.model.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.UUID;
//
//@Entity
//@Builder
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "_users")
//public class AbstractUser implements UserDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private UUID id;
//
//    @Column(name = "user_name")
//    private String userName;
//
//    @Column(name = "user_pass")
//    private String userPass;
//
//    @Column(name = "user_role")
//    private String userRole;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities = new LinkedList<>();
//        authorities.add(new SimpleGrantedAuthority(userRole));
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return userPass;
//    }
//
//    @Override
//    public String getUsername() {
//        return userName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
