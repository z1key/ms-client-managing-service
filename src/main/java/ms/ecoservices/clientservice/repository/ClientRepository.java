package ms.ecoservices.clientservice.repository;

import ms.ecoservices.clientservice.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends CrudRepository<Client, Long> {

}
