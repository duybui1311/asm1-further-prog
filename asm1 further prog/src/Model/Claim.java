/**
 * @author <Bui Cong Duy - s3978546>
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Claim {
    private String id;
    private Date claimDate;
    private String insuredPerson;
    private String cardNumber;
    private Date examDate;
    private List<String> documents;
    private double claimAmount;
    private String status;
    private String receiverBankNumber;

    private ReceiverBankInfo receiverBankInfo;


    public static class ReceiverBankInfo {
        private String bank;
        private String name;
        private String number;

        public ReceiverBankInfo(String bank, String name, String number) {
            this.bank = bank;
            this.name = name;
            this.number = number;
        }
    }

    public enum ClaimStatus {
        NEW,
        PROCESSING,
        DONE
    }

    public Claim(String id, Date claimDate, String insuredPerson, String cardNumber, Date examDate,
                 List<String> documents, double claimAmount, String status,
                 ReceiverBankInfo receiverBankInfo) {
        this.id = generateUniqueId();
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankInfo = receiverBankInfo;
    }


    // Getter and setter methods for attributes

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(String insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiverBank() {
        return receiverBankNumber;
    }
    public void setReceiverBankNumber(String receiverBankNumber) {
    this.receiverBankNumber = receiverBankNumber;
    }
    private String generateUniqueId() {
        String uuid = UUID.randomUUID().toString();
        return "f-" + uuid.substring(uuid.length() - 10);
    }


    private List<String> formatDocumentFilenames(List<String> documents) {
        List<String> formattedDocuments = new ArrayList<>();
        for (String document: documents) {
            String documentName = document.substring(0, document.lastIndexOf('.'));
            String formattedFilename = String.format("%s_%s_%s.pdf", id, cardNumber, documentName);
            formattedDocuments.add(formattedFilename);
        }
        return  formattedDocuments;
    }
}
