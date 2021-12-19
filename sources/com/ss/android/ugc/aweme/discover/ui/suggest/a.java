package com.ss.android.ugc.aweme.discover.ui.suggest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import h.f.b.l;

public final class a implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final Word f82752a;

    /* renamed from: b  reason: collision with root package name */
    public final al.a f82753b;

    static {
        Covode.recordClassIndex(51543);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f82752a, aVar.f82752a) && l.a(this.f82753b, aVar.f82753b);
    }

    public final int hashCode() {
        Word word = this.f82752a;
        int i2 = 0;
        int hashCode = (word != null ? word.hashCode() : 0) * 31;
        al.a aVar = this.f82753b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DiscoverySuggestSearchBreakLineItem(sugWord=" + this.f82752a + ", handler=" + this.f82753b + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    public a(Word word, al.a aVar) {
        l.d(word, "");
        l.d(aVar, "");
        this.f82752a = word;
        this.f82753b = aVar;
    }
}
