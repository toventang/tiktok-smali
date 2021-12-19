package com.ss.android.ugc.aweme.utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.k;
import h.f.b.l;

public final class de {

    /* renamed from: a  reason: collision with root package name */
    private final k f142817a = new k(300, 300) {
        /* class com.ss.android.ugc.aweme.utils.de.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f142818a = 300;

        static {
            Covode.recordClassIndex(93430);
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            l.d(view, "");
        }
    };

    static {
        Covode.recordClassIndex(93429);
    }

    public final boolean a(View view) {
        l.d(view, "");
        if (!k.f144627b) {
            return false;
        }
        this.f142817a.onClick(view);
        return true;
    }
}
