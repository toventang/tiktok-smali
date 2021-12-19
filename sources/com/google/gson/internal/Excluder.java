package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.d;
import com.google.gson.a.e;
import com.google.gson.b;
import com.google.gson.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements w, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static final Excluder f54725a = new Excluder();

    /* renamed from: b  reason: collision with root package name */
    public double f54726b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    public int f54727c = 136;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54728d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f54729e;

    /* renamed from: f  reason: collision with root package name */
    public List<b> f54730f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<b> f54731g = Collections.emptyList();

    static {
        Covode.recordClassIndex(33939);
    }

    /* renamed from: a */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    private boolean a(d dVar) {
        if (dVar == null || dVar.a() <= this.f54726b) {
            return true;
        }
        return false;
    }

    public static boolean c(Class<?> cls) {
        if (!cls.isMemberClass() || d(cls)) {
            return false;
        }
        return true;
    }

    private static boolean d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean a(e eVar) {
        if (eVar == null || eVar.a() > this.f54726b) {
            return true;
        }
        return false;
    }

    public static boolean b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return true;
        }
        return false;
    }

    public final boolean a(Class<?> cls) {
        if (this.f54726b != -1.0d && !a((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return true;
        }
        if ((this.f54728d || !c(cls)) && !b(cls)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == false) goto L_0x0014;
     */
    @Override // com.google.gson.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.v<T> create(final com.google.gson.f r8, final com.google.gson.b.a<T> r9) {
        /*
            r7 = this;
            r6 = r9
            java.lang.Class<? super T> r3 = r6.rawType
            boolean r2 = r7.a(r3)
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L_0x0011
            boolean r0 = r7.a(r3, r0)
            if (r0 == 0) goto L_0x0023
        L_0x0011:
            r4 = 1
            if (r2 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = r7.a(r3, r1)
            if (r0 == 0) goto L_0x0021
        L_0x001a:
            r3 = 1
        L_0x001b:
            if (r4 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0025
            r0 = 0
            return r0
        L_0x0021:
            r3 = 0
            goto L_0x001b
        L_0x0023:
            r4 = 0
            goto L_0x0014
        L_0x0025:
            com.google.gson.internal.Excluder$1 r1 = new com.google.gson.internal.Excluder$1
            r2 = r7
            r5 = r8
            r1.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.create(com.google.gson.f, com.google.gson.b.a):com.google.gson.v");
    }

    public final boolean a(d dVar, e eVar) {
        if (!a(dVar) || !a(eVar)) {
            return false;
        }
        return true;
    }

    public final boolean a(Class<?> cls, boolean z) {
        List<b> list;
        if (z) {
            list = this.f54730f;
        } else {
            list = this.f54731g;
        }
        for (b bVar : list) {
            if (bVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public final Excluder a(b bVar, boolean z, boolean z2) {
        Excluder a2 = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f54730f);
            a2.f54730f = arrayList;
            arrayList.add(bVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f54731g);
            a2.f54731g = arrayList2;
            arrayList2.add(bVar);
        }
        return a2;
    }
}
