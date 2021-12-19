package com.ss.android.ugc.aweme.discover.adapter.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.h.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.g.a;
import com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.ss.android.ugc.aweme.search.model.e;
import com.zhiliaoapp.musically.R;

public final class h extends RecyclerView.ViewHolder {
    private static final int n = f.b(48);

    /* renamed from: a  reason: collision with root package name */
    public long f80506a;

    /* renamed from: b  reason: collision with root package name */
    TextView f80507b;

    /* renamed from: c  reason: collision with root package name */
    SugCompletionView f80508c;

    /* renamed from: d  reason: collision with root package name */
    TuxIconView f80509d;

    /* renamed from: e  reason: collision with root package name */
    View f80510e;

    /* renamed from: f  reason: collision with root package name */
    View f80511f;

    /* renamed from: g  reason: collision with root package name */
    View f80512g;

    /* renamed from: h  reason: collision with root package name */
    public a f80513h;

    /* renamed from: i  reason: collision with root package name */
    public SugCompletionView.a f80514i;

    /* renamed from: j  reason: collision with root package name */
    public e f80515j;

    /* renamed from: k  reason: collision with root package name */
    String f80516k;

    /* renamed from: l  reason: collision with root package name */
    public int f80517l;

    /* renamed from: m  reason: collision with root package name */
    SearchSugMobHelper f80518m;
    private int o;

    static {
        Covode.recordClassIndex(50092);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 <= 0) {
            i2 = n;
        }
        if (this.o != i2) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i2;
            this.o = i2;
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    public h(View view, int i2, String str, a aVar, SugCompletionView.a aVar2) {
        super(view);
        this.f80513h = aVar;
        this.f80516k = str;
        this.f80514i = aVar2;
        this.f80507b = (TextView) view.findViewById(R.id.f8g);
        this.f80508c = (SugCompletionView) view.findViewById(R.id.c1q);
        this.f80509d = (TuxIconView) view.findViewById(R.id.c12);
        this.f80510e = view.findViewById(R.id.vh);
        this.f80511f = view.findViewById(R.id.bxr);
        this.f80512g = view.findViewById(R.id.adh);
        this.f80508c.setImageDrawable(c.a(i.f80524a).a(view.getContext()));
        this.f80508c.setOnClickListener(new j(this));
        this.f80508c.setKeyboardDismissHandler(this.f80514i);
        a(i2);
        Context context = this.itemView.getContext();
        if (context instanceof androidx.fragment.app.e) {
            this.f80518m = (SearchSugMobHelper) ae.a((androidx.fragment.app.e) context, (ad.b) null).a(SearchSugMobHelper.class);
        }
    }
}
