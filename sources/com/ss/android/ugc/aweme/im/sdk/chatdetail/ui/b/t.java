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
import h.f.a.a;
import h.z;

public class t extends s implements v<View> {

    /* renamed from: i  reason: collision with root package name */
    private af<t, View> f101767i;

    /* renamed from: j  reason: collision with root package name */
    private ah<t, View> f101768j;

    /* renamed from: k  reason: collision with root package name */
    private aj<t, View> f101769k;

    /* renamed from: l  reason: collision with root package name */
    private ai<t, View> f101770l;

    static {
        Covode.recordClassIndex(65054);
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "SimpleStaticModel_{}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        int i6 = 1;
        if (this.f101767i != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 31;
        if (this.f101768j != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f101769k != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f101770l != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        if (this.f101765h == null) {
            i6 = 0;
        }
        return i10 + i6;
    }

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s<View> a(int i2) {
        super.a(i2);
        return this;
    }

    public final t b(long j2) {
        super.a(j2);
        return this;
    }

    public final t d(int i2) {
        super.a(i2);
        return this;
    }

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s<View> a(long j2) {
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

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s<View> a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ void b(View view) {
        super.b(view);
    }

    public final t a(a<z> aVar) {
        e();
        this.f101765h = aVar;
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
        if (!(obj instanceof t) || !super.equals(obj)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f101767i == null) {
            z = true;
        } else {
            z = false;
        }
        if (tVar.f101767i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101768j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tVar.f101768j == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101769k == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (tVar.f101769k == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f101770l == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (tVar.f101770l == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101765h == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (tVar.f101765h == null) {
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
