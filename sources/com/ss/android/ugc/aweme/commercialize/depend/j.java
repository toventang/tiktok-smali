package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class j implements IAppLogDepend {
    static {
        Covode.recordClassIndex(45424);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final String getCategory(boolean z) {
        return z ? "event_v3" : "event_v1";
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final ExecutorService getLogThreadPool() {
        return r.a();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void appendCommonParams(StringBuilder sb, boolean z) {
        l.d(sb, "");
        AppLog.appendCommonParams(sb, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Bundle(String str, Bundle bundle) {
        l.d(str, "");
        r.a(str, bundle);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Json(String str, JSONObject jSONObject) {
        l.d(str, "");
        r.a(str, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Map(String str, Map<String, String> map) {
        l.d(str, "");
        r.a(str, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void putCommonParams(Map<String, String> map, boolean z) {
        l.d(map, "");
        q.a(map, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV1(Context context, String str, String str2, String str3, String str4, long j2, JSONObject jSONObject) {
        l.d(context, "");
        l.d(str, "");
        if (TextUtils.isEmpty(str2)) {
            r.a(str, str3, str4, j2, jSONObject);
        } else {
            r.a(str2, str, str3, str4, j2, jSONObject);
        }
    }
}
