package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public Future<List<c>> f131387a;

    /* renamed from: b  reason: collision with root package name */
    final ExecutorService f131388b = com.ss.android.ugc.aweme.tools.b.f138752a;

    /* renamed from: c  reason: collision with root package name */
    public final e f131389c;

    /* renamed from: d  reason: collision with root package name */
    public final String f131390d;

    static {
        Covode.recordClassIndex(86082);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f131392a;

        static {
            Covode.recordClassIndex(86084);
        }

        b(aj ajVar) {
            this.f131392a = ajVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f131393a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f131394b;

            static {
                Covode.recordClassIndex(86085);
            }

            a(c cVar, b bVar) {
                this.f131393a = cVar;
                this.f131394b = bVar;
            }

            public final void run() {
                g.a().o().l().a(this.f131394b.f131392a.f131389c, this.f131393a);
            }
        }

        public final void run() {
            List<c> list;
            Future<List<c>> future = this.f131392a.f131387a;
            if (!(future == null || (list = future.get()) == null)) {
                ArrayList<c> arrayList = new ArrayList();
                for (T t : list) {
                    if (!l.a((Object) t.r(), (Object) this.f131392a.f131390d)) {
                        arrayList.add(t);
                    }
                }
                for (c cVar : arrayList) {
                    com.ss.android.b.a.a.a.b(new a(cVar, this));
                }
            }
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131391a = new a();

        static {
            Covode.recordClassIndex(86083);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> a2 = g.a().o().l().a();
            ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(com.ss.android.ugc.aweme.tools.draft.j.c.a().queryDraftWithUserId(it.next()));
            }
            return n.k(n.g((Iterable) arrayList));
        }
    }

    public aj(e eVar, String str) {
        l.d(eVar, "");
        l.d(str, "");
        this.f131389c = eVar;
        this.f131390d = str;
    }
}
