package com.ss.ttvideoengine.o;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.preload.BuildConfig;
import com.bytedance.y.f;
import com.ss.ttm.player.r;
import com.ss.ttvideoengine.b;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.k.k;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f153128a = "SettingsHelper";

    /* renamed from: b  reason: collision with root package name */
    public static String f153129b = com.bytedance.y.a.f46164a;

    /* renamed from: c  reason: collision with root package name */
    public static String f153130c = com.bytedance.y.a.f46165b;

    /* renamed from: d  reason: collision with root package name */
    public static String f153131d = com.bytedance.y.a.f46166c;

    /* renamed from: e  reason: collision with root package name */
    public static String f153132e = "vod";

    /* renamed from: f  reason: collision with root package name */
    public static String f153133f = "mdl";

    /* renamed from: g  reason: collision with root package name */
    public static int f153134g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static int f153135h = 3;

    /* renamed from: i  reason: collision with root package name */
    public f f153136i;

    /* renamed from: j  reason: collision with root package name */
    public Context f153137j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f153138k;

    /* renamed from: l  reason: collision with root package name */
    public int f153139l;

    /* renamed from: m  reason: collision with root package name */
    public k f153140m;
    private String n;
    private String o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.o.a$a  reason: collision with other inner class name */
    public static class C4073a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f153144a = new a();

        static {
            Covode.recordClassIndex(101741);
        }
    }

    private String d() {
        if (this.o == null) {
            this.o = d.h.f152465a.f();
        }
        return this.o;
    }

    public static a a() {
        if (C4073a.f153144a.f153136i == null) {
            C4073a.f153144a.f153136i = f.a();
        }
        return C4073a.f153144a;
    }

    private String c() {
        if (this.n == null) {
            this.n = r.a(14, "");
        }
        return this.n;
    }

    static {
        Covode.recordClassIndex(101738);
    }

    public final a b() {
        String str;
        if (!TextUtils.isEmpty(b.f152309g)) {
            if (b.f152309g.equals("cn-north-1")) {
                com.bytedance.y.a.f46171h = com.bytedance.y.a.f46164a;
            } else {
                com.bytedance.y.a.f46171h = b.f152309g;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aid", Integer.valueOf(b.f152304b));
        hashMap.put("app_name", b.f152305c);
        if (b.f152308f == null) {
            str = "";
        } else {
            str = b.f152308f;
        }
        hashMap.put("device_id", str);
        hashMap.put("app_channel", b.f152306d);
        hashMap.put("app_version", b.f152307e);
        com.bytedance.y.a.f46172i = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdk_version", "1.10.62.3");
        hashMap2.put("player_version", c());
        hashMap2.put("mdl_version", d());
        hashMap2.put("st_version", BuildConfig.VERSION_NAME);
        hashMap2.put("settings_version", "2.0.1");
        com.bytedance.y.a.f46173j = hashMap2;
        return this;
    }

    public final a a(String str) {
        f fVar;
        if (!(this.f153139l == 0 || this.f153137j == null || (fVar = this.f153136i) == null)) {
            fVar.a(str);
        }
        return this;
    }

    public final void a(int i2) {
        this.f153139l = i2;
        if (com.bytedance.y.a.f46171h != null) {
            b().a(f153132e);
        }
    }

    public final int a(String str, int i2) {
        if (this.f153139l == 0) {
            return i2;
        }
        return this.f153136i.a("vod", str, i2);
    }

    public final a a(int i2, String str) {
        switch (i2) {
            case 116:
                com.bytedance.y.a.f46170g = str;
                break;
            case 117:
                com.bytedance.y.a.f46169f = str;
                break;
            case 118:
                com.bytedance.y.a.f46168e = str;
                break;
        }
        return this;
    }
}
