package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.a;
import com.bytedance.helios.api.b.n;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.o;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.i;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class BPEATask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final String f107742a = "BPEA";

    /* renamed from: b  reason: collision with root package name */
    public String f107743b = "";

    static {
        Covode.recordClassIndex(68935);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class b implements com.bytedance.bpea.core.a.a {
        static {
            Covode.recordClassIndex(68938);
        }

        b() {
        }

        @Override // com.bytedance.bpea.core.a.a
        public final com.bytedance.bpea.core.a.c b(f fVar) {
            l.d(fVar, "");
            return com.bytedance.bpea.core.a.c.WARNING;
        }

        @Override // com.bytedance.bpea.core.a.a
        public final boolean a(f fVar) {
            String[] strArr;
            String[] strArr2;
            String[] strArr3;
            String[] strArr4;
            l.d(fVar, "");
            String[] strArr5 = fVar.f26601b;
            if ((strArr5 == null || !i.a(strArr5, "clipboard")) && (((strArr = fVar.f26601b) == null || !i.a(strArr, "latitudeAndLongitude")) && (((strArr2 = fVar.f26601b) == null || !i.a(strArr2, "locationSDK")) && (((strArr3 = fVar.f26601b) == null || !i.a(strArr3, "video")) && ((strArr4 = fVar.f26601b) == null || !i.a(strArr4, DataType.AUDIO)))))) {
                return false;
            }
            return true;
        }
    }

    public static final class c implements com.bytedance.bpea.core.a.a {
        static {
            Covode.recordClassIndex(68939);
        }

        c() {
        }

        @Override // com.bytedance.bpea.core.a.a
        public final com.bytedance.bpea.core.a.c b(f fVar) {
            l.d(fVar, "");
            return com.bytedance.bpea.core.a.c.WARNING;
        }

        @Override // com.bytedance.bpea.core.a.a
        public final boolean a(f fVar) {
            String[] strArr;
            String[] strArr2;
            String[] strArr3;
            String[] strArr4;
            l.d(fVar, "");
            String[] strArr5 = fVar.f26601b;
            if ((strArr5 == null || !i.a(strArr5, "clipboard")) && (((strArr = fVar.f26601b) == null || !i.a(strArr, "latitudeAndLongitude")) && (((strArr2 = fVar.f26601b) == null || !i.a(strArr2, "locationSDK")) && (((strArr3 = fVar.f26601b) == null || !i.a(strArr3, "video")) && ((strArr4 = fVar.f26601b) == null || !i.a(strArr4, DataType.AUDIO)))))) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class a implements com.bytedance.ies.abmock.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BPEATask f107744a;

        static {
            Covode.recordClassIndex(68936);
        }

        a(BPEATask bPEATask) {
            this.f107744a = bPEATask;
        }

        @Override // com.bytedance.ies.abmock.i
        public final void a() {
            b.i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.legoImp.task.BPEATask.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f107745a;

                static {
                    Covode.recordClassIndex(68937);
                }

                {
                    this.f107745a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Thread currentThread = Thread.currentThread();
                    l.b(currentThread, "");
                    currentThread.getName();
                    BPEATask.c();
                    return z.f158842a;
                }
            }, b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static void c() {
        try {
            o a2 = com.ss.android.ugc.aweme.settings.c.a();
            if (a2 != null) {
                com.google.gson.l c2 = a2.c("maxAppVersion");
                l.b(c2, "");
                String c3 = c2.c();
                l.b(c3, "");
                if (com.bytedance.ies.ugc.appcontext.d.d() <= ((long) Integer.parseInt(c3))) {
                    String oVar = a2.toString();
                    l.b(oVar, "");
                    com.bytedance.bpea.core.a.f.a(oVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final class d implements com.bytedance.bpea.core.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BPEATask f107746a;

        static {
            Covode.recordClassIndex(68940);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(BPEATask bPEATask) {
            this.f107746a = bPEATask;
        }

        @Override // com.bytedance.bpea.core.c.e
        public final void onEvent(com.bytedance.bpea.core.c.a aVar) {
            String str;
            l.d(aVar, "");
            if (aVar.f26635e == com.bytedance.bpea.core.c.f.END_CHECK) {
                StringBuilder sb = new StringBuilder("bpea_end_check_cert|");
                com.bytedance.bpea.basics.d dVar = aVar.f26633c;
                String str2 = null;
                if (dVar != null) {
                    str = dVar.certToken();
                } else {
                    str = null;
                }
                StringBuilder append = sb.append(str).append('|');
                f fVar = aVar.f26634d;
                if (fVar != null) {
                    str2 = fVar.f26600a;
                }
                ALog.i(this.f107746a.f107742a, append.append(str2).append("|timeAnchor:").append(aVar.f26631a).toString());
            }
            if (aVar.f26635e == com.bytedance.bpea.core.c.f.END_CHECK || aVar.f26635e == com.bytedance.bpea.core.c.f.END_LEGAL_CHECK || aVar.f26635e == com.bytedance.bpea.core.c.f.END_CONDITION_CHECK) {
                this.f107746a.a(aVar, aVar.f26635e.toString());
            }
            if (aVar.f26635e != com.bytedance.bpea.core.c.f.END_CHECK) {
                return;
            }
            if (!a.C0641a.a().isEnabled()) {
                a.C0641a.a().isEnabled();
            } else {
                this.f107746a.a(aVar, "ORIGIN_COMPARE");
            }
        }
    }

    public static final class e implements com.bytedance.bpea.core.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BPEATask f107747a;

        static {
            Covode.recordClassIndex(68941);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(BPEATask bPEATask) {
            this.f107747a = bPEATask;
        }

        @Override // com.bytedance.bpea.core.c.e
        public final void onEvent(com.bytedance.bpea.core.c.a aVar) {
            Integer num;
            com.bytedance.bpea.basics.d dVar;
            String certToken;
            String str;
            int i2;
            String str2;
            String str3;
            String str4;
            l.d(aVar, "");
            if (aVar.f26635e == com.bytedance.bpea.core.c.f.END_CHECK) {
                f fVar = aVar.f26634d;
                JSONObject jSONObject = null;
                if (fVar != null) {
                    num = fVar.f26602c;
                } else {
                    num = null;
                }
                int type = com.bytedance.bpea.basics.i.BPEA_ENTRY.getType();
                if (num != null && num.intValue() == type && (dVar = aVar.f26633c) != null && (certToken = dVar.certToken()) != null && certToken.equals("bpea-742")) {
                    new StringBuilder("auto locate :").append(aVar.f26633c).append(' ').append(aVar.f26634d);
                    if (a.C0641a.a().isEnabled()) {
                        f fVar2 = aVar.f26634d;
                        if (fVar2 == null || (str4 = fVar2.f26600a) == null || !str4.equals("location_getLastKnownLocation")) {
                            f fVar3 = aVar.f26634d;
                            if (fVar3 == null || (str3 = fVar3.f26600a) == null || !str3.equals("location_requestLocationUpdates")) {
                                f fVar4 = aVar.f26634d;
                                if (fVar4 == null || (str2 = fVar4.f26600a) == null || !str2.equals("location_requestSingleUpdate")) {
                                    f fVar5 = aVar.f26634d;
                                    if (fVar5 != null && (str = fVar5.f26600a) != null && str.equals("location_getCurrentLocation")) {
                                        i2 = 200004;
                                    } else {
                                        return;
                                    }
                                } else {
                                    i2 = 200002;
                                }
                            } else {
                                i2 = 200001;
                            }
                        } else {
                            i2 = 200000;
                        }
                        long j2 = aVar.f26631a.f26610a.f26613a;
                        Thread currentThread = Thread.currentThread();
                        l.b(currentThread, "");
                        String name = currentThread.getName();
                        l.b(name, "");
                        n a2 = new com.bytedance.helios.sdk.d.d((Object) null, (Object[]) null, i2, j2, false, (String) null, (String) null, name, 128).a(new Throwable());
                        Map<String, Object> map = a2.n;
                        com.bytedance.bpea.basics.d dVar2 = aVar.f26633c;
                        if (dVar2 != null) {
                            jSONObject = dVar2.toJSON();
                        }
                        map.put("certificate", jSONObject);
                        com.bytedance.helios.api.b.o.a(a2, false);
                        ALog.i("BPEA_Helios", "report >>>> " + a2 + ",eventTime=" + aVar.f26631a.f26610a.f26613a);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.bytedance.bpea.basics.l lVar = new com.bytedance.bpea.basics.l();
        String a2 = com.bytedance.apm.q.n.a();
        if (a2 == null) {
            a2 = "";
        }
        this.f107743b = a2;
        com.bytedance.bpea.core.a.a(new d(this));
        com.bytedance.bpea.core.a.a(new e(this));
        com.bytedance.bpea.core.a.a(com.bytedance.bpea.core.a.d.EMPTY_CERT, new b());
        com.bytedance.bpea.core.a.a(com.bytedance.bpea.core.a.d.CONTENT_ILLEGAL, new c());
        com.bytedance.bpea.basics.l lVar2 = new com.bytedance.bpea.basics.l();
        c();
        SettingsManager.a().a(new a(this));
        lVar2.a();
        lVar.a();
        a(((float) lVar.f26611b.a()) / 1000000.0f, ((float) lVar2.f26611b.a()) / 1000000.0f, "bpea_performance_init");
        a((float) lVar.f26612c.a(), (float) lVar2.f26612c.a(), "bpea_performance_init_thread");
    }

    public final void a(com.bytedance.bpea.core.c.a aVar, String str) {
        Integer num;
        String str2;
        JSONObject jSONObject;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject2 = new JSONObject();
        f fVar = aVar.f26634d;
        if (fVar != null) {
            num = fVar.f26602c;
        } else {
            num = null;
        }
        jSONObject2.put("entryCategory", num);
        jSONObject2.put("eventLevel", aVar.f26632b.getValue());
        f fVar2 = aVar.f26634d;
        if (fVar2 != null) {
            str2 = fVar2.f26600a;
        } else {
            str2 = null;
        }
        jSONObject2.put("entryToken", str2);
        jSONObject2.put("eventType", str);
        jSONObject2.put("processName", this.f107743b);
        jSONObject2.put("status", aVar.f26636f);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("costTime", Float.valueOf(((float) aVar.f26631a.f26611b.a()) / 1000000.0f));
        jSONObject3.put("threadCostTime", aVar.f26631a.f26612c.a());
        JSONObject jSONObject4 = new JSONObject();
        com.bytedance.bpea.basics.d dVar = aVar.f26633c;
        if (dVar != null) {
            jSONObject = dVar.toJSON();
        } else {
            jSONObject = null;
        }
        jSONObject4.put("cert", jSONObject);
        com.bytedance.bpea.basics.d dVar2 = aVar.f26633c;
        if (dVar2 != null) {
            str3 = dVar2.certToken();
        } else {
            str3 = null;
        }
        jSONObject4.put("certToken", str3);
        f fVar3 = aVar.f26634d;
        if (fVar3 != null) {
            num2 = fVar3.f26602c;
        } else {
            num2 = null;
        }
        jSONObject4.put("entryCategory", num2);
        f fVar4 = aVar.f26634d;
        if (fVar4 != null) {
            str4 = fVar4.f26600a;
        } else {
            str4 = null;
        }
        jSONObject4.put("entryToken", str4);
        jSONObject4.put("eventLevel", aVar.f26632b.getValue());
        jSONObject4.put("costTime", Float.valueOf(((float) aVar.f26631a.f26611b.a()) / 1000000.0f));
        jSONObject4.put("threadCostTime", aVar.f26631a.f26612c.a());
        jSONObject4.put("eventType", str);
        jSONObject4.put("processName", this.f107743b);
        jSONObject4.put("status", aVar.f26636f);
        jSONObject4.put("msg", aVar.f26637g);
        f fVar5 = aVar.f26634d;
        if (!(fVar5 == null || (str6 = fVar5.f26600a) == null)) {
            if (p.b(str6, "locationSDK", false)) {
                str5 = "bpea_event_locationSDK";
            } else if (p.b(str6, "LiveCore", false)) {
                str5 = "bpea_event_LiveCore";
            } else if (p.b(str6, "camera", false)) {
                str5 = "bpea_event_camera";
            } else if (p.b(str6, DataType.AUDIO, false)) {
                str5 = "bpea_event_microphone";
            } else if (p.b(str6, "media", false)) {
                str5 = "bpea_event_media";
            } else if (p.b(str6, "permission", false)) {
                str5 = "bpea_event_permission";
            } else if (p.b(str6, "clipboard", false)) {
                str5 = "bpea_event_clipboard";
            } else if (p.b(str6, "location", false)) {
                str5 = "bpea_event_location";
            }
            com.bytedance.apm.b.a(str5, jSONObject2, jSONObject3, jSONObject4);
        }
        str5 = "bpea_event";
        com.bytedance.apm.b.a(str5, jSONObject2, jSONObject3, jSONObject4);
    }

    private final void a(float f2, float f3, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("initCost", Float.valueOf(f2));
        jSONObject.put("loadConfigCost", Float.valueOf(f3));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("processName", this.f107743b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("initCost", Float.valueOf(f2));
        jSONObject3.put("loadConfigCost", Float.valueOf(f3));
        jSONObject3.put("processName", this.f107743b);
        com.bytedance.apm.b.a(str, jSONObject2, jSONObject, jSONObject3);
    }
}
