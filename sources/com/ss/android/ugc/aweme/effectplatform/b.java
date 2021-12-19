package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.q;

public final class b {
    static {
        Covode.recordClassIndex(55988);
    }

    public static void a(Effect effect, long j2) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!k.a(effect.getRequirements())) {
                for (String str : effect.getRequirements()) {
                    sb.append(str).append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:").append(effect.getEffectId()).append("; effect url:").append(effect.getFileUrl()).append("; effect req:").append(sb.toString()).append("; total size:").append(j2 / 1024).append("k");
            q.a("report start download effect alog: ".concat(String.valueOf(sb2)));
            d.a("start_download_effect", new com.ss.android.ugc.tools.f.b().a("extra_info", sb2.toString()).f149193a);
        }
    }

    public static void a(Effect effect, long j2, long j3, int i2, ExceptionResult exceptionResult) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!k.a(effect.getRequirements())) {
                for (String str : effect.getRequirements()) {
                    sb.append(str).append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:").append(effect.getEffectId()).append("; effect url:").append(effect.getFileUrl()).append("; effect req:").append(sb.toString()).append("; total size:").append(j2 / 1024).append("k; duration:").append(j3).append("ms");
            if (i2 == 0) {
                sb2.append("; errorcode: 0");
            } else if (exceptionResult != null) {
                sb2.append("; errorcode:").append(exceptionResult.getErrorCode()).append("; errormsg:").append(exceptionResult.getMsg());
            }
            q.a("report effect download alog: ".concat(String.valueOf(sb2)));
            d.a("end_download_effect", new com.ss.android.ugc.tools.f.b().a("extra_info", sb2.toString()).f149193a);
        }
    }
}
