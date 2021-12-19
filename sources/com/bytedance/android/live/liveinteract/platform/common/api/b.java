package com.bytedance.android.live.liveinteract.platform.common.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.chatroom.interact.model.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11899a = new b();

    static {
        Covode.recordClassIndex(6495);
    }

    private b() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        d dVar = (d) obj;
        if (dVar.data != null) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = a.bS;
            c cVar = (c) dVar.data;
            boolean z3 = false;
            if (cVar.f15583a == null) {
                z = false;
            } else {
                z = cVar.f15583a.f15575a;
            }
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(z));
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = a.bT;
            c cVar2 = (c) dVar.data;
            if (cVar2.f15583a == null) {
                z2 = false;
            } else {
                z2 = cVar2.f15583a.f15577c;
            }
            com.bytedance.android.livesdk.ap.c.a(bVar2, Boolean.valueOf(z2));
            com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = a.cj;
            c cVar3 = (c) dVar.data;
            if (cVar3.f15583a != null) {
                z3 = cVar3.f15583a.f15579e;
            }
            com.bytedance.android.livesdk.ap.c.a(bVar3, Boolean.valueOf(z3));
        }
    }
}
