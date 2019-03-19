
package hu.codecool.advanced.tipszmiksz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @Expose
    private Long count;
    @Expose
    private List<Event> events;
    @Expose
    private Long hitsPerPage;
    @Expose
    private Long maxOdds;
    @Expose
    private Long minOdds;
    @Expose
    private Long page;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Long getHitsPerPage() {
        return hitsPerPage;
    }

    public void setHitsPerPage(Long hitsPerPage) {
        this.hitsPerPage = hitsPerPage;
    }

    public Long getMaxOdds() {
        return maxOdds;
    }

    public void setMaxOdds(Long maxOdds) {
        this.maxOdds = maxOdds;
    }

    public Long getMinOdds() {
        return minOdds;
    }

    public void setMinOdds(Long minOdds) {
        this.minOdds = minOdds;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

}
