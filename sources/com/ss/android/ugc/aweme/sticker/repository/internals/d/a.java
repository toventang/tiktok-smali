package com.ss.android.ugc.aweme.sticker.repository.internals.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.o;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    private final d f135561a;

    static {
        Covode.recordClassIndex(88595);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.a$a  reason: collision with other inner class name */
    public static final class C3530a implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListener f135562a;

        static {
            Covode.recordClassIndex(88596);
        }

        C3530a(IFetchEffectListener iFetchEffectListener) {
            this.f135562a = iFetchEffectListener;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            IFetchEffectListener iFetchEffectListener = this.f135562a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onStart(effect);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            IFetchEffectListener iFetchEffectListener = this.f135562a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onSuccess(effect);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            IFetchEffectListener iFetchEffectListener = this.f135562a;
            if (iFetchEffectListener != null) {
                iFetchEffectListener.onFail(effect, exceptionResult);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            IFetchEffectListener iFetchEffectListener = this.f135562a;
            if (!(iFetchEffectListener instanceof IEffectDownloadProgressListener)) {
                iFetchEffectListener = null;
            }
            IEffectDownloadProgressListener iEffectDownloadProgressListener = (IEffectDownloadProgressListener) iFetchEffectListener;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onProgress(effect, i2, j2);
            }
        }
    }

    public static final class b implements IFetchEffectListListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListListener f135563a;

        static {
            Covode.recordClassIndex(88597);
        }

        b(IFetchEffectListListener iFetchEffectListListener) {
            this.f135563a = iFetchEffectListListener;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListListener iFetchEffectListListener = this.f135563a;
            if (iFetchEffectListListener != null) {
                iFetchEffectListListener.onFail(exceptionResult);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(List<Effect> list) {
            IFetchEffectListListener iFetchEffectListListener = this.f135563a;
            if (iFetchEffectListListener != null) {
                iFetchEffectListListener.onSuccess(list);
            }
        }
    }

    public a(d dVar) {
        l.d(dVar, "");
        this.f135561a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.o
    public final void a(Effect effect, IFetchEffectListener iFetchEffectListener) {
        l.d(effect, "");
        if (!this.f135561a.c(effect)) {
            this.f135561a.b(effect, new C3530a(iFetchEffectListener));
        } else if (!(iFetchEffectListener instanceof com.ss.android.ugc.aweme.sticker.repository.b.b) && iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.o
    public final void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        l.d(list, "");
        this.f135561a.a(list, map, iFetchEffectListByIdsListener);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.o
    public final void a(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        l.d(list, "");
        this.f135561a.a(list, map, z, new b(iFetchEffectListListener));
    }
}
