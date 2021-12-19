package com.ss.android.ugc.aweme.activity.processor;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import com.ss.android.ugc.aweme.utils.LanguageService;
import h.f.b.l;

public final class j extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final j f65544d = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(40324);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(Activity activity) {
        l.d(activity, "");
        LanguageService.a().a(activity);
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(a aVar, Bundle bundle) {
        l.d(aVar, "");
        super.b(aVar, bundle);
        LanguageService.a().a(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(a aVar, Configuration configuration) {
        l.d(aVar, "");
        l.d(configuration, "");
        super.a(aVar, configuration);
        LanguageService.a().a(aVar);
    }
}
