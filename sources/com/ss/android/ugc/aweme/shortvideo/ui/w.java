package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.listener.b;
import h.f.b.l;

public final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    public Handler f131943a;

    /* renamed from: b  reason: collision with root package name */
    public b f131944b;

    static {
        Covode.recordClassIndex(86451);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f131945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f131946b;

        static {
            Covode.recordClassIndex(86452);
        }

        a(w wVar, int i2) {
            this.f131945a = wVar;
            this.f131946b = i2;
        }

        public final void run() {
            this.f131945a.f131944b.a(this.f131946b);
        }
    }

    @Override // com.ss.android.medialib.listener.b
    public final void a(int i2) {
        this.f131943a.post(new a(this, i2));
    }

    @Override // com.ss.android.medialib.listener.b
    public final void a(int i2, int i3) {
        this.f131944b.a(i2, i3);
    }

    public w(Handler handler, b bVar) {
        l.d(handler, "");
        l.d(bVar, "");
        this.f131943a = handler;
        this.f131944b = bVar;
    }
}
