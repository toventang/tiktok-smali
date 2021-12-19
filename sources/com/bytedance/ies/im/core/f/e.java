package com.bytedance.ies.im.core.f;

import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.a;
import com.bytedance.ies.im.core.e.m;
import com.bytedance.im.core.c.b;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f34144a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20334);
    }

    @Override // com.bytedance.im.core.c.b
    public final void a(JSONObject jSONObject) {
        a.b().a(jSONObject);
    }

    @Override // com.bytedance.im.core.c.b
    public final void a(Object obj) {
        if (((Boolean) com.bytedance.ies.im.core.c.e.f34031b.getValue()).booleanValue()) {
            try {
                String b2 = dg.a().b(obj);
                while (true) {
                    if (b2 == null) {
                        l.b();
                    }
                    if (b2.length() > 2000) {
                        com.bytedance.ies.im.core.api.d.b b3 = a.b();
                        String substring = b2.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                        l.b(substring, "");
                        b3.b("imsdk2", substring);
                        b2 = b2.substring(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                        l.b(b2, "");
                    } else {
                        a.b().b("imsdk2", b2);
                        return;
                    }
                }
            } catch (Exception e2) {
                a.b().a(e2);
            }
        }
    }

    @Override // com.bytedance.im.core.c.b
    public final void a(Throwable th) {
        String str;
        if ((th instanceof SQLiteDatabaseLockedException) || (th instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException) || (th instanceof SQLiteTableLockedException) || (th instanceof com.tencent.wcdb.database.SQLiteTableLockedException)) {
            a.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (a.a().l()) {
                str = "1";
            } else {
                str = "0";
            }
            linkedHashMap.put("is_main_proc", str);
            a.b().a("im_db_lock", linkedHashMap);
        }
        a.a();
        if (a.a().g()) {
            a.b();
        }
    }

    @Override // com.bytedance.im.core.c.b
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        a.b().a(str, jSONObject, (JSONObject) null);
    }

    @Override // com.bytedance.im.core.c.b
    public final void b(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            m.a(str, jSONObject);
            a.b().b(str, jSONObject);
        }
    }

    @Override // com.bytedance.im.core.c.b
    public final void c(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            a.b().c(str, jSONObject);
        }
    }

    @Override // com.bytedance.im.core.c.b
    public final void d(String str, JSONObject jSONObject) {
        if (str != null && str.length() != 0) {
            a.b().a(str, jSONObject);
        }
    }

    @Override // com.bytedance.im.core.c.b
    public final void a(String str, String str2, Map<String, Object> map) {
        l.d(str, "");
        com.bytedance.ies.im.core.api.d.b b2 = a.b();
        if (str2 == null) {
            str2 = "";
        }
        b2.a(str, str2, map);
    }
}
