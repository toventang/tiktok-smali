package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import f.a.d.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements c {

    /* renamed from: a  reason: collision with root package name */
    static final c f78559a = new p();

    static {
        Covode.recordClassIndex(48787);
    }

    private p() {
    }

    @Override // f.a.d.c
    public final Object a(Object obj, Object obj2) {
        return new MixActivityContainer.a((ITpcConsentService) obj, (Activity) obj2);
    }
}
