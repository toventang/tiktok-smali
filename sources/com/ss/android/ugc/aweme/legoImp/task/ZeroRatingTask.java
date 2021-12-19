package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.b.j.c;
import com.bytedance.b.j.d.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.h;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import java.util.List;

public class ZeroRatingTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public boolean f107926a = true;

    static {
        Covode.recordClassIndex(69176);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (h.a() && !in.d()) {
            ZeroRatingServiceImpl.f().a();
            try {
                a aVar = (a) c.a(a.class);
                if (aVar != null) {
                    aVar.a(new com.bytedance.b.j.d.c() {
                        /* class com.ss.android.ugc.aweme.legoImp.task.ZeroRatingTask.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(69177);
                        }

                        @Override // com.bytedance.b.j.d.c
                        public final void b() {
                            ZeroRatingServiceImpl.f().e();
                        }

                        @Override // com.bytedance.b.j.d.c
                        public final void a() {
                            if (ZeroRatingTask.this.f107926a) {
                                ZeroRatingTask.this.f107926a = false;
                            } else {
                                ZeroRatingServiceImpl.f().d();
                            }
                        }
                    });
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
