package com.d.a.a.a.h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<View, String> f46438a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final HashMap<View, a> f46439b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final HashMap<String, View> f46440c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    final HashSet<View> f46441d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<String> f46442e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f46443f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    final HashMap<String, String> f46444g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    boolean f46445h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f46446a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f46447b = new ArrayList<>();

        static {
            Covode.recordClassIndex(28351);
        }

        public a(c cVar, String str) {
            this.f46446a = cVar;
            a(str);
        }

        public final void a(String str) {
            this.f46447b.add(str);
        }
    }

    static {
        Covode.recordClassIndex(28350);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap<android.view.View, com.d.a.a.a.h.b$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void a(l lVar) {
        for (c cVar : lVar.f46357b) {
            Object obj = cVar.f46377a.get();
            if (obj != null) {
                a aVar = this.f46439b.get(obj);
                if (aVar != null) {
                    aVar.a(lVar.f46361f);
                } else {
                    this.f46439b.put(obj, new a(cVar, lVar.f46361f));
                }
            }
        }
    }
}
