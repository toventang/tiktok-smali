package com.ss.android.ugc.aweme.detail.h;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.video.local.f;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f79741a;

    static {
        Covode.recordClassIndex(49552);
    }

    k(b bVar) {
        this.f79741a = bVar;
    }

    public final void run() {
        b bVar = this.f79741a;
        if (bVar.bD()) {
            aj bf = bVar.bf();
            if (bf != null) {
                bf.a(bf.b());
                AwemeChangeCallBack.a((e) bVar.bv, bf.b());
                if (bf.a() == 2) {
                    return;
                }
            }
            bVar.au();
            bVar.bk();
            if (f.f143475a && bf != null) {
                bf.r();
            }
        }
    }
}
