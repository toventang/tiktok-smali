package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class c {
    static {
        Covode.recordClassIndex(64232);
    }

    static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ int $duration;
        final /* synthetic */ Context $this_showBaToast;
        int label;

        static {
            Covode.recordClassIndex(64233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str, int i2, d dVar) {
            super(2, dVar);
            this.$this_showBaToast = context;
            this.$content = str;
            this.$duration = i2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$this_showBaToast, this.$content, this.$duration, dVar);
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
                Toast toast = new b(this.$this_showBaToast, this.$content, this.$duration).f100484a;
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(toast);
                }
                toast.show();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void a(Context context, int i2) {
        l.d(context, "");
        String string = context.getString(i2);
        l.b(string, "");
        l.d(context, "");
        l.d(string, "");
        bz unused = i.a(bs.f159054a, o.f159148a, null, new a(context, string, 0, null), 2);
    }
}
