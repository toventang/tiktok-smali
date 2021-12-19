package com.ss.android.ugc.aweme.watermark;

import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.vesdk.VEWatermarkParam;
import h.f.b.l;

public final class u implements h {
    static {
        Covode.recordClassIndex(94706);
    }

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VEWatermarkParam f144834a;

        /* renamed from: b  reason: collision with root package name */
        private final VEWatermarkParam f144835b;

        static {
            Covode.recordClassIndex(94707);
        }

        @Override // com.ss.android.ugc.aweme.watermark.g
        public final VEWatermarkParam b() {
            return this.f144835b;
        }

        @Override // com.ss.android.ugc.aweme.watermark.g
        public final int a() {
            return this.f144835b.yOffset;
        }

        a(VEWatermarkParam vEWatermarkParam) {
            this.f144834a = vEWatermarkParam;
            this.f144835b = vEWatermarkParam;
        }

        @Override // com.ss.android.ugc.aweme.watermark.g
        public final void a(int i2) {
            this.f144835b.yOffset = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.watermark.h
    public final void a(String str) {
        MethodCollector.i(10085);
        l.d(str, "");
        c cVar = new c();
        cVar.f144780a = BitmapFactory.decodeResource(c.f115622a.getResources(), 2131232094);
        cVar.a(str);
        MethodCollector.o(10085);
    }

    @Override // com.ss.android.ugc.aweme.watermark.h
    public final g a(int i2, String str, boolean z, com.ss.android.ugc.aweme.account.model.a aVar, int[] iArr, String str2, boolean z2) {
        l.d(str, "");
        l.d(iArr, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(iArr, "");
        l.d(str2, "");
        VEWatermarkParam a2 = l.a(l.a(i2, str, z, iArr), aVar, iArr, true, str2, z2);
        if (a2 != null) {
            return new a(a2);
        }
        return null;
    }
}
