package com.ss.android.ugc.aweme.emoji.i.a.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.q;
import h.v;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89333a = i.a((h.f.a.a) b.f89340a);

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f89334b = ag.a(v.a("[smile]", "im_e1.webp"), v.a("[happy]", "im_e2.webp"), v.a("[angry]", "im_e3.png"), v.a("[cry]", "im_e4.webp"), v.a("[embarrassed]", "im_e5.png"), v.a("[surprised]", "im_e6.webp"), v.a("[wronged]", "im_e7.webp"), v.a("[shout]", "im_e8.webp"), v.a("[flushed]", "im_e9.webp"), v.a("[yummy]", "im_e10.webp"), v.a("[complacent]", "im_e11.webp"), v.a("[drool]", "im_e12.webp"), v.a("[scream]", "im_e13.webp"), v.a("[weep]", "im_e14.png"), v.a("[speechless]", "im_e15.png"), v.a("[funnyface]", "im_e16.webp"), v.a("[laughwithtears]", "im_e17.webp"), v.a("[wicked]", "im_e18.webp"), v.a("[facewithrollingeyes]", "im_e19.webp"), v.a("[sulk]", "im_e20.png"), v.a("[thinking]", "im_e21.webp"), v.a("[lovely]", "im_e22.webp"), v.a("[greedy]", "im_e23.webp"), v.a("[wow]", "im_e24.webp"), v.a("[joyful]", "im_e25.webp"), v.a("[hehe]", "im_e26.webp"), v.a("[slap]", "im_e27.webp"), v.a("[tears]", "im_e28.webp"), v.a("[stun]", "im_e29.webp"), v.a("[cute]", "im_e30.webp"), v.a("[blink]", "im_e31.webp"), v.a("[disdain]", "im_e32.webp"), v.a("[astonish]", "im_e33.webp"), v.a("[rage]", "im_e34.webp"), v.a("[cool]", "im_e35.webp"), v.a("[excited]", "im_e36.webp"), v.a("[proud]", "im_e37.webp"), v.a("[smileface]", "im_e38.webp"), v.a("[evil]", "im_e39.webp"), v.a("[angel]", "im_e40.webp"), v.a("[laugh]", "im_e41.webp"), v.a("[pride]", "im_e42.webp"), v.a("[nap]", "im_e43.webp"), v.a("[loveface]", "im_e44.webp"), v.a("[awkward]", "im_e45.webp"), v.a("[shock]", "im_e46.png"));

    /* renamed from: c  reason: collision with root package name */
    public static final h f89335c = i.a((h.f.a.a) c.f89341a);

    /* renamed from: d  reason: collision with root package name */
    public static final C2160a f89336d = new C2160a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final h f89337e = i.a((h.f.a.a) new e(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f89338f = i.a((h.f.a.a) d.f89342a);

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.d.a f89339g;

    private final Map<String, String> b() {
        return (Map) this.f89337e.getValue();
    }

    public final LruCache<String, Bitmap> a() {
        return (LruCache) this.f89338f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.i.a.a.a$a  reason: collision with other inner class name */
    public static final class C2160a {
        static {
            Covode.recordClassIndex(56134);
        }

        private C2160a() {
        }

        public /* synthetic */ C2160a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89341a = new c();

        static {
            Covode.recordClassIndex(56136);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(IMService.createIIMServicebyMonsterPlugin(false).getMessagingGeckoUtils());
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89340a = new b();

        static {
            Covode.recordClassIndex(56135);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            return Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
        }
    }

    static final class d extends m implements h.f.a.a<LruCache<String, Bitmap>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89342a = new d();

        static {
            Covode.recordClassIndex(56137);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LruCache<String, Bitmap> invoke() {
            int i2;
            if (com.ss.android.ugc.aweme.performance.i.a()) {
                i2 = 20;
            } else {
                i2 = 40;
            }
            return new LruCache(i2);
        }
    }

    static final class e extends m implements h.f.a.a<Map<String, String>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(56138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, String> invoke() {
            Map<String, String> map = a.f89334b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ag.a(map.size()));
            for (T t : map.entrySet()) {
                linkedHashMap.put(t.getKey(), this.this$0.b((String) t.getValue()));
            }
            return ag.d(linkedHashMap);
        }
    }

    static {
        Covode.recordClassIndex(56133);
    }

    public a(com.ss.android.ugc.aweme.im.service.d.a aVar) {
        l.d(aVar, "");
        this.f89339g = aVar;
    }

    public final String b(String str) {
        if (!this.f89339g.a()) {
            return "";
        }
        Object a2 = this.f89339g.a(str);
        Throwable r2 = q.m226exceptionOrNullimpl(a2);
        if (r2 != null) {
            com.ss.android.ugc.aweme.im.service.m.a.a("GeckoEmojiCacheManager", "getEmojiGeckoFilePath failed: ", r2);
        }
        if (q.m228isFailureimpl(a2)) {
            a2 = null;
        }
        String str2 = (String) a2;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final String a(String str) {
        l.d(str, "");
        Map<String, String> map = f89334b;
        if (!map.containsKey(str)) {
            return "";
        }
        String str2 = b().get(str);
        if (str2 == null || str2.length() == 0) {
            String str3 = map.get(str);
            if (str3 == null) {
                return "";
            }
            b().put(str, b(str3));
        }
        String str4 = b().get(str);
        if (str4 == null) {
            return "";
        }
        return str4;
    }
}
