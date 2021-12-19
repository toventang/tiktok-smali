package com.ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.e;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Type;

public final class x {
    static {
        Covode.recordClassIndex(89269);
    }

    public static final class a extends m implements b<e.a, z> {
        final /* synthetic */ f $diContainer;
        final /* synthetic */ r.b $listener;

        static {
            Covode.recordClassIndex(89270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, r.b bVar) {
            super(1);
            this.$diContainer = fVar;
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f28470a = k.a((androidx.fragment.app.e) this.$diContainer.a((Type) androidx.fragment.app.e.class, (String) null));
            aVar2.f28471b = k.a(this.$diContainer);
            f fVar = this.$diContainer;
            r.b bVar = this.$listener;
            l.d(fVar, "");
            l.d(bVar, "");
            aVar2.f28472c = new u(fVar, bVar);
            return z.f158842a;
        }
    }
}
