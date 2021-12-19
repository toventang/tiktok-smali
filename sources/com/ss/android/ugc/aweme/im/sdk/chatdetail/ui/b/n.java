package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.s;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.a.b;
import h.z;

public final class n extends l implements Object {

    /* renamed from: l  reason: collision with root package name */
    private af<n, l.a> f101746l;

    /* renamed from: m  reason: collision with root package name */
    private ah<n, l.a> f101747m;
    private aj<n, l.a> n;
    private ai<n, l.a> o;

    static {
        Covode.recordClassIndex(65045);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ l.a h() {
        return new l.a();
    }

    @Override // com.airbnb.epoxy.s
    public final String toString() {
        return "RequestModel_{request=" + this.f101723h + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int hashCode = super.hashCode() * 31;
        int i9 = 1;
        if (this.f101746l != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 31;
        if (this.f101747m != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        if (this.n != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        if (this.o != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (this.f101723h != null) {
            i6 = this.f101723h.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        if (((l) this).f101724i != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        if (((l) this).f101725j != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i16 = (i15 + i8) * 31;
        if (((l) this).f101726k == null) {
            i9 = 0;
        }
        return i16 + i9;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final n b(long j2) {
        super.a(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(long j2) {
        super.a(j2);
        return this;
    }

    public final n b(b<? super IMUser, z> bVar) {
        e();
        ((l) this).f101725j = bVar;
        return this;
    }

    public final /* synthetic */ void c(int i2) {
        a("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    public final /* synthetic */ void b(int i2) {
        a("The model was changed between being added to the controller and being bound.", i2);
    }

    public final n a(a aVar) {
        e();
        this.f101723h = aVar;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l, com.airbnb.epoxy.t
    public final /* synthetic */ void b(l.a aVar) {
        super.b(aVar);
    }

    public final n a(h.f.a.a<z> aVar) {
        e();
        ((l) this).f101726k = aVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l, com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* synthetic */ void b(Object obj) {
        super.b((l.a) obj);
    }

    public final n a(b<? super Boolean, z> bVar) {
        e();
        ((l) this).f101724i = bVar;
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final void a(com.airbnb.epoxy.n nVar) {
        super.a(nVar);
        b(nVar);
    }

    @Override // com.airbnb.epoxy.s
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f101746l == null) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.f101746l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101747m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nVar.f101747m == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.n == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (nVar.n == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.o == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (nVar.o == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101723h == null ? nVar.f101723h != null : !this.f101723h.equals(nVar.f101723h)) {
            return false;
        }
        if (((l) this).f101724i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((l) nVar).f101724i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        if (((l) this).f101725j == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((l) nVar).f101725j == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return false;
        }
        if (((l) this).f101726k == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((l) nVar).f101726k == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.l
    public final void a(l.a aVar) {
        super.b(aVar);
    }
}
