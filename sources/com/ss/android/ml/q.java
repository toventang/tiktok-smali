package com.ss.android.ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    f f59911a;

    /* renamed from: b  reason: collision with root package name */
    private String f59912b;

    static {
        Covode.recordClassIndex(37033);
    }

    public q() {
        if (t.f59923a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    public q(String str) {
        if (str != null) {
            this.f59912b = str.toLowerCase();
        }
        if (t.f59923a) {
            new Throwable("not crash, only for debug!!");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final void a(ByteBuffer byteBuffer, float[][] fArr) {
        f fVar = this.f59911a;
        if (fVar != null) {
            fVar.a(byteBuffer, fArr);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ml.r
    public final boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        if (TextUtils.isEmpty(this.f59912b) && mLConfigModel.model_type != null) {
            this.f59912b = mLConfigModel.model_type.toLowerCase();
        }
        if (this.f59911a == null) {
            if (!TextUtils.isEmpty(this.f59912b) && this.f59912b.startsWith("byte")) {
                f a2 = c.a();
                this.f59911a = a2;
                if (a2 == null && t.f59923a) {
                    throw new RuntimeException("bytenn disabled, please config bytenn. model type: " + this.f59912b);
                }
            } else if (!TextUtils.isEmpty(this.f59912b) && this.f59912b.startsWith("tf")) {
                f b2 = c.b();
                this.f59911a = b2;
                if (b2 == null && t.f59923a) {
                    throw new RuntimeException("tensorflow lite disabled, please config tensorflow lite. model type: " + this.f59912b);
                }
            } else if (t.f59923a) {
                throw new RuntimeException("invalid model type: " + this.f59912b);
            }
        }
        f fVar = this.f59911a;
        if (fVar != null) {
            return fVar.a(mappedByteBuffer, mLConfigModel);
        }
        return false;
    }
}
