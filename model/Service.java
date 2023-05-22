package model;

public class Service {
    FamilyTree familyTree;
    //Write write;

    public Service() {
        familyTree = new FamilyTree();
    }
    
    public void add(String name, int birthYear, Human mother, Human father) {
        familyTree.add(new Human(name, birthYear, mother, father));
    }
    
    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        for(Human human : familyTree) {
            sb.append(human);
        }
        return sb.toString();
    }
    
    public Human getHumanByName(String name) {
        return familyTree.getHumanByName(name);
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByAge() {
        familyTree.sortByAge();
    }

    public void writeMember() {
        Write write = new Write();
        write.save(familyTree);
    }

    public void readMember() throws ClassNotFoundException {
        Read read = new Read();
        FamilyTree f = read.load();
        f.showInfo();
    }
}
