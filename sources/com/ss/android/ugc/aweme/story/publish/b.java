package com.ss.android.ugc.aweme.story.publish;

import b.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f138099a = i.a((h.f.a.a) a.f138101a);

    /* renamed from: b  reason: collision with root package name */
    private final h.f.a.a<z> f138100b;

    static {
        Covode.recordClassIndex(90311);
    }

    private final j<z> b() {
        return (j) this.f138099a.getValue();
    }

    static final class a extends m implements h.f.a.a<j<z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f138101a = new a();

        static {
            Covode.recordClassIndex(90312);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j<z> invoke() {
            return new j();
        }
    }

    public final void a() {
        b().a(z.f158842a);
    }

    public final void run() {
        this.f138100b.invoke();
        b().f4869a.f();
    }

    public b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f138100b = aVar;
    }
}
