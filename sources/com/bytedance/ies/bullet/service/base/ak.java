package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class ak {

    /* renamed from: f  reason: collision with root package name */
    public static final ak f32533f = new ak("", null, null, null, null);

    /* renamed from: g  reason: collision with root package name */
    public static final b f32534g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f32535a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32536b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32537c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f32538d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f32539e;

    public static final class b {
        static {
            Covode.recordClassIndex(19318);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32540a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f32541b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f32542c;

        /* renamed from: d  reason: collision with root package name */
        public String f32543d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f32544e;

        static {
            Covode.recordClassIndex(19317);
        }

        public final ak a() {
            return new ak(this.f32540a, this.f32541b, this.f32543d, this.f32544e, this.f32542c, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(19316);
    }

    private ak(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f32535a = str;
        this.f32536b = str2;
        this.f32537c = str3;
        this.f32538d = jSONObject;
        this.f32539e = jSONObject2;
    }

    public /* synthetic */ ak(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, byte b2) {
        this(str, str2, str3, jSONObject, jSONObject2);
    }
}
