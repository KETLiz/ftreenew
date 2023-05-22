package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read implements Loadable {

    @Override
    public FamilyTree load() throws ClassNotFoundException{
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("model/familyMembers.out"));
            FamilyTree treeRestored = (FamilyTree) objectInputStream.readObject();
            objectInputStream.close();
            return treeRestored;
            } catch (SecurityException | IOException e) {
                e.printStackTrace();
                return null;
        }
    }
    
}
