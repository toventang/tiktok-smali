package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

public final class LiveEvent implements Serializable {
    @c(a = "customActionItems")
    private List<String> customActionItems;
    @c(a = "eventID")
    private String eventID;
    @c(a = "internalURL")
    private String internalURL;
    @c(a = "isAnchor")
    private String isAnchor;
    @c(a = "organizer")
    private User organizer;
    @c(a = "shareURL")
    private String shareURL;
    @c(a = "showsIMForActivity")
    private Boolean showsIMForActivity = true;
    @c(a = "startTime")
    private String startTime;
    @c(a = "title")
    private String title;
    @c(a = "track_info")
    private String trackInfo;

    static {
        Covode.recordClassIndex(59415);
    }

    public final List<String> getCustomActionItems() {
        return this.customActionItems;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getInternalURL() {
        return this.internalURL;
    }

    public final User getOrganizer() {
        return this.organizer;
    }

    public final String getShareURL() {
        return this.shareURL;
    }

    public final Boolean getShowsIMForActivity() {
        return this.showsIMForActivity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackInfo() {
        return this.trackInfo;
    }

    public final String isAnchor() {
        return this.isAnchor;
    }

    public final void setAnchor(String str) {
        this.isAnchor = str;
    }

    public final void setCustomActionItems(List<String> list) {
        this.customActionItems = list;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setInternalURL(String str) {
        this.internalURL = str;
    }

    public final void setOrganizer(User user) {
        this.organizer = user;
    }

    public final void setShareURL(String str) {
        this.shareURL = str;
    }

    public final void setShowsIMForActivity(Boolean bool) {
        this.showsIMForActivity = bool;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrackInfo(String str) {
        this.trackInfo = str;
    }
}
