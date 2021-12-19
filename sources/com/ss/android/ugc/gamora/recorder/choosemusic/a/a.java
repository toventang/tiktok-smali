package com.ss.android.ugc.gamora.recorder.choosemusic.a;

import com.bytedance.als.b;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.m;
import h.z;

public interface a extends b {

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.a$a */
    public static final class C3962a {
        static {
            Covode.recordClassIndex(97203);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.a$a$a */
        public static final class C3963a extends m implements h.f.a.a<z> {

            /* renamed from: a */
            public static final C3963a f147504a = new C3963a();

            static {
                Covode.recordClassIndex(97204);
            }

            C3963a() {
                super(0);
            }

            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                return z.f158842a;
            }
        }
    }

    static {
        Covode.recordClassIndex(97202);
    }

    g<Boolean> a();

    void a(int i2, boolean z);

    void a(Effect effect);

    void a(String str, long j2, Long l2, Effect effect, h.f.a.a<z> aVar);

    g<Boolean> b();

    void b(Effect effect);

    void c(Effect effect);

    boolean c();

    void d(Effect effect);
}
