package com.ss.android.ugc.aweme.search.h;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.search.h.a;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class c implements u<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final e f121145a;

    static {
        Covode.recordClassIndex(78915);
    }

    public c(e eVar) {
        l.d(eVar, "");
        this.f121145a = eVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Integer num) {
        a aVar;
        Integer num2 = num;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                e eVar = this.f121145a;
                l.d(eVar, "");
                a aVar2 = b.f121143a;
                if (aVar2 == null) {
                    HandlerThread handlerThread = new HandlerThread("feed-search-icon");
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    l.b(looper, "");
                    aVar2 = new a(looper);
                    b.f121143a = aVar2;
                }
                l.d(eVar, "");
                if (!aVar2.hasMessages(1)) {
                    aVar2.f121136a = new WeakReference<>(eVar);
                    aVar2.f121137b = f.h().d(new a.b(aVar2));
                    aVar2.a(aVar2.a());
                }
            } else if (num2.intValue() == 2 && (aVar = b.f121143a) != null) {
                aVar.b();
            }
        }
    }
}
