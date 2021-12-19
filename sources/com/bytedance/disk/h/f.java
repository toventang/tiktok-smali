package com.bytedance.disk.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.c;
import com.bytedance.disk.parcel.MigrationItem;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f28623a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private c f28624b;

    static {
        Covode.recordClassIndex(16823);
    }

    private void a() {
        c cVar = this.f28624b;
        if (cVar != null) {
            cVar.a("monitor", this.f28623a);
        }
    }

    private f a(Map<String, String> map) {
        this.f28623a.putAll(map);
        return this;
    }

    private f(c cVar) {
        this.f28624b = cVar;
    }

    private f a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f28623a.put(str, str2);
        }
        return this;
    }

    public static void a(c cVar, int i2, MigrationItem migrationItem, Map<String, String> map) {
        f a2 = new f(cVar).a("stage", String.valueOf(i2)).a("data_uri", migrationItem.f28630c.f28639c).a("target_uri", migrationItem.f28630c.f28640d).a("MigrationItem", migrationItem.toString());
        if (map != null) {
            a2.a(map);
        }
        a2.a();
    }
}
