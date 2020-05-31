package guru.springframework.sfgdi.openclosedprinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimManagementApproverTest {

    @Test
    void validateInsuranceClaim() {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimManagementApprover claimManagementApprover = new ClaimManagementApprover();
        claimManagementApprover.validateInsuranceClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claimManagementApprover.validateInsuranceClaim(vehicleInsuranceSurveyor);
    }
}