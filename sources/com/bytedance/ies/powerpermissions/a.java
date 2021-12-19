package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.d.b;
import com.bytedance.ies.powerpermissions.d.c;
import com.bytedance.ies.powerpermissions.d.d;
import com.bytedance.ies.powerpermissions.d.e;
import com.bytedance.ies.powerpermissions.d.f;
import com.bytedance.ies.powerpermissions.d.g;
import com.bytedance.ies.powerpermissions.d.h;
import com.bytedance.ies.powerpermissions.d.i;
import com.bytedance.ies.powerpermissions.d.j;
import com.bytedance.ies.powerpermissions.d.k;
import h.f.b.l;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, com.bytedance.ies.powerpermissions.d.a> f34440a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f34441b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20582);
        if (j.e()) {
            AnonymousClass1.a(new b());
            AnonymousClass1.a(new c("android.permission.ACCESS_MEDIA_LOCATION"));
            AnonymousClass1.a(new c("android.permission.ACCESS_BACKGROUND_LOCATION"));
            AnonymousClass1.a(new d());
            AnonymousClass1.a(new e());
            AnonymousClass1.a(new f());
            AnonymousClass1.a(new g());
            AnonymousClass1.a(new h());
            AnonymousClass1.a(new i());
            AnonymousClass1.a(new j());
            AnonymousClass1.a(new k());
        }
    }

    public static com.bytedance.ies.powerpermissions.d.a a(String str) {
        l.c(str, "");
        return f34440a.get(str);
    }

    public static boolean b(String str) {
        l.c(str, "");
        return f34440a.containsKey(str);
    }
}
