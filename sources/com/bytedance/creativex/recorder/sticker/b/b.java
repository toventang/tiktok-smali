package com.bytedance.creativex.recorder.sticker.b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.f;
import com.ss.android.ugc.aweme.sticker.senor.presenter.ARSenorPresenter;
import com.ss.android.ugc.aweme.sticker.senor.presenter.a;
import com.ss.android.vesdk.u;
import h.f.b.l;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public a f28385a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f28386b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28387c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<Boolean> f28388d;

    static {
        Covode.recordClassIndex(16674);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.f
    public final Handler c() {
        return this.f28386b;
    }

    private static boolean d() {
        u.d a2 = u.a().a("enable_build_in_sensor_service");
        if (a2 == null) {
            return false;
        }
        Object obj = a2.f151496b;
        l.b(obj, "");
        return ((Boolean) obj).booleanValue();
    }

    public final void a() {
        a aVar;
        if (!d() && (aVar = this.f28385a) != null && !aVar.b()) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.f
    public final void b() {
        a aVar;
        if (!d()) {
            if ((!this.f28388d.invoke().booleanValue() || !(this.f28385a instanceof ARSenorPresenter)) && (aVar = this.f28385a) != null && aVar.b()) {
                aVar.unRegister();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.f
    public final void a(a aVar, boolean z) {
        a aVar2;
        l.d(aVar, "");
        a aVar3 = this.f28385a;
        if (z || aVar3 == null || (!l.a(aVar.getClass(), aVar3.getClass())) || ((aVar2 = this.f28385a) != null && !aVar2.b())) {
            b();
            this.f28385a = aVar;
            a();
        }
    }

    public b(Handler handler, boolean z, h.f.a.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f28386b = handler;
        this.f28387c = z;
        this.f28388d = aVar;
    }
}
