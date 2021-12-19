package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.t;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class n {

    /* renamed from: c  reason: collision with root package name */
    private static n f102426c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile long f102427d;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f102428a = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "imbase_" + f102427d, 0);

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f102429b = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "iuserstate", 0);

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f102430e = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "imbase_bydid", 0);

    static {
        Covode.recordClassIndex(65571);
    }

    public final int b() {
        return this.f102428a.getInt("notification_tips_show_times", 0);
    }

    public final Set<String> c() {
        return this.f102428a.getStringSet("notification_shown_conversation", new HashSet());
    }

    public final long d() {
        long j2 = this.f102428a.getLong("last_relation_fetch_max_time", 0);
        if (j2 >= 0) {
            return j2;
        }
        return 0;
    }

    public final long e() {
        return this.f102428a.getLong("last_relation_full_fetch_time", 0);
    }

    public final long f() {
        return this.f102428a.getLong("last_relation_cold_up_diff_fetch_time", 0);
    }

    public final long g() {
        return this.f102428a.getLong("last_relation_ws_diff_fetch_time", 0);
    }

    public final long h() {
        return this.f102428a.getLong("last_relation_font_diff_fetch_time", 0);
    }

    public final long i() {
        return this.f102428a.getLong("last_relation_loader_diff_fetch_time", 0);
    }

    public final boolean k() {
        return this.f102428a.getBoolean("key_mt_inner_push_switch_on", true);
    }

    public final int m() {
        return this.f102428a.getInt("chat_user_setting_open_count", 0);
    }

    public final int n() {
        return this.f102428a.getInt("permission_updated_notice_show_count", 0);
    }

    public final a l() {
        try {
            return (a) j.a(this.f102428a.getString("chat_user_setting", ""), a.class);
        } catch (t e2) {
            e2.printStackTrace();
            com.ss.android.ugc.aweme.im.service.m.a.b("IMSPUtils", "No cached chat user settings");
            return null;
        }
    }

    private n() {
        f102427d = c.e();
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            MethodCollector.i(5325);
            long e2 = c.e();
            if (f102426c == null || e2 != f102427d) {
                synchronized (n.class) {
                    try {
                        if (f102426c == null || e2 != f102427d) {
                            f102426c = new n();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(5325);
                        throw th;
                    }
                }
            }
            nVar = f102426c;
            MethodCollector.o(5325);
        }
        return nVar;
    }

    public final List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a> j() {
        ArrayList arrayList = new ArrayList();
        try {
            Set<String> stringSet = this.f102428a.getStringSet("last_relation_fetch_missing_page_list", new HashSet());
            if (!b.a((Collection) stringSet)) {
                for (String str : stringSet) {
                    arrayList.add(j.a(str, com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a.class));
                }
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a(th);
        }
        return arrayList;
    }

    public final void a(long j2) {
        this.f102428a.edit().putLong("last_relation_fetch_max_time", j2).commit();
    }

    public final int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        return this.f102428a.getInt("maf_user_show_count_".concat(String.valueOf(str)), 0);
    }

    public final void a(a aVar) {
        this.f102428a.edit().putString("chat_user_setting", j.a(aVar)).apply();
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a> list) {
        HashSet hashSet = new HashSet();
        try {
            if (!b.a((Collection) list)) {
                for (com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.a aVar : list) {
                    hashSet.add(j.a(aVar));
                }
            }
            this.f102428a.edit().putStringSet("last_relation_fetch_missing_page_list", hashSet).commit();
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a(th);
        }
    }
}
