package com.ss.ttm.player;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.ArrayList;
import java.util.List;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f152105a = t.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static String f152106b = null;

    /* renamed from: c  reason: collision with root package name */
    private static g f152107c;

    /* renamed from: d  reason: collision with root package name */
    private static g f152108d;

    /* renamed from: e  reason: collision with root package name */
    private static g f152109e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static boolean f152110f = false;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f152111g = false;

    /* renamed from: h  reason: collision with root package name */
    private static int f152112h = 0;

    static class a implements g {
        static {
            Covode.recordClassIndex(101373);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.ss.ttm.player.g
        public final boolean a(List<String> list) {
            for (String str : list) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.a(str);
                    m.a(uptimeMillis, str);
                } catch (Throwable th) {
                    t.f152106b = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(101372);
    }

    public static final synchronized void a() {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (t.class) {
            MethodCollector.i(1850);
            try {
                boolean z4 = false;
                if (f152112h == 0) {
                    f152112h = r.a(13, 0) / 1000;
                }
                if (f152112h == 2925) {
                    z = true;
                } else {
                    z = false;
                }
                if (r.a(3)) {
                    if (!z) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.a("c++_shared");
                        m.a(uptimeMillis, "c++_shared");
                        if (!r.a(28)) {
                            a("ttcrypto");
                            a("ttboringssl");
                        }
                        a("ByteVC1_dec");
                        a("ttffmpeg");
                    }
                    if (r.a(29)) {
                        if (!a("ttmplayerbeta")) {
                            if (!a("ttmplayer")) {
                                z4 = true;
                            }
                            f152111g = z4;
                            MethodCollector.o(1850);
                            return;
                        }
                    } else if (!a("ttmplayer")) {
                        f152111g = true;
                        MethodCollector.o(1850);
                        return;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!z) {
                        arrayList.add("c++_shared");
                        if (!r.a(28)) {
                            arrayList.add("ttcrypto");
                            arrayList.add("ttboringssl");
                        }
                        arrayList.add("ByteVC1_dec");
                        arrayList.add("ttffmpeg");
                    }
                    if (r.a(29)) {
                        if (!a(arrayList, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        f152111g = z2;
                        if (!z2) {
                            arrayList.clear();
                            arrayList.add("ttmplayerbeta");
                            if (!a(arrayList, true)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            f152111g = z3;
                            if (z3) {
                                arrayList.clear();
                                arrayList.add("ttmplayer");
                                if (!a(arrayList, true)) {
                                    z4 = true;
                                }
                                f152111g = z4;
                                MethodCollector.o(1850);
                                return;
                            }
                        }
                    } else {
                        arrayList.add("ttmplayer");
                        if (!a(arrayList, false)) {
                            z4 = true;
                        }
                        f152111g = z4;
                    }
                }
                MethodCollector.o(1850);
            } catch (Throwable th) {
                f152111g = true;
                f152106b = "load default library error." + th.toString();
                MethodCollector.o(1850);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[SYNTHETIC, Splitter:B:30:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.t.a(java.lang.String):boolean");
    }

    private static boolean a(List<String> list, boolean z) {
        boolean z2 = f152110f;
        if ((!z) && z2) {
            return z2;
        }
        g gVar = f152107c;
        if (gVar != null) {
            try {
                f152110f = gVar.a(list);
            } catch (Throwable th) {
                f152106b = th.getMessage();
            }
        } else {
            f152110f = f152109e.a(list);
        }
        return f152110f;
    }
}
