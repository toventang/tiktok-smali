package com.facebook.imagepipeline.n;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.a;
import com.facebook.imagepipeline.j.e;
import java.util.List;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public final k<e> f48389d;

    /* renamed from: e  reason: collision with root package name */
    public final al f48390e;

    /* renamed from: f  reason: collision with root package name */
    public long f48391f;

    /* renamed from: g  reason: collision with root package name */
    public int f48392g;

    /* renamed from: h  reason: collision with root package name */
    public a f48393h;

    static {
        Covode.recordClassIndex(29178);
    }

    public final String a() {
        return this.f48390e.b();
    }

    public final an b() {
        return this.f48390e.c();
    }

    public final Uri c() {
        return this.f48390e.a().mSourceUri;
    }

    public final List<Uri> d() {
        return this.f48390e.a().mBackupUris;
    }

    public t(k<e> kVar, al alVar) {
        this.f48389d = kVar;
        this.f48390e = alVar;
    }
}
