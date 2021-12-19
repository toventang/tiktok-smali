package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.d.b;
import com.ss.android.ugc.aweme.search.model.d;

public abstract class p<T> extends g<T> {

    /* renamed from: d  reason: collision with root package name */
    public d f80577d;

    /* renamed from: e  reason: collision with root package name */
    protected a.b f80578e;

    /* renamed from: f  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.search.d.d f80579f;

    static {
        Covode.recordClassIndex(50130);
    }

    p() {
    }

    public final String l() {
        a.b bVar = this.f80578e;
        if (bVar == null || bVar.a() == null) {
            return "";
        }
        return this.f80578e.a().f105233a;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public int c_(View view) {
        return (int) n.b(view.getContext(), 45.0f);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        super.a(viewHolder, i2);
    }

    public p(d dVar, a.b bVar, b bVar2) {
        this.f80578e = bVar;
        this.f80577d = dVar;
        this.f80579f = new com.ss.android.ugc.aweme.search.d.d(SettingsManager.a().a("common_search_load_more_remains", 0), bVar2);
    }
}
