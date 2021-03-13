package serviceimpl;

import dao.ItemsDao;
import service.ItemServices;
import com.sun.tools.javac.jvm.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceimpl implements ItemServices {

    @Autowired
    private ItemsDao itemsDao;
    public Items FindById(Integer id) {
        return null;
    }
}
