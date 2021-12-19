package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.api.a.b;
import com.ss.android.ugc.aweme.model.q;
import h.f.b.l;
import java.util.HashMap;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static q f110811a;

    /* renamed from: b  reason: collision with root package name */
    public static c f110812b;

    /* renamed from: c  reason: collision with root package name */
    public static c f110813c;

    /* renamed from: d  reason: collision with root package name */
    public static c f110814d;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, d> f110815e;

    /* renamed from: f  reason: collision with root package name */
    public static b f110816f;

    /* renamed from: g  reason: collision with root package name */
    public static final r f110817g = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(71105);
    }

    public static void a() {
        f110811a = null;
        f110813c = null;
        f110812b = null;
        f110814d = null;
        f110816f = null;
    }

    public static void a(b bVar) {
        l.d(bVar, "");
        HashMap<String, d> hashMap = f110815e;
        if (hashMap == null) {
            f110816f = bVar;
        } else {
            a(q.a.a(bVar, hashMap));
        }
    }

    public static void a(q qVar) {
        l.d(qVar, "");
        a();
        f110811a = qVar;
    }
}
