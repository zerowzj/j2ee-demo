package com.company.project.dao.popedomfunction;

import com.company.project.dao.BaseDaoTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangzhj on 2016/9/27.
 */
public class PopedomFunctionDaoTest extends BaseDaoTest {

    @Autowired
    private PopedomFunctionDao popedomFunctionDao;

    @Test
    public void testNest(){
        popedomFunctionDao.getFunctionLt(1);
    }
}