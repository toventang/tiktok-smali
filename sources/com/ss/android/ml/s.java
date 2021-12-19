package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public final class s extends r {

    /* renamed from: a  reason: collision with root package name */
    private f f59922a;

    static {
        Covode.recordClassIndex(37035);
    }

    public s() {
        if (t.f59923a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final void a(ByteBuffer byteBuffer, float[][] fArr) {
        f fVar = this.f59922a;
        if (fVar != null) {
            fVar.a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        f b2 = c.b();
        this.f59922a = b2;
        if (b2 != null) {
            return b2.a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
