package com.ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.senor.a.b;
import com.ss.android.ugc.aweme.sticker.senor.a.d;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public final class DefaultSenorPresenter extends BaseSenorPresenter implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f135706b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private b f135707c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f135708d;

    /* renamed from: e  reason: collision with root package name */
    private final c f135709e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f135710f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f135711g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f135712h;

    static {
        Covode.recordClassIndex(88703);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88704);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void unRegister() {
        super.unRegister();
        b bVar = this.f135707c;
        if (bVar != null) {
            bVar.disable();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void a() {
        Sensor sensor;
        super.a();
        Sensor defaultSensor = c().getDefaultSensor(9);
        if (defaultSensor == null) {
            b bVar = new b(d(), this.f135709e);
            this.f135707c = bVar;
            bVar.enable();
        } else {
            com.ss.android.ugc.aweme.sticker.senor.a.c cVar = new com.ss.android.ugc.aweme.sticker.senor.a.c(this.f135709e, this.f135708d);
            c().registerListener(cVar, defaultSensor, a(defaultSensor.getType(), 100000, this.f135712h), e());
            a(cVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if ((this.f135710f && (sensor = c().getDefaultSensor(15)) != null) || (sensor = c().getDefaultSensor(11)) != null) {
            d dVar = new d(this.f135709e, this.f135708d);
            c().registerListener(dVar, sensor, a(sensor.getType(), 100000, this.f135712h), e());
            a(dVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultSenorPresenter(Context context, m mVar, boolean z, c cVar, boolean z2, Handler handler, boolean z3) {
        super(context, mVar, handler);
        l.d(cVar, "");
        if (context == null) {
            l.b();
        }
        if (mVar == null) {
            l.b();
        }
        this.f135708d = z;
        this.f135709e = cVar;
        this.f135710f = z2;
        this.f135711g = handler;
        this.f135712h = z3;
    }
}
