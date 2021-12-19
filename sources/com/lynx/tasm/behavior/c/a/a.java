package com.lynx.tasm.behavior.c.a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.c.b;
import com.lynx.tasm.behavior.c.c;
import com.lynx.tasm.behavior.c.d;
import com.lynx.tasm.behavior.c.e;
import com.lynx.tasm.behavior.c.g;
import com.lynx.tasm.behavior.c.i;
import com.lynx.tasm.behavior.c.j;
import com.lynx.tasm.behavior.c.k;
import com.lynx.tasm.behavior.c.n;
import com.lynx.tasm.behavior.c.o;
import com.lynx.tasm.behavior.c.p;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.utils.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f55821c = new HashSet(Arrays.asList("x-overlay", "x-input", "input", "page"));

    /* renamed from: a  reason: collision with root package name */
    protected final q f55822a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55823b;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55824d;

    /* renamed from: e  reason: collision with root package name */
    private final List<k> f55825e = new ArrayList();

    public void b() {
    }

    public final void a(int i2, boolean z, ReadableMap readableMap) {
        a(new o(i2, z, readableMap));
    }

    public final void a(ReadableMap readableMap) {
        a(new j(readableMap));
    }

    public final void a(long j2) {
        a(new d(j2));
    }

    /* access modifiers changed from: protected */
    public void a(k kVar) {
        m.b();
        this.f55825e.add(kVar);
    }

    static {
        Covode.recordClassIndex(34903);
    }

    public void a() {
        m.b();
        if (!this.f55823b) {
            TraceEvent.a(0, "UIOperationQueue.flush");
            ArrayList<k> arrayList = new ArrayList(this.f55825e);
            this.f55825e.clear();
            for (k kVar : arrayList) {
                kVar.b(this.f55822a);
            }
            TraceEvent.b(0, "UIOperationQueue.flush");
        }
    }

    public final void a(int i2) {
        a(new com.lynx.tasm.behavior.c.q(i2));
    }

    public final void b(int i2) {
        a(new g(i2));
    }

    public final void b(long j2) {
        a(new c(j2));
    }

    public a(q qVar, boolean z) {
        this.f55822a = qVar;
        this.f55824d = z;
    }

    public final void a(int i2, int i3) {
        a(new i(i2, i3));
    }

    public final void b(int i2, int i3) {
        a(new b(i2, i3));
    }

    public final void a(int i2, Object obj) {
        a(new p(i2, obj));
    }

    public final void a(int i2, boolean z) {
        a(new com.lynx.tasm.behavior.c.m(i2, z));
    }

    public final void a(int i2, int i3, int i4) {
        a(new e(i2, i3, i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0.o == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final int r19, final java.lang.String r20, final com.lynx.tasm.behavior.v r21, final java.util.Map<java.lang.String, com.lynx.tasm.c.a> r22, final boolean r23) {
        /*
            r18 = this;
            r3 = r18
            r3 = r3
            boolean r0 = r3.f55824d
            r9 = r22
            r10 = r23
            r4 = r19
            r6 = r20
            r8 = r21
            if (r0 != 0) goto L_0x0032
            com.lynx.tasm.behavior.q r2 = r3.f55822a
            com.lynx.tasm.TemplateAssembler r1 = r2.f55939i
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0018:
            com.lynx.tasm.behavior.c.a r11 = new com.lynx.tasm.behavior.c.a
            r12 = r4
            r13 = r6
            r14 = r8
            r15 = r9
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r3.a(r11)
            return
        L_0x0027:
            com.lynx.tasm.TemplateAssembler r0 = r2.f55939i
            com.lynx.tasm.q r0 = r0.f55580j
            if (r0 != 0) goto L_0x002e
            goto L_0x0018
        L_0x002e:
            boolean r0 = r0.o
            if (r0 == 0) goto L_0x0018
        L_0x0032:
            java.util.Set<java.lang.String> r0 = com.lynx.tasm.behavior.c.a.a.f55821c
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x003b
            goto L_0x0018
        L_0x003b:
            com.lynx.tasm.behavior.q r12 = r3.f55822a
            java.util.concurrent.ExecutorService r0 = com.lynx.tasm.core.a.b()
            com.lynx.tasm.behavior.q$1 r11 = new com.lynx.tasm.behavior.q$1
            r13 = r6
            r14 = r4
            r15 = r9
            r16 = r10
            r17 = r8
            r11.<init>(r13, r14, r15, r16, r17)
            java.util.concurrent.Future r5 = r0.submit(r11)
            com.lynx.tasm.behavior.c.a.a$1 r2 = new com.lynx.tasm.behavior.c.a.a$1
            r3 = r3
            r7 = r4
            r2.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.c.a.a.a(int, java.lang.String, com.lynx.tasm.behavior.v, java.util.Map, boolean):void");
    }

    public final void a(int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float[] fArr, float[] fArr2, float f18) {
        Rect rect;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = (int) f4;
        int i6 = (int) f5;
        int i7 = (int) f6;
        int i8 = (int) f7;
        int i9 = (int) f8;
        int i10 = (int) f9;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        int i14 = (int) f13;
        int i15 = (int) f14;
        int i16 = (int) f15;
        int i17 = (int) f16;
        int i18 = (int) f17;
        if (fArr != null) {
            rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        } else {
            rect = null;
        }
        a(new n(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, rect, fArr2, f18));
    }
}
