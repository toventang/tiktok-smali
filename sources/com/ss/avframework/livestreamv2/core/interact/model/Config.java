package com.ss.avframework.livestreamv2.core.interact.model;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.utils.UrlUtils;
import com.ss.bytertc.engine.RTCEngine;
import org.json.JSONObject;

public class Config {
    public boolean forceAlignTo16 = true;
    private String mAppChannel = "";
    private String mAppId = "";
    private String mAppMinVersion = "";
    private String mAppVersion = "";
    private boolean mAutoUpdateSeiForTalk;
    private ChannelProfile mChannelProfile = ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING;
    private Character mCharacter = Character.GUEST;
    private Context mContext;
    private boolean mDefaultAudioRoutetoSpeakerphone = true;
    private String mDeviceId = "";
    private EGLContext mEGLContext14;
    private boolean mEnableAudioOnBackground;
    private boolean mEnableAudioOnStart = true;
    private Handler mHandler;
    private InteractMode mInteractMode = InteractMode.NORMAL;
    private int mLogReportInterval = 5;
    private MixStreamConfig mMixStreamConfig;
    private MixStreamType mMixStreamType = MixStreamType.NONE;
    private boolean mNeedCheckClientMixerParams = true;
    private String mProjectKey = "";
    private boolean mRoiOn;
    private RTCEngine.Env mRtcEnv = RTCEngine.Env.ENV_PRODUCT;
    private String mRtcExtParams = "{}";
    private int mSeiVersion;
    private boolean mSingleViewMode;
    private Type mType = Type.VIDEO;
    private boolean mUpdateTalkSeiAB;
    private int mUpdateTalkSeiInterval = 1000;
    private VideoQuality mVideoQuality = VideoQuality.GUEST_NORMAL;
    private ViewType mViewType = ViewType.SURFACE_VIEW;
    private int mVolumeCallbackInterval;
    private int mVolumeThreshold;

    static {
        Covode.recordClassIndex(100241);
    }

    public enum InteractMode {
        PK(0, "pk"),
        NORMAL(1, "normal"),
        FM(2, "fm"),
        VIDEO_TALK(3, "video_talk"),
        VIDEO_TALK_CAMERA(4, "video_talk_camera"),
        MULTI_ANCHOR(5, "multi_anchor"),
        SHARE_VIDEO(6, "share_video"),
        SHARE_VIDEO_PRI(7, "share_video_pri"),
        KTV(8, "ktv"),
        KTV_CAMERA(9, "ktv_camera"),
        KTV_PRI(10, "ktv_pri"),
        EQUAL_TALK_ROOM(11, "equal_talk_room"),
        MVP(12, "mvp"),
        GAME_AUDIO(13, "game_audio");
        
        private String name;
        private int value;

        public final String toString() {
            return this.name;
        }

        static {
            Covode.recordClassIndex(100247);
        }

        private InteractMode(int i2, String str) {
            this.value = i2;
            this.name = str;
        }
    }

    public class MixStreamConfig {
        private int audioBitrate = 128;
        private int audioChannels = 2;
        private AudioProfile audioProfile = AudioProfile.LC;
        private AudioSampleRate audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
        private int backgroundColor = 0;
        private String mStreamName = "";
        private String mStreamUrl = "";
        private long mStreamUrlPriority;
        private String mStreamUuid;
        private int videoBitrate = 800;
        private VideoCodec videoCodec = VideoCodec.H264;
        private int videoFrameRate = 15;
        private float videoGop = 2.0f;
        private int videoHeight;
        private VideoProfile videoProfile = VideoProfile.HIGH;
        private int videoWidth;

        static {
            Covode.recordClassIndex(100248);
        }

        public int getAudioBitrate() {
            return this.audioBitrate;
        }

        public int getAudioChannels() {
            return this.audioChannels;
        }

        public AudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public AudioSampleRate getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getStreamName() {
            return this.mStreamName;
        }

        public int getVideoBitrate() {
            return this.videoBitrate;
        }

        public VideoCodec getVideoCodec() {
            return this.videoCodec;
        }

        public int getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public float getVideoGop() {
            return this.videoGop;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public void updateStreamUrlPriority() {
            this.mStreamUrlPriority = System.currentTimeMillis();
        }

        public VideoProfile getVideoProfile() {
            if (this.videoCodec == VideoCodec.BYTEVC1) {
                this.videoProfile = VideoProfile.MAIN;
            }
            return this.videoProfile;
        }

        public int getAudioSampleRateValue() {
            int i2 = AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate[this.audioSampleRate.ordinal()];
            if (i2 == 1) {
                return 16000;
            }
            if (i2 == 2) {
                return 32000;
            }
            if (i2 != 3) {
                return 44100;
            }
            return 48000;
        }

        public String getBackgroundColorString() {
            return "#" + a.a("%6s", new Object[]{Integer.toHexString(this.backgroundColor).toUpperCase()}).replaceAll(" ", "0");
        }

        public String getStreamUniqueId() {
            if (!TextUtils.isEmpty(this.mStreamUuid)) {
                return this.mStreamUuid + "." + this.mStreamUrlPriority;
            }
            return "";
        }

        public String getStreamUrl() {
            String str = this.mStreamUrl;
            if (!TextUtils.isEmpty(str)) {
                long j2 = this.mStreamUrlPriority;
                if (j2 != 0) {
                    str = UrlUtils.AddParam(str, "pri", String.valueOf(j2));
                }
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(getStreamUniqueId())) {
                return str;
            }
            return UrlUtils.AddParam(str, "_session_id", getStreamUniqueId());
        }

        public MixStreamConfig setAudioProfile(AudioProfile audioProfile2) {
            this.audioProfile = audioProfile2;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(AudioSampleRate audioSampleRate2) {
            this.audioSampleRate = audioSampleRate2;
            return this;
        }

        public MixStreamConfig setBackgroundColor(int i2) {
            this.backgroundColor = i2;
            return this;
        }

        public void setStreamUniqueIdentifier(String str) {
            this.mStreamUuid = str;
        }

        public MixStreamConfig setVideoCodec(VideoCodec videoCodec2) {
            this.videoCodec = videoCodec2;
            return this;
        }

        public MixStreamConfig setVideoProfile(VideoProfile videoProfile2) {
            this.videoProfile = videoProfile2;
            return this;
        }

        public MixStreamConfig setAudioBitrate(int i2) {
            if (i2 < 32) {
                i2 = 32;
            } else if (i2 > 256) {
                i2 = 256;
            }
            this.audioBitrate = i2;
            return this;
        }

        public MixStreamConfig setAudioChannels(int i2) {
            if (!(i2 == 1 || i2 == 2)) {
                i2 = 2;
            }
            this.audioChannels = i2;
            return this;
        }

        public MixStreamConfig setStreamUrl(String str) {
            this.mStreamUrl = str;
            this.mStreamName = parseStreamName(str);
            return this;
        }

        public MixStreamConfig setVideoBitrate(int i2) {
            if (i2 < 100) {
                i2 = 100;
            } else if (i2 > 5000) {
                i2 = 5000;
            }
            this.videoBitrate = i2;
            return this;
        }

        public MixStreamConfig setVideoFrameRate(int i2) {
            if (i2 < 5) {
                i2 = 5;
            } else if (i2 > 50) {
                i2 = 50;
            }
            this.videoFrameRate = i2;
            return this;
        }

        private String parseStreamName(String str) {
            try {
                String DecodeUrl = UrlUtils.DecodeUrl(str);
                int lastIndexOf = DecodeUrl.lastIndexOf(47) + 1;
                int indexOf = DecodeUrl.indexOf(63, lastIndexOf);
                if (indexOf < 0) {
                    indexOf = DecodeUrl.length();
                }
                return DecodeUrl.substring(lastIndexOf, indexOf);
            } catch (Exception unused) {
                return "";
            }
        }

        public MixStreamConfig setVideoGop(float f2) {
            if (f2 < 1.0f) {
                f2 = 1.0f;
            } else if (f2 > 10.0f) {
                f2 = 10.0f;
            }
            this.videoGop = f2;
            return this;
        }

        public MixStreamConfig() {
            setVideoSize(360, 640);
        }

        public MixStreamConfig setAudioSampleRate(int i2) {
            int[] iArr = {16000, 32000, 44100, 48000};
            int i3 = 0;
            AudioSampleRate[] audioSampleRateArr = {AudioSampleRate.SAMPLE_RATE_16K, AudioSampleRate.SAMPLE_RATE_32K, AudioSampleRate.SAMPLE_RATE_44K, AudioSampleRate.SAMPLE_RATE_48K};
            while (i2 > iArr[i3]) {
                i3++;
                if (i3 >= 4) {
                    this.audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
                    return this;
                }
            }
            this.audioSampleRate = audioSampleRateArr[i3];
            return this;
        }

        public MixStreamConfig setVideoSize(int i2, int i3) {
            int i4;
            int i5 = 16;
            if (Config.this.forceAlignTo16) {
                i4 = 16;
            } else {
                i4 = 2;
            }
            this.videoWidth = Config.align(i2, i4);
            if (!Config.this.forceAlignTo16) {
                i5 = 2;
            }
            this.videoHeight = Config.align(i3, i5);
            return this;
        }
    }

    public enum MixStreamType {
        NONE(0, "none"),
        SERVER_MIX(1, "server"),
        CLIENT_MIX(2, "client");
        
        private String name;
        private int value;

        public final String toString() {
            return this.name;
        }

        static {
            Covode.recordClassIndex(100249);
        }

        private MixStreamType(int i2, String str) {
            this.value = i2;
            this.name = str;
        }
    }

    public enum Vendor {
        UNKNOWN(0),
        AGORA(1),
        ZEGO(2),
        BYTE(4);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        public final String getName() {
            int i2 = AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor[ordinal()];
            if (i2 == 1) {
                return "agora";
            }
            if (i2 == 2) {
                return "zego";
            }
            if (i2 != 3) {
                return "unknown";
            }
            return "byte";
        }

        static {
            Covode.recordClassIndex(100251);
        }

        public static Vendor fromValue(int i2) {
            if (i2 == 1) {
                return AGORA;
            }
            if (i2 == 2) {
                return ZEGO;
            }
            if (i2 != 4) {
                return UNKNOWN;
            }
            return BYTE;
        }

        private Vendor(int i2) {
            this.value = i2;
        }
    }

    public static class VideoQuality {
        public static final VideoQuality ANCHOR_HIGH = new VideoQuality(480, 864, 15, 1200);
        public static final VideoQuality ANCHOR_NORMAL = new VideoQuality(360, 640, 15, 800);
        public static final VideoQuality GUEST_HIGH = new VideoQuality(240, 320, 15, 360);
        public static final VideoQuality GUEST_NORMAL = new VideoQuality(LiveFeedRefreshTimeSetting.DEFAULT, 240, 15, 240);
        public static final VideoQuality MIN = new VideoQuality(16, 16, 15, 50);
        public final int mBitrate;
        public final int mFps;
        private final int mHeight;
        private final int mOrigHeight;
        private final int mOrigWidth;
        private final int mWidth;

        public int getBitrate() {
            return this.mBitrate;
        }

        public int getFps() {
            return this.mFps;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getOrigHeight() {
            return this.mOrigHeight;
        }

        public int getOrigWidth() {
            return this.mOrigWidth;
        }

        public int getWidth() {
            return this.mWidth;
        }

        static {
            Covode.recordClassIndex(100255);
        }

        public VideoQuality(int i2, int i3, int i4, int i5) {
            this.mWidth = i2;
            this.mHeight = i3;
            this.mOrigWidth = i2;
            this.mOrigHeight = i3;
            this.mFps = i4;
            this.mBitrate = i5;
        }
    }

    public String getAppChannel() {
        return this.mAppChannel;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppMinVersion() {
        return this.mAppMinVersion;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public ChannelProfile getChannelProfile() {
        return this.mChannelProfile;
    }

    public Character getCharacter() {
        return this.mCharacter;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean getDefaultAudioRoutetoSpeakerphone() {
        return this.mDefaultAudioRoutetoSpeakerphone;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public InteractMode getInteractMode() {
        return this.mInteractMode;
    }

    public int getLogReportInterval() {
        return this.mLogReportInterval;
    }

    public MixStreamType getMixStreamType() {
        return this.mMixStreamType;
    }

    public String getProjectKey() {
        return this.mProjectKey;
    }

    public boolean getRoiOn() {
        return this.mRoiOn;
    }

    public RTCEngine.Env getRtcEnv() {
        return this.mRtcEnv;
    }

    public String getRtcExtInfo() {
        return this.mRtcExtParams;
    }

    public int getSeiVersion() {
        return this.mSeiVersion;
    }

    public EGLContext getSharedEGLContext14() {
        return this.mEGLContext14;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean getUpdateTalkSeiAB() {
        return this.mUpdateTalkSeiAB;
    }

    public int getUpdateTalkSeiInterval() {
        return this.mUpdateTalkSeiInterval;
    }

    public VideoQuality getVideoQuality() {
        return this.mVideoQuality;
    }

    public ViewType getViewType() {
        return this.mViewType;
    }

    public int getVolumeCallbackInterval() {
        return this.mVolumeCallbackInterval;
    }

    public boolean isAlignTo16() {
        return this.forceAlignTo16;
    }

    public boolean isAutoUpdateSeiForTalk() {
        return this.mAutoUpdateSeiForTalk;
    }

    public boolean isEnableAudioOnBackground() {
        return this.mEnableAudioOnBackground;
    }

    public boolean isEnableAudioOnStart() {
        return this.mEnableAudioOnStart;
    }

    public boolean isNeedCheckClientMixerParams() {
        return this.mNeedCheckClientMixerParams;
    }

    public boolean isSingleViewMode() {
        return this.mSingleViewMode;
    }

    public enum ChannelProfile {
        CHANNEL_PROFILE_COMMUNICATION(0),
        CHANNEL_PROFILE_LIVE_BROADCASTING(1),
        CHANNEL_PROFILE_GAME(2),
        CHANNEL_PROFILE_CLOUD_GAME(3);
        
        private int channelProfileNumber;

        public final String getStringNum() {
            return Integer.toString(this.channelProfileNumber);
        }

        static {
            Covode.recordClassIndex(100245);
        }

        private ChannelProfile(int i2) {
            this.channelProfileNumber = i2;
        }
    }

    public int getVolumeThreshold() {
        int i2 = this.mVolumeThreshold;
        if (i2 > 0) {
            return i2;
        }
        return 30;
    }

    public MixStreamConfig getMixStreamConfig() {
        if (this.mMixStreamConfig == null) {
            this.mMixStreamConfig = new MixStreamConfig();
        }
        return this.mMixStreamConfig;
    }

    public enum AudioProfile {
        LC,
        HE;

        static {
            Covode.recordClassIndex(100243);
        }
    }

    public enum AudioSampleRate {
        SAMPLE_RATE_16K,
        SAMPLE_RATE_32K,
        SAMPLE_RATE_44K,
        SAMPLE_RATE_48K;

        static {
            Covode.recordClassIndex(100244);
        }
    }

    public enum Character {
        ANCHOR,
        GUEST;

        static {
            Covode.recordClassIndex(100246);
        }
    }

    public enum Type {
        AUDIO,
        VIDEO;

        static {
            Covode.recordClassIndex(100250);
        }
    }

    public enum VideoCodec {
        H264,
        BYTEVC1;

        static {
            Covode.recordClassIndex(100252);
        }
    }

    public enum VideoProfile {
        BASELINE,
        MAIN,
        HIGH;

        static {
            Covode.recordClassIndex(100254);
        }
    }

    public enum ViewType {
        SURFACE_VIEW,
        TEXTURE_VIEW;

        static {
            Covode.recordClassIndex(100256);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.model.Config$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate;
        static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                r0 = 100242(0x18792, float:1.40469E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.avframework.livestreamv2.core.interact.model.Config$AudioSampleRate[] r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioSampleRate.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate = r1
                r5 = 1
                com.ss.avframework.livestreamv2.core.interact.model.Config$AudioSampleRate r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioSampleRate.SAMPLE_RATE_16K     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r5     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r4 = 2
                int[] r1 = com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.avframework.livestreamv2.core.interact.model.Config$AudioSampleRate r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioSampleRate.SAMPLE_RATE_32K     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r3 = 3
                int[] r1 = com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.avframework.livestreamv2.core.interact.model.Config$AudioSampleRate r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioSampleRate.SAMPLE_RATE_48K     // Catch:{ NoSuchFieldError -> 0x002e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.avframework.livestreamv2.core.interact.model.Config$AudioSampleRate r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.AudioSampleRate.SAMPLE_RATE_44K     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor[] r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.Vendor.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor = r1
                com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.Vendor.AGORA     // Catch:{ NoSuchFieldError -> 0x004a }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
                r1[r0] = r5     // Catch:{ NoSuchFieldError -> 0x004a }
            L_0x004a:
                int[] r1 = com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.Vendor.ZEGO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$model$Config$Vendor     // Catch:{ NoSuchFieldError -> 0x005e }
                com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor r0 = com.ss.avframework.livestreamv2.core.interact.model.Config.Vendor.BYTE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.model.Config.AnonymousClass1.<clinit>():void");
        }
    }

    public enum VideoOutputFormat {
        PIXEL_FORMAT_UNKNOWN,
        PIXEL_FORMAT_I420,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_BGRA32,
        PIXEL_FORMAT_RGBA32,
        PIXEL_FORMAT_ARGB32,
        PIXEL_FORMAT_ABGR32,
        TEXTURE_2D,
        TEXTURE_OES;

        static {
            Covode.recordClassIndex(100253);
        }
    }

    public Config enableAudioOnBackground(boolean z) {
        this.mEnableAudioOnBackground = z;
        return this;
    }

    public Config enableAudioOnStart(boolean z) {
        this.mEnableAudioOnStart = z;
        return this;
    }

    public Config setAlignTo16(boolean z) {
        this.forceAlignTo16 = z;
        return this;
    }

    public Config setAppChannel(String str) {
        this.mAppChannel = str;
        return this;
    }

    public Config setAppId(String str) {
        this.mAppId = str;
        return this;
    }

    public Config setAppMinVersion(String str) {
        this.mAppMinVersion = str;
        return this;
    }

    public Config setAppVersion(String str) {
        this.mAppVersion = str;
        return this;
    }

    public Config setAutoUpdateSeiForTalk(boolean z) {
        this.mAutoUpdateSeiForTalk = z;
        return this;
    }

    public void setChannelProfile(ChannelProfile channelProfile) {
        this.mChannelProfile = channelProfile;
    }

    public Config setCharacter(Character character) {
        this.mCharacter = character;
        return this;
    }

    public Config setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public Config setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.mDefaultAudioRoutetoSpeakerphone = z;
        return this;
    }

    public Config setDeviceId(String str) {
        this.mDeviceId = str;
        return this;
    }

    public Config setHandler(Handler handler) {
        this.mHandler = handler;
        return this;
    }

    public Config setInteractMode(InteractMode interactMode) {
        this.mInteractMode = interactMode;
        return this;
    }

    public Config setLogReportInterval(int i2) {
        this.mLogReportInterval = i2;
        return this;
    }

    public Config setMixStreamType(MixStreamType mixStreamType) {
        this.mMixStreamType = mixStreamType;
        return this;
    }

    public Config setNeedCheckClientMixerParams(boolean z) {
        this.mNeedCheckClientMixerParams = z;
        return this;
    }

    public Config setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public Config setRoiOn(boolean z) {
        this.mRoiOn = z;
        return this;
    }

    public void setRtcEnv(RTCEngine.Env env) {
        this.mRtcEnv = env;
    }

    public Config setRtcExtInfo(String str) {
        this.mRtcExtParams = str;
        return this;
    }

    public Config setSeiVersion(int i2) {
        this.mSeiVersion = i2;
        return this;
    }

    public Config setSharedEGLContext14(EGLContext eGLContext) {
        this.mEGLContext14 = eGLContext;
        return this;
    }

    public Config setSingleViewMode(boolean z) {
        this.mSingleViewMode = z;
        return this;
    }

    public Config setType(Type type) {
        this.mType = type;
        return this;
    }

    public Config setUpdateTalkSeiAB(boolean z) {
        this.mUpdateTalkSeiAB = z;
        return this;
    }

    public Config setUpdateTalkSeiInterval(int i2) {
        this.mUpdateTalkSeiInterval = i2;
        return this;
    }

    public Config setViewType(ViewType viewType) {
        this.mViewType = viewType;
        return this;
    }

    public Config setVolumeCallbackInterval(int i2) {
        this.mVolumeCallbackInterval = i2;
        return this;
    }

    public Config setVolumeThreshold(int i2) {
        this.mVolumeThreshold = i2;
        return this;
    }

    public Config setVideoQuality(VideoQuality videoQuality) {
        int i2;
        int width = videoQuality.getWidth();
        int i3 = 16;
        if (this.forceAlignTo16) {
            i2 = 16;
        } else {
            i2 = 2;
        }
        int align = align(width, i2);
        int height = videoQuality.getHeight();
        if (!this.forceAlignTo16) {
            i3 = 2;
        }
        this.mVideoQuality = new VideoQuality(align, align(height, i3), videoQuality.mFps, videoQuality.mBitrate);
        return this;
    }

    public static int align(int i2, int i3) {
        return (((i2 + i3) - 1) / i3) * i3;
    }

    public Config setRtcExtInfoWithParams(Vendor vendor, String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc_vendor", vendor.getValue());
            jSONObject.put("rtc_app_id", str);
            jSONObject.put("rtc_app_sign", str2);
            jSONObject.put("rtc_token", str3);
            jSONObject.put("rtc_channel_id", str4);
            jSONObject.put("rtc_user_id", str5);
            jSONObject.put("rtc_user_id_mode", i2);
            jSONObject.put("user_id", str6);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("live_rtc_engine_config", jSONObject);
            this.mRtcExtParams = jSONObject2.toString();
        } catch (Exception unused) {
        }
        return this;
    }
}
