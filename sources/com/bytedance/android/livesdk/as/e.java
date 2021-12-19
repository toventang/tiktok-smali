package com.bytedance.android.livesdk.as;

import android.text.TextUtils;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.a.a;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.sdk.msg.b.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Type f14073a;

    static {
        Covode.recordClassIndex(7805);
    }

    public e(Type type) {
        this.f14073a = type;
    }

    private static <T> T a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static RequestError a(a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f12149b;
        requestError.prompts = aVar.f12150c;
        requestError.alert = aVar.f12151d;
        return requestError;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Class[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.msg.b.h
    public final Object a(byte[] bArr) {
        Object obj;
        MethodCollector.i(8696);
        Type type = this.f14073a;
        Object obj2 = null;
        if (!(type instanceof ParameterizedType)) {
            MethodCollector.o(8696);
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            MethodCollector.o(8696);
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                MethodCollector.o(8696);
                return null;
            }
            clsArr[0] = actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                MethodCollector.o(8696);
                return null;
            }
            clsArr[1] = actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            MethodCollector.o(8696);
            return null;
        }
        if (rawType == d.class || rawType == c.class || rawType == b.class || rawType == com.bytedance.android.live.network.response.a.class) {
            f fVar = new f();
            fVar.a(com.bytedance.android.e.a.a.d.a(new ByteArrayInputStream(bArr)));
            try {
                com.bytedance.android.live.network.response.a.b a2 = com.bytedance.android.live.network.response.a.b.a(fVar);
                if (a2.f12155b != null) {
                    fVar.a(com.bytedance.android.e.a.a.d.a(a2.f12155b));
                }
                if (a2.f12155b == null) {
                    fVar = null;
                }
                if (rawType == d.class) {
                    obj = a(clsArr[0], fVar, a2.f12154a);
                } else {
                    if (rawType == c.class) {
                        obj2 = b(clsArr[0], fVar, a2.f12154a);
                    } else if (rawType == b.class) {
                        obj = a(clsArr[0], clsArr[1], fVar, a2.f12154a);
                    } else {
                        obj2 = b(clsArr[0], clsArr[1], fVar, a2.f12154a);
                    }
                    MethodCollector.o(8696);
                    return obj2;
                }
                if (obj != null) {
                    MethodCollector.o(8696);
                    return obj;
                }
                MethodCollector.o(8696);
                return obj2;
            } catch (IOException unused) {
                MethodCollector.o(8696);
                return null;
            } catch (Exception unused2) {
                MethodCollector.o(8696);
                return null;
            }
        } else {
            MethodCollector.o(8696);
            return null;
        }
    }

    private static void a(Extra extra, a aVar) {
        extra.now = aVar.f12152e;
    }

    private static <T extends Extra> T a(a aVar, Class<T> cls) {
        if (TextUtils.isEmpty(aVar.f12153f)) {
            return null;
        }
        return (T) ((Extra) e.a.f9628b.a(aVar.f12153f, (Class) cls));
    }

    private static d a(Class cls, f fVar, a aVar) {
        d dVar = new d();
        dVar.statusCode = aVar.f12148a;
        Extra extra = new Extra();
        a(extra, aVar);
        dVar.extra = extra;
        if (aVar.f12148a != 0) {
            dVar.error = a(aVar);
        } else if (fVar != null) {
            long a2 = fVar.a();
            while (true) {
                int b2 = fVar.b();
                if (b2 == -1) {
                    break;
                } else if (b2 == 1) {
                    dVar.data = com.bytedance.android.live.network.h.a().a(cls).a(fVar);
                } else {
                    g.c(fVar);
                }
            }
            fVar.a(a2);
            if (dVar.data == null) {
                dVar.data = a(cls);
            }
        } else {
            dVar.data = a(cls);
        }
        return dVar;
    }

    private static c b(Class cls, f fVar, a aVar) {
        c cVar = new c();
        cVar.f12144a = aVar.f12148a;
        Extra extra = new Extra();
        a(extra, aVar);
        cVar.f12146c = extra;
        if (aVar.f12148a == 0) {
            cVar.f12145b = new ArrayList();
            if (fVar != null) {
                long a2 = fVar.a();
                while (true) {
                    int b2 = fVar.b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        cVar.f12145b.add(com.bytedance.android.live.network.h.a().a(cls).a(fVar));
                    } else {
                        g.c(fVar);
                    }
                }
                fVar.a(a2);
            }
        } else {
            cVar.f12147d = a(aVar);
        }
        return cVar;
    }

    private static b a(Class cls, Class cls2, f fVar, a aVar) {
        b bVar = new b();
        bVar.statusCode = aVar.f12148a;
        if (aVar.f12148a != 0) {
            bVar.error = a(aVar);
            bVar.extra = (R) a(aVar, cls2);
        } else if (fVar != null) {
            long a2 = fVar.a();
            while (true) {
                int b2 = fVar.b();
                if (b2 == -1) {
                    break;
                } else if (b2 == 1) {
                    bVar.data = (T) com.bytedance.android.live.network.h.a().a(cls).a(fVar);
                } else if (b2 != 2) {
                    g.c(fVar);
                } else {
                    bVar.extra = (R) ((Extra) com.bytedance.android.live.network.h.a().a(cls2).a(fVar));
                    a(bVar.extra, aVar);
                }
            }
            fVar.a(a2);
            if (bVar.data == null) {
                bVar.data = (T) a(cls);
            }
            if (bVar.extra == null) {
                bVar.extra = (R) ((Extra) a(cls2));
            }
        } else {
            bVar.data = (T) a(cls);
            bVar.extra = (R) ((Extra) a(cls2));
        }
        return bVar;
    }

    private static com.bytedance.android.live.network.response.a b(Class cls, Class cls2, f fVar, a aVar) {
        com.bytedance.android.live.network.response.a aVar2 = new com.bytedance.android.live.network.response.a();
        aVar2.f12144a = aVar.f12148a;
        if (aVar.f12148a == 0) {
            aVar2.f12145b = new ArrayList();
            if (fVar != null) {
                long a2 = fVar.a();
                while (true) {
                    int b2 = fVar.b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        aVar2.f12145b.add((T) com.bytedance.android.live.network.h.a().a(cls).a(fVar));
                    } else if (b2 != 2) {
                        g.c(fVar);
                    } else {
                        aVar2.f12146c = (R) ((Extra) com.bytedance.android.live.network.h.a().a(cls2).a(fVar));
                        a(aVar2.f12146c, aVar);
                    }
                }
                fVar.a(a2);
                if (aVar2.f12146c == null) {
                    aVar2.f12146c = (R) ((Extra) a(cls2));
                }
            } else {
                aVar2.f12146c = (R) ((Extra) a(cls2));
            }
        } else {
            aVar2.f12147d = a(aVar);
            aVar2.f12146c = (R) a(aVar, cls2);
        }
        return aVar2;
    }
}
