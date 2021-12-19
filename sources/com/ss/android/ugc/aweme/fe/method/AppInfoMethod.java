package com.ss.android.ugc.aweme.fe.method;

import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.a.d;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class AppInfoMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91024a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57246);
    }

    private AppInfoMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57247);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ AppInfoMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public AppInfoMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            str = jSONObject.optString("permissionGroup");
        } else {
            str = null;
        }
        for (T t : d.a(str).entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        ContentResolver contentResolver = com.bytedance.ies.ugc.appcontext.d.a().getContentResolver();
        if (contentResolver != null) {
            if (TextUtils.equals("time_12_24", "android_id")) {
                if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.c.a.f107190a)) {
                    com.ss.android.ugc.aweme.lancet.c.a.f107190a = Settings.System.getString(contentResolver, "time_12_24");
                }
                str2 = com.ss.android.ugc.aweme.lancet.c.a.f107190a;
            } else {
                str2 = Settings.System.getString(contentResolver, "time_12_24");
            }
        } else if (DateFormat.is24HourFormat(com.bytedance.ies.ugc.appcontext.d.a())) {
            str2 = "24";
        } else {
            str2 = "12";
        }
        jSONObject2.put("time_system", str2);
        jSONObject2.put("code", 1);
        if (aVar != null) {
            aVar.a(jSONObject2);
        }
    }
}
