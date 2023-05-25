package com.bridglabz.EmployeeWageOOPs;

public class EmployeeWageObjects {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int numOfWorkingMonth;

    public EmployeeWageObjects(String company,int empRatePerHour,int numOfWorkingDays,int numOfWorkingMonth){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.numOfWorkingMonth=numOfWorkingMonth;
    }
    public static void main(String[] args) {
        EmployeeWageObjects walMart=new EmployeeWageObjects("walMart",20,2,10);
        int empHrs=0,totalEmpHours=0,totalWorkingDays=0;
        while(totalEmpHours<=walMart.numOfWorkingMonth && totalWorkingDays<walMart.numOfWorkingDays){
            totalWorkingDays++;
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch(empCheck){
                case IS_PART_TIME:
                    empHrs=4;
                    break;
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:empHrs=0;
            }
            totalEmpHours=totalEmpHours+empHrs;
            System.out.println("Days :"+totalWorkingDays+" Employee Hours :"+empHrs);
        }
        int totalEmployeeWage=totalEmpHours+walMart.empRatePerHour;
        System.out.println("Total Employee Wage :"+walMart.company+"is: "+totalEmployeeWage);
    }
}
