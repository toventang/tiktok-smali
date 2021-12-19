package com.ss.android.ugc.aweme.sticker.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.sticker.repository.a.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.b;

public final class d implements k {
    static {
        Covode.recordClassIndex(88127);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.k
    public final void a(Effect effect, long j2, int i2) {
        String str;
        b a2 = new b().a("resource_type", "effect").a("duration", j2).a("status", 0);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_resource_download_user_view", a2.a("resource_id", str).a("hit_cache", i2).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.k
    public final void a(Effect effect, long j2, int i2, Integer num) {
        String str;
        b a2 = new b().a("resource_type", "effect").a("duration", j2).a("status", 1);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_resource_download_user_view", a2.a("resource_id", str).a("error_domain", EffectPlatformFactory.a().getHosts().get(0)).a("error_code", num).a("hit_cache", i2).f149193a);
    }
}
