package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class RelatedMediaSourceStruct implements Serializable {
    @c(a = "button")
    private MediaSourceButtonStruct button;
    @c(a = "classification")
    private List<String> classification;
    @c(a = "compass_id")
    private String compassId;
    @c(a = "cover")
    private UrlModel cover = new UrlModel();
    @c(a = "duration")
    private Integer duration = 0;
    @c(a = "seqs_count")
    private int epCount;
    @c(a = "episode_info")
    private MovieSource episodeInfo;
    @c(a = "media_name")
    private String mediaName = "";
    @c(a = "media_tag")
    private String mediaTag = "";
    @c(a = "media_type")
    private int mediaType = 1;
    @c(a = "movie_info")
    private Movie movieInfo;
    @c(a = "rating")
    private Float rating = Float.valueOf(0.0f);
    @c(a = "rating_status")
    private Integer ratingStatus = 0;
    @c(a = "read_more")
    private String readMore = "";
    @c(a = "read_more_url")
    private String readMoreUrl = "";
    @c(a = "release_date")
    private String releaseData = "";
    @c(a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(50920);
    }

    public final MediaSourceButtonStruct getButton() {
        return this.button;
    }

    public final List<String> getClassification() {
        return this.classification;
    }

    public final String getCompassId() {
        return this.compassId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final int getEpCount() {
        return this.epCount;
    }

    public final MovieSource getEpisodeInfo() {
        return this.episodeInfo;
    }

    public final String getMediaName() {
        return this.mediaName;
    }

    public final String getMediaTag() {
        return this.mediaTag;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Movie getMovieInfo() {
        return this.movieInfo;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getReadMore() {
        return this.readMore;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public final String getReleaseData() {
        return this.releaseData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isMovie() {
        if (this.mediaType == 3) {
            return true;
        }
        return false;
    }

    public final String getContentType() {
        String a2;
        List<String> list = this.classification;
        if (list == null || (a2 = n.a(list, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)) == null) {
            return "";
        }
        return a2;
    }

    public final void setButton(MediaSourceButtonStruct mediaSourceButtonStruct) {
        this.button = mediaSourceButtonStruct;
    }

    public final void setClassification(List<String> list) {
        this.classification = list;
    }

    public final void setCompassId(String str) {
        this.compassId = str;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEpCount(int i2) {
        this.epCount = i2;
    }

    public final void setEpisodeInfo(MovieSource movieSource) {
        this.episodeInfo = movieSource;
    }

    public final void setMediaType(int i2) {
        this.mediaType = i2;
    }

    public final void setMovieInfo(Movie movie) {
        this.movieInfo = movie;
    }

    public final void setRating(Float f2) {
        this.rating = f2;
    }

    public final void setRatingStatus(Integer num) {
        this.ratingStatus = num;
    }

    public final void setReleaseData(String str) {
        this.releaseData = str;
    }

    public final void setCover(UrlModel urlModel) {
        l.d(urlModel, "");
        this.cover = urlModel;
    }

    public final void setMediaName(String str) {
        l.d(str, "");
        this.mediaName = str;
    }

    public final void setMediaTag(String str) {
        l.d(str, "");
        this.mediaTag = str;
    }

    public final void setReadMore(String str) {
        l.d(str, "");
        this.readMore = str;
    }

    public final void setReadMoreUrl(String str) {
        l.d(str, "");
        this.readMoreUrl = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }
}
