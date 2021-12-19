package com.ss.android.ugc.aweme.sticker.types.multi;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.multi.a.a;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    a f136167a;

    /* renamed from: b  reason: collision with root package name */
    e f136168b;

    /* renamed from: c  reason: collision with root package name */
    List<Effect> f136169c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f136170d;

    /* renamed from: e  reason: collision with root package name */
    private i f136171e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayoutManager f136172f;

    static {
        Covode.recordClassIndex(88933);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void a() {
        this.f136170d.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.multi.a
    public final void b() {
        this.f136170d.setVisibility(8);
    }

    public final void a(h hVar) {
        this.f136167a.f136144b = hVar;
    }

    public final void a(List<Effect> list) {
        this.f136169c = list;
        a aVar = this.f136167a;
        aVar.f136143a = list;
        aVar.notifyDataSetChanged();
        aVar.f136146d = false;
    }

    public final void a(int i2) {
        this.f136167a.f136145c = i2;
        int k2 = this.f136172f.k();
        int m2 = this.f136172f.m();
        if (i2 <= k2 || i2 > m2) {
            this.f136170d.b(i2);
            return;
        }
        this.f136170d.scrollBy(0, this.f136170d.getChildAt(i2 - k2).getTop());
    }

    public d(e eVar, View view, o oVar, g gVar, b<Effect> bVar, k kVar, i iVar) {
        this.f136168b = eVar;
        this.f136170d = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.ed3)).a();
        this.f136171e = iVar;
        this.f136167a = new a(oVar, gVar, bVar, kVar);
        oVar.n().e().observe(this.f136168b, new e(this));
        bVar.k().observe(this.f136168b, new f(this, bVar));
        bVar.n().observe(this.f136168b, new g(this));
        this.f136170d.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f136172f = linearLayoutManager;
        this.f136170d.setLayoutManager(linearLayoutManager);
        this.f136170d.setAdapter(this.f136167a);
    }
}
