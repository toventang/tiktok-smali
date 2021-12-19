package com.ss.android.ugc.aweme.shortvideo.publish;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final ak f129736a = new ak();

    private ak() {
    }

    static {
        Covode.recordClassIndex(85171);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f129737a;

        static {
            Covode.recordClassIndex(85172);
        }

        a(boolean z) {
            this.f129737a = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f129737a) {
                    str = "0";
                } else {
                    str = "1";
                }
                jSONObject.put("zipUrlIsNull", str);
                q.a("hash_tag_zip_url", 0, ar.a(jSONObject).a());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    public static void a(boolean z) {
        if (dh.a() != 0 && !g.a().A().a()) {
            i.b(new a(z), r.a());
        }
    }
}
