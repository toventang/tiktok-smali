package com.bytedance.android.live.b;

import android.net.Uri;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.v;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final h f7348a = i.a((h.f.a.a) a.f7349a);

    static final class a extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7349a = new a();

        static {
            Covode.recordClassIndex(3556);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new v<l>() {
                /* class com.bytedance.android.live.b.n.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3557);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.v
                public final /* synthetic */ l read(com.google.gson.c.a aVar) {
                    l read = com.google.gson.internal.bind.i.X.read(aVar);
                    h.f.b.l.b(read, "");
                    return read;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void write(c cVar, l lVar) {
                    h.f.b.l.d(cVar, "");
                    if (lVar == null || (lVar instanceof com.google.gson.n)) {
                        cVar.f();
                        return;
                    }
                    if (lVar instanceof r) {
                        r l2 = lVar.l();
                        h.f.b.l.b(l2, "");
                        if (l2.f54900a instanceof Number) {
                            long f2 = lVar.f();
                            if (f2 >= 2147483647L || f2 <= -2147483648L) {
                                cVar.b(lVar.c());
                                return;
                            }
                        }
                    }
                    if (lVar instanceof com.google.gson.i) {
                        cVar.b();
                        com.google.gson.i<l> k2 = lVar.k();
                        h.f.b.l.b(k2, "");
                        for (l lVar2 : k2) {
                            write(cVar, lVar2);
                        }
                        cVar.c();
                    } else if (lVar instanceof o) {
                        cVar.d();
                        Set<Map.Entry<String, l>> entrySet = lVar.j().f54898a.entrySet();
                        h.f.b.l.b(entrySet, "");
                        for (T t : entrySet) {
                            cVar.a((String) t.getKey());
                            write(cVar, (l) t.getValue());
                        }
                        cVar.e();
                    } else {
                        com.google.gson.internal.bind.i.X.write(cVar, lVar);
                    }
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(3555);
    }

    private static List<Object> a(com.google.gson.i iVar) {
        h.f.b.l.d(iVar, "");
        return new c(iVar);
    }

    public static final Map<String, Object> a(o oVar) {
        h.f.b.l.d(oVar, "");
        return new d(oVar);
    }

    public static final <T extends l> String a(T t) {
        h.f.b.l.d(t, "");
        StringWriter stringWriter = new StringWriter();
        c cVar = new c(stringWriter);
        cVar.f54684b = true;
        ((v) f7348a.getValue()).write(cVar, t);
        String stringWriter2 = stringWriter.toString();
        h.f.b.l.b(stringWriter2, "");
        return stringWriter2;
    }

    public static final Object b(l lVar) {
        if (lVar instanceof com.google.gson.n) {
            return null;
        }
        if (lVar instanceof o) {
            return a((o) lVar);
        }
        if (lVar instanceof com.google.gson.i) {
            return a((com.google.gson.i) lVar);
        }
        if (lVar instanceof r) {
            r rVar = (r) lVar;
            if (rVar.f54900a instanceof Number) {
                return rVar.b();
            }
            if (rVar.f54900a instanceof String) {
                return rVar.c();
            }
            if (rVar.f54900a instanceof Boolean) {
                return Boolean.valueOf(rVar.h());
            }
            throw new IllegalStateException("Unknown JsonPrimitive type: " + rVar.getClass().getCanonicalName());
        }
        throw new IllegalStateException("Unknown JsonElement type: " + lVar.getClass().getCanonicalName());
    }

    public static final int a(Uri uri, String str, String str2) {
        h.f.b.l.d(uri, "");
        h.f.b.l.d(str, "");
        if (str2 == null) {
            return 0;
        }
        if (p.c(str2, "rpx", false)) {
            return (int) ((Float.parseFloat(p.b(str2, (CharSequence) "rpx")) / 750.0f) * ((float) y.c()));
        }
        if (!p.c(str2, "%", false)) {
            return y.a(Float.parseFloat(str2));
        }
        float parseFloat = Float.parseFloat(p.b(str2, (CharSequence) "%")) / 100.0f;
        if (p.a((CharSequence) str, (CharSequence) "width", false)) {
            return (int) (((float) y.c()) * parseFloat);
        }
        if (p.a((CharSequence) str, (CharSequence) "height", false)) {
            return (int) (((float) y.b()) * parseFloat);
        }
        return (int) (((float) y.c()) * parseFloat);
    }
}
