package com.ss.android.ugc.aweme.mvtemplate.view;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import h.f.b.l;

public final class c extends s {
    public static final String K = "detail_aweme_list_type";
    public static final String L = "event_label";
    public static final String M = "detail_id";
    public static final String N = "detail_aweme_from";
    public static final a O = new a((byte) 0);
    public MvModel I;
    public String J;
    private SparseArray P;

    @Override // com.ss.android.ugc.aweme.challenge.ui.a
    public final void c() {
        SparseArray sparseArray = this.P;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.challenge.ui.s
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72073);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72072);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final SmartRoute a(Aweme aweme, s.c cVar) {
        SmartRoute a2 = super.a(aweme, cVar);
        MvModel mvModel = this.I;
        if (mvModel != null) {
            a2.withParam("feed_data_movie_model", mvModel);
        }
        String str = this.J;
        if (str != null) {
            a2.withParam("feed_data_movie_group_id", str);
        }
        l.b(a2, "");
        return a2;
    }
}
