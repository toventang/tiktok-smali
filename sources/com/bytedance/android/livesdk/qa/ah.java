package com.bytedance.android.livesdk.qa;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class ah {
    @c(a = "questions")

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<af> f20354a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f20355b;

    static {
        Covode.recordClassIndex(12016);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return l.a(this.f20354a, ahVar.f20354a) && this.f20355b == ahVar.f20355b;
    }

    public final int hashCode() {
        ArrayList<af> arrayList = this.f20354a;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        boolean z = this.f20355b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "QuestionList(questionExList=" + this.f20354a + ", hasMore=" + this.f20355b + ")";
    }

    public /* synthetic */ ah() {
        this(new ArrayList());
    }

    private ah(ArrayList<af> arrayList) {
        l.d(arrayList, "");
        this.f20354a = arrayList;
        this.f20355b = false;
    }
}
