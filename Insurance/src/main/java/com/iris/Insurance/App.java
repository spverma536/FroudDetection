package com.iris.Insurance;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.log4j.Logger;

import com.iris.insuranceFraudDetection.InsuranceData;

public class App implements Serializable {

	final static Logger logger = Logger.getLogger(App.class);
	static InsuranceData insuranceData = new InsuranceData();

	// counters
	static int networkHospitalCounter = 0;
	static int count = 0;
	static int ageCounter = 0;
	static int oldAgeCounter = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int consultationChargeCounter = 0;
	static int postHosCounter = 0;
	static int preHosCounter = 0;
	static int rejectionCounter = 0;
	static int claimCounter = 0;
	static int totalClaimPaid = 0;
	static int corporateCounter = 0;
	static int myInt = 0;
	static int ind = 0;
	static int familyCounter = 0;
	static boolean familyFlag = false;
	static int family = 0;
	static int claimCounter1 = 0;
	static int counterfamily = 0;
	static int claimDiagnosisCounter = 0;
	static int medHistoryCounter = 0;
	static int doctorCounter = 0;
	static int genderCount = 0;
	static int diagnosisCounter = 0;
	static int claimDateCounter=0;

	static Random r = new Random();
	static boolean val[] = { true, false };
	static String gender[] = { "F", "M" };
	static String typeOfPolicy[] = { "Government-sponsored", "Short-Term Health Insurance", "Employer-based",
			"Government-sponsored", "Short-Term Health Insurance", "Critical Illness", "Hospitalization",
			"Pre-Existing Disease Cover Plans" };
	static String productType[] = { "Aviva", "HDFCErgo", "Medicare" };
	static String hosCode[] = { "H001", "H002", "H003", "H004", "H005" };
	static String hosName[] = { "JayPee", "Fortis", "Moolchand", "Apollo", "Max" };
	static String hosPAN[] = { "GSDDH674356", "GDHGSD8876533", "MKJKIU77856", "QWSAD79863", "ZCVGFSSD8745" };
	static String hosPin[] = { "221301", "110092", "201301", "812007", "451005" };
	static String hosRegNo[] = { "36536173.1", "55486245.1", "41254935.1", "114589632.1", "336577892.1" };
	static String procedureCode1[] = { "ICPC-2", "ICPM", "ICHI" };
	static String procedureCode2[] = { "ICD-10-PCS", "NIC", "ICD-10-PCS" };
	static String procedureCode3[] = { "OPCS-4", "OPS-301", "NOMESCO" };
	static String diagnosisCode1[] = { "ICD-9-CM", "ICD-10", "Skin Disease" };
	static String diagnosisCode2[] = { "NANDA", "Dental Claims", "Infectious Origin" };
	static String diagnosisCode3[] = { "SNOMED", "Opthamology", "International Classification of Sleep Disorders" };
	static String medicalHistory1[] = { "Allergies", "Diet", "Sleep" };
	static String medicalHistory2[] = { "Substance Abused", "Injuries", "Hospitalisations" };
	static String medicalHistory3[] = { "Substance Abused", "Past Illness", "Alternative therapies" };
	static String procedureDescriptions1[] = { "Blood test", "Stool test", "Course (medicine)" };
	static String procedureDescriptions2[] = { "Endoscopy", "Ultra Sound", "Thyroid test" };
	static String procedureDescriptions3[] = { "Electrolyte", "Haemoglobin", "Stitches" };
	static String claimPayment[] = { "Debit Card", "Cash", "Cheque", "Demand Draft", "Net Banking" };
	static String reasonForRejectionOfClaim[] = { "incorrect information in the application form", "Policy lapse",
			"Concealment of information", "Duplicate billing", "NA", "NA" };
	static String reasonForReductionOfClaim[] = { "Inaccurate or Incomplete Patient Information",
			"Procedures not covered", "Poor Documentation", "Upcoding or Unbundling", "Duplicate or Wrong Billing" };
	static String remarksOfTPA[] = { "Wrong contact address information provided", "Claim made after policy lapse date",
			"Medical history not disclosed", "Same services have been included in claim",
			"Accepted with guarantee of payment letter", "Accepted" };
	static String policyNumber = "";

	static String corporateCode2[] = { "IRISSOFT01", "INDIVIDUAL" };
	static String groupCode2[] = { "0001", "0002" };
	static String basePolicyNo;
	static String corporateCode1 = "";
	static String groupCode1 = "";
	static String familyno1[] = new String[7];

	public static void writeFields(ObjectOutputStream objectOutputStream, InsuranceData insuranceData)
			throws Exception {

		// read the server response message
		objectOutputStream
				.writeObject(insuranceData.isBoo_hospital_is_networked() + ","
						+ insuranceData.isBoo_Whether_Claim_Made_Under_Alternate() + ","
						+ insuranceData.getDate_Claim_Intimation() + "," + insuranceData.getDate_of_Admission() + ","
						+ insuranceData.getDate_of_Birth() + "," + insuranceData.getDate_of_Discharge() + ","
						+ insuranceData.getDate_of_Payment() + "," + insuranceData.getDate_Policy_End() + ","
						+ insuranceData.getDate_Policy_Start() + "," + insuranceData.getNum_Age_of_Insured() + ","
						+ insuranceData.getNum_Amount_of_Co_Payment_or_Excess_if_applicable()
						+ "," + insuranceData.getNum_Bonus_Sum_Insured() + "," + insuranceData
								.getNum_Consultation_Charges()
						+ "," + insuranceData.getNum_Investigation_Charges() + ","
						+ insuranceData.getNum_Medicine_Charges() + "," + insuranceData.getNum_Miscellaneous_Charges()
						+ "," + insuranceData.getNum_Other_Non_Hospital_Expenses() + ","
						+ insuranceData.getNum_Percentage_of_Co_Payment_or_Excess_if_applicable() + ","
						+ insuranceData.getNum_Post_Hospitalisation_Expenses_included_under_150035() + ","
						+ insuranceData.getNum_Pre_Hospitalisation_Expenses_included_under_150035() + ","
						+ insuranceData.getNum_Room_Nursing_Charges() + "," + insuranceData.getNum_Sum_Insured() + ","
						+ insuranceData.getNum_Surgery_Charges() + "," + insuranceData.getNum_Total_Amount_Claimed()
						+ "," + insuranceData.getNum_Total_Claim_Paid() + ","
						+ insuranceData.getTxt_Claim_Number_Masked() + ","
						+ insuranceData.getTxt_Diagnosis_Code_Level_I() + ","
						+ insuranceData.getTxt_Diagnosis_Code_Level_II() + ","
						+ insuranceData.getTxt_Diagnosis_Code_Level_III() + "," + insuranceData.getTxt_Gender() + ","
						+ insuranceData.getTxt_Hospital_Code() + "," + insuranceData.getTxt_Insurer_Code_Masked() + ","
						+ insuranceData.getTxt_Medical_History_Level_I() + ","
						+ insuranceData.getTxt_Medical_History_Level_II() + ","
						+ insuranceData.getTxt_Medical_History_Level_III() + ","
						+ insuranceData.getTxt_Member_Reference_Key_Masked() + ","
						+ insuranceData.getTxt_Name_of_the_Hospital_Masked() + ","
						+ insuranceData.getTxt_PAN_of_Hospital_Masked() + ","
						+ insuranceData.getTxt_Payment_Reference_Number_Masked() + "," + insuranceData
								.getTxt_Pincode_of_Hospital_Masked()
						+ "," + insuranceData.getTxt_Policy_Number_Masked() + ","
						+ insuranceData.getTxt_Procedure_Code_Level_III() + ","
						+ insuranceData.getTxt_Procedure_Code_Level_I() + ","
						+ insuranceData.getTxt_Procedure_Code_Level_II() + ","
						+ insuranceData.getTxt_Procedure_Description_Level_I() + ","
						+ insuranceData.getTxt_Procedure_Description_Level_II() + ","
						+ insuranceData.getTxt_Procedure_Description_Level_III() + ","
						+ insuranceData.getTxt_Product_Type() + ","
						+ insuranceData.getTxt_Reason_for_Reduction_of_Claim() + ","
						+ insuranceData.getTxt_Reason_for_Rejection_of_Claim() + ","
						+ insuranceData.getTxt_Registration_Number_of_Hospital_Masked() + ","
						+ insuranceData.getTxt_Remarks_of_TPA() + "," + insuranceData.getTxt_System_of_Medicine_Used()
						+ "," + insuranceData.getTxt_TPA_Code_Masked() + ","
						+ insuranceData.getTxt_Type_of_Claim_Payment() + "," + insuranceData.getTxt_Type_of_Policy());

	}

	public static void main(String[] args) throws Exception {
		InsuranceData ins = new InsuranceData();
		generateNetworkHospital();
		generateWhetherClaimMadeUnderAlternate();
		generateGender();
		generateTypeOfPolicy();
		generateHospitalData();
		generateDOB();
		generateClaimIntimation();
		generatepolicyDate();
		generateLevel();
		generateReasonForRejectionOfClaim();
		generateReasonForReductionOfClaim();
		generateTypeOfClaimPayment();
		generateGeneralCharge();
		generatePolicyNumber();
		System.out.println(ins.toString());
	}

	public static ArrayList<InsuranceData> writeDataToSocket() throws Exception {

		generateWhetherClaimMadeUnderAlternate();
		generateGender();
		generateTypeOfPolicy();
		generateHospitalData();
		generateNetworkHospital();
		generateDOB();
		generateClaimIntimation();
		generatepolicyDate();
		generateLevel();
		generateReasonForRejectionOfClaim();
		generateReasonForReductionOfClaim();
		generateTypeOfClaimPayment();
		generateGeneralCharge();
		ArrayList<InsuranceData> arrnew = generatePolicyNumber();
		return arrnew;

	}

	public static void generateReasonForRejectionOfClaim() {

		int index = r.nextInt(6);
		if (index <= 3) {
			if (rejectionCounter == 100) {
				index = r.nextInt(3);
				insuranceData.setTxt_Reason_for_Rejection_of_Claim(reasonForRejectionOfClaim[index]);
				rejectionCounter = 0;
			} else {
				index = r.nextInt(6 - 4) + 4;
				insuranceData.setTxt_Reason_for_Rejection_of_Claim(reasonForRejectionOfClaim[index]);
				rejectionCounter++;
			}
		} else {
			insuranceData.setTxt_Reason_for_Rejection_of_Claim(reasonForRejectionOfClaim[index]);
		}
		insuranceData.setTxt_Remarks_of_TPA(remarksOfTPA[index]);
	}

	public static void generateReasonForReductionOfClaim() {
		int index = r.nextInt(5);
		insuranceData.setTxt_Reason_for_Reduction_of_Claim(reasonForReductionOfClaim[index]);
	}

	public static void generateNetworkHospital() {

		insuranceData.setTxt_Product_Type(productType[r.nextInt(3)]);

		String prodType = insuranceData.getTxt_Product_Type();
		String hospital = insuranceData.getTxt_Name_of_the_Hospital_Masked();

		if ((prodType.equalsIgnoreCase(productType[0]) && (hospital.equalsIgnoreCase(hosName[0])
				|| hospital.equalsIgnoreCase(hosName[1]) || hospital.equalsIgnoreCase(hosName[2])))
				|| (prodType.equalsIgnoreCase(productType[1]) && (hospital.equalsIgnoreCase(hosName[3])
						|| hospital.equalsIgnoreCase(hosName[1]) || hospital.equalsIgnoreCase(hosName[2])))
				|| (prodType.equalsIgnoreCase(productType[2]) && (hospital.equalsIgnoreCase(hosName[4])
						|| hospital.equalsIgnoreCase(hosName[3]) || hospital.equalsIgnoreCase(hosName[2])))) {
			insuranceData.setBoo_hospital_is_networked(true);
		} else {
			insuranceData.setBoo_hospital_is_networked(false);
		}

	}

	public static void generateWhetherClaimMadeUnderAlternate() {

		boolean claimMade = val[r.nextInt(2)];
		insuranceData.setBoo_Whether_Claim_Made_Under_Alternate(claimMade);

	}

	public static void generateGeneralCharge() {

		// sum insured
		int finalSumInsured = 0;
		int sumInsured = r.nextInt(6 - 3) + 3;
		int sumInsuredRandom = (sumInsured * 100000) + r.nextInt(999 - 1) + 1;

		int percentageClaimedRandom = r.nextInt(5);
		if (percentageClaimedRandom == 1) {
			finalSumInsured = (int) (0.6 * sumInsuredRandom);
		}

		else if (percentageClaimedRandom == 2) {
			finalSumInsured = (int) (0.5 * sumInsuredRandom);
		}

		else if (percentageClaimedRandom == 0) {
			finalSumInsured = (int) (0.4 * sumInsuredRandom);
		} else if (percentageClaimedRandom == 3) {
			finalSumInsured = sumInsuredRandom;
		} else {
			finalSumInsured = (int) (1.5 * sumInsuredRandom);
		}
		insuranceData.setNum_Sum_Insured(sumInsuredRandom);

		// Amount of co-payment or excess if applicable
		int coRandom = r.nextInt(90 - 1) + 1;
		int coPayment = coRandom * 100;
		insuranceData.setNum_Amount_of_Co_Payment_or_Excess_if_applicable(coPayment);

		int conCharge = 0;

		// consultation charge generation

		// conCharge = (int) (0.10 * finalSumInsured);
		// insuranceData.setNum_Consultation_Charges(conCharge);

		if (doctorCounter == 10) {
			conCharge = (int) (0.65 * finalSumInsured);
			insuranceData.setNum_Consultation_Charges(conCharge);
			doctorCounter = 0;
		} else {
			conCharge = (int) (0.10 * finalSumInsured);
			insuranceData.setNum_Consultation_Charges(conCharge);
			doctorCounter++;
		}

		// investigation charge generation

		int invCharge = (int) (0.20 * finalSumInsured);
		insuranceData.setNum_Investigation_Charges(invCharge);
		// System.out.println(insuranceData.getNum_Investigation_Charges());

		// medicine charge generation
		int medCharge = (int) (0.14 * finalSumInsured);
		insuranceData.setNum_Medicine_Charges(medCharge);

		// misc charges generation
		int miscCharge = (int) (0.01 * finalSumInsured);
		insuranceData.setNum_Miscellaneous_Charges(miscCharge);

		// other non hospital expenses
		int otherCharges = (int) (0.025 * finalSumInsured);
		insuranceData.setNum_Other_Non_Hospital_Expenses(otherCharges);

		// nursing room charges
		int nursCharges = (int) (0.15 * finalSumInsured);
		insuranceData.setNum_Room_Nursing_Charges(nursCharges);

		// surgery charges
		int surgeryCharges = (int) (0.3 * finalSumInsured);
		insuranceData.setNum_Surgery_Charges(surgeryCharges);
		// System.out.println(insuranceData.getNum_Surgery_Charges());

		// pre hospitalisation charges
		int preHosCharges = (int) (0.075 * finalSumInsured);
		insuranceData.setNum_Pre_Hospitalisation_Expenses_included_under_150035(preHosCharges);

		// post hospitalisation charges
		int postHosCharges = (int) (0.10 * finalSumInsured);

		insuranceData.setNum_Post_Hospitalisation_Expenses_included_under_150035(postHosCharges);

		// total claim amount
		int totalClaimAmount = conCharge + invCharge + medCharge + miscCharge + otherCharges + preHosCharges
				+ nursCharges + surgeryCharges;
		insuranceData.setNum_Total_Amount_Claimed(totalClaimAmount);
		int percentageCo = (coPayment * 100) / totalClaimAmount;
		insuranceData.setNum_Percentage_of_Co_Payment_or_Excess_if_applicable(percentageCo);

		if (!(insuranceData.getTxt_Reason_for_Rejection_of_Claim().equals("NA"))) {
			totalClaimPaid = 0;
		} else if (insuranceData.getNum_Sum_Insured() < insuranceData.getNum_Total_Amount_Claimed()) {
			// totalClaimPaid = r.nextInt(insuranceData.getNum_Sum_Insured() -
			// 200000) + 200000 - coPayment;
			totalClaimPaid = insuranceData.getNum_Sum_Insured() - coPayment;
		} else if (insuranceData.getNum_Sum_Insured() > insuranceData.getNum_Total_Amount_Claimed()) {
			int limit = (int) (0.8 * insuranceData.getNum_Total_Amount_Claimed());
			totalClaimPaid = r.nextInt(insuranceData.getNum_Total_Amount_Claimed() - limit) + limit - coPayment;
			claimCounter++;
			if (claimCounter == 300) {
				totalClaimPaid = insuranceData.getNum_Total_Amount_Claimed() - coPayment;
				claimCounter = 0;
			}
		}
		insuranceData.setNum_Total_Claim_Paid(totalClaimPaid);

	}

	public static void generateGender() {
		if (genderCount == 3) {
			insuranceData.setTxt_Gender(gender[0]);
			genderCount = 0;
		} else {
			insuranceData.setTxt_Gender(gender[1]);
			genderCount++;
		}
		

//		if (r.nextInt() % 2 == 0) {
//			insuranceData.setTxt_Gender(gender[1]);
//		} else {
//			if (genderCount == 2) {
//				insuranceData.setTxt_Gender(gender[0]);
//				genderCount = 0;
//			} else {
//				insuranceData.setTxt_Gender(gender[1]);
//				genderCount++;
//			}
//		}
	}

	public static void generateTypeOfPolicy() {
		String policy = typeOfPolicy[r.nextInt(8)];

		if (insuranceData.getNum_Age_of_Insured() < 18) {
			policy = typeOfPolicy[r.nextInt(7) + 1];
			insuranceData.setTxt_Type_of_Policy(policy);
		} else {
			insuranceData.setTxt_Type_of_Policy(policy);
		}
	}

	public static void generateHospitalData() {

		int index = r.nextInt(5);
		insuranceData.setTxt_Hospital_Code(hosCode[index]);
		insuranceData.setTxt_Name_of_the_Hospital_Masked(hosName[index]);
		insuranceData.setTxt_PAN_of_Hospital_Masked(hosPAN[index]);
		insuranceData.setTxt_Pincode_of_Hospital_Masked(hosPin[index]);
		insuranceData.setTxt_Registration_Number_of_Hospital_Masked(hosRegNo[index]);

	}

	public static void generateTypeOfClaimPayment() {
		String gen = claimPayment[r.nextInt(5)];
		insuranceData.setTxt_Type_of_Claim_Payment(gen);
	}

	public static void generateDOB() {
		int month = r.nextInt(12 - 3) + 3;
		int d = r.nextInt(30) + 1;
		Date dob = new Date();
		dob.setYear(dob.getYear() - insuranceData.getNum_Age_of_Insured() - 1);
		dob.setMonth(month);
		dob.setDate(d);
		insuranceData.setDate_of_Birth(dob);

	}

	public static void generateClaimIntimation() {

		int m1 = r.nextInt(3) + 9;
		int d1 = r.nextInt(30) + 1;
		Calendar cal = Calendar.getInstance();
		cal.set(2016, m1, d1);
		Date admissiondate = cal.getTime();
		insuranceData.setDate_of_Admission(admissiondate);
		cal.add(Calendar.DATE, r.nextInt(21) + 2);
		Date dischargedate = cal.getTime();
		insuranceData.setDate_of_Discharge(dischargedate);
		Date paymentdate = dischargedate;
		insuranceData.setDate_of_Payment(paymentdate);

		Date claimdateintimation = new Date();
		Calendar caldischarge = Calendar.getInstance();

		int num = r.nextInt();

		if (num % 2 == 0 && claimCounter1 > 3) {

			caldischarge.setTime(dischargedate);
			caldischarge.add(Calendar.DATE, -1);
			claimdateintimation = caldischarge.getTime();
			insuranceData.setDate_Claim_Intimation(claimdateintimation);
			claimCounter1 = 0;
			claimDateCounter++;

		} else if(claimDateCounter==3) {
			claimCounter1++;
			do {
				caldischarge.setTime(admissiondate);
				caldischarge.add(Calendar.DATE,2);
				claimdateintimation = caldischarge.getTime();
			} while (claimdateintimation.before(dischargedate) == false);
			insuranceData.setDate_Claim_Intimation(claimdateintimation);
			claimDateCounter=0;
		}
		else {
			claimCounter1++;
			claimDateCounter++;
			do {
				caldischarge.setTime(admissiondate);
				int ran=r.nextInt(8) - 5;
				caldischarge.add(Calendar.DATE,ran);
				claimdateintimation = caldischarge.getTime();
			} while (claimdateintimation.before(dischargedate) == false);
			insuranceData.setDate_Claim_Intimation(claimdateintimation);
		}
	}

	public static void generatepolicyDate() {

		int m3;
		int d3;
		Date startpolicydate = new Date();
		Date admissiondate = insuranceData.getDate_of_Admission();
		do {
			m3 = r.nextInt(9 - 2) + 2;
			d3 = r.nextInt(30) + 1;
			startpolicydate.setYear(admissiondate.getYear() + r.nextInt(2) - 1);
			startpolicydate.setMonth(m3);
			startpolicydate.setDate(d3);
		} while (((startpolicydate.before(admissiondate)) || (startpolicydate == admissiondate)) == false);
		insuranceData.setDate_Policy_Start(startpolicydate);

		Date dischargedate = insuranceData.getDate_of_Discharge();
		Date endpolicydate = new Date();
		do {
			m3 = r.nextInt(12 - 2) + 2;
			d3 = r.nextInt(30) + 1;
			endpolicydate.setYear(dischargedate.getYear() + 1);
			// endpolicydate.setYear(2017);
			endpolicydate.setMonth(m3);
			endpolicydate.setDate(d3);
		} while (endpolicydate.after(dischargedate) == false);
		insuranceData.setDate_Policy_End(endpolicydate);

	}

	public static void generateLevel() {
		int index = r.nextInt(3);
		if (index != 1 && diagnosisCounter == 10) {
			insuranceData.setTxt_Diagnosis_Code_Level_I(diagnosisCode1[index]);
			insuranceData.setTxt_Diagnosis_Code_Level_II(diagnosisCode2[index]);
			insuranceData.setTxt_Diagnosis_Code_Level_III(diagnosisCode3[index]);
			diagnosisCounter = 0;
		} else {
				diagnosisCounter++;
			
			// fraud data
			insuranceData.setTxt_Diagnosis_Code_Level_I(diagnosisCode1[index]);
			insuranceData.setTxt_Diagnosis_Code_Level_II(diagnosisCode2[index]);
			insuranceData.setTxt_Diagnosis_Code_Level_III(diagnosisCode3[index]);
		}

		// fraud data for diagnosis not filled
		if (claimDiagnosisCounter == 5) {
			insuranceData.setTxt_Diagnosis_Code_Level_I(null);
			claimDiagnosisCounter = 0;
		} else {
			claimDiagnosisCounter++;
		}

		insuranceData.setTxt_Procedure_Code_Level_I(procedureCode1[index]);
		insuranceData.setTxt_Procedure_Code_Level_II(procedureCode2[index]);
		insuranceData.setTxt_Procedure_Code_Level_III(procedureCode3[index]);

		// fraud data for past medical history
		if (medHistoryCounter == 10) {
			insuranceData.setTxt_Medical_History_Level_I(null);
			insuranceData.setTxt_Medical_History_Level_II(null);
			insuranceData.setTxt_Medical_History_Level_III(null);
			medHistoryCounter = 0;
		} else {
			insuranceData.setTxt_Medical_History_Level_I(medicalHistory1[index]);
			insuranceData.setTxt_Medical_History_Level_II(medicalHistory2[index]);
			insuranceData.setTxt_Medical_History_Level_III(medicalHistory3[index]);
			medHistoryCounter++;
		}

		insuranceData.setTxt_Procedure_Description_Level_I(procedureDescriptions1[index]);
		insuranceData.setTxt_Procedure_Description_Level_II(procedureDescriptions2[index]);
		insuranceData.setTxt_Procedure_Description_Level_III(procedureDescriptions3[index]);

	}

	public static ArrayList<InsuranceData> generatePolicyNumber() throws Exception {
		ArrayList<InsuranceData> arrnew = new ArrayList<InsuranceData>();
		// System.out.println("policy started");
		myInt++;
		String basePolicyNo = String.format("%010d", myInt);
		String corporateCode = new String();
		String familyno[] = new String[7];
		String groupCode = new String();
		int family = r.nextInt(6) + 1;
		// System.out.println("family" + family);
		if (family == 1) {
			corporateCode = "INDIVIDUAL";
			familyno[0] = "0001";
			groupCode = "0001";
		} else {
			corporateCode = "IRISSOFT01";
			groupCode = "0002";
			for (int i = 1; i <= family; i++) {
				familyno[i - 1] = String.format("%04d", i);
			}
		}
		generateClaimIntimation();
		generatepolicyDate();

		List<Integer> arr = new ArrayList<Integer>();
		int i;
		int m = 0;
		int k = 0;

		if (counterfamily == 50) {
			k = r.nextInt(family);
			counterfamily = 0;
		} else {
			k = 0;
			counterfamily++;
		}

		// System.out.println("k" + k);
		InsuranceData insd = null;
		if (k == 0) {
			int rndm = r.nextInt(2);
			corporateCode = corporateCode2[rndm];
			groupCode = groupCode2[rndm];
		}
		while (arr.size() <= k) {

			i = r.nextInt(family);
			m = i + 1;
			if (i < family && !arr.contains(i)) {

				policyNumber = insuranceData.getTxt_Pincode_of_Hospital_Masked() + corporateCode + groupCode
						+ basePolicyNo + familyno[i];
				insuranceData.setTxt_Policy_Number_Masked(policyNumber);
				policyNumber = "";

				int age = 0;
				if (m == 5 || m == 6)
					age = r.nextInt(19) + 1;
				else if (m == 1 || m == 2)
					age = r.nextInt(46 - 20) + 20;
				else if (m == 3 || m == 4)
					age = r.nextInt(81 - 47) + 47;
				insuranceData.setNum_Age_of_Insured(age);
				generateDOB();
				arr.add(i);
				if (k == 5 || k == 3 || k == 4) {
					insuranceData.setTxt_Type_of_Policy("Accidental Insurance");

				} else if (k == 2 || k == 1) {
					insuranceData.setTxt_Type_of_Policy("Family Floater Health Insurance");
					do {
						generateClaimIntimation();
					} while ((insuranceData.getDate_Claim_Intimation()
							.before(insuranceData.getDate_Policy_Start())) == true);

				}

				// System.out.println(arr + "+arr" + arr.size());
				insd = new InsuranceData();
				insd = (InsuranceData) insuranceData.clone();
				arrnew.add(insd);
			}
		}
		return arrnew;
	}
}
