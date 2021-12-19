package com.ss.android.ugc.aweme.shortvideo.ab;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.shortvideo.ab.k;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.p.c;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class n extends com.ss.android.ugc.aweme.ar.a {

    /* renamed from: a  reason: collision with root package name */
    public static final n f124873a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(82041);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ m $pageAction;
        int label;

        static {
            Covode.recordClassIndex(82042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, d dVar) {
            super(2, dVar);
            this.$pageAction = mVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$pageAction, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                m.c cVar = (m.c) this.$pageAction;
                this.label = 1;
                cVar.f124869a.f83183d = cVar.f124870b;
                cVar.f124869a.W.bs = g.a().M();
                obj = i.a(bf.f159041b, new k.a(cVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DraftSaveResult draftSaveResult = (DraftSaveResult) obj;
            if (draftSaveResult.isSuc()) {
                ((m.c) this.$pageAction).f124872d.onDraftSaveSuccess();
            } else {
                ((m.c) this.$pageAction).f124872d.onDraftSaveFailed(draftSaveResult);
            }
            return z.f158842a;
        }
    }

    public static <RETURN_VALUE> RETURN_VALUE a(m<RETURN_VALUE> mVar) {
        l.d(mVar, "");
        if (mVar instanceof m.b) {
            m.b bVar = (m.b) mVar;
            a(bVar.f124866a, bVar.f124867b, bVar.f124868c);
            return (RETURN_VALUE) z.f158842a;
        } else if (mVar instanceof m.c) {
            bz unused = i.a(an.a(com.ss.android.ugc.asve.editor.d.f62009a), null, null, new a(mVar, null), 3);
            return (RETURN_VALUE) z.f158842a;
        } else if (mVar instanceof m.a) {
            ((m.a) mVar).f124865a.finish();
            return (RETURN_VALUE) z.f158842a;
        } else {
            throw new h.n();
        }
    }

    private static void a(e eVar, Bundle bundle, String str) {
        com.ss.android.ugc.aweme.shortvideo.p.e b2 = com.ss.android.ugc.aweme.shortvideo.p.d.b(c.f129554a);
        b2.d();
        b2.a("after_click_publish", true);
        b2.a(1);
        o.a(eVar, bundle, str);
    }
}
