package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public final class a extends r {

    /* renamed from: a  reason: collision with root package name */
    private f f59847a;

    static {
        Covode.recordClassIndex(36985);
    }

    public a() {
        if (t.f59923a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final void a(ByteBuffer byteBuffer, float[][] fArr) {
        f fVar = this.f59847a;
        if (fVar != null) {
            fVar.a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        f a2 = c.a();
        this.f59847a = a2;
        if (a2 != null) {
            return a2.a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
