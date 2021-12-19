package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.e;
import com.bytedance.ies.abmock.j;
import com.ss.android.ugc.playerkit.model.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final c f143304a = null;

    /* renamed from: b  reason: collision with root package name */
    static final h f143305b = i.a((h.f.a.a) b.f143310a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f143306c = i.a((h.f.a.a) c.f143311a);

    /* renamed from: d  reason: collision with root package name */
    public static final h f143307d = i.a((h.f.a.a) a.f143309a);

    /* renamed from: e  reason: collision with root package name */
    public static final o f143308e = new o();

    private o() {
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143310a = new b();

        static {
            Covode.recordClassIndex(93794);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return com.bytedance.ies.abmock.b.a().a(true, "player_dynamic_option_config", c.class, o.f143304a);
        }
    }

    static {
        Covode.recordClassIndex(93792);
    }

    static final class a extends m implements h.f.a.a<List<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143309a = new a();

        static {
            Covode.recordClassIndex(93793);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<f> invoke() {
            c cVar = (c) com.bytedance.ies.abmock.b.a().a(true, "player_dynamic_option_config", c.class, o.f143304a);
            ArrayList arrayList = null;
            if (cVar != null && cVar.f143281a != null && !cVar.f143281a.isEmpty() && com.bytedance.g.c.f29648d) {
                j a2 = j.a();
                l.b(a2, "");
                if (a2.f31864a != null) {
                    arrayList = new ArrayList();
                    for (d dVar : cVar.f143281a) {
                        if (dVar.f143285d == 2 || dVar.f143285d == 3) {
                            f a3 = dVar.a();
                            e.a();
                            if (a3.a(e.b(dVar.f143282a, true))) {
                                arrayList.add(a3);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    static final class c extends m implements h.f.a.a<List<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143311a = new c();

        static {
            Covode.recordClassIndex(93795);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<f> invoke() {
            c cVar = (c) o.f143305b.getValue();
            ArrayList arrayList = null;
            if (cVar != null && cVar.f143281a != null && !cVar.f143281a.isEmpty() && com.bytedance.g.c.f29648d) {
                j a2 = j.a();
                l.b(a2, "");
                if (a2.f31864a != null) {
                    arrayList = new ArrayList();
                    for (d dVar : cVar.f143281a) {
                        if (dVar.f143285d == 1) {
                            f a3 = dVar.a();
                            e.a();
                            if (a3.a(e.b(dVar.f143282a, true))) {
                                arrayList.add(a3);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }
}
