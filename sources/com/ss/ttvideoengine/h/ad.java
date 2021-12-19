package com.ss.ttvideoengine.h;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

final class ad {

    /* renamed from: a  reason: collision with root package name */
    int f152598a;

    /* renamed from: b  reason: collision with root package name */
    int f152599b;

    /* renamed from: c  reason: collision with root package name */
    int f152600c;

    /* renamed from: d  reason: collision with root package name */
    int f152601d;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<String> f152602e = new ArrayList<>();

    static {
        Covode.recordClassIndex(101599);
    }

    public final ArrayList<String> a() {
        return new ArrayList<>(this.f152602e);
    }

    ad() {
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("w", Integer.valueOf(i2));
            hashMap.put("h", Integer.valueOf(i3));
            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
            try {
                this.f152602e.add(new JSONObject(hashMap).toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f152598a = 0;
            this.f152599b = 0;
        }
    }
}
