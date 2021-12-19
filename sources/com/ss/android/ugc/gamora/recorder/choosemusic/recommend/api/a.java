package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import f.a.ad;
import f.a.af;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {
    static {
        Covode.recordClassIndex(97278);
    }

    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final f f147617a = new f();

        static {
            Covode.recordClassIndex(97284);
        }

        f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new ArrayList();
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f147614a;

        static {
            Covode.recordClassIndex(97281);
        }

        public c(h.f.a.b bVar) {
            this.f147614a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f147614a.invoke(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a.f147663e);
        }
    }

    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final h f147619a = new h();

        static {
            Covode.recordClassIndex(97286);
        }

        h() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            l.d(arrayList, "");
            return arrayList;
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f147613a;

        static {
            Covode.recordClassIndex(97280);
        }

        public b(h.f.a.b bVar) {
            this.f147613a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f147613a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    public static final class d<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        public static final d f147615a = new d();

        static {
            Covode.recordClassIndex(97282);
        }

        d() {
        }

        @Override // f.a.af
        public final void subscribe(ad<List<SimpleMusic>> adVar) {
            l.d(adVar, "");
            adVar.a(z.INSTANCE);
        }
    }

    public static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendMusicApi f147616a;

        static {
            Covode.recordClassIndex(97283);
        }

        public e(RecommendMusicApi recommendMusicApi) {
            this.f147616a = recommendMusicApi;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            return this.f147616a.getMusicDetail(str);
        }
    }

    public static final class g<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f147618a = new g();

        static {
            Covode.recordClassIndex(97285);
        }

        g() {
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            List list = (List) obj;
            l.d(list, "");
            l.d(obj2, "");
            list.add(obj2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$a  reason: collision with other inner class name */
    public static final class C3967a<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final C3967a f147612a = new C3967a();

        static {
            Covode.recordClassIndex(97279);
        }

        C3967a() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            List list = (List) obj;
            RecommendMusic recommendMusic = (RecommendMusic) obj2;
            l.d(list, "");
            l.d(recommendMusic, "");
            return new com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a(recommendMusic, list);
        }
    }
}
