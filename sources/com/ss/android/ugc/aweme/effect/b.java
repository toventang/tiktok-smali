package com.ss.android.ugc.aweme.effect;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.android.ugc.tools.utils.k;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import h.f.b.l;

public final class b implements IEffectModelLoggerService {
    static {
        Covode.recordClassIndex(55880);
    }

    private static String a(ModelInfo modelInfo) {
        String str;
        StringBuilder append = new StringBuilder("model name:").append(modelInfo.getName()).append("; model version:").append(modelInfo.getVersion()).append("; model url:").append(modelInfo.getFile_url()).append("; model size:").append(modelInfo.getTotalSize()).append("k; model md5:");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            str = file_url.getUri();
        } else {
            str = null;
        }
        return append.append(str).toString();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void startDownloadEffectModelAlog(Effect effect, Object obj, String str) {
        l.d(obj, "");
        l.d(str, "");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!k.a(effect.getRequirements())) {
                for (String str2 : effect.getRequirements()) {
                    sb.append(str2).append(",");
                }
            }
            String str3 = a((ModelInfo) obj) + "; effect id:" + effect.getEffectId() + "; requirements" + sb.toString() + "; effect_sdk_version:" + str;
            bj.a("effect_platform::report>>>start_download_effect_model: ".concat(String.valueOf(str3)));
            r.a("start_download_effect_model", new com.ss.android.ugc.tools.f.b().a("extra_info", str3).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void reportModelListAlog(boolean z, String str, long j2, String str2) {
        l.d(str2, "");
        String str3 = "is_success:" + z + "; error_msg:" + str + "; duration:" + j2 + "ms; effect_sdk_version:" + str2;
        bj.a("effect_platform::report>>>fetch_algorithm_model_list: ".concat(String.valueOf(str3)));
        r.a("fetch_algorithm_model_list", new com.ss.android.ugc.tools.f.b().a("extra_info", str3).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void endDownloadEffectModelAlog(Effect effect, Object obj, long j2, int i2, Exception exc, String str) {
        l.d(obj, "");
        l.d(str, "");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!k.a(effect.getRequirements())) {
                for (String str2 : effect.getRequirements()) {
                    sb.append(str2).append(",");
                }
            }
            String str3 = a((ModelInfo) obj) + "; effect id:" + effect.getEffectId() + "; requirements" + sb.toString() + "; duration:" + j2 + "ms; effect_sdk_version:" + str;
            if (i2 == 0) {
                str3 = str3 + "; errorcode: 0";
            } else if (exc != null) {
                String stackTraceString = Log.getStackTraceString(exc);
                l.b(stackTraceString, "");
                str3 = str3 + "; errorcode:" + i2 + "; errormsg:" + stackTraceString;
            }
            bj.a("effect_platform::report>>>end_download_effect_model: ".concat(String.valueOf(str3)));
            r.a("end_download_effect_model", new com.ss.android.ugc.tools.f.b().a("extra_info", str3).f149193a);
        }
    }
}
