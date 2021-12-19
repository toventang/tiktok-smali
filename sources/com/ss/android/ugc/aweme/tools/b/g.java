package com.ss.android.ugc.aweme.tools.b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.b.a.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Map<f, c> f138757a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f138758b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f138759c = new a();

    static {
        Covode.recordClassIndex(90763);
    }

    private static c a(f fVar) {
        c cVar = f138757a.get(fVar);
        if (cVar == null) {
            return f138759c;
        }
        return cVar;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, a aVar) {
        f[] values = f.values();
        for (f fVar : values) {
            aVar.a(fVar, a(intent, fVar.intentKey));
        }
    }

    public static void a(Intent intent, Intent intent2, e eVar, e eVar2) {
        f[] values = f.values();
        for (f fVar : values) {
            intent2.putExtra(fVar.intentKey, a(fVar).a(a(intent, fVar.intentKey), eVar, eVar2));
        }
    }

    public static void a(Intent intent, b bVar, e eVar, e eVar2) {
        f[] values = f.values();
        for (f fVar : values) {
            intent.putExtra(fVar.intentKey, a(fVar).a(bVar.a(fVar), eVar, eVar2));
        }
    }

    public static void a(b bVar, a aVar, e eVar, e eVar2) {
        f[] values = f.values();
        for (f fVar : values) {
            aVar.a(fVar, a(fVar).a(bVar.a(fVar), eVar, eVar2));
        }
    }
}
