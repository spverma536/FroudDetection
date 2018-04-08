package com.iris.insuranceFraudDetection;

import java.io.Serializable;
import java.util.Date;

public class InsuranceData implements Cloneable,Serializable {
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	boolean Boo_hospital_is_networked;
	boolean Boo_Whether_Claim_Made_Under_Alternate;

	Date Date_Claim_Intimation;
	Date Date_of_Admission;
	Date Date_of_Birth;
	Date Date_of_Discharge;
	Date Date_of_Payment;
	@Override
	public String toString() {
		return "InsuranceData [Boo_hospital_is_networked=" + Boo_hospital_is_networked
				+ ", Boo_Whether_Claim_Made_Under_Alternate=" + Boo_Whether_Claim_Made_Under_Alternate
				+ ", Date_Claim_Intimation=" + Date_Claim_Intimation + ", Date_of_Admission=" + Date_of_Admission
				+ ", Date_of_Birth=" + Date_of_Birth + ", Date_of_Discharge=" + Date_of_Discharge + ", Date_of_Payment="
				+ Date_of_Payment + ", Date_Policy_End=" + Date_Policy_End + ", Date_Policy_Start=" + Date_Policy_Start
				+ ", Num_Age_of_Insured=" + Num_Age_of_Insured + ", Num_Amount_of_Co_Payment_or_Excess_if_applicable="
				+ Num_Amount_of_Co_Payment_or_Excess_if_applicable + ", Num_Bonus_Sum_Insured=" + Num_Bonus_Sum_Insured
				+ ", Num_Consultation_Charges=" + Num_Consultation_Charges + ", Num_Investigation_Charges="
				+ Num_Investigation_Charges + ", Num_Medicine_Charges=" + Num_Medicine_Charges
				+ ", Num_Miscellaneous_Charges=" + Num_Miscellaneous_Charges + ", Num_Other_Non_Hospital_Expenses="
				+ Num_Other_Non_Hospital_Expenses + ", Num_Percentage_of_Co_Payment_or_Excess_if_applicable="
				+ Num_Percentage_of_Co_Payment_or_Excess_if_applicable
				+ ", Num_Post_Hospitalisation_Expenses_included_under_150035="
				+ Num_Post_Hospitalisation_Expenses_included_under_150035
				+ ", Num_Pre_Hospitalisation_Expenses_included_under_150035="
				+ Num_Pre_Hospitalisation_Expenses_included_under_150035 + ", Num_Room_Nursing_Charges="
				+ Num_Room_Nursing_Charges + ", Num_Sum_Insured=" + Num_Sum_Insured + ", Num_Surgery_Charges="
				+ Num_Surgery_Charges + ", Num_Total_Amount_Claimed=" + Num_Total_Amount_Claimed
				+ ", Num_Total_Claim_Paid=" + Num_Total_Claim_Paid + ", Txt_Claim_Number_Masked="
				+ Txt_Claim_Number_Masked + ", Txt_Diagnosis_Code_Level_I=" + Txt_Diagnosis_Code_Level_I
				+ ", Txt_Diagnosis_Code_Level_II=" + Txt_Diagnosis_Code_Level_II + ", Txt_Diagnosis_Code_Level_III="
				+ Txt_Diagnosis_Code_Level_III + ", Txt_Gender=" + Txt_Gender + ", Txt_Hospital_Code="
				+ Txt_Hospital_Code + ", Txt_Insurer_Code_Masked=" + Txt_Insurer_Code_Masked
				+ ", Txt_Medical_History_Level_I=" + Txt_Medical_History_Level_I + ", Txt_Medical_History_Level_II="
				+ Txt_Medical_History_Level_II + ", Txt_Medical_History_Level_III=" + Txt_Medical_History_Level_III
				+ ", Txt_Member_Reference_Key_Masked=" + Txt_Member_Reference_Key_Masked
				+ ", Txt_Name_of_the_Hospital_Masked=" + Txt_Name_of_the_Hospital_Masked
				+ ", Txt_PAN_of_Hospital_Masked=" + Txt_PAN_of_Hospital_Masked
				+ ", Txt_Payment_Reference_Number_Masked=" + Txt_Payment_Reference_Number_Masked
				+ ", Txt_Pincode_of_Hospital_Masked=" + Txt_Pincode_of_Hospital_Masked + ", Txt_Policy_Number_Masked="
				+ Txt_Policy_Number_Masked + ", Txt_Procedure_Code_Level_III=" + Txt_Procedure_Code_Level_III
				+ ", Txt_Procedure_Code_Level_I=" + Txt_Procedure_Code_Level_I + ", Txt_Procedure_Code_Level_II="
				+ Txt_Procedure_Code_Level_II + ", Txt_Procedure_Description_Level_I="
				+ Txt_Procedure_Description_Level_I + ", Txt_Procedure_Description_Level_II="
				+ Txt_Procedure_Description_Level_II + ", Txt_Procedure_Description_Level_III="
				+ Txt_Procedure_Description_Level_III + ", Txt_Product_Type=" + Txt_Product_Type
				+ ", Txt_Reason_for_Reduction_of_Claim=" + Txt_Reason_for_Reduction_of_Claim
				+ ", Txt_Reason_for_Rejection_of_Claim=" + Txt_Reason_for_Rejection_of_Claim
				+ ", Txt_Registration_Number_of_Hospital_Masked=" + Txt_Registration_Number_of_Hospital_Masked
				+ ", Txt_Remarks_of_TPA=" + Txt_Remarks_of_TPA + ", Txt_System_of_Medicine_Used="
				+ Txt_System_of_Medicine_Used + ", Txt_TPA_Code_Masked=" + Txt_TPA_Code_Masked
				+ ", Txt_Type_of_Claim_Payment=" + Txt_Type_of_Claim_Payment + ", Txt_Type_of_Policy="
				+ Txt_Type_of_Policy + "]";
	}

	Date Date_Policy_End;
	Date Date_Policy_Start;

	int Num_Age_of_Insured;
	int Num_Amount_of_Co_Payment_or_Excess_if_applicable;
	int Num_Bonus_Sum_Insured;
	int Num_Consultation_Charges;
	int Num_Investigation_Charges;
	int Num_Medicine_Charges;
	int Num_Miscellaneous_Charges;
	int Num_Other_Non_Hospital_Expenses;
	int Num_Percentage_of_Co_Payment_or_Excess_if_applicable;
	int Num_Post_Hospitalisation_Expenses_included_under_150035;
	int Num_Pre_Hospitalisation_Expenses_included_under_150035;
	int Num_Room_Nursing_Charges;
	int Num_Sum_Insured;
	int Num_Surgery_Charges;
	int Num_Total_Amount_Claimed;
	int Num_Total_Claim_Paid;

	String Txt_Claim_Number_Masked;
	String Txt_Diagnosis_Code_Level_I;
	String Txt_Diagnosis_Code_Level_II;
	String Txt_Diagnosis_Code_Level_III;
	String Txt_Gender;
	String Txt_Hospital_Code;
	String Txt_Insurer_Code_Masked;
	String Txt_Medical_History_Level_I;
	String Txt_Medical_History_Level_II;
	String Txt_Medical_History_Level_III;
	String Txt_Member_Reference_Key_Masked;
	String Txt_Name_of_the_Hospital_Masked;
	String Txt_PAN_of_Hospital_Masked;
	String Txt_Payment_Reference_Number_Masked;
	String Txt_Pincode_of_Hospital_Masked;
	String Txt_Policy_Number_Masked;
	String Txt_Procedure_Code_Level_III;
	String Txt_Procedure_Code_Level_I;
	String Txt_Procedure_Code_Level_II;
	String Txt_Procedure_Description_Level_I;
	String Txt_Procedure_Description_Level_II;
	String Txt_Procedure_Description_Level_III;
	String Txt_Product_Type;
	String Txt_Reason_for_Reduction_of_Claim;
	String Txt_Reason_for_Rejection_of_Claim;
	String Txt_Registration_Number_of_Hospital_Masked;
	String Txt_Remarks_of_TPA;
	String Txt_System_of_Medicine_Used;
	String Txt_TPA_Code_Masked;
	String Txt_Type_of_Claim_Payment;
	
	public boolean isBoo_hospital_is_networked() {
		return Boo_hospital_is_networked;
	}

	public void setBoo_hospital_is_networked(boolean boo_hospital_is_networked) {
		Boo_hospital_is_networked = boo_hospital_is_networked;
	}

	public boolean isBoo_Whether_Claim_Made_Under_Alternate() {
		return Boo_Whether_Claim_Made_Under_Alternate;
	}

	public void setBoo_Whether_Claim_Made_Under_Alternate(boolean boo_Whether_Claim_Made_Under_Alternate) {
		Boo_Whether_Claim_Made_Under_Alternate = boo_Whether_Claim_Made_Under_Alternate;
	}

	public Date getDate_Claim_Intimation() {
		return Date_Claim_Intimation;
	}

	public void setDate_Claim_Intimation(Date date_Claim_Intimation) {
		Date_Claim_Intimation = date_Claim_Intimation;
	}

	public Date getDate_of_Admission() {
		return Date_of_Admission;
	}

	public void setDate_of_Admission(Date date_of_Admission) {
		Date_of_Admission = date_of_Admission;
	}

	public Date getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(Date date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}

	public Date getDate_of_Discharge() {
		return Date_of_Discharge;
	}

	public void setDate_of_Discharge(Date date_of_Discharge) {
		Date_of_Discharge = date_of_Discharge;
	}

	public Date getDate_of_Payment() {
		return Date_of_Payment;
	}

	public void setDate_of_Payment(Date date_of_Payment) {
		Date_of_Payment = date_of_Payment;
	}

	public Date getDate_Policy_End() {
		return Date_Policy_End;
	}

	public void setDate_Policy_End(Date date_Policy_End) {
		Date_Policy_End = date_Policy_End;
	}

	public Date getDate_Policy_Start() {
		return Date_Policy_Start;
	}

	public void setDate_Policy_Start(Date date_Policy_Start) {
		Date_Policy_Start = date_Policy_Start;
	}

	public int getNum_Age_of_Insured() {
		return Num_Age_of_Insured;
	}

	public void setNum_Age_of_Insured(int num_Age_of_Insured) {
		Num_Age_of_Insured = num_Age_of_Insured;
	}

	public int getNum_Amount_of_Co_Payment_or_Excess_if_applicable() {
		return Num_Amount_of_Co_Payment_or_Excess_if_applicable;
	}

	public void setNum_Amount_of_Co_Payment_or_Excess_if_applicable(
			int num_Amount_of_Co_Payment_or_Excess_if_applicable) {
		Num_Amount_of_Co_Payment_or_Excess_if_applicable = num_Amount_of_Co_Payment_or_Excess_if_applicable;
	}

	public int getNum_Bonus_Sum_Insured() {
		return Num_Bonus_Sum_Insured;
	}

	public void setNum_Bonus_Sum_Insured(int num_Bonus_Sum_Insured) {
		Num_Bonus_Sum_Insured = num_Bonus_Sum_Insured;
	}

	public int getNum_Consultation_Charges() {
		return Num_Consultation_Charges;
	}

	public void setNum_Consultation_Charges(int num_Consultation_Charges) {
		Num_Consultation_Charges = num_Consultation_Charges;
	}

	public int getNum_Investigation_Charges() {
		return Num_Investigation_Charges;
	}

	public void setNum_Investigation_Charges(int num_Investigation_Charges) {
		Num_Investigation_Charges = num_Investigation_Charges;
	}

	public int getNum_Medicine_Charges() {
		return Num_Medicine_Charges;
	}

	public void setNum_Medicine_Charges(int num_Medicine_Charges) {
		Num_Medicine_Charges = num_Medicine_Charges;
	}

	public int getNum_Miscellaneous_Charges() {
		return Num_Miscellaneous_Charges;
	}

	public void setNum_Miscellaneous_Charges(int num_Miscellaneous_Charges) {
		Num_Miscellaneous_Charges = num_Miscellaneous_Charges;
	}

	public int getNum_Other_Non_Hospital_Expenses() {
		return Num_Other_Non_Hospital_Expenses;
	}

	public void setNum_Other_Non_Hospital_Expenses(int num_Other_Non_Hospital_Expenses) {
		Num_Other_Non_Hospital_Expenses = num_Other_Non_Hospital_Expenses;
	}

	public int getNum_Percentage_of_Co_Payment_or_Excess_if_applicable() {
		return Num_Percentage_of_Co_Payment_or_Excess_if_applicable;
	}

	public void setNum_Percentage_of_Co_Payment_or_Excess_if_applicable(
			int num_Percentage_of_Co_Payment_or_Excess_if_applicable) {
		Num_Percentage_of_Co_Payment_or_Excess_if_applicable = num_Percentage_of_Co_Payment_or_Excess_if_applicable;
	}

	public int getNum_Post_Hospitalisation_Expenses_included_under_150035() {
		return Num_Post_Hospitalisation_Expenses_included_under_150035;
	}

	public void setNum_Post_Hospitalisation_Expenses_included_under_150035(
			int num_Post_Hospitalisation_Expenses_included_under_150035) {
		Num_Post_Hospitalisation_Expenses_included_under_150035 = num_Post_Hospitalisation_Expenses_included_under_150035;
	}

	public int getNum_Pre_Hospitalisation_Expenses_included_under_150035() {
		return Num_Pre_Hospitalisation_Expenses_included_under_150035;
	}

	public void setNum_Pre_Hospitalisation_Expenses_included_under_150035(
			int num_Pre_Hospitalisation_Expenses_included_under_150035) {
		Num_Pre_Hospitalisation_Expenses_included_under_150035 = num_Pre_Hospitalisation_Expenses_included_under_150035;
	}

	public int getNum_Room_Nursing_Charges() {
		return Num_Room_Nursing_Charges;
	}

	public void setNum_Room_Nursing_Charges(int num_Room_Nursing_Charges) {
		Num_Room_Nursing_Charges = num_Room_Nursing_Charges;
	}

	public int getNum_Sum_Insured() {
		return Num_Sum_Insured;
	}

	public void setNum_Sum_Insured(int num_Sum_Insured) {
		Num_Sum_Insured = num_Sum_Insured;
	}

	public int getNum_Surgery_Charges() {
		return Num_Surgery_Charges;
	}

	public void setNum_Surgery_Charges(int num_Surgery_Charges) {
		Num_Surgery_Charges = num_Surgery_Charges;
	}

	public int getNum_Total_Amount_Claimed() {
		return Num_Total_Amount_Claimed;
	}

	public void setNum_Total_Amount_Claimed(int num_Total_Amount_Claimed) {
		Num_Total_Amount_Claimed = num_Total_Amount_Claimed;
	}

	public int getNum_Total_Claim_Paid() {
		return Num_Total_Claim_Paid;
	}

	public void setNum_Total_Claim_Paid(int num_Total_Claim_Paid) {
		Num_Total_Claim_Paid = num_Total_Claim_Paid;
	}

	public String getTxt_Claim_Number_Masked() {
		return Txt_Claim_Number_Masked;
	}

	public void setTxt_Claim_Number_Masked(String txt_Claim_Number_Masked) {
		Txt_Claim_Number_Masked = txt_Claim_Number_Masked;
	}

	public String getTxt_Diagnosis_Code_Level_I() {
		return Txt_Diagnosis_Code_Level_I;
	}

	public void setTxt_Diagnosis_Code_Level_I(String txt_Diagnosis_Code_Level_I) {
		Txt_Diagnosis_Code_Level_I = txt_Diagnosis_Code_Level_I;
	}

	public String getTxt_Diagnosis_Code_Level_II() {
		return Txt_Diagnosis_Code_Level_II;
	}

	public void setTxt_Diagnosis_Code_Level_II(String txt_Diagnosis_Code_Level_II) {
		Txt_Diagnosis_Code_Level_II = txt_Diagnosis_Code_Level_II;
	}

	public String getTxt_Diagnosis_Code_Level_III() {
		return Txt_Diagnosis_Code_Level_III;
	}

	public void setTxt_Diagnosis_Code_Level_III(String txt_Diagnosis_Code_Level_III) {
		Txt_Diagnosis_Code_Level_III = txt_Diagnosis_Code_Level_III;
	}

	public String getTxt_Gender() {
		return Txt_Gender;
	}

	public void setTxt_Gender(String txt_Gender) {
		Txt_Gender = txt_Gender;
	}

	public String getTxt_Hospital_Code() {
		return Txt_Hospital_Code;
	}

	public void setTxt_Hospital_Code(String txt_Hospital_Code) {
		Txt_Hospital_Code = txt_Hospital_Code;
	}

	public String getTxt_Insurer_Code_Masked() {
		return Txt_Insurer_Code_Masked;
	}

	public void setTxt_Insurer_Code_Masked(String txt_Insurer_Code_Masked) {
		Txt_Insurer_Code_Masked = txt_Insurer_Code_Masked;
	}

	public String getTxt_Medical_History_Level_I() {
		return Txt_Medical_History_Level_I;
	}

	public void setTxt_Medical_History_Level_I(String txt_Medical_History_Level_I) {
		Txt_Medical_History_Level_I = txt_Medical_History_Level_I;
	}

	public String getTxt_Medical_History_Level_II() {
		return Txt_Medical_History_Level_II;
	}

	public void setTxt_Medical_History_Level_II(String txt_Medical_History_Level_II) {
		Txt_Medical_History_Level_II = txt_Medical_History_Level_II;
	}

	public String getTxt_Medical_History_Level_III() {
		return Txt_Medical_History_Level_III;
	}

	public void setTxt_Medical_History_Level_III(String txt_Medical_History_Level_III) {
		Txt_Medical_History_Level_III = txt_Medical_History_Level_III;
	}

	public String getTxt_Member_Reference_Key_Masked() {
		return Txt_Member_Reference_Key_Masked;
	}

	public void setTxt_Member_Reference_Key_Masked(String txt_Member_Reference_Key_Masked) {
		Txt_Member_Reference_Key_Masked = txt_Member_Reference_Key_Masked;
	}

	public String getTxt_Name_of_the_Hospital_Masked() {
		return Txt_Name_of_the_Hospital_Masked;
	}

	public void setTxt_Name_of_the_Hospital_Masked(String txt_Name_of_the_Hospital_Masked) {
		Txt_Name_of_the_Hospital_Masked = txt_Name_of_the_Hospital_Masked;
	}

	public String getTxt_PAN_of_Hospital_Masked() {
		return Txt_PAN_of_Hospital_Masked;
	}

	public void setTxt_PAN_of_Hospital_Masked(String txt_PAN_of_Hospital_Masked) {
		Txt_PAN_of_Hospital_Masked = txt_PAN_of_Hospital_Masked;
	}

	public String getTxt_Payment_Reference_Number_Masked() {
		return Txt_Payment_Reference_Number_Masked;
	}

	public void setTxt_Payment_Reference_Number_Masked(String txt_Payment_Reference_Number_Masked) {
		Txt_Payment_Reference_Number_Masked = txt_Payment_Reference_Number_Masked;
	}

	public String getTxt_Pincode_of_Hospital_Masked() {
		return Txt_Pincode_of_Hospital_Masked;
	}

	public void setTxt_Pincode_of_Hospital_Masked(String txt_Pincode_of_Hospital_Masked) {
		Txt_Pincode_of_Hospital_Masked = txt_Pincode_of_Hospital_Masked;
	}

	public String getTxt_Policy_Number_Masked() {
		return Txt_Policy_Number_Masked;
	}

	public void setTxt_Policy_Number_Masked(String txt_Policy_Number_Masked) {
		Txt_Policy_Number_Masked = txt_Policy_Number_Masked;
	}

	public String getTxt_Procedure_Code_Level_III() {
		return Txt_Procedure_Code_Level_III;
	}

	public void setTxt_Procedure_Code_Level_III(String txt_Procedure_Code_Level_III) {
		Txt_Procedure_Code_Level_III = txt_Procedure_Code_Level_III;
	}

	public String getTxt_Procedure_Code_Level_I() {
		return Txt_Procedure_Code_Level_I;
	}

	public void setTxt_Procedure_Code_Level_I(String txt_Procedure_Code_Level_I) {
		Txt_Procedure_Code_Level_I = txt_Procedure_Code_Level_I;
	}

	public String getTxt_Procedure_Code_Level_II() {
		return Txt_Procedure_Code_Level_II;
	}

	public void setTxt_Procedure_Code_Level_II(String txt_Procedure_Code_Level_II) {
		Txt_Procedure_Code_Level_II = txt_Procedure_Code_Level_II;
	}

	public String getTxt_Procedure_Description_Level_I() {
		return Txt_Procedure_Description_Level_I;
	}

	public void setTxt_Procedure_Description_Level_I(String txt_Procedure_Description_Level_I) {
		Txt_Procedure_Description_Level_I = txt_Procedure_Description_Level_I;
	}

	public String getTxt_Procedure_Description_Level_II() {
		return Txt_Procedure_Description_Level_II;
	}

	public void setTxt_Procedure_Description_Level_II(String txt_Procedure_Description_Level_II) {
		Txt_Procedure_Description_Level_II = txt_Procedure_Description_Level_II;
	}

	public String getTxt_Procedure_Description_Level_III() {
		return Txt_Procedure_Description_Level_III;
	}

	public void setTxt_Procedure_Description_Level_III(String txt_Procedure_Description_Level_III) {
		Txt_Procedure_Description_Level_III = txt_Procedure_Description_Level_III;
	}

	public String getTxt_Product_Type() {
		return Txt_Product_Type;
	}

	public void setTxt_Product_Type(String txt_Product_Type) {
		Txt_Product_Type = txt_Product_Type;
	}

	public String getTxt_Reason_for_Reduction_of_Claim() {
		return Txt_Reason_for_Reduction_of_Claim;
	}

	public void setTxt_Reason_for_Reduction_of_Claim(String txt_Reason_for_Reduction_of_Claim) {
		Txt_Reason_for_Reduction_of_Claim = txt_Reason_for_Reduction_of_Claim;
	}

	public String getTxt_Reason_for_Rejection_of_Claim() {
		return Txt_Reason_for_Rejection_of_Claim;
	}

	public void setTxt_Reason_for_Rejection_of_Claim(String txt_Reason_for_Rejection_of_Claim) {
		Txt_Reason_for_Rejection_of_Claim = txt_Reason_for_Rejection_of_Claim;
	}

	public String getTxt_Registration_Number_of_Hospital_Masked() {
		return Txt_Registration_Number_of_Hospital_Masked;
	}

	public void setTxt_Registration_Number_of_Hospital_Masked(String txt_Registration_Number_of_Hospital_Masked) {
		Txt_Registration_Number_of_Hospital_Masked = txt_Registration_Number_of_Hospital_Masked;
	}

	public String getTxt_Remarks_of_TPA() {
		return Txt_Remarks_of_TPA;
	}

	public void setTxt_Remarks_of_TPA(String txt_Remarks_of_TPA) {
		Txt_Remarks_of_TPA = txt_Remarks_of_TPA;
	}

	public String getTxt_System_of_Medicine_Used() {
		return Txt_System_of_Medicine_Used;
	}

	public void setTxt_System_of_Medicine_Used(String txt_System_of_Medicine_Used) {
		Txt_System_of_Medicine_Used = txt_System_of_Medicine_Used;
	}

	public String getTxt_TPA_Code_Masked() {
		return Txt_TPA_Code_Masked;
	}

	public void setTxt_TPA_Code_Masked(String txt_TPA_Code_Masked) {
		Txt_TPA_Code_Masked = txt_TPA_Code_Masked;
	}

	public String getTxt_Type_of_Claim_Payment() {
		return Txt_Type_of_Claim_Payment;
	}

	public void setTxt_Type_of_Claim_Payment(String txt_Type_of_Claim_Payment) {
		Txt_Type_of_Claim_Payment = txt_Type_of_Claim_Payment;
	}

	public String getTxt_Type_of_Policy() {
		return Txt_Type_of_Policy;
	}

	public void setTxt_Type_of_Policy(String txt_Type_of_Policy) {
		Txt_Type_of_Policy = txt_Type_of_Policy;
	}

	String Txt_Type_of_Policy;
}
