
package hu.codecool.advanced.tipszmiksz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Market {

    @Expose
    private Long channelRetailer;
    @Expose
    private Long channelWeb;
    @Expose
    private Long mainMarket;
    @Expose
    private List<Object> marketClosedCombinations;
    @Expose
    private Long marketId;
    @Expose
    private String marketName;
    @Expose
    private String marketRealNo;
    @Expose
    private Long marketStatus;
    @Expose
    private Long marketSubType;
    @Expose
    private Long marketType;
    @Expose
    private List<Long> marketTypeCCGroups;
    @Expose
    private Long marketTypePriority;
    @Expose
    private Long marketVersion;
    @Expose
    private Long maxCombiCount;
    @Expose
    private Long minCombiCount;
    @Expose
    private Long outcomeCount;
    @Expose
    private List<Outcome> outcomes;
    @Expose
    private String specialOddsValue;
    @Expose
    private String winnerOutcomeName;

    public Long getChannelRetailer() {
        return channelRetailer;
    }

    public void setChannelRetailer(Long channelRetailer) {
        this.channelRetailer = channelRetailer;
    }

    public Long getChannelWeb() {
        return channelWeb;
    }

    public void setChannelWeb(Long channelWeb) {
        this.channelWeb = channelWeb;
    }

    public Long getMainMarket() {
        return mainMarket;
    }

    public void setMainMarket(Long mainMarket) {
        this.mainMarket = mainMarket;
    }

    public List<Object> getMarketClosedCombinations() {
        return marketClosedCombinations;
    }

    public void setMarketClosedCombinations(List<Object> marketClosedCombinations) {
        this.marketClosedCombinations = marketClosedCombinations;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketRealNo() {
        return marketRealNo;
    }

    public void setMarketRealNo(String marketRealNo) {
        this.marketRealNo = marketRealNo;
    }

    public Long getMarketStatus() {
        return marketStatus;
    }

    public void setMarketStatus(Long marketStatus) {
        this.marketStatus = marketStatus;
    }

    public Long getMarketSubType() {
        return marketSubType;
    }

    public void setMarketSubType(Long marketSubType) {
        this.marketSubType = marketSubType;
    }

    public Long getMarketType() {
        return marketType;
    }

    public void setMarketType(Long marketType) {
        this.marketType = marketType;
    }

    public List<Long> getMarketTypeCCGroups() {
        return marketTypeCCGroups;
    }

    public void setMarketTypeCCGroups(List<Long> marketTypeCCGroups) {
        this.marketTypeCCGroups = marketTypeCCGroups;
    }

    public Long getMarketTypePriority() {
        return marketTypePriority;
    }

    public void setMarketTypePriority(Long marketTypePriority) {
        this.marketTypePriority = marketTypePriority;
    }

    public Long getMarketVersion() {
        return marketVersion;
    }

    public void setMarketVersion(Long marketVersion) {
        this.marketVersion = marketVersion;
    }

    public Long getMaxCombiCount() {
        return maxCombiCount;
    }

    public void setMaxCombiCount(Long maxCombiCount) {
        this.maxCombiCount = maxCombiCount;
    }

    public Long getMinCombiCount() {
        return minCombiCount;
    }

    public void setMinCombiCount(Long minCombiCount) {
        this.minCombiCount = minCombiCount;
    }

    public Long getOutcomeCount() {
        return outcomeCount;
    }

    public void setOutcomeCount(Long outcomeCount) {
        this.outcomeCount = outcomeCount;
    }

    public List<Outcome> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public String getSpecialOddsValue() {
        return specialOddsValue;
    }

    public void setSpecialOddsValue(String specialOddsValue) {
        this.specialOddsValue = specialOddsValue;
    }

    public String getWinnerOutcomeName() {
        return winnerOutcomeName;
    }

    public void setWinnerOutcomeName(String winnerOutcomeName) {
        this.winnerOutcomeName = winnerOutcomeName;
    }

}
