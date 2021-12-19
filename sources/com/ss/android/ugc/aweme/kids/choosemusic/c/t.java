package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.l;
import java.util.HashMap;

public final class t extends e {
    public static final a v = new a((byte) 0);
    private HashMap w;

    static {
        Covode.recordClassIndex(67631);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67632);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.e
    public final void a() {
        ScrollableLayout scrollableLayout = this.f105545k;
        if (scrollableLayout != null) {
            scrollableLayout.setTabsMarginTop(n.a(44.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.e
    public final void b() {
        DmtTabLayout dmtTabLayout = this.f105543e;
        if (dmtTabLayout != null) {
            dmtTabLayout.setSelectedTabIndicatorHeight(n.a(2.0d));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.choosemusic.c.e, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.e
    public final void a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setShowDividers(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.e
    public final void a(b bVar) {
        l.d(bVar, "");
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof i) || !((i) parentFragment).f105506b) {
            com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) bVar.a();
            l.b(aVar, "");
            int i2 = aVar.f105499d;
            MusicModel musicModel = aVar.f105500e;
            int i3 = aVar.f105496a;
            if (i2 == 1 && i3 == 0) {
                c(musicModel);
            }
        }
    }
}
