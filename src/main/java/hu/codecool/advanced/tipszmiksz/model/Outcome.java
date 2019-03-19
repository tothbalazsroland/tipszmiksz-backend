
package hu.codecool.advanced.tipszmiksz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Outcome {

    @Expose
    private Double fixedOdds;
    @Expose
    private String outcomeName;
    @Expose
    private Long outcomeNo;
    @Expose
    private String outcomeRealNo;
    @Expose
    private Long outcomeResult;

    public Double getFixedOdds() {
        return fixedOdds;
    }

    public void setFixedOdds(Double fixedOdds) {
        this.fixedOdds = fixedOdds;
    }

    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
    }

    public Long getOutcomeNo() {
        return outcomeNo;
    }

    public void setOutcomeNo(Long outcomeNo) {
        this.outcomeNo = outcomeNo;
    }

    public String getOutcomeRealNo() {
        return outcomeRealNo;
    }

    public void setOutcomeRealNo(String outcomeRealNo) {
        this.outcomeRealNo = outcomeRealNo;
    }

    public Long getOutcomeResult() {
        return outcomeResult;
    }

    public void setOutcomeResult(Long outcomeResult) {
        this.outcomeResult = outcomeResult;
    }

}
