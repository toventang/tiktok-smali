package com.ss.android.ugc.aweme.inbox.d;

import android.os.SystemClock;
import b.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f104183a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f104184b = new j();

    public enum a {
        DETAIL_TYPE_LIKE_LIST("like_list"),
        DETAIL_TYPE_NOTIFICATION("notification"),
        DETAIL_TYPE_FOLLOW_REQUEST("follow_request"),
        DETAIL_TYPE_TRANSLATION_LIKE_LIST("translation_like_list");
        
        private final String typeName;

        public final String getTypeName() {
            return this.typeName;
        }

        static {
            Covode.recordClassIndex(66707);
        }

        private a(String str) {
            this.typeName = str;
        }
    }

    private j() {
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f104186a;

        /* renamed from: b  reason: collision with root package name */
        public int f104187b;

        /* renamed from: c  reason: collision with root package name */
        public int f104188c;

        /* renamed from: d  reason: collision with root package name */
        public String f104189d;

        /* renamed from: e  reason: collision with root package name */
        public String f104190e;

        /* renamed from: f  reason: collision with root package name */
        public long f104191f;

        /* renamed from: g  reason: collision with root package name */
        public long f104192g;

        /* renamed from: h  reason: collision with root package name */
        public int f104193h;

        /* renamed from: i  reason: collision with root package name */
        public long f104194i;

        /* renamed from: j  reason: collision with root package name */
        public long f104195j;

        static {
            Covode.recordClassIndex(66708);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f104186a, bVar.f104186a) && this.f104187b == bVar.f104187b && this.f104188c == bVar.f104188c && l.a(this.f104189d, bVar.f104189d) && l.a(this.f104190e, bVar.f104190e) && this.f104191f == bVar.f104191f && this.f104192g == bVar.f104192g && this.f104193h == bVar.f104193h && this.f104194i == bVar.f104194i && this.f104195j == bVar.f104195j;
        }

        public final String toString() {
            return "MetaData(type=" + this.f104186a + ", diggType=" + this.f104187b + ", groupType=" + this.f104188c + ", nid=" + this.f104189d + ", logId=" + this.f104190e + ", clickTs=" + this.f104191f + ", requestTs=" + this.f104192g + ", apiState=" + this.f104193h + ", adapterSetDataTs=" + this.f104194i + ", renderedTs=" + this.f104195j + ")";
        }

        public /* synthetic */ b() {
            this("", "", "");
        }

        public final int hashCode() {
            int i2;
            int i3;
            String str = this.f104186a;
            int i4 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = ((((i2 * 31) + this.f104187b) * 31) + this.f104188c) * 31;
            String str2 = this.f104189d;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i6 = (i5 + i3) * 31;
            String str3 = this.f104190e;
            if (str3 != null) {
                i4 = str3.hashCode();
            }
            long j2 = this.f104191f;
            long j3 = this.f104192g;
            long j4 = this.f104194i;
            long j5 = this.f104195j;
            return ((((((((((i6 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f104193h) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }

        private b(String str, String str2, String str3) {
            this.f104186a = str;
            this.f104187b = 0;
            this.f104188c = 0;
            this.f104189d = str2;
            this.f104190e = str3;
            this.f104191f = 0;
            this.f104192g = 0;
            this.f104193h = 0;
            this.f104194i = 0;
            this.f104195j = 0;
        }
    }

    public static void a() {
        a(f.f104197a);
    }

    public static void b() {
        a(e.f104196a);
    }

    static {
        Covode.recordClassIndex(66706);
    }

    static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f104198a;

        static {
            Covode.recordClassIndex(66714);
        }

        h(b bVar) {
            this.f104198a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, this.f104198a.f104186a);
                jSONObject.put("digg_type", this.f104198a.f104187b);
                jSONObject.put("group_type", this.f104198a.f104188c);
                jSONObject.put("nid", this.f104198a.f104189d);
                jSONObject.put("cost", this.f104198a.f104195j - this.f104198a.f104191f);
                jSONObject.put("api_cost", this.f104198a.f104194i - this.f104198a.f104192g);
                jSONObject.put("api_status", this.f104198a.f104193h);
                jSONObject.put("log_id", this.f104198a.f104190e);
                q.m223constructorimpl(jSONObject.put("render_cost", this.f104198a.f104195j - this.f104198a.f104194i));
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
            com.ss.android.ugc.aweme.common.r.a("notice_enter_detail_perf", jSONObject);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f104197a = new f();

        static {
            Covode.recordClassIndex(66712);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f104192g = SystemClock.uptimeMillis();
            return z.f158842a;
        }
    }

    public static void a(int i2) {
        a(new c(i2));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<b, z> {
        final /* synthetic */ int $count;

        static {
            Covode.recordClassIndex(66709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(1);
            this.$count = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f104194i = SystemClock.uptimeMillis();
            if (this.$count == 0) {
                if (bVar2.f104193h != 1) {
                    bVar2.f104193h = 2;
                }
                j.b();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f104196a = new e();

        static {
            Covode.recordClassIndex(66711);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f104195j = SystemClock.uptimeMillis();
            i.b(new h(bVar2), i.f4824a);
            j.f104183a = null;
            return z.f158842a;
        }
    }

    public static void a(BaseResponse baseResponse) {
        a(new g(baseResponse));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<b, z> {
        final /* synthetic */ a $detailType;
        final /* synthetic */ String $nid;
        final /* synthetic */ int $subType;

        static {
            Covode.recordClassIndex(66710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, int i2, String str) {
            super(1);
            this.$detailType = aVar;
            this.$subType = i2;
            this.$nid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.f104186a = this.$detailType.getTypeName();
            int i2 = k.f104199a[this.$detailType.ordinal()];
            if (i2 == 1) {
                bVar2.f104187b = this.$subType;
            } else if (i2 == 2) {
                bVar2.f104188c = this.$subType;
            }
            bVar2.f104189d = this.$nid;
            bVar2.f104191f = SystemClock.uptimeMillis();
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<b, z> {
        final /* synthetic */ BaseResponse $response;

        static {
            Covode.recordClassIndex(66713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BaseResponse baseResponse) {
            super(1);
            this.$response = baseResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b bVar) {
            int i2;
            String str;
            BaseResponse.ServerTimeExtra serverTimeExtra;
            b bVar2 = bVar;
            l.d(bVar2, "");
            BaseResponse baseResponse = this.$response;
            if (baseResponse == null || baseResponse.status_code != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bVar2.f104193h = i2;
            BaseResponse baseResponse2 = this.$response;
            if (baseResponse2 == null || (serverTimeExtra = baseResponse2.extra) == null) {
                str = null;
            } else {
                str = serverTimeExtra.logid;
            }
            bVar2.f104190e = str;
            return z.f158842a;
        }
    }

    private static void a(h.f.a.b<? super b, z> bVar) {
        b bVar2 = f104183a;
        if (bVar2 != null) {
            bVar.invoke(bVar2);
        }
    }

    public static void a(a aVar, int i2, String str) {
        l.d(aVar, "");
        if (f104183a != null) {
            f104183a = null;
            return;
        }
        f104183a = new b();
        a(new d(aVar, i2, str));
    }
}
