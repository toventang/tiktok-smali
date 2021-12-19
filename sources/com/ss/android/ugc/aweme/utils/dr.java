package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.compliance.api.c.e;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.business.c.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import h.f.b.l;
import h.m.p;
import org.json.JSONObject;

final /* synthetic */ class dr implements e {

    /* renamed from: a  reason: collision with root package name */
    static final e f142836a = new dr();

    static {
        Covode.recordClassIndex(93446);
    }

    private dr() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.e
    public final void a(String str, InterfaceControlSettings interfaceControlSettings, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "init_settings");
        if (str == null || p.a(str)) {
            jSONObject.put("status", 1);
        }
        int i2 = 2;
        if (exc != null) {
            jSONObject.put("status", 2);
            jSONObject.put("reason", exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
        jSONObject.put(StringSet.type, String.valueOf(!l.a((Object) (interfaceControlSettings != null ? interfaceControlSettings.getUseNewControl() : null), (Object) false)));
        if (interfaceControlSettings != null) {
            jSONObject.put("version", interfaceControlSettings.getVersion());
            jSONObject.put("user_type", interfaceControlSettings.m219getUserType());
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            l.b(currentUser, "");
            String uid = currentUser.getUid();
            if (uid == null || p.a((CharSequence) uid)) {
                i2 = -1;
            } else if (in.d()) {
                i2 = 1;
            } else if (!in.f()) {
                i2 = 0;
            }
            jSONObject.put("current", i2);
            if (!l.a((Object) String.valueOf(i2), (Object) interfaceControlSettings.m219getUserType())) {
                jSONObject.put("status", 3);
            }
        }
        if (!jSONObject.has("status")) {
            jSONObject.put("status", 0);
        } else if (str != null && !p.a((CharSequence) str)) {
            jSONObject.put("content", str);
        }
        a.f76832g.add(jSONObject);
        dg.a().b(interfaceControlSettings);
        if (exc != null) {
            exc.getClass().getSimpleName();
            exc.getMessage();
        }
    }
}
