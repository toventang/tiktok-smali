package com.bytedance.android.live.broadcast.c.a.a;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.b.a;
import com.bytedance.android.live.broadcast.c.a.c;
import com.bytedance.android.live.broadcast.c.a.d;
import com.bytedance.android.live.broadcast.c.a.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectCheckCacheSetting;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final List<a.b> f7787d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, EffectChannelResponse> f7788e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, com.bytedance.android.livesdkapi.depend.model.a> f7789f = new HashMap();

    static {
        Covode.recordClassIndex(3846);
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a, com.bytedance.android.live.broadcast.c.a.a.a
    public final void a() {
        super.a();
        this.f7787d.clear();
        this.f7788e.clear();
    }

    @Override // com.bytedance.android.live.broadcast.api.b.a
    public final void a(final String str, final a.b bVar) {
        final e eVar;
        boolean z;
        if (this.f7788e.containsKey(str)) {
            for (a.b bVar2 : this.f7787d) {
                if (bVar2 != null) {
                    bVar2.a(this.f7788e.get(str));
                }
            }
            if (bVar != null) {
                bVar.a(this.f7788e.get(str));
            }
        } else if (this.f7780a != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (com.bytedance.android.live.effect.api.a.f9636a.equals(str)) {
                eVar = new c();
            } else if (com.bytedance.android.live.effect.api.a.f9637b.equals(str)) {
                eVar = new d();
            } else {
                eVar = new e();
            }
            final AnonymousClass1 r2 = new IFetchEffectChannelListener() {
                /* class com.bytedance.android.live.broadcast.c.a.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3847);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    if (atomicBoolean.get()) {
                        eVar.a(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                    }
                    for (a.b bVar : b.this.f7787d) {
                        if (bVar != null) {
                            bVar.a();
                        }
                    }
                    a.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 == null) {
                        return;
                    }
                    if (!h.a(effectChannelResponse2.getCategoryResponseList()) || !h.a(effectChannelResponse2.getAllCategoryEffects())) {
                        b.this.f7788e.put(str, effectChannelResponse2);
                        if (atomicBoolean.get()) {
                            eVar.a();
                        }
                        for (a.b bVar : b.this.f7787d) {
                            if (bVar != null) {
                                bVar.a(b.this.f7788e.get(str));
                            }
                        }
                        com.bytedance.android.live.effect.d.d().a(effectChannelResponse2);
                        a.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a(b.this.f7788e.get(str));
                        }
                    }
                }
            };
            eVar.f7800a = SystemClock.uptimeMillis();
            y.e();
            if (!j.f107226e || !j.b() || j.c()) {
                z = b();
                j.f107226e = z;
            } else {
                z = j.f107226e;
            }
            if (!z) {
                a(atomicBoolean, str, r2, false);
            } else if (LiveEnableUseEffectCheckCacheSetting.INSTANCE.enable()) {
                this.f7780a.checkedEffectListUpdate(str, new ICheckChannelListener() {
                    /* class com.bytedance.android.live.broadcast.c.a.a.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(3848);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelFailed(ExceptionResult exceptionResult) {
                        b.this.a(atomicBoolean, str, r2, true);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                    public final void checkChannelSuccess(boolean z) {
                        b.this.a(atomicBoolean, str, r2, z);
                    }
                });
            } else {
                a(atomicBoolean, str, r2, true);
            }
        }
    }

    public final void a(AtomicBoolean atomicBoolean, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
        atomicBoolean.set(z);
        if (z) {
            this.f7780a.fetchEffectList(str, false, iFetchEffectChannelListener);
            return;
        }
        atomicBoolean.set(false);
        this.f7780a.fetchEffectListFromCache(str, iFetchEffectChannelListener);
    }
}
