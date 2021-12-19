package com.ss.android.ugc.aweme.ay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.lighten.a.j;
import com.bytedance.lighten.a.n;
import com.bytedance.lighten.a.s;
import com.facebook.net.c;
import com.ss.android.e.i;
import com.ss.android.ugc.aweme.ay.q;
import com.ss.android.ugc.aweme.ay.v;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import java.io.File;
import java.util.ArrayList;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private volatile s f67823a;

    static {
        Covode.recordClassIndex(41745);
    }

    @Override // com.bytedance.lighten.a.j
    public final Context b() {
        return d.a();
    }

    @Override // com.bytedance.lighten.a.j
    public final boolean c() {
        if (b.g()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lighten.a.j
    public final s a() {
        n nVar;
        long j2;
        MethodCollector.i(6609);
        if (this.f67823a == null) {
            synchronized (this) {
                try {
                    if (this.f67823a == null) {
                        if (Build.VERSION.SDK_INT == 18) {
                            nVar = q.a.f67838a;
                        } else {
                            nVar = v.a.f67854a;
                        }
                        File c2 = am.c();
                        long j3 = 10485760;
                        if (com.bytedance.u.d.a()) {
                            if (c2 != null) {
                                j2 = c2.getFreeSpace() / 8;
                                if (j2 <= 20971520) {
                                    if (j2 < 10485760) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(r.f67839e);
                                        c.f48950c = new c.b() {
                                            /* class com.ss.android.ugc.aweme.ay.m.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(41746);
                                            }

                                            @Override // com.facebook.net.c.b
                                            public final c.a a() {
                                                return new f();
                                            }
                                        };
                                        s.a aVar = new s.a(d.a());
                                        aVar.u = true;
                                        aVar.q = true;
                                        aVar.f39888j = Bitmap.Config.RGB_565;
                                        aVar.f39889k = 1;
                                        aVar.f39886h = 5;
                                        aVar.p = new i();
                                        aVar.f39881c = c2;
                                        aVar.f39882d = j3;
                                        aVar.f39880b = nVar;
                                        aVar.n = true;
                                        aVar.f39887i = new h();
                                        aVar.v = arrayList;
                                        aVar.f39890l = true;
                                        aVar.f39891m = false;
                                        aVar.o = n.f67825a;
                                        aVar.r = true;
                                        aVar.s = true;
                                        aVar.t = a.f67767a;
                                        if (Build.VERSION.SDK_INT >= 28 && e.f67794a) {
                                            aVar.x = true;
                                        }
                                        this.f67823a = new s(aVar, (byte) 0);
                                    }
                                }
                            } else {
                                j2 = 20971520;
                            }
                            j3 = j2;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(r.f67839e);
                            c.f48950c = new c.b() {
                                /* class com.ss.android.ugc.aweme.ay.m.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(41746);
                                }

                                @Override // com.facebook.net.c.b
                                public final c.a a() {
                                    return new f();
                                }
                            };
                            s.a aVar2 = new s.a(d.a());
                            aVar2.u = true;
                            aVar2.q = true;
                            aVar2.f39888j = Bitmap.Config.RGB_565;
                            aVar2.f39889k = 1;
                            aVar2.f39886h = 5;
                            aVar2.p = new i();
                            aVar2.f39881c = c2;
                            aVar2.f39882d = j3;
                            aVar2.f39880b = nVar;
                            aVar2.n = true;
                            aVar2.f39887i = new h();
                            aVar2.v = arrayList2;
                            aVar2.f39890l = true;
                            aVar2.f39891m = false;
                            aVar2.o = n.f67825a;
                            aVar2.r = true;
                            aVar2.s = true;
                            aVar2.t = a.f67767a;
                            aVar2.x = true;
                            this.f67823a = new s(aVar2, (byte) 0);
                        }
                        j3 = 20971520;
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(r.f67839e);
                        c.f48950c = new c.b() {
                            /* class com.ss.android.ugc.aweme.ay.m.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(41746);
                            }

                            @Override // com.facebook.net.c.b
                            public final c.a a() {
                                return new f();
                            }
                        };
                        s.a aVar22 = new s.a(d.a());
                        aVar22.u = true;
                        aVar22.q = true;
                        aVar22.f39888j = Bitmap.Config.RGB_565;
                        aVar22.f39889k = 1;
                        aVar22.f39886h = 5;
                        aVar22.p = new i();
                        aVar22.f39881c = c2;
                        aVar22.f39882d = j3;
                        aVar22.f39880b = nVar;
                        aVar22.n = true;
                        aVar22.f39887i = new h();
                        aVar22.v = arrayList22;
                        aVar22.f39890l = true;
                        aVar22.f39891m = false;
                        aVar22.o = n.f67825a;
                        aVar22.r = true;
                        aVar22.s = true;
                        aVar22.t = a.f67767a;
                        aVar22.x = true;
                        this.f67823a = new s(aVar22, (byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6609);
                    throw th;
                }
            }
        }
        s sVar = this.f67823a;
        MethodCollector.o(6609);
        return sVar;
    }
}
