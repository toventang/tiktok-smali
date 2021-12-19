package com.ss.android.ugc.aweme.shortvideo.g;

import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final l<Boolean> f128528a;

    /* renamed from: b  reason: collision with root package name */
    private final h f128529b = i.a((h.f.a.a) b.f128532a);

    /* renamed from: c  reason: collision with root package name */
    private final h f128530c = i.a((h.f.a.a) a.f128531a);

    static {
        Covode.recordClassIndex(84270);
    }

    public final a a() {
        return (a) this.f128529b.getValue();
    }

    public final List<b> b() {
        return (List) this.f128530c.getValue();
    }

    static final class a extends m implements h.f.a.a<ArrayList<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f128531a = new a();

        static {
            Covode.recordClassIndex(84271);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<b> invoke() {
            return new ArrayList();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f128532a = new b();

        static {
            Covode.recordClassIndex(84272);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    public c(l<Boolean> lVar) {
        h.f.b.l.d(lVar, "");
        this.f128528a = lVar;
    }

    public final void a(b bVar) {
        h.f.b.l.d(bVar, "");
        a a2 = a();
        h.f.b.l.d(bVar, "");
        if (a2.a(bVar) < bVar.f128525b) {
            b().add(bVar);
        }
    }
}
