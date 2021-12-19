package com.bytedance.android.live.s;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.ab;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public class h implements e {
    static {
        Covode.recordClassIndex(6947);
    }

    @Override // com.bytedance.android.live.s.e
    public d configUserHelper(a aVar, DataChannel dataChannel, f.a.b.a aVar2) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(aVar2, "");
        return null;
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchAdminList(a aVar, long j2) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchKickOutList(b bVar, long j2, int i2, int i3) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchMuteDurationList(b<? super List<j>, z> bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void fetchMuteList(c cVar, long j2, int i2, int i3) {
        l.d(cVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public Dialog getEnsureKickOutDialog(Context context, long j2, long j3, long j4, f fVar) {
        return null;
    }

    @Override // com.bytedance.android.live.s.e
    public String getReportScene() {
        return null;
    }

    @Override // com.bytedance.android.live.s.e
    public void kickOut(b bVar, boolean z, long j2, long j3) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void muteUser(User user, long j2, j jVar, g gVar) {
        l.d(user, "");
        l.d(jVar, "");
        l.d(gVar, "");
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.s.e
    public void report(Context context, c cVar) {
        l.d(cVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void report(Context context, d dVar) {
        l.d(dVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void setMuteDuration(j jVar) {
        l.d(jVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void unmuteUser(User user, long j2, g gVar) {
        l.d(user, "");
        l.d(gVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void updateAdmin(a aVar, boolean z, User user, long j2, long j3, String str) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public void updateAdmin(a aVar, boolean z, com.bytedance.android.live.s.a.a aVar2, long j2, long j3, String str) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.s.e
    public ab<j> getMuteDuration() {
        ab<j> a2 = ab.a(j.f7923b);
        l.b(a2, "");
        return a2;
    }
}
