package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

final class fg implements Comparator<fe> {
    static {
        Covode.recordClassIndex(31784);
    }

    fg() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(fe feVar, fe feVar2) {
        fe feVar3 = feVar;
        fe feVar4 = feVar2;
        fj fjVar = (fj) feVar3.iterator();
        fj fjVar2 = (fj) feVar4.iterator();
        while (fjVar.hasNext() && fjVar2.hasNext()) {
            int compare = Integer.compare(fjVar.a() & 255, fjVar2.a() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(feVar3.zza(), feVar4.zza());
    }
}
