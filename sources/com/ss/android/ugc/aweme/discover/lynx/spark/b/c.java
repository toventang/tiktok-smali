package com.ss.android.ugc.aweme.discover.lynx.spark.b;

import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.lynx.b.d;
import com.ss.android.ugc.aweme.discover.lynx.delegate.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayMap<com.bytedance.hybrid.spark.page.c, com.bytedance.hybrid.spark.a.c> f81575a = new ArrayMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final c f81576b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f81577c = i.a((h.f.a.a) a.f81579a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f81578d = i.a((h.f.a.a) C1906c.f81584a);

    public static ArrayMap<String, b> a() {
        return (ArrayMap) f81577c.getValue();
    }

    public static ArrayMap<String, b> b() {
        return (ArrayMap) f81578d.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<ArrayMap<String, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81579a = new a();

        static {
            Covode.recordClassIndex(50694);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayMap<String, b> invoke() {
            return new ArrayMap(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.c$c  reason: collision with other inner class name */
    static final class C1906c extends m implements h.f.a.a<ArrayMap<String, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1906c f81584a = new C1906c();

        static {
            Covode.recordClassIndex(50696);
        }

        C1906c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayMap<String, b> invoke() {
            return new ArrayMap(4);
        }
    }

    static {
        Covode.recordClassIndex(50693);
    }

    public static b a(String str) {
        l.d(str, "");
        String a2 = j.a.a(str);
        b bVar = b().get(a2);
        if (bVar == null) {
            return a().get(a2);
        }
        return bVar;
    }

    public static final class b extends com.bytedance.hybrid.spark.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f81580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f81581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f81582c = false;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f81583d;

        static {
            Covode.recordClassIndex(50695);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(com.bytedance.lynx.hybrid.a.h hVar) {
            l.d(hVar, "");
            com.bytedance.android.alog.c.a(1, "SparkPreloadHelper", "tryPreload by spark succeed:" + this.f81580a);
            this.f81581b.a(d.SUCCEED);
            if (!a.a()) {
                c.a(this.f81582c, this.f81583d, this.f81581b);
                return;
            }
            com.bytedance.hybrid.spark.a.c remove = c.f81575a.remove(this.f81581b.f81570b);
            if (remove != null) {
                remove.a(hVar);
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(com.bytedance.lynx.hybrid.a.h hVar, String str, String str2) {
            l.d(hVar, "");
            l.d(str, "");
            super.a(hVar, str, str2);
            com.bytedance.android.alog.c.a(1, "SparkPreloadHelper", "tryPreload by spark failed:" + this.f81580a);
            if (a.a()) {
                this.f81581b.a(d.FAILED);
                com.bytedance.hybrid.spark.a.c remove = c.f81575a.remove(this.f81581b.f81570b);
                if (remove != null) {
                    remove.a(hVar, str, str2);
                }
            }
        }

        b(String str, b bVar, boolean z, String str2) {
            this.f81580a = str;
            this.f81581b = bVar;
            this.f81583d = str2;
        }
    }

    public static void a(boolean z, String str, b bVar) {
        com.bytedance.android.alog.c.a(1, "SparkPreloadHelper", "cacheSparkView:".concat(String.valueOf(str)));
        if (z) {
            b().put(str, bVar);
        } else {
            a().put(str, bVar);
        }
    }

    public void a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        com.bytedance.android.alog.c.a(1, "SparkPreloadHelper", "tryPreload by spark:".concat(String.valueOf(str)));
        String a2 = j.a.a(str);
        com.bytedance.hybrid.spark.page.c b2 = com.ss.android.ugc.aweme.discover.lynx.a.b(context);
        if (str2 == null) {
            str2 = "";
        }
        TemplateData a3 = TemplateData.a(str2);
        a3.a("isPreload", true);
        l.b(a3, "");
        b bVar = new b(a2, b2, d.LOADING, (byte) 0);
        if (a.a()) {
            a(false, a2, bVar);
        }
        com.ss.android.ugc.aweme.discover.lynx.spark.b.a(b2, str, a3, new b(str, bVar, false, a2));
    }
}
