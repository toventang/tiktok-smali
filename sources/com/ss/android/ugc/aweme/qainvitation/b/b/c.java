package com.ss.android.ugc.aweme.qainvitation.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.model.h;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class c extends com.ss.android.ugc.aweme.common.b<h> {

    /* renamed from: d  reason: collision with root package name */
    private static final a f119049d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f119050a;

    /* renamed from: b  reason: collision with root package name */
    g f119051b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f119052c = i.a((h.f.a.a) b.f119055a);

    static {
        Covode.recordClassIndex(77336);
    }

    static final class a {
        static {
            Covode.recordClassIndex(77337);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f119055a = new b();

        static {
            Covode.recordClassIndex(77338);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.c$c  reason: collision with other inner class name */
    static final class CallableC3067c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f119060b;

        static {
            Covode.recordClassIndex(77339);
        }

        CallableC3067c(c cVar, g gVar) {
            this.f119059a = cVar;
            this.f119060b = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((ISearchUserService) this.f119059a.f119052c.getValue()).b(this.f119060b);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(h hVar) {
        h hVar2;
        List<? extends e> list;
        List<String> list2;
        h hVar3 = hVar;
        if (hVar3 != null) {
            if (this.mData == null) {
                this.mData = hVar3;
            } else {
                h hVar4 = (h) this.mData;
                hVar4.f121537b = hVar3.f121537b;
                hVar4.f121538c = hVar3.f121538c;
                hVar4.f121539d = hVar3.f121539d;
            }
            g gVar = this.f119051b;
            if (gVar == null || (list2 = gVar.f121535f) == null || !list2.isEmpty()) {
                List<? extends e> list3 = hVar3.f121536a;
                if (list3 != null) {
                    List<? extends e> list4 = null;
                    if ((!list3.isEmpty()) && (hVar2 = (h) this.mData) != null) {
                        h hVar5 = (h) this.mData;
                        if (!(hVar5 == null || (list = hVar5.f121536a) == null)) {
                            list4 = n.d((Collection) list, (Iterable) list3);
                        }
                        hVar2.f121536a = list4;
                        return;
                    }
                    return;
                }
                return;
            }
            h hVar6 = (h) this.mData;
            if (hVar6 != null) {
                hVar6.f121536a = hVar3.f121536a;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        l.d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        Object a2 = a(objArr, 0);
        g gVar = null;
        if (!(a2 instanceof Boolean)) {
            a2 = null;
        }
        Boolean bool = (Boolean) a2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f119050a = z;
        Object a3 = a(objArr, 1);
        if (a3 instanceof g) {
            gVar = a3;
        }
        g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.f119050a) {
            this.mIsLoading = false;
        }
        this.f119051b = gVar2;
        com.bytedance.ies.e.a.a.a().a(this.mHandler, new CallableC3067c(this, gVar2), 0);
        return true;
    }

    private static <T> Object a(T[] tArr, int i2) {
        if (i2 < tArr.length) {
            return tArr[i2];
        }
        return null;
    }
}
