package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.utils.al;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.discover.ui.z;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.im.e;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.im.service.model.i;
import com.ss.android.ugc.aweme.setting.bq;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.c.a;
import com.ss.android.ugc.aweme.settingsrequest.c.b;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsRequestServiceImpl implements ISettingsRequestService {
    static {
        Covode.recordClassIndex(38409);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final int d() {
        return b.f123184a;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final int e() {
        return a.f123180a;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final int f() {
        return a.f123181b;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final boolean g() {
        return a.f123183d;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final boolean h() {
        if (a.f123182c == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final boolean c() {
        return com.bytedance.ies.abmock.b.a().a(true, "share_useNotifySingle", false);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final List<com.ss.android.ugc.aweme.setting.serverpush.a> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g.a.a());
        arrayList.add(bq.f122104a);
        arrayList.add(new e());
        return arrayList;
    }

    public static ISettingsRequestService i() {
        MethodCollector.i(2825);
        Object a2 = com.ss.android.ugc.b.a(ISettingsRequestService.class, false);
        if (a2 != null) {
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) a2;
            MethodCollector.o(2825);
            return iSettingsRequestService;
        }
        if (com.ss.android.ugc.b.u == null) {
            synchronized (ISettingsRequestService.class) {
                try {
                    if (com.ss.android.ugc.b.u == null) {
                        com.ss.android.ugc.b.u = new SettingsRequestServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2825);
                    throw th;
                }
            }
        }
        SettingsRequestServiceImpl settingsRequestServiceImpl = (SettingsRequestServiceImpl) com.ss.android.ugc.b.u;
        MethodCollector.o(2825);
        return settingsRequestServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final i b() {
        i a2 = i.a();
        a2.f103904a = SharePrefCache.inst().getOpenImLink();
        a2.f103905b = SharePrefCache.inst().getImUrlTemplate();
        a2.f103906c = SharePrefCache.inst().getMultiSelectLimit();
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(f fVar) {
        com.ss.android.ugc.aweme.settingsrequest.e.a.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(o oVar) {
        z.f82787a.a(oVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(Activity activity) {
        if (activity != null) {
            j a2 = j.a.a();
            Boolean a3 = s.a();
            l.b(a3, "");
            if (a3.booleanValue() && !a2.f78193a.c()) {
                j.a.a().a(activity);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(Context context) {
        if (!com.bytedance.ies.ugc.appcontext.f.f34637l) {
            if (com.ss.android.ugc.aweme.push.downgrade.e.a(d.a())) {
                com.ss.android.ugc.aweme.push.downgrade.b.f118877a = false;
                com.ss.android.ugc.aweme.push.downgrade.b.a();
            } else {
                com.ss.android.di.push.a.a().initPushAccountService(com.ss.android.ugc.aweme.account.b.g().isLogin());
            }
        }
        if (com.ss.android.common.util.f.a(context)) {
            Keva.getRepo("ab_iorap_repo", 0).storeBoolean("iorap_enable_prefetch", com.bytedance.ies.abmock.b.a().a(true, "iorap_enable_prefetch", false));
        }
        com.ss.android.ugc.aweme.lego.f.e().a(new ZstdDictUpdateTask()).a();
        UgCommonServiceImpl.j().c().a();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final JSONObject b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String[] split = Uri.decode(str).split(",");
        try {
            o oVar = new o();
            for (int i2 = 0; i2 < split.length; i2++) {
                com.ss.android.ugc.aweme.settingsrequest.b.a.a(oVar, split[i2], com.ss.android.ugc.aweme.settingsrequest.b.a.a(split[i2]));
            }
            return new JSONObject(oVar.toString());
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(com.ss.android.ugc.aweme.setting.model.d dVar) {
        if (dVar != null) {
            List<String> u = com.ss.android.ugc.aweme.setting.model.d.u();
            if (u != null && (!u.isEmpty())) {
                com.ss.android.ugc.aweme.commercialize.link.b.f74513a = u;
            }
            if (dVar != null) {
                al.f75578a = SettingsManager.a().a("ad_web_container", 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a aVar) {
        com.ss.android.ugc.aweme.settingsrequest.e.a.a(aVar, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0043 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.SettingsRequestServiceImpl.a(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final void a(Map<String, String> map) {
        if (map != null) {
            com.ss.android.ugc.aweme.settingsrequest.l.f123235c.putAll(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    public final i a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        return com.ss.android.ugc.aweme.im.a.a(editor, iESSettingsProxy);
    }
}
