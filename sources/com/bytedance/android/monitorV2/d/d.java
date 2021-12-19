package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.webview.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f23847a;

    /* renamed from: b  reason: collision with root package name */
    public String f23848b;

    /* renamed from: c  reason: collision with root package name */
    public String f23849c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f23850d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f23851e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f23852f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f23853g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f23854h;

    /* renamed from: i  reason: collision with root package name */
    public JSONObject f23855i;

    /* renamed from: j  reason: collision with root package name */
    public JSONObject f23856j;

    /* renamed from: k  reason: collision with root package name */
    public JSONObject f23857k;

    /* renamed from: l  reason: collision with root package name */
    public JSONObject f23858l;

    /* renamed from: m  reason: collision with root package name */
    public String f23859m;
    public int n;
    public b o;

    static {
        Covode.recordClassIndex(14116);
    }

    private d() {
    }

    public String toString() {
        return "CustomInfo{url='" + this.f23847a + '\'' + ", bid='" + this.f23848b + '\'' + ", eventName='" + this.f23849c + '\'' + ", vid='" + this.f23859m + '\'' + ", canSample=" + this.n + '}';
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23860a;

        /* renamed from: b  reason: collision with root package name */
        public String f23861b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f23862c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f23863d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f23864e;

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f23865f;

        /* renamed from: g  reason: collision with root package name */
        public JSONObject f23866g;

        /* renamed from: h  reason: collision with root package name */
        public JSONObject f23867h;

        /* renamed from: i  reason: collision with root package name */
        public JSONObject f23868i;

        /* renamed from: j  reason: collision with root package name */
        public JSONObject f23869j;

        /* renamed from: k  reason: collision with root package name */
        public JSONObject f23870k;

        /* renamed from: l  reason: collision with root package name */
        public b f23871l;

        /* renamed from: m  reason: collision with root package name */
        private String f23872m;
        private String n;
        private int o;

        static {
            Covode.recordClassIndex(14117);
        }

        public final d a() {
            d dVar = new d((byte) 0);
            dVar.f23849c = this.f23872m;
            String str = this.f23860a;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            dVar.f23847a = str;
            String str3 = this.f23861b;
            if (str3 != null) {
                str2 = str3;
            }
            dVar.f23848b = str2;
            JSONObject jSONObject = this.f23862c;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            dVar.f23850d = jSONObject;
            JSONObject jSONObject2 = this.f23863d;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            dVar.f23851e = jSONObject2;
            JSONObject jSONObject3 = this.f23864e;
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            dVar.f23852f = jSONObject3;
            JSONObject jSONObject4 = this.f23865f;
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            dVar.f23853g = jSONObject4;
            dVar.n = this.o;
            JSONObject jSONObject5 = this.f23866g;
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            this.f23866g = jSONObject5;
            dVar.f23854h = jSONObject5;
            JSONObject jSONObject6 = this.f23867h;
            if (jSONObject6 == null) {
                jSONObject6 = new JSONObject();
            }
            dVar.f23855i = jSONObject6;
            dVar.f23859m = this.n;
            b bVar = this.f23871l;
            if (bVar == null) {
                bVar = HybridMultiMonitor.getInstance().getCustomReportMonitor();
            }
            dVar.o = bVar;
            JSONObject jSONObject7 = this.f23869j;
            if (jSONObject7 == null) {
                jSONObject7 = new JSONObject();
            }
            dVar.f23857k = jSONObject7;
            JSONObject jSONObject8 = this.f23868i;
            if (jSONObject8 == null) {
                jSONObject8 = new JSONObject();
            }
            dVar.f23856j = jSONObject8;
            JSONObject jSONObject9 = this.f23870k;
            if (jSONObject9 == null) {
                jSONObject9 = new JSONObject();
            }
            dVar.f23858l = jSONObject9;
            return dVar;
        }

        public final a a(String str) {
            this.f23860a = str;
            return this;
        }

        public final a b(JSONObject jSONObject) {
            this.f23863d = jSONObject;
            return this;
        }

        public final a c(JSONObject jSONObject) {
            this.f23864e = jSONObject;
            return this;
        }

        public final a d(JSONObject jSONObject) {
            this.f23866g = jSONObject;
            return this;
        }

        public final a e(JSONObject jSONObject) {
            this.f23867h = null;
            return this;
        }

        public a(String str) {
            this.f23872m = str;
        }

        public final a a(JSONObject jSONObject) {
            this.f23862c = jSONObject;
            return this;
        }

        public final a a(int i2) {
            if (i2 < 0 || i2 > 8) {
                i2 = 8;
            }
            this.o = i2;
            return this;
        }
    }

    /* synthetic */ d(byte b2) {
        this();
    }
}
