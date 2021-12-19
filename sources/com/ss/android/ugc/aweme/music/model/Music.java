package com.ss.android.ugc.aweme.music.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.fu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Music implements Serializable {
    @c(a = "album")
    public String album;
    @c(a = "audition_duration")
    public int auditionDuration;
    @c(a = "author")
    public String authorName;
    @c(a = "avatar_thumb")
    public UrlModel avatarThumb;
    @c(a = "beat_info")
    public MusicBeat beatInfo;
    @c(a = "billboard_rank")
    public int billboardRank;
    @c(a = "binded_challenge_id")
    public String bindChallengeId;
    @c(a = "challenge")
    public Challenge challenge;
    @c(a = "challenge_name")
    public String challengeName;
    @c(a = "collect_stat")
    public int collectStatus;
    @c(a = "cover_large")
    public UrlModel coverLarge;
    @c(a = "cover_medium")
    public UrlModel coverMedium;
    @c(a = "cover_thumb")
    public UrlModel coverThumb;
    @c(a = "dmv_auto_show")
    public boolean dmvAutoShow;
    @c(a = "duration")
    public int duration;
    @c(a = "effects_data")
    public UrlModel effectsData;
    @c(a = "external_song_subtitle")
    public String exclusiveSubTitle;
    @c(a = "extra")
    public String extra;
    @c(a = "id")
    public long id;
    @c(a = "id_str")
    public String idStr;
    @c(a = "is_author_artist")
    public boolean isArtistMusic;
    @c(a = "author_deleted")
    public boolean isAuthorDeleted;
    @c(a = "is_commerce_music")
    public boolean isCommercialMusic;
    @c(a = "is_matched_metadata")
    public boolean isMatchMetadata;
    @c(a = "is_original")
    public boolean isOriginMusic;
    @c(a = "is_original_sound")
    public boolean isOriginalSound;
    @c(a = "is_pgc")
    public boolean isPgc;
    @c(a = "local_music_id")
    public int localMusicId;
    @c(a = "lyric_type")
    public int lrcType;
    @c(a = "lyric_url")
    public String lrcUrl;
    @c(a = "lyric_short")
    public String lyricShort;
    @c(a = "lyric_short_position")
    public List<Position> lyricShortPosition;
    @c(a = "external_song_info")
    public List<ExternalMusicInfo> mExternalMusicInfos;
    public fu mExtraParamFromPretreatment;
    @c(a = "search_highlight")
    public List<d> mHighlightInfoList;
    @c(a = "matched_song")
    public MatchedSoundInfo mMatchedSongInfo;
    @c(a = "artists")
    public List<MusicOwnerInfo> mMusicOwnerInfos;
    @c(a = "owner_ban_show_info")
    public String mOwnerBanShowInfo;
    @c(a = "search_music_desc")
    public String mSearchMusicDesc;
    @c(a = "search_music_name")
    public String mSearchMusicName;
    public int mSoundsListType;
    @c(a = "matched_pgc_sound")
    public MatchedPGCSoundInfo matchedPGCSoundInfo;
    @c(a = "title")
    public String musicName;
    @c(a = "status")
    public int musicStatus;
    @c(a = "tag_list")
    public List<MusicTag> musicTags;
    @c(a = "mute_share")
    public boolean muteShare;
    @c(a = "is_audio_url_with_cookie")
    public boolean needSetCookie;
    @c(a = "offline_desc")
    public String offlineDesc;
    @c(a = "owner_handle")
    public String ownerHandle;
    @c(a = "owner_id")
    public String ownerId;
    @c(a = "owner_nickname")
    public String ownerNickName;
    public String path;
    @c(a = "play_url")
    public UrlModel playUrl;
    @c(a = "position")
    public List<Position> positions;
    @c(a = "prevent_download")
    public boolean preventDownload;
    @c(a = "preview_start_time")
    public float previewStartTime;
    @c(a = "related_musics")
    public List<Music> relatedMusics = new ArrayList();
    public String requestId;
    @c(a = "sec_uid")
    public String secUid;
    @c(a = "share_info")
    public ShareInfo shareInfo;
    @c(a = "shoot_duration")
    public int shootDuration;
    @c(a = "strong_beat_url")
    public UrlModel strongBeatUrl;
    @c(a = "user_count")
    public int userCount;
    @c(a = "video_duration")
    public int videoDuration;

    static {
        Covode.recordClassIndex(71663);
    }

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
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

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public UrlModel getCoverLarge() {
        return this.coverLarge;
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

    public UrlModel getEffectsData() {
        return this.effectsData;
    }

    public String getExclusiveSubTitle() {
        return this.exclusiveSubTitle;
    }

    public List<ExternalMusicInfo> getExternalMusicInfos() {
        return this.mExternalMusicInfos;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<d> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getLocalMusicId() {
        return this.localMusicId;
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

    public String getMusicName() {
        return this.musicName;
    }

    public List<MusicOwnerInfo> getMusicOwnerInfos() {
        return this.mMusicOwnerInfos;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public List<MusicTag> getMusicTags() {
        return this.musicTags;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getOwnerBanShowInfo() {
        return this.mOwnerBanShowInfo;
    }

    public String getOwnerHandle() {
        return this.ownerHandle;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerNickName() {
        return this.ownerNickName;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public List<Position> getPositions() {
        return this.positions;
    }

    public float getPreviewStartTime() {
        return this.previewStartTime;
    }

    public List<Music> getRelatedMusics() {
        return this.relatedMusics;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSearchMusicDesc() {
        return this.mSearchMusicDesc;
    }

    public String getSearchMusicName() {
        return this.mSearchMusicName;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public int getSoundsListType() {
        return this.mSoundsListType;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public boolean isArtistMusic() {
        return this.isArtistMusic;
    }

    public boolean isAuthorDeleted() {
        return this.isAuthorDeleted;
    }

    public boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public boolean isMatchMetadata() {
        return this.isMatchMetadata;
    }

    public boolean isMuteShare() {
        return this.muteShare;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public boolean isOriginMusic() {
        return this.isOriginMusic;
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

    public int getPresenterDuration() {
        int i2 = this.shootDuration;
        if (i2 > 0) {
            return i2;
        }
        return this.duration;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
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

    public int hashCode() {
        if (getMid() != null) {
            return getMid().hashCode();
        }
        return 0;
    }

    public MusicModel convertToMusicModel() {
        String str;
        MusicModel musicModel = new MusicModel();
        musicModel.setMusic(this);
        if (!(getCoverMedium() == null || getCoverMedium().getUrlList() == null || getCoverMedium().getUrlList().size() <= 0)) {
            musicModel.setPicPremium(getCoverMedium().getUrlList().get(0));
        }
        if (!(getCoverThumb() == null || getCoverThumb().getUrlList() == null || getCoverThumb().getUrlList().size() <= 0)) {
            musicModel.setPicSmall(getCoverThumb().getUrlList().get(0));
        }
        if (!(getCoverLarge() == null || getCoverLarge().getUrlList() == null || getCoverLarge().getUrlList().size() <= 0)) {
            musicModel.setPicBig(getCoverLarge().getUrlList().get(0));
        }
        if (getCollectStatus() == 1) {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        }
        MusicModel.MusicType musicType = MusicModel.MusicType.ONLINE;
        musicModel.setSinger(getAuthorName());
        if (musicType == MusicModel.MusicType.ONLINE) {
            musicModel.setUrl(getPlayUrl());
        } else if (getExtra() != null) {
            String extra2 = getExtra();
            musicModel.setExtra(extra2);
            try {
                str = new JSONObject(extra2).getJSONObject("meta").getString("song_id");
                if (str == null) {
                    str = "1";
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                str = "12345";
            }
            musicModel.setLocalPath(str);
        } else {
            musicModel.setLocalPath(getPath());
        }
        musicModel.setMusicType(musicType);
        musicModel.setName(getMusicName());
        musicModel.setMusicId(getMid());
        musicModel.setDuration(getDuration() * 1000);
        musicModel.setShootDuration(Integer.valueOf(getShootDuration() * 1000));
        musicModel.setAuditionDuration(Integer.valueOf(getAuditionDuration() * 1000));
        musicModel.setOfflineDesc(getOfflineDesc());
        musicModel.setMusicStatus(getMusicStatus());
        musicModel.setUserCount(this.userCount);
        musicModel.setOriginal(isOriginMusic());
        musicModel.setArtist(isArtistMusic());
        musicModel.setBillboardRank(getBillboardRank());
        musicModel.setId(getId());
        musicModel.setLrcUrl(this.lrcUrl);
        musicModel.setLrcType(this.lrcType);
        musicModel.setPreviewStartTime(this.previewStartTime);
        musicModel.setCommerceMusic(this.isCommercialMusic);
        musicModel.setOriginalSound(this.isOriginalSound);
        musicModel.setLyricShort(this.lyricShort);
        musicModel.setLyricShortPosition(this.lyricShortPosition);
        if (!(getEffectsData() == null || getEffectsData().getUrlList() == null || getEffectsData().getUrlList().isEmpty())) {
            musicModel.setMusicEffects(getEffectsData().getUrlList().get(0));
        }
        musicModel.setStrongBeatUrl(this.strongBeatUrl);
        musicModel.setPreventDownload(isPreventDownload());
        musicModel.setDmvAutoShow(this.dmvAutoShow);
        musicModel.setNeedSetCookie(isNeedSetCookie());
        musicModel.setBindChallengeId(this.bindChallengeId);
        musicModel.setMatchedPGCSoundInfo(this.matchedPGCSoundInfo);
        musicModel.setVideoDuration(this.videoDuration);
        musicModel.setPgc(this.isPgc);
        musicModel.setBeatInfo(this.beatInfo);
        musicModel.setMatchedSoundInfo(this.mMatchedSongInfo);
        musicModel.setExtraParamFromPretreatment(this.mExtraParamFromPretreatment);
        musicModel.setSoundsListType(this.mSoundsListType);
        musicModel.setLocalMusicId(this.localMusicId);
        musicModel.setMuteShare(this.muteShare);
        return musicModel;
    }

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setArtistMusic(boolean z) {
        this.isArtistMusic = z;
    }

    public void setAuthorDeleted(boolean z) {
        this.isAuthorDeleted = z;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
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

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCollectStatus(int i2) {
        this.collectStatus = i2;
    }

    public void setCommercialMusic(boolean z) {
        this.isCommercialMusic = z;
    }

    public void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setDmvAutoShow(boolean z) {
        this.dmvAutoShow = z;
    }

    public void setDuration(int i2) {
        this.duration = i2;
    }

    public Music setEffectsData(UrlModel urlModel) {
        this.effectsData = urlModel;
        return this;
    }

    public void setExclusiveSubTitle(String str) {
        this.exclusiveSubTitle = str;
    }

    public void setExternalMusicInfos(List<ExternalMusicInfo> list) {
        this.mExternalMusicInfos = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setExtraParamFromPretreatment(fu fuVar) {
        this.mExtraParamFromPretreatment = fuVar;
    }

    public void setHighlightInfoList(List<d> list) {
        this.mHighlightInfoList = list;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLocalMusicId(int i2) {
        this.localMusicId = i2;
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

    public void setMatchMetadata(boolean z) {
        this.isMatchMetadata = z;
    }

    public void setMatchedSongInfo(MatchedSoundInfo matchedSoundInfo) {
        this.mMatchedSongInfo = matchedSoundInfo;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setMusicOwnerInfos(List<MusicOwnerInfo> list) {
        this.mMusicOwnerInfos = list;
    }

    public void setMusicStatus(int i2) {
        this.musicStatus = i2;
    }

    public void setMusicTags(List<MusicTag> list) {
        this.musicTags = list;
    }

    public void setMuteShare(boolean z) {
        this.muteShare = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setOfflineDesc(String str) {
        this.offlineDesc = str;
    }

    public void setOriginMusic(boolean z) {
        this.isOriginMusic = z;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setOwnerHandle(String str) {
        this.ownerHandle = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPgc(boolean z) {
        this.isPgc = z;
    }

    public void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPreviewStartTime(float f2) {
        this.previewStartTime = f2;
    }

    public void setRelatedMusics(List<Music> list) {
        this.relatedMusics = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSearchMusicDesc(String str) {
        this.mSearchMusicDesc = str;
    }

    public void setSearchMusicName(String str) {
        this.mSearchMusicName = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setSoundsListType(int i2) {
        this.mSoundsListType = i2;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
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

    public void setMid(String str) {
        try {
            this.id = Long.parseLong(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        if (!TextUtils.equals(music.getMid(), getMid()) || music.getCollectStatus() != getCollectStatus()) {
            return false;
        }
        return true;
    }
}
