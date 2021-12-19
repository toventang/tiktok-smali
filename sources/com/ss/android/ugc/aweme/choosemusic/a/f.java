package com.ss.android.ugc.aweme.choosemusic.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f70297a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f70298b;

    static {
        Covode.recordClassIndex(43364);
    }

    f(b bVar, boolean z) {
        this.f70297a = bVar;
        this.f70298b = z;
    }

    public final void run() {
        b bVar = this.f70297a;
        boolean z = this.f70298b;
        if (bVar.f70281b != null) {
            RecyclerView.ViewHolder f2 = bVar.f70281b.f(bVar.f70282c);
            if (f2 instanceof s) {
                ((a) f2).a(z, true);
            }
        }
    }
}
