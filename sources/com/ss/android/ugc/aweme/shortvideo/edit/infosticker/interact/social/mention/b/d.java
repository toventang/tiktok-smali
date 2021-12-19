package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.IAvSearchUserService;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.model.h;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class d extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a<h> {

    /* renamed from: i  reason: collision with root package name */
    private static final a f127754i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f127755a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f127756b = i.a((h.f.a.a) b.f127758a);

    /* renamed from: h  reason: collision with root package name */
    private g f127757h;

    static {
        Covode.recordClassIndex(83732);
    }

    static final class a {
        static {
            Covode.recordClassIndex(83733);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<IAvSearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127758a = new b();

        static {
            Covode.recordClassIndex(83734);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAvSearchUserService invoke() {
            return AvSearchUserServiceImpl.a();
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f127760b;

        static {
            Covode.recordClassIndex(83735);
        }

        c(d dVar, g gVar) {
            this.f127759a = dVar;
            this.f127760b = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((IAvSearchUserService) this.f127759a.f127756b.getValue()).a(this.f127760b);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a
    public final boolean a(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a
    public final /* synthetic */ void a(h hVar) {
        T t;
        List<? extends e> list;
        List<String> list2;
        T t2 = (T) hVar;
        l.d(t2, "");
        if (this.f127620e == null) {
            this.f127620e = t2;
        } else {
            T t3 = this.f127620e;
            if (t3 != null) {
                t3.f121537b = t2.f121537b;
                t3.f121538c = t2.f121538c;
                t3.f121539d = t2.f121539d;
            }
        }
        g gVar = this.f127757h;
        if (gVar == null || (list2 = gVar.f121535f) == null || !list2.isEmpty()) {
            List<? extends e> list3 = t2.f121536a;
            if (list3 != null) {
                List<? extends e> list4 = null;
                if ((!list3.isEmpty()) && (t = this.f127620e) != null) {
                    T t4 = this.f127620e;
                    if (!(t4 == null || (list = t4.f121536a) == null)) {
                        list4 = n.d((Collection) list, (Iterable) list3);
                    }
                    t.f121536a = list4;
                    return;
                }
                return;
            }
            return;
        }
        T t5 = this.f127620e;
        if (t5 != null) {
            t5.f121536a = t2.f121536a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a
    public final boolean b(Object... objArr) {
        boolean z;
        l.d(objArr, "");
        if (!super.b(Arrays.copyOf(objArr, objArr.length))) {
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
        this.f127755a = z;
        Object a3 = a(objArr, 1);
        if (a3 instanceof g) {
            gVar = a3;
        }
        g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.f127755a) {
            this.f127619d = false;
        }
        this.f127757h = gVar2;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getSchedulerService().schedule(this.f127618c, new c(this, gVar2), 0);
        return true;
    }

    private static <T> Object a(T[] tArr, int i2) {
        if (i2 < tArr.length) {
            return tArr[i2];
        }
        return null;
    }
}
