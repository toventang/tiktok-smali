package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.q;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.z;

public final class b extends a implements v<a.C2528a> {

    /* renamed from: k  reason: collision with root package name */
    private af<b, a.C2528a> f101652k;

    /* renamed from: l  reason: collision with root package name */
    private ah<b, a.C2528a> f101653l;

    /* renamed from: m  reason: collision with root package name */
    private aj<b, a.C2528a> f101654m;
    private ai<b, a.C2528a> n;

    static {
        Covode.recordClassIndex(65013);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ a.C2528a h() {
        return new a.C2528a();
    }

    @Override // com.airbnb.epoxy.s
    public final String toString() {
        return "AdminChooseModel_{user=" + this.f101640h + ", selected=" + ((a) this).f101641i + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode = super.hashCode() * 31;
        int i7 = 1;
        if (this.f101652k != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 31;
        if (this.f101653l != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f101654m != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.n != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (this.f101640h != null) {
            i6 = this.f101640h.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (((i11 + i6) * 31) + (((a) this).f101641i ? 1 : 0)) * 31;
        if (((a) this).f101642j == null) {
            i7 = 0;
        }
        return i12 + i7;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final b b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(long j2) {
        super.a(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.v
    public final /* synthetic */ void b(int i2) {
        a("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.v
    public final /* synthetic */ void c(int i2) {
        a("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(a.C2528a aVar) {
        super.b((q) aVar);
    }

    public final b a(IMUser iMUser) {
        e();
        this.f101640h = iMUser;
        return this;
    }

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    public final b a(h.f.a.b<? super IMUser, z> bVar) {
        e();
        ((a) this).f101642j = bVar;
        return this;
    }

    public final b a(boolean z) {
        e();
        ((a) this).f101641i = z;
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final void a(n nVar) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f101652k == null) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f101652k == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101653l == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.f101653l == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101654m == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVar.f101654m == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.n == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (bVar.n == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101640h == null ? bVar.f101640h != null : !this.f101640h.equals(bVar.f101640h)) {
            return false;
        }
        if (((a) this).f101641i != ((a) bVar).f101641i) {
            return false;
        }
        if (((a) this).f101642j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((a) bVar).f101642j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        return true;
    }
}
