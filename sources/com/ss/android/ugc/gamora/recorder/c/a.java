package com.ss.android.ugc.gamora.recorder.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final j f147486a;

    static {
        Covode.recordClassIndex(97180);
    }

    public a(j jVar) {
        l.d(jVar, "");
        this.f147486a = jVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.a$a  reason: collision with other inner class name */
    public static final class C3959a implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f147487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IEffectDownloadProgressListener f147488b;

        static {
            Covode.recordClassIndex(97181);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f147488b;
            if (exceptionResult == null) {
                exceptionResult = new ExceptionResult(new Exception("unknown"));
            }
            iEffectDownloadProgressListener.onFail(null, exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = data.get(0)) != null) {
                if (this.f147487a.f147486a.t().c().e().a(effect)) {
                    this.f147488b.onSuccess(effect);
                } else {
                    this.f147487a.f147486a.t().a(effect, this.f147488b);
                }
            }
        }

        C3959a(a aVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            this.f147487a = aVar;
            this.f147488b = iEffectDownloadProgressListener;
        }
    }

    public final void a(String str, Map<String, String> map, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        l.d(str, "");
        l.d(iEffectDownloadProgressListener, "");
        e.a(this.f147486a, n.a(str), map, new C3959a(this, iEffectDownloadProgressListener));
    }
}
