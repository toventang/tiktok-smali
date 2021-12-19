package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.a;
import com.ss.android.ugc.aweme.editSticker.text.bean.h;
import com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout;
import com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationLayout;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class p extends AbstractLoadingLayout {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f88580a;

    /* renamed from: b  reason: collision with root package name */
    final k f88581b;

    /* renamed from: c  reason: collision with root package name */
    final LinearLayoutManager f88582c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f88583d;

    static {
        Covode.recordClassIndex(55747);
    }

    private View a() {
        if (this.f88583d == null) {
            this.f88583d = new HashMap();
        }
        View view = (View) this.f88583d.get(Integer.valueOf((int) R.id.drc));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.drc);
        this.f88583d.put(Integer.valueOf((int) R.id.drc), findViewById);
        return findViewById;
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        int indexOf = this.f88580a.indexOf(aVar);
        if (indexOf >= 0) {
            this.f88581b.notifyItemChanged(indexOf);
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    public final View a(Context context, AttributeSet attributeSet) {
        l.d(context, "");
        return new DoubleColorBallAnimationLayout(context, attributeSet, 0);
    }

    @Override // com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    public final void a(int i2, int i3) {
        int i4;
        super.a(i2, i3);
        int i5 = 0;
        if (this.f150229e != null) {
            View view = this.f150229e;
            l.b(view, "");
            if (i3 == 0) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view.setVisibility(i4);
        }
        View view2 = this.f150230f;
        l.b(view2, "");
        if (i3 != 1) {
            i5 = 8;
        }
        view2.setVisibility(i5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, r<? super a> rVar, r<? super h> rVar2, b<? super a, z> bVar) {
        super(context);
        l.d(context, "");
        l.d(rVar, "");
        l.d(rVar2, "");
        ArrayList arrayList = new ArrayList();
        this.f88580a = arrayList;
        k kVar = new k(arrayList, rVar, rVar2, bVar);
        this.f88581b = kVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f88582c = linearLayoutManager;
        com.a.a(LayoutInflater.from(context), R.layout.zg, this, true);
        RecyclerView recyclerView = (RecyclerView) a();
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a();
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(kVar);
    }
}
