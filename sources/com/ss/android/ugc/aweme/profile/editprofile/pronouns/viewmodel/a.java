package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements j {

    /* renamed from: a */
    public final boolean f116243a;

    /* renamed from: b */
    public final String f116244b;

    /* renamed from: c */
    public final com.bytedance.assem.arch.extensions.a<Integer> f116245c;

    static {
        Covode.recordClassIndex(75035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f116243a == aVar.f116243a && l.a(this.f116244b, aVar.f116244b) && l.a(this.f116245c, aVar.f116245c);
    }

    public final int hashCode() {
        boolean z = this.f116243a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f116244b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        com.bytedance.assem.arch.extensions.a<Integer> aVar = this.f116245c;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "ProfileEditPronounsNavBarState(isUpdate=" + this.f116243a + ", newPronouns=" + this.f116244b + ", toastMessageId=" + this.f116245c + ")";
    }

    public /* synthetic */ a() {
        this(false, "", null);
    }

    private a(boolean z, String str, com.bytedance.assem.arch.extensions.a<Integer> aVar) {
        l.d(str, "");
        this.f116243a = z;
        this.f116244b = str;
        this.f116245c = aVar;
    }

    public static /* synthetic */ a a(a aVar, boolean z, String str, com.bytedance.assem.arch.extensions.a aVar2, int i2) {
        if ((i2 & 1) != 0) {
            z = aVar.f116243a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f116244b;
        }
        if ((i2 & 4) != 0) {
            aVar2 = aVar.f116245c;
        }
        l.d(str, "");
        return new a(z, str, aVar2);
    }
}
