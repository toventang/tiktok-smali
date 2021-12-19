package com.ss.android.ugc.trill.setting.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.b;
import com.ss.android.ugc.aweme.net.i;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f150570a = (Api.f66569d + "/aweme/v1/notice/shield/");

    static {
        Covode.recordClassIndex(99010);
    }

    public static b<String> a(int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d("shield_type", String.valueOf(i2)));
        arrayList.add(new d("is_shield", String.valueOf(i3)));
        return new b<>(f150570a, i.POST, arrayList, String.class);
    }
}
