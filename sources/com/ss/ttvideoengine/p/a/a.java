package com.ss.ttvideoengine.p.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.k;
import com.ss.ttvideoengine.p.a;
import com.ss.ttvideoengine.p.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f153160a = Collections.unmodifiableList(Arrays.asList(b.BYTEVC2_SOFTWARE, b.BYTEVC1_HARDWARE, b.BYTEVC1_SOFTWARE, b.H264_HARDWARE, b.H264_SOFTWARE));

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f153161b = Collections.unmodifiableList(Arrays.asList(b.BYTEVC1_HARDWARE, b.H264_HARDWARE, b.BYTEVC2_SOFTWARE, b.BYTEVC1_SOFTWARE, b.H264_SOFTWARE));

    /* renamed from: c  reason: collision with root package name */
    private static final List<b> f153162c = Collections.unmodifiableList(Arrays.asList(b.H264_SOFTWARE, b.H264_HARDWARE, b.BYTEVC1_SOFTWARE, b.BYTEVC1_HARDWARE));

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final b f153166a;

        /* renamed from: b  reason: collision with root package name */
        public b f153167b;

        /* renamed from: c  reason: collision with root package name */
        public final com.ss.ttvideoengine.p.b f153168c;

        /* renamed from: d  reason: collision with root package name */
        public final a.C4074a f153169d;

        static {
            Covode.recordClassIndex(101749);
        }

        public final String toString() {
            return "ResolveResult{dimension=" + this.f153166a + ", correctedDimension=" + this.f153167b + '}';
        }

        public c(com.ss.ttvideoengine.p.b bVar, b bVar2, a.C4074a aVar) {
            this.f153168c = bVar;
            this.f153166a = bVar2;
            this.f153169d = aVar;
        }
    }

    /* renamed from: com.ss.ttvideoengine.p.a.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f153163a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f153164b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        static {
            /*
                r0 = 101746(0x18d72, float:1.42577E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.p.b$a[] r0 = com.ss.ttvideoengine.p.b.a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153164b = r1
                r3 = 1
                com.ss.ttvideoengine.p.b$a r0 = com.ss.ttvideoengine.p.b.a.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r2 = 2
                int[] r1 = com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153164b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.p.b$a r0 = com.ss.ttvideoengine.p.b.a.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                com.ss.ttvideoengine.p.a.a$b[] r0 = com.ss.ttvideoengine.p.a.a.b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153163a = r1
                com.ss.ttvideoengine.p.a.a$b r0 = com.ss.ttvideoengine.p.a.a.b.BYTEVC1_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r1 = com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153163a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.ttvideoengine.p.a.a$b r0 = com.ss.ttvideoengine.p.a.a.b.BYTEVC1_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153163a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.ttvideoengine.p.a.a$b r0 = com.ss.ttvideoengine.p.a.a.b.BYTEVC2_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153163a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.ttvideoengine.p.a.a$b r0 = com.ss.ttvideoengine.p.a.a.b.H264_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r2 = com.ss.ttvideoengine.p.a.a.AnonymousClass1.f153163a     // Catch:{ NoSuchFieldError -> 0x005f }
                com.ss.ttvideoengine.p.a.a$b r0 = com.ss.ttvideoengine.p.a.a.b.H264_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.p.a.a.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: com.ss.ttvideoengine.p.a.a$a  reason: collision with other inner class name */
    public static final class C4075a {
        static {
            Covode.recordClassIndex(101747);
        }

        public static String a() {
            return "4_h = " + k.d() + ", b_h = " + k.a() + ", b_s = " + k.c() + ", b_s_cap = " + k.e() + ", b2_s = " + k.b();
        }
    }

    public enum b {
        BYTEVC1_HARDWARE(1, "bytevc1"),
        BYTEVC1_SOFTWARE(0, "bytevc1"),
        BYTEVC2_SOFTWARE(0, "bytevc2"),
        H264_HARDWARE(1, "h264"),
        H264_SOFTWARE(0, "h264");
        
        public final int decoder;
        public final String encodeType;

        static {
            Covode.recordClassIndex(101748);
        }

        private b(int i2, String str) {
            this.decoder = i2;
            this.encodeType = str;
        }
    }

    static {
        Covode.recordClassIndex(101745);
    }

    public static c a(com.ss.ttvideoengine.p.b bVar, List<b> list) {
        List<b> list2 = f153162c;
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : list2) {
            int i2 = AnonymousClass1.f153163a[bVar2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("unsupported dimension! ".concat(String.valueOf(bVar2)));
                            }
                        } else if (k.d() != 1) {
                            continue;
                        }
                    } else if (k.b() != 1) {
                        continue;
                    }
                } else if (k.c() != 1) {
                    continue;
                }
            } else if (k.a() != 1) {
                continue;
            }
            int i3 = AnonymousClass1.f153163a[bVar2.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (!(i3 == 3 || i3 == 4 || i3 == 5)) {
                        throw new IllegalArgumentException("unsupported dimension! ".concat(String.valueOf(bVar2)));
                    }
                } else if (k.e() != 1) {
                }
            }
            arrayList.add(bVar2);
        }
        b.a a2 = bVar.a();
        int i4 = AnonymousClass1.f153164b[a2.ordinal()];
        if (i4 == 1) {
            return a((com.ss.ttvideoengine.p.a) bVar, arrayList, list);
        }
        if (i4 == 2) {
            return a((com.ss.ttvideoengine.p.c) bVar, arrayList, list);
        }
        throw new IllegalArgumentException("unsupported type! ".concat(String.valueOf(a2)));
    }

    private static c a(com.ss.ttvideoengine.p.a aVar, List<b> list, List<b> list2) {
        for (b bVar : list) {
            if (list2 == null || !list2.contains(bVar)) {
                for (a.C4074a aVar2 : Collections.unmodifiableList(aVar.f153154a)) {
                    if (TextUtils.equals(aVar2.f153159d, bVar.encodeType)) {
                        return new c(aVar, bVar, aVar2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static c a(com.ss.ttvideoengine.p.c cVar, List<b> list, List<b> list2) {
        for (b bVar : list) {
            if ((list2 == null || !list2.contains(bVar)) && (cVar.f153178c == null || TextUtils.equals(cVar.f153178c, bVar.encodeType))) {
                return new c(cVar, bVar, null);
            }
        }
        return null;
    }
}
