package com.facebook.internal.b.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.GraphRequest;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ae;
import com.facebook.internal.b.d;
import com.facebook.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static Integer f48571a = 1000;

    /* renamed from: b  reason: collision with root package name */
    static boolean f48572b;

    /* renamed from: c  reason: collision with root package name */
    static final d f48573c = c.a(d.c(), e.b());

    /* renamed from: d  reason: collision with root package name */
    static final Map<String, Integer> f48574d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Random f48575e = new Random();

    /* renamed from: f  reason: collision with root package name */
    private static final a f48576f = a.a();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLong f48577g = new AtomicLong(0);

    private b() {
    }

    static {
        Covode.recordClassIndex(29288);
    }

    static JSONObject a() {
        if (a.a(b.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "monitoring_config");
            ae.a();
            GraphRequest a2 = GraphRequest.a(m.f48915a);
            a2.n = true;
            a2.f46548j = bundle;
            return GraphRequest.a(a2).f49017b;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }
}
