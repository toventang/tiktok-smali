package com.bytedance.android.live.broadcast.c.a.a;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.b.a;
import com.bytedance.android.live.broadcast.c.a.c;
import com.bytedance.android.live.broadcast.c.a.d;
import com.bytedance.android.live.broadcast.c.a.e;
import com.bytedance.android.live.broadcast.c.a.f;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectDownloadCacheSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a implements com.bytedance.android.live.broadcast.api.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final EffectManager f7780a = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getEffectManager();

    /* renamed from: b  reason: collision with root package name */
    public final List<a.AbstractC0100a> f7781b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f7782c = new ArrayList();

    static {
        Covode.recordClassIndex(3844);
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a
    public void a() {
        this.f7781b.clear();
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a
    public final boolean a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        if (aVar == null) {
            return true;
        }
        if (LiveEnableUseEffectDownloadCacheSetting.INSTANCE.enable() && this.f7782c.contains(aVar.f23001g)) {
            return true;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(this.f7780a, f.a(aVar));
        }
        return this.f7780a.isEffectDownloaded(f.a(aVar));
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a
    public final void a(final String str, com.bytedance.android.livesdkapi.depend.model.a aVar, final a.AbstractC0100a aVar2) {
        final e eVar;
        if (aVar != null && !a(aVar)) {
            if (com.bytedance.android.live.effect.api.a.f9636a.equals(str)) {
                eVar = new c();
            } else if (com.bytedance.android.live.effect.api.a.f9637b.equals(str)) {
                eVar = new d();
            } else {
                eVar = new e();
            }
            eVar.f7801b = SystemClock.uptimeMillis();
            this.f7780a.fetchEffect(f.a(aVar), new IFetchEffectListener() {
                /* class com.bytedance.android.live.broadcast.c.a.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3845);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    com.bytedance.android.livesdkapi.depend.model.a a2 = f.a(effect2);
                    a2.f23007m = false;
                    a2.f23006l = true;
                    eVar.b();
                    a.this.f7782c.add(effect2.getUnzipPath());
                    for (a.AbstractC0100a aVar : a.this.f7781b) {
                        aVar.b(str, a2);
                    }
                    a.AbstractC0100a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.b(str, a2);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    a.this.f7780a.deleteEffect(effect);
                    com.bytedance.android.livesdkapi.depend.model.a a2 = f.a(effect);
                    a2.f23007m = false;
                    eVar.b(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                    for (a.AbstractC0100a aVar : a.this.f7781b) {
                        aVar.a(str, a2);
                    }
                    a.AbstractC0100a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.a(str, a2);
                    }
                }
            });
            aVar.f23007m = true;
            Iterator<a.AbstractC0100a> it = this.f7781b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
