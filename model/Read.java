package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Read implements Loadable, Serializable {

    @Override
    public void load() throws ClassNotFoundException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("model/familyMembers.out"));
            FamilyTree treeRestored = (FamilyTree) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(treeRestored);
        } catch (SecurityException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
