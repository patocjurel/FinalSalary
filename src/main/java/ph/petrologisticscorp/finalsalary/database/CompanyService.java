package ph.petrologisticscorp.finalsalary.database;

import ph.petrologisticscorp.finalsalary.database.dao.IGenericDAO;
import ph.petrologisticscorp.finalsalary.model.Company;

import javax.inject.Inject;
import java.util.List;

public class CompanyService {

    private final IGenericDAO<Company, Integer> companyDAO;

    @Inject
    public CompanyService(IGenericDAO<Company, Integer> companyDAO) {
        this.companyDAO = companyDAO;
    }

    public List<Company> getAll() {
        return companyDAO.getAll();
    }

    public Company getById(Integer id) {
        return companyDAO.find(id);
    }

    public Company save(Company company) {
        return companyDAO.saveOrUpdate(company);
    }
}
