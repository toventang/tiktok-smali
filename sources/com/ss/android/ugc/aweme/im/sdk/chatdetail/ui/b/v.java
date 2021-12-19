package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.q;
import com.airbnb.epoxy.s;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.u;

public class v extends u implements com.airbnb.epoxy.v<u.b> {

    /* renamed from: l  reason: collision with root package name */
    private af<v, u.b> f101778l;

    /* renamed from: m  reason: collision with root package name */
    private ah<v, u.b> f101779m;
    private aj<v, u.b> n;
    private ai<v, u.b> o;

    static {
        Covode.recordClassIndex(65058);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ u.b h() {
        return new u.b();
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "SwitchModel_{titleId=" + this.f101772h + ", open=" + ((u) this).f101773i + ", onClickListener=" + ((u) this).f101774j + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        int i6 = 1;
        if (this.f101778l != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 31;
        if (this.f101779m != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.n != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.o != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i10 = (((((i9 + i5) * 31) + this.f101772h) * 31) + (((u) this).f101773i ? 1 : 0)) * 31;
        if (((u) this).f101774j == null) {
            i6 = 0;
        }
        return i10 + i6;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final v b(long j2) {
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

    public final v d(int i2) {
        e();
        this.f101772h = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(u.b bVar) {
        super.b((q) bVar);
    }

    public final v a(View.OnClickListener onClickListener) {
        e();
        ((u) this).f101774j = onClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    public final v a(boolean z) {
        e();
        ((u) this).f101773i = z;
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
        if (!(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f101778l == null) {
            z = true;
        } else {
            z = false;
        }
        if (vVar.f101778l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101779m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (vVar.f101779m == null) {
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
        if (vVar.n == null) {
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
        if (vVar.o == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8 || this.f101772h != vVar.f101772h || ((u) this).f101773i != ((u) vVar).f101773i) {
            return false;
        }
        if (((u) this).f101774j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((u) vVar).f101774j == null) {
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
