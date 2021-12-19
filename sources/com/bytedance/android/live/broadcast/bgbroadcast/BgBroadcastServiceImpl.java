package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import com.bytedance.android.live.broadcast.api.d.b;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.c.h;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.du;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.session.d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public class BgBroadcastServiceImpl extends com.bytedance.android.livesdkapi.a implements b {
    private static MediaProjection sProjection;
    private static Intent sProjectionIntent;
    private g liveDurationSpentStat;
    private boolean mIsFirstPushStream = true;
    private a mLiveStatus;
    private b mLiveStreamCallback;
    private Room mRoom;
    private com.bytedance.android.live.broadcast.h.b mStatusReport;
    private com.bytedance.android.live.broadcast.stream.c.b mStatusService;
    private a mStrategy;
    private Service mStub;
    private a.AbstractC0499a mUiListener;

    static {
        Covode.recordClassIndex(3744);
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void connected() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onCaptureFirstFrame() {
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onFirstRTMPConnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onNetworkLow() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onNetworkStatus(int i2) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onReconnect() {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onReconnected() {
    }

    public void onStreamEnd(int i2) {
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onStreamEnd(int i2, int i3, String str) {
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public static Intent getProjectionIntent() {
        return sProjectionIntent;
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void startAudio() {
        a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void stopAudio() {
        a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void stopService() {
        this.mStub.stopSelf();
    }

    private long getRoomId() {
        Room room = this.mRoom;
        if (room != null) {
            return room.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void beforeLiveCoreStartStream() {
        g gVar = this.liveDurationSpentStat;
        if (gVar != null) {
            gVar.f7773b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.livesdkapi.a
    public boolean isLiveFinished() {
        if (this.mLiveStatus == a.FINISHED) {
            return true;
        }
        return false;
    }

    private long getUserId() {
        if (u.a().b() != null) {
            return u.a().b().c();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public enum a {
        IDLE,
        LIVING,
        FINISHED;

        static {
            Covode.recordClassIndex(3745);
        }
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void startBgActivity() {
        if (this.mStub != null) {
            Intent intent = new Intent(this.mStub, ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getHostActivity(6));
            intent.addFlags(268435456);
            com_bytedance_android_live_broadcast_bgbroadcast_BgBroadcastServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(y.e(), intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void onCreate() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        this.mRoom = room;
        if (!Room.isValid(room)) {
            this.mStub.stopSelf();
            return;
        }
        com.bytedance.android.live.broadcast.h.b bVar = new com.bytedance.android.live.broadcast.h.b(this.mRoom);
        this.mStatusReport = bVar;
        bVar.f7877a = new d(this);
        this.mStatusService = new com.bytedance.android.live.broadcast.stream.c.b(this.mStatusReport);
        this.mLiveStatus = a.IDLE;
        if (this.mRoom.isScreenshot) {
            com.bytedance.android.live.broadcast.bgbroadcast.a.b bVar2 = new com.bytedance.android.live.broadcast.bgbroadcast.a.b(this.mStub, this.mRoom);
            this.mStrategy = bVar2;
            bVar2.f7614d = this;
            sProjection = null;
        } else {
            this.mStrategy = new com.bytedance.android.live.broadcast.bgbroadcast.b.a();
        }
        this.mStrategy.f7603a = new e(this);
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void onDestroy() {
        com.bytedance.android.live.broadcast.h.b bVar = this.mStatusReport;
        if (bVar != null) {
            bVar.a();
        }
        stopStream(1, true, PrivacyCert.Builder.with("bpea-415").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        this.mRoom = null;
        DataChannelGlobal.f34575d.c(ac.class);
        this.mStatusService = null;
        this.mLiveStatus = a.IDLE;
        a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.c();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
        this.mLiveStreamCallback = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onStreamStart() {
        Room room;
        this.mIsFirstPushStream = false;
        g gVar = this.liveDurationSpentStat;
        if (gVar != null) {
            gVar.f7774c = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                f b2 = u.a().b();
                l.b(b2, "");
                jSONObject.put("user_id", b2.c());
                h hVar = (h) DataChannelGlobal.f34575d.b(j.class);
                if (!(hVar == null || (room = hVar.f13527b) == null)) {
                    jSONObject.put("room_id", room.getId());
                    jSONObject.put("anchor_id", room.getOwnerUserId());
                    jSONObject.put("live_mode", room.liveRoomMode);
                    jSONObject.put("game_label", room.getLabels());
                }
                jSONObject.put("stream_push_room_success", gVar.f7772a);
                jSONObject.put("stream_push_core_start", gVar.f7773b);
                jSONObject.put("stream_push_accessed", gVar.f7774c);
            } catch (JSONException e2) {
                c.a(e2, String.valueOf(e2));
            }
            d.a("livesdk_gamelive_spend", null, null, jSONObject);
        }
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public static void setProjectionIntent(Intent intent) {
        sProjectionIntent = intent;
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void bindService(Service service) {
        this.mStub = service;
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void setLiveStatusListener(a.AbstractC0499a aVar) {
        this.mUiListener = aVar;
    }

    public void setLiveStreamCallback(b bVar) {
        this.mLiveStreamCallback = bVar;
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void unBindService(Service service) {
        this.mStub = null;
    }

    @Override // com.bytedance.android.live.broadcast.api.d.b
    public void onInfo(float f2) {
        b bVar = this.mLiveStreamCallback;
        if (bVar != null) {
            bVar.onInfo(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(int i2) {
        stopStream(i2, false, PrivacyCert.Builder.with("bpea-414").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i2) {
        if (i2 == 30001 || i2 == 50002 || i2 == 30003) {
            com.bytedance.android.live.broadcast.d.b.a(i2, getUserId(), getRoomId(), this.mIsFirstPushStream);
            stopStream(1, false, PrivacyCert.Builder.with("bpea-413").usage("").tag("stop video/audio capture when error occurs").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            a.AbstractC0499a aVar = this.mUiListener;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static void com_bytedance_android_live_broadcast_bgbroadcast_BgBroadcastServiceImpl_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void stopStream(int i2, PrivacyCert privacyCert) {
        stopStream(i2, false, privacyCert);
    }

    @Override // com.bytedance.android.livesdkapi.a
    public boolean startStream(boolean z, PrivacyCert privacyCert) {
        if (this.mLiveStatus == a.LIVING) {
            return true;
        }
        if (this.mStrategy == null || this.mStatusService == null) {
            return false;
        }
        this.liveDurationSpentStat = new g();
        if (!this.mStrategy.a(privacyCert)) {
            return false;
        }
        this.mStatusService.a();
        this.mLiveStatus = a.LIVING;
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.a
    public void setData(Intent intent, boolean z, DataChannel dataChannel) {
        super.setData(intent, z, dataChannel);
        a aVar = this.mStrategy;
        if (aVar != null) {
            aVar.a(intent, z);
            new com.bytedance.android.livesdk.chatroom.d.b(dataChannel, this.mStrategy.d(), this.mStatusService);
        }
    }

    private void stopStream(int i2, boolean z, PrivacyCert privacyCert) {
        if (this.mLiveStatus == a.LIVING) {
            a aVar = this.mStrategy;
            if (aVar != null) {
                aVar.b(privacyCert);
            }
            int b2 = DataChannelGlobal.f34575d.b(du.class);
            if (b2 == null) {
                b2 = 0;
            }
            if (this.mStatusService != null && !com.bytedance.android.live.broadcast.api.d.c.f7534a.contains(b2)) {
                this.mStatusService.a(i2);
            }
            this.mLiveStatus = a.FINISHED;
        }
    }
}
