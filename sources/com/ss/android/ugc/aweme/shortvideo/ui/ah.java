package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class ah implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ag f131384a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f131385b;

    static {
        Covode.recordClassIndex(86080);
    }

    ah(ag agVar, Bundle bundle) {
        this.f131384a = agVar;
        this.f131385b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ag agVar = this.f131384a;
        Bundle bundle = this.f131385b;
        if (bundle != null) {
            agVar.f131382g = (Bitmap) bundle.getParcelable("cover_data");
        }
        if (agVar.f131382g == null && agVar.f125288c != null) {
            agVar.f131382g = agVar.f125288c.d();
        }
        return agVar.f131382g;
    }
}
