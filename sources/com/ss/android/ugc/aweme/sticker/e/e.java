package com.ss.android.ugc.aweme.sticker.e;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.effectplatform.b;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.repository.a.ab;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.repository.internals.b.f;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements f {
    static {
        Covode.recordClassIndex(88128);
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    private static void a(ab abVar, Effect effect) {
        if (abVar != null && abVar.f135464c != 0) {
            b.a(effect, abVar.f135464c);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.a.k
    public final /* synthetic */ void a(ac acVar, Long l2, ab abVar) {
        long j2;
        ac acVar2 = acVar;
        ab abVar2 = abVar;
        l.d(acVar2, "");
        Effect effect = acVar2.f135465a;
        a(abVar2, effect);
        if (b()) {
            boolean k2 = g.k(effect);
            com.ss.android.ugc.aweme.port.in.g.a().I().a("sticker_download_error_rate", 0, new ar().a(StringSet.type, String.valueOf(k2 ? 1 : 0)).a("url", com.ss.android.ugc.aweme.port.in.g.a().G().b(effect.getFileUrl())).a("zip_model", (Integer) 0).a("duration", String.valueOf(l2)).a());
            ap I = com.ss.android.ugc.aweme.port.in.g.a().I();
            ar a2 = new ar().a("duration", l2);
            boolean z = true;
            if (!k2) {
                z = false;
            }
            I.a("type_av_sticker_download_time", a2.a("isAr", Boolean.valueOf(z)).a());
            com.ss.android.ugc.aweme.port.in.g.a().I().a("ttlive_download_sticker_all", 0, new ar().a("duration", l2).a(), a(null));
            long j3 = 0;
            if (abVar2 != null) {
                j2 = abVar2.f135464c;
            } else {
                j2 = 0;
            }
            if (l2 != null) {
                j3 = l2.longValue();
            }
            b.a(effect, j2, j3, 0, null);
        }
        d.a("tool_performance_resource_download", new com.ss.android.ugc.tools.f.b().a("resource_type", "effect").a("duration", l2).a("status", 0).a("resource_id", effect.getEffectId()).a("is_auto_download", acVar2.f135466b).f149193a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Exception, java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tools.h.a.k
    public final /* synthetic */ void a(ac acVar, Long l2, Exception exc, ab abVar) {
        long j2;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        StackTraceElement[] stackTraceElementArr;
        String str4;
        Integer num3;
        Integer num4;
        ac acVar2 = acVar;
        ab abVar2 = abVar;
        l.d(acVar2, "");
        Effect effect = acVar2.f135465a;
        a(abVar2, effect);
        if (b()) {
            if (abVar2 != null) {
                str3 = abVar2.f135463b;
                Integer num5 = abVar2.f135462a;
                stackTraceElementArr = "";
                if (num5 != null) {
                    stackTraceElementArr = "";
                    if (num5.intValue() == -1) {
                        stackTraceElementArr = exc != null ? exc.getStackTrace() : null;
                    }
                }
            } else {
                str3 = null;
                stackTraceElementArr = "";
            }
            String a2 = l.a(str3, (Object) stackTraceElementArr);
            ap I = com.ss.android.ugc.aweme.port.in.g.a().I();
            ar a3 = new ar().a("sticker_id", effect.getEffectId());
            if (abVar2 == null || (num4 = abVar2.f135462a) == null) {
                str4 = null;
            } else {
                str4 = String.valueOf(num4.intValue());
            }
            I.a("sticker_download_error_rate", 1, a3.a("errorCode", str4).a("errorMsg", a2).a("zip_model", (Integer) 0).a("url", com.ss.android.ugc.aweme.port.in.g.a().G().b(effect.getFileUrl())).a());
            ar arVar = new ar();
            if (abVar2 != null) {
                num3 = abVar2.f135462a;
            } else {
                num3 = null;
            }
            JSONObject a4 = arVar.a("error_code", num3).a("error_msg", a2).a();
            com.ss.android.ugc.aweme.port.in.g.a().I().a("ttlive_download_sticker_all", 1, null, a(a4));
            com.ss.android.ugc.aweme.port.in.g.a().I().a("ttlive_download_sticker_error", 1, a4);
        }
        Effect effect2 = acVar2.f135465a;
        long j3 = 0;
        if (abVar2 != null) {
            j2 = abVar2.f135464c;
        } else {
            j2 = 0;
        }
        if (l2 != null) {
            j3 = l2.longValue();
        }
        ExceptionResult exceptionResult = new ExceptionResult(exc);
        if (abVar2 != null) {
            str = abVar2.f135463b;
        } else {
            str = null;
        }
        exceptionResult.setMsg(str);
        if (!(abVar2 == null || (num2 = abVar2.f135462a) == null)) {
            exceptionResult.setErrorCode(num2.intValue());
        }
        b.a(effect2, j2, j3, -1, exceptionResult);
        com.ss.android.ugc.tools.f.b a5 = new com.ss.android.ugc.tools.f.b().a("resource_type", "effect").a("duration", l2).a("status", 1).a("resource_id", effect.getEffectId()).a("error_domain", EffectPlatformFactory.a().getHosts().get(0));
        if (abVar2 != null) {
            num = abVar2.f135462a;
        } else {
            num = null;
        }
        com.ss.android.ugc.tools.f.b a6 = a5.a("error_code", num);
        if (abVar2 == null || (str2 = abVar2.f135463b) == null) {
            str2 = "empty_error_msg";
        }
        d.a("tool_performance_resource_download", a6.a("error_msg", str2).a("is_auto_download", acVar2.f135466b).f149193a);
    }
}
