package com.ss.android.ugc.aweme.qrcode.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ck.v;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119738a = new a();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.e.a$a  reason: collision with other inner class name */
    public static final class C3090a extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(77793);
        }

        C3090a() {
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(77792);
    }

    public static final Map<String, Object> a(String str) {
        l.d(str, "");
        try {
            return (Map) new f().a(v.b(str, "meta_params"), new C3090a().type);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
