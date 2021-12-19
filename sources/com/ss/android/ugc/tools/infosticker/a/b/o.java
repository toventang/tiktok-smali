package com.ss.android.ugc.tools.infosticker.a.b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.m;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.h.a.k;
import h.f.b.l;

final class o implements k<Effect, m> {
    static {
        Covode.recordClassIndex(98449);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.a.k
    public final /* synthetic */ void a(Effect effect, Long l2, m mVar) {
        Effect effect2 = effect;
        String str = "";
        l.d(effect2, str);
        ap I = g.a().I();
        ar arVar = new ar();
        String b2 = g.a().G().b(effect2.getFileUrl());
        if (b2 == null) {
            b2 = str;
        }
        ar a2 = arVar.a("url", b2).a("duration", String.valueOf(l2));
        String effectId = effect2.getEffectId();
        if (effectId == null) {
            effectId = str;
        }
        ar a3 = a2.a("effect_id", effectId);
        String name = effect2.getName();
        if (name != null) {
            str = name;
        }
        I.a("info_sticker_download_error_rate", 0, a3.a("effect_name", str).a("effect_type", Integer.valueOf(effect2.getEffectType())).a());
        d.a("tool_performance_resource_download", new b().a("resource_type", m.a("info_effect")).a("duration", l2).a("status", 0).a("resource_id", effect2.getEffectId()).a("is_auto_download", false).f149193a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Exception, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.a.k
    public final /* synthetic */ void a(Effect effect, Long l2, Exception exc, m mVar) {
        Integer num;
        String str;
        String str2;
        Effect effect2 = effect;
        m mVar2 = mVar;
        String str3 = "";
        l.d(effect2, str3);
        ap I = g.a().I();
        ar arVar = new ar();
        String effectId = effect2.getEffectId();
        if (effectId == null) {
            effectId = str3;
        }
        ar a2 = arVar.a("effect_id", effectId);
        String name = effect2.getName();
        if (name == null) {
            name = str3;
        }
        ar a3 = a2.a("effect_name", name).a("effect_type", Integer.valueOf(effect2.getEffectType()));
        String b2 = g.a().G().b(effect2.getFileUrl());
        if (b2 != null) {
            str3 = b2;
        }
        ar a4 = a3.a("url", str3).a("exception", Log.getStackTraceString(exc));
        Integer num2 = null;
        if (mVar2 != null) {
            num = mVar2.f149480a;
        } else {
            num = null;
        }
        ar a5 = a4.a("errorCode", String.valueOf(num));
        if (mVar2 != null) {
            str = mVar2.f149481b;
        } else {
            str = null;
        }
        I.a("info_sticker_download_error_rate", 1, a5.a("errorMsg", String.valueOf(str)).a());
        b a6 = new b().a("resource_type", m.a("info_effect")).a("duration", l2).a("status", 1).a("resource_id", effect2.getEffectId()).a("error_domain", EffectPlatformFactory.a().getHosts().get(0));
        if (mVar2 != null) {
            num2 = mVar2.f149480a;
        }
        b a7 = a6.a("error_code", String.valueOf(num2));
        if (mVar2 == null || (str2 = mVar2.f149481b) == null) {
            str2 = "empty_error_msg";
        }
        d.a("tool_performance_resource_download", a7.a("error_msg", str2).a("is_auto_download", false).f149193a);
    }
}
