package com.ss.ttvideoengine.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.b;
import com.ss.ttvideoengine.s.j;
import java.util.Iterator;
import org.json.JSONObject;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public Context f152561a;

    static {
        Covode.recordClassIndex(101588);
    }

    private a() {
    }

    /* renamed from: com.ss.ttvideoengine.h.a$a  reason: collision with other inner class name */
    public static class C4068a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f152563a = new a((byte) 0);

        static {
            Covode.recordClassIndex(101590);
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    static void a(final JSONObject jSONObject) {
        b.a(new Runnable() {
            /* class com.ss.ttvideoengine.h.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101589);
            }

            public final void run() {
                if (jSONObject != null) {
                    j.a("AppLogEngineUploader", "video statistics start");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (next != null) {
                                j.a("AppLogEngineUploader", "video statistics:" + next + ":" + jSONObject.get(next));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    j.a("AppLogEngineUploader", "video statistics end");
                }
            }
        });
    }

    @Override // com.ss.ttvideoengine.h.p
    public final void b(String str, JSONObject jSONObject) {
        b.a(new c(str, jSONObject));
    }

    @Override // com.ss.ttvideoengine.h.p
    public final void a(String str, JSONObject jSONObject) {
        b.a(new b(this, str, jSONObject));
    }
}
