package com.ss.android.ugc.aweme.miniapp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a implements ICommonParams {

    /* renamed from: a  reason: collision with root package name */
    public String f109629a;

    /* renamed from: b  reason: collision with root package name */
    private Context f109630b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f109631c;

    static {
        Covode.recordClassIndex(70158);
    }

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        return this.f109629a;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final long getUserId() {
        try {
            return Long.parseLong(AppLog.getUserId());
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        if (b.b(this.f109630b)) {
            return AppLog.getServerDeviceId();
        }
        return d.a(this.f109630b, com.ss.android.deviceregister.a.a.f59402a, 0).getString("device_id", "");
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Object> getCommonParams() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        q.b(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(this.f109631c);
        if (!hashMap.containsKey("channel")) {
            hashMap.put("channel", com.ss.android.deviceregister.a.d.f59405a);
        }
        if (!hashMap.containsKey("release_build")) {
            hashMap.put("release_build", com.ss.android.deviceregister.a.d.f59410f);
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Integer> getPluginInfo() {
        try {
            HashMap hashMap = new HashMap();
            IPluginService d2 = AabPluginServiceImpl.d();
            if (d2 != null) {
                List<String> a2 = d2.a();
                if (!a2.isEmpty()) {
                    for (String str : a2) {
                        hashMap.put(str, 0);
                    }
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
