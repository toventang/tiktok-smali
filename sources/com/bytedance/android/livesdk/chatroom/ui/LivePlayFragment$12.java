package com.bytedance.android.livesdk.chatroom.ui;

import androidx.fragment.app.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class LivePlayFragment$12 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ br f15805a;

    static {
        Covode.recordClassIndex(8720);
    }

    LivePlayFragment$12(br brVar) {
        this.f15805a = brVar;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        e activity;
        if (aVar.equals(i.a.ON_START) && this.f15805a.J != null && (activity = this.f15805a.getActivity()) != null && activity.getWindow() != null && this.f15805a.n == 1 && this.f15805a.J != null && this.f15805a.C().e() != null) {
            this.f15805a.C().e().a(true);
        }
    }
}
