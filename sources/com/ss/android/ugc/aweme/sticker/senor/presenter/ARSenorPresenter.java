package com.ss.android.ugc.aweme.sticker.senor.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.senor.a;
import com.ss.android.ugc.aweme.sticker.senor.a.a.d;
import com.ss.android.ugc.aweme.sticker.senor.a.b;
import com.ss.android.ugc.aweme.sticker.senor.c;
import h.f.b.l;

public final class ARSenorPresenter extends BaseSenorPresenter implements au {

    /* renamed from: b  reason: collision with root package name */
    private b f135692b;

    /* renamed from: c  reason: collision with root package name */
    private final c f135693c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f135694d;

    /* renamed from: e  reason: collision with root package name */
    private final a f135695e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f135696f;

    static {
        Covode.recordClassIndex(88700);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void unRegister() {
        super.unRegister();
        b bVar = this.f135692b;
        if (bVar != null) {
            bVar.disable();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, com.ss.android.ugc.aweme.sticker.senor.presenter.a
    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        super.a();
        a aVar = this.f135695e;
        boolean z4 = true;
        Sensor defaultSensor = c().getDefaultSensor(1);
        if (defaultSensor == null) {
            z = false;
        } else {
            com.ss.android.ugc.aweme.sticker.senor.a.a.a aVar2 = new com.ss.android.ugc.aweme.sticker.senor.a.a.a(this.f135695e, this.f135694d);
            c().registerListener(aVar2, defaultSensor, BaseSenorPresenter.a(this, defaultSensor.getType()), e());
            a(aVar2);
            z = true;
        }
        Sensor defaultSensor2 = c().getDefaultSensor(4);
        if (defaultSensor2 == null) {
            z2 = false;
        } else {
            com.ss.android.ugc.aweme.sticker.senor.a.a.c cVar = new com.ss.android.ugc.aweme.sticker.senor.a.a.c(this.f135694d, this.f135695e);
            c().registerListener(cVar, defaultSensor2, BaseSenorPresenter.a(this, defaultSensor2.getType()), e());
            a(cVar);
            z2 = true;
        }
        Sensor defaultSensor3 = c().getDefaultSensor(9);
        if (defaultSensor3 == null) {
            b bVar = new b(d(), this.f135693c);
            this.f135692b = bVar;
            bVar.enable();
            z3 = false;
        } else {
            com.ss.android.ugc.aweme.sticker.senor.a.a.b bVar2 = new com.ss.android.ugc.aweme.sticker.senor.a.a.b(this.f135695e, this.f135694d);
            c().registerListener(bVar2, defaultSensor3, BaseSenorPresenter.a(this, defaultSensor3.getType()), e());
            a(bVar2);
            z3 = true;
        }
        int i2 = Build.VERSION.SDK_INT;
        Sensor defaultSensor4 = c().getDefaultSensor(15);
        if (defaultSensor4 == null && (defaultSensor4 = c().getDefaultSensor(11)) == null) {
            z4 = false;
        } else {
            d dVar = new d(this.f135693c, c(), this.f135695e, this.f135694d);
            c().registerListener(dVar, defaultSensor4, BaseSenorPresenter.a(this, defaultSensor4.getType()), e());
            a(dVar);
        }
        aVar.a(z, z2, z3, z4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ARSenorPresenter(Context context, m mVar, boolean z, a aVar, Handler handler) {
        super(context, mVar, handler);
        l.d(aVar, "");
        if (context == null) {
            l.b();
        }
        if (mVar == null) {
            l.b();
        }
        this.f135694d = z;
        this.f135695e = aVar;
        this.f135696f = handler;
        this.f135693c = aVar.a();
    }
}
