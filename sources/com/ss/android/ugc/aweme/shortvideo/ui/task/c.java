package com.ss.android.ugc.aweme.shortvideo.ui.task;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final e f131920a;

    static {
        Covode.recordClassIndex(86433);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        this.f131920a.runOnUiThread(new a(this));
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f131921a;

        static {
            Covode.recordClassIndex(86434);
        }

        a(c cVar) {
            this.f131921a = cVar;
        }

        public final void run() {
            l.f115658a.d().a().c(this.f131921a.f131920a);
        }
    }

    public c(e eVar) {
        h.f.b.l.d(eVar, "");
        this.f131920a = eVar;
    }
}
