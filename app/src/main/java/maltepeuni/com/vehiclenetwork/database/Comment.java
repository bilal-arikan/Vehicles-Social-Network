package maltepeuni.com.vehiclenetwork.database;

/**
 * Created by LaptopPc on 3.5.2017.
 */

public class Comment  extends DBObject{
    public String id;
    public String idUserFrom;
    public String idUserTo;
    public String idVhclTo;
    public String text;
    public int rate;
}