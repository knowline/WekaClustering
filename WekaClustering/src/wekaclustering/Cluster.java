/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekaclustering;

import java.util.ArrayList;
import weka.core.Instance;
import weka.core.Instances;


public class Cluster {
    private ArrayList<Cluster> members;
    private Instance instance;
    private ArrayList<Instance> instances;
    private int numMembers;
    private double distance;
    private int level;
    
    public Cluster(Instance i) {
        instance = i;
        level = -1;
        numMembers = 1;
        distance = Double.MAX_VALUE;
        members = new ArrayList<>();
        instances = new ArrayList<>();
        instances.add(i);
    }
    
    public Instance getInstance() {
        return instance;
    }
    
    public ArrayList<Instance> getInstances() {
        return instances;
    }
    
    public ArrayList<Cluster> getMembers() {
        return members;
    }
    
    public int getNumMembers() {
        return numMembers;
    }
    
    public void addMember(Cluster c) {
        members.add(c);
        numMembers += c.numMembers;
        instances.addAll(c.getInstances());
    }
    
    public void setLevel(int _level) {
        level = _level;
    }
    
    public void setDistance(double _dist) {
        distance = _dist;
    }
}
