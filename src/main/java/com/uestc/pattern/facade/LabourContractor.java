package com.uestc.pattern.facade;

import com.uestc.pattern.facade.subclasses.BrickLayer;
import com.uestc.pattern.facade.subclasses.BrickWorker;
import com.uestc.pattern.facade.subclasses.Mason;

/**
 * @author yzz
 * @create 2022-04-18 16:57
 */
public class LabourContractor {
    private Mason worker1 = new Mason();
    private BrickWorker worker2 = new BrickWorker();
    private BrickLayer worker3 = new BrickLayer();
    public void buildHouse() {
        worker1.mix();
        worker2.carry();
        worker3.neat();
    }
}
