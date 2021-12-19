package com.ss.android.ugc.aweme.inbox.d;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import h.q;
import h.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public final class h implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f104166a;

    /* renamed from: b  reason: collision with root package name */
    private static a f104167b;

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(31, new g(h.class, "onDetailAwemeEvent", com.ss.android.ugc.aweme.detail.g.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(32, new g(h.class, "onDetailFirstFrameEvent", com.ss.android.ugc.aweme.detail.g.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private h() {
    }

    static {
        Covode.recordClassIndex(66698);
        h hVar = new h();
        f104166a = hVar;
        cg.a(hVar);
    }

    public static void a() {
        a aVar = f104167b;
        if (aVar != null) {
            String str = aVar.f104168a;
            int i2 = aVar.f104169b;
            String str2 = aVar.f104170c;
            boolean z = aVar.f104171d;
            long j2 = aVar.f104172e;
            long j3 = aVar.f104173f;
            String str3 = aVar.f104174g;
            int i3 = aVar.f104175h;
            String str4 = aVar.f104176i;
            long j4 = aVar.f104177j;
            l.d(str, "");
            l.d(str2, "");
            b.i.b(new d(new a(str, i2, str2, z, j2, j3, str3, i3, str4, j4)), b.i.f4824a);
            f104167b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f104168a;

        /* renamed from: b  reason: collision with root package name */
        public final int f104169b;

        /* renamed from: c  reason: collision with root package name */
        public final String f104170c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f104171d;

        /* renamed from: e  reason: collision with root package name */
        public long f104172e;

        /* renamed from: f  reason: collision with root package name */
        public long f104173f;

        /* renamed from: g  reason: collision with root package name */
        public String f104174g;

        /* renamed from: h  reason: collision with root package name */
        public int f104175h;

        /* renamed from: i  reason: collision with root package name */
        public String f104176i;

        /* renamed from: j  reason: collision with root package name */
        public long f104177j;

        static {
            Covode.recordClassIndex(66699);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f104168a, aVar.f104168a) && this.f104169b == aVar.f104169b && l.a(this.f104170c, aVar.f104170c) && this.f104171d == aVar.f104171d && this.f104172e == aVar.f104172e && this.f104173f == aVar.f104173f && l.a(this.f104174g, aVar.f104174g) && this.f104175h == aVar.f104175h && l.a(this.f104176i, aVar.f104176i) && this.f104177j == aVar.f104177j;
        }

        public final String toString() {
            return "MetaData(aid=" + this.f104168a + ", nType=" + this.f104169b + ", nid=" + this.f104170c + ", isMetricDup=" + this.f104171d + ", clickTs=" + this.f104172e + ", awemeTs=" + this.f104173f + ", awemeLogId=" + this.f104174g + ", awemeErrorCode=" + this.f104175h + ", awemeErrorMsg=" + this.f104176i + ", videoTs=" + this.f104177j + ")";
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            String str = this.f104168a;
            int i5 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = ((i2 * 31) + this.f104169b) * 31;
            String str2 = this.f104170c;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            boolean z = this.f104171d;
            if (z) {
                z = true;
            }
            int i8 = z ? 1 : 0;
            int i9 = z ? 1 : 0;
            int i10 = z ? 1 : 0;
            long j2 = this.f104172e;
            long j3 = this.f104173f;
            int i11 = (((((i7 + i8) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            String str3 = this.f104174g;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (((i11 + i4) * 31) + this.f104175h) * 31;
            String str4 = this.f104176i;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            long j4 = this.f104177j;
            return ((i12 + i5) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        public /* synthetic */ a(String str, int i2, String str2, boolean z) {
            this(str, i2, str2, z, 0, 0, null, 0, null, 0);
        }

        public a(String str, int i2, String str2, boolean z, long j2, long j3, String str3, int i3, String str4, long j4) {
            l.d(str, "");
            l.d(str2, "");
            this.f104168a = str;
            this.f104169b = i2;
            this.f104170c = str2;
            this.f104171d = z;
            this.f104172e = j2;
            this.f104173f = j3;
            this.f104174g = str3;
            this.f104175h = i3;
            this.f104176i = str4;
            this.f104177j = j4;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104178a;

        static {
            Covode.recordClassIndex(66702);
        }

        d(a aVar) {
            this.f104178a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            if (f.a("notice_enter_video_perf", 1.0f)) {
                final z.a aVar = new z.a();
                int i3 = 0;
                aVar.element = false;
                AnonymousClass1 r5 = new h.f.a.b<Long, Long>() {
                    /* class com.ss.android.ugc.aweme.inbox.d.h.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(66703);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ Long invoke(Long l2) {
                        return Long.valueOf(a(l2.longValue()));
                    }

                    public final long a(long j2) {
                        if (j2 < 0 || j2 > 600000) {
                            aVar.element = true;
                        }
                        return j2;
                    }
                };
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("aid", this.f104178a.f104168a);
                    jSONObject.put(StringSet.type, this.f104178a.f104169b);
                    jSONObject.put("nid", this.f104178a.f104170c);
                    jSONObject.put("api_aweme_cost", r5.a(this.f104178a.f104173f - this.f104178a.f104172e));
                    jSONObject.put("api_aweme_status", this.f104178a.f104175h);
                    String str = this.f104178a.f104176i;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    jSONObject.put("api_aweme_error", str);
                    String str3 = this.f104178a.f104174g;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    jSONObject.put("api_aweme_log_id", str2);
                    if (this.f104178a.f104175h != 0) {
                        jSONObject.put("cost", r5.a(this.f104178a.f104173f - this.f104178a.f104172e));
                        jSONObject.put("video_cost", 0);
                    } else {
                        jSONObject.put("cost", r5.a(this.f104178a.f104177j - this.f104178a.f104172e));
                        jSONObject.put("video_cost", r5.a(this.f104178a.f104177j - this.f104178a.f104173f));
                    }
                    if (aVar.element) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObject.put("invalid_metrics", i2);
                    if (this.f104178a.f104171d) {
                        i3 = 1;
                    }
                    q.m223constructorimpl(jSONObject.put("dup_metrics", i3));
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                com.ss.android.ugc.aweme.common.r.a("notice_enter_video_perf", jSONObject);
            }
            return h.z.f158842a;
        }
    }

    private static void a(h.f.a.b<? super a, h.z> bVar) {
        a aVar = f104167b;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onDetailAwemeEvent(com.ss.android.ugc.aweme.detail.g.b bVar) {
        l.d(bVar, "");
        a(new b(bVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onDetailFirstFrameEvent(com.ss.android.ugc.aweme.detail.g.c cVar) {
        l.d(cVar, "");
        a(new c(cVar));
    }

    static final class c extends m implements h.f.a.b<a, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.detail.g.c $event;

        static {
            Covode.recordClassIndex(66701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.detail.g.c cVar) {
            super(1);
            this.$event = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            String str = this.$event.f79638a;
            if (!(str == null || str.length() == 0 || (!l.a((Object) this.$event.f79638a, (Object) aVar2.f104168a)))) {
                aVar2.f104177j = SystemClock.uptimeMillis();
                h.a();
            }
            return h.z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<a, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.detail.g.b $event;

        static {
            Covode.recordClassIndex(66700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.detail.g.b bVar) {
            super(1);
            this.$event = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(a aVar) {
            boolean z;
            String str;
            a aVar2 = aVar;
            l.d(aVar2, "");
            Throwable th = this.$event.f79637c;
            if (th != null) {
                th.getMessage();
            }
            String str2 = this.$event.f79635a;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !(!l.a((Object) this.$event.f79635a, (Object) aVar2.f104168a))) {
                aVar2.f104173f = SystemClock.uptimeMillis();
                String str3 = null;
                if (this.$event.f79637c != null) {
                    Throwable th2 = this.$event.f79637c;
                    if (th2 != null) {
                        str = th2.getMessage();
                    } else {
                        str = null;
                    }
                    aVar2.f104176i = str;
                    aVar2.f104175h = 1000;
                    try {
                        Throwable th3 = this.$event.f79637c;
                        if (th3 != null) {
                            JSONObject jSONObject = new JSONObject(((com.ss.android.ugc.aweme.base.api.a.b.a) th3).getResponse());
                            aVar2.f104175h = jSONObject.optInt("status_code", 1000);
                            JSONObject optJSONObject = jSONObject.optJSONObject("log_pb");
                            if (optJSONObject != null) {
                                str3 = optJSONObject.optString("impr_id");
                            }
                            aVar2.f104174g = str3;
                            q.m223constructorimpl(h.z.f158842a);
                            h.a();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    } catch (Throwable th4) {
                        q.m223constructorimpl(r.a(th4));
                    }
                } else {
                    Aweme aweme = this.$event.f79636b;
                    if (aweme != null) {
                        str3 = aweme.getRequestId();
                    }
                    aVar2.f104174g = str3;
                }
            }
            return h.z.f158842a;
        }
    }

    public static void b(String str, Integer num, String str2) {
        int i2;
        String str3;
        if (f.a("notice_enter_video_perf", 1.0f) && hk.a(str)) {
            if (str == null) {
                l.b();
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            if (str2 == null) {
                str2 = "";
            }
            a aVar = f104167b;
            if (aVar != null) {
                str3 = aVar.f104168a;
            } else {
                str3 = null;
            }
            a aVar2 = new a(str, i2, str2, l.a((Object) str3, (Object) str));
            aVar2.f104172e = SystemClock.uptimeMillis();
            f104167b = aVar2;
        }
    }

    public static void a(String str, Integer num, String str2) {
        if (str != null && p.a((CharSequence) str, (CharSequence) "aweme://aweme/detail/", false)) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("id");
                if (queryParameter == null || queryParameter.length() == 0) {
                    l.b(parse, "");
                    List<String> pathSegments = parse.getPathSegments();
                    if (pathSegments != null) {
                        queryParameter = pathSegments.get(1);
                    } else {
                        queryParameter = null;
                    }
                }
                b(queryParameter, num, str2);
                q.m223constructorimpl(h.z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
    }
}
