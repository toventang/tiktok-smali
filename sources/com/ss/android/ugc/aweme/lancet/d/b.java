package com.ss.android.ugc.aweme.lancet.d;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.lancet.d.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a.C2754a f107207a;

    static {
        Covode.recordClassIndex(68576);
    }

    b(a.C2754a aVar) {
        this.f107207a = aVar;
    }

    public final void run() {
        a.C2754a aVar = this.f107207a;
        try {
            Application a2 = g.a();
            aVar.f107203c = -1;
            aVar.f107201a = (TelephonyManager) a.C2754a.a(a2, "phone");
            aVar.a(SubscriptionManager.getDefaultDataSubscriptionId());
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            ((ConnectivityManager) a.C2754a.a(a2, "connectivity")).registerNetworkCallback(builder.build(), 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003a: INVOKE  
                  (wrap: android.net.ConnectivityManager : 0x000f: CHECK_CAST (r3v1 android.net.ConnectivityManager) = (android.net.ConnectivityManager) (wrap: java.lang.Object : 0x000b: INVOKE  (r3v0 java.lang.Object) = (r1v0 'a2' android.app.Application), ("connectivity") type: STATIC call: com.ss.android.ugc.aweme.lancet.d.a.a.a(android.content.Context, java.lang.String):java.lang.Object))
                  (wrap: android.net.NetworkRequest : 0x0036: INVOKE  (r0v8 android.net.NetworkRequest) = (r2v0 'builder' android.net.NetworkRequest$Builder) type: VIRTUAL call: android.net.NetworkRequest.Builder.build():android.net.NetworkRequest)
                  (wrap: com.ss.android.ugc.aweme.lancet.d.a$a$1 : 0x0033: CONSTRUCTOR  (r1v2 com.ss.android.ugc.aweme.lancet.d.a$a$1) = (r4v0 'aVar' com.ss.android.ugc.aweme.lancet.d.a$a) call: com.ss.android.ugc.aweme.lancet.d.a.a.1.<init>(com.ss.android.ugc.aweme.lancet.d.a$a):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.net.ConnectivityManager.registerNetworkCallback(android.net.NetworkRequest, android.net.ConnectivityManager$NetworkCallback):void in method: com.ss.android.ugc.aweme.lancet.d.b.run():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r1v2 com.ss.android.ugc.aweme.lancet.d.a$a$1) = (r4v0 'aVar' com.ss.android.ugc.aweme.lancet.d.a$a) call: com.ss.android.ugc.aweme.lancet.d.a.a.1.<init>(com.ss.android.ugc.aweme.lancet.d.a$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.lancet.d.b.run():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.lancet.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.lancet.d.a$a r4 = r5.f107207a
                android.app.Application r1 = com.bytedance.ies.ugc.appcontext.g.a()     // Catch:{ Exception -> 0x0040 }
                r0 = -1
                r4.f107203c = r0     // Catch:{ Exception -> 0x0040 }
                java.lang.String r0 = "connectivity"
                java.lang.Object r3 = com.ss.android.ugc.aweme.lancet.d.a.C2754a.a(r1, r0)     // Catch:{ Exception -> 0x0040 }
                android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ Exception -> 0x0040 }
                java.lang.String r0 = "phone"
                java.lang.Object r0 = com.ss.android.ugc.aweme.lancet.d.a.C2754a.a(r1, r0)     // Catch:{ Exception -> 0x0040 }
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0040 }
                r4.f107201a = r0     // Catch:{ Exception -> 0x0040 }
                int r0 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()     // Catch:{ Exception -> 0x0040 }
                r4.a(r0)     // Catch:{ Exception -> 0x0040 }
                android.net.NetworkRequest$Builder r2 = new android.net.NetworkRequest$Builder     // Catch:{ Exception -> 0x0040 }
                r2.<init>()     // Catch:{ Exception -> 0x0040 }
                r0 = 12
                android.net.NetworkRequest$Builder r1 = r2.addCapability(r0)     // Catch:{ Exception -> 0x0040 }
                r0 = 0
                r1.addTransportType(r0)     // Catch:{ Exception -> 0x0040 }
                com.ss.android.ugc.aweme.lancet.d.a$a$1 r1 = new com.ss.android.ugc.aweme.lancet.d.a$a$1     // Catch:{ Exception -> 0x0040 }
                r1.<init>()     // Catch:{ Exception -> 0x0040 }
                android.net.NetworkRequest r0 = r2.build()     // Catch:{ Exception -> 0x0040 }
                r3.registerNetworkCallback(r0, r1)     // Catch:{ Exception -> 0x0040 }
                r0 = 1
                com.ss.android.ugc.aweme.lancet.d.a.f107200c = r0     // Catch:{ Exception -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.d.b.run():void");
        }
    }
