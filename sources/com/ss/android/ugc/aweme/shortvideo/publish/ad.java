package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.n;
import com.ss.android.ugc.aweme.property.dy;
import h.f.b.l;

public final class ad implements n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f129699b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final dy f129700a;

    static {
        Covode.recordClassIndex(85148);
    }

    @Override // com.ss.android.ml.n
    public final boolean c() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85149);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ml.n
    public final String a() {
        return this.f129700a.packageUrl;
    }

    @Override // com.ss.android.ml.n
    public final String b() {
        String str = this.f129700a.scene;
        if (str.length() == 0) {
            return "default";
        }
        return str;
    }

    @Override // com.ss.android.ml.n
    public final String d() {
        if (this.f129700a.type != 3) {
            return "tflite";
        }
        return "bytenn";
    }

    public ad(dy dyVar) {
        l.d(dyVar, "");
        this.f129700a = dyVar;
    }
}
