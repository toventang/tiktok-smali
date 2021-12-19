package com.ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.e;
import com.ss.android.ugc.aweme.crossplatform.c.b;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends a {
    static {
        Covode.recordClassIndex(94742);
    }

    @Override // com.bytedance.geckox.f.a
    public final void a() {
        super.a();
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a();
        }
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(UpdatePackage updatePackage) {
        super.a(updatePackage);
        updatePackage.getChannel();
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a(updatePackage.getChannel(), updatePackage.isPatchUpdate());
        }
        b a2 = b.C1827b.a();
        String channel = updatePackage.getChannel();
        boolean isPatchUpdate = updatePackage.isPatchUpdate();
        l.d(channel, "");
        if (a2.b(channel)) {
            a2.a(channel).f78689a = System.currentTimeMillis();
            com.ss.android.ugc.aweme.crossplatform.c.d a3 = d.a.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", channel);
            jSONObject.put("is_patch", String.valueOf(isPatchUpdate));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cold_start_to_download_start_interval", System.currentTimeMillis() - a2.a());
            a3.a((com.ss.android.ugc.aweme.crossplatform.c.d) "hybrid_monitor_gecko_event", "on_start_download", (String) jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.geckox.f.a
    public final void b(UpdatePackage updatePackage) {
        super.b(updatePackage);
        updatePackage.getChannel();
        updatePackage.getVersion();
        com.bytedance.apm.b.a("aweme_service_gecko_activate_rate", 0, a(updatePackage.getVersion(), (Throwable) null));
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            e a2 = f2.a();
            updatePackage.getVersion();
            a2.a(updatePackage.getChannel());
        }
        TextUtils.equals(updatePackage.getChannel(), "rn_base_android");
        b a3 = b.C1827b.a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        l.d(channel, "");
        a3.b(channel, true, null);
    }

    @Override // com.bytedance.geckox.f.a
    public final void c(UpdatePackage updatePackage) {
        super.c(updatePackage);
        updatePackage.getChannel();
        updatePackage.getVersion();
        com.bytedance.apm.b.a("aweme_service_gecko_download_rate", 0, a(updatePackage.getVersion(), (Throwable) null));
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength());
        }
        b a2 = b.C1827b.a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        l.d(channel, "");
        a2.a(channel, true, null);
    }

    private static JSONObject a(long j2, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (j2 != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(j2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (th != null) {
            jSONObject.put("errorDesc", th.toString());
        }
        return jSONObject;
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(UpdatePackage updatePackage, Throwable th) {
        super.a(updatePackage, th);
        updatePackage.getChannel();
        Log.getStackTraceString(th);
        com.bytedance.apm.b.a("aweme_service_gecko_activate_rate", 1, a(updatePackage.getVersion(), th));
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            e a2 = f2.a();
            updatePackage.getVersion();
            a2.a(updatePackage.getChannel(), th);
        }
        b a3 = b.C1827b.a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        l.d(channel, "");
        l.d(th, "");
        a3.b(channel, false, th);
    }

    @Override // com.bytedance.geckox.f.a
    public final void b(UpdatePackage updatePackage, Throwable th) {
        super.b(updatePackage, th);
        updatePackage.getChannel();
        Log.getStackTraceString(th);
        com.bytedance.apm.b.a("aweme_service_gecko_download_rate", 1, a(updatePackage.getVersion(), th));
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 != null) {
            f2.a().a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength(), th);
        }
        b a2 = b.C1827b.a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        l.d(channel, "");
        l.d(th, "");
        a2.a(channel, false, th);
    }

    @Override // com.bytedance.geckox.f.a
    public final void a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        super.a(map, th);
        new StringBuilder("onCheckServerVersionFail: requestMap:").append(map).append(",Exception:").append(Log.getStackTraceString(th));
        com.bytedance.apm.b.a("aweme_service_gecko_check_update_rate", 1, a(-1, th));
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                if (f2 != null) {
                    f2.a().a((List<? extends Pair<String, Long>>) entry.getValue(), false);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.f.a
    public void a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        super.a(map, map2);
        new StringBuilder("onCheckServerVersionSuccess: requestMap:").append(map).append(",responseMap:").append(map2);
        com.bytedance.apm.b.a("aweme_service_gecko_check_update_rate", 0, a(-1, (Throwable) null));
        if (!(map2 == null || map2.isEmpty())) {
            for (Map.Entry<String, List<UpdatePackage>> entry : map2.entrySet()) {
                List<UpdatePackage> value = entry.getValue();
                if (!com.ss.android.ugc.aweme.base.utils.d.a(value)) {
                    ArrayList arrayList = new ArrayList();
                    for (UpdatePackage updatePackage : value) {
                        arrayList.add(new Pair(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion())));
                    }
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
                    if (f2 != null) {
                        f2.a().a((List<? extends Pair<String, Long>>) arrayList, true);
                    }
                }
            }
        }
    }
}
