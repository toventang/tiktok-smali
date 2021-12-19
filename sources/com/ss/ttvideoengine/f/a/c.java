package com.ss.ttvideoengine.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.bg;
import com.ss.ttvideoengine.f.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class c implements AVMDLURLFetcherInterface {

    /* renamed from: a  reason: collision with root package name */
    public String f152514a;

    /* renamed from: b  reason: collision with root package name */
    public String f152515b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f152516c;

    /* renamed from: d  reason: collision with root package name */
    public AVMDLURLFetcherListener f152517d;

    /* renamed from: e  reason: collision with root package name */
    public String f152518e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<b> f152519f;

    /* renamed from: g  reason: collision with root package name */
    private e f152520g;

    /* renamed from: h  reason: collision with root package name */
    private p f152521h;

    static {
        Covode.recordClassIndex(101570);
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        e eVar = this.f152520g;
        if (eVar != null) {
            eVar.a();
            this.f152520g = null;
        }
        this.f152519f = null;
    }

    public final b a() {
        WeakReference<b> weakReference = this.f152519f;
        if (weakReference != null) {
            return weakReference.get();
        }
        j.b("MDLFetcherNew", "getMDLFetcherListener is null");
        return null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        j.a("MDLFetcherNew", "mdl getURLs " + Arrays.toString(this.f152516c));
        return this.f152516c;
    }

    static class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f152522a;

        static {
            Covode.recordClassIndex(101571);
        }

        public a(c cVar) {
            this.f152522a = new WeakReference<>(cVar);
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            c cVar2 = this.f152522a.get();
            if (cVar2 != null && cVar2.a() != null) {
                cVar2.a().a(cVar);
            }
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(String str) {
            c cVar = this.f152522a.get();
            if (cVar != null && cVar.a() != null) {
                cVar.a().a(str);
            }
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(int i2, String str) {
            c cVar = this.f152522a.get();
            if (cVar == null) {
                j.a("MDLFetcherNew", "onStatusException but fetcher is null");
            } else {
                cVar.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -10005, i2, str), true);
            }
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(p pVar, com.ss.ttvideoengine.s.c cVar) {
            j.a("MDLFetcherNew", "onCompletion model " + pVar + ", error " + cVar);
            c cVar2 = this.f152522a.get();
            if (cVar2 == null) {
                j.a("MDLFetcherNew", "onCompletion but fetcher is null");
            } else if (cVar != null) {
                cVar2.a(cVar, true);
            } else if (pVar == null) {
                cVar2.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -9997, "fetch empty"), true);
            } else {
                cVar2.f152516c = c.a(pVar, cVar2.f152515b);
                j.a("MDLFetcherNew", "onCompletion newUrls " + Arrays.toString(cVar2.f152516c));
                if (cVar2.f152516c == null || cVar2.f152516c.length == 0) {
                    cVar2.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -10003, "file hash invalid"), true);
                } else if (c.a(cVar2.f152516c, cVar2.f152518e)) {
                    cVar2.f152517d.onCompletion(0, cVar2.f152514a, cVar2.f152515b, cVar2.f152516c);
                    cVar2.a(pVar, true);
                } else {
                    cVar2.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -10004, "fetch videoModel is expired"), true);
                }
            }
        }
    }

    public c(b bVar) {
        this.f152519f = new WeakReference<>(bVar);
    }

    public final void a(p pVar, boolean z) {
        b a2 = a();
        if (a2 != null) {
            a2.a(pVar, z, this.f152515b);
        }
        close();
    }

    public static boolean a(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                j.b("MDLFetcherNew", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    public static String[] a(p pVar, String str) {
        if (pVar == null || TextUtils.isEmpty(str)) {
            j.a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoModel is null or fileHash is empty ".concat(String.valueOf(str)));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        o a2 = pVar.a((Map<Integer, String>) hashMap);
        if (a2 == null) {
            j.a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoInfo is null");
            return null;
        }
        String[] b2 = a2.b();
        j.a("MDLFetcherNew", "getUrlsFromVideoModelByFileHash " + Arrays.toString(b2));
        return b2;
    }

    public final void a(com.ss.ttvideoengine.s.c cVar, boolean z) {
        if (z) {
            this.f152517d.onCompletion(cVar.f153260a, this.f152514a, this.f152515b, null);
        }
        b a2 = a();
        if (a2 != null) {
            a2.a(cVar, this.f152515b);
        }
        close();
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        boolean z;
        j.a("MDLFetcherNew", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.f152514a = str;
        this.f152515b = str2;
        this.f152517d = aVMDLURLFetcherListener;
        this.f152518e = str3;
        b a2 = a();
        if (a2 == null) {
            j.a("MDLFetcherNew", "start MDLFetcherListener is null return MDL_GET_URLS");
            a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -10001, "MDLFetcherListener is empty"), false);
            return 1;
        }
        String b2 = a2.b();
        if (TextUtils.isEmpty(b2)) {
            j.a("MDLFetcherNew", "start fallbackApi is empty return MDL_GET_URLS");
            a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainMDLRetry", -10002, "fallbackApi is empty"), false);
            return 1;
        }
        bg.a a3 = bg.a().a(this.f152514a, b2);
        if (a3 == null || a3.f152349c) {
            j.a("MDLFetcherNew", "getURLsFromCache cacheInfo is null or isExpired");
        } else {
            this.f152521h = a3.f152347a;
            String[] a4 = a(a3.f152347a, this.f152515b);
            if (a4 == null || a4.length <= 0) {
                j.a("MDLFetcherNew", "getURLsFromCache temUrls is null");
            } else if (!a(a4, str3)) {
                bg.a().b(this.f152514a, b2);
                j.a("MDLFetcherNew", "getURLsFromCache urls is invalid");
            } else {
                j.a("MDLFetcherNew", "getURLsFromCache " + Arrays.toString(a4));
                if (a4.length > 0) {
                    this.f152516c = a4;
                    j.a("MDLFetcherNew", "start return MDL_GET_URLS");
                    a(this.f152521h, false);
                    return 1;
                }
            }
        }
        Context c2 = a2.c();
        e eVar = new e(c2, null);
        this.f152520g = eVar;
        if (c2 != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.a(z);
        this.f152520g.f152549g = str;
        this.f152520g.f152547e = new a(this);
        this.f152520g.a((Boolean) true);
        this.f152520g.a(b2, null, 0, null);
        j.a("MDLFetcherNew", "start return CALLBACK_URLS_TO_MDL");
        return 0;
    }
}
