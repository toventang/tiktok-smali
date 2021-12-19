package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.services.PreloadVESoStatus;
import h.f.b.m;
import h.h;
import h.i;

public final class cz implements IPreloadVESo {

    /* renamed from: a  reason: collision with root package name */
    public static final h f79304a = i.a((h.f.a.a) b.f79328a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f79305b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private volatile PreloadVESoStatus f79306c = PreloadVESoStatus.UNLOAD;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f79307d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final o f79308e = new o();

    /* renamed from: f  reason: collision with root package name */
    private boolean f79309f;

    public static final class a {
        static {
            Covode.recordClassIndex(49228);
        }

        public static cz a() {
            return (cz) cz.f79304a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final long getPreLoadVESoCostTime() {
        return this.f79307d;
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.f79306c;
    }

    static final class b extends m implements h.f.a.a<cz> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79328a = new b();

        static {
            Covode.recordClassIndex(49229);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ cz invoke() {
            return new cz();
        }
    }

    static {
        Covode.recordClassIndex(49227);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r5.f79308e.b();
        r5.f79306c = com.ss.android.ugc.aweme.services.PreloadVESoStatus.LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (com.ss.android.ugc.aweme.property.ct.a() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        com.ss.android.ttve.nativePort.d.f61348f = true;
        r2 = dmt.av.video.c.b.f156874d;
        r1 = com.ss.android.ugc.aweme.port.in.c.f115622a;
        h.f.b.l.b(r1, "");
        r2.a(r1).b();
        com.ss.android.ttve.nativePort.d.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (com.bytedance.ies.abmock.b.a().a(true, "creative_tools_pre_load_model_so", false) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        com.ss.android.ugc.effectmanager.DownloadableModelSupport.loadSo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        com.ss.android.ugc.aweme.port.in.g.a().a();
     */
    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void preLoadVESo() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cz.preLoadVESo():void");
    }
}
