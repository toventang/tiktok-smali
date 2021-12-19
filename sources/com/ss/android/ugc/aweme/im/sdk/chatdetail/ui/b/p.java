package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.q;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.o;

public class p extends o implements v<o.a> {

    /* renamed from: j  reason: collision with root package name */
    private af<p, o.a> f101752j;

    /* renamed from: k  reason: collision with root package name */
    private ah<p, o.a> f101753k;

    /* renamed from: l  reason: collision with root package name */
    private aj<p, o.a> f101754l;

    /* renamed from: m  reason: collision with root package name */
    private ai<p, o.a> f101755m;

    static {
        Covode.recordClassIndex(65048);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ o.a h() {
        return new o.a();
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "SeeMoreModel_{moreTitle=" + this.f101748h + ", onClickListener=" + ((o) this).f101749i + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode = super.hashCode() * 31;
        int i7 = 1;
        if (this.f101752j != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 31;
        if (this.f101753k != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f101754l != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f101755m != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (this.f101748h != null) {
            i6 = this.f101748h.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        if (((o) this).f101749i == null) {
            i7 = 0;
        }
        return i12 + i7;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final p b(long j2) {
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
    public final /* bridge */ /* synthetic */ void b(o.a aVar) {
        super.b((q) aVar);
    }

    public final p a(View.OnClickListener onClickListener) {
        e();
        ((o) this).f101749i = onClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    public final p a(String str) {
        e();
        this.f101748h = str;
        return this;
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
        boolean z9;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p) || !super.equals(obj)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f101752j == null) {
            z = true;
        } else {
            z = false;
        }
        if (pVar.f101752j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101753k == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (pVar.f101753k == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101754l == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (pVar.f101754l == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f101755m == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (pVar.f101755m == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101748h == null ? pVar.f101748h != null : !this.f101748h.equals(pVar.f101748h)) {
            return false;
        }
        if (((o) this).f101749i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((o) pVar).f101749i == null) {
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
