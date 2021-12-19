package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

public class CardStruct implements Serializable {
    @c(a = "card_data")
    private Object cardData;
    @c(a = "card_style")
    int cardStyle;
    @c(a = "card_type")
    int cardType;
    @c(a = "card_url")
    String cardUrl;
    @c(a = "dynamic_type")
    private int dynamicType;
    @c(a = "gecko_channel")
    private List<String> geckoChannel;
    @c(a = "log_extra")
    private String logExtra;
    @c(a = "only_track_event_not_show")
    private Boolean onlyTrackEventNotShow = false;
    @c(a = "preload_before_show")
    private int preloadBeforeVideoEnd;
    @c(a = "preload_type")
    private int preloadType;
    @c(a = "show_duration")
    private int showDuration;
    @c(a = "show_seconds")
    int showSeconds = -1;
    @c(a = "track_url_list")
    private UrlModel trackUrlList;

    public interface IStatusCode {
        static {
            Covode.recordClassIndex(59361);
        }
    }

    static {
        Covode.recordClassIndex(59360);
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public Boolean getOnlyTrackEventNotShow() {
        return this.onlyTrackEventNotShow;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public int getPreloadBeforeVideoEnd() {
        return this.preloadBeforeVideoEnd * 1000;
    }

    public boolean isEnablePreload() {
        if (this.preloadType == 1) {
            return true;
        }
        return false;
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(new f().b(this.cardData));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void setCardType(int i2) {
        this.cardType = i2;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setPreloadBeforeVideoEnd(int i2) {
        this.preloadBeforeVideoEnd = i2;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
