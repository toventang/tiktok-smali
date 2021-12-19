package com.bytedance.apm.c.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f24756b;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.apm.o.a<JSONObject> f24757a = new com.bytedance.apm.o.a<>();

    static {
        Covode.recordClassIndex(14524);
    }

    private a() {
    }

    public static a a() {
        if (f24756b == null) {
            synchronized (a.class) {
                if (f24756b == null) {
                    f24756b = new a();
                }
            }
        }
        return f24756b;
    }
}
