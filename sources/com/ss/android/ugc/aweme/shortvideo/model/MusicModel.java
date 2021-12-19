package com.ss.android.ugc.aweme.shortvideo.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.b.b.a;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.utils.fu;
import com.ss.android.ugc.aweme.utils.ip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MusicModel implements a, Serializable, Cloneable {
    private static final long serialVersionUID = -8201137807648519242L;
    private String album;
    private String allRate;
    private int auditionDuration;
    private MusicBeat beatInfo;
    private int billboardRank;
    private String bindChallengeId;
    private String categoryID;
    private int challengeUserCount;
    private CollectionType collectionType;
    private int comeFromForMod;
    public int dataType;
    boolean dmvAutoShow;
    private int duration;
    private String extra;
    private long id;
    private boolean isArtist;
    private boolean isChallengeMusic;
    boolean isCommerceMusic;
    private boolean isMvThemeMusic;
    private boolean isOriginal;
    boolean isOriginalSound;
    private boolean isPgc;
    private long localMusicDuration;
    int localMusicId;
    private String localPath;
    private LogPbBean logPb;
    private int lrcType;
    private String lrcUrl;
    private String lyricShort;
    private List<Position> lyricShortPosition;
    private d mDynamicPatch;
    private fu mExtraParamFromPretreatment;
    private MatchedSoundInfo mMatchedSongInfo;
    private int mSoundsListType;
    private MatchedPGCSoundInfo matchedPGCSoundInfo;
    private Music music;
    private String musicEffectsUrl;
    private String musicId;
    private int musicStatus;
    MusicType musicType;
    private MusicWaveBean musicWaveBean;
    private boolean muteShare;
    private String name;
    private boolean needSetCookie;
    private String offlineDesc;
    private String picBig;
    private String picHuge;
    private String picPremium;
    private String picSmall;
    private UrlModel playUrl;
    private boolean preventDownload;
    private float previewStartTime;
    private String searchId;
    private String searchKeyWords;
    private int shootDuration;
    private boolean showDetail;
    private String singer;
    private String songId;
    private int sourcePlatform;
    private UrlModel strongBeatUrl;
    private int userCount;
    private int videoDuration;

    static {
        Covode.recordClassIndex(84462);
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAllRate() {
        return this.allRate;
    }

    public MusicBeat getBeatInfo() {
        return this.beatInfo;
    }

    public int getBillboardRank() {
        return this.billboardRank;
    }

    public String getBindChallengeId() {
        return this.bindChallengeId;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public int getChallengeUserCount() {
        return this.challengeUserCount;
    }

    public int getComeFromForMod() {
        return this.comeFromForMod;
    }

    public int getDataType() {
        return this.dataType;
    }

    public boolean getDmvAutoShow() {
        return this.dmvAutoShow;
    }

    public int getDuration() {
        return this.duration;
    }

    public d getDynamicPatch() {
        return this.mDynamicPatch;
    }

    public String getExtra() {
        return this.extra;
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

    public String getLocalPath() {
        return this.localPath;
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

    public String getLyricShort() {
        return this.lyricShort;
    }

    public List<Position> getLyricShortPosition() {
        return this.lyricShortPosition;
    }

    public MatchedPGCSoundInfo getMatchedPGCSoundInfo() {
        return this.matchedPGCSoundInfo;
    }

    public MatchedSoundInfo getMatchedSongInfo() {
        return this.mMatchedSongInfo;
    }

    public Music getMusic() {
        return this.music;
    }

    public String getMusicEffects() {
        return this.musicEffectsUrl;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public MusicType getMusicType() {
        return this.musicType;
    }

    public MusicWaveBean getMusicWaveBean() {
        return this.musicWaveBean;
    }

    public String getName() {
        return this.name;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPicBig() {
        return this.picBig;
    }

    public String getPicHuge() {
        return this.picHuge;
    }

    public String getPicPremium() {
        return this.picPremium;
    }

    public String getPicSmall() {
        return this.picSmall;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public String getSearchKeyWords() {
        return this.searchKeyWords;
    }

    public String getSinger() {
        return this.singer;
    }

    public String getSongId() {
        return this.songId;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public UrlModel getUrl() {
        return this.playUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isArtist() {
        return this.isArtist;
    }

    public boolean isChallengeMusic() {
        return this.isChallengeMusic;
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

    public boolean isOriginal() {
        return this.isOriginal;
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

    public Integer getAuditionDuration() {
        return Integer.valueOf(this.auditionDuration);
    }

    public Integer getShootDuration() {
        return Integer.valueOf(this.shootDuration);
    }

    @Override // java.lang.Object
    public MusicModel clone() {
        try {
            return (MusicModel) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public fu getExtraParamFromPretreatment() {
        if (this.mExtraParamFromPretreatment == null) {
            this.mExtraParamFromPretreatment = new fu();
        }
        return this.mExtraParamFromPretreatment;
    }

    public int getRealAuditionDuration() {
        int i2 = this.auditionDuration;
        if (i2 > 0) {
            return i2;
        }
        return getPresenterDuration();
    }

    public String getUri() {
        UrlModel urlModel = this.playUrl;
        if (urlModel == null) {
            return "";
        }
        return urlModel.getUri();
    }

    public CollectionType getCollectionType() {
        Music music2 = this.music;
        if (music2 == null) {
            return this.collectionType;
        }
        if (music2.getCollectStatus() != 1) {
            return CollectionType.NOT_COLLECTED;
        }
        return CollectionType.COLLECTED;
    }

    public int getPresenterDuration() {
        if (this.musicType == MusicType.LOCAL) {
            return (int) this.localMusicDuration;
        }
        int i2 = this.shootDuration;
        if (i2 > 0) {
            return i2;
        }
        return this.duration;
    }

    public boolean isPlayUrlValid() {
        UrlModel urlModel = this.playUrl;
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getUri()) && !ip.a(this.playUrl.getUrlList())) {
            return true;
        }
        return false;
    }

    public enum CollectionType {
        NOT_COLLECTED,
        COLLECTED;

        static {
            Covode.recordClassIndex(84463);
        }
    }

    public enum MusicType {
        LOCAL,
        ONLINE;

        static {
            Covode.recordClassIndex(84464);
        }
    }

    public Music convertToMusic() {
        int i2;
        Music music2 = new Music();
        music2.setMid(this.musicId);
        music2.setId(this.id);
        if (this.collectionType == CollectionType.COLLECTED) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        music2.setCollectStatus(i2);
        music2.setAlbum(this.album);
        music2.setAuthorName(this.singer);
        if (getMusic() != null) {
            music2.setChallenge(getMusic().getChallenge());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.picBig);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        urlModel.setUri(Uri.decode(this.picBig));
        music2.setCoverLarge(urlModel);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.picPremium);
        UrlModel urlModel2 = new UrlModel();
        urlModel2.setUrlList(arrayList2);
        urlModel2.setUri(Uri.decode(this.picPremium));
        music2.setCoverMedium(urlModel2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.picSmall);
        UrlModel urlModel3 = new UrlModel();
        urlModel3.setUrlList(arrayList3);
        urlModel3.setUri(Uri.decode(this.picSmall));
        music2.setCoverThumb(urlModel3);
        music2.setDuration(this.duration);
        music2.setShootDuration(Integer.valueOf(this.shootDuration));
        music2.setAuditionDuration(Integer.valueOf(this.auditionDuration));
        music2.setMusicName(this.name);
        music2.setUserCount(this.userCount);
        music2.setBillboardRank(this.billboardRank);
        music2.setCommercialMusic(this.isCommerceMusic);
        music2.setOriginalSound(this.isOriginalSound);
        if (this.musicType == MusicType.ONLINE) {
            music2.setPlayUrl(this.playUrl);
        }
        music2.setOfflineDesc(this.offlineDesc);
        music2.setMusicStatus(this.musicStatus);
        music2.setStrongBeatUrl(this.strongBeatUrl);
        music2.setLrcType(this.lrcType);
        music2.setPreviewStartTime(this.previewStartTime);
        music2.setLrcUrl(this.lrcUrl);
        music2.setPreventDownload(isPreventDownload());
        music2.setLyricShort(this.lyricShort);
        music2.setLyricShortPosition(this.lyricShortPosition);
        music2.setNeedSetCookie(isNeedSetCookie());
        music2.setVideoDuration(this.videoDuration);
        music2.setPgc(this.isPgc);
        music2.setBeatInfo(this.beatInfo);
        music2.setSoundsListType(this.mSoundsListType);
        music2.setLocalMusicId(this.localMusicId);
        music2.setMuteShare(this.muteShare);
        return music2;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAllRate(String str) {
        this.allRate = str;
    }

    public void setArtist(boolean z) {
        this.isArtist = z;
    }

    public void setBeatInfo(MusicBeat musicBeat) {
        this.beatInfo = musicBeat;
    }

    public void setBillboardRank(int i2) {
        this.billboardRank = i2;
    }

    public void setBindChallengeId(String str) {
        this.bindChallengeId = str;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setChallengeMusic(boolean z) {
        this.isChallengeMusic = z;
    }

    public void setChallengeUserCount(int i2) {
        this.challengeUserCount = i2;
    }

    public void setComeFromForMod(int i2) {
        this.comeFromForMod = i2;
    }

    public void setCommerceMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setDataType(int i2) {
        this.dataType = i2;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i2) {
        this.duration = i2;
    }

    public void setDynamicPatch(d dVar) {
        this.mDynamicPatch = dVar;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(fu fuVar) {
        this.mExtraParamFromPretreatment = fuVar;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setLocalMusicDuration(long j2) {
        this.localMusicDuration = j2;
    }

    public void setLocalMusicId(int i2) {
        this.localMusicId = i2;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
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

    public void setLyricShort(String str) {
        this.lyricShort = str;
    }

    public void setLyricShortPosition(List<Position> list) {
        this.lyricShortPosition = list;
    }

    public void setMatchedPGCSoundInfo(MatchedPGCSoundInfo matchedPGCSoundInfo2) {
        this.matchedPGCSoundInfo = matchedPGCSoundInfo2;
    }

    public void setMatchedSoundInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public MusicModel setMusicEffects(String str) {
        this.musicEffectsUrl = str;
        return this;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicStatus(int i2) {
        this.musicStatus = i2;
    }

    public void setMusicType(MusicType musicType2) {
        this.musicType = musicType2;
    }

    public void setMusicWaveBean(MusicWaveBean musicWaveBean2) {
        this.musicWaveBean = musicWaveBean2;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.isMvThemeMusic = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPicBig(String str) {
        this.picBig = str;
    }

    public void setPicHuge(String str) {
        this.picHuge = str;
    }

    public void setPicPremium(String str) {
        this.picPremium = str;
    }

    public void setPicSmall(String str) {
        this.picSmall = str;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f2) {
        this.previewStartTime = f2;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public void setSearchKeyWords(String str) {
        this.searchKeyWords = str;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public void setSongId(String str) {
        this.songId = str;
    }

    public void setSoundsListType(int i2) {
        this.mSoundsListType = i2;
    }

    public void setSourcePlatform(int i2) {
        this.sourcePlatform = i2;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setUserCount(int i2) {
        this.userCount = i2;
    }

    public void setVideoDuration(int i2) {
        this.videoDuration = i2;
    }

    public void setAuditionDuration(Integer num) {
        this.auditionDuration = num.intValue();
    }

    public void setShootDuration(Integer num) {
        this.shootDuration = num.intValue();
    }

    public void setCollectionType(CollectionType collectionType2) {
        int i2;
        this.collectionType = collectionType2;
        Music music2 = this.music;
        if (music2 != null) {
            if (collectionType2 == CollectionType.NOT_COLLECTED) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            music2.setCollectStatus(i2);
        }
    }
}
