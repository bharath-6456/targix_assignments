
package com.example;

import java.util.*;

public class CollectionDemo {

    private List<String> studentList = new ArrayList<>();
    private Set<String> studentSet = new HashSet<>();
    private Map<Integer, String> studentMap = new HashMap<>();

    public void addToList(String name) { studentList.add(name); }
    public boolean removeFromList(String name) { return studentList.remove(name); }
    public boolean searchInList(String name) { return studentList.contains(name); }
    public List<String> getStudentList() { return studentList; }

    public void addToSet(String name) { studentSet.add(name); }
    public boolean removeFromSet(String name) { return studentSet.remove(name); }
    public boolean searchInSet(String name) { return studentSet.contains(name); }
    public Set<String> getStudentSet() { return studentSet; }

    public void addToMap(int id, String name) { studentMap.put(id, name); }
    public boolean removeFromMap(int id) { return studentMap.remove(id) != null; }
    public String searchInMap(int id) { return studentMap.get(id); }
    public Map<Integer, String> getStudentMap() { return studentMap; }
}
