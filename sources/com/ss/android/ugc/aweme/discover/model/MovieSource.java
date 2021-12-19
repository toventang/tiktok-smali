package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class MovieSource implements Serializable {
    @c(a = "album_group_id")
    private String agid;
    @c(a = "album_id")
    private String albumId;
    @c(a = "cid")
    private String cid;
    @c(a = "cover")
    private UrlModel cover;
    @c(a = "desc")
    private String desc;
    @c(a = "duration")
    private double duration;
    @c(a = "episode_list")
    private List<EpisodeData> episodesList;
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "latest_seqs_count")
    private int latestSeqsCount;
    @c(a = "movie_module")
    private MovieModule movieModule;
    @c(a = "mp_icon")
    private String mpIcon;
    @c(a = "mp_id")
    private int mpId;
    @c(a = "mp_name")
    private String mpName;
    @c(a = "payment_status")
    private int paymentStatus;
    @c(a = "play_word")
    private String playWord;
    @c(a = "lvideo_tag")
    private LongVideoTag posterTag;
    @c(a = "lvideo_tag_light")
    private LongVideoTag posterTagLight;
    @c(a = "poster_tag_type")
    private int posterTagType;
    @c(a = "release_date")
    private long releaseDate = -1;
    @c(a = "schema")
    private String schema;
    @c(a = "schema_type")
    private int schemaType;
    @c(a = "current_count")
    private int seqsCount;
    @c(a = "status")
    private int status = -1;
    @c(a = "tags")
    private List<String> tags;
    @c(a = "title")
    private String title;
    @c(a = "seqs_count")
    private int totalSeqsCount;

    static {
        Covode.recordClassIndex(50916);
    }

    public final String getAgid() {
        return this.agid;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final List<EpisodeData> getEpisodesList() {
        return this.episodesList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getLatestSeqsCount() {
        return this.latestSeqsCount;
    }

    public final MovieModule getMovieModule() {
        return this.movieModule;
    }

    public final String getMpIcon() {
        return this.mpIcon;
    }

    public final int getMpId() {
        return this.mpId;
    }

    public final String getMpName() {
        return this.mpName;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlayWord() {
        return this.playWord;
    }

    public final LongVideoTag getPosterTag() {
        return this.posterTag;
    }

    public final LongVideoTag getPosterTagLight() {
        return this.posterTagLight;
    }

    public final int getPosterTagType() {
        return this.posterTagType;
    }

    public final long getReleaseDate() {
        return this.releaseDate;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final int getSeqsCount() {
        return this.seqsCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalSeqsCount() {
        return this.totalSeqsCount;
    }

    public final EpisodeData getFirstEpisodeData() {
        List<EpisodeData> list = this.episodesList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<EpisodeData> list2 = this.episodesList;
        if (list2 == null) {
            l.b();
        }
        return list2.get(0);
    }

    public final String toString() {
        return "MovieSource(albumId=" + this.albumId + ", latestSeqsCount=" + this.latestSeqsCount + ", seqsCount=" + this.seqsCount + ", totalSeqsCount=" + this.totalSeqsCount + ", title=" + this.title + ", desc=" + this.desc + ", cover=" + this.cover + ", duration=" + this.duration + ", mpId=" + this.mpId + ", mpIcon=" + this.mpIcon + ", paymentStatus=" + this.paymentStatus + ", releaseDate=" + this.releaseDate + ", tags=" + this.tags + ", episodesList=" + this.episodesList + ", playWord=" + this.playWord + ", status=" + this.status + ", hasMore=" + this.hasMore + ", mpName=" + this.mpName + ", schema=" + this.schema + ", cid=" + this.cid + ", agid=" + this.agid + ", movieModule=" + this.movieModule + ", schemaType=" + this.schemaType + ", posterTag=$, posterTagType=" + this.posterTagType + ')';
    }

    public final void setAgid(String str) {
        this.agid = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(double d2) {
        this.duration = d2;
    }

    public final void setEpisodesList(List<EpisodeData> list) {
        this.episodesList = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLatestSeqsCount(int i2) {
        this.latestSeqsCount = i2;
    }

    public final void setMovieModule(MovieModule movieModule2) {
        this.movieModule = movieModule2;
    }

    public final void setMpIcon(String str) {
        this.mpIcon = str;
    }

    public final void setMpId(int i2) {
        this.mpId = i2;
    }

    public final void setMpName(String str) {
        this.mpName = str;
    }

    public final void setPaymentStatus(int i2) {
        this.paymentStatus = i2;
    }

    public final void setPlayWord(String str) {
        this.playWord = str;
    }

    public final void setPosterTag(LongVideoTag longVideoTag) {
        this.posterTag = longVideoTag;
    }

    public final void setPosterTagLight(LongVideoTag longVideoTag) {
        this.posterTagLight = longVideoTag;
    }

    public final void setPosterTagType(int i2) {
        this.posterTagType = i2;
    }

    public final void setReleaseDate(long j2) {
        this.releaseDate = j2;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSchemaType(int i2) {
        this.schemaType = i2;
    }

    public final void setSeqsCount(int i2) {
        this.seqsCount = i2;
    }

    public final void setStatus(int i2) {
        this.status = i2;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotalSeqsCount(int i2) {
        this.totalSeqsCount = i2;
    }
}
