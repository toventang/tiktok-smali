package com.ss.android.ugc.aweme.discover.service;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f82034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f82035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f82036c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List f82037d;

    static {
        Covode.recordClassIndex(51060);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        super.e(i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a(int i2, int i3) {
        super.a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final int a(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        return super.a(i2, oVar, sVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(RecyclerView recyclerView, Context context, View.OnClickListener onClickListener, List list) {
        super(0, false);
        this.f82034a = recyclerView;
        this.f82035b = context;
        this.f82036c = onClickListener;
        this.f82037d = list;
    }
}
