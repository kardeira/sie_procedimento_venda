
package pt.sie.procedimento.venda.model;

import java.util.List;

public interface BusinessObjectDAO
    extends org.bonitasoft.engine.bdm.dao.BusinessObjectDAO
{


    public BusinessObject findByPersistenceId(Long persistenceId);

    public List<BusinessObject> findByAttribute(String attribute, int startIndex, int maxResults);

    public List<BusinessObject> find(int startIndex, int maxResults);

    public Long countForFindByAttribute(String attribute);

    public Long countForFind();

    public BusinessObject newInstance();

}
