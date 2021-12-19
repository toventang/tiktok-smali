package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.SystemClock;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.eh;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public final class InitLottieOptTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107790a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final e.a f107791b = b.f107792a;

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

    public static final class a {
        static {
            Covode.recordClassIndex(69000);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    static {
        Covode.recordClassIndex(68999);
    }

    static final class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107792a = new b();

        static {
            Covode.recordClassIndex(69001);
        }

        b() {
        }

        @Override // com.airbnb.lottie.g.e.a
        public final void a() {
            SystemClock.uptimeMillis();
            if (eh.f89912a) {
                d.b bVar = new d.b();
                bVar.a();
                bVar.b();
                bVar.a(eh.f89912a);
                bVar.b(eh.f89913b);
                bVar.c(eh.f89914c);
                bVar.d(eh.f89915d);
                bVar.e(eh.f89916e);
                bVar.f(eh.f89917f);
                bVar.g(eh.f89918g);
                bVar.h(eh.f89919h);
                bVar.i(eh.f89920i);
                bVar.j(eh.f89921j);
                d.a(bVar);
            } else {
                d.b bVar2 = new d.b();
                bVar2.a();
                bVar2.b();
                d.a(bVar2);
            }
            d.a.f5635k = eh.f89922k;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        SystemClock.uptimeMillis();
        e.f5653a = f107791b;
    }
}
