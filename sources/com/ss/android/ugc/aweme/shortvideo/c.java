package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.g;
import java.io.Serializable;

public class c implements g, Serializable, Cloneable {
    @com.google.gson.a.c(a = "album")
    public String album;
    @com.google.gson.a.c(a = "audition_duration")
    public int auditionDuration;
    @com.google.gson.a.c(a = "author")
    public String authorName;
    @com.google.gson.a.c(a = "category_id")
    private String categoryID;
    @com.google.gson.a.c(a = "challenge")
    public AVChallenge challenge;
    private boolean collected;
    @com.google.gson.a.c(a = "come_from_for_mod")
    private int comeFromForMod;
    @com.google.gson.a.c(a = "cover_large")
    public UrlModel coverLarge;
    @com.google.gson.a.c(a = "cover_medium")
    public UrlModel coverMedium;
    @com.google.gson.a.c(a = "cover_thumb")
    public UrlModel coverThumb;
    @com.google.gson.a.c(a = "dmv_auto_show")
    boolean dmvAutoShow;
    @com.google.gson.a.c(a = "duration")
    public int duration;
    @com.google.gson.a.c(a = "extra")
    public String extra;
    @com.google.gson.a.c(a = "id")
    public long id;
    @com.google.gson.a.c(a = "is_commerce_music")
    boolean isCommerceMusic;
    @com.google.gson.a.c(a = "is_mv_theme_music")
    private boolean isMvThemeMusic;
    @com.google.gson.a.c(a = "is_original_sound")
    boolean isOriginalSound;
    @com.google.gson.a.c(a = "is_pgc")
    private boolean isPgc;
    @com.google.gson.a.c(a = "localmusic_duration")
    private long localMusicDuration;
    @com.google.gson.a.c(a = "local_music_id")
    private int localMusicId;
    @com.google.gson.a.c(a = "log_pb")
    private LogPbBean logPb;
    @com.google.gson.a.c(a = "lyric_type")
    private int lrcType;
    @com.google.gson.a.c(a = "lyric_url")
    private String lrcUrl;
    @com.google.gson.a.c(a = "beat_info")
    private MusicBeat musicBeat;
    @com.google.gson.a.c(a = "title")
    public String musicName;
    @com.google.gson.a.c(a = "music_priority")
    private int musicPriority;
    @com.google.gson.a.c(a = "status")
    public int musicStatus;
    @com.google.gson.a.c(a = "music_type")
    public int musicType;
    @com.google.gson.a.c(a = "music_wave_data")
    private float[] musicWaveData;
    @com.google.gson.a.c(a = "mute_share")
    private boolean muteShare;
    private boolean needSetCookie;
    @com.google.gson.a.c(a = "offline_desc")
    public String offlineDesc;
    @com.google.gson.a.c(a = "path")
    public String path;
    @com.google.gson.a.c(a = "play_url")
    public UrlModel playUrl;
    @com.google.gson.a.c(a = "prevent_download")
    private boolean preventDownload;
    @com.google.gson.a.c(a = "preview_start_time")
    private float previewStartTime;
    @com.google.gson.a.c(a = "search_key_words")
    private String searchKeyWords;
    @com.google.gson.a.c(a = "shoot_duration")
    public int shootDuration;
    @com.google.gson.a.c(a = "song_id")
    private String songId;
    @com.google.gson.a.c(a = "stick_point_music_alg")
    private ea stickPointMusicAlg = new ea();
    @com.google.gson.a.c(a = "strong_beat_url")
    public UrlModel strongBeatUrl;
    @com.google.gson.a.c(a = "user_count")
    public int userCount;
    @com.google.gson.a.c(a = "video_duration")
    private int videoDuration;

    static {
        Covode.recordClassIndex(82162);
    }

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getId() {
        return this.id;
    }

    public long getLocalMusicDuration() {
        return this.localMusicDuration;
    }

    public int getLocalMusicId() {
        return this.localMusicId;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getLrcType() {
        return this.lrcType;
    }

    public String getLrcUrl() {
        return this.lrcUrl;
    }

    public MusicBeat getMusicBeat() {
        return this.musicBeat;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.musicPriority;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.musicWaveData;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.songId;
    }

    public ea getStickPointMusicAlg() {
        return this.stickPointMusicAlg;
    }

    @Override // com.ss.android.ugc.aweme.sticker.g
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isCollected() {
        return this.collected;
    }

    public boolean isCommerceMusic() {
        return this.isCommerceMusic;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isMvThemeMusic() {
        return this.isMvThemeMusic;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public boolean isPgc() {
        return this.isPgc;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public String getMid() {
        return String.valueOf(this.id);
    }

    @Override // com.ss.android.ugc.aweme.sticker.g
    public String getMusicId() {
        return String.valueOf(this.id);
    }

    public int getPresenterDuration() {
        int i2 = this.shootDuration;
        if (i2 > 0) {
            return i2;
        }
        return this.duration;
    }

    @Override // java.lang.Object
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int getRealAuditionDuration() {
        int i2 = this.auditionDuration;
        if (i2 > 0) {
            return i2;
        }
        return getPresenterDuration();
    }

    public boolean isLocalMusic() {
        if (this.musicType == MusicModel.MusicType.LOCAL.ordinal()) {
            return true;
        }
        return false;
    }

    public String getPicBig() {
        UrlModel urlModel = this.coverLarge;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverLarge.getUrlList().get(0);
    }

    public String getPicMedium() {
        UrlModel urlModel = this.coverMedium;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverMedium.getUrlList().get(0);
    }

    public String getPicSmall() {
        UrlModel urlModel = this.coverThumb;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverThumb.getUrlList().get(0);
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setCollected(boolean z) {
        this.collected = z;
    }

    public void setComeFromForMod(int i2) {
        this.comeFromForMod = i2;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setLocalMusicDuration(long j2) {
        this.localMusicDuration = j2;
    }

    public void setLocalMusicId(int i2) {
        this.localMusicId = i2;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLrcType(int i2) {
        this.lrcType = i2;
    }

    public void setLrcUrl(String str) {
        this.lrcUrl = str;
    }

    public void setMusicBeat(MusicBeat musicBeat2) {
        this.musicBeat = musicBeat2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.g
    public void setMusicPriority(int i2) {
        this.musicPriority = i2;
    }

    public void setMusicWaveData(float[] fArr) {
        this.musicWaveData = fArr;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f2) {
        this.previewStartTime = f2;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setStickPointMusicAlg(ea eaVar) {
        this.stickPointMusicAlg = eaVar;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setVideoDuration(int i2) {
        this.videoDuration = i2;
    }

    public void setMusicId(String str) {
        try {
            this.id = Long.parseLong(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
