package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.k;
import h.f.b.l;
import h.h;
import h.i;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final k f34095a = new k();

    /* renamed from: b  reason: collision with root package name */
    static Throwable f34096b;

    /* renamed from: c  reason: collision with root package name */
    static final h f34097c = i.a((h.f.a.a) c.f34103a);

    /* renamed from: d  reason: collision with root package name */
    public static final m f34098d = new m();

    /* renamed from: e  reason: collision with root package name */
    private static final h f34099e = i.a((h.f.a.a) a.f34101a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f34100f = i.a((h.f.a.a) b.f34102a);

    public static k a() {
        return (k) f34099e.getValue();
    }

    public static k b() {
        return (k) f34100f.getValue();
    }

    private m() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34101a = new a();

        static {
            Covode.recordClassIndex(20302);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return a();
        }

        private static k a() {
            try {
                return (k) com.bytedance.ies.abmock.b.a().a(true, "im_options_mix_link_opt", k.class);
            } catch (Throwable th) {
                m.f34096b = th;
                return null;
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34102a = new b();

        static {
            Covode.recordClassIndex(20303);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return com.bytedance.ies.im.core.h.a.b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34103a = new c();

        static {
            Covode.recordClassIndex(20304);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            k a2 = m.a();
            if (a2 != null) {
                return a2;
            }
            k b2 = m.b();
            if (b2 == null) {
                return m.f34095a;
            }
            return b2;
        }
    }

    static {
        Covode.recordClassIndex(20301);
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        String valueOf;
        l.d(str, "");
        com.bytedance.ies.im.core.api.a.b().b("mix_link_opt", "interceptTeaEvent:".concat(String.valueOf(str)));
        try {
            if (!(!l.a((Object) str, (Object) "im_link_mode_migrate"))) {
                d a2 = d.a();
                l.b(a2, "");
                k kVar = a2.b().ai;
                k b2 = com.bytedance.ies.im.core.h.a.b();
                int i2 = 0;
                if (f34096b != null) {
                    i2 = 100;
                } else if (a() == null) {
                    i2 = 101;
                } else {
                    k a3 = a();
                    if (a3 == null) {
                        l.b();
                    }
                    if (a3.enable != kVar.enable) {
                        i2 = 102;
                    } else if (b2 == null) {
                        i2 = 103;
                    } else if (b2.enable != kVar.enable) {
                        i2 = 104;
                    } else if (b() != null) {
                        k b3 = b();
                        if (b3 == null) {
                            l.b();
                        }
                        if (b3.enable != b2.enable) {
                            i2 = 105;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject.put("error_reason", String.valueOf(i2));
                    jSONObject.put("sdk_config", String.valueOf(kVar.enable));
                    String str4 = "-1";
                    if (b2 == null || (str2 = String.valueOf(b2.enable)) == null) {
                        str2 = str4;
                    }
                    jSONObject.put("cur_config", str2);
                    k b4 = b();
                    if (b4 == null || (str3 = String.valueOf(b4.enable)) == null) {
                        str3 = str4;
                    }
                    jSONObject.put("last_config", str3);
                    k a4 = a();
                    if (!(a4 == null || (valueOf = String.valueOf(a4.enable)) == null)) {
                        str4 = valueOf;
                    }
                    jSONObject.put("init_config", str4);
                    Throwable th = f34096b;
                    if (th != null) {
                        jSONObject.put("error_msg", com.bytedance.im.core.g.b.a(th));
                        jSONObject.put("error_stack", com.bytedance.im.core.g.b.b(th));
                    }
                }
                com.bytedance.ies.im.core.api.a.b().b("mix_link_opt", "interceptTeaEvent end, " + str + ':' + jSONObject);
            }
        } catch (Throwable th2) {
            com.bytedance.ies.im.core.api.a.b().a("mix_link_opt", th2);
        }
    }
}
