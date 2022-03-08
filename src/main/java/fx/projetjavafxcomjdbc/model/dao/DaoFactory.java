package fx.projetjavafxcomjdbc.model.dao;


import fx.projetjavafxcomjdbc.db.DB;
import fx.projetjavafxcomjdbc.model.dao.impl.DepartmentDaoJDBC;
import fx.projetjavafxcomjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
