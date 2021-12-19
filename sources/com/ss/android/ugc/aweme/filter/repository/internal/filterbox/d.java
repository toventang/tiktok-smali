package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final q<String> f95606a;

    /* renamed from: b  reason: collision with root package name */
    public final q<String> f95607b;

    /* renamed from: c  reason: collision with root package name */
    public final q<String> f95608c;

    /* renamed from: d  reason: collision with root package name */
    public final q<String> f95609d;

    /* renamed from: e  reason: collision with root package name */
    public final q<String> f95610e;

    /* renamed from: f  reason: collision with root package name */
    public final q<String> f95611f;

    /* renamed from: g  reason: collision with root package name */
    public final q<String> f95612g;

    /* renamed from: h  reason: collision with root package name */
    public final q<String> f95613h;

    static {
        Covode.recordClassIndex(60587);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f95606a, dVar.f95606a) && l.a(this.f95607b, dVar.f95607b) && l.a(this.f95608c, dVar.f95608c) && l.a(this.f95609d, dVar.f95609d) && l.a(this.f95610e, dVar.f95610e) && l.a(this.f95611f, dVar.f95611f) && l.a(this.f95612g, dVar.f95612g) && l.a(this.f95613h, dVar.f95613h);
    }

    public final int hashCode() {
        q<String> qVar = this.f95606a;
        int i2 = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        q<String> qVar2 = this.f95607b;
        int hashCode2 = (hashCode + (qVar2 != null ? qVar2.hashCode() : 0)) * 31;
        q<String> qVar3 = this.f95608c;
        int hashCode3 = (hashCode2 + (qVar3 != null ? qVar3.hashCode() : 0)) * 31;
        q<String> qVar4 = this.f95609d;
        int hashCode4 = (hashCode3 + (qVar4 != null ? qVar4.hashCode() : 0)) * 31;
        q<String> qVar5 = this.f95610e;
        int hashCode5 = (hashCode4 + (qVar5 != null ? qVar5.hashCode() : 0)) * 31;
        q<String> qVar6 = this.f95611f;
        int hashCode6 = (hashCode5 + (qVar6 != null ? qVar6.hashCode() : 0)) * 31;
        q<String> qVar7 = this.f95612g;
        int hashCode7 = (hashCode6 + (qVar7 != null ? qVar7.hashCode() : 0)) * 31;
        q<String> qVar8 = this.f95613h;
        if (qVar8 != null) {
            i2 = qVar8.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "EffectParams(deviceIdProvider=" + this.f95606a + ", appIdProvider=" + this.f95607b + ", regionProvider=" + this.f95608c + ", appVersionProvider=" + this.f95609d + ", panelProvider=" + this.f95610e + ", effectSdkVersionProvider=" + this.f95611f + ", effectChannelProvider=" + this.f95612g + ", effectAccessKeyProvider=" + this.f95613h + ")";
    }

    public d(q<String> qVar, q<String> qVar2, q<String> qVar3, q<String> qVar4, q<String> qVar5, q<String> qVar6, q<String> qVar7, q<String> qVar8) {
        l.d(qVar, "");
        l.d(qVar2, "");
        l.d(qVar3, "");
        l.d(qVar4, "");
        l.d(qVar5, "");
        l.d(qVar6, "");
        l.d(qVar7, "");
        l.d(qVar8, "");
        this.f95606a = qVar;
        this.f95607b = qVar2;
        this.f95608c = qVar3;
        this.f95609d = qVar4;
        this.f95610e = qVar5;
        this.f95611f = qVar6;
        this.f95612g = qVar7;
        this.f95613h = qVar8;
    }
}
