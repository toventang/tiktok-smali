package com.facebook.imagepipeline.o;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.k.g;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.e.i;
import com.facebook.imagepipeline.o.b;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public Uri f48444a;

    /* renamed from: b  reason: collision with root package name */
    public List<Uri> f48445b;

    /* renamed from: c  reason: collision with root package name */
    public b.EnumC1183b f48446c = b.EnumC1183b.FULL_FETCH;

    /* renamed from: d  reason: collision with root package name */
    public d f48447d;

    /* renamed from: e  reason: collision with root package name */
    public e f48448e;

    /* renamed from: f  reason: collision with root package name */
    public com.facebook.imagepipeline.common.b f48449f = com.facebook.imagepipeline.common.b.f47734a;

    /* renamed from: g  reason: collision with root package name */
    public b.a f48450g = b.a.DEFAULT;

    /* renamed from: h  reason: collision with root package name */
    public boolean f48451h = i.B.f47887a;

    /* renamed from: i  reason: collision with root package name */
    public boolean f48452i = false;

    /* renamed from: j  reason: collision with root package name */
    public com.facebook.imagepipeline.common.c f48453j = com.facebook.imagepipeline.common.c.HIGH;

    /* renamed from: k  reason: collision with root package name */
    public d f48454k = null;

    /* renamed from: l  reason: collision with root package name */
    boolean f48455l = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f48456m = false;
    public boolean n = true;
    public com.facebook.imagepipeline.k.c o;
    public com.facebook.imagepipeline.common.a p = null;

    static {
        Covode.recordClassIndex(29209);
    }

    private c() {
    }

    public final b a() {
        Uri uri = this.f48444a;
        if (uri != null) {
            if (g.g(uri)) {
                if (!this.f48444a.isAbsolute()) {
                    throw new a("Resource URI path must be absolute.");
                } else if (!this.f48444a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f48444a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new a("Resource URI must not be empty");
                }
            }
            if (!g.f(this.f48444a) || this.f48444a.isAbsolute()) {
                return new b(this);
            }
            throw new a("Asset URI path must be absolute.");
        }
        throw new a("Source must be set!");
    }

    public final c a(com.facebook.imagepipeline.common.c cVar) {
        this.f48453j = cVar;
        return this;
    }

    private c b(Uri uri) {
        com.facebook.common.d.i.a(uri);
        this.f48444a = uri;
        return this;
    }

    public final c a(d dVar) {
        this.f48454k = dVar;
        return this;
    }

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(29210);
        }

        public a(String str) {
            super("Invalid request builder: ".concat(String.valueOf(str)));
        }
    }

    public static c a(Uri uri) {
        return new c().b(uri);
    }

    public final c a(boolean z) {
        if (z) {
            this.f48448e = e.f47751b;
            return this;
        }
        this.f48448e = e.f47752c;
        return this;
    }

    public static c a(b bVar) {
        c a2 = a(bVar.mSourceUri);
        a2.f48449f = bVar.mImageDecodeOptions;
        a2.p = bVar.mBytesRange;
        a2.f48450g = bVar.mCacheChoice;
        a2.f48452i = bVar.mLocalThumbnailPreviewsEnabled;
        a2.f48446c = bVar.mLowestPermittedRequestLevel;
        a2.f48454k = bVar.mPostprocessor;
        a2.f48451h = bVar.mProgressiveRenderingEnabled;
        a2.f48453j = bVar.mRequestPriority;
        a2.f48447d = bVar.mResizeOptions;
        a2.o = bVar.mRequestListener;
        a2.f48448e = bVar.mRotationOptions;
        return a2;
    }
}
