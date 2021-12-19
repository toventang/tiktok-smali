package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class c extends a {
    static {
        Covode.recordClassIndex(91869);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        Activity activity;
        Activity activity2;
        this.f140641b.f140703a = System.currentTimeMillis();
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 4;
        }
        if (this.f140642c.n == null || TextUtils.isEmpty(this.f140642c.f140684m) || !i.a(this.f140642c.f140684m)) {
            WeakReference<Activity> weakReference = this.f140642c.f140678g;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (activity instanceof w) {
                WeakReference<Activity> weakReference2 = this.f140642c.f140678g;
                if (weakReference2 != null) {
                    activity2 = weakReference2.get();
                } else {
                    activity2 = null;
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
            e eVar = this.f140640a;
            if (eVar != null) {
                eVar.a(null);
                return;
            }
            return;
        }
        long a4 = this.f140641b.a("use shoot same music cache", "success");
        d dVar3 = this.f140642c.f140677f;
        if (dVar3 != null) {
            dVar3.f140738g = (int) a4;
        }
        com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar3 = this.f140642c.f140680i;
        if (bVar3 != null) {
            MusicModel musicModel2 = this.f140642c.n;
            if (musicModel2 == null) {
                l.b();
            }
            String str2 = this.f140642c.f140684m;
            if (str2 == null) {
                l.b();
            }
            bVar3.a(musicModel2, str2, true);
        }
    }
}
