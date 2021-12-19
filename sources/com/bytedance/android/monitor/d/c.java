package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f23430a;

    /* renamed from: b  reason: collision with root package name */
    public String f23431b;

    /* renamed from: c  reason: collision with root package name */
    public String f23432c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f23433d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f23434e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f23435f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f23436g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f23437h;

    /* renamed from: i  reason: collision with root package name */
    public String f23438i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23439j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.android.monitor.webview.a f23440k;

    static {
        Covode.recordClassIndex(13948);
    }

    private c() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23441a;

        /* renamed from: b  reason: collision with root package name */
        public String f23442b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f23443c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f23444d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f23445e;

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f23446f;

        /* renamed from: g  reason: collision with root package name */
        public JSONObject f23447g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23448h;

        /* renamed from: i  reason: collision with root package name */
        public com.bytedance.android.monitor.webview.a f23449i;

        /* renamed from: j  reason: collision with root package name */
        private String f23450j;

        /* renamed from: k  reason: collision with root package name */
        private String f23451k;

        static {
            Covode.recordClassIndex(13949);
        }

        public final c a() {
            c cVar = new c((byte) 0);
            cVar.f23432c = this.f23450j;
            cVar.f23430a = this.f23441a;
            cVar.f23431b = this.f23442b;
            cVar.f23433d = this.f23443c;
            cVar.f23434e = this.f23444d;
            JSONObject jSONObject = this.f23445e;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            cVar.f23435f = jSONObject;
            cVar.f23436g = this.f23446f;
            JSONObject jSONObject2 = this.f23447g;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            cVar.f23437h = jSONObject2;
            cVar.f23439j = this.f23448h;
            cVar.f23438i = this.f23451k;
            com.bytedance.android.monitor.webview.a aVar = this.f23449i;
            if (aVar == null) {
                aVar = HybridMonitor.getInstance().getCustomReportMonitor();
            }
            cVar.f23440k = aVar;
            return cVar;
        }

        public final a a(com.bytedance.android.monitor.webview.a aVar) {
            this.f23449i = aVar;
            return this;
        }

        public final a b(String str) {
            this.f23442b = str;
            return this;
        }

        public final a c(String str) {
            this.f23451k = str;
            return this;
        }

        public final a d(JSONObject jSONObject) {
            this.f23446f = jSONObject;
            return this;
        }

        public final a e(JSONObject jSONObject) {
            this.f23447g = jSONObject;
            return this;
        }

        public a(String str) {
            this.f23450j = str;
        }

        public final a a(String str) {
            this.f23441a = str;
            return this;
        }

        public final a b(JSONObject jSONObject) {
            this.f23444d = jSONObject;
            return this;
        }

        public final a c(JSONObject jSONObject) {
            this.f23445e = jSONObject;
            return this;
        }

        public final a a(JSONObject jSONObject) {
            this.f23443c = jSONObject;
            return this;
        }

        public final a a(boolean z) {
            this.f23448h = z;
            return this;
        }
    }

    public String toString() {
        return "CustomInfo{url='" + this.f23430a + '\'' + ", biz='" + this.f23431b + '\'' + ", eventName='" + this.f23432c + '\'' + ", vid='" + this.f23438i + '\'' + ", isSample=" + this.f23439j + '}';
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
