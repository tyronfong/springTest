package pri.tyron.test.mybatis.mapper;


import pri.tyron.test.mybatis.beans.Region;

/**
 * Created by tyron on 7/2/2017.
 */
public interface RegionMapper {
    public Region selectRegion(int regionkey);
}
