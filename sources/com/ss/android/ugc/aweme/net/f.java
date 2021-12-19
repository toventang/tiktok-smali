package com.ss.android.ugc.aweme.net;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a;
import com.bytedance.ttnet.b.b;
import com.ss.android.ugc.aweme.utils.in;
import java.util.regex.Matcher;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f112307a;

    static {
        Covode.recordClassIndex(72167);
    }

    f(String str) {
        this.f112307a = str;
    }

    public final void run() {
        String str = this.f112307a;
        String uid = in.c().getUid();
        String str2 = b.f44541b;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.toLowerCase();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("operation", "Monitor Event");
        arrayMap.put("uid", uid);
        arrayMap.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        arrayMap.put("region_source", b.f44542c);
        arrayMap.put("region_code", str2);
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = e.f112299d.matcher(str);
            if (matcher.find() && matcher.groupCount() >= 4) {
                arrayMap.put("url", matcher.group(1).replaceAll("\\\\", ""));
                arrayMap.put("logId", matcher.group(2));
                arrayMap.put("new_region_code", matcher.group(3));
                arrayMap.put("new_region_source", matcher.group(4));
            }
        }
        a.get().recordRegionEvent(arrayMap);
    }
}
