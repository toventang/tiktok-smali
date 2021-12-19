package com.ss.android.ugc.aweme.report;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f120590a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120591b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120592c;

    /* renamed from: d  reason: collision with root package name */
    private final String f120593d;

    static {
        Covode.recordClassIndex(78515);
    }

    e(long[] jArr, String str, String str2, String str3) {
        this.f120590a = jArr;
        this.f120591b = str;
        this.f120592c = str2;
        this.f120593d = str3;
    }

    public final void run() {
        long[] jArr = this.f120590a;
        String str = this.f120591b;
        String str2 = this.f120592c;
        String str3 = this.f120593d;
        JSONObject jSONObject = new JSONObject();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            try {
                jSONObject.put(c.values()[i2].getType(), jArr[i2]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        jSONObject.put("ui_scene", str);
        jSONObject.put("current_video", str2);
        jSONObject.put("next_video", str3);
        a.a("feed_scroll_time", jSONObject);
    }
}
