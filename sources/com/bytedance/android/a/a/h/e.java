package com.bytedance.android.a.a.h;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.playerkit.model.v;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f6671a = new e();

    /* renamed from: b  reason: collision with root package name */
    public Set<Network> f6672b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f6673c;

    /* renamed from: d  reason: collision with root package name */
    private Context f6674d;

    /* access modifiers changed from: package-private */
    public class a extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(3209);
        }

        public final void onUnavailable() {
            super.onUnavailable();
            e.this.f6672b.clear();
            a.a("onUnavailable");
        }

        private a() {
        }

        public final void onLost(Network network) {
            super.onLost(network);
            e.this.a(network);
        }

        public final void onAvailable(Network network) {
            String str;
            super.onAvailable(network);
            e eVar = e.this;
            boolean isEmpty = eVar.f6672b.isEmpty();
            Iterator<Network> it = eVar.f6672b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(network)) {
                        break;
                    }
                } else {
                    eVar.f6672b.add(network);
                    break;
                }
            }
            boolean z = !eVar.f6672b.isEmpty();
            if (isEmpty && z) {
                com.bytedance.android.a.a.a aVar = com.bytedance.android.a.a.e.d().f6646d;
                for (com.bytedance.android.a.a.g.a aVar2 : aVar.f6595a.values()) {
                    if (aVar2 != null) {
                        com.bytedance.android.a.a.c.a.a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: INVOKE  
                              (wrap: com.bytedance.android.a.a.a$1 : 0x004f: CONSTRUCTOR  (r0v17 com.bytedance.android.a.a.a$1) = (r3v0 'aVar' com.bytedance.android.a.a.a), (r1v4 'aVar2' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.a.1.<init>(com.bytedance.android.a.a.a, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.android.a.a.c.a.a(com.bytedance.android.a.a.c.c):void in method: com.bytedance.android.a.a.h.e.a.onAvailable(android.net.Network):void, file: classes2.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR  (r0v17 com.bytedance.android.a.a.a$1) = (r3v0 'aVar' com.bytedance.android.a.a.a), (r1v4 'aVar2' com.bytedance.android.a.a.g.a) call: com.bytedance.android.a.a.a.1.<init>(com.bytedance.android.a.a.a, com.bytedance.android.a.a.g.a):void type: CONSTRUCTOR in method: com.bytedance.android.a.a.h.e.a.onAvailable(android.net.Network):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.a.a.a, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 128
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.a.a.h.e.a.onAvailable(android.net.Network):void");
                    }

                    /* synthetic */ a(e eVar, byte b2) {
                        this();
                    }

                    public final void onLosing(Network network, int i2) {
                        super.onLosing(network, i2);
                        e.this.a(network);
                        a.a("onLosing:" + network.toString());
                    }
                }

                static {
                    Covode.recordClassIndex(3208);
                }

                private e() {
                }

                private static boolean c() {
                    com.bytedance.android.a.a.f.a aVar;
                    if (Build.VERSION.SDK_INT >= 21 && (aVar = com.bytedance.android.a.a.e.d().f6645c) != null) {
                        return aVar.f6663g;
                    }
                    return false;
                }

                public final boolean a() {
                    boolean z = true;
                    if (c()) {
                        return !this.f6672b.isEmpty();
                    }
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) a(this.f6674d, "connectivity");
                        if (connectivityManager == null) {
                            return false;
                        }
                        NetworkInfo a2 = a(connectivityManager);
                        if (a2 == null || !a2.isConnected()) {
                            z = false;
                        }
                        return z;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }

                public final int b() {
                    NetworkInfo a2;
                    if (c()) {
                        if (this.f6672b.isEmpty()) {
                            return -1;
                        }
                    } else if (!a()) {
                        return -1;
                    }
                    ConnectivityManager connectivityManager = (ConnectivityManager) a(this.f6674d, "connectivity");
                    if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isConnected()) {
                        return -1;
                    }
                    int type = a2.getType();
                    if (type == 1) {
                        return 0;
                    }
                    if (type != 0) {
                        return 1;
                    }
                    switch (a2.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        case 16:
                            return 2;
                        case 3:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        case 15:
                        case 17:
                            return 3;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                            return 4;
                        case 19:
                        default:
                            String subtypeName = a2.getSubtypeName();
                            if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                                return 3;
                            }
                            return 1;
                        case v.U /*{ENCODED_INT: 20}*/:
                            return 5;
                    }
                }

                private static NetworkInfo a(ConnectivityManager connectivityManager) {
                    try {
                        return connectivityManager.getActiveNetworkInfo();
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                        return com.ss.android.ugc.aweme.net.e.a.a();
                    }
                }

                public final synchronized void a(Context context) {
                    MethodCollector.i(3501);
                    this.f6674d = context;
                    if (!c() || this.f6673c) {
                        MethodCollector.o(3501);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) a(com.bytedance.android.a.a.e.d().f6644b, "connectivity");
                        if (connectivityManager == null) {
                            com.bytedance.android.a.a.e.d().f6645c.f6663g = false;
                            MethodCollector.o(3501);
                            return;
                        }
                        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addCapability(12);
                        if (Build.VERSION.SDK_INT >= 28) {
                            addCapability.addCapability(21);
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            addCapability.addCapability(16);
                        }
                        connectivityManager.registerNetworkCallback(addCapability.build(), new a(this, (byte) 0));
                    }
                    this.f6673c = true;
                    MethodCollector.o(3501);
                }

                public final void a(Network network) {
                    String str;
                    boolean z = !this.f6672b.isEmpty();
                    Iterator<Network> it = this.f6672b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Network next = it.next();
                        if (next.equals(network)) {
                            this.f6672b.remove(next);
                            break;
                        }
                    }
                    boolean isEmpty = this.f6672b.isEmpty();
                    StringBuilder append = new StringBuilder("onNetworkUnavailable: ").append(network.toString());
                    if (!z || !isEmpty) {
                        str = "";
                    } else {
                        str = ". network become lost!!!";
                    }
                    a.a(append.append(str).toString());
                }

                private static Object a(Context context, String str) {
                    Object obj;
                    MethodCollector.i(3502);
                    if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                        if (!i.f107220b && "connectivity".equals(str)) {
                            try {
                                new b().a();
                                i.f107220b = true;
                                obj = context.getSystemService(str);
                            } catch (Throwable unused) {
                            }
                        }
                        obj = context.getSystemService(str);
                    } else if (i.f107219a) {
                        synchronized (ClipboardManager.class) {
                            try {
                                obj = context.getSystemService(str);
                                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                    try {
                                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                        declaredField.setAccessible(true);
                                        declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                    } catch (Exception e2) {
                                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                                    }
                                }
                                i.f107219a = false;
                            } finally {
                                MethodCollector.o(3502);
                            }
                        }
                    } else {
                        obj = context.getSystemService(str);
                    }
                    return obj;
                }
            }
