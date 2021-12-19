package com.ss.android.ugc.aweme.tools.mvtemplate;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.effectplatform.n;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.Callable;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public f f140864a;

    static {
        Covode.recordClassIndex(91976);
    }

    public static final class a implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f140865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IEffectDownloadProgressListener f140866b;

        static {
            Covode.recordClassIndex(91977);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.m$a$a  reason: collision with other inner class name */
        static final class CallableC3727a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Effect f140867a;

            static {
                Covode.recordClassIndex(91978);
            }

            CallableC3727a(Effect effect) {
                this.f140867a = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    e.b(new File(this.f140867a.getUnzipPath()));
                    return null;
                } catch (Exception unused) {
                    bj.a("MVRes: Invalid Res Delete Failed :" + this.f140867a.getUnzipPath());
                    return null;
                }
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            l.d(effect, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f140866b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onStart(effect);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            l.d(effect2, "");
            if (!m.b(effect2)) {
                i.b(new CallableC3727a(effect2), i.f4824a);
                IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f140866b;
                if (iEffectDownloadProgressListener != null) {
                    iEffectDownloadProgressListener.onFail(effect2, new ExceptionResult(-10002));
                    return;
                }
                return;
            }
            IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.f140866b;
            if (iEffectDownloadProgressListener2 != null) {
                iEffectDownloadProgressListener2.onSuccess(effect2);
            }
        }

        a(m mVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            this.f140865a = mVar;
            this.f140866b = iEffectDownloadProgressListener;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f140866b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onFail(effect, exceptionResult);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            l.d(effect, "");
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.f140866b;
            if (iEffectDownloadProgressListener != null) {
                iEffectDownloadProgressListener.onProgress(effect, i2, j2);
            }
        }
    }

    public final boolean a(Effect effect) {
        f fVar = this.f140864a;
        boolean z = false;
        if (fVar == null || effect == null) {
            return false;
        }
        try {
            z = fVar.b(effect);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    public static boolean b(Effect effect) {
        if (!(effect == null || effect.getUnzipPath() == null)) {
            String unzipPath = effect.getUnzipPath();
            if (e.b(unzipPath) && VEUtils.checkMVResourceIntegrity(unzipPath) == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a(Effect effect, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        if (this.f140864a == null || effect == null) {
            iEffectDownloadProgressListener.onFail(effect, new ExceptionResult(-10001));
        } else if (b(effect)) {
            iEffectDownloadProgressListener.onSuccess(effect);
        } else {
            f fVar = this.f140864a;
            if (fVar == null) {
                l.b();
            }
            fVar.a(effect, n.a.a("mv", new a(this, iEffectDownloadProgressListener)));
        }
    }
}
