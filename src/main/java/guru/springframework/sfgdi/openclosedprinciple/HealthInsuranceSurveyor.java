package guru.springframework.sfgdi.openclosedprinciple;

public class HealthInsuranceSurveyor implements InsuranceSurveyor{
    public boolean isValidClaim() {
        System.out.println("Health Insurance Surveyor - Validating claim....");
        // Logic to validate claim
        return true;
    }
}
