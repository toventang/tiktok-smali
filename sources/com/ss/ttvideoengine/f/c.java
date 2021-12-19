package com.ss.ttvideoengine.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.bg;
import com.ss.ttvideoengine.f.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.s.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class c implements AVMDLURLFetcherInterface {

    /* renamed from: a  reason: collision with root package name */
    public String f152525a;

    /* renamed from: b  reason: collision with root package name */
    public String f152526b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f152527c;

    /* renamed from: d  reason: collision with root package name */
    public AVMDLURLFetcherListener f152528d;

    /* renamed from: e  reason: collision with root package name */
    public String f152529e;

    /* renamed from: f  reason: collision with root package name */
    private String f152530f;

    /* renamed from: g  reason: collision with root package name */
    private String f152531g;

    /* renamed from: h  reason: collision with root package name */
    private e f152532h;

    /* renamed from: i  reason: collision with root package name */
    private Context f152533i;

    static {
        Covode.recordClassIndex(101573);
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public void close() {
        e eVar = this.f152532h;
        if (eVar != null) {
            eVar.a();
            this.f152532h = null;
        }
        this.f152527c = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public String[] getURLs() {
        String[] strArr = this.f152527c;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        j.b("MDLFetcher", "get urls from cache. + urls.length = " + this.f152527c.length);
        return this.f152527c;
    }

    static class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f152534a;

        static {
            Covode.recordClassIndex(101574);
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(com.ss.ttvideoengine.s.c cVar) {
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(String str) {
        }

        public a(c cVar) {
            this.f152534a = new WeakReference<>(cVar);
        }

        @Override // com.ss.ttvideoengine.f.e.a
        public final void a(int i2, String str) {
            c cVar = this.f152534a.get();
            if (cVar == null) {
                j.a("MDLFetcher", "onStatusException but fetcher is null");
            } else {
                cVar.f152528d.onCompletion(i2, cVar.f152525a, cVar.f152526b, null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
            if (r8 != null) goto L_0x0033;
         */
        @Override // com.ss.ttvideoengine.f.e.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.ttvideoengine.j.p r7, com.ss.ttvideoengine.s.c r8) {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.f.c.a.a(com.ss.ttvideoengine.j.p, com.ss.ttvideoengine.s.c):void");
        }
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
                j.b("MDLFetcher", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    public static String[] a(p pVar, String str) {
        if (pVar == null || TextUtils.isEmpty(str)) {
            j.b("MDLFetcher", "_getUrlsFromVideoModel videoModel is null or fileHash is empty ".concat(String.valueOf(str)));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        o a2 = pVar.a((Map<Integer, String>) hashMap);
        if (a2 != null) {
            String[] b2 = a2.b();
            j.b("MDLFetcher", "_getUrlsFromVideoModel " + Arrays.toString(b2));
            if (b2 == null || b2.length <= 0) {
                return null;
            }
            return b2;
        }
        j.b("MDLFetcher", "_getUrlsFromVideoModel videoInfo is null");
        return null;
    }

    public c(Context context, String str, String str2) {
        this.f152533i = context;
        this.f152530f = l.a(str);
        this.f152531g = str2;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        bg.a a2;
        MethodCollector.i(10537);
        j.a("MDLFetcher", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.f152525a = str;
        this.f152526b = str2;
        this.f152528d = aVMDLURLFetcherListener;
        this.f152529e = str3;
        synchronized (c.class) {
            try {
                a2 = bg.a().a(this.f152525a, this.f152530f);
            } finally {
                MethodCollector.o(10537);
            }
        }
        if (a2 != null && !a2.f152349c) {
            j.a("MDLFetcher", com.a.a("get videoModel from cache,key is %s; videoId = %s", new Object[]{this.f152526b, this.f152525a}));
            String[] a3 = a(a2.f152347a, this.f152526b);
            if (!TextUtils.isEmpty(str3) && a3 != null && a3.length > 0) {
                this.f152527c = a3;
                int i2 = 0;
                while (true) {
                    if (i2 >= a3.length) {
                        break;
                    } else if (a3[i2].equals(str3)) {
                        this.f152527c = null;
                        synchronized (c.class) {
                            try {
                                bg.a().b(this.f152525a, this.f152530f);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (this.f152527c != null) {
                j.a("MDLFetcher", "start get urls from cache " + Arrays.toString(this.f152527c));
                MethodCollector.o(10537);
                return 1;
            }
        }
        e eVar = new e(this.f152533i, null);
        this.f152532h = eVar;
        if (this.f152533i != null) {
            eVar.a(true);
        }
        this.f152532h.f152549g = str;
        this.f152532h.f152547e = new a(this);
        this.f152532h.a(Boolean.valueOf(!TextUtils.isEmpty(this.f152530f)));
        this.f152532h.a(this.f152530f, null, 0, this.f152531g);
        MethodCollector.o(10537);
        return 0;
    }
}
