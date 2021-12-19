package com.bytedance.android.live.i;

import android.content.Context;
import com.bytedance.android.d.b;
import com.bytedance.android.d.e;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.live.i.a.c;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.f;
import com.bytedance.android.live.n.l;
import com.bytedance.android.live.n.m;
import com.bytedance.android.livesdk.aj.k;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdk.chatroom.detail.x;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;

public class a implements d {
    private static final String TAG = a.class.getSimpleName();

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.i.a.d
    public l getLivePlayControllerManager() {
        return k.f13853b;
    }

    @Override // com.bytedance.android.live.i.a.d
    public e getIRoomPlayerManager() {
        return x.a();
    }

    static {
        Covode.recordClassIndex(5102);
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.live.i.a.a getCpuInfoFetcher() {
        return com.bytedance.android.live.i.b.d.g().f();
    }

    @Override // com.bytedance.android.live.i.a.d
    public f getDnsOptimizer() {
        return com.bytedance.android.live.i.b.d.g().c();
    }

    @Override // com.bytedance.android.live.i.a.d
    public b getGpuInfoFetcher() {
        return com.bytedance.android.live.i.b.d.g().e();
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.live.n.k getLivePlayController() {
        return com.bytedance.android.live.i.b.d.g().a();
    }

    @Override // com.bytedance.android.live.i.a.d
    public c getLivePlayerLog() {
        return com.bytedance.android.live.i.b.d.g().b();
    }

    @Override // com.bytedance.android.live.i.a.d
    public m getLiveStreamStrategy() {
        return com.bytedance.android.live.i.b.d.g().d();
    }

    @Override // com.bytedance.android.live.i.a.d
    public String getProjectKey() {
        if (((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
            return "musically_live";
        }
        return "tiktok_live";
    }

    public com.bytedance.android.live.n.e getAudioFocusController(g gVar) {
        return new com.bytedance.android.livesdk.chatroom.detail.a(gVar);
    }

    public com.bytedance.android.livesdkapi.view.c getLivePlayerView(Context context) {
        return new com.bytedance.android.livesdk.aj.c.a(context);
    }

    @Override // com.bytedance.android.live.i.a.d
    public void recycleRoomPlayer(String str) {
        com.bytedance.android.d.c a2;
        x a3 = x.a();
        com.bytedance.android.livesdk.chatroom.g.d.a(x.f15323a, "recycle() -> playerTag=".concat(String.valueOf(str)));
        if (str != null && (a2 = a3.a(str)) != null) {
            a3.a(a2);
        }
    }

    @Override // com.bytedance.android.live.i.a.d
    public boolean preCreatedSurface(String str, Context context) {
        com.bytedance.android.d.c a2;
        x a3 = x.a();
        if (!LivePreCreateSurfaceSetting.INSTANCE.getValue() || (a2 = a3.a(str)) == null) {
            return false;
        }
        com.bytedance.android.livesdk.chatroom.g.d.a(x.f15323a, "preCreatedSurface() -> playerTag is ".concat(String.valueOf(str)));
        return a2.preCreatedSurface(context);
    }

    @Override // com.bytedance.android.live.i.a.d
    public void stopRoomPlayer(String str, boolean z) {
        com.bytedance.android.d.c a2;
        x a3 = x.a();
        com.bytedance.android.livesdk.chatroom.g.d.a(x.f15323a, "stop() -> playerTag=" + str + "; needRelease: " + z);
        if (str != null && (a2 = a3.a(str)) != null) {
            a2.stop(z);
        }
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.c warmUp(Room room, Context context) {
        com.bytedance.android.livesdk.chatroom.g.d.a(TAG, "warmUp -> roomId=" + room.getId());
        x a2 = x.a();
        if (x.b()) {
            return null;
        }
        return a2.a(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().n, room.getStreamType(), false, null, f.a.f23366a.a().f23354b.f23299c.aa);
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.c warmUp(long j2, EnterRoomConfig enterRoomConfig, Context context) {
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        com.bytedance.android.livesdk.chatroom.g.d.a(TAG, "warmUp -> roomId=".concat(String.valueOf(j2)));
        x a2 = x.a();
        if (x.b() || enterRoomConfig2 == null) {
            return null;
        }
        EnterRoomConfig enterRoomConfig3 = enterRoomConfig2.f23299c.C;
        if (enterRoomConfig3 != null) {
            enterRoomConfig2.f23299c.C = null;
            enterRoomConfig2 = enterRoomConfig3;
        }
        String str = enterRoomConfig2.f23297a.f23338b;
        String str2 = enterRoomConfig2.f23297a.f23340d;
        String str3 = enterRoomConfig2.f23297a.f23341e;
        boolean a3 = com.bytedance.common.utility.m.a(str3);
        if (a3) {
            str3 = str2;
        }
        return a2.a(j2, context, str, enterRoomConfig2.f23297a.f23339c, str3, enterRoomConfig2.f23297a.f23342f, new s.a(enterRoomConfig2.f23297a.f23343g, enterRoomConfig2.f23297a.f23344h, enterRoomConfig2.f23297a.f23345i), i.valueOf(enterRoomConfig2.f23297a.f23346j), !a3, enterRoomConfig2.f23299c.E, enterRoomConfig2.f23299c.aa);
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.b createRoomPlayer(String str, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str2) {
        return new RoomPlayer(str, iVar, aVar, dVar, aVar2, context, str2);
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.b createRoomPlayer(String str, String str2, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context) {
        return new RoomPlayer(str, str2, iVar, aVar, dVar, aVar2, context);
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.b ensureRoomPlayer(long j2, String str, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str2, String str3) {
        com.bytedance.android.livesdk.chatroom.g.d.a(TAG, "ensureRoomPlayer -> roomId=" + j2 + ", playerTag=" + str3);
        x a2 = x.a();
        if (x.b()) {
            return ((d) com.bytedance.android.live.t.a.a(d.class)).createRoomPlayer(str, iVar, aVar, dVar, aVar2, context, str2);
        }
        com.bytedance.android.d.c a3 = a2.a(str3);
        if (a3 != null) {
            a3.attach(context, dVar, aVar2);
            return a3;
        }
        com.bytedance.android.d.c a4 = a2.a(j2, context, str, str2, null, null, aVar, iVar);
        x.a(a4, context, dVar, aVar2);
        return a4;
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.b ensureRoomPlayer(long j2, String str, String str2, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str3) {
        com.bytedance.android.livesdk.chatroom.g.d.a(TAG, "ensureRoomPlayer -> roomId=" + j2 + ", playerTag=" + str3);
        x a2 = x.a();
        if (x.b()) {
            return ((d) com.bytedance.android.live.t.a.a(d.class)).createRoomPlayer(str, str2, iVar, aVar, dVar, aVar2, context);
        }
        com.bytedance.android.d.c a3 = a2.a(str3);
        if (a3 != null) {
            a3.attach(context, dVar, aVar2);
            return a3;
        }
        com.bytedance.android.d.c a4 = a2.a(j2, context, null, null, str, str2, aVar, iVar);
        x.a(a4, context, dVar, aVar2);
        return a4;
    }
}
