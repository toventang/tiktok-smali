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
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.h;

public class i extends h implements v<h.a> {

    /* renamed from: i  reason: collision with root package name */
    private af<i, h.a> f101711i;

    /* renamed from: j  reason: collision with root package name */
    private ah<i, h.a> f101712j;

    /* renamed from: k  reason: collision with root package name */
    private aj<i, h.a> f101713k;

    /* renamed from: l  reason: collision with root package name */
    private ai<i, h.a> f101714l;

    static {
        Covode.recordClassIndex(65034);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ h.a h() {
        return new h.a();
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "HeaderModel_{title=" + this.f101708h + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        int i5 = 1;
        int i6 = 0;
        if (this.f101711i != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 31;
        if (this.f101712j != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f101713k != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f101714l == null) {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        if (this.f101708h != null) {
            i6 = this.f101708h.hashCode();
        }
        return i10 + i6;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final i b(long j2) {
        super.a(j2);
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
    public final /* bridge */ /* synthetic */ void b(h.a aVar) {
        super.b((q) aVar);
    }

    public final i a(String str) {
        e();
        this.f101708h = str;
        return this;
    }

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    @Override // com.airbnb.epoxy.s
    public final void a(n nVar) {
        super.a(nVar);
        b(nVar);
    }

    @Override // com.airbnb.epoxy.s
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f101711i == null) {
            z = true;
        } else {
            z = false;
        }
        if (iVar.f101711i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101712j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (iVar.f101712j == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101713k == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (iVar.f101713k == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f101714l == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (iVar.f101714l == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101708h == null ? iVar.f101708h == null : this.f101708h.equals(iVar.f101708h)) {
            return true;
        }
        return false;
    }
}
