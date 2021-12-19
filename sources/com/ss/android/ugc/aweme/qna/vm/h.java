package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<com.ss.android.ugc.aweme.qna.fragment.a> f119680a;

    static {
        Covode.recordClassIndex(77742);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f119680a, ((h) obj).f119680a);
        }
        return true;
    }

    public final int hashCode() {
        a<com.ss.android.ugc.aweme.qna.fragment.a> aVar = this.f119680a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QnaSelectedPageState(event=" + this.f119680a + ")";
    }

    public /* synthetic */ h() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.qna.fragment.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(a<? extends com.ss.android.ugc.aweme.qna.fragment.a> aVar) {
        this.f119680a = aVar;
    }
}
