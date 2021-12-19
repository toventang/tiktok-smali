package com.ss.android.ugc.aweme.uploader.factory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.uploader.f;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f142007a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92805);
    }

    public static AbstractVideoUploader a(g gVar, AbstractVideoUploader.a aVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        if (f.a()) {
            return new com.ss.android.ugc.aweme.uploader.factory.a.b(gVar, aVar);
        }
        return new com.ss.android.ugc.aweme.uploader.factory.b.b(gVar, aVar);
    }
}
