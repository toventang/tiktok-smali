package com.ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.senor.d;
import h.f.b.l;
import h.z;

public final class LandmarkARPresenter extends BaseSenorPresenter implements au {

    /* renamed from: b  reason: collision with root package name */
    public final d f135713b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f135714c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.b f135715d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f135716e;

    static {
        Covode.recordClassIndex(88705);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void unRegister() {
        super.unRegister();
        this.f135713b.a(false);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void a() {
        super.a();
        int i2 = Build.VERSION.SDK_INT;
        Sensor defaultSensor = c().getDefaultSensor(15);
        if (defaultSensor != null || (defaultSensor = c().getDefaultSensor(11)) != null) {
            this.f135713b.a(true);
            this.f135715d.a(new b(this));
            a aVar = new a(this.f135714c, this.f135713b);
            c().registerListener(aVar, defaultSensor, a(defaultSensor.getType(), 0, false), e());
            a(aVar);
        }
    }

    static final class a extends com.ss.android.ugc.aweme.sticker.senor.a.a {

        /* renamed from: c  reason: collision with root package name */
        private final d f135717c;

        static {
            Covode.recordClassIndex(88706);
        }

        public final void onAccuracyChanged(Sensor sensor, int i2) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            l.d(sensorEvent, "");
            double a2 = a(sensorEvent);
            if (this.f135676a) {
                this.f135717c.a(sensorEvent.values, a2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z, d dVar) {
            super(z);
            l.d(dVar, "");
            this.f135717c = dVar;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<float[], z> {
        final /* synthetic */ LandmarkARPresenter this$0;

        static {
            Covode.recordClassIndex(88707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LandmarkARPresenter landmarkARPresenter) {
            super(1);
            this.this$0 = landmarkARPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(float[] fArr) {
            float[] fArr2 = fArr;
            l.d(fArr2, "");
            this.this$0.f135713b.a(fArr2);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LandmarkARPresenter(Context context, m mVar, boolean z, com.ss.android.ugc.aweme.sticker.senor.b bVar) {
        super(context, mVar, null);
        l.d(context, "");
        l.d(mVar, "");
        l.d(bVar, "");
        this.f135714c = z;
        this.f135715d = bVar;
        this.f135716e = null;
        this.f135713b = bVar.b();
    }

    public /* synthetic */ LandmarkARPresenter(Context context, m mVar, boolean z, com.ss.android.ugc.aweme.sticker.senor.b bVar, byte b2) {
        this(context, mVar, z, bVar);
    }
}
