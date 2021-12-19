package com.ss.bytertc.engine.livertc;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.livertc.RTCChannelState;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveRTCEngine extends RTCEngineImpl implements ILiveRtcEventObserver {
    private String mAppId;
    private VideoStreamDescription mClientMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private Context mContext;
    private VideoStreamDescription mCustomVideoPreset = null;
    private boolean mDualStreamMode = false;
    private int mEnableAutoSwitchDualStreamMode = 0;
    private boolean mEnableRecvDualStream = false;
    private VideoStreamDescription mHDLiveVideoPreset = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
    private RTCHandlerProxy mHandlerProxy = null;
    private LiveRTCExtInfo mLiveRtcExtInfo = new LiveRTCExtInfo();
    private int mLiveVideoMode = 0;
    private VideoStreamDescription mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private int mMaxTransCodingCbIntervalSecond = 5;
    private int mMixStreamType = 0;
    private MuteState mMuteLocalAudioStream = MuteState.MUTE_STATE_OFF;
    private MuteState mMuteRemoteAllAudioStreams = MuteState.MUTE_STATE_OFF;
    private Map<String, RTCStream> mRTCStreamMap = new ConcurrentHashMap();
    private int mRemoteDefaultStreamType = 0;
    private Set<String> mRemoteUserSet = new ConcurrentSkipListSet();
    private RTCChannelState mRtcChannelState = new RTCChannelState();
    private RTCPhoneStateListener mRtcPhoneStateListener;
    private VideoStreamDescription mSDLiveVideoPreset = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
    private VideoStreamDescription mServerMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
    private int mSwitchDualStreamModeThreshold = 2;
    private int mTransCodeCnt = 0;
    private ScheduledExecutorService mWorkExecutor;
    private Thread mWorkerThread;

    public static class RtcErrorCode {
        static {
            Covode.recordClassIndex(100990);
        }
    }

    static {
        Covode.recordClassIndex(100979);
    }

    @Override // com.ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onLiveTranscodingResult(String str, int i2) {
    }

    public MuteState getMuteLocalAudioStream() {
        return this.mMuteLocalAudioStream;
    }

    public MuteState getMuteRemoteAllAudioStreams() {
        return this.mMuteRemoteAllAudioStreams;
    }

    public LiveRTCExtInfo getRtcExtInfo() {
        return this.mLiveRtcExtInfo;
    }

    public boolean isDualStream() {
        return this.mDualStreamMode;
    }

    public String getAppId() {
        String str = this.mAppId;
        if (str != null) {
            return str;
        }
        return null;
    }

    public String getBusinessId() {
        return this.mLiveRtcExtInfo.businessId;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$parseRTCExtInfo$4$LiveRTCEngine() {
        IRTCEngineEventHandler handler;
        RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
        if (rTCHandlerProxy != null && (handler = rTCHandlerProxy.getHandler()) != null) {
            handler.onError(1217);
        }
    }

    public void disableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$2(this));
        }
    }

    @Override // com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void doDestroy() {
        this.mCustomVideoPreset = null;
        this.mLiveRtcExtInfo.reset();
        resetLiveRtcParam();
        disableRtcPhoneListener();
        this.mWorkExecutor.shutdown();
        this.mAppId = null;
        super.doDestroy();
    }

    public void enableRtcPhoneListener() {
        ScheduledExecutorService scheduledExecutorService = this.mWorkExecutor;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$1(this));
        }
    }

    public VideoStreamDescription getRtcVideoResolution() {
        int i2 = this.mLiveVideoMode;
        if (i2 == 0) {
            VideoStreamDescription videoStreamDescription = this.mCustomVideoPreset;
            if (videoStreamDescription != null) {
                return videoStreamDescription;
            }
            return this.mLiveVideoPreset;
        } else if (i2 != 2) {
            return this.mLiveVideoPreset;
        } else {
            return this.mHDLiveVideoPreset;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$disableRtcPhoneListener$2$LiveRTCEngine() {
        TelephonyManager telephonyManager;
        Context context = this.mContext;
        if (context != null && this.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "phone")) != null) {
            telephonyManager.listen(this.mRtcPhoneStateListener, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$enableRtcPhoneListener$1$LiveRTCEngine() {
        TelephonyManager telephonyManager;
        Context context = this.mContext;
        if (context != null && this.mRtcPhoneStateListener != null && (telephonyManager = (TelephonyManager) com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "phone")) != null) {
            telephonyManager.listen(this.mRtcPhoneStateListener, 32);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public int leaveRoom() {
        if (this.mRtcChannelState.getChannelState() == RTCChannelState.ChannelState.CHANNEL_STATE_LEAVE_CHANNEL) {
            return -1;
        }
        int leaveRoom = super.leaveRoom();
        setBusinessId("");
        this.mRtcChannelState.leaveChannel();
        resetLiveRtcParam();
        return leaveRoom;
    }

    private void resetLiveRtcParam() {
        this.mRemoteUserSet.clear();
        this.mLiveVideoMode = 0;
        this.mDualStreamMode = false;
        this.mRemoteDefaultStreamType = 0;
        this.mEnableAutoSwitchDualStreamMode = 0;
        this.mSwitchDualStreamModeThreshold = 2;
        this.mMixStreamType = 0;
        this.mClientMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mServerMixVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
        this.mHDLiveVideoPreset = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
        this.mSDLiveVideoPreset = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
        this.mLiveRtcExtInfo.reset();
        this.mRTCStreamMap.clear();
        this.mCustomVideoPreset = null;
    }

    public static class LiveVideoPreset {
        public static final VideoStreamDescription DEFAULT_LIVE_VIDEO_PRESET = new VideoStreamDescription(368, 640, 15, 800, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        public static final VideoStreamDescription HD_LIVE_VIDEO_PRESET = new VideoStreamDescription(368, 640, 15, 800, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        public static final VideoStreamDescription SD_LIVE_VIDEO_PRESET = new VideoStreamDescription(272, 480, 15, 500, VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());

        static {
            Covode.recordClassIndex(100989);
        }
    }

    private void configVideoParam() {
        IRTCEngineEventHandler handler;
        ArrayList arrayList = new ArrayList();
        int i2 = this.mLiveVideoMode;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                VideoStreamDescription videoStreamDescription = this.mHDLiveVideoPreset;
                if (videoStreamDescription != null && this.mSDLiveVideoPreset != null) {
                    arrayList.add(videoStreamDescription);
                    arrayList.add(this.mSDLiveVideoPreset);
                    super.setVideoEncoderConfig(arrayList);
                    this.mEnableRecvDualStream = true;
                    RTCEngine.SubscribeMode subscribeMode = RTCEngine.SubscribeMode.MANUAL_SUBSCRIBE_MODE;
                    enableAutoSubscribe(subscribeMode, subscribeMode);
                    return;
                }
                return;
            } else if (i2 != 3) {
                LogUtil.e("LiveRtcEngine", "live vieo mode is error, live mode: " + this.mLiveVideoMode);
                RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
                if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                    handler.onError(1215);
                }
                arrayList.add(this.mLiveVideoPreset);
                super.setVideoEncoderConfig(arrayList);
                return;
            }
        }
        VideoStreamDescription videoStreamDescription2 = this.mLiveVideoPreset;
        if (videoStreamDescription2 != null) {
            arrayList.add(videoStreamDescription2);
            super.setVideoEncoderConfig(arrayList);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        super.updateLiveTranscoding(liveTranscoding);
    }

    public class AutoDualStreamMode {
        static {
            Covode.recordClassIndex(100985);
        }

        public AutoDualStreamMode() {
        }
    }

    public class DualStreamRemoteStreamType {
        static {
            Covode.recordClassIndex(100986);
        }

        public DualStreamRemoteStreamType() {
        }
    }

    public class LiveMixStreamMode {
        static {
            Covode.recordClassIndex(100987);
        }

        public LiveMixStreamMode() {
        }
    }

    public class LiveRtcVideoMode {
        static {
            Covode.recordClassIndex(100988);
        }

        public LiveRtcVideoMode() {
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void muteAllRemoteAudio(MuteState muteState) {
        this.mMuteRemoteAllAudioStreams = muteState;
        super.muteAllRemoteAudio(muteState);
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void muteLocalAudio(MuteState muteState) {
        this.mMuteLocalAudioStream = muteState;
        super.muteLocalAudio(muteState);
    }

    public int setRtcExtInfo(String str) {
        return parseRTCExtInfo(str);
    }

    private void parseRtcMixParam(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mLiveRtcExtInfo.mixMaxBitrateKbps = jSONObject.optInt("video_bitrate_kbps");
        }
    }

    private void updateRtcVideoParam(JSONObject jSONObject) {
        if (jSONObject != null) {
            parseLiveRtcVideoParam(jSONObject);
            configVideoParam();
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        RTCHandlerProxy rTCHandlerProxy = new RTCHandlerProxy(iRTCEngineEventHandler, this);
        this.mHandlerProxy = rTCHandlerProxy;
        super.setRtcEngineEventHandler(rTCHandlerProxy);
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public int setVideoEncoderConfig(List<VideoStreamDescription> list) {
        if (this.mLiveVideoMode == 0) {
            return super.setVideoEncoderConfig(list);
        }
        return 0;
    }

    public static ScheduledExecutorService com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(ThreadFactory threadFactory) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        return (ScheduledExecutorService) g.a(a2.a());
    }

    public static String getAppId(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                return optJSONObject.optString("rtc_app_id");
            }
            return null;
        } catch (JSONException e2) {
            LogUtil.e("LiveRtcEngine", "get app id exception", e2);
            return null;
        }
    }

    private void parseLiveRtcOther(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("max_transcoding_cb_interval_second")) {
            this.mMaxTransCodingCbIntervalSecond = jSONObject.optInt("max_transcoding_cb_interval_second");
        }
    }

    public int joinRoom(String str) {
        this.mRtcChannelState.joinChannel();
        return joinRoom(this.mLiveRtcExtInfo.token, this.mLiveRtcExtInfo.channelId, new UserInfo(this.mLiveRtcExtInfo.interactId, ""), RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Thread lambda$new$0$LiveRTCEngine(Runnable runnable) {
        Thread thread = new Thread(runnable);
        this.mWorkerThread = thread;
        thread.setName("live-rtc-worker-thread");
        this.mWorkerThread.setDaemon(Thread.currentThread().isDaemon());
        return this.mWorkerThread;
    }

    public static int getMixType(String str) {
        try {
            int i2 = new JSONObject(str).getJSONObject("live_rtc_video_param").getInt("rtc_mix_type");
            if (i2 < 0 || i2 > 3) {
                return 2;
            }
            return i2;
        } catch (JSONException e2) {
            LogUtil.w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e2.getStackTrace().toString());
            return 2;
        }
    }

    private VideoStreamDescription parseVideoPreset(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new VideoStreamDescription(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("fps"), jSONObject.optInt("bitrate_kbps"), VideoStreamDescription.EncoderPreference.MaintainQuality.getValue());
        }
        return null;
    }

    public int updateRtcExtInfo(String str) {
        int i2 = -1;
        if (str == null) {
            return -1;
        }
        try {
            updateRtcVideoParam(new JSONObject(str).optJSONObject("live_rtc_video_param"));
            i2 = 0;
            return 0;
        } catch (JSONException e2) {
            LogUtil.e("LiveRtcEngine", "update rtc info happen exception rtcExtInfo:".concat(String.valueOf(str)), e2);
            return i2;
        }
    }

    private static JSONObject parseEngineParameters(String str) {
        JSONObject jSONObject = new JSONObject();
        LogUtil.i("LiveRtcEngine", "rtcExtInfo:".concat(String.valueOf(str)));
        if (str != null && !str.equals("")) {
            try {
                String optString = new JSONObject(str).optString("rtc.ab_label");
                if (!optString.isEmpty()) {
                    jSONObject.put("rtc.ab_label", optString);
                }
            } catch (JSONException e2) {
                LogUtil.w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e2.getStackTrace().toString());
            }
        }
        return jSONObject;
    }

    private void parseRtcDualStreamParam(JSONObject jSONObject) {
        VideoStreamDescription videoStreamDescription;
        VideoStreamDescription videoStreamDescription2;
        if (jSONObject != null) {
            this.mRemoteDefaultStreamType = jSONObject.optInt("remote_default_stream_type");
            this.mEnableAutoSwitchDualStreamMode = jSONObject.optInt("is_auto_switch");
            this.mSwitchDualStreamModeThreshold = jSONObject.optInt("auto_switch_user_num");
            if (parseVideoPreset(jSONObject.optJSONObject("hd_video_param")) != null) {
                videoStreamDescription = parseVideoPreset(jSONObject.optJSONObject("hd_video_param"));
            } else {
                videoStreamDescription = LiveVideoPreset.HD_LIVE_VIDEO_PRESET;
            }
            this.mHDLiveVideoPreset = videoStreamDescription;
            if (parseVideoPreset(jSONObject.optJSONObject("sd_video_param")) != null) {
                videoStreamDescription2 = parseVideoPreset(jSONObject.optJSONObject("sd_video_param"));
            } else {
                videoStreamDescription2 = LiveVideoPreset.SD_LIVE_VIDEO_PRESET;
            }
            this.mSDLiveVideoPreset = videoStreamDescription2;
        }
    }

    @Override // com.ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onStreamAdd(RTCStream rTCStream) {
        if (rTCStream != null && rTCStream.userId != this.mLiveRtcExtInfo.interactId && this.mEnableRecvDualStream) {
            this.mRTCStreamMap.put(rTCStream.userId, rTCStream);
            if (this.mRTCStreamMap.size() >= this.mSwitchDualStreamModeThreshold && this.mEnableAutoSwitchDualStreamMode == 1) {
                for (RTCStream rTCStream2 : this.mRTCStreamMap.values()) {
                    subscribeRemoteStream(rTCStream2, 1);
                }
            } else if (this.mEnableAutoSwitchDualStreamMode == 1) {
                subscribeRemoteStream(rTCStream, this.mRemoteDefaultStreamType);
            }
        }
    }

    private void parseLiveRtcVideoParam(JSONObject jSONObject) {
        IRTCEngineEventHandler handler;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("rtc_video_param_mode");
            this.mLiveVideoMode = optInt;
            if (optInt == 1) {
                JSONObject optJSONObject = jSONObject.optJSONObject("rtc_video_param_server_define");
                if (optJSONObject != null) {
                    this.mLiveVideoPreset = parseVideoPreset(optJSONObject);
                }
            } else if (optInt == 2) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("rtc_dual_stream_param");
                if (optJSONObject2 != null) {
                    parseRtcDualStreamParam(optJSONObject2);
                }
            } else if (optInt != 3) {
                LogUtil.e("LiveRtcEngine", "sLiveVideoMode type error, sLiveVideoMode:" + this.mLiveVideoMode);
                RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
                if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                    handler.onError(1216);
                }
                this.mLiveVideoPreset = LiveVideoPreset.DEFAULT_LIVE_VIDEO_PRESET;
            } else {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rtc_video_param_1v1_client");
                if (optJSONObject3 != null) {
                    this.mClientMixVideoPreset = parseVideoPreset(optJSONObject3);
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("rtc_video_param_1v1_server");
                if (optJSONObject4 != null) {
                    this.mServerMixVideoPreset = parseVideoPreset(optJSONObject4);
                }
                if (this.mMixStreamType == 1) {
                    this.mLiveVideoPreset = this.mClientMixVideoPreset;
                } else {
                    this.mLiveVideoPreset = this.mServerMixVideoPreset;
                }
            }
            parseRtcMixParam(jSONObject.optJSONObject("rtc_mix_param"));
        }
    }

    private int parseRTCExtInfo(String str) {
        IRTCEngineEventHandler handler;
        LogUtil.i("LiveRtcEngine", "rtcExtInfo:".concat(String.valueOf(str)));
        if (str == null || str.equals("")) {
            RTCHandlerProxy rTCHandlerProxy = this.mHandlerProxy;
            if (!(rTCHandlerProxy == null || (handler = rTCHandlerProxy.getHandler()) == null)) {
                this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$3(handler));
            }
            return -1;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                String str2 = this.mAppId;
                if (str2 == null) {
                    this.mAppId = optJSONObject.optString("rtc_app_id");
                } else if (!str2.equals(optJSONObject.optString("rtc_app_id"))) {
                    this.mWorkExecutor.execute(new LiveRTCEngine$$Lambda$4(this));
                }
                this.mLiveRtcExtInfo.token = optJSONObject.optString("rtc_token");
                this.mLiveRtcExtInfo.vendor = optJSONObject.optInt("rtc_vendor");
                this.mLiveRtcExtInfo.appSignature = Base64.decode(optJSONObject.optString("rtc_app_sign"), 0);
                this.mLiveRtcExtInfo.channelId = optJSONObject.optString("rtc_channel_id");
                this.mLiveRtcExtInfo.interactId = optJSONObject.optString("rtc_user_id");
                this.mLiveRtcExtInfo.interactIdMode = optJSONObject.optInt("rtc_user_id_mode");
                this.mLiveRtcExtInfo.vendorName = "byte";
                this.mLiveRtcExtInfo.userId = optJSONObject.optString("user_id");
            }
            parseLiveRtcVideoParam(jSONObject.optJSONObject("live_rtc_video_param"));
            parseLiveRtcOther(jSONObject.optJSONObject("rtc_other"));
            this.mLiveRtcExtInfo.businessId = jSONObject.optString("rtc_business_id");
            LogUtil.i("LiveRtcEngine", "rtcExtInfo:" + str + " sAppID:" + this.mAppId + " sToken:" + this.mLiveRtcExtInfo.token + " rtc_vendor" + this.mLiveRtcExtInfo.vendor + " rtc_app_sign:" + this.mLiveRtcExtInfo.appSignature + " mChannelId:" + this.mLiveRtcExtInfo.channelId + " mUserId" + this.mLiveRtcExtInfo.interactId + " mEnableInteractIdIntMode" + this.mLiveRtcExtInfo.interactIdMode + " mTraceId" + this.mLiveRtcExtInfo.userId);
            return 0;
        } catch (JSONException e2) {
            LogUtil.w("LiveRtcEngine", "parseRTCExtInfo happen exception" + e2.getStackTrace().toString());
            return -1;
        }
    }

    private int subscribeRemoteStream(RTCStream rTCStream, int i2) {
        if (rTCStream == null) {
            return -1;
        }
        SubscribeConfig subscribeConfig = new SubscribeConfig();
        subscribeConfig.subAudio = true;
        subscribeConfig.subVideo = true;
        subscribeConfig.isScreen = rTCStream.isScreen;
        subscribeConfig.videoIndex = getStreamIndexFromRTCStream(rTCStream, i2);
        subscribeStream(rTCStream.userId, subscribeConfig);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine, com.ss.bytertc.engine.engineimpl.RTCEngineImpl
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        if (!(this.mLiveRtcExtInfo.mixMaxBitrateKbps <= 0 || liveTranscoding == null || liveTranscoding.getVideo() == null)) {
            liveTranscoding.getVideo().setKBitRate(this.mLiveRtcExtInfo.mixMaxBitrateKbps);
        }
        super.startLiveTranscoding(liveTranscoding, iLiveTranscodingObserver);
    }

    public int configureEngine(LiveInfo liveInfo, IRTCEngineEventHandler iRTCEngineEventHandler) {
        int i2 = liveInfo.mixType;
        this.mMixStreamType = i2;
        if (3 == this.mLiveVideoMode) {
            if (1 == i2) {
                this.mLiveVideoPreset = this.mClientMixVideoPreset;
            } else {
                this.mLiveVideoPreset = this.mServerMixVideoPreset;
            }
        }
        if (!(this.mLiveRtcExtInfo.businessId == null || this.mLiveRtcExtInfo.businessId == "")) {
            setBusinessId(this.mLiveRtcExtInfo.businessId);
        }
        configVideoParam();
        return 0;
    }

    @Override // com.ss.bytertc.engine.livertc.ILiveRtcEventObserver
    public void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason) {
        this.mRTCStreamMap.remove(rTCStream.userId);
        if (rTCStream.userId != this.mLiveRtcExtInfo.interactId && this.mEnableRecvDualStream && this.mRTCStreamMap.size() < this.mSwitchDualStreamModeThreshold && this.mEnableAutoSwitchDualStreamMode == 1) {
            for (RTCStream rTCStream2 : this.mRTCStreamMap.values()) {
                subscribeRemoteStream(rTCStream2, this.mRemoteDefaultStreamType);
            }
        }
    }

    public static Object com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(8208);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8208);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private int getStreamIndexFromRTCStream(RTCStream rTCStream, int i2) {
        int i3 = 0;
        int intValue = ((Integer) rTCStream.videoStreamDescriptions.get(0).videoSize.first).intValue() * ((Integer) rTCStream.videoStreamDescriptions.get(0).videoSize.second).intValue();
        if (i2 == 0) {
            for (VideoStreamDescription videoStreamDescription : rTCStream.videoStreamDescriptions) {
                if (((Integer) videoStreamDescription.videoSize.first).intValue() * ((Integer) videoStreamDescription.videoSize.second).intValue() > intValue) {
                    intValue = ((Integer) videoStreamDescription.videoSize.first).intValue() * ((Integer) videoStreamDescription.videoSize.second).intValue();
                    i3 = rTCStream.videoStreamDescriptions.indexOf(videoStreamDescription);
                }
            }
        } else if (i2 == 1) {
            for (VideoStreamDescription videoStreamDescription2 : rTCStream.videoStreamDescriptions) {
                if (((Integer) videoStreamDescription2.videoSize.first).intValue() * ((Integer) videoStreamDescription2.videoSize.second).intValue() < intValue) {
                    intValue = ((Integer) videoStreamDescription2.videoSize.first).intValue() * ((Integer) videoStreamDescription2.videoSize.second).intValue();
                    i3 = rTCStream.videoStreamDescriptions.indexOf(videoStreamDescription2);
                }
            }
        }
        return i3;
    }

    public LiveRTCEngine(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj, JSONObject jSONObject) {
        super(context, getAppId(str), iRTCEngineEventHandler, obj, parseEngineParameters(str));
        setRtcEngineEventHandler(iRTCEngineEventHandler);
        setRtcExtInfo(str);
        this.mContext = context;
        this.mRtcPhoneStateListener = new RTCPhoneStateListener(context, this);
        this.mWorkExecutor = com_ss_bytertc_engine_livertc_LiveRTCEngine_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor(new LiveRTCEngine$$Lambda$0(this));
    }
}
