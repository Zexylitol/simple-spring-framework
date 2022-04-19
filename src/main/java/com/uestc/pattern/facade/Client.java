package com.uestc.pattern.facade;

/**
 * @author yzz
 * @create 2022-04-18 16:57
 */
public class Client {
    public static void main(String[] args) {
        LabourContractor labourContractor = new LabourContractor();
        labourContractor.buildHouse();
    }
}
