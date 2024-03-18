package View;
import java.util.List;
import Model.Claim;
public interface ClaimProcessManager {
    void add(Claim claim);
    void update(Claim claim);
    void delete(Claim claim);
    Claim getOne(String claimId);
    List<Claim> getAll();
}

