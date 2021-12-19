package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "region_autofill_hint_message")

    /* renamed from: a  reason: collision with root package name */
    public final String f84329a;
    @com.google.gson.a.c(a = "option")

    /* renamed from: b  reason: collision with root package name */
    public final d f84330b;

    static {
        Covode.recordClassIndex(52579);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f84329a, cVar.f84329a) && l.a(this.f84330b, cVar.f84330b);
    }

    public final int hashCode() {
        String str = this.f84329a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        d dVar = this.f84330b;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CandDetailPlaceResponse(regionAutofillHintMessage=" + this.f84329a + ", candDetailPlaceOption=" + this.f84330b + ")";
    }
}
