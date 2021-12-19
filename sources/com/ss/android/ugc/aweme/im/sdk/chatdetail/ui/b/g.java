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
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.f;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;

public class g extends f implements v<f.b> {

    /* renamed from: m  reason: collision with root package name */
    private af<g, f.b> f101707m;
    private ah<g, f.b> n;
    private aj<g, f.b> o;
    private ai<g, f.b> p;

    static {
        Covode.recordClassIndex(65031);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ f.b h() {
        return new f.b();
    }

    public final g i() {
        super.a(-1L);
        return this;
    }

    @Override // com.airbnb.epoxy.s
    public String toString() {
        return "GroupTitleModel_{viewModel=" + this.f101676h + ", conversationModel=" + ((f) this).f101677i + ", groupChatDetailModel=" + ((f) this).f101678j + "}" + super.toString();
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
        int i8 = 0;
        if (this.f101707m != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 31;
        if (this.n != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        if (this.o != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        if (this.p == null) {
            i7 = 0;
        }
        int i12 = (i11 + i7) * 31;
        if (this.f101676h != null) {
            i5 = this.f101676h.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (((f) this).f101677i != null) {
            i6 = ((f) this).f101677i.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        if (((f) this).f101678j != null) {
            i8 = ((f) this).f101678j.hashCode();
        }
        return i14 + i8;
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(f.b bVar) {
        super.b((q) bVar);
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

    @Override // com.airbnb.epoxy.s, com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.b((q) obj);
    }

    public final g a(b bVar) {
        e();
        ((f) this).f101677i = bVar;
        return this;
    }

    public final g a(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
        e();
        ((f) this).f101678j = bVar;
        return this;
    }

    public final g a(GroupChatDetailViewModel groupChatDetailViewModel) {
        e();
        this.f101676h = groupChatDetailViewModel;
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f101707m == null) {
            z = true;
        } else {
            z = false;
        }
        if (gVar.f101707m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.n == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar.n == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.o == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (gVar.o == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.p == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (gVar.p == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f101676h == null ? gVar.f101676h != null : !this.f101676h.equals(gVar.f101676h)) {
            return false;
        }
        if (((f) this).f101677i == null ? ((f) gVar).f101677i != null : !((f) this).f101677i.equals(((f) gVar).f101677i)) {
            return false;
        }
        if (((f) this).f101678j == null ? ((f) gVar).f101678j == null : ((f) this).f101678j.equals(((f) gVar).f101678j)) {
            return true;
        }
        return false;
    }
}
