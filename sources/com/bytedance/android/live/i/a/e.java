package com.bytedance.android.live.i.a;

import android.content.Context;
import com.bytedance.android.d.b;
import com.bytedance.android.live.n.f;
import com.bytedance.android.live.n.k;
import com.bytedance.android.live.n.l;
import com.bytedance.android.live.n.m;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.view.c;
import com.bytedance.android.livesdkapi.view.d;
import com.bytedance.covode.number.Covode;

public class e implements d {
    static {
        Covode.recordClassIndex(5109);
    }

    @Override // com.bytedance.android.live.i.a.d
    public b createRoomPlayer(String str, i iVar, s.a aVar, d dVar, b.a aVar2, Context context, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public b createRoomPlayer(String str, String str2, i iVar, s.a aVar, d dVar, b.a aVar2, Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public b ensureRoomPlayer(long j2, String str, i iVar, s.a aVar, d dVar, b.a aVar2, Context context, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public b ensureRoomPlayer(long j2, String str, String str2, i iVar, s.a aVar, d dVar, b.a aVar2, Context context, String str3) {
        return null;
    }

    public com.bytedance.android.live.n.e getAudioFocusController(g gVar) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public a getCpuInfoFetcher() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public f getDnsOptimizer() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public b getGpuInfoFetcher() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.e getIRoomPlayerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public k getLivePlayController() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public l getLivePlayControllerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public c getLivePlayerLog() {
        return null;
    }

    public c getLivePlayerView(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public m getLiveStreamStrategy() {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public String getProjectKey() {
        return "";
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.i.a.d
    public boolean preCreatedSurface(String str, Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.i.a.d
    public void recycleRoomPlayer(String str) {
    }

    @Override // com.bytedance.android.live.i.a.d
    public void stopRoomPlayer(String str, boolean z) {
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.c warmUp(long j2, EnterRoomConfig enterRoomConfig, Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.i.a.d
    public com.bytedance.android.d.c warmUp(Room room, Context context) {
        return null;
    }
}
