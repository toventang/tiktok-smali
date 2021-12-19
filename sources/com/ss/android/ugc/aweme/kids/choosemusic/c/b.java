package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.e;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.choosemusic.h.q;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;

public abstract class b extends a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, h.a, a.AbstractC1744a {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f105517a;

    /* renamed from: b  reason: collision with root package name */
    TuxStatusView f105518b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f105519c;

    /* renamed from: d  reason: collision with root package name */
    public e f105520d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.a.a f105521e;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.kids.choosemusic.d.b f105522j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.kids.choosemusic.d.e f105523k;

    /* renamed from: l  reason: collision with root package name */
    c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> f105524l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.e.a f105525m;
    private int n;
    private int o;

    static {
        Covode.recordClassIndex(67602);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar);

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        return this.f105517a;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void c() {
        com.ss.android.ugc.aweme.kids.choosemusic.a.a aVar;
        int i2 = this.o - 2;
        if (i2 < 0) {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.kids.choosemusic.e.a aVar2 = this.f105525m;
        if (!aVar2.f105591c) {
            aVar2.f105591c = true;
            ChooseMusicApi.f105495a.musicCollectionFeed(Integer.valueOf(i2), 10).a(new com.ss.android.ugc.aweme.kids.choosemusic.e.c(aVar2, o.a()), i.f4826c, null);
        }
        if (ab_() && (aVar = this.f105521e) != null) {
            aVar.ag_();
        }
    }

    public final void a(int i2) {
        com.ss.android.ugc.aweme.kids.choosemusic.a.a aVar = this.f105521e;
        if (aVar != null) {
            aVar.d(i2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i2 = 1;
        }
        this.n = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        com.ss.android.ugc.aweme.kids.choosemusic.a.a aVar;
        super.setUserVisibleHint(z);
        if (this.f105517a != null && z && (aVar = this.f105521e) != null) {
            aVar.a(true);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // androidx.lifecycle.u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b r11) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.choosemusic.c.b.onChanged(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.adh, viewGroup, false);
        this.f105517a = (RecyclerView) a2.findViewById(R.id.cb7);
        this.f105518b = (TuxStatusView) a2.findViewById(R.id.e_o);
        com.ss.android.ugc.aweme.kids.choosemusic.a.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.a.a(this.f105520d, this.f105519c, this.f105522j, this.f105523k, this.f105524l, this.n);
        this.f105521e = aVar;
        aVar.a((h.a) this);
        this.f105521e.g(androidx.core.content.b.c(getContext(), R.color.c5));
        this.f105517a.setOverScrollMode(2);
        RecyclerView recyclerView = this.f105517a;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f105517a.setAdapter(this.f105521e);
        new q(new c(this), 5).a(this.f105517a);
        this.f105519c.a("list", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("should_load_more_pick", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("music_collect_status", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("collection_feed_status", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        return a2;
    }
}
