package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.d.b;
import com.bytedance.android.d.c;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableSmoothEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableFeedLiveCardReusePlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowBackgroundBelowVideoExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class RoomPlayer2 implements c {
    public String enterRoomScene;
    private com.bytedance.android.livesdkapi.depend.model.c.a entranceParam = null;
    public boolean isBackground;
    private boolean isReusePlayer = false;
    private boolean isReusePlayerWithFirstFrame = true;
    public a mAudioFocusController;
    private WeakReference<b.a> mCallbackRef;
    private c.a mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached = false;
    private boolean mHasWarmedUp = false;
    public k mLivePlayController;
    public v mLogger = new v();
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public String mMediaErrorMessage;
    public List<a> mPendingCallbacks = new ArrayList();
    private Runnable mPendingMessageRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8427);
        }

        public final void run() {
            if (RoomPlayer2.this.mPendingCallbacks != null && RoomPlayer2.this.mPendingCallbacks.size() > 0) {
                for (a aVar : RoomPlayer2.this.mPendingCallbacks) {
                    RoomPlayer2.this.mPlayMessageListener.a(aVar.f15217a, aVar.f15218b);
                    d.a("RoomPlayer2", "execute pending message runnable -> message = " + aVar.f15217a.name());
                }
                RoomPlayer2.this.mPendingCallbacks.clear();
            }
        }
    };
    public g.c mPlayMessageListener = new g.e() {
        /* class com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.AnonymousClass2 */

        static {
            Covode.recordClassIndex(8428);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.g.e
        public final void a() {
            RoomPlayer2.this.playerStartTime = System.currentTimeMillis();
            RoomPlayer2.this.mLogger.a("sdk_player_start", Long.valueOf(RoomPlayer2.this.playerStartTime));
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.g.e
        public final void b() {
            RoomPlayer2.this.playerFirstFrameTime = System.currentTimeMillis();
            RoomPlayer2.this.mLogger.a("sdk_player_first_frame", Long.valueOf(RoomPlayer2.this.playerFirstFrameTime));
            if (ShowBackgroundBelowVideoExperiment.INSTANCE.isEnable() && !TextUtils.equals(RoomPlayer2.this.enterRoomScene, "inner_draw")) {
                RoomPlayer2.this.mLogger.a("first_frame", Long.valueOf(RoomPlayer2.this.playerFirstFrameTime));
            }
            com.bytedance.android.live.core.c.a.a(4, "RoomPlayer2", " first frame ");
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.g.c
        public final void a(g.b bVar, Object obj) {
            if (RoomPlayer2.this.mAudioFocusController != null && RoomPlayer2.this.mLivePlayController != null) {
                b.a callback = RoomPlayer2.this.getCallback();
                d.a("RoomPlayer2", "onPlayerMessage -> message is " + bVar.name());
                if (callback != null) {
                    switch (AnonymousClass3.f15216a[bVar.ordinal()]) {
                        case 1:
                            callback.k();
                            return;
                        case 2:
                            callback.k();
                            if (obj != null) {
                                RoomPlayer2.this.mMediaErrorMessage = obj.toString();
                            }
                            if (RoomPlayer2.this.mDecodeStatus != 1) {
                                RoomPlayer2.this.mDecodeStatus = 2;
                                callback.a(g.b.MEDIA_ERROR.ordinal(), RoomPlayer2.this.mMediaErrorMessage);
                                return;
                            }
                            return;
                        case 3:
                            RoomPlayer2.this.mDecodeStatus = 1;
                            if (!RoomPlayer2.this.isBackground) {
                                if (!RoomPlayer2.this.multiPlayer) {
                                    RoomPlayer2.this.mAudioFocusController.a(RoomPlayer2.this.getTagContext(), RoomPlayer2.this.mPlayerTag);
                                } else if (((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a() == RoomPlayer2.this.mLivePlayController) {
                                    RoomPlayer2.this.mAudioFocusController.a(RoomPlayer2.this.getTagContext(), RoomPlayer2.this.mPlayerTag);
                                }
                            }
                            RoomPlayer2.this.mLogger.a("first_frame");
                            RoomPlayer2.this.mLogger.a("on_display_callback");
                            RoomPlayer2.this.mLogger.a();
                            com.bytedance.android.live.core.c.a.a(4, "RoomPlayer2", "DISPLAYED_PLAY");
                            callback.l();
                            return;
                        case 4:
                            RoomPlayer2.this.mStopOnPlayingOther = true;
                            RoomPlayer2.this.mAudioFocusController.b(null, RoomPlayer2.this.mPlayerTag);
                            return;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            RoomPlayer2.this.mStopOnPlayingOther = true;
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            callback.a(obj);
                            return;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            callback.m();
                            return;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        default:
                            return;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            int parseInt = Integer.parseInt((String) obj);
                            callback.a(65535 & parseInt, parseInt >> 16);
                            return;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            callback.n();
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            callback.o();
                            return;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            if (obj != null) {
                                callback.a(obj.toString());
                                return;
                            }
                            return;
                    }
                } else if (!RoomPlayer2.this.mHasAttached) {
                    for (a aVar : RoomPlayer2.this.mPendingCallbacks) {
                        if (aVar.f15217a == bVar) {
                            aVar.f15218b = obj;
                            d.a("RoomPlayer2", "onPlayerMessage -> replace pending message: " + bVar.toString());
                            return;
                        }
                    }
                    if (bVar == g.b.DISPLAYED_PLAY) {
                        RoomPlayer2.this.mPendingCallbacks.add(0, new a(bVar, obj));
                    } else {
                        RoomPlayer2.this.mPendingCallbacks.add(new a(bVar, obj));
                    }
                    d.a("RoomPlayer2", "onPlayerMessage -> add pending message: " + bVar.name());
                }
            }
        }
    };
    public String mPlayerTag;
    private WeakReference<com.bytedance.android.livesdkapi.view.d> mRenderViewRef;
    public boolean mStopOnPlayingOther;
    private WeakReference<Context> mTagContextRef;
    public boolean multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    public long playerFirstFrameTime;
    public long playerStartTime;
    private String reusePlayerTag = null;
    private long roomId;
    private long startTime;

    static {
        Covode.recordClassIndex(8426);
    }

    @Override // com.bytedance.android.d.b
    public void setSeiOpen(boolean z) {
    }

    @Override // com.bytedance.android.d.b
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // com.bytedance.android.d.b
    public v getLogger() {
        return this.mLogger;
    }

    @Override // com.bytedance.android.d.b
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getPlayerFirstFrameTime() {
        return this.playerFirstFrameTime;
    }

    public long getPlayerStartTime() {
        return this.playerStartTime;
    }

    @Override // com.bytedance.android.d.c
    public String getPlayerTag() {
        return this.mPlayerTag;
    }

    public long getRoomId() {
        return this.roomId;
    }

    @Override // com.bytedance.android.d.b
    public long getStartTime() {
        return this.startTime;
    }

    public boolean hasWarmedUp() {
        return this.mHasWarmedUp;
    }

    @Override // com.bytedance.android.d.b
    public boolean pipResumePlay() {
        return doStart();
    }

    @Override // com.bytedance.android.d.b
    public void recycle() {
        x.a().a(this);
    }

    @Override // com.bytedance.android.d.c
    public boolean warmUp() {
        this.mHasWarmedUp = true;
        return start();
    }

    private com.bytedance.android.livesdkapi.view.d getRenderView() {
        WeakReference<com.bytedance.android.livesdkapi.view.d> weakReference = this.mRenderViewRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.bytedance.android.d.b
    public long getAudioLostFocusTime() {
        a aVar = this.mAudioFocusController;
        if (aVar == null) {
            return -1;
        }
        return aVar.f15222d;
    }

    public b.a getCallback() {
        WeakReference<b.a> weakReference = this.mCallbackRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Context getTagContext() {
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.bytedance.android.d.c
    public boolean isPlaying() {
        k kVar = this.mLivePlayController;
        if (kVar == null || !kVar.l()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.d.b
    public boolean isVideoHorizontal() {
        k kVar = this.mLivePlayController;
        if (kVar == null || !kVar.a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.d.b
    public void onBackground() {
        this.isBackground = true;
        a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.bytedance.android.d.b
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    @Override // com.bytedance.android.d.b
    public void tryToStartAudioDevice() {
        a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.a(getTagContext(), this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.d.b
    public void onForeground() {
        this.isBackground = false;
        a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.a(false);
            this.mAudioFocusController.a(getTagContext(), this.mPlayerTag);
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
        if (this.mLivePlayController != null) {
            EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
            String str = enterRoomConfig.f23299c.J;
            String str2 = enterRoomConfig.f23299c.L;
            String str3 = enterRoomConfig.f23299c.M;
            if (m.a(str3)) {
                if (enterRoomConfig.f23298b.w > 0) {
                    str3 = "draw";
                } else {
                    str3 = "click";
                }
            }
            com.bytedance.android.livesdkapi.depend.model.c.a aVar = new com.bytedance.android.livesdkapi.depend.model.c.a(str, str2, str3);
            this.entranceParam = aVar;
            this.mLivePlayController.a(aVar);
        }
    }

    @Override // com.bytedance.android.d.b
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.f6853i == 0) {
            return false;
        }
        this.mLivePlayController = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
        d.a("RoomPlayer2", "release player -> release the internal LivePlayer, it will be recreated when you start");
        this.mLivePlayController.j();
        this.mLivePlayController.c(true);
        this.mAudioFocusController = new a(this.mLivePlayController);
        return doStart();
    }

    @Override // com.bytedance.android.d.b
    public void tryToUploadFirstScreenTime() {
        if (this.mLogger.c("first_frame")) {
            v vVar = this.mLogger;
            vVar.a("player_first_frame_render_end", Long.valueOf(vVar.b("start")));
            v vVar2 = this.mLogger;
            vVar2.a("sdk_player_first_frame", Long.valueOf(vVar2.b("start")));
            v vVar3 = this.mLogger;
            vVar3.a("first_frame", Long.valueOf(vVar3.b("start")));
        }
        this.mLogger.a();
    }

    private void doStartPlayByMultiPullStreamData() {
        if (this.mConfig != null) {
            d.a("RoomPlayer2", "play stream data: " + this.mConfig.f6846b + ", streamType: " + this.mConfig.f6850f);
            g.d dVar = null;
            try {
                if (this.mConfig.f6851g != null) {
                    g.d.a aVar = new g.d.a();
                    aVar.f22957a = this.mConfig.f6851g.f23192a;
                    aVar.f22958b = this.mConfig.f6851g.f23193b;
                    aVar.f22959c = this.mConfig.f6851g.f23194c;
                    dVar = aVar.a();
                }
                this.mLivePlayController.a(this.mConfig.f6846b, this.mConfig.f6847c, getRenderView(), this.mConfig.f6850f.ordinal(), dVar, this.mPlayMessageListener, this.mPlayerTag);
            } catch (Exception e2) {
                e2.printStackTrace();
                b.a callback = getCallback();
                if (callback != null) {
                    callback.a(e2);
                }
            }
        }
    }

    private void doStartPlayByStreamUrl() {
        if (this.mConfig != null) {
            d.a("RoomPlayer2", "play url: " + this.mConfig.f6848d + ", streamType: " + this.mConfig.f6850f);
            g.d dVar = null;
            try {
                if (this.mConfig.f6851g != null) {
                    g.d.a aVar = new g.d.a();
                    aVar.f22957a = this.mConfig.f6851g.f23192a;
                    aVar.f22958b = this.mConfig.f6851g.f23193b;
                    aVar.f22959c = this.mConfig.f6851g.f23194c;
                    dVar = aVar.a();
                }
                this.mLivePlayController.a(this.mConfig.f6848d, getRenderView(), this.mConfig.f6850f.ordinal(), dVar, this.mPlayMessageListener, this.mConfig.f6849e, this.mPlayerTag);
            } catch (Exception e2) {
                e2.printStackTrace();
                b.a callback = getCallback();
                if (callback != null) {
                    callback.a(e2);
                }
            }
        }
    }

    private void reusePlayerAndBgOptRecordFirstFrame() {
        if (!this.isReusePlayer) {
            return;
        }
        if (EnableFeedLiveCardReusePlayerSetting.INSTANCE.getValue() && !this.isReusePlayerWithFirstFrame) {
            return;
        }
        if (EnableSmoothEnterRoomSetting.INSTANCE.getValue() == 1) {
            v vVar = this.mLogger;
            vVar.a("player_first_frame_render_end", Long.valueOf(vVar.b("start")));
            v vVar2 = this.mLogger;
            vVar2.a("sdk_player_first_frame", Long.valueOf(vVar2.b("start")));
            v vVar3 = this.mLogger;
            vVar3.a("first_frame", Long.valueOf(vVar3.b("start")));
        } else if (EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue()) {
            this.mLogger.a("first_frame", Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.bytedance.android.d.c
    public void release() {
        d.a("RoomPlayer2", "release -> roomPlayer release and reset param");
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.reusePlayerTag = null;
        this.isReusePlayerWithFirstFrame = true;
        this.startTime = 0;
        this.playerStartTime = 0;
        this.playerFirstFrameTime = 0;
        this.mPlayerTag = null;
        this.roomId = 0;
        this.entranceParam = null;
        this.enterRoomScene = null;
        v vVar = this.mLogger;
        vVar.f15315a.clear();
        vVar.f15317c = null;
        vVar.f15316b = null;
        vVar.f15318d = false;
        vVar.f15321g = false;
        vVar.f15319e = false;
        vVar.f15320f = false;
        this.mConfig = null;
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference != null) {
            weakReference.clear();
            this.mTagContextRef = null;
        }
        WeakReference<b.a> weakReference2 = this.mCallbackRef;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.mCallbackRef = null;
        }
        WeakReference<com.bytedance.android.livesdkapi.view.d> weakReference3 = this.mRenderViewRef;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.mRenderViewRef = null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15216a;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.AnonymousClass3.<clinit>():void");
        }
    }

    private boolean doStart() {
        boolean z;
        this.mLogger.f15318d = this.mHasWarmedUp;
        this.mLogger.f15319e = this.isReusePlayer;
        setLivePlayEntranceParamFromConfig();
        if (this.isReusePlayer && this.mLivePlayController != null && EnableFeedLiveCardReusePlayerSetting.INSTANCE.getValue()) {
            this.isReusePlayerWithFirstFrame = this.mLivePlayController.f();
        }
        if (this.multiPlayer && this.mLivePlayController != null) {
            ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(this.mPlayerTag, this.mLivePlayController);
        }
        if (this.mConfig.f6853i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            this.startTime = currentTimeMillis;
            this.mLogger.a("room_player_start", Long.valueOf(currentTimeMillis));
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByMultiPullStreamData();
        } else if (this.mConfig.f6853i != 2) {
            return false;
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.startTime = currentTimeMillis2;
            this.mLogger.a("room_player_start", Long.valueOf(currentTimeMillis2));
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByStreamUrl();
        }
        return true;
    }

    @Override // com.bytedance.android.d.b
    public boolean start() {
        if (TestDisablePullStreamSetting.INSTANCE.getValue()) {
            return true;
        }
        if (this.mConfig == null || this.mLivePlayController != null) {
            reusePlayerAndBgOptRecordFirstFrame();
            return true;
        }
        if (this.multiPlayer && this.isReusePlayer && !m.a(this.reusePlayerTag)) {
            ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(this.reusePlayerTag, this.mPlayerTag);
        }
        k a2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(this.mPlayerTag);
        this.mLivePlayController = a2;
        a2.a(new u(((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayerLog(), this));
        this.mLivePlayController.c(this.mConfig.f6852h);
        if (this.mHasWarmedUp) {
            HashMap hashMap = new HashMap();
            hashMap.put("has_warmed_up", "1");
            this.mLivePlayController.a(hashMap);
        }
        this.mAudioFocusController = new a(this.mLivePlayController);
        return doStart();
    }

    @Override // com.bytedance.android.d.b
    public void changeSRSupportScene(boolean z) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.d(z);
        }
    }

    @Override // com.bytedance.android.d.b
    public void setAnchorInteractMode(boolean z) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.a(z);
        }
    }

    @Override // com.bytedance.android.d.b
    public void setEnterRoomScene(String str) {
        if (str != null) {
            this.enterRoomScene = str;
        }
    }

    @Override // com.bytedance.android.d.b
    public void setScreenOrientation(boolean z) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.b(z);
        }
    }

    @Override // com.bytedance.android.d.b
    public void switchResolution(String str) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.f(str);
        }
    }

    @Override // com.bytedance.android.d.c
    public boolean preCreatedSurface(Context context) {
        boolean g2 = this.mLivePlayController.g(context);
        this.mLogger.f15320f = g2;
        return g2;
    }

    @Override // com.bytedance.android.d.b
    public void setMute(boolean z) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.a(z, this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.d.b
    public void stopWhenJoinInteract(Context context) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.e(this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.d.b
    public void stopWhenPlayingOther(Context context) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.c(this.mPlayerTag);
        }
    }

    @Override // com.bytedance.android.d.b
    public void getVideoSize(int[] iArr) {
        k kVar = this.mLivePlayController;
        if (kVar != null && iArr != null) {
            int k2 = kVar.k();
            iArr[0] = 65535 & k2;
            iArr[1] = k2 >> 16;
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlayerLog(JSONObject jSONObject) {
        v vVar = this.mLogger;
        if (jSONObject != null && TextUtils.equals(jSONObject.optString("event_key"), "first_frame")) {
            for (int i2 = 0; i2 < v.f15313h.length; i2++) {
                String str = v.f15313h[i2];
                long optLong = jSONObject.optLong(v.f15314i[i2], 0);
                if (optLong != 0) {
                    vVar.f15315a.put(str, Long.valueOf(optLong));
                }
            }
        }
    }

    @Override // com.bytedance.android.d.b
    public void stop(boolean z) {
        d.a("RoomPlayer2", "stop -> playerTag=" + this.mPlayerTag + ", needRelease: " + z);
        String str = this.mPlayerTag;
        if (str != null) {
            a aVar = this.mAudioFocusController;
            if (aVar != null) {
                if (z) {
                    aVar.b(null, str);
                } else {
                    com.bytedance.android.livesdk.utils.d.b(aVar.f15220b);
                }
                this.mAudioFocusController = null;
            }
            k kVar = this.mLivePlayController;
            if (kVar != null) {
                kVar.d(this.mPlayerTag);
                if (z) {
                    this.mLivePlayController.b(this.mPlayerTag);
                }
                this.mLivePlayController = null;
            }
            this.mDecodeStatus = 0;
            this.mMediaErrorMessage = null;
            this.mStopOnPlayingOther = false;
            this.mMainHandler.removeCallbacks(this.mPendingMessageRunnable);
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        g.b f15217a;

        /* renamed from: b  reason: collision with root package name */
        Object f15218b;

        static {
            Covode.recordClassIndex(8430);
        }

        a(g.b bVar, Object obj) {
            this.f15217a = bVar;
            this.f15218b = obj;
        }
    }

    @Override // com.bytedance.android.d.b
    public void setReusePlayer(boolean z, String str) {
        this.isReusePlayer = z;
        this.reusePlayerTag = str;
    }

    @Override // com.bytedance.android.d.c
    public void initialize(long j2, c.a aVar) {
        this.roomId = j2;
        this.mConfig = aVar;
        this.mPlayerTag = this.roomId + "_" + SystemClock.uptimeMillis();
    }

    RoomPlayer2(long j2, c.a aVar) {
        initialize(j2, aVar);
    }

    @Override // com.bytedance.android.d.c
    public void attach(Context context, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(aVar);
        this.mRenderViewRef = new WeakReference<>(dVar);
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.a(dVar);
        }
        a aVar2 = this.mAudioFocusController;
        if (aVar2 != null) {
            aVar2.a(context, this.mPlayerTag);
        }
        this.mHasAttached = true;
        if (aVar == null) {
            return;
        }
        if (LivePreCreateSurfaceSetting.INSTANCE.getValue() || (this.isReusePlayer && EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue())) {
            this.mMainHandler.postAtFrontOfQueue(this.mPendingMessageRunnable);
        } else {
            this.mMainHandler.post(this.mPendingMessageRunnable);
        }
    }
}
