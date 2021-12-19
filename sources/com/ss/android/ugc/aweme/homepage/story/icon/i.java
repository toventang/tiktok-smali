package com.ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<Boolean> f99436a;

    static {
        Covode.recordClassIndex(63363);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f99436a, ((i) obj).f99436a);
        }
        return true;
    }

    public final int hashCode() {
        a<Boolean> aVar = this.f99436a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryIconState(needStoryIconRefresh=" + this.f99436a + ")";
    }

    public /* synthetic */ i() {
        this(new a(false));
    }

    public i(a<Boolean> aVar) {
        l.d(aVar, "");
        this.f99436a = aVar;
    }
}
