
package co.edu.uniandes.csw.musica.ejbs;

import co.edu.uniandes.csw.musica.entities.BoletaEntity;
import co.edu.uniandes.csw.musica.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.musica.persistence.BoletaPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BoletaLogic {
    @Inject
    private BoletaPersistence persistence;
    
    // TODO: implementar validaciones de negocio. p.ej. revisar las relaciones
    public BoletaEntity createBoleta(BoletaEntity boleta)throws BusinessLogicException
    {
        return persistence.create(boleta);
    }
    
    public List<BoletaEntity> getBoletas ()
    {
        return persistence.findAll();
    }
    
    public BoletaEntity getBoleta (Long id)
    {
        return persistence.find(id);
    }
    
    // TODO: revisar validaciones al momento de actualizar
    public BoletaEntity updateBoleta(BoletaEntity entity) 
    {
        return persistence.update(entity);
    }
    
    // TODO: revisar validaciones al momento de eliminar
    public void deleteBoleta (Long id)
    {
        persistence.delete(id);
    }

    
}
