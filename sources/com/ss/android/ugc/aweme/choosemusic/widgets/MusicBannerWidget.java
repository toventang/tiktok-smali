package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.view.a;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.List;

public class MusicBannerWidget extends Widget implements u<b>, au {

    /* renamed from: a  reason: collision with root package name */
    a f71041a;

    /* renamed from: h  reason: collision with root package name */
    private int f71042h;

    /* renamed from: i  reason: collision with root package name */
    private int f71043i;

    static {
        Covode.recordClassIndex(43736);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f67010e.a("data_banner", (u<b>) this);
        this.f71042h = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
        super.onCreate();
    }

    public MusicBannerWidget(int i2) {
        this.f71043i = i2;
    }

    private void a(List<Banner> list) {
        if (list == null || list.size() <= 0) {
            this.f67009d.setVisibility(8);
            return;
        }
        this.f67009d.setVisibility(0);
        this.f71041a.a(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        b bVar2 = bVar;
        if (this.f71041a != null && bVar2 != null) {
            a((List) bVar2.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        this.f71041a = new a(view, this.f71042h, this.f71043i);
        a((List) this.f67010e.a("data_banner"));
    }
}
