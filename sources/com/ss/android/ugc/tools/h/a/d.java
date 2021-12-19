package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d<KEY, RESULT> {

    /* renamed from: a  reason: collision with root package name */
    public final e f149207a;

    /* renamed from: b  reason: collision with root package name */
    public final KEY f149208b;

    /* renamed from: c  reason: collision with root package name */
    public final RESULT f149209c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f149210d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f149211e;

    static {
        Covode.recordClassIndex(98265);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f149207a, dVar.f149207a) && l.a(this.f149208b, dVar.f149208b) && l.a(this.f149209c, dVar.f149209c) && l.a(this.f149210d, dVar.f149210d) && l.a(this.f149211e, dVar.f149211e);
    }

    public final int hashCode() {
        e eVar = this.f149207a;
        int i2 = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        KEY key = this.f149208b;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        RESULT result = this.f149209c;
        int hashCode3 = (hashCode2 + (result != null ? result.hashCode() : 0)) * 31;
        Exception exc = this.f149210d;
        int hashCode4 = (hashCode3 + (exc != null ? exc.hashCode() : 0)) * 31;
        Integer num = this.f149211e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "DownloadEvent(state=" + this.f149207a + ", key=" + ((Object) this.f149208b) + ", result=" + ((Object) this.f149209c) + ", exception=" + this.f149210d + ", progress=" + this.f149211e + ")";
    }

    public /* synthetic */ d(e eVar, Object obj, Object obj2, Exception exc) {
        this(eVar, obj, obj2, exc, null);
    }

    public d(e eVar, KEY key, RESULT result, Exception exc, Integer num) {
        l.d(eVar, "");
        this.f149207a = eVar;
        this.f149208b = key;
        this.f149209c = result;
        this.f149210d = exc;
        this.f149211e = num;
    }
}
