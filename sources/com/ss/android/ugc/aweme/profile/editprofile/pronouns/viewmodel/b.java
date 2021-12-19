package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<Boolean> f116246a;

    static {
        Covode.recordClassIndex(75036);
    }

    public static b a(a<Boolean> aVar) {
        return new b(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f116246a, ((b) obj).f116246a);
        }
        return true;
    }

    public final int hashCode() {
        a<Boolean> aVar = this.f116246a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProfileEditPronounsSearchAndDisplayState(editTextContentChange=" + this.f116246a + ")";
    }

    public /* synthetic */ b() {
        this(null);
    }

    private b(a<Boolean> aVar) {
        this.f116246a = aVar;
    }
}
