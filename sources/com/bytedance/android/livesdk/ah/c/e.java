package com.bytedance.android.livesdk.ah.c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, c> f13721b;

    /* renamed from: a  reason: collision with root package name */
    c f13722a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13723a = new e();

        static {
            Covode.recordClassIndex(7629);
        }
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public final boolean b() {
        return c().b();
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public final boolean a() {
        return c().a();
    }

    static {
        Covode.recordClassIndex(7628);
        HashMap hashMap = new HashMap();
        f13721b = hashMap;
        hashMap.put("VIVO", new g());
        hashMap.put("MEIZU", new d());
        hashMap.put("HUAWEI", new b());
        hashMap.put("XIAOMI", new h());
        hashMap.put("OPPO", new f());
    }

    private c c() {
        if (this.f13722a == null) {
            this.f13722a = new a();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                Map<String, c> map = f13721b;
                if (map.containsKey(upperCase)) {
                    this.f13722a = map.get(upperCase);
                }
            }
        }
        return this.f13722a;
    }

    @Override // com.bytedance.android.livesdk.ah.c.c
    public final Intent a(Context context) {
        return c().a(context);
    }
}
