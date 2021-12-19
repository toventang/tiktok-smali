package com.ss.android.ugc.playerkit.videoview.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class p implements h {

    /* renamed from: e  reason: collision with root package name */
    private static a f148950e;

    /* renamed from: a  reason: collision with root package name */
    private long f148951a = 2400000;

    /* renamed from: b  reason: collision with root package name */
    private List<n> f148952b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f148953c;

    /* renamed from: d  reason: collision with root package name */
    private long f148954d;

    /* access modifiers changed from: package-private */
    public interface a {

        /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$a$a  reason: collision with other inner class name */
        public static class C4020a implements a {
            static {
                Covode.recordClassIndex(98085);
            }

            @Override // com.ss.android.ugc.playerkit.videoview.d.p.a
            public final com.ss.android.ugc.playerkit.videoview.a.c a(c cVar) {
                return null;
            }

            @Override // com.ss.android.ugc.playerkit.videoview.d.p.a
            public final void a(c cVar, com.ss.android.ugc.playerkit.videoview.a.c cVar2) {
            }
        }

        static {
            Covode.recordClassIndex(98084);
        }

        com.ss.android.ugc.playerkit.videoview.a.c a(c cVar);

        void a(c cVar, com.ss.android.ugc.playerkit.videoview.a.c cVar2);
    }

    static {
        Covode.recordClassIndex(98083);
    }

    /* access modifiers changed from: package-private */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static ConcurrentHashMap<Integer, d> f148955a = new ConcurrentHashMap<>();

        private b() {
        }

        static {
            Covode.recordClassIndex(98086);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.playerkit.videoview.d.p.a
        public final com.ss.android.ugc.playerkit.videoview.a.c a(c cVar) {
            int hashCode = cVar.hashCode();
            d dVar = f148955a.get(Integer.valueOf(hashCode));
            if (dVar == null) {
                return null;
            }
            if (SystemClock.elapsedRealtime() - dVar.f148961a < 600000) {
                if (cVar.f148956a != null) {
                    cVar.f148956a.getSourceId();
                }
                return dVar.f148962b;
            }
            f148955a.remove(Integer.valueOf(hashCode));
            return null;
        }

        @Override // com.ss.android.ugc.playerkit.videoview.d.p.a
        public final void a(c cVar, com.ss.android.ugc.playerkit.videoview.a.c cVar2) {
            if (cVar2.f148911d != null && cVar2.f148911d.getQualityType() > 0) {
                int hashCode = cVar.hashCode();
                f148955a.put(Integer.valueOf(hashCode), new d(cVar2, (byte) 0));
                if (cVar.f148956a != null) {
                    cVar.f148956a.getSourceId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final i f148956a;

        /* renamed from: b  reason: collision with root package name */
        final m.e f148957b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f148958c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f148959d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f148960e = false;

        static {
            Covode.recordClassIndex(98087);
        }

        public final int hashCode() {
            int i2;
            i iVar = this.f148956a;
            int i3 = 0;
            if (iVar != null) {
                i2 = iVar.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = i2 * 31;
            m.e eVar = this.f148957b;
            if (eVar != null) {
                i3 = eVar.hashCode();
            }
            return ((((((i4 + i3) * 31) + (this.f148958c ? 1 : 0)) * 31) + (this.f148959d ? 1 : 0)) * 31) + (this.f148960e ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f148958c != cVar.f148958c || this.f148959d != cVar.f148959d || this.f148960e != cVar.f148960e) {
                    return false;
                }
                i iVar = this.f148956a;
                if (iVar == null ? cVar.f148956a != null : !iVar.equals(cVar.f148956a)) {
                    return false;
                }
                if (this.f148957b == cVar.f148957b) {
                    return true;
                }
            }
            return false;
        }

        public c(i iVar, m.e eVar, boolean z) {
            this.f148956a = iVar;
            this.f148957b = eVar;
            this.f148958c = z;
        }
    }

    private static a a() {
        a aVar;
        if (f148950e == null) {
            if (((Boolean) ((com.ss.android.ugc.playerkit.exp.a) com.ss.android.ugc.playerkit.exp.b.f148667a.getValue()).a()).booleanValue()) {
                aVar = new b((byte) 0);
            } else {
                aVar = new a.C4020a();
            }
            f148950e = aVar;
        }
        return f148950e;
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        final long f148961a;

        /* renamed from: b  reason: collision with root package name */
        final com.ss.android.ugc.playerkit.videoview.a.c f148962b;

        static {
            Covode.recordClassIndex(98088);
        }

        private d(com.ss.android.ugc.playerkit.videoview.a.c cVar) {
            this.f148961a = SystemClock.elapsedRealtime();
            this.f148962b = cVar;
        }

        /* synthetic */ d(com.ss.android.ugc.playerkit.videoview.a.c cVar, byte b2) {
            this(cVar);
        }
    }

    private static String a(String str) {
        if (str == null || !str.startsWith("http") || str.startsWith("https")) {
            return str;
        }
        return str.replaceFirst("http", "https");
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.h
    public final com.ss.android.ugc.playerkit.videoview.a.c a(i iVar, m.e eVar) {
        return b(iVar, eVar, false, false);
    }

    public p(List<n> list, long j2) {
        this.f148952b = list.isEmpty() ? Collections.singletonList(n.f148944b) : list;
        this.f148951a = j2;
        this.f148953c = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f148954d = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.h
    public final u a(i iVar, m.e eVar, boolean z) {
        return a(iVar, eVar, z, false);
    }

    public static List<String> a(String[] strArr, long j2, long j3) {
        long defaultCDNTimeoutTime = (long) com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getDefaultCDNTimeoutTime();
        boolean enableCdnUrlExpiredExperiment = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        long cdnUrlExpiredOffset = com.ss.android.ugc.aweme.simkit.d.a().b().getSimPlayerExperiment().cdnUrlExpiredOffset();
        if (com.ss.android.ugc.playerkit.model.c.f148702a.forceHttps()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = a(strArr[i2]);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if ((strArr[i3].contains("aweme/v1/play") || strArr[i3].contains("aweme/v2/play")) && a2.b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a2.b().getCommonConfig().getCommonParamsProcessor().a(strArr[i3]));
                } else {
                    Arrays.toString(strArr);
                    if (j3 <= 0 || !enableCdnUrlExpiredExperiment) {
                        if (SystemClock.elapsedRealtime() - j2 < defaultCDNTimeoutTime) {
                            arrayList.add(strArr[i3]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < j3 + cdnUrlExpiredOffset) {
                        arrayList.add(strArr[i3]);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<String> b(String[] strArr, long j2, long j3) {
        if (com.ss.android.ugc.playerkit.model.c.f148702a.forceHttps()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = a(strArr[i2]);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if ((strArr[i3].contains("aweme/v1/play") || strArr[i3].contains("aweme/v2/play")) && a2.b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a2.b().getCommonConfig().getCommonParamsProcessor().a(strArr[i3]));
                } else {
                    Arrays.toString(strArr);
                    if (j3 <= 0 || !this.f148953c) {
                        if (SystemClock.elapsedRealtime() - j2 < this.f148951a) {
                            arrayList.add(strArr[i3]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f148954d + j3) {
                        arrayList.add(strArr[i3]);
                    }
                }
            }
        }
        return arrayList;
    }

    private com.ss.android.ugc.playerkit.videoview.a.c b(i iVar, m.e eVar, boolean z, boolean z2) {
        return c(iVar, eVar, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.playerkit.videoview.a.c c(com.ss.android.ugc.playerkit.simapicommon.a.i r13, com.ss.android.ugc.playerkit.model.m.e r14, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.videoview.d.p.c(com.ss.android.ugc.playerkit.simapicommon.a.i, com.ss.android.ugc.playerkit.model.m$e, boolean, boolean):com.ss.android.ugc.playerkit.videoview.a.c");
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.h
    public final u a(i iVar, m.e eVar, boolean z, boolean z2) {
        u a2;
        if (iVar != null) {
            if (iVar.isColdBoot() && com.ss.android.ugc.playerkit.exp.b.h() && (a2 = d.f148930a.a(iVar)) != null) {
                return a2;
            }
            if (com.ss.android.ugc.aweme.simkit.d.a().b() != null && com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig() != null && com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().isSkipSelectBitrate(iVar) && !TextUtils.isEmpty(com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getLocalVideoPath(iVar))) {
                com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getLocalVideoPath(iVar);
                u uVar = new u();
                uVar.f148824a = com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().getLocalVideoPath(iVar);
                uVar.f148827d = com.ss.android.ugc.aweme.simkit.d.a().b().getCommonConfig().checkIsBytevc1InCache(iVar);
                return uVar;
            }
        }
        com.ss.android.ugc.playerkit.videoview.a.c b2 = b(iVar, eVar, z, z2);
        u uVar2 = new u();
        if (b2 != null) {
            i iVar2 = new i(iVar, b2.f148910c, b2.f148908a);
            j a3 = new o(this.f148952b, iVar2, 0).a(iVar2);
            uVar2.f148824a = a3.f148935a;
            uVar2.f148831h = a3.f148936b;
            uVar2.f148827d = b2.f148909b;
            if (b2.f148911d != null) {
                uVar2.f148828e = new com.ss.android.ugc.playerkit.model.a(b2.f148911d.getBitRate(), b2.f148911d.getGearName(), b2.f148911d.getQualityType(), b2.f148911d.isBytevc1(), b2.f148911d.getUrlKey(), b2.f148911d.urlList(), b2.f148911d.getChecksum(), b2.f148911d.getSize());
            }
            if (iVar != null) {
                uVar2.f148825b = iVar.getRatio();
            }
            uVar2.f148829f = b2.f148910c;
            uVar2.f148832i = b2.f148913f;
            if (b2.f148911d != null) {
                uVar2.f148830g = b2.f148912e;
            } else if (iVar != null) {
                uVar2.f148830g = iVar.getFileCheckSum();
            }
        }
        return uVar2;
    }
}
