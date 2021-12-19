package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.video.b.z;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Comparator;
import java.util.List;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f143244a = new ab();

    /* renamed from: b  reason: collision with root package name */
    private static final h f143245b = i.a((h.f.a.a) c.f143250a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f143246c = i.a((h.f.a.a) d.f143251a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f143247d = i.a((h.f.a.a) a.f143248a);

    public static final int a() {
        return ((Number) f143245b.getValue()).intValue();
    }

    public static final int b() {
        return ((Number) f143246c.getValue()).intValue();
    }

    private ab() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143248a = new a();

        static {
            Covode.recordClassIndex(93756);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "profile_video_preload_concurrent_experiment_2103_tt", 1));
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143250a = new c();

        static {
            Covode.recordClassIndex(93758);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "profile_video_preload_experiment_2103_tt", 0));
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f143251a = new d();

        static {
            Covode.recordClassIndex(93759);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "profile_video_preload_size_experiment_2103_tt", 409600));
        }
    }

    static {
        Covode.recordClassIndex(93755);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143253a;

        static {
            Covode.recordClassIndex(93761);
        }

        f(h.f.a.a aVar) {
            this.f143253a = aVar;
        }

        public final void run() {
            l.d("others profile idle preload [start] add ------------", "");
            List<Aweme> list = (List) this.f143253a.invoke();
            if (z.f143344a) {
                l.d("start sort", "");
                if (list != null) {
                    list = n.a((Iterable) list, (Comparator) new a());
                }
                l.d("others profile idle preload [end] add ------------\n", "");
            }
            if (list != null) {
                for (Aweme aweme : list) {
                    ac.a(aweme, ab.b());
                }
            }
            l.d("others profile idle preload [end] add ------------\n", "");
        }

        public static final class a<T> implements Comparator {
            static {
                Covode.recordClassIndex(93762);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l2;
                AwemeStatistics statistics;
                AwemeStatistics statistics2;
                T t3 = t2;
                Long l3 = null;
                if (t3 == null || (statistics2 = t3.getStatistics()) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(statistics2.getDiggCount());
                }
                T t4 = t;
                if (!(t4 == null || (statistics = t4.getStatistics()) == null)) {
                    l3 = Long.valueOf(statistics.getDiggCount());
                }
                return h.b.a.a(l2, l3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143249a = new b();

        static {
            Covode.recordClassIndex(93757);
        }

        b() {
            super(1);
        }

        public static boolean a(int i2) {
            if ((i2 & ab.a()) > 0) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    public static final class e extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f143252a = new e();

        static {
            Covode.recordClassIndex(93760);
        }

        e() {
            super(1);
        }

        public static boolean a(int i2) {
            if ((i2 & ab.a()) > 0) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a(num.intValue()));
        }
    }

    private static boolean a(int i2) {
        l.d("current scope is [" + a() + ']', "");
        if (i2 == 0) {
            l.d("current scene is [OthersPublish]", "");
            return b.a(1);
        } else if (i2 != 1) {
            return false;
        } else {
            l.d("current scene is [OthersFavorite]", "");
            return b.a(2);
        }
    }

    public static final void a(int i2, h.f.a.a<? extends List<? extends Aweme>> aVar) {
        l.d(aVar, "");
        if (!a(i2)) {
            l.d("this scene is not in scope", "");
        } else if (b() > 0) {
            com.ss.android.ugc.aweme.base.m.f68150a.execute(new f(aVar));
        }
    }

    public static final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, boolean z, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("[");
        if (iVar != null) {
            str = iVar.getSourceId();
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append("] add preload task into engine [");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        l.d(append.append(str2).append("], size : ").append(i2).toString(), "");
    }
}
