package com.ss.ttvideoengine.h;

import android.content.Context;
import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.g;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    final Context f152609a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f152610b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f152611c;

    /* renamed from: d  reason: collision with root package name */
    final ContentObserver f152612d = new ContentObserver() {
        /* class com.ss.ttvideoengine.h.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(101604);
        }

        public final void onChange(boolean z) {
            super.onChange(z);
            e.this.a();
        }
    };

    static {
        Covode.recordClassIndex(101603);
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("b", Float.valueOf((((float) g.b(this.f152609a)) * 1.0f) / 255.0f));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.f152610b.add(new JSONObject(hashMap).toString());
    }

    public e(Context context) {
        this.f152609a = context;
    }
}
