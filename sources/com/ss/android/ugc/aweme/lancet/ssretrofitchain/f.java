package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.g;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.Callable;

public final class f extends c {
    static {
        Covode.recordClassIndex(68615);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f107265a;

        static {
            Covode.recordClassIndex(68616);
        }

        a(g gVar) {
            this.f107265a = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity == null) {
                return null;
            }
            new b(topActivity).a(R.style.o1).a(this.f107265a.f107266a.f107269b).b();
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u<?> uVar) {
        g.a aVar;
        g.a aVar2;
        String str;
        if (!(gVar == null || (aVar = gVar.f107266a) == null || aVar.f107268a != 3003001 || (aVar2 = gVar.f107266a) == null || (str = aVar2.f107269b) == null || str.length() <= 0)) {
            i.b(new a(gVar), i.f4826c);
        }
        c.a aVar3 = b.f107258a;
        l.b(aVar3, "");
        return aVar3;
    }
}
