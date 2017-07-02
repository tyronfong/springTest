package pri.tyron.test.mybatis.beans;

/**
 * Created by tyron on 7/2/2017.
 */
public class Region {
    private Integer r_regionkey;
    private String r_name;
    private String r_comment;

    public Integer getR_regionkey() {
        return r_regionkey;
    }

    public void setR_regionkey(Integer r_regionkey) {
        this.r_regionkey = r_regionkey;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_comment() {
        return r_comment;
    }

    public void setR_comment(String r_comment) {
        this.r_comment = r_comment;
    }
}
