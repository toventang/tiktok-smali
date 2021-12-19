package com.bytedance.android.monitorV2.k;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.a.f;
import com.bytedance.android.monitorV2.a.g;
import com.bytedance.android.monitorV2.d.c;
import com.bytedance.android.monitorV2.d.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24013a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final a f24014b = a.f24008d;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, c> f24015c = new LinkedHashMap();

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f24016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.monitorV2.d.a f24017b;

        static {
            Covode.recordClassIndex(14154);
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final JSONObject c() {
            return null;
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final JSONObject d() {
            return null;
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final String h() {
            return "containerError";
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final String i() {
            return "";
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final f g() {
            return this.f24017b;
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final b e() {
            return new c();
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final f f() {
            return this.f24016a.a();
        }

        @Override // com.bytedance.android.monitorV2.a.g
        public final f b() {
            i iVar = new i();
            iVar.f23906e = this.f24016a.f24011c;
            iVar.f23904c = null;
            return iVar;
        }

        a(b bVar, com.bytedance.android.monitorV2.d.a aVar) {
            this.f24016a = bVar;
            this.f24017b = aVar;
        }
    }

    private d() {
    }

    private static boolean a(String str) {
        l.c(str, "");
        int hashCode = str.hashCode();
        return hashCode != -907987551 ? hashCode != -245775970 ? hashCode == 855478153 && str.equals("container_name") : str.equals("template_res_type") : str.equals("schema");
    }

    static {
        Covode.recordClassIndex(14153);
    }

    public static String a() {
        String a2 = com.bytedance.android.monitorV2.l.g.a();
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "generateIDForContainer [monitorId:" + a2 + ']');
        l.a((Object) a2, "");
        return a2;
    }

    public static void a(String str, c cVar) {
        l.c(str, "");
        l.c(cVar, "");
        f24015c.put(str, cVar);
    }

    public static void a(String str, e eVar) {
        l.c(str, "");
        l.c(eVar, "");
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "attach [monitorId:" + str + "][containerType:" + eVar.f24018a + ']');
        l.c(str, "");
        l.c(eVar, "");
        a.f24007c.put(str, eVar);
    }

    public static void a(String str, b bVar) {
        l.c(str, "");
        l.c(bVar, "");
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "reportContainerError [monitorId:" + str + "][errorCode:" + bVar.f24009a + "][errorMsg:" + bVar.f24010b + ']');
        e b2 = a.b(str);
        com.bytedance.android.monitorV2.d.a aVar = new com.bytedance.android.monitorV2.d.a(a.a(str));
        if (b2 == null || f24015c.get(b2.f24018a) == null) {
            HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
            l.a((Object) instance, "");
            com.bytedance.android.monitorV2.h.f hybridSettingManager = instance.getHybridSettingManager();
            l.a((Object) hybridSettingManager, "");
            if (com.bytedance.android.monitorV2.l.b.c("containerError", hybridSettingManager.b().a(""))) {
                com.bytedance.android.monitorV2.b.a(new a(bVar, aVar), new com.bytedance.android.monitorV2.webview.a());
                return;
            }
            return;
        }
        c cVar = f24015c.get(b2.f24018a);
        if (cVar == null) {
            l.a();
        }
        cVar.a(null, aVar, bVar);
    }

    public static void a(String str, String str2, long j2) {
        l.c(str, "");
        l.c(str2, "");
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "collectLong [monitorId:" + str + "][field:" + str2 + "][value:" + j2 + ']');
        a(str, str2, Long.valueOf(j2));
    }

    private static void a(String str, String str2, Object obj) {
        c cVar;
        if (a(str2)) {
            a.a(str, str2, obj);
        } else {
            a.b(str, str2, obj);
        }
        e b2 = a.b(str);
        if (b2 != null && (cVar = f24015c.get(b2.f24018a)) != null) {
            b2.a();
            cVar.a(str2, obj);
        }
    }

    public static void a(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "collectString [monitorId:" + str + "][field:" + str2 + "][value:" + str3 + ']');
        a(str, str2, (Object) str3);
    }
}
