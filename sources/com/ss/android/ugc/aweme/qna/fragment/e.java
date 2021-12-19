package com.ss.android.ugc.aweme.qna.fragment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.vm.b;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f119417a;

    /* renamed from: b  reason: collision with root package name */
    public final c f119418b;

    static {
        Covode.recordClassIndex(77551);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f119417a, eVar.f119417a) && l.a(this.f119418b, eVar.f119418b);
    }

    public final int hashCode() {
        b bVar = this.f119417a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        c cVar = this.f119418b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BottomSheetActionPayload(navigateDialogUiModel=" + this.f119417a + ", bottomSheetActionEnum=" + this.f119418b + ")";
    }

    public e(b bVar, c cVar) {
        l.d(bVar, "");
        l.d(cVar, "");
        this.f119417a = bVar;
        this.f119418b = cVar;
    }
}
