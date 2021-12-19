package com.ss.android.ugc.aweme.shortvideo.af.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.m;
import com.ss.android.ugc.aweme.watermark.o;
import com.ss.android.ugc.aweme.watermark.t;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEWatermarkParam;
import h.f.b.l;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f124911a;

    /* renamed from: b  reason: collision with root package name */
    private o f124912b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.asve.editor.a f124913c;

    /* renamed from: d  reason: collision with root package name */
    private final String f124914d;

    static {
        Covode.recordClassIndex(82070);
    }

    public static final class a implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f124915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f124916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f124917c;

        static {
            Covode.recordClassIndex(82071);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            d dVar = this.f124917c;
            if (dVar != null) {
                dVar.a();
            }
            this.f124915a.a((o) this.f124916b);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            d dVar = this.f124917c;
            if (dVar != null) {
                dVar.a(f2);
            }
        }

        a(b bVar, t tVar, d dVar) {
            this.f124915a = bVar;
            this.f124916b = tVar;
            this.f124917c = dVar;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            d dVar = this.f124917c;
            if (dVar != null) {
                if (str == null) {
                    str = "";
                }
                dVar.a(i2, str, i3);
            }
            this.f124915a.a((o) this.f124916b);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.f
    public final void a() {
        if (this.f124911a) {
            o oVar = this.f124912b;
            if (oVar != null) {
                b(oVar);
            }
            com.ss.android.ugc.asve.editor.a aVar = this.f124913c;
            if (aVar != null) {
                aVar.s();
            }
            this.f124913c = null;
            this.f124911a = false;
        }
    }

    public b(String str) {
        l.d(str, "");
        this.f124914d = str;
    }

    public final void a(o oVar) {
        this.f124911a = false;
        com.ss.android.ugc.asve.editor.a aVar = this.f124913c;
        if (aVar != null) {
            aVar.s();
        }
        this.f124913c = null;
        b(oVar);
    }

    private static void b(o oVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = oVar.f144816f;
        if (!(vEWatermarkParam == null || (strArr2 = vEWatermarkParam.images) == null || strArr2.length == 0)) {
            for (String str3 : strArr2) {
                e.c(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = oVar.f144816f;
        if (!(vEWatermarkParam2 == null || (strArr = vEWatermarkParam2.secondHalfImages) == null || strArr.length == 0)) {
            for (String str4 : strArr) {
                e.c(str4);
            }
        }
        m mVar = oVar.f144812b;
        if (!(mVar == null || (str2 = mVar.f144799a) == null)) {
            e.c(str2);
        }
        m mVar2 = oVar.f144812b;
        if (!(mVar2 == null || (str = mVar2.f144800b) == null)) {
            e.c(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (r0 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0126, code lost:
        if (r0 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0139, code lost:
        if (r0 == null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        if (r0 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0164, code lost:
        if (r0 == null) goto L_0x0166;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.watermark.t r20, com.ss.android.ugc.aweme.shortvideo.af.a.d r21) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.af.a.b.a(com.ss.android.ugc.aweme.watermark.t, com.ss.android.ugc.aweme.shortvideo.af.a.d):void");
    }
}
