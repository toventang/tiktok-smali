package com.bytedance.android.livesdk.rank.impl.f;

import android.os.CountDownTimer;
import com.bytedance.covode.number.Covode;

public final class m extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public a f20724a;

    public interface a {
        static {
            Covode.recordClassIndex(12259);
        }

        void a();

        void a(long j2);
    }

    static {
        Covode.recordClassIndex(12258);
    }

    public final void onFinish() {
        a aVar = this.f20724a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public m(long j2) {
        super(j2, 1000);
    }

    public final void onTick(long j2) {
        a aVar = this.f20724a;
        if (aVar != null) {
            aVar.a(j2);
        }
    }
}
