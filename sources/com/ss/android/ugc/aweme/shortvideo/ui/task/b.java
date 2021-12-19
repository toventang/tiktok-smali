package com.ss.android.ugc.aweme.shortvideo.ui.task;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f131918a;

    static {
        Covode.recordClassIndex(86431);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        this.f131918a.runOnUiThread(a.f131919a);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131919a = new a();

        static {
            Covode.recordClassIndex(86432);
        }

        a() {
        }

        public final void run() {
            g.a().K().a();
        }
    }

    public b(Activity activity) {
        l.d(activity, "");
        this.f131918a = activity;
    }
}
