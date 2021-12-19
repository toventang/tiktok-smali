package com.ss.android.ugc.aweme.choosemusic.c;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.choosemusic.model.b;
import com.ss.android.ugc.aweme.choosemusic.view.u;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.a.h;
import com.zhiliaoapp.musically.R;

public final class z extends i implements h.a, h.a {
    static {
        Covode.recordClassIndex(43486);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final String b() {
        return "hot_music_list_data";
    }

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
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int o() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final String p() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final int q() {
        return R.layout.a1a;
    }

    public final void t() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.i, com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final void a() {
        super.a();
        this.f70467d.c(this.f70470k);
    }

    public final void u() {
        if (this.f70467d != null) {
            this.f70467d.c(this.f70470k);
        }
    }

    public final void v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void m() {
        if (this.f70469j != null) {
            this.f70469j.a();
        }
        if (this.f70467d != null && this.f70468e != null) {
            b bVar = this.f70467d;
            int intValue = ((Integer) ((com.ss.android.ugc.aweme.arch.b) this.f70468e.a("hot_music_list_data")).a("list_cursor")).intValue();
            int i2 = this.f70470k;
            if (!bVar.f70647h) {
                bVar.f70647h = true;
                bVar.f70640a.getHotMusicList(intValue, 20, false, i2).a(new com.ss.android.ugc.aweme.choosemusic.model.h(bVar), i.f4826c, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.i
    public final c b(View view) {
        u uVar;
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            uVar = new u(getContext(), view, this, R.string.ant, this, this, this.f70471l);
        } else {
            uVar = new u(getContext(), view, this, R.string.dhm, this, this, this.f70471l);
        }
        uVar.a(R.string.f9h);
        uVar.a(this);
        if (getContext() != null) {
            com.ss.android.ugc.aweme.choosemusic.b bVar = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page_detail", getContext().getString(R.string.f9h), "click_more", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
            bVar.a("recommend_mc_id");
            uVar.a(bVar);
        }
        uVar.a(new aa(this));
        return uVar;
    }

    public static Fragment a(int i2, int i3) {
        z zVar = new z();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        bundle.putInt("sound_page_scene", i3);
        zVar.setArguments(bundle);
        return zVar;
    }
}
