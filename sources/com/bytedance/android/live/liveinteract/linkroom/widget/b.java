package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import h.z;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10636a;

    static {
        Covode.recordClassIndex(5665);
    }

    b(LinkControlWidget linkControlWidget) {
        this.f10636a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10636a;
        if (((p) obj).f15136a == 4) {
            linkControlWidget.a(PrivacyCert.Builder.with("bpea-502").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        return z.f158842a;
    }
}
