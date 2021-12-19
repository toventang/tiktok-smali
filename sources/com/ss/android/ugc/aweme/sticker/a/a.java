package com.ss.android.ugc.aweme.sticker.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f134695a;

    static {
        Covode.recordClassIndex(88036);
    }

    public abstract String a();

    public abstract void a(int i2, String str);

    public abstract boolean b();

    public a(d dVar) {
        l.d(dVar, "");
        this.f134695a = dVar;
    }

    public final void a(long j2, String str) {
        l.d(str, "");
        bj.d("Effect interface: " + a() + " send effect Msg: arg2: " + j2 + " msg: " + str);
        this.f134695a.D().a(41, 41, j2, str);
    }
}
