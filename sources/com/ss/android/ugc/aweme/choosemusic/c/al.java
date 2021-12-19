package com.ss.android.ugc.aweme.choosemusic.c;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class al extends r {
    public static final a u = new a((byte) 0);
    private HashMap v;

    static {
        Covode.recordClassIndex(43441);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43442);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.r
    public final void b() {
        ScrollableLayout scrollableLayout = this.f70500j;
        if (scrollableLayout != null) {
            scrollableLayout.setTabsMarginTop(n.a(44.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.r
    public final void c() {
        DmtTabLayout dmtTabLayout = this.f70498d;
        if (dmtTabLayout != null) {
            dmtTabLayout.setSelectedTabIndicatorHeight(n.a(2.0d));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.r
    public final void d() {
        com.ss.android.ugc.aweme.choosemusic.a.a();
        c.a(this, "", "click_my_music", (Bundle) null, (f) null);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.r, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.v;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.r
    public final void a(LinearLayout linearLayout) {
        if (linearLayout != null) {
            linearLayout.setShowDividers(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.r
    public final void a(b bVar) {
        l.d(bVar, "");
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof v) || !((v) parentFragment).f70405d) {
            com.ss.android.ugc.aweme.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar.a();
            l.b(aVar, "");
            int i2 = aVar.f70392d;
            MusicModel musicModel = aVar.f70393e;
            if (aVar.f70389a != 0) {
                return;
            }
            if (i2 == 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.a9j).a();
            } else if (i2 == 1) {
                d(musicModel);
            }
        }
    }
}
