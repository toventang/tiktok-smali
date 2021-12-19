package com.ss.android.ugc.aweme.bi;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import f.a.d.k;
import h.f.b.l;

public final class b implements k<f.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f68691a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(42270);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // f.a.d.k
    public final /* synthetic */ boolean a(f.a aVar) {
        f.a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2.f34639a == null) {
            return false;
        }
        Activity activity = aVar2.f34639a;
        if (activity == null) {
            l.b();
        }
        if (l.a((Object) activity.getClass().getName(), (Object) "com.ss.android.ugc.aweme.main.MainActivity")) {
            return true;
        }
        return false;
    }
}
