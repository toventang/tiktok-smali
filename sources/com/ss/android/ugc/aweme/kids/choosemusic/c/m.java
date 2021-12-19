package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.kids.choosemusic.d.a;
import com.ss.android.ugc.aweme.kids.choosemusic.e.d;
import com.zhiliaoapp.musically.R;

public final class m extends d implements h.a, a {
    static {
        Covode.recordClassIndex(67623);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "hot_music_list_data";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String c() {
        return "refresh_status_hot_music_list";
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String d() {
        return "loadmore_status_hot_music_list";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final int n() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final String o() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        this.f105530d.c();
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void q() {
        if (this.f105530d != null) {
            this.f105530d.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.a
    public final void r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void m() {
        if (this.f105532j != null) {
            this.f105532j.a();
        }
        if (this.f105530d != null && this.f105531e != null) {
            com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar = this.f105530d;
            int intValue = ((Integer) ((b) this.f105531e.a("hot_music_list_data")).a("list_cursor")).intValue();
            if (!aVar.f105595g) {
                aVar.f105595g = true;
                aVar.f105589a.getHotMusicList(intValue, 20, false).a(new d(aVar), i.f4826c, null);
            }
        }
    }

    public static Fragment a(int i2) {
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        mVar.setArguments(bundle);
        return mVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.c.d
    public final c b(View view) {
        com.ss.android.ugc.aweme.kids.choosemusic.h.m mVar = new com.ss.android.ugc.aweme.kids.choosemusic.h.m(getContext(), view, this, R.string.dhm, this, this, this.f105533k);
        mVar.f105691a.setTitle(R.string.f9h);
        mVar.a(this);
        if (getContext() != null) {
            com.ss.android.ugc.aweme.kids.choosemusic.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page_detail", getContext().getString(R.string.f9h), "click_more", com.ss.android.ugc.aweme.kids.choosemusic.g.c.f105649a);
            aVar.a("recommend_mc_id");
            mVar.a(aVar);
        }
        mVar.a(new n(this));
        return mVar;
    }
}
