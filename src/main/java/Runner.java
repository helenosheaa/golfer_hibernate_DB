import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args){
        Golfer golfer1 = new Golfer("Harry", "Hipster", 30);
        DBGolfer.save(golfer1);

        List<Golfer> golfers = DBGolfer.getAll();

        System.exit(0);
    }
}
