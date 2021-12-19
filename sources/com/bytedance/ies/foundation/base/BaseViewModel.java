package com.bytedance.ies.foundation.base;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.List;

public class BaseViewModel extends ac {
    private final h configuration$delegate = i.a((h.f.a.a) a.f33884a);
    public volatile boolean initialized;
    private final h subscribeStore$delegate = i.a((h.f.a.a) b.f33885a);

    static {
        Covode.recordClassIndex(20122);
    }

    public final b getConfiguration() {
        return (b) this.configuration$delegate.getValue();
    }

    public final d getSubscribeStore() {
        return (d) this.subscribeStore$delegate.getValue();
    }

    public List<c> initProcessors() {
        return z.INSTANCE;
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33884a = new a();

        static {
            Covode.recordClassIndex(20123);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33885a = new b();

        static {
            Covode.recordClassIndex(20124);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    public final List<c> getProcessors() {
        return getConfiguration().a();
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        b configuration = getConfiguration();
        configuration.b().clear();
        configuration.a().clear();
    }

    public void init() {
        if (!this.initialized) {
            List<c> initProcessors = initProcessors();
            getConfiguration().a().addAll(initProcessors);
            Iterator<T> it = initProcessors.iterator();
            while (it.hasNext()) {
                b configuration = getConfiguration();
                l.d(configuration, "");
                it.next().f33893c = configuration;
            }
            this.initialized = true;
        }
    }

    public final void config(h.f.a.a<? extends a> aVar) {
        l.d(aVar, "");
        getConfiguration().a((a) aVar.invoke());
    }
}
