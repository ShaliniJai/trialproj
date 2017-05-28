package com.me.iTextTrial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.me.iTextTrial.bean.ProfSum;
import com.me.iTextTrial.bean.YearlyCost;

@Service
public class ProfSumService {

    public List<ProfSum> getProfSumData(){
    	
    	List<ProfSum> profSumList = new ArrayList<ProfSum>(); 
    	
    	for(int i=0; i<5; i++)
    	{
	    	ProfSum profSum = new ProfSum();
	    	YearlyCost yearlyCost = new YearlyCost();  
	    	profSum.setTaskCategory("Planned");
	    	profSum.setCostCategory("Material");
	    	profSum.setAverage(2378.67);
	    	
	    	List<YearlyCost> yearlyCostList = new ArrayList<YearlyCost>();
	    	yearlyCost = new YearlyCost();   
	    	yearlyCost.setYear(1);
	    	yearlyCost.setCost(34423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(2);
	    	yearlyCost.setCost(34423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(3);
	    	yearlyCost.setCost(34423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(4);
	    	yearlyCost.setCost(34423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(5);
	    	yearlyCost.setCost(34423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	profSum.setYearlyCost(yearlyCostList);
	    	profSumList.add(profSum);
	    	
	    	ProfSum profSum1 = new ProfSum();
	    	yearlyCost = new YearlyCost();  
	    	profSum1.setTaskCategory("UnPlanned");
	    	profSum1.setCostCategory("Material");
	    	profSum1.setAverage(2578.67);
	    	
	    	yearlyCostList = new ArrayList<YearlyCost>();
	    	yearlyCost = new YearlyCost();   
	    	yearlyCost.setYear(1);
	    	yearlyCost.setCost(54423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(2);
	    	yearlyCost.setCost(14423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(3);
	    	yearlyCost.setCost(3423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(4);
	    	yearlyCost.setCost(30423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	yearlyCost = new YearlyCost();  
	    	yearlyCost.setYear(5);
	    	yearlyCost.setCost(74423.00);
	    	yearlyCostList.add(yearlyCost);
	    	
	    	profSum1.setYearlyCost(yearlyCostList);
	    	profSumList.add(profSum1);
	    	
    	}
    	return profSumList;
    }
}
