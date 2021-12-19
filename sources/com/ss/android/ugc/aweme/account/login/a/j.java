package com.ss.android.ugc.aweme.account.login.a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a.f;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.h;
import com.ss.android.ugc.aweme.account.login.a.d;
import com.ss.android.ugc.aweme.account.login.a.m;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class j extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63292b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f63293a;

    /* renamed from: c  reason: collision with root package name */
    private l f63294c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Integer> f63295d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final List<h> f63296e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63297f;

    /* renamed from: g  reason: collision with root package name */
    private final int f63298g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f63299h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f63300i;

    static {
        Covode.recordClassIndex(39007);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39008);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f63296e.size();
    }

    public final void a(l lVar) {
        l.d(lVar, "");
        this.f63294c = lVar;
    }

    public final void a(List<Integer> list) {
        l.d(list, "");
        this.f63295d.clear();
        this.f63295d.addAll(list);
    }

    public final void b(List<? extends h> list) {
        l.d(list, "");
        this.f63296e.clear();
        this.f63296e.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        Object b2 = n.b((List) this.f63296e, i2);
        if (l.a(b2, g.f63268a)) {
            return 0;
        }
        if (l.a(b2, b.f63249a)) {
            return 3;
        }
        if (l.a(b2, k.f63301a)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        l.d(viewHolder, "");
        if (getItemViewType(i2) == 1) {
            f fVar = (f) viewHolder;
            h hVar = this.f63296e.get(i2);
            a aVar = new a(this.f63295d.contains(Integer.valueOf(i2)), (long) (((i2 - this.f63298g) - 1) * 50));
            l.d(hVar, "");
            l.d(aVar, "");
            fVar.f63263a.setImageResource(hVar.f63270b);
            fVar.f63267e.setOnClickListener(hVar.f63271c);
            if (aVar.f63246a) {
                fVar.f63267e.setAlpha(0.0f);
            } else {
                fVar.f63267e.setAlpha(1.0f);
            }
            if (hVar.f63273e) {
                fVar.f63265c.setTextColor(b.c(fVar.f63267e.getContext(), R.color.f159928l));
                fVar.f63263a.setColorFilter(b.c(fVar.f63267e.getContext(), R.color.f159928l), PorterDuff.Mode.SRC_IN);
                fVar.f63264b.setBackground(b.a(fVar.f63267e.getContext(), (int) R.drawable.ii));
            }
            String string = fVar.f63267e.getContext().getString(hVar.f63272d);
            l.b(string, "");
            fVar.f63265c.setText(string);
            float measureText = fVar.f63265c.getPaint().measureText(string);
            if (com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 96.0f) + measureText > fVar.f63266d) {
                ViewGroup.LayoutParams layoutParams = fVar.f63265c.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
                aVar2.J = 0;
                aVar2.p = R.id.bi7;
                aVar2.f2048e = R.id.bi7;
                aVar2.q = -1;
                aVar2.f2047d = -1;
                if (measureText + com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 58.0f) > fVar.f63266d) {
                    fVar.f63267e.setPadding(fVar.f63267e.getPaddingLeft(), (int) com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 8.0f), fVar.f63267e.getPaddingRight(), (int) com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 8.0f));
                }
                aVar2.leftMargin = (int) com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 12.0f);
                int i4 = Build.VERSION.SDK_INT;
                aVar2.setMarginStart(aVar2.leftMargin);
            } else {
                ViewGroup.LayoutParams layoutParams2 = fVar.f63265c.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams2;
                aVar3.J = 1;
                aVar3.p = -1;
                aVar3.f2048e = -1;
                aVar3.q = 0;
                aVar3.f2047d = 0;
                fVar.f63267e.setPadding(fVar.f63267e.getPaddingLeft(), (int) com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 13.0f), fVar.f63267e.getPaddingRight(), (int) com.bytedance.common.utility.n.b(fVar.f63267e.getContext(), 13.0f));
                aVar3.leftMargin = 0;
                int i5 = Build.VERSION.SDK_INT;
                aVar3.setMarginStart(0);
            }
            fVar.f63265c.setLayoutParams(fVar.f63265c.getLayoutParams());
            if (!aVar.f63246a) {
                fVar.f63267e.setAlpha(1.0f);
            } else if (fVar.f63267e.getAlpha() != 1.0f) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar.f63267e, "alpha", 0.0f, 1.0f);
                l.b(ofFloat, "");
                ofFloat.setDuration(300L);
                ofFloat.setStartDelay(aVar.f63247b);
                ofFloat.start();
            }
        } else if (getItemViewType(i2) == 2) {
            m mVar = (m) viewHolder;
            l lVar = this.f63294c;
            mVar.f63302a = lVar;
            ((View) mVar.f63303b.getValue()).setOnClickListener(new m.a(lVar));
        } else if (getItemViewType(i2) == 3) {
            d dVar = (d) viewHolder;
            c cVar = this.f63293a;
            dVar.f63254b = cVar;
            View view = dVar.itemView;
            l.b(view, "");
            Context context = view.getContext();
            dVar.b().setOnClickListener(new d.a(cVar));
            dVar.c().setText(context.getString(R.string.c_9));
            h hVar2 = h.f62997b;
            View view2 = dVar.itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            String a2 = hVar2.a(context2);
            if (a2 != null) {
                dVar.c().setText(a2);
            }
            TuxTextView tuxTextView = (TuxTextView) dVar.f63253a.getValue();
            if (h.f62997b.a()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tuxTextView.setVisibility(i3);
            if (h.f62997b.b()) {
                ConstraintLayout b2 = dVar.b();
                View view3 = dVar.itemView;
                l.b(view3, "");
                b2.setBackgroundColor(f.b(view3.getResources(), R.color.bh, null));
                TextView c2 = dVar.c();
                View view4 = dVar.itemView;
                l.b(view4, "");
                c2.setTextColor(f.b(view4.getResources(), R.color.a9, null));
            } else {
                ConstraintLayout b3 = dVar.b();
                View view5 = dVar.itemView;
                l.b(view5, "");
                b3.setBackgroundColor(f.b(view5.getResources(), R.color.t, null));
                ConstraintLayout b4 = dVar.b();
                View view6 = dVar.itemView;
                l.b(view6, "");
                b4.setBackground(b.a(view6.getContext(), (int) R.drawable.ht));
                TextView c3 = dVar.c();
                View view7 = dVar.itemView;
                l.b(view7, "");
                c3.setTextColor(f.b(view7.getResources(), R.color.bx, null));
            }
            dVar.a().setVisibility(8);
            if (h.f62997b.d()) {
                l.b(context, "");
                dVar.a().setImageDrawable(f.a(context.getResources(), R.drawable.iv, null));
                dVar.a().setVisibility(0);
            }
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        int i3;
        int i4;
        MethodCollector.i(9420);
        l.d(viewGroup, "");
        if (i2 == 0) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (jVar.f63300i) {
                i3 = R.layout.gu;
            } else {
                i3 = R.layout.gt;
            }
            View a3 = com.a.a(from, i3, viewGroup, false);
            l.b(a3, "");
            viewHolder = new e(a3, jVar.f63297f);
        } else if (i2 == 2) {
            LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
            if (jVar.f63300i) {
                i4 = R.layout.gp;
            } else {
                i4 = R.layout.go;
            }
            View a4 = com.a.a(from2, i4, viewGroup, false);
            l.b(a4, "");
            viewHolder = new m(a4);
        } else if (i2 != 3) {
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.gn, viewGroup, false);
            l.b(a5, "");
            viewHolder = new f(a5);
        } else {
            View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.gl, viewGroup, false);
            l.b(a6, "");
            viewHolder = new d(a6);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(9420);
        return viewHolder;
    }

    public j(List<h> list, boolean z, int i2, boolean z2, boolean z3) {
        l.d(list, "");
        this.f63296e = list;
        this.f63297f = z;
        this.f63298g = i2;
        this.f63299h = z2;
        this.f63300i = z3;
    }
}
