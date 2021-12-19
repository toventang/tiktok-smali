package com.ss.android.ugc.aweme.arch.widgets;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

public class GenericWidget extends Widget implements f, u<b> {
    static {
        Covode.recordClassIndex(41291);
    }

    /* renamed from: a */
    public void onChanged(b bVar) {
    }

    public final void b() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final boolean ae_() {
        return super.ae_();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }
}
