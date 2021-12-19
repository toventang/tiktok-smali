package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.net.f.f;
import com.ss.android.ugc.aweme.net.j;
import com.ss.android.ugc.aweme.net.l;
import java.util.ArrayList;
import java.util.List;

public final class InitTTNetTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107803a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69024);
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

    public static final class a {
        static {
            Covode.recordClassIndex(69025);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends l.a {
        static {
            Covode.recordClassIndex(69026);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.net.l.a
        public final void a() {
            j.a().a();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
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
    public final List<n> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NetworkInitTask());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        k.f93535i = true;
        a.b.f109011a.a("method_init_ttnet_duration", false);
        com.bytedance.ies.b.b.a.f31923a = new f(d.a());
        l.a.f112442a = new b();
        a.b.f109011a.b("method_init_ttnet_duration", false);
    }
}
