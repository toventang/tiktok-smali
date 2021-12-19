package com.ss.android.ugc.aweme.following.ui.viewmodel;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public List<IMUser> f96657a = new ArrayList();

    static {
        Covode.recordClassIndex(61300);
    }

    public final void a() {
        i.b(new a(this), i.f4824a);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f96658a;

        static {
            Covode.recordClassIndex(61301);
        }

        a(c cVar) {
            this.f96658a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f96658a.f96657a = n.g((Collection) IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers());
            return z.f158842a;
        }
    }
}
