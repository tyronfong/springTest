package pri.tyron.test.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pri.tyron.test.mybatis.beans.Region;

import java.io.Reader;

/**
 * Created by tyron on 7/2/2017.
 */
public class Main {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static{
        try{
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Region region = (Region) session.selectOne("pri.tyron.test.mybatis.mapper.RegionMapper.selectRegion", 1);
            System.out.println(region.getR_comment());
            System.out.println(region.getR_name());
        } finally {
            session.close();
        }
    }
}
