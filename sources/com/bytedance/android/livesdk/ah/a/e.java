package com.bytedance.android.livesdk.ah.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, d> f13704a;

    /* renamed from: b  reason: collision with root package name */
    private d f13705b = new c();

    static {
        Covode.recordClassIndex(7613);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13706a = new e();

        static {
            Covode.recordClassIndex(7614);
        }
    }

    e() {
        HashMap hashMap = new HashMap();
        this.f13704a = hashMap;
        hashMap.put("android.permission.CAMERA", new b());
        this.f13704a.put("android.permission.RECORD_AUDIO", new a());
    }

    @Override // com.bytedance.android.livesdk.ah.a.d
    public final boolean a(Context context, String str) {
        if (this.f13704a.containsKey(str)) {
            return this.f13704a.get(str).a(context, str);
        }
        return this.f13705b.a(context, str);
    }

    public final boolean a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }
}
