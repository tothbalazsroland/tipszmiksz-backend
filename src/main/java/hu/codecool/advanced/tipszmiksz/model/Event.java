
package hu.codecool.advanced.tipszmiksz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Event {

    @Expose
    private Long betradarId;
    @Expose
    private Long bettingPhase;
    @Expose
    private Long bettingStatus;
    @Expose
    private Object competitionClosedCombinations;
    @Expose
    private Long competitionGroupId;
    @Expose
    private String competitionGroupName;
    @Expose
    private Long competitionId;
    @Expose
    private String competitionName;
    @Expose
    private Object eventClosedCombinations;
    @Expose
    private String eventDate;
    @Expose
    private Long eventId;
    @Expose
    private String eventName;
    @Expose
    private List<EventParticipant> eventParticipants;
    @Expose
    private Long eventVersion;
    @Expose
    private Boolean hasVisibleLiveMarket;
    @Expose
    private Boolean hasVisiblePrematchMarket;
    @Expose
    private Long isLive;
    @Expose
    private Long isOutright;
    @Expose
    private Boolean liveStreamAvailable;
    @Expose
    private Long liveStreamEventId;
    @Expose
    private List<Market> markets;
    @Expose
    private String matchStatus;
    @Expose
    private Long remainingLiveMarketCount;
    @Expose
    private Long remainingPrematchMarketCount;
    @Expose
    private Long sportId;
    @Expose
    private String sportName;

    public Long getBetradarId() {
        return betradarId;
    }

    public void setBetradarId(Long betradarId) {
        this.betradarId = betradarId;
    }

    public Long getBettingPhase() {
        return bettingPhase;
    }

    public void setBettingPhase(Long bettingPhase) {
        this.bettingPhase = bettingPhase;
    }

    public Long getBettingStatus() {
        return bettingStatus;
    }

    public void setBettingStatus(Long bettingStatus) {
        this.bettingStatus = bettingStatus;
    }

    public Object getCompetitionClosedCombinations() {
        return competitionClosedCombinations;
    }

    public void setCompetitionClosedCombinations(Object competitionClosedCombinations) {
        this.competitionClosedCombinations = competitionClosedCombinations;
    }

    public Long getCompetitionGroupId() {
        return competitionGroupId;
    }

    public void setCompetitionGroupId(Long competitionGroupId) {
        this.competitionGroupId = competitionGroupId;
    }

    public String getCompetitionGroupName() {
        return competitionGroupName;
    }

    public void setCompetitionGroupName(String competitionGroupName) {
        this.competitionGroupName = competitionGroupName;
    }

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public Object getEventClosedCombinations() {
        return eventClosedCombinations;
    }

    public void setEventClosedCombinations(Object eventClosedCombinations) {
        this.eventClosedCombinations = eventClosedCombinations;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<EventParticipant> getEventParticipants() {
        return eventParticipants;
    }

    public void setEventParticipants(List<EventParticipant> eventParticipants) {
        this.eventParticipants = eventParticipants;
    }

    public Long getEventVersion() {
        return eventVersion;
    }

    public void setEventVersion(Long eventVersion) {
        this.eventVersion = eventVersion;
    }

    public Boolean getHasVisibleLiveMarket() {
        return hasVisibleLiveMarket;
    }

    public void setHasVisibleLiveMarket(Boolean hasVisibleLiveMarket) {
        this.hasVisibleLiveMarket = hasVisibleLiveMarket;
    }

    public Boolean getHasVisiblePrematchMarket() {
        return hasVisiblePrematchMarket;
    }

    public void setHasVisiblePrematchMarket(Boolean hasVisiblePrematchMarket) {
        this.hasVisiblePrematchMarket = hasVisiblePrematchMarket;
    }

    public Long getIsLive() {
        return isLive;
    }

    public void setIsLive(Long isLive) {
        this.isLive = isLive;
    }

    public Long getIsOutright() {
        return isOutright;
    }

    public void setIsOutright(Long isOutright) {
        this.isOutright = isOutright;
    }

    public Boolean getLiveStreamAvailable() {
        return liveStreamAvailable;
    }

    public void setLiveStreamAvailable(Boolean liveStreamAvailable) {
        this.liveStreamAvailable = liveStreamAvailable;
    }

    public Long getLiveStreamEventId() {
        return liveStreamEventId;
    }

    public void setLiveStreamEventId(Long liveStreamEventId) {
        this.liveStreamEventId = liveStreamEventId;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Long getRemainingLiveMarketCount() {
        return remainingLiveMarketCount;
    }

    public void setRemainingLiveMarketCount(Long remainingLiveMarketCount) {
        this.remainingLiveMarketCount = remainingLiveMarketCount;
    }

    public Long getRemainingPrematchMarketCount() {
        return remainingPrematchMarketCount;
    }

    public void setRemainingPrematchMarketCount(Long remainingPrematchMarketCount) {
        this.remainingPrematchMarketCount = remainingPrematchMarketCount;
    }

    public Long getSportId() {
        return sportId;
    }

    public void setSportId(Long sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

}
