package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class aa implements Serializable {
    @c(a = "auto_show_webview")
    private Boolean autoShowWebview = false;
    @c(a = "button_text")
    private String buttonText;
    @c(a = "category_label")
    private String categoryLabel;
    @c(a = "description")
    private String description;
    @c(a = "fake_author_version")
    private Integer fakeAuthorVersion = 0;
    @c(a = "jump_data")
    private ab jumpData;
    @c(a = "rank_label")
    private String rankLabel;
    @c(a = "rating")
    private Float rating;
    @c(a = "show_banner")
    private boolean shouldShowBanner;
    @c(a = "total_ratings_reviews")
    private String totalRatingsReviews;

    static {
        Covode.recordClassIndex(46145);
    }

    public final Boolean getAutoShowWebview() {
        return this.autoShowWebview;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getCategoryLabel() {
        return this.categoryLabel;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getFakeAuthorVersion() {
        return this.fakeAuthorVersion;
    }

    public final ab getJumpData() {
        return this.jumpData;
    }

    public final String getRankLabel() {
        return this.rankLabel;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final boolean getShouldShowBanner() {
        return this.shouldShowBanner;
    }

    public final String getTotalRatingsReviews() {
        return this.totalRatingsReviews;
    }

    public final void setAutoShowWebview(Boolean bool) {
        this.autoShowWebview = bool;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setCategoryLabel(String str) {
        this.categoryLabel = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFakeAuthorVersion(Integer num) {
        this.fakeAuthorVersion = num;
    }

    public final void setJumpData(ab abVar) {
        this.jumpData = abVar;
    }

    public final void setRankLabel(String str) {
        this.rankLabel = str;
    }

    public final void setRating(Float f2) {
        this.rating = f2;
    }

    public final void setShouldShowBanner(boolean z) {
        this.shouldShowBanner = z;
    }

    public final void setTotalRatingsReviews(String str) {
        this.totalRatingsReviews = str;
    }
}
