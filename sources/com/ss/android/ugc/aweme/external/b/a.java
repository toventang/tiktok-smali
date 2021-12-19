package com.ss.android.ugc.aweme.external.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.shortvideo.duet.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90321a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(56694);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.a$a  reason: collision with other inner class name */
    public static final class C2175a implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f90322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f90323b;

        static {
            Covode.recordClassIndex(56695);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.a$a$a  reason: collision with other inner class name */
        public static final class C2176a implements IFetchEffectListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2175a f90324a;

            static {
                Covode.recordClassIndex(56696);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2176a(C2175a aVar) {
                this.f90324a = aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                this.f90324a.f90322a.invoke(effect);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
                this.f90324a.f90322a.invoke(null);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f90322a.invoke(null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<Effect> allCategoryEffects;
            T t;
            String str;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (!(effectChannelResponse2 == null || (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) == null)) {
                Iterator<T> it = allCategoryEffects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    e a2 = com.ss.android.ugc.aweme.shortvideo.duet.l.a(t);
                    if (a2 != null) {
                        str = a2.f126514a;
                    } else {
                        str = null;
                    }
                    if (l.a((Object) "vertical", (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    if (this.f90323b.a((Effect) t2)) {
                        this.f90322a.invoke(t2);
                        return;
                    } else {
                        this.f90323b.b(t2, new C2176a(this));
                        return;
                    }
                }
            }
            this.f90322a.invoke(null);
        }

        C2175a(b bVar, f fVar) {
            this.f90322a = bVar;
            this.f90323b = fVar;
        }
    }
}
