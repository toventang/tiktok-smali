package com.ss.android.ugc.aweme.kids.choosemusic.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.i.a;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f105466a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f105467b = false;

    static {
        Covode.recordClassIndex(67581);
    }

    e(b bVar) {
        this.f105466a = bVar;
    }

    public final void run() {
        b bVar = this.f105466a;
        boolean z = this.f105467b;
        if (bVar.f105451b != null) {
            RecyclerView.ViewHolder f2 = bVar.f105451b.f(bVar.f105452c);
            if (f2 instanceof o) {
                ((a) f2).a(z, true);
            }
        }
    }
}
