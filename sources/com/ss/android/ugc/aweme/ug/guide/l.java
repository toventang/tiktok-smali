package com.ss.android.ugc.aweme.ug.guide;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.guide.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.ui.av;
import com.ss.android.ugc.aweme.main.ax;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.ug.guide.j;
import com.ss.android.ugc.aweme.utils.fh;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final al f141936a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.share.viewmodel.a f141937b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f141938c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f141939d = new a(this);

    static {
        Covode.recordClassIndex(92743);
    }

    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f141941a;

        static {
            Covode.recordClassIndex(92745);
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void b() {
            this.f141941a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(l lVar) {
            this.f141941a = lVar;
        }
    }

    public static final class c implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f141942a;

        static {
            Covode.recordClassIndex(92746);
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void b() {
            this.f141942a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(l lVar) {
            this.f141942a = lVar;
        }
    }

    public static final class d implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f141943a;

        static {
            Covode.recordClassIndex(92747);
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.share.viewmodel.a.b
        public final void b() {
            this.f141943a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d(l lVar) {
            this.f141943a = lVar;
        }
    }

    public final void c() {
        this.f141938c.removeCallbacks(this.f141939d);
    }

    private static boolean e() {
        Aweme f2 = f();
        if (f2 == null || f2.isAd()) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (b()) {
            this.f141936a.aB();
        }
    }

    private static Aweme f() {
        Activity j2 = f.j();
        if (!(j2 instanceof e)) {
            j2 = null;
        }
        e eVar = (e) j2;
        if (eVar == null) {
            return null;
        }
        return AwemeChangeCallBack.a(eVar);
    }

    public final void a() {
        if (b() && !i.b()) {
            this.f141936a.aB();
            i.a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
        }
    }

    private final boolean g() {
        boolean z;
        al alVar = this.f141936a;
        if (alVar instanceof com.ss.android.ugc.aweme.feed.q.a) {
            z = ((com.ss.android.ugc.aweme.feed.q.a) alVar).bA();
        } else {
            z = false;
        }
        if (!z) {
            int aF = this.f141936a.aF() - 1;
            VerticalViewPager aQ = this.f141936a.aQ();
            h.f.b.l.b(aQ, "");
            if (aF != aQ.getCurrentItem()) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean h() {
        if (this.f141937b.a("share_panel") || this.f141937b.a("comment_panel") || this.f141937b.a("login_panel")) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (this.f141937b.a("swipe_up_guide") || !h() || e() || ax.f109172a || !i.d() || !g() || !ShareDependService.a.a().b()) {
            return false;
        }
        return true;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f141940a;

        static {
            Covode.recordClassIndex(92744);
        }

        a(l lVar) {
            this.f141940a = lVar;
        }

        public final void run() {
            if (this.f141940a.b() && this.f141940a.f141936a.ay_() != null) {
                boolean z = !fh.a(this.f141940a.f141936a.ay_(), false, false);
                if (this.f141940a.f141936a instanceof av) {
                    VerticalViewPager aQ = this.f141940a.f141936a.aQ();
                    h.f.b.l.b(aQ, "");
                    if (aQ.getCurrentItem() != 0) {
                        return;
                    }
                }
                if (z) {
                    this.f141940a.f141936a.aB();
                    i.a().edit().putBoolean("hasShowedSwipeUpGuideAfterVideoPlay", true).apply();
                }
            }
        }
    }

    public final void a(long j2) {
        if (!j.a.a() || !i.b()) {
            this.f141938c.postDelayed(this.f141939d, j2);
        }
    }

    public l(al alVar, com.ss.android.ugc.aweme.share.viewmodel.a aVar) {
        h.f.b.l.d(alVar, "");
        h.f.b.l.d(aVar, "");
        this.f141936a = alVar;
        this.f141937b = aVar;
    }
}
