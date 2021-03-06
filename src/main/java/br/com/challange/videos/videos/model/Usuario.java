package br.com.challange.videos.videos.model;

import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Usuario {
    @Id
    private String username;
    private String password;
    private byte enabled = 1;


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

    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    public Usuario() {
    }

    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
}
