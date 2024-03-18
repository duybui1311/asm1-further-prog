/**
 * @author <Bui Cong Duy - s3978546>
 */
package Controller;
import Model.Claim;
import java.util.List;
import View.ClaimProcessManager;
public class ClaimController {
    private ClaimProcessManager claimProcessManager;

    public ClaimController(ClaimProcessManager claimProcessManager) {
        this.claimProcessManager = claimProcessManager;
    }

    public void addClaim(Claim claim) {
        claimProcessManager.add(claim);
    }

    public void updateClaim(Claim claim) {
        claimProcessManager.update(claim);
    }

    public void deleteClaim(String claimId) {
        Claim claim = claimProcessManager.getOne(claimId);
        if (claim != null) {
            claimProcessManager.delete(claim);
            System.out.println("Claim with ID " + claimId + " deleted successfully.");
        } else {
            System.out.println("Claim with ID " + claimId + " not found.");
        }
    }

    public Claim getClaimById(String claimId) {
        return claimProcessManager.getOne(claimId);
    }

    public List<Claim> getAllClaims() {
        return claimProcessManager.getAll();
    }
}
