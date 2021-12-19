package com.ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.n;
import h.f.b.l;

public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118637a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final SmartSliceModel f118638b;

    static {
        Covode.recordClassIndex(77046);
    }

    @Override // com.ss.android.ml.n
    public final boolean c() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77047);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ml.n
    public final String a() {
        return this.f118638b.getPackageUrl();
    }

    @Override // com.ss.android.ml.n
    public final String b() {
        String scene = this.f118638b.getScene();
        if (scene.length() == 0) {
            return "default";
        }
        return scene;
    }

    @Override // com.ss.android.ml.n
    public final String d() {
        if (this.f118638b.getType() != 2 && this.f118638b.getType() == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    public c(SmartSliceModel smartSliceModel) {
        l.d(smartSliceModel, "");
        this.f118638b = smartSliceModel;
    }
}
