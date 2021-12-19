package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.b.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import kotlinx.coroutines.am;

public final class h extends com.ss.android.ugc.aweme.editSticker.b.a {

    /* renamed from: c  reason: collision with root package name */
    public final i f88426c;

    static {
        Covode.recordClassIndex(55653);
    }

    public final int hashCode() {
        return this.f88093b.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.a((Object) ((com.ss.android.ugc.aweme.editSticker.b.a) obj).f88093b.getResourceId(), (Object) this.f88093b.getResourceId());
        }
        return false;
    }

    public static final class a extends k implements m<am, d<? super Boolean>, Object> {
        int label;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(55654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, d dVar) {
            super(2, dVar);
            this.this$0 = hVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super Boolean> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                try {
                    if (!b.a(this.this$0.f88093b)) {
                        return false;
                    }
                    return Boolean.valueOf(new File(this.this$0.f88426c.f88428b).exists());
                } catch (Exception unused) {
                    return false;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Effect effect, i iVar) {
        super(effect);
        l.d(effect, "");
        l.d(iVar, "");
        this.f88426c = iVar;
    }
}
