package com.ss.android.ugc.aweme.inferenceengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ml.c;
import com.ss.android.ml.f;
import com.ss.android.ml.i;
import com.ss.android.ml.j;
import com.ss.android.ml.k;
import com.ss.android.ml.t;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.ml.a.d;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.concurrent.ExecutorService;

public class InferenceEngineServiceImpl implements IInferenceEngineService {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f104500a = new c.a() {
        /* class com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(66920);
        }

        @Override // com.ss.android.ml.c.a
        public final f a() {
            return new a();
        }
    };

    static {
        Covode.recordClassIndex(66919);
    }

    @Override // com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService
    public final void a(Context context) {
        if (d.f104507a) {
            System.currentTimeMillis();
        }
        t.f59923a = d.f104507a;
        c.a aVar = f104500a;
        c.f59849a = true;
        c.f59850b = aVar;
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        String absolutePath = d.f107195c.getAbsolutePath();
        j.a aVar2 = new j.a();
        aVar2.f59865a = absolutePath;
        aVar2.f59866b = b.f104505a;
        aVar2.f59867c = new j.b() {
            /* class com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(66922);
            }

            @Override // com.ss.android.ml.j.b
            public final <T> T a(String str, Type type) {
                return (T) new com.google.gson.f().a(new a(new StringReader(str)), type);
            }
        };
        aVar2.f59868d = c.f104506a;
        aVar2.f59869e = new j.c() {
            /* class com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.AnonymousClass2 */

            static {
                Covode.recordClassIndex(66921);
            }

            @Override // com.ss.android.ml.j.c
            public final ExecutorService a() {
                return d.a.f110303a;
            }
        };
        aVar2.f59870f = new d();
        j jVar = new j(aVar2);
        if (t.f59923a) {
            new Throwable("not crash, only for debug!!");
        }
        i a2 = i.a();
        if (!i.f59854a) {
            i.f59854a = true;
            a2.f59856b = jVar;
        }
        com.ss.android.ml.d.f59853a = MLDataCenterService.instance().getFeatureStaticGetter();
        k.f59873a = new k.a() {
            /* class com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl.AnonymousClass4 */

            static {
                Covode.recordClassIndex(66923);
            }

            @Override // com.ss.android.ml.k.a
            public final void a(String str, String str2, Throwable th) {
                if (th == null) {
                    com.ss.android.ugc.aweme.framework.a.a.b(str, str2);
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.b(str, str2 + " erMsg:" + th.getMessage());
                }
            }
        };
        if (d.f104507a) {
            System.currentTimeMillis();
        }
    }

    static final /* synthetic */ boolean a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
