package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import com.google.gson.l;
import com.google.gson.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class f extends e.a {

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal<com.bytedance.android.e.a.a.f> f12109a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private a f12110b;

    static {
        Covode.recordClassIndex(6629);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0 A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(java.lang.Class r14, java.lang.Class[] r15, java.lang.String r16, java.lang.reflect.Type r17, java.lang.annotation.Annotation[] r18, com.bytedance.retrofit2.q r19, com.bytedance.retrofit2.mime.TypedInput r20) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.network.f.a(java.lang.Class, java.lang.Class[], java.lang.String, java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.q, com.bytedance.retrofit2.mime.TypedInput):java.lang.Object");
    }

    f(a aVar) {
        this.f12110b = aVar;
    }

    private static RequestError a(com.bytedance.android.live.network.response.a.a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f12149b;
        requestError.prompts = aVar.f12150c;
        requestError.alert = aVar.f12151d;
        return requestError;
    }

    private static void a(Extra extra, com.bytedance.android.live.network.response.a.a aVar) {
        extra.now = aVar.f12152e;
    }

    private static <T extends Extra> T a(com.bytedance.android.live.network.response.a.a aVar, Class<T> cls) {
        if (TextUtils.isEmpty(aVar.f12153f)) {
            return null;
        }
        return (T) ((Extra) e.a.f9628b.a(aVar.f12153f, (Class) cls));
    }

    private static boolean a(Class<?> cls, com.bytedance.android.e.a.a.f fVar) {
        if (cls != null && cls != Void.class) {
            return true;
        }
        long a2 = fVar.a();
        while (fVar.b() != -1) {
            g.c(fVar);
        }
        fVar.a(a2);
        return false;
    }

    private com.bytedance.retrofit2.e<TypedInput, ?> b(Type type, Annotation[] annotationArr, q qVar) {
        return this.f12110b.a(type, annotationArr, qVar);
    }

    private static c a(Class cls, com.bytedance.android.e.a.a.f fVar, com.bytedance.android.live.network.response.a.a aVar) {
        c cVar = new c();
        cVar.f12144a = aVar.f12148a;
        Extra extra = new Extra();
        a(extra, aVar);
        cVar.f12146c = extra;
        cVar.f12145b = new ArrayList();
        if (aVar.f12148a == 0) {
            long a2 = fVar.a();
            while (true) {
                int b2 = fVar.b();
                if (b2 == -1) {
                    break;
                } else if (b2 != 1) {
                    g.c(fVar);
                } else if (a(cls, fVar)) {
                    cVar.f12145b.add(h.a().a(cls).a(fVar));
                }
            }
            fVar.a(a2);
        } else {
            cVar.f12147d = a(aVar);
        }
        return cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Class[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.retrofit2.e.a
    public final com.bytedance.retrofit2.e<TypedInput, ?> a(Type type, Annotation[] annotationArr, q qVar) {
        if (!(type instanceof ParameterizedType)) {
            return b(type, annotationArr, qVar);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return b(type, annotationArr, qVar);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        int i2 = 0;
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                return b(type, annotationArr, qVar);
            }
            clsArr[0] = actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                return b(type, annotationArr, qVar);
            }
            clsArr[1] = actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            return b(type, annotationArr, qVar);
        }
        Class cls = (Class) rawType;
        if (cls != d.class && cls != c.class && cls != b.class && cls != com.bytedance.android.live.network.response.a.class) {
            return b(type, annotationArr, qVar);
        }
        String str = null;
        int length = annotationArr.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Annotation annotation = annotationArr[i2];
            if (annotation instanceof h) {
                str = ((h) annotation).a();
                break;
            } else if (annotation instanceof t) {
                str = ((t) annotation).a();
                break;
            } else {
                i2++;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "/";
        }
        return new g(this, cls, clsArr, str, type, annotationArr, qVar);
    }

    @Override // com.bytedance.retrofit2.e.a
    public final com.bytedance.retrofit2.e<?, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, q qVar) {
        return this.f12110b.a(type, annotationArr, annotationArr2, qVar);
    }

    private static b a(Class cls, Class cls2, com.bytedance.android.e.a.a.f fVar, com.bytedance.android.live.network.response.a.a aVar) {
        b bVar = new b();
        bVar.statusCode = aVar.f12148a;
        if (aVar.f12148a == 0) {
            long a2 = fVar.a();
            while (true) {
                int b2 = fVar.b();
                if (b2 == -1) {
                    break;
                } else if (b2 != 1) {
                    if (b2 != 2) {
                        g.c(fVar);
                    } else {
                        bVar.extra = (R) ((Extra) h.a().a(cls2).a(fVar));
                        a(bVar.extra, aVar);
                    }
                } else if (a(cls, fVar)) {
                    bVar.data = (T) h.a().a(cls).a(fVar);
                } else {
                    bVar.data = (T) new Object();
                }
            }
            fVar.a(a2);
        } else {
            bVar.error = a(aVar);
            bVar.extra = (R) a(aVar, cls2);
        }
        return bVar;
    }

    private static com.bytedance.android.live.network.response.a b(Class cls, Class cls2, com.bytedance.android.e.a.a.f fVar, com.bytedance.android.live.network.response.a.a aVar) {
        com.bytedance.android.live.network.response.a aVar2 = new com.bytedance.android.live.network.response.a();
        aVar2.f12144a = aVar.f12148a;
        if (aVar.f12148a == 0) {
            aVar2.f12145b = new ArrayList();
            long a2 = fVar.a();
            while (true) {
                int b2 = fVar.b();
                if (b2 == -1) {
                    break;
                } else if (b2 != 1) {
                    if (b2 != 2) {
                        g.c(fVar);
                    } else {
                        aVar2.f12146c = (R) ((Extra) h.a().a(cls2).a(fVar));
                        a(aVar2.f12146c, aVar);
                    }
                } else if (a(cls, fVar)) {
                    aVar2.f12145b.add((T) h.a().a(cls).a(fVar));
                }
            }
            fVar.a(a2);
        } else {
            aVar2.f12147d = a(aVar);
            aVar2.f12146c = (R) a(aVar, cls2);
        }
        return aVar2;
    }

    private <T, S> Object a(int i2, T t, S s, String str, Type type, Annotation[] annotationArr, q qVar) {
        MethodCollector.i(9965);
        o oVar = new o();
        oVar.a("status_code", Integer.valueOf(i2));
        oVar.a("data", i.a().a((Object) t));
        oVar.a("extra", i.a().a((Object) s));
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new String(h.a().a(LiveMtPbRequestsSetting.INSTANCE.getValue().getPassThroughApi() + str, new ArrayList(), "application/json", i.a().a((l) oVar).getBytes()).a().f23268e).getBytes(Charset.forName("UTF-8")));
        Object a2 = b(type, annotationArr, qVar).a(new TypedInput() {
            /* class com.bytedance.android.live.network.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6630);
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final String mimeType() {
                return "application/json";
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final InputStream in() {
                return byteArrayInputStream;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final long length() {
                return (long) byteArrayInputStream.available();
            }
        });
        MethodCollector.o(9965);
        return a2;
    }
}
