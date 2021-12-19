package com.ss.android.ugc.aweme.sticker.types.lock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f136130a;

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f136131c;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f136132b;

    /* renamed from: d  reason: collision with root package name */
    private f f136133d = g.a().G();

    static {
        Covode.recordClassIndex(88919);
    }

    private c() {
    }

    public final List<String> b() {
        if (this.f136132b == null) {
            this.f136132b = c();
        }
        return this.f136132b;
    }

    public static c a() {
        MethodCollector.i(9224);
        if (f136130a == null) {
            synchronized (c.class) {
                try {
                    f136131c = d.a(i.f115645a, "commerce_sticker_unlock", 0);
                    f136130a = new c();
                } catch (Throwable th) {
                    MethodCollector.o(9224);
                    throw th;
                }
            }
        }
        c cVar = f136130a;
        MethodCollector.o(9224);
        return cVar;
    }

    private List<String> c() {
        List list;
        ArrayList arrayList = new ArrayList();
        try {
            String string = f136131c.getString("sticker_id_info", null);
            if (!TextUtils.isEmpty(string) && (list = (List) this.f136133d.a(string, new a<List<String>>() {
                /* class com.ss.android.ugc.aweme.sticker.types.lock.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88920);
                }
            }.type)) != null) {
                arrayList.addAll(list);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public final void a(Effect effect) {
        if (com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect)) {
            String effectId = effect.getEffectId();
            if (!b().contains(effectId)) {
                b().add(effectId);
                f136131c.edit().putString("sticker_id_info", this.f136133d.b(b())).apply();
            }
        }
    }
}
