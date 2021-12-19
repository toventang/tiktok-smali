package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class b extends a {
    static {
        Covode.recordClassIndex(91868);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        Activity activity;
        e eVar;
        this.f140641b.f140703a = System.currentTimeMillis();
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 5;
        }
        WeakReference<Activity> weakReference = this.f140642c.f140678g;
        Activity activity2 = null;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof w) {
            WeakReference<Activity> weakReference2 = this.f140642c.f140678g;
            if (weakReference2 != null) {
                activity2 = weakReference2.get();
            }
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPreDownloadMusic");
            w.a a2 = ((w) activity2).a();
            if (a2.a()) {
                long a3 = this.f140641b.a("use music cache", "success");
                d dVar2 = this.f140642c.f140677f;
                if (dVar2 != null) {
                    dVar2.f140738g = (int) a3;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140642c.f140680i;
                if (bVar != null) {
                    MusicModel musicModel = a2.f129191a;
                    if (musicModel == null) {
                        l.b();
                    }
                    String str = a2.f129192b;
                    if (str == null) {
                        l.b();
                    }
                    bVar.a(musicModel, str, false);
                    return;
                }
                return;
            }
        }
        if (this.f140642c.f140676e) {
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar2 = this.f140642c.f140680i;
            if (bVar2 != null) {
                bVar2.a(a.C3716a.a(), "", false);
                return;
            }
            return;
        }
        MusicModel musicModel2 = this.f140642c.f140673b;
        if (musicModel2 != null && (eVar = this.f140640a) != null) {
            eVar.a(musicModel2);
        }
    }
}
