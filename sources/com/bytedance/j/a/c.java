package com.bytedance.j.a;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.component.a;
import com.lynx.tasm.l;
import com.lynx.tasm.n;
import com.lynx.tasm.o;
import h.f.a.b;
import h.z;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public l f38960a;

    /* renamed from: b  reason: collision with root package name */
    public String f38961b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f38962c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f38963d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f38964e;

    /* renamed from: f  reason: collision with root package name */
    public Float f38965f;

    /* renamed from: g  reason: collision with root package name */
    public a f38966g;

    /* renamed from: h  reason: collision with root package name */
    public f f38967h;

    /* renamed from: i  reason: collision with root package name */
    public TemplateData f38968i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f38969j;

    /* renamed from: k  reason: collision with root package name */
    public b<? super n, z> f38970k;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, Object> f38971l;

    /* renamed from: m  reason: collision with root package name */
    public List<o> f38972m;
    public Map<String, com.bytedance.j.a.e.b> n;
    public List<com.lynx.tasm.behavior.a> o;
    public com.bytedance.j.a.e.a p;
    public b q;
    public String r;

    static {
        Covode.recordClassIndex(23861);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.f.b.l.a(this.n, cVar.n) && h.f.b.l.a(this.o, cVar.o) && h.f.b.l.a(this.p, cVar.p) && h.f.b.l.a(this.q, cVar.q) && h.f.b.l.a(this.r, cVar.r);
    }

    public final int hashCode() {
        Map<String, com.bytedance.j.a.e.b> map = this.n;
        int i2 = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<com.lynx.tasm.behavior.a> list = this.o;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        com.bytedance.j.a.e.a aVar = this.p;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.q;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.r;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "LynxKitInitParams(lynxModules=" + this.n + ", lynxBehaviors=" + this.o + ", initData=" + this.p + ", asyncLayoutParam=" + this.q + ", preloadFonts=" + this.r + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x010a, code lost:
        if (com.bytedance.j.a.g.a.f39052a == 1) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x011d, code lost:
        if (r0 != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c() {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.j.a.c.<init>():void");
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f38971l.putAll(map);
        }
    }

    public final void a(o oVar) {
        h.f.b.l.c(oVar, "");
        this.f38972m.add(oVar);
    }

    public final void a(String str, boolean z, boolean z2, String[] strArr) {
        l a2;
        h.f.b.l.c(str, "");
        this.f38961b = str;
        if (z) {
            a2 = com.bytedance.j.a.c.c.a(str, strArr, z2);
        } else {
            a2 = l.a(str, strArr, z2);
        }
        this.f38960a = a2;
    }
}
