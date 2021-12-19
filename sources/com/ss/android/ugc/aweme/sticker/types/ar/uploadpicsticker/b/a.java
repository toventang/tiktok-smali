package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class a {
    public static final C3542a r = new C3542a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f135943a;

    /* renamed from: b  reason: collision with root package name */
    public String f135944b;

    /* renamed from: c  reason: collision with root package name */
    public String f135945c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f135946d;

    /* renamed from: e  reason: collision with root package name */
    public int f135947e;

    /* renamed from: f  reason: collision with root package name */
    public String f135948f;

    /* renamed from: g  reason: collision with root package name */
    public EffectSdkExtra f135949g = new EffectSdkExtra(null, 1, null);

    /* renamed from: h  reason: collision with root package name */
    public long f135950h;

    /* renamed from: i  reason: collision with root package name */
    public int f135951i = 1;

    /* renamed from: j  reason: collision with root package name */
    public String f135952j;

    /* renamed from: k  reason: collision with root package name */
    public String f135953k = "unknown";

    /* renamed from: l  reason: collision with root package name */
    public int f135954l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f135955m;
    public int n;
    public String o;
    public String p;
    public String q;

    static {
        Covode.recordClassIndex(88828);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a$a  reason: collision with other inner class name */
    public static final class C3542a {
        static {
            Covode.recordClassIndex(88829);
        }

        private C3542a() {
        }

        public /* synthetic */ C3542a(byte b2) {
            this();
        }
    }

    public final List<String> b() {
        return this.f135949g.getPl().getAlg();
    }

    public final String c() {
        return this.f135949g.getPl().getImgK();
    }

    public a() {
    }

    public final boolean a() {
        if (!k.a(this.f135949g.getPl().getAlg())) {
            return true;
        }
        return false;
    }

    public final a b(String str) {
        if (str != null) {
            try {
                this.q = new JSONObject(str).optString("effect_algorithm_hint");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    public final void a(String str) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            try {
                Object a2 = c.f149148c.a(str, EffectSdkExtra.class);
                l.b(a2, "");
                this.f135949g = (EffectSdkExtra) a2;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public a(String str, long j2) {
        l.d(str, "");
        this.f135944b = str;
        this.f135950h = j2;
    }

    public a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        this.f135944b = str;
        this.f135945c = str2;
        this.f135947e = i2;
    }

    public a(String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        this.f135944b = str;
        this.f135945c = str2;
        this.f135946d = z;
    }
}
