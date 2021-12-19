package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f119520a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f119521b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119522c = null;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f119523d;

    static {
        Covode.recordClassIndex(77669);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f119520a == jVar.f119520a && this.f119521b == jVar.f119521b && l.a(this.f119522c, jVar.f119522c) && this.f119523d == jVar.f119523d;
    }

    public final int hashCode() {
        boolean z = this.f119520a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f119521b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str = this.f119522c;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f119523d) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TranslationCellUiModel(isTranslated=" + this.f119520a + ", displayLoadingTranslationSpinner=" + this.f119521b + ", originalLanguage=" + this.f119522c + ", showTranslationButton=" + this.f119523d + ")";
    }

    public j(boolean z, boolean z2, boolean z3) {
        this.f119520a = z;
        this.f119521b = z2;
        this.f119523d = z3;
    }
}
