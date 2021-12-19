package com.bytedance.android.livesdk.livebuild;

import android.content.Context;
import com.airbnb.lottie.a;
import com.airbnb.lottie.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class c {
    static {
        Covode.recordClassIndex(10476);
    }

    public abstract a fromJson(Context context, String str, n nVar);

    public abstract a fromJson(Context context, JSONObject jSONObject, n nVar);

    public static void load() {
        AnonymousClass1 r1 = new b<c>() {
            /* class com.bytedance.android.livesdk.livebuild.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10477);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.android.livesdk.livebuild.b
            public final /* synthetic */ c a() {
                return b();
            }

            private static c b() {
                try {
                    return (c) Class.forName("com.bytedance.android.livesdk.livebuild.Lottie261DiffManager").newInstance();
                } catch (Throwable unused) {
                    return null;
                }
            }
        };
        if (a.f18688a == null) {
            a.f18688a = new HashMap();
        }
        a.f18688a.put(c.class, r1);
    }
}
