package guru.springframework.sfgdi.openclosedprinciple;

public class ClaimManagementApprover {
    public void validateInsuranceClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("Valid claim");
        }
    }
}
