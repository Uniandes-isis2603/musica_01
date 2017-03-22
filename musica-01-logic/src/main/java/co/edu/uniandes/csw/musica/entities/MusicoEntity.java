package co.edu.uniandes.csw.musica.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MusicoEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String trayectoria;
    private int requerimientoSonido;
    private int requerimientoCapacidad;
    
    @ManyToOne
    private GeneroEntity generoMusico;
    
    @ManyToMany(mappedBy = "musicos", cascade = CascadeType.ALL)
    private List<FuncionEntity> funcionesMusico;

    public MusicoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }

    public int getRequerimientoSonido() {
        return requerimientoSonido;
    }

    public void setRequerimientoSonido(int requerimientoSonido) {
        this.requerimientoSonido = requerimientoSonido;
    }

    public int getRequerimientoCapacidad() {
        return requerimientoCapacidad;
    }

    public void setRequerimientoCapacidad(int requerimientoCapacidad) {
        this.requerimientoCapacidad = requerimientoCapacidad;
    }

    public GeneroEntity getGenero() {
        return generoMusico;
    }

    public void setGenero(GeneroEntity genero) {
        this.generoMusico = genero;
    }

    public GeneroEntity getGeneroMusico() {
        return generoMusico;
    }

    public void setGeneroMusico(GeneroEntity generoMusico) {
        this.generoMusico = generoMusico;
    }

    public List<FuncionEntity> getFuncionesMusico() {
        return funcionesMusico;
    }

    public void setFuncionesMusico(List<FuncionEntity> funcionesMusico) {
        this.funcionesMusico = funcionesMusico;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MusicoEntity other = (MusicoEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    
    
}
