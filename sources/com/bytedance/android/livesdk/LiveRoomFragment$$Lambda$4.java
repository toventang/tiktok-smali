package com.bytedance.android.livesdk;

import androidx.fragment.app.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.chatroom.backroom.d.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class LiveRoomFragment$$Lambda$4 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ab f13249a;

    /* renamed from: b  reason: collision with root package name */
    private final e f13250b;

    static {
        Covode.recordClassIndex(7376);
    }

    LiveRoomFragment$$Lambda$4(ab abVar, e eVar) {
        this.f13249a = abVar;
        this.f13250b = eVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        ab abVar = this.f13249a;
        if (this.f13250b.isFinishing() && aVar.equals(i.a.ON_DESTROY)) {
            abVar.f();
            if (abVar.n.b() == abVar.f13399i) {
                abVar.n.a();
            }
            a.f15024a = null;
        }
    }
}
