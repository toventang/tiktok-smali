package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.t;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.b;
import h.f.b.l;
import h.p;
import h.v;
import org.json.JSONObject;

public final class UpdateSettingServiceImpl implements IUpdateSettingService {

    /* renamed from: a  reason: collision with root package name */
    private p<String, ? extends JSONObject> f122008a;

    static {
        Covode.recordClassIndex(79981);
    }

    public static IUpdateSettingService b() {
        MethodCollector.i(6183);
        Object a2 = b.a(IUpdateSettingService.class, false);
        if (a2 != null) {
            IUpdateSettingService iUpdateSettingService = (IUpdateSettingService) a2;
            MethodCollector.o(6183);
            return iUpdateSettingService;
        }
        if (b.dK == null) {
            synchronized (IUpdateSettingService.class) {
                try {
                    if (b.dK == null) {
                        b.dK = new UpdateSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6183);
                    throw th;
                }
            }
        }
        UpdateSettingServiceImpl updateSettingServiceImpl = (UpdateSettingServiceImpl) b.dK;
        MethodCollector.o(6183);
        return updateSettingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final f a() {
        p<String, ? extends JSONObject> pVar = this.f122008a;
        if (pVar != null) {
            String first = pVar.getFirst();
            boolean z = false;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            if (l.a((Object) first, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID()) && pVar.getSecond() != null) {
                z = true;
            }
            if (!z) {
                pVar = null;
            }
            if (pVar != null) {
                try {
                    return (f) dg.a(((JSONObject) pVar.getSecond()).toString(), f.class);
                } catch (t e2) {
                    a.a((Throwable) e2);
                }
            }
        }
        this.f122008a = null;
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (currentUserID != null && !h.m.p.a((CharSequence) currentUserID)) {
                this.f122008a = v.a(currentUserID, jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void a(String str, int i2) {
        String str2;
        p<String, ? extends JSONObject> pVar;
        JSONObject jSONObject;
        if (this.f122008a != null) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            p<String, ? extends JSONObject> pVar2 = this.f122008a;
            if (pVar2 != null) {
                str2 = pVar2.getFirst();
            } else {
                str2 = null;
            }
            if (l.a((Object) currentUserID, (Object) str2) && (pVar = this.f122008a) != null && (jSONObject = (JSONObject) pVar.getSecond()) != null) {
                jSONObject.putOpt(str, Integer.valueOf(i2));
            }
        }
    }
}
