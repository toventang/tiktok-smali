package com.ss.android.ugc.aweme.dsp.playerservice.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.playerservice.b.i;
import com.ss.android.ugc.aweme.dsp.playerservice.c.e;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a f83538a = new a();

    /* renamed from: b  reason: collision with root package name */
    private e f83539b = e.f83415c;

    /* renamed from: f  reason: collision with root package name */
    private i f83540f;

    /* renamed from: g  reason: collision with root package name */
    private final String f83541g;

    static {
        Covode.recordClassIndex(52139);
    }

    public final class a extends com.ss.android.ugc.aweme.dsp.playerservice.e.a.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f83542a;

        static {
            Covode.recordClassIndex(52140);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final boolean a() {
            return this.f83542a;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b() {
            t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> d2 = MusicDspApi.a.b().queryMusicFeed().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C1978a(this));
            l.b(d2, "");
            return d2;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.a.a
        public final t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> c() {
            this.f83542a = true;
            t<List<com.ss.android.ugc.aweme.dsp.playerservice.b.c>> b2 = MusicDspApi.a.b().queryMusicFeed().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this)).a(new C1979c(this)).b((f) new d(this));
            l.b(b2, "");
            return b2;
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.c$a$c  reason: collision with other inner class name */
        static final class C1979c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83546a;

            static {
                Covode.recordClassIndex(52143);
            }

            C1979c(a aVar) {
                this.f83546a = aVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.f83546a.f83542a = false;
            }
        }

        static final class d<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83547a;

            static {
                Covode.recordClassIndex(52144);
            }

            d(a aVar) {
                this.f83547a = aVar;
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.f83547a.f83542a = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.e.c$a$a  reason: collision with other inner class name */
        static final class C1978a<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83544a;

            static {
                Covode.recordClassIndex(52141);
            }

            C1978a(a aVar) {
                this.f83544a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                DspFeedResponse dspFeedResponse = (DspFeedResponse) obj;
                l.d(dspFeedResponse, "");
                c cVar = c.this;
                l.d(dspFeedResponse, "");
                Iterator<T> it = dspFeedResponse.getDspList().iterator();
                while (it.hasNext()) {
                    String str = ((BaseDspFeedResponse) dspFeedResponse).extra.logid;
                    l.b(str, "");
                    cVar.f83535c.add(cVar.a(it.next(), str));
                }
                return c.this.f83535c;
            }
        }

        static final class b<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83545a;

            static {
                Covode.recordClassIndex(52142);
            }

            b(a aVar) {
                this.f83545a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                DspFeedResponse dspFeedResponse = (DspFeedResponse) obj;
                l.d(dspFeedResponse, "");
                CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList = c.this.f83535c;
                ArrayList arrayList = new ArrayList(n.a((Iterable) copyOnWriteArrayList, 10));
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
                ArrayList arrayList2 = arrayList;
                List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> a2 = c.this.a(dspFeedResponse);
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
                c.this.f83535c.addAll(arrayList5);
                return arrayList5;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.b.d
    public final i a() {
        return this.f83540f;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.a.a e() {
        return this.f83538a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.e.b
    public final boolean a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        if (this.f83535c.size() - c(cVar) <= 3) {
            return true;
        }
        return false;
    }

    public c(String str, i iVar) {
        l.d(str, "");
        l.d(iVar, "");
        this.f83541g = str;
        this.f83540f = iVar;
    }
}
