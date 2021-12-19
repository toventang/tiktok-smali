package com.ss.android.ugc.aweme.kids.choosemusic.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class i extends a {
    public static final a o = new a((byte) 0);
    private HashMap p;

    static {
        Covode.recordClassIndex(67616);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67617);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
