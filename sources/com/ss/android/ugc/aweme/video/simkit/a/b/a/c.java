package com.ss.android.ugc.aweme.video.simkit.a.b.a;

import android.content.Context;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f143826a;

    static {
        Covode.recordClassIndex(94120);
    }

    c(b bVar) {
        this.f143826a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b bVar = this.f143826a;
        Context a2 = d.a();
        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107224c = l.d(a2);
        }
        bVar.f143824a = j.f107224c;
        return null;
    }
}
