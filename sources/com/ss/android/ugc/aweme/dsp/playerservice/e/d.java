package com.ss.android.ugc.aweme.dsp.playerservice.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.i;
import com.ss.android.ugc.aweme.dsp.playerservice.c.e;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.model.DSPShuffleCollectResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import f.a.d.f;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public final class d extends b implements q {

    /* renamed from: g  reason: collision with root package name */
    public static final b f83548g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>, z> f83549a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a f83550b = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f83551f;

    /* renamed from: h  reason: collision with root package name */
    private i f83552h;

    /* renamed from: i  reason: collision with root package name */
    private e f83553i = e.f83417e;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.dsp.playerservice.f.a f83554j;

    /* renamed from: k  reason: collision with root package name */
    private final String f83555k;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<List<String>> f83556l;

    static {
        Covode.recordClassIndex(52145);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(65, new g(d.class, "onCollectAwemeEvent", com.ss.android.ugc.aweme.favorites.d.a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(66, new g(d.class, "onFollowEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    public final class a extends com.ss.android.ugc.aweme.dsp.playerservice.e.a.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f83557a;

        static {
            Covode.recordClassIndex(52146);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final boolean a() {
            return this.f83557a;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b() {
            t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b2 = t.b((Object) d.this.f83535c);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> c() {
            t<DSPShuffleCollectResponse> a2;
            this.f83557a = true;
            List g2 = n.g((Collection) com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.f83579a.f83371b);
            if (g2.size() > 1000) {
                g2 = g2.subList(0, 1000);
            }
            String a3 = n.a(g2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            if (d.this.f83537e == 0) {
                a2 = MusicDspApi.a.a(a3, d.this.f(), d.this.f83551f);
            } else {
                a2 = MusicDspApi.a.a(a3, d.this.f(), "");
            }
            t<R> a4 = a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C1980a(this)).f(b.f83560a).b(new c(this)).a(new C1981d(this));
            l.b(a4, "");
            return a4;
        }

        static final class b<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final b f83560a = new b();

            static {
                Covode.recordClassIndex(52148);
            }

            b() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return h.a.z.INSTANCE;
            }
        }

        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83561a;

            static {
                Covode.recordClassIndex(52149);
            }

            c(a aVar) {
                this.f83561a = aVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.f83561a.f83557a = false;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.d$a$d  reason: collision with other inner class name */
        static final class C1981d<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83562a;

            static {
                Covode.recordClassIndex(52150);
            }

            C1981d(a aVar) {
                this.f83562a = aVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.f83562a.f83557a = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.d$a$a  reason: collision with other inner class name */
        static final class C1980a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83559a;

            static {
                Covode.recordClassIndex(52147);
            }

            C1980a(a aVar) {
                this.f83559a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                DSPShuffleCollectResponse dSPShuffleCollectResponse = (DSPShuffleCollectResponse) obj;
                l.d(dSPShuffleCollectResponse, "");
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = d.this.f83535c;
                ArrayList arrayList = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
                ArrayList arrayList2 = arrayList;
                List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> a2 = d.this.a(dSPShuffleCollectResponse);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (T t : a2) {
                    if (hashSet.add(t.a())) {
                        arrayList3.add(t);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (T t2 : arrayList3) {
                    if (!arrayList2.contains(t2.a())) {
                        arrayList4.add(t2);
                    }
                }
                ArrayList arrayList5 = arrayList4;
                d.this.f83535c.addAll(arrayList5);
                d.this.f83537e = d.this.f83535c.size();
                return arrayList5;
            }
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(52151);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public final i a() {
        return this.f83552h;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a e() {
        return this.f83550b;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d, com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final void c() {
        super.c();
        this.f83554j.a((q) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d, com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final void d() {
        super.d();
        this.f83554j.b((q) this);
    }

    public final String f() {
        List<String> invoke = this.f83556l.invoke();
        if (invoke.size() > 1000) {
            invoke = invoke.subList(0, 1000);
        }
        return n.a(invoke, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f83563a;

        static {
            Covode.recordClassIndex(52152);
        }

        c(d dVar) {
            this.f83563a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>, z> bVar = this.f83563a.f83549a;
            if (bVar != null) {
                l.b(obj, "");
                bVar.invoke(obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.d$d  reason: collision with other inner class name */
    static final class C1982d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f83564a;

        static {
            Covode.recordClassIndex(52153);
        }

        C1982d(d dVar) {
            this.f83564a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b<? super List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c>, z> bVar = this.f83564a.f83549a;
            if (bVar != null) {
                bVar.invoke(h.a.z.INSTANCE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final boolean a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        if (this.f83535c.size() - c(cVar) <= 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
        if (!this.f83550b.a() && a(cVar)) {
            this.f83550b.c().a(new c(this), new C1982d(this));
        }
    }

    @r
    public final void onCollectAwemeEvent(com.ss.android.ugc.aweme.favorites.d.a aVar) {
        l.d(aVar, "");
        if (!this.f83535c.isEmpty()) {
            if (aVar.f90594b == 1 || aVar.f90594b == 0) {
                for (T t : this.f83535c) {
                    if (l.a((Object) t.c().getAweme().getAid(), (Object) aVar.f90593a)) {
                        t.a(aVar.f90594b);
                    }
                }
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        String str;
        List<MusicOwnerInfo> musicOwnerInfos;
        MusicOwnerInfo musicOwnerInfo;
        l.d(followStatusEvent, "");
        if (!this.f83535c.isEmpty()) {
            FollowStatus followStatus = followStatusEvent.status;
            for (T t : this.f83535c) {
                Music music = t.c().getAweme().getMusic();
                if (music == null || (musicOwnerInfos = music.getMusicOwnerInfos()) == null || (musicOwnerInfo = (MusicOwnerInfo) n.h((List) musicOwnerInfos)) == null) {
                    str = null;
                } else {
                    str = musicOwnerInfo.getSecUid();
                }
                if (l.a((Object) str, (Object) followStatus.secUserId)) {
                    t.a(Integer.valueOf(followStatus.followStatus));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.ss.android.ugc.aweme.dsp.playerservice.f.a aVar, String str, i iVar, h.f.a.a<? extends List<String>> aVar2, String str2) {
        l.d(aVar, "");
        l.d(str, "");
        l.d(iVar, "");
        l.d(aVar2, "");
        l.d(str2, "");
        this.f83554j = aVar;
        this.f83555k = str;
        this.f83556l = aVar2;
        this.f83551f = str2;
        this.f83552h = iVar;
    }
}
