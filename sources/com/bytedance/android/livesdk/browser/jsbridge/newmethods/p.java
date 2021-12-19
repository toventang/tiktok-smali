package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.c.af;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.kakao.usermgmt.StringSet;
import f.a.d.f;
import f.a.d.k;
import h.f.b.l;
import h.f.b.m;
import h.v;
import org.json.JSONObject;

public final class p extends e<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.b.a f14702a = new f.a.b.a();

    public static final class a {
        @com.google.gson.a.c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        public final String f14703a;
        @com.google.gson.a.c(a = "content")

        /* renamed from: b  reason: collision with root package name */
        public final String f14704b;
        @com.google.gson.a.c(a = "sender")

        /* renamed from: c  reason: collision with root package name */
        public final String f14705c;
        @com.google.gson.a.c(a = "args")

        /* renamed from: d  reason: collision with root package name */
        public final JSONObject f14706d;

        static {
            Covode.recordClassIndex(8165);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f14703a, aVar.f14703a) && l.a(this.f14704b, aVar.f14704b) && l.a(this.f14705c, aVar.f14705c) && l.a(this.f14706d, aVar.f14706d);
        }

        public final int hashCode() {
            String str = this.f14703a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f14704b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f14705c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            JSONObject jSONObject = this.f14706d;
            if (jSONObject != null) {
                i2 = jSONObject.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "Params(type=" + this.f14703a + ", content=" + this.f14704b + ", sender=" + this.f14705c + ", args=" + this.f14706d + ")";
        }
    }

    static {
        Covode.recordClassIndex(8164);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f14702a.dispose();
    }

    static final class b extends m implements h.f.a.b<String, h.p<? extends String, ? extends Object>> {
        final /* synthetic */ JSONObject $this_asMap;

        static {
            Covode.recordClassIndex(8166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(JSONObject jSONObject) {
            super(1);
            this.$this_asMap = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.p<? extends String, ? extends Object> invoke(String str) {
            String str2 = str;
            return v.a(str2, this.$this_asMap.get(str2));
        }
    }

    static final class c<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f14707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.c.m f14708b;

        static {
            Covode.recordClassIndex(8167);
        }

        c(p pVar, com.bytedance.android.livesdk.chatroom.c.m mVar) {
            this.f14707a = pVar;
            this.f14708b = mVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            af afVar = (af) obj;
            l.d(afVar, "");
            if (afVar.f15081a == this.f14708b) {
                return true;
            }
            return false;
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f14709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.c.m f14710b;

        static {
            Covode.recordClassIndex(8168);
        }

        d(p pVar, com.bytedance.android.livesdk.chatroom.c.m mVar) {
            this.f14709a = pVar;
            this.f14710b = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((af) obj).f15082b) {
                this.f14709a.finishWithSuccess();
            } else {
                this.f14709a.finishWithFailure();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        if (r8 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    @Override // com.bytedance.ies.web.jsbridge2.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void invoke(com.bytedance.android.livesdk.browser.jsbridge.newmethods.p.a r10, com.bytedance.ies.web.jsbridge2.g r11) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p.invoke(java.lang.Object, com.bytedance.ies.web.jsbridge2.g):void");
    }
}
