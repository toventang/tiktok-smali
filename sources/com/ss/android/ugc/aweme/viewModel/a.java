package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f144416a;

    /* renamed from: b  reason: collision with root package name */
    public b f144417b;

    static {
        Covode.recordClassIndex(94555);
    }

    public a() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f144416a, aVar.f144416a) && l.a(this.f144417b, aVar.f144417b);
    }

    public final int hashCode() {
        b bVar = this.f144416a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        b bVar2 = this.f144417b;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnboardingStep(onboardingState=" + this.f144416a + ", prevOnboardingState=" + this.f144417b + ")";
    }

    private a(b bVar) {
        l.d(bVar, "");
        this.f144416a = bVar;
        this.f144417b = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i2) {
        this((i2 & 1) != 0 ? b.NOT_INITIALIZED : bVar);
    }
}
