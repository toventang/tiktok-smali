package com.ss.android.ugc.aweme.mix.videodetail;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.detail.ui.l;

public final class i extends l {
    public static final a y = new a((byte) 0);
    private SparseArray z;

    static {
        Covode.recordClassIndex(70804);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70805);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.l
    public final p.a b() {
        p.a aVar = new p.a();
        aVar.a(a.class, "page_feed", 0, getArguments());
        return aVar;
    }
}
