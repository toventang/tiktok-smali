package com.ss.android.ugc.aweme.video.preload.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f143605a = new d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final e f143606b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final h f143607c = i.a(m.SYNCHRONIZED, a.f143608a);

    public static d a() {
        return (d) f143607c.getValue();
    }

    private e() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143608a = new a();

        static {
            Covode.recordClassIndex(93946);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return a();
        }

        private static d a() {
            d dVar;
            try {
                dVar = (d) b.a().a(true, "video_cover_preload_config", d.class, e.f143605a);
                if (dVar == null) {
                    dVar = new d((byte) 0);
                }
            } catch (Throwable unused) {
            }
            l.b(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(93945);
    }
}
