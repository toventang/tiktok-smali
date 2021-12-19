package com.facebook.imagepipeline.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.o.b;
import com.facebook.imagepipeline.o.d;

public final class j implements f {

    /* renamed from: b  reason: collision with root package name */
    private static j f47810b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f47811a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47812c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f47813d;

    static {
        Covode.recordClassIndex(28952);
    }

    protected j() {
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            MethodCollector.i(12501);
            if (f47810b == null) {
                f47810b = new j();
            }
            jVar = f47810b;
            MethodCollector.o(12501);
        }
        return jVar;
    }

    @Override // com.facebook.imagepipeline.d.f
    public final e a(b bVar) {
        return a(bVar.mSourceUri);
    }

    private String b(Uri uri) {
        if (this.f47812c) {
            return c(uri);
        }
        return uri.toString();
    }

    @Override // com.facebook.imagepipeline.d.f
    public final e a(Uri uri) {
        return new com.facebook.c.a.j(b(uri));
    }

    @Override // com.facebook.imagepipeline.d.f
    public final e b(b bVar) {
        return new u(bVar.mSourceUri.toString(), bVar.mResizeOptions, bVar.getSourceFile());
    }

    private String c(Uri uri) {
        if (uri == null) {
            return "";
        }
        if (!("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) {
            return uri.toString();
        }
        String[] strArr = this.f47813d;
        if (strArr == null || strArr.length <= 0) {
            return uri.toString();
        }
        String host = uri.getHost();
        if (host != null) {
            String[] strArr2 = this.f47813d;
            for (String str : strArr2) {
                if (str != null && host.endsWith(str)) {
                    return d(uri);
                }
            }
        }
        return uri.toString();
    }

    private String d(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme()).append(":");
        if (uri.getEncodedAuthority() != null) {
            sb.append("//");
        }
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            sb.append(encodedPath);
        }
        if (this.f47811a) {
            return sb.toString();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            sb.append("?").append(encodedQuery);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null) {
            sb.append("#").append(encodedFragment);
        }
        return sb.toString();
    }

    public final void a(String[] strArr) {
        this.f47812c = true;
        this.f47813d = strArr;
    }

    @Override // com.facebook.imagepipeline.d.f
    public final e a(b bVar, Object obj) {
        return new c(b(bVar.mSourceUri), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, null, null, obj);
    }

    @Override // com.facebook.imagepipeline.d.f
    public final e b(b bVar, Object obj) {
        String str;
        d dVar = bVar.mPostprocessor;
        e eVar = null;
        if (dVar != null) {
            eVar = dVar.getPostprocessorCacheKey();
            str = dVar.getClass().getName();
        } else {
            str = null;
        }
        return new c(b(bVar.mSourceUri), bVar.mResizeOptions, bVar.mRotationOptions, bVar.mImageDecodeOptions, eVar, str, obj);
    }
}
