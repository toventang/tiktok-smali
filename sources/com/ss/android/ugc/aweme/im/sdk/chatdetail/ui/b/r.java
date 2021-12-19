package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q;

public class r extends q implements v<q.a> {

    /* renamed from: k  reason: collision with root package name */
    private af<r, q.a> f101762k;

    /* renamed from: l  reason: collision with root package name */
    private ah<r, q.a> f101763l;

    /* renamed from: m  reason: collision with root package name */
    private aj<r, q.a> f101764m;
    private ai<r, q.a> n;

    static {
        Covode.recordClassIndex(65051);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ q.a h() {
        return new q.a();
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "SensitiveModel_{titleId=" + this.f101756h + ", subTitleId=" + ((q) this).f101757i + ", onClickListener=" + ((q) this).f101758j + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        int i6 = 1;
        if (this.f101762k != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 31;
        if (this.f101763l != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f101764m != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.n != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i10 = (((((i9 + i5) * 31) + this.f101756h) * 31) + ((q) this).f101757i) * 31;
        if (((q) this).f101758j == null) {
            i6 = 0;
        }
        return i10 + i6;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final r b(long j2) {
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

    public final r d(int i2) {
        e();
        this.f101756h = i2;
        return this;
    }

    public final r e(int i2) {
        e();
        ((q) this).f101757i = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q, com.airbnb.epoxy.t
    public final /* synthetic */ void b(q.a aVar) {
        super.b(aVar);
    }

    public final r a(View.OnClickListener onClickListener) {
        e();
        ((q) this).f101758j = onClickListener;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q, com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* synthetic */ void b(Object obj) {
        super.b((q.a) obj);
    }

    @Override // com.airbnb.epoxy.s
    public final void a(n nVar) {
        super.a(nVar);
        b(nVar);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.q
    public final void a(q.a aVar) {
        super.b(aVar);
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
        if (!(obj instanceof r) || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f101762k == null) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.f101762k == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101763l == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.f101763l == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101764m == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (rVar.f101764m == null) {
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
        if (rVar.n == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8 || this.f101756h != rVar.f101756h || ((q) this).f101757i != ((q) rVar).f101757i) {
            return false;
        }
        if (((q) this).f101758j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((q) rVar).f101758j == null) {
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
