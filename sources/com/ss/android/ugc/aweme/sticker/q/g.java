package com.ss.android.ugc.aweme.sticker.q;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.p;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(88489);
    }

    public static final PrivacyCert a(p.a aVar) {
        l.d(aVar, "");
        if (l.a(aVar, p.a.C3523a.f135412a)) {
            return b.f61942e;
        }
        if (l.a(aVar, p.a.b.f135413a)) {
            return b.f61943f;
        }
        if (l.a(aVar, p.a.c.f135414a)) {
            return b.f61945h;
        }
        if (l.a(aVar, p.a.f.f135417a)) {
            return b.f61944g;
        }
        if (l.a(aVar, p.a.e.f135416a)) {
            return PrivacyCert.Builder.Companion.with("bpea-412").usage("Users can use the camera and microphone to create video works in TikTok when they are on the video shooting page.").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
        } else if (l.a(aVar, p.a.d.f135415a)) {
            return PrivacyCert.Builder.Companion.with("bpea-411").usage("Users can use the camera and microphone to create video works in TikTok when they are on the video shooting page.").tag("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build();
        } else if (aVar instanceof d) {
            return ((d) aVar).f135443a;
        } else {
            return null;
        }
    }
}
