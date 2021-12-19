package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SaveConfigType;
import com.bytedance.ies.abmock.a.a;
import com.bytedance.ies.abmock.a.b;
import com.bytedance.ies.abmock.a.c;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static long f31848a;

    /* renamed from: b  reason: collision with root package name */
    static long f31849b;

    /* renamed from: c  reason: collision with root package name */
    static b f31850c;

    /* renamed from: d  reason: collision with root package name */
    static c f31851d;

    /* renamed from: e  reason: collision with root package name */
    static final q f31852e = new q();

    /* renamed from: f  reason: collision with root package name */
    public static List<a> f31853f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public static final g f31854g = new g();

    /* renamed from: h  reason: collision with root package name */
    private static final f.a.l.b<c> f31855h;

    /* renamed from: i  reason: collision with root package name */
    private static final List<c> f31856i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private static final List<Object> f31857j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private static List<Object> f31858k = new ArrayList();

    private g() {
    }

    static {
        Covode.recordClassIndex(18623);
        f.a.l.b<c> bVar = new f.a.l.b<>();
        l.a((Object) bVar, "");
        f31855h = bVar;
        try {
            bVar.a(AnonymousClass1.f31859a).d(AnonymousClass2.f31860a).d(5000, TimeUnit.MILLISECONDS).d(AnonymousClass3.f31861a).a(f.a.h.a.b(f.a.k.a.f158006c)).b(f.a.h.a.b(f.a.k.a.f158006c)).b(new f.a.g.b<String>() {
                /* class com.bytedance.ies.abmock.g.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(18627);
                }

                @Override // f.a.z
                public final void onComplete() {
                    g.f31851d = null;
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                    l.c(th, "");
                }

                @Override // f.a.z
                public final /* synthetic */ void onNext(Object obj) {
                    o oVar;
                    long j2;
                    r d2;
                    String str = (String) obj;
                    l.c(str, "");
                    try {
                        com.google.gson.l a2 = q.a(str);
                        l.a((Object) a2, "");
                        o f2 = a2.j().f("data");
                        if (f2 == null || (d2 = f2.d("settings_time")) == null) {
                            j2 = 0;
                        } else {
                            j2 = d2.f();
                        }
                        g.f31848a = j2;
                        com.bytedance.ies.abmock.datacenter.c.a.f31807a.b("lastSyncTimeStamp", g.f31848a);
                        if (!(f2 == null || (oVar = f2.f("settings")) == null)) {
                            try {
                                Set<String> keySet = oVar.f54898a.keySet();
                                l.a((Object) keySet, "");
                                ArrayList<String> arrayList = new ArrayList();
                                for (T t : keySet) {
                                    if (SaveConfigType.getConfigTypeMap().containsKey(t)) {
                                        arrayList.add(t);
                                    }
                                }
                                for (String str2 : arrayList) {
                                    SaveConfigType.ConfigType configType = (SaveConfigType.ConfigType) SaveConfigType.getConfigTypeMap().get(str2);
                                    if (configType != null) {
                                        int i2 = 1;
                                        switch (h.f31862a[configType.ordinal()]) {
                                            case 1:
                                                r d3 = oVar.d(str2);
                                                if (d3 == null) {
                                                    continue;
                                                } else {
                                                    boolean h2 = d3.f54900a instanceof Number ? !l.a((Object) d3.b(), (Object) 0) : d3.h();
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, h2);
                                                    b a3 = b.a();
                                                    l.a((Object) a3, "");
                                                    a3.f31794a.b(str2, h2);
                                                    SettingsManager a4 = SettingsManager.a();
                                                    l.a((Object) a4, "");
                                                    a4.getSettingsValueProvider().a(str2, h2);
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case 2:
                                                r d4 = oVar.d(str2);
                                                if (d4 == null) {
                                                    continue;
                                                } else {
                                                    if (!(d4.f54900a instanceof Boolean)) {
                                                        i2 = d4.g();
                                                    } else if (!d4.h()) {
                                                        i2 = 0;
                                                    }
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, i2);
                                                    b a5 = b.a();
                                                    l.a((Object) a5, "");
                                                    a5.f31794a.b(str2, i2);
                                                    SettingsManager a6 = SettingsManager.a();
                                                    l.a((Object) a6, "");
                                                    a6.getSettingsValueProvider().a(str2, i2);
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case 3:
                                                com.google.gson.l c2 = oVar.c(str2);
                                                if (c2 != null) {
                                                    long f3 = c2.f();
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, f3);
                                                    b a7 = b.a();
                                                    l.a((Object) a7, "");
                                                    a7.f31794a.b(str2, f3);
                                                    SettingsManager a8 = SettingsManager.a();
                                                    l.a((Object) a8, "");
                                                    a8.getSettingsValueProvider().a(str2, f3);
                                                } else {
                                                    continue;
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case 4:
                                                com.google.gson.l c3 = oVar.c(str2);
                                                if (c3 != null) {
                                                    float e2 = c3.e();
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, e2);
                                                    b a9 = b.a();
                                                    l.a((Object) a9, "");
                                                    a9.f31794a.b(str2, e2);
                                                    SettingsManager a10 = SettingsManager.a();
                                                    l.a((Object) a10, "");
                                                    a10.getSettingsValueProvider().a(str2, e2);
                                                } else {
                                                    continue;
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                                com.google.gson.l c4 = oVar.c(str2);
                                                if (c4 != null) {
                                                    double d5 = c4.d();
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, d5);
                                                    b a11 = b.a();
                                                    l.a((Object) a11, "");
                                                    a11.f31794a.b(str2, d5);
                                                    SettingsManager a12 = SettingsManager.a();
                                                    l.a((Object) a12, "");
                                                    a12.getSettingsValueProvider().a(str2, d5);
                                                } else {
                                                    continue;
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                                com.google.gson.l c5 = oVar.c(str2);
                                                if (c5 != null) {
                                                    String c6 = c5.c();
                                                    l.a((Object) c6, "");
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, c6);
                                                    b a13 = b.a();
                                                    l.a((Object) a13, "");
                                                    a13.f31794a.b(str2, c6);
                                                    SettingsManager a14 = SettingsManager.a();
                                                    l.a((Object) a14, "");
                                                    a14.getSettingsValueProvider().a(str2, c6);
                                                } else {
                                                    continue;
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                                com.google.gson.l c7 = oVar.c(str2);
                                                if (c7 != null) {
                                                    com.bytedance.ies.abmock.datacenter.c.a aVar = com.bytedance.ies.abmock.datacenter.c.a.f31807a;
                                                    l.a((Object) aVar, "");
                                                    com.bytedance.ies.abmock.datacenter.c.a.f31807a.a(str2, (String[]) aVar.a().a(c7, String[].class));
                                                    b a15 = b.a();
                                                    l.a((Object) a15, "");
                                                    a15.f31794a.a(str2, c7);
                                                    SettingsManager a16 = SettingsManager.a();
                                                    l.a((Object) a16, "");
                                                    a16.getSettingsValueProvider().b(str2, c7.toString());
                                                } else {
                                                    continue;
                                                }
                                                b.a().a(str2);
                                                e.a().a(str2);
                                        }
                                    }
                                    com.google.gson.l c8 = oVar.c(str2);
                                    if (c8 != null) {
                                        com.bytedance.ies.abmock.datacenter.c.a.f31807a.b(str2, c8.toString());
                                        b a17 = b.a();
                                        l.a((Object) a17, "");
                                        a17.f31794a.c(str2, c8.toString());
                                        SettingsManager a18 = SettingsManager.a();
                                        l.a((Object) a18, "");
                                        a18.getSettingsValueProvider().b(str2, c8.toString());
                                    }
                                    b.a().a(str2);
                                    e.a().a(str2);
                                }
                                Iterator<T> it = g.f31853f.iterator();
                                while (it.hasNext()) {
                                    it.next().a();
                                }
                            } catch (Exception e3) {
                                System.out.print(e3);
                            }
                        }
                    } catch (Exception unused) {
                        oVar = new o();
                    }
                    g.f31851d = null;
                }
            });
        } catch (Throwable unused) {
        }
    }
}
