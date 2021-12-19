package com.bytedance.android.ecommerce.e;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.i.b;
import com.bytedance.android.ecommerce.j.k;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f7029a;

    /* renamed from: b  reason: collision with root package name */
    public String f7030b;

    /* renamed from: c  reason: collision with root package name */
    public JSONArray f7031c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f7032d;

    /* renamed from: e  reason: collision with root package name */
    public JSONArray f7033e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7034f;

    /* renamed from: g  reason: collision with root package name */
    public String f7035g;

    /* renamed from: h  reason: collision with root package name */
    public String f7036h;

    /* renamed from: i  reason: collision with root package name */
    public String f7037i;

    /* renamed from: j  reason: collision with root package name */
    public String f7038j;

    /* renamed from: k  reason: collision with root package name */
    public b f7039k;

    /* renamed from: l  reason: collision with root package name */
    public String f7040l;

    /* renamed from: m  reason: collision with root package name */
    public j f7041m;
    public String n;
    public String o;
    public k p;
    public String q;
    public String r;
    public com.bytedance.android.ecommerce.c.b s;

    static {
        Covode.recordClassIndex(3375);
    }

    /* renamed from: com.bytedance.android.ecommerce.e.a$a  reason: collision with other inner class name */
    public static class C0095a {

        /* renamed from: a  reason: collision with root package name */
        public final Application f7042a;

        /* renamed from: b  reason: collision with root package name */
        public String f7043b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f7044c;

        /* renamed from: d  reason: collision with root package name */
        public JSONArray f7045d;

        /* renamed from: e  reason: collision with root package name */
        public JSONArray f7046e;

        /* renamed from: f  reason: collision with root package name */
        public JSONArray f7047f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7048g = true;

        /* renamed from: h  reason: collision with root package name */
        public String f7049h;

        /* renamed from: i  reason: collision with root package name */
        public String f7050i;

        /* renamed from: j  reason: collision with root package name */
        public String f7051j;

        /* renamed from: k  reason: collision with root package name */
        public String f7052k;

        /* renamed from: l  reason: collision with root package name */
        public b f7053l;

        /* renamed from: m  reason: collision with root package name */
        public String f7054m;
        public j n;
        public String o;
        public String p;
        public k q;
        public String r;
        public String s;
        public com.bytedance.android.ecommerce.c.b t;

        static {
            Covode.recordClassIndex(3376);
        }

        public final a a() {
            JSONObject jSONObject = this.f7044c;
            if (jSONObject != null) {
                if (this.f7045d == null) {
                    this.f7045d = jSONObject.optJSONArray("bank_card_rules");
                }
                if (this.f7046e == null) {
                    this.f7046e = this.f7044c.optJSONArray("methods");
                }
                if (this.f7047f == null) {
                    this.f7047f = this.f7044c.optJSONArray("stored_methods");
                }
            }
            if (this.f7045d == null) {
                this.f7045d = new JSONArray();
            }
            if (this.f7046e == null) {
                this.f7046e = new JSONArray();
            }
            if (this.f7047f == null) {
                this.f7047f = new JSONArray();
            }
            TextUtils.isEmpty(this.f7051j);
            if (TextUtils.isEmpty(this.f7049h)) {
                this.f7049h = "k8vif92e";
            }
            if (TextUtils.isEmpty(this.f7050i)) {
                this.f7050i = "bytedance";
            }
            if (TextUtils.isEmpty(this.f7054m)) {
                this.f7054m = "en";
            }
            if (this.f7053l == null) {
                this.f7053l = new f();
            }
            if (this.n == null) {
                this.n = j.f26946a;
            }
            return new a(this);
        }

        public C0095a(Application application) {
            this.f7042a = application;
        }
    }

    public final String toString() {
        return "{mContext=" + this.f7029a + ", mHost='" + this.f7030b + '\'' + ", mBankCardRules=" + this.f7031c + ", mMethods=" + this.f7032d + ", mStoredMethods=" + this.f7033e + ", mOrgId='" + this.f7035g + '\'' + ", mMerchantId='" + this.f7036h + '\'' + ", mSessionId='" + this.f7037i + '\'' + ", mRsaPublicKey='" + this.f7038j + '\'' + '}';
    }

    public a(C0095a aVar) {
        this.f7029a = aVar.f7042a;
        this.f7030b = aVar.f7043b;
        this.f7031c = aVar.f7045d;
        this.f7032d = aVar.f7046e;
        this.f7033e = aVar.f7047f;
        this.f7034f = aVar.f7048g;
        this.f7035g = aVar.f7049h;
        this.f7036h = aVar.f7050i;
        this.f7037i = aVar.f7051j;
        this.f7038j = aVar.f7052k;
        this.f7039k = aVar.f7053l;
        this.f7040l = aVar.f7054m;
        this.f7041m = aVar.n;
        this.n = aVar.o;
        this.o = aVar.p;
        this.p = aVar.q;
        this.q = aVar.r;
        this.r = aVar.s;
        this.s = aVar.t;
        if (!TextUtils.isEmpty(this.f7030b)) {
            com.bytedance.android.ecommerce.d.a.f7028a = this.f7030b;
        }
    }
}
