package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

public class RTCRoom extends IRTCRoom {
    private boolean mEnableTranscode;
    private LiveTranscoding mLiveTranscoding;
    private long mNativeRtcRoom;
    private long mNativeRtcRoomEventHandler;
    private String mRoom;
    private WeakReference<RTCEngineImpl> mRtcEngine;
    private RTCRoomEventHandler mRtcRoomEventHandler;
    private IRTCRoomEventHandler mRtcRoomHandler;
    private String mUser;

    static {
        Covode.recordClassIndex(100808);
    }

    public static int com_ss_bytertc_engine_RTCRoom_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void publishScreen() {
        MethodCollector.i(7732);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, publishScreen failed.");
            MethodCollector.o(7732);
            return;
        }
        NativeRTCRoomFunctions.nativePublishScreen(j2);
        MethodCollector.o(7732);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void unpublishScreen() {
        MethodCollector.i(7786);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, unpublishScreen failed.");
            MethodCollector.o(7786);
            return;
        }
        NativeRTCRoomFunctions.nativeUnpublishScreen(j2);
        MethodCollector.o(7786);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void destroy() {
        MethodCollector.i(8302);
        LogUtil.d("RtcRoom", "Destroy ");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, Destroy failed.");
            MethodCollector.o(8302);
            return;
        }
        NativeRTCRoomFunctions.nativeDestory(j2);
        this.mNativeRtcRoom = 0;
        NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(this.mNativeRtcRoomEventHandler);
        this.mNativeRtcRoomEventHandler = 0;
        MethodCollector.o(8302);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void leaveRoom() {
        MethodCollector.i(7341);
        LogUtil.d("RtcRoom", "leaveChannel");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
            MethodCollector.o(7341);
            return;
        }
        this.mRoom = "";
        this.mUser = "";
        NativeRTCRoomFunctions.nativeLeaveRoom(j2);
        MethodCollector.o(7341);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void publish() {
        MethodCollector.i(7727);
        LogUtil.d("RtcRoom", "Publish");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, Publish failed.");
            MethodCollector.o(7727);
            return;
        }
        NativeRTCRoomFunctions.nativePublish(j2);
        MethodCollector.o(7727);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void stopLiveTranscoding() {
        MethodCollector.i(8130);
        LogUtil.d("RtcRoom", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, disableLiveTranscoding failed.");
            MethodCollector.o(8130);
            return;
        }
        NativeRTCRoomFunctions.nativeStopLiveTranscoding(j2);
        MethodCollector.o(8130);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void unpublish() {
        MethodCollector.i(7730);
        LogUtil.d("RtcRoom", "Unpublish");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, Unpublish failed.");
            MethodCollector.o(7730);
            return;
        }
        NativeRTCRoomFunctions.nativeUnpublish(j2);
        MethodCollector.o(7730);
    }

    /* renamed from: com.ss.bytertc.engine.RTCRoom$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType;
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$SubscribeMediaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|(2:27|28)|29|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|(2:21|22)|23|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009e */
        static {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.RTCRoom.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void enableSubscribeLocalStream(boolean z) {
        MethodCollector.i(7892);
        LogUtil.d("RtcRoom", "enableSubscribeLocalStream: ".concat(String.valueOf(z)));
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
            MethodCollector.o(7892);
            return;
        }
        NativeRTCRoomFunctions.nativeEnableSubscribeLocalStream(j2, z);
        MethodCollector.o(7892);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void muteAllRemoteAudio(MuteState muteState) {
        MethodCollector.i(7951);
        LogUtil.d("RtcRoom", "muteAllRemoteAudio...");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteAudio failed.");
            MethodCollector.o(7951);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteAllRemoteAudio(j2, muteState.value());
        MethodCollector.o(7951);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void muteAllRemoteVideo(MuteState muteState) {
        boolean z;
        MethodCollector.i(8201);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcRoom", "muteAllRemoteVideoStreams ,is muted:".concat(String.valueOf(z)));
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, MuteAllRemoteVideoStreams failed.");
            MethodCollector.o(8201);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteAllRemoteVideo(j2, muteState.value());
        MethodCollector.o(8201);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r3 != 3) goto L_0x002f;
     */
    @Override // com.ss.bytertc.engine.IRTCRoom
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pauseAllSubscribedStream(com.ss.bytertc.engine.RTCEngine.PauseResumeControlMediaType r8) {
        /*
            r7 = this;
            r6 = 7956(0x1f14, float:1.1149E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r5 = "RtcRoom"
            java.lang.String r0 = "pauseAllSubscribedStream..."
            com.ss.bytertc.engine.utils.LogUtil.d(r5, r0)
            long r3 = r7.mNativeRtcRoom
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "native rtcroom is invalid, pauseAllSubscribedStream failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r5, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x001d:
            int[] r1 = com.ss.bytertc.engine.RTCRoom.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType
            int r0 = r8.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x002f
            if (r3 == r2) goto L_0x0039
            r0 = 3
            if (r3 == r0) goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            long r0 = r7.mNativeRtcRoom
            com.ss.bytertc.engine.NativeRTCRoomFunctions.nativePauseAllSubscribedStream(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0039:
            r2 = 1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.RTCRoom.pauseAllSubscribedStream(com.ss.bytertc.engine.RTCEngine$PauseResumeControlMediaType):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r3 != 3) goto L_0x002f;
     */
    @Override // com.ss.bytertc.engine.IRTCRoom
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resumeAllSubscribedStream(com.ss.bytertc.engine.RTCEngine.PauseResumeControlMediaType r8) {
        /*
            r7 = this;
            r6 = 8012(0x1f4c, float:1.1227E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r5 = "RtcRoom"
            java.lang.String r0 = "resumeAllSubscribedStream..."
            com.ss.bytertc.engine.utils.LogUtil.d(r5, r0)
            long r3 = r7.mNativeRtcRoom
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "native rtcroom is invalid, resumeAllSubscribedStream failed."
            com.ss.bytertc.engine.utils.LogUtil.e(r5, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x001d:
            int[] r1 = com.ss.bytertc.engine.RTCRoom.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$PauseResumeControlMediaType
            int r0 = r8.ordinal()
            r3 = r1[r0]
            r2 = 2
            r1 = 1
            r0 = 0
            if (r3 == r1) goto L_0x002f
            if (r3 == r2) goto L_0x0039
            r0 = 3
            if (r3 == r0) goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            long r0 = r7.mNativeRtcRoom
            com.ss.bytertc.engine.NativeRTCRoomFunctions.nativeResumeAllSubscribedStream(r0, r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return
        L_0x0039:
            r2 = 1
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.RTCRoom.resumeAllSubscribedStream(com.ss.bytertc.engine.RTCEngine$PauseResumeControlMediaType):void");
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void sendRoomBinaryMessage(byte[] bArr) {
        MethodCollector.i(7662);
        LogUtil.d("RtcRoom", "SendRoomBinaryMessage ");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomBinaryMessage failed.");
            MethodCollector.o(7662);
            return;
        }
        NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j2, bArr);
        MethodCollector.o(7662);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void sendRoomMessage(String str) {
        MethodCollector.i(7592);
        LogUtil.d("RtcRoom", "SendRoomMessage ");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomMessage failed.");
            MethodCollector.o(7592);
            return;
        }
        NativeRTCRoomFunctions.nativeSendRoomMessage(j2, str);
        MethodCollector.o(7592);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setAudioVolumeIndicationInterval(int i2) {
        MethodCollector.i(7896);
        LogUtil.d("RtcRoom", "setAudioVolumeIndicationInterval voiderval: ".concat(String.valueOf(i2)));
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, setAudioVolumeIndicationInterval failed.");
            MethodCollector.o(7896);
            return;
        }
        NativeRTCRoomFunctions.nativeSetAudioVolumeIndicationInterval(j2, i2);
        MethodCollector.o(7896);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setCustomUserRole(String str) {
        MethodCollector.i(8249);
        LogUtil.d("RtcRoom", "SetCustomUserRole ");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SetCustomUserRole failed.");
            MethodCollector.o(8249);
            return;
        }
        NativeRTCRoomFunctions.nativeSetCustomUserRole(j2, str);
        MethodCollector.o(8249);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        MethodCollector.i(7243);
        if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native room is invalid, setRTCRoomEventHandler failed.");
            MethodCollector.o(7243);
            return;
        }
        this.mRtcRoomHandler = iRTCRoomEventHandler;
        RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this);
        this.mRtcRoomEventHandler = rTCRoomEventHandler;
        long j2 = this.mNativeRtcRoomEventHandler;
        this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
        if (j2 != 0) {
            NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j2);
        }
        MethodCollector.o(7243);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setUserRole(RTCEngine.ClientRole clientRole) {
        MethodCollector.i(7347);
        LogUtil.d("RtcRoom", "setClientRole. role : ".concat(String.valueOf(clientRole)));
        if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, setClientRole failed.");
            MethodCollector.o(7347);
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ClientRole[clientRole.ordinal()];
        int i3 = 1;
        if (i2 == 1 || i2 != 2) {
            i3 = 2;
        }
        NativeRTCRoomFunctions.nativeSetUserRole(this.mNativeRtcRoom, i3);
        MethodCollector.o(7347);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setUserVisibility(boolean z) {
        MethodCollector.i(7411);
        LogUtil.d("RtcRoom", "setUserVisibility. enable : ".concat(String.valueOf(z)));
        long j2 = this.mNativeRtcRoom;
        if (j2 == -1) {
            LogUtil.e("RtcRoom", "native engine is invalid, setUserVisibility failed.");
            MethodCollector.o(7411);
            return;
        }
        NativeFunctions.nativeSetUserVisibility(j2, z);
        MethodCollector.o(7411);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void updateToken(String str) {
        MethodCollector.i(7471);
        LogUtil.d("RtcRoom", "updateToken. token : ".concat(String.valueOf(str)));
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, updateToken failed.");
            MethodCollector.o(7471);
            return;
        }
        NativeRTCRoomFunctions.nativeUpdateToken(j2, str);
        MethodCollector.o(7471);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void updateLiveTranscoding(LiveTranscoding liveTranscoding) {
        MethodCollector.i(8189);
        LogUtil.d("RtcRoom", "updateLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcRoom", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
            MethodCollector.o(8189);
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, updateLiveTranscoding failed.");
            MethodCollector.o(8189);
        } else {
            liveTranscoding.setAction("layoutChanged");
            String jSONObject = liveTranscoding.getTranscodeMessage().toString();
            LogUtil.d("RtcRoom", "updateLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeRTCRoomFunctions.nativeUpdateLiveTranscoding(this.mNativeRtcRoom, jSONObject);
            MethodCollector.o(8189);
        }
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void unsubscribe(String str, boolean z) {
        MethodCollector.i(7888);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, Unsubscribe failed.");
            MethodCollector.o(7888);
            return;
        }
        NativeRTCRoomFunctions.nativeUnsubscribe(j2, str, z);
        MethodCollector.o(7888);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void muteRemoteAudio(String str, MuteState muteState) {
        MethodCollector.i(8016);
        LogUtil.d("RtcRoom", "MuteRemoteAudio...");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, MuteRemoteAudio failed.");
            MethodCollector.o(8016);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteRemoteAudio(j2, str, muteState.value());
        MethodCollector.o(8016);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void sendUserBinaryMessage(String str, byte[] bArr) {
        MethodCollector.i(7532);
        LogUtil.d("RtcRoom", "SendUserBinaryMessage. uid : " + str + ", message length:" + bArr.length);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserBinaryMessage failed.");
            MethodCollector.o(7532);
            return;
        }
        NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j2, str, bArr);
        MethodCollector.o(7532);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void sendUserMessage(String str, String str2) {
        MethodCollector.i(7477);
        LogUtil.d("RtcRoom", "SendUserMessage. uid : " + str + ", message" + str2);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserMessage failed.");
            MethodCollector.o(7477);
            return;
        }
        NativeRTCRoomFunctions.nativeSendUserMessage(j2, str, str2);
        MethodCollector.o(7477);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setAutoSubscribe(RTCEngine.SubscribeMode subscribeMode, RTCEngine.SubscribeMode subscribeMode2) {
        MethodCollector.i(8298);
        LogUtil.d("RtcRoom", "SetAutoSubscribe ");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SetAutoSubscribe failed.");
            MethodCollector.o(8298);
            return;
        }
        NativeRTCRoomFunctions.nativeSetAutoSubscribe(j2, subscribeMode.value(), subscribeMode2.value());
        MethodCollector.o(8298);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void subscribe(String str, SubscribeConfig subscribeConfig) {
        MethodCollector.i(7788);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, Subscribe failed.");
            MethodCollector.o(7788);
            return;
        }
        NativeRTCRoomFunctions.nativeSubscribe(j2, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
        MethodCollector.o(7788);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void muteRemoteVideo(String str, MuteState muteState) {
        boolean z;
        MethodCollector.i(8246);
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcRoom", "muteRemoteVideoStream, uid: " + str + " ,is muted:" + z);
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, MuteRemoteVideoStream failed.");
            MethodCollector.o(8246);
            return;
        }
        NativeRTCRoomFunctions.nativeMuteRemoteVideo(j2, str, muteState.value());
        MethodCollector.o(8246);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void startLiveTranscoding(LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        MethodCollector.i(8126);
        LogUtil.d("RtcRoom", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcRoom", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
            MethodCollector.o(8126);
        } else if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, enableLiveTranscoding failed.");
            MethodCollector.o(8126);
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.d("RtcRoom", "enableLiveTranscoding...liveTranscodeJson: ".concat(String.valueOf(jSONObject)));
            NativeRTCRoomFunctions.nativeStartLiveTranscoding(this.mNativeRtcRoom, jSONObject, iLiveTranscodingObserver);
            MethodCollector.o(8126);
        }
    }

    public RTCRoom(String str, long j2, RTCEngineImpl rTCEngineImpl) {
        this.mNativeRtcRoom = j2;
        this.mRoom = str;
        this.mRtcEngine = new WeakReference<>(rTCEngineImpl);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void setRemoteVideoCanvas(String str, StreamIndex streamIndex, VideoCanvas videoCanvas) {
        MethodCollector.i(8194);
        LogUtil.d("RtcRoom", "SetupRemoteVideo...");
        long j2 = this.mNativeRtcRoom;
        if (j2 == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, SetupRemoteVideo failed.");
            MethodCollector.o(8194);
            return;
        }
        NativeFunctions.nativeSetRemoteVideoCanvas(j2, str, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode);
        MethodCollector.o(8194);
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void joinRoom(String str, UserInfo userInfo, MultiRoomConfig multiRoomConfig) {
        String uid;
        MethodCollector.i(7242);
        StringBuilder append = new StringBuilder("joinRoom with token: ").append(str).append(",room").append(this.mRoom).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.d("RtcRoom", append.append(uid).toString());
        if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native room is invalid, joinRoom failed.");
            MethodCollector.o(7242);
        } else if (userInfo == null || userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.e("RtcRoom", "userInfo is null");
            MethodCollector.o(7242);
        } else {
            this.mUser = userInfo.getUid();
            NativeRTCRoomFunctions.nativeJoinRoomWithRoomConfig(this.mNativeRtcRoom, str, userInfo, multiRoomConfig);
            MethodCollector.o(7242);
        }
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void joinRoom(String str, UserInfo userInfo, RTCEngine.ChannelProfile channelProfile) {
        String uid;
        MethodCollector.i(7232);
        StringBuilder append = new StringBuilder("joinRoom with token: ").append(str).append(",room").append(this.mRoom).append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LogUtil.d("RtcRoom", append.append(uid).toString());
        if (this.mNativeRtcRoom == 0) {
            LogUtil.e("RtcRoom", "native room is invalid, joinRoom failed.");
            MethodCollector.o(7232);
        } else if (userInfo == null || userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.e("RtcRoom", "userInfo is null");
            MethodCollector.o(7232);
        } else {
            this.mUser = userInfo.getUid();
            int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile[channelProfile.ordinal()];
            int i3 = 3;
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 != 2) {
                if (i2 == 3 || i2 != 4) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            }
            NativeRTCRoomFunctions.nativeJoinRoom(this.mNativeRtcRoom, str, userInfo, i3);
            com_ss_bytertc_engine_RTCRoom_com_ss_android_ugc_aweme_lancet_LogLancet_d("RtcRoom", "joinroom is up");
            MethodCollector.o(7232);
        }
    }

    @Override // com.ss.bytertc.engine.IRTCRoom
    public void subscribeUserStream(String str, StreamIndex streamIndex, RTCEngine.SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        boolean z;
        int i2;
        MethodCollector.i(7838);
        if (streamIndex == StreamIndex.STREAM_INDEX_SCREEN) {
            z = true;
        } else {
            z = false;
        }
        if (subscribeVideoConfig != null) {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                MethodCollector.o(7838);
                return;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$SubscribeMediaType[subscribeMediaType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = 1;
                } else if (i3 == 3) {
                    i2 = 2;
                } else if (i3 == 4) {
                    i2 = 3;
                }
                NativeRTCRoomFunctions.nativeSubscribeUserStream(this.mNativeRtcRoom, str, z, i2, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
            }
            i2 = 0;
            NativeRTCRoomFunctions.nativeSubscribeUserStream(this.mNativeRtcRoom, str, z, i2, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
        }
        MethodCollector.o(7838);
    }
}
