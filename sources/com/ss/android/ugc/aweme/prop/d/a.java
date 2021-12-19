package com.ss.android.ugc.aweme.prop.d;

import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.model.h;
import com.ss.android.ugc.aweme.utils.in;

public final class a extends c<b<h>, com.ss.android.ugc.aweme.prop.view.a> {

    /* renamed from: a  reason: collision with root package name */
    public IAVEffectService.EffectPlatformLoader f118293a;

    static {
        Covode.recordClassIndex(76817);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            ((com.ss.android.ugc.aweme.prop.view.a) this.f76397i).a((h) this.f76396h.mData);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((com.ss.android.ugc.aweme.prop.view.a) this.f76397i).a(exc);
        }
    }

    public a(IAVEffectService.EffectPlatformLoader effectPlatformLoader, final boolean z) {
        this.f118293a = effectPlatformLoader;
        a(new b<h>() {
            /* class com.ss.android.ugc.aweme.prop.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(76818);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                WeakHandler weakHandler = this.mHandler;
                String str = (String) objArr[0];
                ((Integer) objArr[1]).intValue();
                boolean z = z;
                if (!in.d()) {
                    com.bytedance.ies.watcher.c.b("sd_start_activity_to_request_net_duration");
                    if (z) {
                        n.f68155a.a(weakHandler, new b(str), 0);
                    } else {
                        n.f68155a.a(weakHandler, new c(str), 0);
                    }
                }
                return true;
            }
        });
    }
}
