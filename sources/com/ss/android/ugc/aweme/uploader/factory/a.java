package com.ss.android.ugc.aweme.uploader.factory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.aweme.uploader.f;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142001a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92799);
    }

    public static final AbstractImageUploader a(e eVar) {
        l.d(eVar, "");
        if (f.a()) {
            return new com.ss.android.ugc.aweme.uploader.factory.a.a(eVar);
        }
        return new com.ss.android.ugc.aweme.uploader.factory.b.a(eVar);
    }
}
