package com.ss.android.ugc.aweme.friends.widget.contact;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends j.e<a> {
    static {
        Covode.recordClassIndex(61827);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean a(a aVar, a aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        return l.a(aVar, aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.j.e
    public final /* synthetic */ boolean b(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        l.d(aVar3, "");
        l.d(aVar4, "");
        if ((aVar3 instanceof e) && (aVar4 instanceof e)) {
            return l.a(((e) aVar3).f97327b, ((e) aVar4).f97327b);
        }
        if (!(aVar3 instanceof h) || !(aVar4 instanceof h)) {
            if (aVar3.f97312a == aVar4.f97312a) {
                return true;
            }
            return false;
        } else if (((h) aVar3).f97346b == ((h) aVar4).f97346b) {
            return true;
        } else {
            return false;
        }
    }
}
