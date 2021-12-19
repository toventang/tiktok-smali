package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.kids.choosemusic.h.a;
import java.util.List;

public class MusicBannerWidget extends Widget implements u<b>, au {

    /* renamed from: a  reason: collision with root package name */
    a f105842a;

    /* renamed from: h  reason: collision with root package name */
    private int f105843h;

    static {
        Covode.recordClassIndex(67738);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f67010e.a("data_banner", (u<b>) this);
        this.f105843h = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    private void a(List<Banner> list) {
        if (list == null || list.size() <= 0) {
            this.f67009d.setVisibility(8);
            return;
        }
        this.f67009d.setVisibility(0);
        this.f105842a.a(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        b bVar2 = bVar;
        if (this.f105842a != null && bVar2 != null) {
            a((List) bVar2.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        this.f105842a = new a(view, this.f105843h);
        a((List) this.f67010e.a("data_banner"));
    }
}
