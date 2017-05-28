package com.me.iTextTrial.bean;

import java.util.List;

public class ProfSum {
    private String costCategory;
    private String taskCategory;
    private Double average;
    private List<YearlyCost> yearlyCost;
    
    public ProfSum() {
    }

    public ProfSum(String costCategory, String taskCategory, Double average) {
        this.costCategory = costCategory;
        this.taskCategory = taskCategory;
        this.average = average;
    }
  
    public String getCostCategory() {
		return costCategory;
	}

	public void setCostCategory(String costCategory) {
		this.costCategory = costCategory;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}
	
	public List<YearlyCost> getYearlyCost() {
		return yearlyCost;
	}

	public void setYearlyCost(List<YearlyCost> yearlyCost) {
		this.yearlyCost = yearlyCost;
	}

	public int getColumnCount() {
        return getClass().getDeclaredFields().length;
    }
}
