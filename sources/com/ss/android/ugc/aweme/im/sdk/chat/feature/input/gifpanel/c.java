package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import com.airbnb.epoxy.af;
import com.airbnb.epoxy.ah;
import com.airbnb.epoxy.ai;
import com.airbnb.epoxy.aj;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.q;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.b;

public final class c extends b implements v<b.a> {

    /* renamed from: l  reason: collision with root package name */
    private af<c, b.a> f100748l;

    /* renamed from: m  reason: collision with root package name */
    private ah<c, b.a> f100749m;
    private aj<c, b.a> n;
    private ai<c, b.a> o;

    static {
        Covode.recordClassIndex(64459);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.t
    public final /* synthetic */ b.a h() {
        return new b.a();
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
        if (this.f100748l != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i10 = (hashCode + i2) * 31;
        if (this.f100749m != null) {
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
        if (this.f100739h != null) {
            i6 = this.f100739h.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        if (((b) this).f100740i != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        if (((b) this).f100741j != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i16 = (i15 + i8) * 31;
        if (((b) this).f100742k == null) {
            i9 = 0;
        }
        return i16 + i9;
    }

    @Override // com.airbnb.epoxy.s
    public final String toString() {
        return "GifModel_{data=" + this.f100739h + ", context=" + ((b) this).f100740i + ", inputBridge=" + ((b) this).f100741j + ", viewModel=" + ((b) this).f100742k + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.s
    public final /* bridge */ /* synthetic */ s a(int i2) {
        super.a(i2);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.t
    public final /* bridge */ /* synthetic */ void b(b.a aVar) {
        super.b((q) aVar);
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
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f100748l == null) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.f100748l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f100749m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cVar.f100749m == null) {
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
        if (cVar.n == null) {
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
        if (cVar.o == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f100739h == null ? cVar.f100739h != null : !this.f100739h.equals(cVar.f100739h)) {
            return false;
        }
        if (((b) this).f100740i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((b) cVar).f100740i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        if (((b) this).f100741j == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((b) cVar).f100741j == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return false;
        }
        if (((b) this).f100742k == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((b) cVar).f100742k == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return false;
        }
        return true;
    }

    public c(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b bVar, Context context, p pVar, GiphyViewModel giphyViewModel) {
        super(bVar, context, pVar, giphyViewModel);
    }
}
