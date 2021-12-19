package com.bytedance.push.settings.storage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.h;

final class a implements e {
    static {
        Covode.recordClassIndex(25856);
    }

    @Override // com.bytedance.push.settings.storage.e
    public final String a() {
        return "_contains";
    }

    a() {
    }

    @Override // com.bytedance.push.settings.storage.e
    public final Bundle a(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_storage_key");
        String string2 = bundle.getString("_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("_result", h.f42313a.a(context, true, string).f(string2));
        return bundle2;
    }
}
