package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.effectplatform.n;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.Callable;

public final class c extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {
    static {
        Covode.recordClassIndex(91879);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Effect f140695a;

        static {
            Covode.recordClassIndex(91881);
        }

        b(Effect effect) {
            this.f140695a = effect;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                e.b(new File(this.f140695a.getUnzipPath()));
                return null;
            } catch (Exception unused) {
                bj.a("MVRes: Invalid Res Delete Failed :" + this.f140695a.getUnzipPath());
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class a implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140693a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MvThemeData f140694b;

        static {
            Covode.recordClassIndex(91880);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            l.d(effect, "");
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            l.d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            l.d(effect2, "");
            if (!com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e.a.a(effect2)) {
                i.b(new b(effect2), i.f4824a);
                long a2 = this.f140693a.f140641b.a("download mv effect", "failed.");
                d dVar = this.f140693a.f140642c.f140677f;
                if (dVar != null) {
                    dVar.f140734c = (int) a2;
                }
                d dVar2 = this.f140693a.f140642c.f140677f;
                if (dVar2 != null) {
                    dVar2.f140743l = "mv list is null";
                }
                d dVar3 = this.f140693a.f140642c.f140677f;
                if (dVar3 != null) {
                    dVar3.f140742k = 3;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c cVar = this.f140693a.f140642c.f140679h;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            long a3 = this.f140693a.f140641b.a("download mv effect", "success");
            d dVar4 = this.f140693a.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140734c = (int) a3;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c cVar2 = this.f140693a.f140642c.f140679h;
            if (cVar2 != null) {
                cVar2.a(this.f140694b);
            }
        }

        a(c cVar, MvThemeData mvThemeData) {
            this.f140693a = cVar;
            this.f140694b = mvThemeData;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            long a2 = this.f140693a.f140641b.a("download mv effect", "failed.");
            d dVar = this.f140693a.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140734c = (int) a2;
            }
            d dVar2 = this.f140693a.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140743l = exceptionResult.getMsg();
            }
            d dVar3 = this.f140693a.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140742k = 3;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c cVar = this.f140693a.f140642c.f140679h;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        this.f140641b.f140703a = System.currentTimeMillis();
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 2;
        }
        if (obj instanceof MvThemeData) {
            MvThemeData mvThemeData = (MvThemeData) obj;
            Effect effect = mvThemeData.f140618a;
            l.b(effect, "");
            if (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e.a.a(effect)) {
                long a2 = this.f140641b.a("download mv effect", "success by cache.");
                d dVar2 = this.f140642c.f140677f;
                if (dVar2 != null) {
                    dVar2.f140734c = (int) a2;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c cVar = this.f140642c.f140679h;
                if (cVar != null) {
                    cVar.a(mvThemeData);
                    return;
                }
                return;
            }
            f fVar = this.f140642c.f140683l;
            if (fVar != null) {
                fVar.a(mvThemeData.f140618a, n.a.a("mv", new a(this, mvThemeData)));
                return;
            }
            return;
        }
        long a3 = this.f140641b.a("download mv effect", "failed.");
        d dVar3 = this.f140642c.f140677f;
        if (dVar3 != null) {
            dVar3.f140734c = (int) a3;
        }
        d dVar4 = this.f140642c.f140677f;
        if (dVar4 != null) {
            dVar4.f140743l = "mv list pass error";
        }
        d dVar5 = this.f140642c.f140677f;
        if (dVar5 != null) {
            dVar5.f140742k = 3;
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c cVar2 = this.f140642c.f140679h;
        if (cVar2 != null) {
            cVar2.a();
        }
    }
}
