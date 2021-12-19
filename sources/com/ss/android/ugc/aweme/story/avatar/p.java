package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<String> f136841a;

    static {
        Covode.recordClassIndex(89427);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && l.a(this.f136841a, ((p) obj).f136841a);
        }
        return true;
    }

    public final int hashCode() {
        a<String> aVar = this.f136841a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryAvatarState(refreshEvent=" + this.f136841a + ")";
    }

    public /* synthetic */ p() {
        this(new a(""));
    }

    public p(a<String> aVar) {
        l.d(aVar, "");
        this.f136841a = aVar;
    }
}
