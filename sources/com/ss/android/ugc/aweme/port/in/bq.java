package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.c.d;
import h.e.j;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class bq {
    static {
        Covode.recordClassIndex(74579);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ File $oldEffectModelFilesDir;
        int label;

        static {
            Covode.recordClassIndex(74580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(File file, d dVar) {
            super(2, dVar);
            this.$oldEffectModelFilesDir = file;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$oldEffectModelFilesDir, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                j.g(this.$oldEffectModelFilesDir);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void a(Context context) {
        l.d(context, "");
        if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
        }
        File file = com.ss.android.ugc.aweme.lancet.d.f107195c;
        l.b(file, "");
        File a2 = j.a(j.a(file, "vesdk"), "models");
        if (a2.exists()) {
            bz unused = i.a(bs.f159054a, null, null, new a(a2, null), 3);
        }
    }
}
