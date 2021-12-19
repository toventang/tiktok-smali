package com.ss.android.ugc.aweme.discover.ui.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Word f82754a;

    /* renamed from: b  reason: collision with root package name */
    public final int f82755b;

    /* renamed from: c  reason: collision with root package name */
    public final al.a f82756c;

    static {
        Covode.recordClassIndex(51544);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f82754a, bVar.f82754a) && this.f82755b == bVar.f82755b && l.a(this.f82756c, bVar.f82756c);
    }

    public final int hashCode() {
        Word word = this.f82754a;
        int i2 = 0;
        int hashCode = (((word != null ? word.hashCode() : 0) * 31) + this.f82755b) * 31;
        al.a aVar = this.f82756c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DiscoverySuggestSearchSingleLineItem(sugWord=" + this.f82754a + ", layoutStyle=" + this.f82755b + ", handler=" + this.f82756c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public b(Word word, int i2, al.a aVar) {
        l.d(word, "");
        l.d(aVar, "");
        this.f82754a = word;
        this.f82755b = i2;
        this.f82756c = aVar;
    }
}
