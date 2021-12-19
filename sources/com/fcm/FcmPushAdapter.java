package com.fcm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.k.a;
import com.bytedance.push.k.c;
import com.bytedance.push.third.b;
import com.bytedance.push.third.f;
import com.bytedance.push_3rd_fcm_androidx.R$string;
import com.google.firebase.iid.FirebaseInstanceId;
import com.ss.android.message.a;
import java.util.Arrays;
import java.util.Collections;

public class FcmPushAdapter implements b {
    private static int FCM_PUSH = -1;

    @Override // com.bytedance.push.third.b
    public boolean isPushAvailable(Context context, int i2) {
        return true;
    }

    public boolean requestNotificationPermission(int i2) {
        return false;
    }

    @Override // com.bytedance.push.third.b
    public void setAlias(Context context, String str, int i2) {
    }

    @Override // com.bytedance.push.third.b
    public void trackPush(Context context, int i2, Object obj) {
    }

    static {
        Covode.recordClassIndex(30816);
    }

    public static int getFcmPush() {
        if (FCM_PUSH == -1) {
            FCM_PUSH = f.a(a.f59817a).a(FcmPushAdapter.class.getName());
        }
        return FCM_PUSH;
    }

    @Override // com.bytedance.push.third.b
    public void unregisterPush(Context context, int i2) {
        if (context != null) {
            getFcmPush();
        }
    }

    @Override // com.bytedance.push.third.b
    public void registerPush(Context context, int i2) {
        String str;
        if (context != null) {
            if (i2 != getFcmPush()) {
                str = null;
                if (context != null) {
                    if (i2 != getFcmPush()) {
                        str = "register sender error";
                    }
                    com.bytedance.push.f.d().a(i2, 101, "0", str);
                }
            } else {
                try {
                    FirebaseInstanceId.getInstance().getInstanceId().a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE  
                          (wrap: com.google.android.gms.c.h<com.google.firebase.iid.v> : 0x0026: INVOKE  (r1v1 com.google.android.gms.c.h<com.google.firebase.iid.v>) = 
                          (wrap: com.google.firebase.iid.FirebaseInstanceId : 0x0022: INVOKE  (r0v2 com.google.firebase.iid.FirebaseInstanceId) =  type: STATIC call: com.google.firebase.iid.FirebaseInstanceId.getInstance():com.google.firebase.iid.FirebaseInstanceId)
                         type: VIRTUAL call: com.google.firebase.iid.FirebaseInstanceId.getInstanceId():com.google.android.gms.c.h)
                          (wrap: com.fcm.a.a$1 : 0x002c: CONSTRUCTOR  (r0v3 com.fcm.a.a$1) = (r5v0 'context' android.content.Context) call: com.fcm.a.a.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.google.android.gms.c.h.a(com.google.android.gms.c.c):com.google.android.gms.c.h in method: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void, file: classes2.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: CONSTRUCTOR  (r0v3 com.fcm.a.a$1) = (r5v0 'context' android.content.Context) call: com.fcm.a.a.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.fcm.a.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                        this = this;
                        if (r5 == 0) goto L_0x000b
                        int r0 = getFcmPush()
                        if (r6 == r0) goto L_0x0022
                        r3 = 0
                        if (r5 != 0) goto L_0x0019
                    L_0x000b:
                        java.lang.String r3 = "context is null"
                    L_0x000d:
                        com.bytedance.push.c.e r2 = com.bytedance.push.f.d()
                        r1 = 101(0x65, float:1.42E-43)
                        java.lang.String r0 = "0"
                        r2.a(r6, r1, r0, r3)
                        return
                    L_0x0019:
                        int r0 = getFcmPush()
                        if (r6 == r0) goto L_0x000d
                        java.lang.String r3 = "register sender error"
                        goto L_0x000d
                    L_0x0022:
                        com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance()     // Catch:{ all -> 0x0032 }
                        com.google.android.gms.c.h r1 = r0.getInstanceId()     // Catch:{ all -> 0x0032 }
                        com.fcm.a.a$1 r0 = new com.fcm.a.a$1     // Catch:{ all -> 0x0032 }
                        r0.<init>(r5)     // Catch:{ all -> 0x0032 }
                        r1.a(r0)     // Catch:{ all -> 0x0032 }
                    L_0x0032:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void");
                }

                @Override // com.bytedance.push.third.b
                public boolean checkThirdPushConfig(String str, Context context) {
                    boolean z;
                    String string = context.getResources().getString(R$string.google_api_key);
                    String string2 = context.getResources().getString(R$string.google_app_id);
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return z & c.b(context, "Fcm Push error", Arrays.asList(a.C1033a.c("com.fcm.service.SSGcmListenerService").a(context.getPackageName()).a(new a.b(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"))).f42224a, a.C1033a.c("com.fcm.service.FcmRegistrationJobIntentService").a(context.getPackageName()).b("android.permission.BIND_JOB_SERVICE").f42224a));
                }
            }
