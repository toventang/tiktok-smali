package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.livesdk.utils.j;
import com.bytedance.android.livesdkapi.m.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class i implements b {
    static {
        Covode.recordClassIndex(13182);
    }

    @Override // com.bytedance.android.livesdkapi.m.b
    public final Map<String, String> a(Context context) {
        j jVar = new j();
        if (context == null) {
            return null;
        }
        jVar.f22323a = context;
        if (jVar.f22324b == null || jVar.f22324b.isEmpty()) {
            if (jVar.f22324b == null) {
                jVar.f22324b = new ArrayList<>();
            }
            jVar.f22324b.add(new j.c("webcast_language"));
            jVar.f22324b.add(new j.d("webcast_locale"));
            jVar.f22324b.add(new j.b("webcast_client_version"));
            jVar.f22324b.add(new j.e("webcast_sdk_version"));
        }
        HashMap hashMap = new HashMap();
        Iterator<j.a> it = jVar.f22324b.iterator();
        while (it.hasNext()) {
            it.next().a(hashMap);
        }
        return hashMap;
    }
}
