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
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.d;
import h.z;

public final class e extends d implements v<d.a> {

    /* renamed from: j  reason: collision with root package name */
    private af<e, d.a> f101671j;

    /* renamed from: k  reason: collision with root package name */
    private ah<e, d.a> f101672k;

    /* renamed from: l  reason: collision with root package name */
    private aj<e, d.a> f101673l;

    /* renamed from: m  reason: collision with root package name */
    private ai<e, d.a> f101674m;

    static {
        Covode.recordClassIndex(65022);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ d.a h() {
        return new d.a();
    }

    @Override // com.airbnb.epoxy.s
    public final String toString() {
        return "GroupMemberModel_{member=" + this.f101659h + "}" + super.toString();
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
        if (this.f101671j != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = (hashCode + i2) * 31;
        if (this.f101672k != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f101673l != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f101674m != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (this.f101659h != null) {
            i6 = this.f101659h.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        if (((d) this).f101660i == null) {
            i7 = 0;
        }
        return i12 + i7;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    public final e b(CharSequence charSequence) {
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
    public final /* bridge */ /* synthetic */ void b(d.a aVar) {
        super.b((q) aVar);
    }

    public final e a(a aVar) {
        e();
        this.f101659h = aVar;
        return this;
    }

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    public final e a(h.f.a.a<z> aVar) {
        e();
        ((d) this).f101660i = aVar;
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
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f101671j == null) {
            z = true;
        } else {
            z = false;
        }
        if (eVar.f101671j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f101672k == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (eVar.f101672k == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f101673l == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (eVar.f101673l == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f101674m == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (eVar.f101674m == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101659h == null ? eVar.f101659h != null : !this.f101659h.equals(eVar.f101659h)) {
            return false;
        }
        if (((d) this).f101660i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((d) eVar).f101660i == null) {
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
