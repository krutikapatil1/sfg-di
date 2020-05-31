package guru.springframework.sfgdi.openclosedprinciple;

public class VehicleInsuranceSurveyor implements InsuranceSurveyor{
    public boolean isValidClaim() {
        System.out.println("Vehicle Insurance Surveyor - Validating claim....");
        return true;
    }
}
