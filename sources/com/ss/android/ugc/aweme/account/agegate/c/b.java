package com.ss.android.ugc.aweme.account.agegate.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.util.u;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.cv;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62707a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f62708b = h.i.a((h.f.a.a) g.f62724a);

    public static final class c {
        @com.google.gson.a.c(a = "message")

        /* renamed from: a  reason: collision with root package name */
        public final String f62713a;
        @com.google.gson.a.c(a = "data")

        /* renamed from: b  reason: collision with root package name */
        public final e f62714b;

        static {
            Covode.recordClassIndex(38637);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f62713a, cVar.f62713a) && l.a(this.f62714b, cVar.f62714b);
        }

        public final int hashCode() {
            String str = this.f62713a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            e eVar = this.f62714b;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "UpdateUserNameNetworkEntity(message=" + this.f62713a + ", data=" + this.f62714b + ")";
        }
    }

    static {
        Covode.recordClassIndex(38634);
    }

    public final String a() {
        return (String) this.f62708b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38635);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static abstract class d {
        static {
            Covode.recordClassIndex(38638);
        }

        private d() {
        }

        /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$d$b  reason: collision with other inner class name */
        public static final class C1379b extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final C1379b f62717a = new C1379b();

            private C1379b() {
                super((byte) 0);
            }

            static {
                Covode.recordClassIndex(38640);
            }
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            public final int f62715a;

            /* renamed from: b  reason: collision with root package name */
            public final String f62716b;

            static {
                Covode.recordClassIndex(38639);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f62715a == aVar.f62715a && l.a(this.f62716b, aVar.f62716b);
            }

            public final int hashCode() {
                int i2 = this.f62715a * 31;
                String str = this.f62716b;
                return i2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "Invalid(errorCode=" + this.f62715a + ", description=" + this.f62716b + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i2, String str) {
                super((byte) 0);
                l.d(str, "");
                this.f62715a = i2;
                this.f62716b = str;
            }
        }
    }

    public static final class e {
        @com.google.gson.a.c(a = "error_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f62718a;
        @com.google.gson.a.c(a = "description")

        /* renamed from: b  reason: collision with root package name */
        public final String f62719b;
        @com.google.gson.a.c(a = "login_name")

        /* renamed from: c  reason: collision with root package name */
        public final String f62720c;

        static {
            Covode.recordClassIndex(38641);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f62718a == eVar.f62718a && l.a(this.f62719b, eVar.f62719b) && l.a(this.f62720c, eVar.f62720c);
        }

        public final int hashCode() {
            int i2 = this.f62718a * 31;
            String str = this.f62719b;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f62720c;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return hashCode + i3;
        }

        public final String toString() {
            return "UserNameDataEntity(errorCode=" + this.f62718a + ", description=" + this.f62719b + ", loginName=" + this.f62720c + ")";
        }

        private /* synthetic */ e() {
            this("", "");
        }

        private e(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f62718a = 0;
            this.f62719b = str;
            this.f62720c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.b$b  reason: collision with other inner class name */
    public static final class C1378b {
        @com.google.gson.a.c(a = "login_name")

        /* renamed from: a  reason: collision with root package name */
        public final String f62709a = null;
        @com.google.gson.a.c(a = "description")

        /* renamed from: b  reason: collision with root package name */
        public final String f62710b = null;
        @com.google.gson.a.c(a = "error_code")

        /* renamed from: c  reason: collision with root package name */
        public final String f62711c = null;
        @com.google.gson.a.c(a = "recommend_usernames")

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f62712d = null;

        static {
            Covode.recordClassIndex(38636);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1378b)) {
                return false;
            }
            C1378b bVar = (C1378b) obj;
            return l.a(this.f62709a, bVar.f62709a) && l.a(this.f62710b, bVar.f62710b) && l.a(this.f62711c, bVar.f62711c) && l.a(this.f62712d, bVar.f62712d);
        }

        public final int hashCode() {
            String str = this.f62709a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f62710b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f62711c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<String> list = this.f62712d;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "LoginNameCheckData(loginName=" + this.f62709a + ", description=" + this.f62710b + ", error_code=" + this.f62711c + ", suggestions=" + this.f62712d + ")";
        }

        private C1378b() {
        }
    }

    static final class g extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f62724a = new g();

        static {
            Covode.recordClassIndex(38643);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return u.a(cj.f());
        }
    }

    public static final class h implements cv {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62726b;

        static {
            Covode.recordClassIndex(38644);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateFailed(String str) {
            this.f62726b.invoke(str);
        }

        @Override // com.ss.android.ugc.aweme.cv
        public final void onUpdateSuccess(boolean z) {
            this.f62725a.invoke(Boolean.valueOf(z));
        }

        h(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f62725a = bVar;
            this.f62726b = bVar2;
        }
    }

    public static final class f extends com.bytedance.sdk.a.c<com.bytedance.sdk.a.a.d.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f62721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f62722d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f62723e;

        static {
            Covode.recordClassIndex(38642);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.d dVar) {
            if (dVar == null) {
                this.f62722d.invoke(null, null);
            } else {
                this.f62723e.invoke();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.d dVar, int i2) {
            JSONObject jSONObject;
            List<String> list;
            com.bytedance.sdk.a.a.d.d dVar2 = dVar;
            String str = null;
            if (dVar2 != null) {
                jSONObject = dVar2.v;
            } else {
                jSONObject = null;
            }
            C1378b bVar = (C1378b) NetworkProxyAccount.f65195b.a().a(String.valueOf(jSONObject), C1378b.class);
            if (bVar != null) {
                list = bVar.f62712d;
            } else {
                list = null;
            }
            h.f.a.m mVar = this.f62722d;
            if (dVar2 != null) {
                str = dVar2.f43075f;
            }
            mVar.invoke(list, str);
        }

        f(String str, h.f.a.m mVar, h.f.a.a aVar) {
            this.f62721c = str;
            this.f62722d = mVar;
            this.f62723e = aVar;
        }
    }

    static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62727a;

        static {
            Covode.recordClassIndex(38645);
        }

        i(b bVar) {
            this.f62727a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            return new org.a.b(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.c.b.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f62728a;

                static {
                    Covode.recordClassIndex(38646);
                }

                {
                    this.f62728a = r1;
                }

                @Override // org.a.b
                public final void a_(org.a.c<? super d> cVar) {
                    d dVar;
                    c cVar2 = (c) NetworkProxyAccount.f65195b.a().a(str, (Class) c.class);
                    l.b(cVar2, "");
                    if (cVar2.f62714b.f62718a != 0) {
                        dVar = new d.a(cVar2.f62714b.f62718a, cVar2.f62714b.f62719b);
                    } else {
                        dVar = d.C1379b.f62717a;
                    }
                    cVar.onNext(dVar);
                }
            };
        }
    }
}
