package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;
import h.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordConfig implements Serializable {
    public static final Companion Companion = new Companion(null);
    private a autoSelectedAnchor;
    private Boolean autoStartRecording;
    private String autoUseMusic;
    private String autoUseSticker;
    private Integer cameraFacing;
    private Challenge challenge;
    private String challengeId;
    private List<? extends Challenge> challenges;
    private String clientId;
    private CommentVideoConfig commentVideoConfig;
    private String commerceData;
    private String creationId;
    private Long decompressTime;
    private Integer defaultTab;
    private String donationId;
    private EffectConfig effectConfig;
    private Long effectDownloadDuration;
    private String enterFrom;
    private String enterMethod;
    private boolean enterTTEPPreviewPage;
    private Map<String, String> extraParams;
    private Effect firstSticker;
    private Boolean fromMain;
    private Boolean fromOtherPlatform;
    private Boolean fromSpecialPlus;
    private Boolean fromSystem;
    private String giphyGifIds;
    private String groupId;
    private String isFilterBusniessSticker;
    private Boolean isInterceptBackground;
    private Boolean keepChallenges;
    private LiveParams liveParams;
    private p<String, String> mentionUser;
    private MiniAppConfig miniAppConfig;
    private HashMap<String, String> missionConfig;
    private Long musicDownloadDuration;
    private String musicId;
    private MusicModel musicModel;
    private String musicOrigin;
    private String musicPath;
    private String musicSticker;
    private Integer musicType;
    private Effect musicWithStickerEffect;
    private Effect mvSticker;
    private String mvStickerId;
    private String openPlatformClientKey;
    private String openPlatformExtra;
    private Boolean permissionActivityRequired;
    private boolean prepareFilter;
    private Boolean presetSticker;
    private String previousPage;
    private QaStructConfig qaStructConfig;
    private RecordPresetResource recordPresetResource;
    private ReshootConfig reshootConfig;
    private int restoreType;
    private String shareId;
    private String sharedARHostId;
    private String sharedARSessionId;
    private ShootExtraData shootExtraData;
    private String shootFrom;
    private String shootway;
    private String shoutoutMode;
    private String shoutoutOrderID;
    private Boolean showCancelAfterPinProp;
    private Boolean showPreloadingDialog;
    private boolean showStickerPanel;
    private HashMap<String, String> starAtlasConfig;
    private Long startRecordTime;
    private String sticker;
    private Music stickerMusic;
    private String stickerWithMusicFilePath;
    private ArrayList<String> stickers;
    private StitchParams stitchParams;
    private Integer tabs;
    private Integer translationType;
    private Effect ttepPreviewEffect;
    private Long videoDownloadDuration;
    private Integer videoLength;

    static {
        Covode.recordClassIndex(79713);
    }

    public static /* synthetic */ void getRestoreType$annotations() {
    }

    public static class Builder {
        private RecordConfig config;

        static {
            Covode.recordClassIndex(79714);
        }

        public final RecordConfig build() {
            return this.config;
        }

        public Builder() {
            this.config = new RecordConfig(null);
        }

        public final Builder challenge(Challenge challenge) {
            this.config.setChallenge(challenge);
            return this;
        }

        public final Builder challengeId(String str) {
            this.config.setChallengeId(str);
            return this;
        }

        public final Builder clientId(String str) {
            this.config.setClientId(str);
            return this;
        }

        public final Builder commercialData(String str) {
            this.config.setCommerceData(str);
            return this;
        }

        public final Builder creationId(String str) {
            this.config.setCreationId(str);
            return this;
        }

        public final Builder donationId(String str) {
            this.config.setDonationId(str);
            return this;
        }

        public final Builder enterFrom(String str) {
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder enterMethod(String str) {
            this.config.setEnterMethod(str);
            return this;
        }

        public final Builder filterBuinessSticker(String str) {
            this.config.setFilterBusniessSticker(str);
            return this;
        }

        public final Builder fromSystem(Boolean bool) {
            this.config.setFromSystem(bool);
            return this;
        }

        public final Builder groupId(String str) {
            this.config.setGroupId(str);
            return this;
        }

        public final Builder liveParams(LiveParams liveParams) {
            this.config.setLiveParams(liveParams);
            return this;
        }

        public final Builder missionConfig(HashMap<String, String> hashMap) {
            this.config.setMissionConfig(hashMap);
            return this;
        }

        public final Builder musicId(String str) {
            this.config.setMusicId(str);
            return this;
        }

        public final Builder musicModel(MusicModel musicModel) {
            this.config.setMusicModel(musicModel);
            return this;
        }

        public final Builder musicWithSticker(Effect effect) {
            this.config.setMusicWithStickerEffect(effect);
            return this;
        }

        public final Builder mvStickerId(String str) {
            this.config.setMvStickerId(str);
            return this;
        }

        public final Builder prepareFilter(boolean z) {
            this.config.setPrepareFilter(z);
            return this;
        }

        public final Builder previousPage(String str) {
            this.config.setPreviousPage(str);
            return this;
        }

        public final Builder restoreType(int i2) {
            this.config.setRestoreType(i2);
            return this;
        }

        public final Builder setAutoSelectedAnchor(a aVar) {
            this.config.setAutoSelectedAnchor(aVar);
            return this;
        }

        public final Builder setEnterTTEPPreviewPage(boolean z) {
            this.config.setEnterTTEPPreviewPage(z);
            return this;
        }

        public final Builder setOpenPlatformClientKey(String str) {
            this.config.setOpenPlatformClientKey(str);
            return this;
        }

        public final Builder setOpenPlatformExtra(String str) {
            this.config.setOpenPlatformExtra(str);
            return this;
        }

        public final Builder shareId(String str) {
            this.config.setShareId(str);
            return this;
        }

        public final Builder sharedARHostId(String str) {
            this.config.setSharedARHostId(str);
            return this;
        }

        public final Builder sharedARSessionId(String str) {
            this.config.setSharedARSessionId(str);
            return this;
        }

        public final Builder shootFrom(String str) {
            this.config.setShootFrom(str);
            return this;
        }

        public final Builder shootWay(String str) {
            this.config.setShootway(str);
            return this;
        }

        public final Builder shoutoutMode(String str) {
            this.config.setShoutoutMode(str);
            return this;
        }

        public final Builder shoutoutOrderID(String str) {
            this.config.setShoutoutOrderID(str);
            return this;
        }

        public final Builder showStickerPanel(boolean z) {
            this.config.setShowStickerPanel(z);
            return this;
        }

        public final Builder starAtlasConfig(HashMap<String, String> hashMap) {
            this.config.setStarAtlasConfig(hashMap);
            return this;
        }

        public final Builder sticker(String str) {
            this.config.setSticker(str);
            return this;
        }

        public final Builder stickerMusic(Music music) {
            this.config.setStickerMusic(music);
            return this;
        }

        public final Builder stickerParams(Map<String, String> map) {
            this.config.setExtraParams(map);
            return this;
        }

        public final Builder stickerWithMusicFilePath(String str) {
            this.config.setStickerWithMusicFilePath(str);
            return this;
        }

        public final Builder usePresetSticker(Boolean bool) {
            this.config.setPresetSticker(bool);
            return this;
        }

        public final Builder CommentVideoConfig(CommentVideoConfig commentVideoConfig) {
            l.d(commentVideoConfig, "");
            this.config.setCommentVideoConfig(commentVideoConfig);
            return this;
        }

        public final Builder autoStartRecording(boolean z) {
            this.config.setAutoStartRecording(Boolean.valueOf(z));
            return this;
        }

        public final Builder autoUseMusic(String str) {
            l.d(str, "");
            this.config.setAutoUseMusic(str);
            return this;
        }

        public final Builder autoUseSticker(String str) {
            l.d(str, "");
            this.config.setAutoUseSticker(str);
            return this;
        }

        public final Builder cameraFacing(int i2) {
            this.config.setCameraFacing(Integer.valueOf(i2));
            return this;
        }

        public final Builder challenges(List<? extends Challenge> list) {
            l.d(list, "");
            this.config.setChallenges(list);
            return this;
        }

        public final Builder decompressTime(long j2) {
            this.config.setDecompressTime(Long.valueOf(j2));
            return this;
        }

        public final Builder defaultTab(int i2) {
            this.config.setDefaultTab(Integer.valueOf(i2));
            return this;
        }

        public final Builder effectConfig(EffectConfig effectConfig) {
            l.d(effectConfig, "");
            this.config.setEffectConfig(effectConfig);
            return this;
        }

        public final Builder effectDownloadDuration(long j2) {
            this.config.setEffectDownloadDuration(Long.valueOf(j2));
            return this;
        }

        public final Builder firstSticker(Effect effect) {
            l.d(effect, "");
            this.config.setFirstSticker(effect);
            return this;
        }

        public final Builder fromMain(boolean z) {
            this.config.setFromMain(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromOtherPlatform(boolean z) {
            this.config.setFromOtherPlatform(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromSpecialPlus(boolean z) {
            this.config.setFromSpecialPlus(Boolean.valueOf(z));
            return this;
        }

        public final Builder giphyGifIds(String str) {
            l.d(str, "");
            this.config.setGiphyGifIds(str);
            return this;
        }

        public final Builder interceptBackground(boolean z) {
            this.config.setInterceptBackground(Boolean.valueOf(z));
            return this;
        }

        public final Builder keepChallenge(boolean z) {
            this.config.setKeepChallenges(Boolean.valueOf(z));
            return this;
        }

        public final Builder miniAppConfig(MiniAppConfig miniAppConfig) {
            l.d(miniAppConfig, "");
            this.config.setMiniAppConfig(miniAppConfig);
            return this;
        }

        public final Builder musicDownloadDuration(long j2) {
            this.config.setMusicDownloadDuration(Long.valueOf(j2));
            return this;
        }

        public final Builder musicOrigin(String str) {
            l.d(str, "");
            this.config.setMusicOrigin(str);
            return this;
        }

        public final Builder musicPath(String str) {
            l.d(str, "");
            this.config.setMusicPath(str);
            return this;
        }

        public final Builder musicSticker(String str) {
            l.d(str, "");
            this.config.setMusicSticker(str);
            return this;
        }

        public final Builder musicType(int i2) {
            this.config.setMusicType(Integer.valueOf(i2));
            return this;
        }

        public final Builder mvSticker(Effect effect) {
            l.d(effect, "");
            this.config.setMvSticker(effect);
            return this;
        }

        public final Builder permissionActivityRequired(boolean z) {
            this.config.setPermissionActivityRequired(Boolean.valueOf(z));
            return this;
        }

        public final Builder qaVideoConfig(QaStructConfig qaStructConfig) {
            l.d(qaStructConfig, "");
            this.config.setQaStructConfig(qaStructConfig);
            return this;
        }

        public final Builder recordPresetResource(RecordPresetResource recordPresetResource) {
            l.d(recordPresetResource, "");
            this.config.setRecordPresetResource(recordPresetResource);
            return this;
        }

        public final Builder reshootConfig(ReshootConfig reshootConfig) {
            l.d(reshootConfig, "");
            this.config.setReshootConfig(reshootConfig);
            return this;
        }

        public final Builder setTTEPPreviewEffect(Effect effect) {
            l.d(effect, "");
            this.config.setTtepPreviewEffect(effect);
            return this;
        }

        public final Builder shootExtraData(ShootExtraData shootExtraData) {
            l.d(shootExtraData, "");
            this.config.setShootExtraData(shootExtraData);
            return this;
        }

        public final Builder showCancelAfterPinProp(boolean z) {
            this.config.setShowCancelAfterPinProp(Boolean.valueOf(z));
            return this;
        }

        public final Builder showPreloadingDialog(boolean z) {
            this.config.setShowPreloadingDialog(Boolean.valueOf(z));
            return this;
        }

        public final Builder startRecordTime(long j2) {
            this.config.setStartRecordTime(Long.valueOf(j2));
            return this;
        }

        public final Builder stickers(ArrayList<String> arrayList) {
            l.d(arrayList, "");
            this.config.setStickers(arrayList);
            return this;
        }

        public final Builder stitchParams(StitchParams stitchParams) {
            l.d(stitchParams, "");
            this.config.setStitchParams(stitchParams);
            return this;
        }

        public final Builder translationType(int i2) {
            this.config.setTranslationType(Integer.valueOf(i2));
            return this;
        }

        public final Builder videoDownloadDuration(long j2) {
            this.config.setVideoDownloadDuration(Long.valueOf(j2));
            return this;
        }

        public Builder(RecordConfig recordConfig) {
            l.d(recordConfig, "");
            this.config = recordConfig;
        }

        public final Builder tabs(String str) {
            if (str != null) {
                try {
                    this.config.setTabs(Integer.valueOf(Integer.parseInt(str)));
                    return this;
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public final Builder videoLength(Integer num) {
            int i2;
            RecordConfig recordConfig = this.config;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            recordConfig.setVideoLength(Integer.valueOf(i2));
            return this;
        }

        public final Builder mentionUser(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.config.setMentionUser(new p<>(str, str2));
            return this;
        }
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79715);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final a getAutoSelectedAnchor() {
        return this.autoSelectedAnchor;
    }

    public final Boolean getAutoStartRecording() {
        return this.autoStartRecording;
    }

    public final String getAutoUseMusic() {
        return this.autoUseMusic;
    }

    public final String getAutoUseSticker() {
        return this.autoUseSticker;
    }

    public final Integer getCameraFacing() {
        return this.cameraFacing;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Challenge>, java.util.List<com.ss.android.ugc.aweme.discover.model.Challenge> */
    public final List<Challenge> getChallenges() {
        return this.challenges;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final CommentVideoConfig getCommentVideoConfig() {
        return this.commentVideoConfig;
    }

    public final String getCommerceData() {
        return this.commerceData;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final Long getDecompressTime() {
        return this.decompressTime;
    }

    public final Integer getDefaultTab() {
        return this.defaultTab;
    }

    public final String getDonationId() {
        return this.donationId;
    }

    public final EffectConfig getEffectConfig() {
        return this.effectConfig;
    }

    public final Long getEffectDownloadDuration() {
        return this.effectDownloadDuration;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final boolean getEnterTTEPPreviewPage() {
        return this.enterTTEPPreviewPage;
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final Effect getFirstSticker() {
        return this.firstSticker;
    }

    public final Boolean getFromMain() {
        return this.fromMain;
    }

    public final Boolean getFromOtherPlatform() {
        return this.fromOtherPlatform;
    }

    public final Boolean getFromSpecialPlus() {
        return this.fromSpecialPlus;
    }

    public final Boolean getFromSystem() {
        return this.fromSystem;
    }

    public final String getGiphyGifIds() {
        return this.giphyGifIds;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Boolean getKeepChallenges() {
        return this.keepChallenges;
    }

    public final LiveParams getLiveParams() {
        return this.liveParams;
    }

    public final p<String, String> getMentionUser() {
        return this.mentionUser;
    }

    public final MiniAppConfig getMiniAppConfig() {
        return this.miniAppConfig;
    }

    public final HashMap<String, String> getMissionConfig() {
        return this.missionConfig;
    }

    public final Long getMusicDownloadDuration() {
        return this.musicDownloadDuration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final String getMusicSticker() {
        return this.musicSticker;
    }

    public final Integer getMusicType() {
        return this.musicType;
    }

    public final Effect getMusicWithStickerEffect() {
        return this.musicWithStickerEffect;
    }

    public final Effect getMvSticker() {
        return this.mvSticker;
    }

    public final String getMvStickerId() {
        return this.mvStickerId;
    }

    public final String getOpenPlatformClientKey() {
        return this.openPlatformClientKey;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final Boolean getPermissionActivityRequired() {
        return this.permissionActivityRequired;
    }

    public final boolean getPrepareFilter() {
        return this.prepareFilter;
    }

    public final Boolean getPresetSticker() {
        return this.presetSticker;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final QaStructConfig getQaStructConfig() {
        return this.qaStructConfig;
    }

    public final RecordPresetResource getRecordPresetResource() {
        return this.recordPresetResource;
    }

    public final ReshootConfig getReshootConfig() {
        return this.reshootConfig;
    }

    public final int getRestoreType() {
        return this.restoreType;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final String getSharedARHostId() {
        return this.sharedARHostId;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getShootFrom() {
        return this.shootFrom;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final String getShoutoutMode() {
        return this.shoutoutMode;
    }

    public final String getShoutoutOrderID() {
        return this.shoutoutOrderID;
    }

    public final Boolean getShowCancelAfterPinProp() {
        return this.showCancelAfterPinProp;
    }

    public final Boolean getShowPreloadingDialog() {
        return this.showPreloadingDialog;
    }

    public final boolean getShowStickerPanel() {
        return this.showStickerPanel;
    }

    public final HashMap<String, String> getStarAtlasConfig() {
        return this.starAtlasConfig;
    }

    public final Long getStartRecordTime() {
        return this.startRecordTime;
    }

    public final String getSticker() {
        return this.sticker;
    }

    public final Music getStickerMusic() {
        return this.stickerMusic;
    }

    public final String getStickerWithMusicFilePath() {
        return this.stickerWithMusicFilePath;
    }

    public final ArrayList<String> getStickers() {
        return this.stickers;
    }

    public final StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public final Integer getTabs() {
        return this.tabs;
    }

    public final Integer getTranslationType() {
        return this.translationType;
    }

    public final Effect getTtepPreviewEffect() {
        return this.ttepPreviewEffect;
    }

    public final Long getVideoDownloadDuration() {
        return this.videoDownloadDuration;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final String isFilterBusniessSticker() {
        return this.isFilterBusniessSticker;
    }

    public final Boolean isInterceptBackground() {
        return this.isInterceptBackground;
    }

    private RecordConfig() {
        this.keepChallenges = false;
        this.translationType = 0;
        this.permissionActivityRequired = false;
        this.prepareFilter = true;
        this.defaultTab = 0;
        this.musicType = 0;
        this.tabs = 0;
        this.reshootConfig = new ReshootConfig(false, null);
        this.videoLength = 0;
        this.openPlatformClientKey = "";
        this.openPlatformExtra = "";
    }

    public /* synthetic */ RecordConfig(g gVar) {
        this();
    }

    public final void setAutoSelectedAnchor(a aVar) {
        this.autoSelectedAnchor = aVar;
    }

    public final void setAutoStartRecording(Boolean bool) {
        this.autoStartRecording = bool;
    }

    public final void setAutoUseMusic(String str) {
        this.autoUseMusic = str;
    }

    public final void setAutoUseSticker(String str) {
        this.autoUseSticker = str;
    }

    public final void setCameraFacing(Integer num) {
        this.cameraFacing = num;
    }

    public final void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallenges(List<? extends Challenge> list) {
        this.challenges = list;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setCommentVideoConfig(CommentVideoConfig commentVideoConfig2) {
        this.commentVideoConfig = commentVideoConfig2;
    }

    public final void setCommerceData(String str) {
        this.commerceData = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDecompressTime(Long l2) {
        this.decompressTime = l2;
    }

    public final void setDefaultTab(Integer num) {
        this.defaultTab = num;
    }

    public final void setDonationId(String str) {
        this.donationId = str;
    }

    public final void setEffectConfig(EffectConfig effectConfig2) {
        this.effectConfig = effectConfig2;
    }

    public final void setEffectDownloadDuration(Long l2) {
        this.effectDownloadDuration = l2;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterTTEPPreviewPage(boolean z) {
        this.enterTTEPPreviewPage = z;
    }

    public final void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public final void setFilterBusniessSticker(String str) {
        this.isFilterBusniessSticker = str;
    }

    public final void setFirstSticker(Effect effect) {
        this.firstSticker = effect;
    }

    public final void setFromMain(Boolean bool) {
        this.fromMain = bool;
    }

    public final void setFromOtherPlatform(Boolean bool) {
        this.fromOtherPlatform = bool;
    }

    public final void setFromSpecialPlus(Boolean bool) {
        this.fromSpecialPlus = bool;
    }

    public final void setFromSystem(Boolean bool) {
        this.fromSystem = bool;
    }

    public final void setGiphyGifIds(String str) {
        this.giphyGifIds = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setInterceptBackground(Boolean bool) {
        this.isInterceptBackground = bool;
    }

    public final void setKeepChallenges(Boolean bool) {
        this.keepChallenges = bool;
    }

    public final void setLiveParams(LiveParams liveParams2) {
        this.liveParams = liveParams2;
    }

    public final void setMentionUser(p<String, String> pVar) {
        this.mentionUser = pVar;
    }

    public final void setMiniAppConfig(MiniAppConfig miniAppConfig2) {
        this.miniAppConfig = miniAppConfig2;
    }

    public final void setMissionConfig(HashMap<String, String> hashMap) {
        this.missionConfig = hashMap;
    }

    public final void setMusicDownloadDuration(Long l2) {
        this.musicDownloadDuration = l2;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicSticker(String str) {
        this.musicSticker = str;
    }

    public final void setMusicType(Integer num) {
        this.musicType = num;
    }

    public final void setMusicWithStickerEffect(Effect effect) {
        this.musicWithStickerEffect = effect;
    }

    public final void setMvSticker(Effect effect) {
        this.mvSticker = effect;
    }

    public final void setMvStickerId(String str) {
        this.mvStickerId = str;
    }

    public final void setOpenPlatformClientKey(String str) {
        this.openPlatformClientKey = str;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setPermissionActivityRequired(Boolean bool) {
        this.permissionActivityRequired = bool;
    }

    public final void setPrepareFilter(boolean z) {
        this.prepareFilter = z;
    }

    public final void setPresetSticker(Boolean bool) {
        this.presetSticker = bool;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setQaStructConfig(QaStructConfig qaStructConfig2) {
        this.qaStructConfig = qaStructConfig2;
    }

    public final void setRecordPresetResource(RecordPresetResource recordPresetResource2) {
        this.recordPresetResource = recordPresetResource2;
    }

    public final void setRestoreType(int i2) {
        this.restoreType = i2;
    }

    public final void setShareId(String str) {
        this.shareId = str;
    }

    public final void setSharedARHostId(String str) {
        this.sharedARHostId = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData2) {
        this.shootExtraData = shootExtraData2;
    }

    public final void setShootFrom(String str) {
        this.shootFrom = str;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public final void setShoutoutMode(String str) {
        this.shoutoutMode = str;
    }

    public final void setShoutoutOrderID(String str) {
        this.shoutoutOrderID = str;
    }

    public final void setShowCancelAfterPinProp(Boolean bool) {
        this.showCancelAfterPinProp = bool;
    }

    public final void setShowPreloadingDialog(Boolean bool) {
        this.showPreloadingDialog = bool;
    }

    public final void setShowStickerPanel(boolean z) {
        this.showStickerPanel = z;
    }

    public final void setStarAtlasConfig(HashMap<String, String> hashMap) {
        this.starAtlasConfig = hashMap;
    }

    public final void setStartRecordTime(Long l2) {
        this.startRecordTime = l2;
    }

    public final void setSticker(String str) {
        this.sticker = str;
    }

    public final void setStickerMusic(Music music) {
        this.stickerMusic = music;
    }

    public final void setStickerWithMusicFilePath(String str) {
        this.stickerWithMusicFilePath = str;
    }

    public final void setStickers(ArrayList<String> arrayList) {
        this.stickers = arrayList;
    }

    public final void setStitchParams(StitchParams stitchParams2) {
        this.stitchParams = stitchParams2;
    }

    public final void setTabs(Integer num) {
        this.tabs = num;
    }

    public final void setTranslationType(Integer num) {
        this.translationType = num;
    }

    public final void setTtepPreviewEffect(Effect effect) {
        this.ttepPreviewEffect = effect;
    }

    public final void setVideoDownloadDuration(Long l2) {
        this.videoDownloadDuration = l2;
    }

    public final void setVideoLength(Integer num) {
        this.videoLength = num;
    }

    public final void setReshootConfig(ReshootConfig reshootConfig2) {
        l.d(reshootConfig2, "");
        this.reshootConfig = reshootConfig2;
    }
}
