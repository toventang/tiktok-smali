package com.ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.k;
import h.a.n;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static volatile Aweme f92733a;

    /* renamed from: b  reason: collision with root package name */
    static volatile int f92734b;

    /* renamed from: c  reason: collision with root package name */
    static volatile d f92735c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final i f92736d = new i();

    public static final class d implements k {
        static {
            Covode.recordClassIndex(58819);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.video.preload.k
        public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
            String str;
            Aweme aweme = i.f92733a;
            if (aweme != null) {
                String aid = aweme.getAid();
                if (iVar != null) {
                    str = iVar.getSourceId();
                } else {
                    str = null;
                }
                if (!l.a((Object) aid, (Object) str)) {
                    return;
                }
                if (i.f92734b >= 5) {
                    i.f92733a = null;
                    i.f92734b = 0;
                    b.i.b(c.f92739a, b.i.f4824a);
                    return;
                }
                Aweme aweme2 = i.f92733a;
                if (aweme2 != null) {
                    i.f92734b++;
                    ac.a(aweme2, Integer.MAX_VALUE);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.video.preload.k
        public final void a(List<com.ss.android.ugc.playerkit.simapicommon.a.i> list) {
            Aweme aweme;
            Aweme aweme2 = i.f92733a;
            if (aweme2 != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (l.a((Object) aweme2.getAid(), (Object) it.next().getSourceId()) && (aweme = i.f92733a) != null) {
                        ac.a(aweme, Integer.MAX_VALUE);
                    }
                    arrayList.add(z.f158842a);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
            if (r7 != false) goto L_0x00af;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0094 A[SYNTHETIC, Splitter:B:27:0x0094] */
        @Override // com.ss.android.ugc.aweme.video.preload.k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.util.Pair<com.ss.android.ugc.playerkit.simapicommon.a.i, java.lang.String> r11) {
            /*
            // Method dump skipped, instructions count: 221
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.i.d.a(android.util.Pair):void");
        }
    }

    private i() {
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92737a = new a();

        static {
            Covode.recordClassIndex(58816);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                com.ss.android.common.c.a.a("cache_video_request", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92738a = new b();

        static {
            Covode.recordClassIndex(58817);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                com.ss.android.common.c.a.a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92739a = new c();

        static {
            Covode.recordClassIndex(58818);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", 1024);
                com.ss.android.common.c.a.a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(58815);
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String a2 = com.ss.android.ugc.aweme.video.preload.b.a(str);
        if (!new File(a2 + ".mdl").exists() || !new File(a2 + ".mdlnodeconf").exists()) {
            return false;
        }
        return true;
    }
}
