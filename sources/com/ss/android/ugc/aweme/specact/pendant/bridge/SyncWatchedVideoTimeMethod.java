package com.ss.android.ugc.aweme.specact.pendant.bridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import org.json.JSONObject;

public final class SyncWatchedVideoTimeMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(87719);
    }

    private SyncWatchedVideoTimeMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ SyncWatchedVideoTimeMethod() {
        this((a) null);
    }

    public SyncWatchedVideoTimeMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Long l2;
        Boolean bool;
        Boolean bool2 = null;
        if (jSONObject != null) {
            l2 = Long.valueOf(jSONObject.optLong("time"));
            bool = Boolean.valueOf(jSONObject.optBoolean("start"));
            bool2 = Boolean.valueOf(jSONObject.optBoolean("show_bubble"));
        } else {
            l2 = null;
            bool = null;
        }
        SpecActServiceImpl.i().a(l2, bool, bool2);
        if (aVar != null) {
            aVar.a("", 1, "");
        }
    }
}
