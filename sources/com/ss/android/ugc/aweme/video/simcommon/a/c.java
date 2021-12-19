package com.ss.android.ugc.aweme.video.simcommon.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.f.a.a.a.a.a;
import h.a.n;
import java.util.Iterator;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.bitrateselector.a.c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f143785a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final List<e> f143786b = n.a(e.f143789a);

    private c() {
    }

    static {
        Covode.recordClassIndex(94074);
    }

    @Override // com.ss.android.ugc.aweme.bitrateselector.a.c
    public final a a(String str) {
        Iterator<T> it = f143786b.iterator();
        while (it.hasNext()) {
            it.next();
            e.a();
        }
        Iterator<T> it2 = f143786b.iterator();
        a aVar = null;
        while (true) {
            if (it2.hasNext()) {
                aVar = it2.next().a(str);
                if (aVar != null) {
                    new StringBuilder("getAutoBitrateSet ").append(str).append(' ').append(aVar).append(" first ").append(Double.valueOf(aVar.a())).append(" second ").append(Double.valueOf(aVar.b())).append(" third ").append(Double.valueOf(aVar.c())).append(" fourth ").append(Double.valueOf(aVar.d())).append(" minBitrate ").append(Double.valueOf(aVar.e()));
                    break;
                }
            } else {
                break;
            }
        }
        return aVar;
    }
}
