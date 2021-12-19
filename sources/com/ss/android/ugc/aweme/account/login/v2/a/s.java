package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.f.b;
import com.bytedance.sdk.a.f.h;
import com.bytedance.sdk.a.h.a.i;
import h.f.b.l;
import org.json.JSONObject;

public final class s extends h<u> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f64262f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public boolean f64263e;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.a.n.a f64264g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f64265h = new JSONObject();

    /* renamed from: i  reason: collision with root package name */
    private final b f64266i;

    static {
        Covode.recordClassIndex(39592);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39593);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(u uVar) {
        String str;
        String str2;
        u uVar2 = uVar;
        if (this.f64263e) {
            str = "passport_mobile_reset_password";
            str2 = "mobile";
        } else {
            str = "passport_email_reset_password";
            str2 = "email";
        }
        com.bytedance.sdk.a.i.a.a(str, str2, "force_reset_pw", uVar2);
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        this.f64264g = b.a.a(jSONObject, jSONObject2);
        this.f64265h = jSONObject2;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ u a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        int i2;
        l.d(bVar, "");
        if (this.f64263e) {
            i2 = 1010;
        } else {
            i2 = 10002;
        }
        b bVar2 = this.f64266i;
        JSONObject jSONObject = this.f64265h;
        u uVar = new u(i2, bVar2, jSONObject, jSONObject.optString("captcha"), this.f64264g);
        if (!z) {
            uVar.f43073d = bVar.f43158b;
            uVar.f43075f = bVar.f43159c;
        }
        return uVar;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(jSONObject, "");
        l.d(jSONObject2, "");
        com.bytedance.sdk.a.f.b.a(this.f64266i, jSONObject);
        this.f64266i.f43284m = jSONObject2;
    }

    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        public final String f64267a;

        /* renamed from: b  reason: collision with root package name */
        public final String f64268b;

        /* renamed from: c  reason: collision with root package name */
        public final String f64269c;

        static {
            Covode.recordClassIndex(39594);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f64267a, bVar.f64267a) && l.a(this.f64268b, bVar.f64268b) && l.a(this.f64269c, bVar.f64269c);
        }

        public final int hashCode() {
            String str = this.f64267a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f64268b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f64269c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "ForceResetPassObj(password=" + this.f64267a + ", conditionalLoginTicket=" + this.f64268b + ", ticket=" + this.f64269c + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3) {
            super(13);
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f64267a = str;
            this.f64268b = str2;
            this.f64269c = str3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, com.bytedance.sdk.a.d.a aVar, b bVar, t tVar) {
        super(context, aVar, tVar);
        l.d(bVar, "");
        this.f64266i = bVar;
    }
}
