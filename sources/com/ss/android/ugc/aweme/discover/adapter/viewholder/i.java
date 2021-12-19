package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class i extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final a f80668d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final al.d f80669a;

    /* renamed from: b  reason: collision with root package name */
    public final SearchIntermediateViewModel f80670b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f80671c;

    /* renamed from: e  reason: collision with root package name */
    private final h f80672e = h.i.a((h.f.a.a) b.f80673a);

    static {
        Covode.recordClassIndex(50174);
    }

    private final k a() {
        return (k) this.f80672e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50175);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80673a = new b();

        static {
            Covode.recordClassIndex(50176);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k((int) by.a(17), gb.a(GlobalContext.getContext()));
        }
    }

    private static boolean a(List<Word> list) {
        float b2 = (((float) com.ss.android.ugc.aweme.base.utils.i.b(GlobalContext.getContext())) - by.a(49)) / 2.0f;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(by.a(15));
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (textPaint.measureText(it.next().getWord()) > b2) {
                return true;
            }
        }
        return false;
    }

    public final void a(TypeWords typeWords) {
        List list;
        l.d(typeWords, "");
        List<Word> list2 = typeWords.words;
        boolean z = true;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (!TextUtils.isEmpty(t.getWord())) {
                    arrayList.add(t);
                }
            }
            list = n.g((Collection) arrayList);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            View view = this.itemView;
            l.b(view, "");
            view.setVisibility(8);
        } else {
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setVisibility(0);
        }
        View view3 = this.itemView;
        l.b(view3, "");
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.f8j);
        l.b(tuxTextView, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.a.a().a(d.f33801g);
            if (a2 != null) {
                View view4 = this.itemView;
                l.b(view4, "");
                ((TuxTextView) view4.findViewById(R.id.f8j)).setTypeface(a2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) by.a(8);
                marginLayoutParams.bottomMargin = (int) by.a(12);
            }
            View view5 = this.itemView;
            l.b(view5, "");
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.f8j);
            l.b(tuxTextView2, "");
            tuxTextView2.setLayoutParams(layoutParams);
        }
        View view6 = this.itemView;
        l.b(view6, "");
        RecyclerView recyclerView = (RecyclerView) view6.findViewById(R.id.een);
        l.b(recyclerView, "");
        recyclerView.setVisibility(0);
        boolean a3 = a(list);
        if (a3) {
            a().f80675a = (int) by.a(12);
        } else {
            a().f80675a = 0;
        }
        View view7 = this.itemView;
        l.b(view7, "");
        ((RecyclerView) view7.findViewById(R.id.een)).c(a());
        View view8 = this.itemView;
        l.b(view8, "");
        ((RecyclerView) view8.findViewById(R.id.een)).b(a());
        View view9 = this.itemView;
        l.b(view9, "");
        RecyclerView recyclerView2 = (RecyclerView) view9.findViewById(R.id.een);
        l.b(recyclerView2, "");
        View view10 = this.itemView;
        l.b(view10, "");
        view10.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(2));
        l lVar = new l(this.f80669a, typeWords.imprId, this.f80670b, this.f80671c);
        lVar.d(false);
        View view11 = this.itemView;
        l.b(view11, "");
        RecyclerView recyclerView3 = (RecyclerView) view11.findViewById(R.id.een);
        l.b(recyclerView3, "");
        recyclerView3.setAdapter(lVar);
        lVar.f80678a = a3;
        if (list == null) {
            list = new ArrayList();
        }
        lVar.b_(list);
        View view12 = this.itemView;
        l.b(view12, "");
        RecyclerView recyclerView4 = (RecyclerView) view12.findViewById(R.id.een);
        l.b(recyclerView4, "");
        ViewGroup.LayoutParams layoutParams2 = recyclerView4.getLayoutParams();
        View view13 = this.itemView;
        l.b(view13, "");
        RecyclerView recyclerView5 = (RecyclerView) view13.findViewById(R.id.een);
        l.b(recyclerView5, "");
        recyclerView5.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, al.d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view);
        l.d(view, "");
        this.f80669a = dVar;
        this.f80670b = searchIntermediateViewModel;
        this.f80671c = fragment;
    }
}
