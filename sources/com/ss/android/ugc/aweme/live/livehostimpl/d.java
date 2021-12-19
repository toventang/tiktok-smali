package com.ss.android.ugc.aweme.live.livehostimpl;

import b.j;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.livehostimpl.a;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

final /* synthetic */ class d implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    private final a f108462a;

    /* renamed from: b  reason: collision with root package name */
    private final j f108463b;

    static {
        Covode.recordClassIndex(69505);
    }

    d(a aVar, j jVar) {
        this.f108462a = aVar;
        this.f108463b = jVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        a aVar = this.f108462a;
        j jVar = this.f108463b;
        IAVEffectService.ResourceFinder resourceFinder = (IAVEffectService.ResourceFinder) obj;
        a.AnonymousClass1 r0 = new ResourceFinder(resourceFinder) {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ IAVEffectService.ResourceFinder f108431a;

            static {
                Covode.recordClassIndex(69477);
            }

            @Override // com.bef.effectsdk.ResourceFinder
            public final long createNativeResourceFinder(long j2) {
                return this.f108431a.createNativeResourceFinder(j2);
            }

            @Override // com.bef.effectsdk.ResourceFinder
            public final void release(long j2) {
                this.f108431a.release(j2);
            }

            {
                this.f108431a = r2;
            }
        };
        if (resourceFinder != null) {
            jVar.a(r0);
        } else {
            jVar.b((Exception) new RuntimeException("Decompress failed"));
        }
    }
}
