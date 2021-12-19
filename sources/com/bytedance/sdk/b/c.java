package com.bytedance.sdk.b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.b;
import com.bytedance.sdk.b.b.b;
import com.bytedance.sdk.b.c.a;
import com.bytedance.sdk.b.d;
import com.bytedance.sdk.b.d.a;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements b, d.b, d.c {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.sdk.b.e.a f43517a;

    /* renamed from: b  reason: collision with root package name */
    final a f43518b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f43519c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43520d;

    /* renamed from: e  reason: collision with root package name */
    int f43521e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.sdk.b.b.c f43522f;

    /* renamed from: g  reason: collision with root package name */
    public int f43523g;

    /* renamed from: h  reason: collision with root package name */
    public int f43524h;

    /* renamed from: i  reason: collision with root package name */
    boolean f43525i;

    /* renamed from: j  reason: collision with root package name */
    public b f43526j;

    /* renamed from: k  reason: collision with root package name */
    boolean f43527k;

    /* renamed from: l  reason: collision with root package name */
    Handler f43528l;

    /* renamed from: m  reason: collision with root package name */
    private d f43529m;
    private String n = "";

    static {
        Covode.recordClassIndex(26644);
    }

    private boolean g() {
        if (this.n.equals("oston_oi")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.b.b
    public final boolean a() {
        return this.f43525i;
    }

    public final void e() {
        this.f43527k = true;
        this.f43518b.sendEmptyMessage(2);
    }

    c() {
        com.bytedance.sdk.b.e.a a2 = com.bytedance.sdk.b.e.a.a();
        this.f43517a = a2;
        this.f43519c = a.c();
        this.f43518b = new a(this, (byte) 0);
        d();
        boolean z = a2.f43606a != null ? a2.f43606a.getBoolean("is_enable", true) : true;
        this.f43525i = z;
        if (!z) {
            a.b("service enable switch is off, ignore");
        }
    }

    @Override // com.bytedance.sdk.b.b
    public final void c() {
        d dVar;
        d dVar2 = this.f43529m;
        if (dVar2 != null && dVar2.f43543f && (dVar = this.f43529m) != null) {
            if (dVar.f43538a != null) {
                dVar.f43538a.unregisterReceiver(dVar.f43541d);
                dVar.f43538a.unregisterReceiver(dVar.f43545h);
            }
            if (dVar.f43540c != null) {
                dVar.f43540c.quit();
            }
            dVar.f43543f = false;
            dVar.f43541d = null;
            dVar.f43545h = null;
            this.f43529m = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        com.bytedance.sdk.b.b.c b2 = this.f43517a.b();
        this.f43522f = b2;
        if (b2 == null) {
            this.f43522f = new com.bytedance.sdk.b.b.c();
        }
        b c2 = this.f43517a.c();
        this.f43526j = c2;
        if (c2 == null) {
            this.f43526j = new b();
        }
    }

    public final void f() {
        if (this.f43524h < 3) {
            this.f43518b.removeMessages(2);
            this.f43524h++;
            this.f43518b.sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis((long) (this.f43524h * 2)));
            return;
        }
        a.c("get mobile data info fail continuously, stop polling");
        this.f43518b.removeMessages(2);
        this.f43524h = 0;
    }

    @Override // com.bytedance.sdk.b.b
    public final void b() {
        if (this.f43525i) {
            d dVar = this.f43529m;
            if (dVar == null || !dVar.f43543f) {
                a.a("freeMobileDataService start service");
                d dVar2 = new d();
                this.f43529m = dVar2;
                dVar2.f43542e = this;
                this.f43529m.f43546i = this;
                d dVar3 = this.f43529m;
                try {
                    if (!dVar3.f43543f && dVar3.f43538a != null) {
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        dVar3.f43541d = new d.a(dVar3, (byte) 0);
                        d.a(dVar3.f43538a, dVar3.f43541d, intentFilter);
                        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SIM_STATE_CHANGED");
                        intentFilter2.addAction("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
                        dVar3.f43545h = new d.C1052d(dVar3, (byte) 0);
                        d.a(dVar3.f43538a, dVar3.f43545h, intentFilter2);
                        dVar3.f43548k = new Handler(Looper.getMainLooper());
                        dVar3.f43540c.start();
                        dVar3.f43547j = new d.e(dVar3.f43540c.getLooper(), dVar3);
                        dVar3.f43547j.sendEmptyMessage(3);
                        dVar3.f43543f = true;
                    }
                } catch (Throwable th) {
                    a.d(th.getMessage());
                }
            } else {
                a.a("freeMobileDataService has already start");
            }
        }
    }

    @Override // com.bytedance.sdk.b.b
    public final void a(Handler handler) {
        this.f43528l = handler;
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final SoftReference<c> f43537a;

        static {
            Covode.recordClassIndex(26648);
        }

        private a(c cVar) {
            super(Looper.getMainLooper());
            this.f43537a = new SoftReference<>(cVar);
        }

        public final void handleMessage(Message message) {
            if (this.f43537a.get() != null) {
                c cVar = this.f43537a.get();
                if (message.what == 2) {
                    cVar.f43518b.removeMessages(2);
                    if (TextUtils.isEmpty(cVar.f43526j.f43506a)) {
                        com.bytedance.sdk.b.c.a.b("get mobile data info: free flow id is empty");
                    } else {
                        if (cVar.f43526j.a()) {
                            com.bytedance.sdk.b.c.a.b("get mobile data info: free flow id is expired");
                            cVar.a(com.bytedance.sdk.b.f.c.a(cVar.f43519c, false), com.bytedance.sdk.b.f.c.c(cVar.f43519c, false), false);
                        }
                        if (-1 == cVar.f43521e || (cVar.f43522f.f43508a && !com.bytedance.sdk.b.f.b.a(cVar.f43521e))) {
                            com.bytedance.sdk.b.c.a.b("get mobile data info: no network or free flow user without mobile network, stop polling");
                        } else {
                            com.bytedance.sdk.b.d.a aVar = a.C1051a.f43568a;
                            Context context = cVar.f43519c;
                            String str = cVar.f43526j.f43506a;
                            AnonymousClass3 r1 = new com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.c>() {
                                /* class com.bytedance.sdk.b.c.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(26647);
                                }

                                @Override // com.bytedance.sdk.b.d.b.a
                                public final void a(Exception exc) {
                                    com.bytedance.sdk.b.c.a.d("get mobile data info fail:" + exc.getMessage());
                                    com.bytedance.sdk.b.c.b.b(false, null, -1, exc.getMessage());
                                    c.this.f();
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.sdk.b.d.b.a
                                public final /* synthetic */ void a(com.bytedance.sdk.b.b.c cVar) {
                                    String str;
                                    com.bytedance.sdk.b.b.c cVar2 = cVar;
                                    if (cVar2 != null) {
                                        c.this.f43524h = 0;
                                        c.this.f43522f = cVar2;
                                        c cVar3 = c.this;
                                        if (cVar3.f43527k) {
                                            cVar3.f43527k = false;
                                            if (cVar3.f43528l != null) {
                                                cVar3.f43528l.sendEmptyMessage(cVar2.f43508a ? 1 : 0);
                                            }
                                        }
                                        com.bytedance.sdk.b.c.b.b(true, cVar2.f43510c, 0, null);
                                        if (cVar2.f43511d != null) {
                                            boolean z = cVar2.f43508a;
                                            String str2 = cVar2.f43511d.f43513b;
                                            String str3 = cVar2.f43511d.f43515d;
                                            String b2 = com.bytedance.sdk.b.f.c.b(c.this.f43519c, false);
                                            String a2 = com.bytedance.sdk.b.f.c.a(c.this.f43519c, false);
                                            JSONObject a3 = com.bytedance.sdk.b.c.b.a();
                                            try {
                                                a3.put("plan_id", str2);
                                                a3.put("start_date", str3);
                                                if (z) {
                                                    str = "1";
                                                } else {
                                                    str = "0";
                                                }
                                                a3.put("status", str);
                                                a3.put("network_carrier", b2);
                                                a3.put("network_mccmnc", a2);
                                            } catch (JSONException e2) {
                                                e2.printStackTrace();
                                            }
                                            com.bytedance.sdk.b.c.b.a("zero_rating_status", a3);
                                            return;
                                        }
                                        return;
                                    }
                                    com.bytedance.sdk.b.c.b.b(false, null, -2, "server data invalid");
                                    c.this.f();
                                }

                                @Override // com.bytedance.sdk.b.d.b.a
                                public final void a(int i2, String str) {
                                    com.bytedance.sdk.b.c.a.d("get mobile data info error, code:" + i2 + ", msg:" + str);
                                    com.bytedance.sdk.b.c.b.b(false, null, i2, str);
                                    c.this.f();
                                }
                            };
                            com.bytedance.sdk.b.d.a.a aVar2 = aVar.f43561a;
                            com.bytedance.sdk.b.f.c.a(context, false);
                            aVar2.a(str, r1);
                            a.j();
                            int i2 = a.f43481a.f43492i;
                            com.bytedance.sdk.b.c.a.a("start mobile data info polling, do next request in " + i2 + " seconds");
                            cVar.f43518b.sendEmptyMessageDelayed(2, (long) (i2 * 1000));
                        }
                    }
                }
                if (message.what == 1) {
                    cVar.f43518b.removeMessages(1);
                    Bundle data = message.getData();
                    cVar.c(data.getString("operator"), data.getInt("sim_subscription_id"));
                }
            }
        }

        /* synthetic */ a(c cVar, byte b2) {
            this(cVar);
        }
    }

    @Override // com.bytedance.sdk.b.d.b
    public final void a(int i2) {
        this.f43521e = i2;
        if (com.bytedance.sdk.b.f.b.a(i2)) {
            a(com.bytedance.sdk.b.f.c.a(this.f43519c, false), com.bytedance.sdk.b.f.c.c(this.f43519c, true), true);
        }
    }

    @Override // com.bytedance.sdk.b.d.b
    public final void b(int i2) {
        this.f43521e = i2;
        if (com.bytedance.sdk.b.f.b.a(i2) && this.f43525i) {
            a(com.bytedance.sdk.b.f.c.a(this.f43519c, false), com.bytedance.sdk.b.f.c.c(this.f43519c, false), true);
        }
    }

    private boolean a(String str) {
        Map<String, List<String>> map;
        com.bytedance.sdk.b.b.d i2 = a.i();
        if (!(i2 == null || (map = i2.f43516a) == null)) {
            for (String str2 : map.keySet()) {
                if (map.get(str2).contains(str)) {
                    this.n = str2;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.b.b
    public final void a(com.bytedance.sdk.b.d.b.a<com.bytedance.sdk.b.b.a> aVar) {
        com.bytedance.sdk.b.d.a aVar2 = a.C1051a.f43568a;
        Context context = this.f43519c;
        aVar2.f43561a.a(com.bytedance.sdk.b.f.c.a(context, false), com.bytedance.sdk.b.f.c.a(context), null, aVar, this.f43526j.f43506a);
    }

    @Override // com.bytedance.sdk.b.d.c
    public final void a(String str, int i2) {
        a(str, i2, false);
    }

    @Override // com.bytedance.sdk.b.d.c
    public final void b(String str, int i2) {
        if (this.f43525i) {
            com.bytedance.sdk.b.c.a.b("on sim card or sim operator change");
            a(str, i2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(final String str, final int i2) {
        if (!this.f43520d && TextUtils.equals(this.n, "oston_oi")) {
            this.f43520d = true;
            a.C1051a.f43568a.a(this.f43519c, new com.bytedance.sdk.b.d.b.a<b>() {
                /* class com.bytedance.sdk.b.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(26646);
                }

                @Override // com.bytedance.sdk.b.d.b.a
                public final void a(Exception exc) {
                    com.bytedance.sdk.b.c.a.d("get free flow id fail:" + exc.getMessage());
                    com.bytedance.sdk.b.c.b.a(false, null, -1, exc.getMessage());
                    c.this.f43520d = false;
                    c.this.d(str, i2);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.sdk.b.d.b.a
                public final /* synthetic */ void a(b bVar) {
                    b bVar2 = bVar;
                    String str = bVar2.f43506a;
                    if (!TextUtils.isEmpty(str)) {
                        com.bytedance.sdk.b.c.a.a("get free flow id success, id:".concat(String.valueOf(str)));
                        com.bytedance.sdk.b.c.b.a(true, str, 0, null);
                        c.this.f43523g = 0;
                        c.this.f43526j = bVar2;
                        c cVar = c.this;
                        String str2 = str;
                        int i2 = i2;
                        if (!TextUtils.isEmpty(str2)) {
                            cVar.f43517a.a("sim_operator", str2);
                        }
                        com.bytedance.sdk.b.e.a aVar = cVar.f43517a;
                        if (aVar.f43606a != null) {
                            aVar.f43606a.edit().putInt("key_sim_subscription_id", i2).apply();
                        }
                        c.this.f43520d = false;
                        c.this.e();
                        return;
                    }
                    com.bytedance.sdk.b.c.b.a(false, null, -2, "server data invalid");
                    c.this.f43520d = false;
                    c.this.d(str, i2);
                }

                @Override // com.bytedance.sdk.b.d.b.a
                public final void a(int i2, String str) {
                    com.bytedance.sdk.b.c.a.d("get free flow id error, code:" + i2 + ", msg:" + str);
                    com.bytedance.sdk.b.c.b.a(false, null, i2, str);
                    c.this.f43520d = false;
                    c.this.d(str, i2);
                }
            }, g());
        }
    }

    public final void d(String str, int i2) {
        if (this.f43523g < 3) {
            this.f43518b.removeMessages(1);
            this.f43523g++;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString("operator", str);
            bundle.putInt("sim_subscription_id", i2);
            obtain.what = 1;
            obtain.setData(bundle);
            this.f43518b.sendMessageDelayed(obtain, TimeUnit.SECONDS.toMillis((long) (this.f43523g * 2)));
            return;
        }
        com.bytedance.sdk.b.c.a.c("get free flow id fail continuously, stop retry");
        this.f43523g = 0;
    }

    @Override // com.bytedance.sdk.b.b
    public final void a(final boolean z, final b.a aVar) {
        if (this.f43525i != z) {
            com.bytedance.sdk.b.d.a aVar2 = a.C1051a.f43568a;
            AnonymousClass1 r2 = new com.bytedance.sdk.b.d.b.a<Boolean>() {
                /* class com.bytedance.sdk.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26645);
                }

                @Override // com.bytedance.sdk.b.d.b.a
                public final void a(Exception exc) {
                    b.a aVar = aVar;
                    if (aVar != null) {
                        aVar.b();
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.sdk.b.d.b.a
                public final /* synthetic */ void a(Boolean bool) {
                    int i2;
                    c cVar = c.this;
                    boolean z = z;
                    cVar.f43525i = z;
                    com.bytedance.sdk.b.e.a aVar = cVar.f43517a;
                    if (aVar.f43606a != null) {
                        aVar.f43606a.edit().putBoolean("is_enable", z).apply();
                    }
                    JSONObject a2 = com.bytedance.sdk.b.c.b.a();
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    try {
                        a2.put("enable", i2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    com.bytedance.sdk.b.c.b.a("mobile_flow_international_enable_switch", a2);
                    if (z) {
                        cVar.b();
                    } else {
                        cVar.d();
                        cVar.c();
                    }
                    b.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }

                @Override // com.bytedance.sdk.b.d.b.a
                public final void a(int i2, String str) {
                    b.a aVar = aVar;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            };
            if (aVar2.f43562b != null) {
                aVar2.f43562b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: INVOKE  
                      (wrap: android.os.Handler : 0x0010: IGET  (r1v0 android.os.Handler) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a) com.bytedance.sdk.b.d.a.b android.os.Handler)
                      (wrap: com.bytedance.sdk.b.d.a$2 : 0x0014: CONSTRUCTOR  (r0v2 com.bytedance.sdk.b.d.a$2) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a), (r5v0 'z' boolean), (r2v0 'r2' com.bytedance.sdk.b.c$1) call: com.bytedance.sdk.b.d.a.2.<init>(com.bytedance.sdk.b.d.a, boolean, com.bytedance.sdk.b.d.b.a):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.sdk.b.c.a(boolean, com.bytedance.sdk.b.b$a):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r0v2 com.bytedance.sdk.b.d.a$2) = (r3v0 'aVar2' com.bytedance.sdk.b.d.a), (r5v0 'z' boolean), (r2v0 'r2' com.bytedance.sdk.b.c$1) call: com.bytedance.sdk.b.d.a.2.<init>(com.bytedance.sdk.b.d.a, boolean, com.bytedance.sdk.b.d.b.a):void type: CONSTRUCTOR in method: com.bytedance.sdk.b.c.a(boolean, com.bytedance.sdk.b.b$a):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.b.d.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    boolean r0 = r4.f43525i
                    if (r0 != r5) goto L_0x0005
                    return
                L_0x0005:
                    com.bytedance.sdk.b.d.a r3 = com.bytedance.sdk.b.d.a.C1051a.f43568a
                    com.bytedance.sdk.b.c$1 r2 = new com.bytedance.sdk.b.c$1
                    r2.<init>(r5, r6)
                    android.os.Handler r0 = r3.f43562b
                    if (r0 == 0) goto L_0x001a
                    android.os.Handler r1 = r3.f43562b
                    com.bytedance.sdk.b.d.a$2 r0 = new com.bytedance.sdk.b.d.a$2
                    r0.<init>(r5, r2)
                    r1.post(r0)
                L_0x001a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.b.c.a(boolean, com.bytedance.sdk.b.b$a):void");
            }

            /* access modifiers changed from: package-private */
            public final void a(String str, int i2, boolean z) {
                if (!com.bytedance.sdk.b.f.b.a(this.f43521e)) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: is not mobile network");
                } else if (!a(str)) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: is not target operator");
                } else if (TextUtils.isEmpty(this.f43526j.f43506a)) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: free flow id is empty");
                    c(str, i2);
                } else if (this.f43526j.a()) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: free flow id is expired");
                    c(str, i2);
                } else if (!TextUtils.isEmpty(str) && !this.f43517a.b("sim_operator").equals(str)) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: sim operator change");
                    c(str, i2);
                } else if (i2 == -1 || i2 == this.f43517a.c("key_sim_subscription_id")) {
                    com.bytedance.sdk.b.c.a.b("check free flow id: no need to update");
                    if (z) {
                        e();
                    }
                } else {
                    com.bytedance.sdk.b.c.a.b("check sim subscription id: sim subscription id change");
                    c(str, i2);
                }
            }
        }
