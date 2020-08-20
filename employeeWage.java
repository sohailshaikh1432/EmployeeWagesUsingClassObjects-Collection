public class ComputeEmpWage
{
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorking;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public ComputeEmpWage(String company, int empRatePerHour,int numberOfWoringDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHourPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
	}
}

public class empWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfComapny = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	private empWageComputation() {
		companyEmpArray = new CompanyEmpwage[5];
	}

	private void addComapanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth ) {

		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	private void computeEmpWage()
	{
		for( int i=0; i<numOfCompany; i++ )
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
      		//Computation
      System.out.println("Welcome to Employee Wage Computation");
      while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         switch(empCheck) {
            case IS_PART_TIME:
               empHrs = 8;
               break;
            case IS_FULL_TIME:
               empHrs = 12;
               break;
            default:
               empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#: " + totalWorkingDays + "Employee Hours: " + empHrs);
      }
      return totalEmpHrs * companyEmpWage.empRatePerHours;
   }

	public static void main(String[] args) {
		empWageComputation empWagejava = new empWageComputation();
		empWagejava.addCompanyEmpWage("DMart: ", 20, 20, 100);
		empWagejava.addCompanyEmpWage("Reliance: ", 10, 4, 50);
		empWagejava.computeEmpWage();
	}
}
