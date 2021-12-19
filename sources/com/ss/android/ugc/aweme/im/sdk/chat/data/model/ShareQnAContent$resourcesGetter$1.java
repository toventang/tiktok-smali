package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.a.a;
import h.f.b.l;
import h.f.b.m;

final class ShareQnAContent$resourcesGetter$1 extends m implements a<Resources> {
    public static final ShareQnAContent$resourcesGetter$1 INSTANCE = new ShareQnAContent$resourcesGetter$1();

    static {
        Covode.recordClassIndex(64071);
    }

    ShareQnAContent$resourcesGetter$1() {
        super(0);
    }

    @Override // h.f.a.a
    public final Resources invoke() {
        Resources resources = d.a().getResources();
        l.b(resources, "");
        return resources;
    }
}
