package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;

public final class bp implements v {

    /* renamed from: a  reason: collision with root package name */
    private final e f129076a;

    static {
        Covode.recordClassIndex(84715);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    public bp(e eVar) {
        l.d(eVar, "");
        this.f129076a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        l.d(intent, "");
        g.a().n().a(this.f129076a, intent.getParcelableArrayListExtra("key_choose_media_data"), intent);
    }
}
