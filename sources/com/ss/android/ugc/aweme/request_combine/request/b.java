package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import h.f.b.l;
import java.util.Map;

public abstract class b {
    static {
        Covode.recordClassIndex(78573);
    }

    public abstract String a();

    public Map<String, String> a(Context context) {
        l.d(context, "");
        return null;
    }

    public abstract void a(f.b bVar);

    public abstract boolean a(SettingCombineModel settingCombineModel);

    public abstract a b();
}
