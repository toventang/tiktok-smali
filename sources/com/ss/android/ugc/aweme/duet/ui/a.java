package com.ss.android.ugc.aweme.duet.ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a extends s {
    public static final String I = "detail_aweme_list_type";
    public static final String J = "event_label";
    public static final String K = "detail_id";
    public static final String L = "detail_aweme_from";
    public static final C2008a M = new C2008a((byte) 0);
    private SparseArray N;

    @Override // com.ss.android.ugc.aweme.challenge.ui.a
    public final void c() {
        SparseArray sparseArray = this.N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.challenge.ui.s
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.a$a  reason: collision with other inner class name */
    public static final class C2008a {
        static {
            Covode.recordClassIndex(52457);
        }

        private C2008a() {
        }

        public /* synthetic */ C2008a(byte b2) {
            this();
        }

        static String a(String str) {
            return "\"" + str + "\"";
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84146a;

        static {
            Covode.recordClassIndex(52458);
        }

        b(a aVar) {
            this.f84146a = aVar;
        }

        public final void run() {
            T t = this.f84146a.f70205d.f76396h;
            if (t instanceof com.ss.android.ugc.aweme.duet.a.b) {
                ((com.ss.android.ugc.aweme.duet.a.b) t).a();
            }
        }
    }

    static {
        Covode.recordClassIndex(52456);
    }

    @Override // com.ss.android.ugc.aweme.detail.h, com.ss.android.ugc.aweme.challenge.ui.s
    public final void j() {
        View view = getView();
        if (view != null) {
            view.post(new b(this));
        }
        super.j();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final SmartRoute a(Aweme aweme, s.c cVar) {
        SmartRoute a2 = super.a(aweme, cVar);
        l.b(a2, "");
        return a2;
    }
}
