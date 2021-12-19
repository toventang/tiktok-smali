package com.bytedance.android.livesdk.chatroom.ui;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class LivePlayFragment$16 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ br f15806a;

    static {
        Covode.recordClassIndex(8721);
    }

    LivePlayFragment$16(br brVar) {
        this.f15806a = brVar;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar.equals(i.a.ON_START) && this.f15806a.C().e() != null) {
            com.bytedance.android.livesdkapi.depend.d.m e2 = this.f15806a.C().e();
            this.f15806a.L.getView();
            e2.a();
        }
    }
}
