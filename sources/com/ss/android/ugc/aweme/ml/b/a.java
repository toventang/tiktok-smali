package com.ss.android.ugc.aweme.ml.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.n;
import com.ss.android.ugc.aweme.setting.model.MLModel;

public final class a implements n {

    /* renamed from: a  reason: collision with root package name */
    private MLModel f110398a;

    static {
        Covode.recordClassIndex(70896);
    }

    @Override // com.ss.android.ml.n
    public final boolean c() {
        if (this.f110398a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ml.n
    public final String a() {
        MLModel mLModel = this.f110398a;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    @Override // com.ss.android.ml.n
    public final String b() {
        MLModel mLModel = this.f110398a;
        if (mLModel == null || TextUtils.isEmpty(mLModel.scene)) {
            return "default";
        }
        return this.f110398a.scene;
    }

    @Override // com.ss.android.ml.n
    public final String d() {
        MLModel mLModel = this.f110398a;
        if (mLModel == null) {
            return "";
        }
        if (mLModel.type != 2 && this.f110398a.type == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    public final String toString() {
        return "AppMLModelConfig{model=" + this.f110398a + '}';
    }

    public a(MLModel mLModel) {
        this.f110398a = mLModel;
    }
}
