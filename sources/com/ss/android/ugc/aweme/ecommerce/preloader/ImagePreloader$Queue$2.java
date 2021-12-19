package com.ss.android.ugc.aweme.ecommerce.preloader;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.preloader.d;

public final class ImagePreloader$Queue$2 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.c f86943a;

    static {
        Covode.recordClassIndex(54505);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            resume();
        } else if (aVar == i.a.ON_PAUSE) {
            pause();
        } else if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void pause() {
        this.f86943a.isResumed = false;
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy() {
        this.f86943a.clear();
        d.f86959a.remove(this.f86943a);
    }

    @v(a = i.a.ON_RESUME)
    public final void resume() {
        this.f86943a.isResumed = true;
        if (this.f86943a.size() > 0) {
            d.b();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ImagePreloader$Queue$2(d.c cVar) {
        this.f86943a = cVar;
    }
}
