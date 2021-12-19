package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.d.b;
import com.bytedance.android.d.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class RoomPlayer implements b {
    private a entranceParam = null;
    private boolean isBackground;
    private a mAudioFocusController;
    private final b.a mCallback;
    private final Context mContext;
    private int mDecodeStatus;
    private String mDefaultResolution;
    private k mLivePlayController;
    private final d mLogger = new e();
    private String mMediaErrorMessage;
    private String mPullStreamData;
    private com.bytedance.android.livesdkapi.view.d mRenderView;
    private final s.a mSrConfig;
    private boolean mStopOnPlayingOther;
    private final i mStreamType;
    private String mStreamUrl;
    private boolean openSEI = true;
    private String sdkParams;

    static {
        Covode.recordClassIndex(8424);
    }

    public long getPlayerFirstFrameTime() {
        return 0;
    }

    public long getPlayerStartTime() {
        return 0;
    }

    @Override // com.bytedance.android.d.b
    public long getStartTime() {
        return 0;
    }

    public boolean hasWarmedUp() {
        return false;
    }

    @Override // com.bytedance.android.d.b
    public boolean pipResumePlay() {
        return false;
    }

    @Override // com.bytedance.android.d.b
    public void recycle() {
    }

    @Override // com.bytedance.android.d.b
    public void setEnterRoomScene(String str) {
    }

    @Override // com.bytedance.android.d.b
    public void setReusePlayer(boolean z, String str) {
    }

    @Override // com.bytedance.android.d.b
    public void tryToStartAudioDevice() {
    }

    @Override // com.bytedance.android.d.b
    public void tryToUploadFirstScreenTime() {
    }

    @Override // com.bytedance.android.d.b
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // com.bytedance.android.d.b
    public d getLogger() {
        return this.mLogger;
    }

    @Override // com.bytedance.android.d.b
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    @Override // com.bytedance.android.d.b
    public long getAudioLostFocusTime() {
        a aVar = this.mAudioFocusController;
        if (aVar == null) {
            return -1;
        }
        return aVar.f15222d;
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
    public void onForeground() {
        this.isBackground = false;
        a aVar = this.mAudioFocusController;
        if (aVar != null) {
            aVar.a(false);
            this.mAudioFocusController.a(this.mContext);
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
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
        a aVar = new a(str, str2, str3);
        this.entranceParam = aVar;
        this.mLivePlayController.a(aVar);
    }

    @Override // com.bytedance.android.d.b
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
            return true;
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            doStartPlayByStreamUrl();
            return true;
        }
    }

    private void doStartPlayByMultiPullStreamData() {
        g.d dVar;
        this.isBackground = false;
        com.bytedance.android.live.core.c.a.a(3, "RoomPlayer", "play stream data: " + this.mPullStreamData + ", streamType: " + this.mStreamType);
        this.mAudioFocusController.a(this.mContext);
        try {
            k kVar = this.mLivePlayController;
            String str = this.mPullStreamData;
            String str2 = this.mDefaultResolution;
            com.bytedance.android.livesdkapi.view.d dVar2 = this.mRenderView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                dVar = null;
            } else {
                g.d.a aVar = new g.d.a();
                aVar.f22957a = this.mSrConfig.f23192a;
                aVar.f22958b = this.mSrConfig.f23193b;
                aVar.f22959c = this.mSrConfig.f23194c;
                dVar = aVar.a();
            }
            kVar.a(str, str2, dVar2, ordinal, dVar, new t(this));
        } catch (Exception e2) {
            e2.printStackTrace();
            this.mCallback.a(e2);
        }
    }

    private void doStartPlayByStreamUrl() {
        g.d dVar;
        com.bytedance.android.live.core.c.a.a(3, "RoomPlayer", "play url: " + this.mStreamUrl + ", streamType: " + this.mStreamType);
        this.mAudioFocusController.a(this.mContext);
        try {
            k kVar = this.mLivePlayController;
            String str = this.mStreamUrl;
            com.bytedance.android.livesdkapi.view.d dVar2 = this.mRenderView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                dVar = null;
            } else {
                g.d.a aVar = new g.d.a();
                aVar.f22957a = this.mSrConfig.f23192a;
                aVar.f22958b = this.mSrConfig.f23193b;
                aVar.f22959c = this.mSrConfig.f23194c;
                dVar = aVar.a();
            }
            kVar.a(str, dVar2, ordinal, dVar, new s(this), this.sdkParams);
        } catch (Exception e2) {
            e2.printStackTrace();
            this.mCallback.a(e2);
        }
    }

    @Override // com.bytedance.android.d.b
    public boolean start() {
        if (this.mLivePlayController != null) {
            return true;
        }
        setLivePlayEntranceParamFromConfig();
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            k livePlayController = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
            this.mLivePlayController = livePlayController;
            livePlayController.c(this.openSEI);
            this.mAudioFocusController = new a(this.mLivePlayController);
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            k livePlayController2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
            this.mLivePlayController = livePlayController2;
            livePlayController2.c(this.openSEI);
            this.mAudioFocusController = new a(this.mLivePlayController);
            doStartPlayByStreamUrl();
        }
        return true;
    }

    @Override // com.bytedance.android.d.b
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mPullStreamData) && TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        }
        this.mLivePlayController = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController();
        com.bytedance.android.livesdk.chatroom.g.d.a("RoomPlayer", "release player -> release the internal LivePlayer, it will be recreated when you start");
        this.mLivePlayController.j();
        this.mLivePlayController.c(true);
        this.mAudioFocusController = new a(this.mLivePlayController);
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15213a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.d.b
    public void setSeiOpen(boolean z) {
        this.openSEI = z;
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

    @Override // com.bytedance.android.d.b
    public void setMute(boolean z) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.a(z, this.mContext);
        }
    }

    @Override // com.bytedance.android.d.b
    public void stopWhenJoinInteract(Context context) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.b(context);
        }
    }

    @Override // com.bytedance.android.d.b
    public void stopWhenPlayingOther(Context context) {
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.f(context);
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

    @Override // com.bytedance.android.d.b
    public void stop(boolean z) {
        a aVar = this.mAudioFocusController;
        if (aVar != null) {
            if (z) {
                aVar.b(this.mContext);
            } else {
                com.bytedance.android.livesdk.utils.d.b(aVar.f15220b);
            }
            this.mAudioFocusController = null;
        }
        k kVar = this.mLivePlayController;
        if (kVar != null) {
            kVar.a(this.mContext);
            if (z) {
                this.mLivePlayController.e(this.mContext);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(g.b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (AnonymousClass1.f15213a[bVar.ordinal()]) {
                case 1:
                    this.mCallback.k();
                    return;
                case 2:
                    this.mCallback.k();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.a(g.b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    return;
                case 3:
                    this.mDecodeStatus = 1;
                    if (!this.isBackground) {
                        this.mAudioFocusController.a(this.mContext);
                    }
                    this.mCallback.l();
                    return;
                case 4:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.b(this.mContext);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    this.mStopOnPlayingOther = true;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    this.mCallback.a(obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.mCallback.m();
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                default:
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.a(65535 & parseInt, parseInt >> 16);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    this.mCallback.n();
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    this.mCallback.o();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (obj != null) {
                        this.mCallback.a(obj.toString());
                        return;
                    }
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doStartPlayByStreamUrl$0$RoomPlayer(g.b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (AnonymousClass1.f15213a[bVar.ordinal()]) {
                case 1:
                    this.mCallback.k();
                    return;
                case 2:
                    this.mCallback.k();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.a(g.b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    return;
                case 3:
                    this.mDecodeStatus = 1;
                    this.mAudioFocusController.a(this.mContext);
                    this.mCallback.l();
                    return;
                case 4:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.b(this.mContext);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    this.mStopOnPlayingOther = true;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    this.mCallback.a(obj);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.mCallback.m();
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                default:
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.a(65535 & parseInt, parseInt >> 16);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    this.mCallback.o();
                    return;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    if (obj != null) {
                        this.mCallback.a(obj.toString());
                        return;
                    }
                    return;
            }
        }
    }

    public RoomPlayer(String str, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str2) {
        this.mStreamUrl = str;
        this.mSrConfig = aVar;
        this.mStreamType = iVar;
        this.mRenderView = dVar;
        this.mCallback = aVar2;
        this.mContext = context;
        this.sdkParams = str2;
    }

    public RoomPlayer(String str, String str2, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context) {
        this.mPullStreamData = str;
        this.mDefaultResolution = str2;
        this.mSrConfig = aVar;
        this.mStreamType = iVar;
        this.mRenderView = dVar;
        this.mCallback = aVar2;
        this.mContext = context;
    }
}
