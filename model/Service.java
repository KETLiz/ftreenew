package model;

public class Service {
    FamilyTree familyTree;
    
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
}
