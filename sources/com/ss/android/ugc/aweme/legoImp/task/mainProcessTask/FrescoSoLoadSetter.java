package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.facebook.imageutils.b;
import com.ss.android.ugc.aweme.application.o;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public final class FrescoSoLoadSetter implements w {
    static {
        Covode.recordClassIndex(69221);
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
        return ae.MAIN;
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
        b.f48470a = a.f107985a;
    }

    static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107985a = new a();

        static {
            Covode.recordClassIndex(69222);
        }

        a() {
        }

        @Override // com.facebook.imageutils.b.a
        public final void a(String str) {
            if (o.f66957b.get(str) == null) {
                Librarian.a(str, false, (Context) null);
            }
        }
    }
}
