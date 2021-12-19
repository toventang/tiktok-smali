package com.ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.ss.android.ugc.tools.view.style.b;
import com.ss.android.ugc.tools.view.style.f;
import com.ss.android.ugc.tools.view.style.g;
import com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout;
import com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class FilterBoxListView extends AbstractLoadingLayout {

    /* renamed from: a  reason: collision with root package name */
    List<? extends p<EffectCategoryModel, ? extends List<f>>> f95762a;

    /* renamed from: b  reason: collision with root package name */
    public c f95763b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f95764c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f95765d;

    /* renamed from: j  reason: collision with root package name */
    private final RecyclerView f95766j;

    /* renamed from: k  reason: collision with root package name */
    private final RecyclerView f95767k;

    /* renamed from: l  reason: collision with root package name */
    private e f95768l = new e();

    public interface c {
        static {
            Covode.recordClassIndex(60701);
        }

        void a(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar);

        void b(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar);

        void c(EffectCategoryModel effectCategoryModel, com.ss.android.ugc.aweme.filter.repository.a.b bVar);
    }

    static {
        Covode.recordClassIndex(60691);
    }

    public final e getFilterBoxViewConfigure() {
        return this.f95768l;
    }

    public final class a extends com.ss.android.ugc.tools.view.widget.a.b<f> {

        /* renamed from: c  reason: collision with root package name */
        private ContextWrapper f95770c;

        static {
            Covode.recordClassIndex(60692);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a  reason: collision with other inner class name */
        public final class C2311a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public final int f95771a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f95772b;

            /* renamed from: c  reason: collision with root package name */
            private final SimpleDraweeView f95773c;

            /* renamed from: d  reason: collision with root package name */
            private final TextView f95774d;

            /* renamed from: e  reason: collision with root package name */
            private final ImageView f95775e;

            static {
                Covode.recordClassIndex(60693);
            }

            /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$a$a$a  reason: collision with other inner class name */
            static final class C2312a extends m implements h.f.a.a<z> {
                final /* synthetic */ C2311a this$0;

                static {
                    Covode.recordClassIndex(60696);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2312a(C2311a aVar) {
                    super(0);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    T t;
                    EffectCategoryModel effectCategoryModel;
                    if (this.this$0.getAdapterPosition() >= 0) {
                        f fVar = (f) this.this$0.f95772b.a(this.this$0.getAdapterPosition());
                        FilterBoxListView filterBoxListView = FilterBoxListView.this;
                        com.ss.android.ugc.aweme.filter.repository.a.b bVar = fVar.f95814a;
                        l.d(bVar, "");
                        List<? extends p<EffectCategoryModel, ? extends List<f>>> list = filterBoxListView.f95762a;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                t = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                t = it.next();
                                Iterator it2 = ((Iterable) t.getSecond()).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    if (l.a((Object) ((f) next).f95814a.f95539a.f95552c, (Object) bVar.f95539a.f95552c)) {
                                        if (next != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            T t2 = t;
                            if (!(t2 == null || (effectCategoryModel = (EffectCategoryModel) t2.getFirst()) == null)) {
                                if (fVar.f95814a.f95541c) {
                                    c cVar = FilterBoxListView.this.f95763b;
                                    if (cVar != null) {
                                        cVar.a(effectCategoryModel, fVar.f95814a);
                                    }
                                } else {
                                    fVar.f95815b = !fVar.f95815b;
                                    this.this$0.a(fVar);
                                    if (fVar.f95815b) {
                                        c cVar2 = FilterBoxListView.this.f95763b;
                                        if (cVar2 != null) {
                                            cVar2.b(effectCategoryModel, fVar.f95814a);
                                        }
                                    } else {
                                        c cVar3 = FilterBoxListView.this.f95763b;
                                        if (cVar3 != null) {
                                            cVar3.c(effectCategoryModel, fVar.f95814a);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                    return z.f158842a;
                }
            }

            public final void a(f fVar) {
                Drawable drawable;
                float f2;
                l.d(fVar, "");
                com.ss.android.ugc.tools.c.a.a(this.f95773c, String.valueOf(fVar.f95814a.f95539a.f95557h));
                this.f95774d.setText(fVar.f95814a.f95539a.f95552c);
                ImageView imageView = this.f95775e;
                if (fVar.f95815b) {
                    drawable = FilterBoxListView.this.f95765d;
                } else {
                    drawable = FilterBoxListView.this.f95764c;
                }
                imageView.setImageDrawable(drawable);
                if (fVar.f95814a.f95541c) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                imageView.setAlpha(f2);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2311a(a aVar, final LinearLayout linearLayout) {
                super(linearLayout);
                l.d(linearLayout, "");
                this.f95772b = aVar;
                View childAt = linearLayout.getChildAt(0);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) childAt;
                this.f95773c = simpleDraweeView;
                View childAt2 = linearLayout.getChildAt(1);
                Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                this.f95774d = (TextView) childAt2;
                View childAt3 = linearLayout.getChildAt(2);
                Objects.requireNonNull(childAt3, "null cannot be cast to non-null type android.widget.ImageView");
                this.f95775e = (ImageView) childAt3;
                Context context = FilterBoxListView.this.getContext();
                l.b(context, "");
                this.f95771a = context.getResources().getColor(R.color.ua);
                com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) simpleDraweeView.getHierarchy();
                aVar2 = aVar2 == null ? new com.facebook.drawee.f.b(FilterBoxListView.this.getResources()).a() : aVar2;
                e eVar = new e();
                eVar.a(FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95792a);
                if (!FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95792a) {
                    eVar.a((float) FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95793b);
                }
                l.b(aVar2, "");
                aVar2.a(eVar);
                aVar2.a(q.b.f47442h);
                simpleDraweeView.setHierarchy(aVar2);
                Context context2 = FilterBoxListView.this.getContext();
                l.b(context2, "");
                int a2 = (int) r.a(context2, (float) FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95794c);
                Context context3 = FilterBoxListView.this.getContext();
                l.b(context3, "");
                int a3 = (int) r.a(context3, (float) FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95795d);
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(a2, a3) : layoutParams;
                layoutParams.width = a2;
                layoutParams.height = a3;
                simpleDraweeView.setLayoutParams(layoutParams);
                final C2312a aVar3 = new C2312a(this);
                linearLayout.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.a.C2311a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60694);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        aVar3.invoke();
                    }
                });
                linearLayout.setOnTouchListener(new View.OnTouchListener(this) {
                    /* class com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.a.C2311a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C2311a f95777a;

                    static {
                        Covode.recordClassIndex(60695);
                    }

                    {
                        this.f95777a = r1;
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        l.b(motionEvent, "");
                        if (motionEvent.getAction() == 1) {
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(linearLayout, "backgroundColor", this.f95777a.f95771a, 16777215);
                            l.b(ofInt, "");
                            ofInt.setDuration(500L);
                            ofInt.setEvaluator(new ArgbEvaluator());
                            ofInt.start();
                        }
                        return false;
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            l.d(viewHolder, "");
            if (!(viewHolder instanceof C2311a)) {
                viewHolder = null;
            }
            C2311a aVar = (C2311a) viewHolder;
            if (aVar != null) {
                aVar.a((f) a(i2));
            }
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(10080);
            l.d(viewGroup, "");
            if (aVar.f95770c == null) {
                h.f.a.b<? super Context, ? extends ContextWrapper> bVar = FilterBoxListView.this.getFilterBoxViewConfigure().f95813b.f95796e;
                Context context = viewGroup.getContext();
                l.b(context, "");
                aVar.f95770c = (ContextWrapper) bVar.invoke(context);
            }
            ContextWrapper contextWrapper = aVar.f95770c;
            if (contextWrapper == null) {
                l.b();
            }
            View a3 = com.a.a(LayoutInflater.from(contextWrapper), R.layout.d8, viewGroup, false);
            if (a3 != null) {
                C2311a aVar2 = new C2311a(aVar, (LinearLayout) a3);
                try {
                    if (aVar2.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar2.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = aVar2.getClass().getName();
                MethodCollector.o(10080);
                return aVar2;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            MethodCollector.o(10080);
            throw nullPointerException;
        }
    }

    public final void setCallback(c cVar) {
        this.f95763b = cVar;
    }

    public final class b extends t<EffectCategoryModel, a> {

        /* renamed from: b  reason: collision with root package name */
        public String f95779b;

        static {
            Covode.recordClassIndex(60697);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            super(new j.e<EffectCategoryModel>() {
                /* class com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(60698);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // androidx.recyclerview.widget.j.e
                public final /* synthetic */ boolean a(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    EffectCategoryModel effectCategoryModel3 = effectCategoryModel;
                    EffectCategoryModel effectCategoryModel4 = effectCategoryModel2;
                    l.d(effectCategoryModel3, "");
                    l.d(effectCategoryModel4, "");
                    return l.a((Object) effectCategoryModel3.getName(), (Object) effectCategoryModel4.getName());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // androidx.recyclerview.widget.j.e
                public final /* synthetic */ boolean b(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    EffectCategoryModel effectCategoryModel3 = effectCategoryModel;
                    EffectCategoryModel effectCategoryModel4 = effectCategoryModel2;
                    l.d(effectCategoryModel3, "");
                    l.d(effectCategoryModel4, "");
                    return l.a((Object) effectCategoryModel3.getName(), (Object) effectCategoryModel4.getName());
                }
            });
        }

        public final class a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public final TextView f95781a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f95782b;

            static {
                Covode.recordClassIndex(60699);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, FrameLayout frameLayout) {
                super(frameLayout);
                l.d(frameLayout, "");
                this.f95782b = bVar;
                View childAt = frameLayout.getChildAt(0);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                this.f95781a = (TextView) childAt;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.b.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f95783a;

                    static {
                        Covode.recordClassIndex(60700);
                    }

                    {
                        this.f95783a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (this.f95783a.getAdapterPosition() >= 0) {
                            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f95783a.f95782b.a(this.f95783a.getAdapterPosition());
                            FilterBoxListView filterBoxListView = FilterBoxListView.this;
                            l.b(effectCategoryModel, "");
                            l.d(effectCategoryModel, "");
                            filterBoxListView.a(effectCategoryModel);
                            this.f95783a.f95782b.f95779b = effectCategoryModel.getName();
                            this.f95783a.f95782b.notifyDataSetChanged();
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            boolean a2;
            float f2;
            a aVar = (a) viewHolder;
            l.d(aVar, "");
            com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.ss.ugc.effectplatform.model.EffectCategoryModel) a(i2);
            String str = this.f95779b;
            if (str == null) {
                this.f95779b = effectCategoryModel.getName();
                a2 = true;
            } else {
                a2 = l.a((Object) str, (Object) effectCategoryModel.getName());
            }
            l.b(effectCategoryModel, "");
            l.d(effectCategoryModel, "");
            aVar.f95781a.setText(effectCategoryModel.getName());
            TextView textView = aVar.f95781a;
            if (a2) {
                f2 = 1.0f;
            } else {
                f2 = 0.5f;
            }
            textView.setAlpha(f2);
            if (a2) {
                aVar.f95781a.setTypeface(aVar.f95781a.getTypeface(), 1);
                return;
            }
            Typeface a3 = f.a(com.ss.android.ugc.tools.view.style.a.MEDIUM.getFONT_NAME());
            if (a3 != null) {
                aVar.f95781a.setTypeface(a3);
            } else {
                aVar.f95781a.setTypeface(aVar.f95781a.getTypeface(), 0);
            }
        }

        private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(10349);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.d9, viewGroup, false);
            if (a3 != null) {
                a aVar = new a(bVar, (FrameLayout) a3);
                try {
                    if (aVar.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = aVar.getClass().getName();
                MethodCollector.o(10349);
                return aVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            MethodCollector.o(10349);
            throw nullPointerException;
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    public final View a(Context context) {
        MethodCollector.i(10370);
        l.d(context, "");
        Space space = new Space(context);
        MethodCollector.o(10370);
        return space;
    }

    @Override // com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    public final View b(Context context) {
        MethodCollector.i(10372);
        l.d(context, "");
        Space space = new Space(context);
        MethodCollector.o(10372);
        return space;
    }

    public final void setFilterBoxViewConfigure(e eVar) {
        l.d(eVar, "");
        this.f95768l = eVar;
        RecyclerView.a adapter = this.f95766j.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        RecyclerView.a adapter2 = this.f95767k.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f95767k
            androidx.recyclerview.widget.RecyclerView$a r1 = r0.getAdapter()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.DetailAdapter"
            java.util.Objects.requireNonNull(r1, r0)
            com.ss.android.ugc.tools.view.widget.a.b r1 = (com.ss.android.ugc.tools.view.widget.a.b) r1
            if (r3 != 0) goto L_0x0015
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0011:
            r1.a(r0)
            return
        L_0x0015:
            java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, ? extends java.util.List<com.ss.android.ugc.aweme.filter.view.internal.filterbox.f>>> r0 = r2.f95762a
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = com.ss.android.ugc.aweme.filter.repository.a.a.a.a(r0, r3)
            if (r0 != 0) goto L_0x0011
        L_0x001f:
            h.f.b.l.b()
            goto L_0x0011
        L_0x0023:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.a(com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel):void");
    }

    public final void setCategoryMap(List<? extends p<EffectCategoryModel, ? extends List<com.ss.android.ugc.aweme.filter.repository.a.b>>> list) {
        l.d(list, "");
        setState(0);
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            Object first = t.getFirst();
            Iterable<com.ss.android.ugc.aweme.filter.repository.a.b> iterable = (Iterable) t.getSecond();
            ArrayList arrayList2 = new ArrayList(n.a(iterable, 10));
            for (com.ss.android.ugc.aweme.filter.repository.a.b bVar : iterable) {
                arrayList2.add(new f(bVar));
            }
            arrayList.add(v.a(first, arrayList2));
        }
        this.f95762a = arrayList;
        b bVar2 = new b();
        this.f95766j.setAdapter(bVar2);
        bVar2.a(com.ss.android.ugc.aweme.filter.repository.a.a.a.a(list));
        a((EffectCategoryModel) n.h(com.ss.android.ugc.aweme.filter.repository.a.a.a.a(list)));
    }

    public final class d extends RecyclerView.h {

        /* renamed from: b  reason: collision with root package name */
        private final int f95785b;

        static {
            Covode.recordClassIndex(60702);
        }

        public d(int i2) {
            this.f95785b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            if (RecyclerView.d(view) == 0) {
                rect.top = this.f95785b;
            }
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
        int i5;
        int i6;
        super.a(i2, i3);
        int i7 = 0;
        if (this.f150229e != null) {
            View view = this.f150229e;
            l.b(view, "");
            if (i3 == 0) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            view.setVisibility(i6);
        }
        View view2 = this.f150230f;
        l.b(view2, "");
        if (i3 == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view2.setVisibility(i4);
        View view3 = this.f150232h;
        l.b(view3, "");
        if (i3 == 2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        view3.setVisibility(i5);
        View view4 = this.f150231g;
        l.b(view4, "");
        if (i3 != 3) {
            i7 = 8;
        }
        view4.setVisibility(i7);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10535);
        Context context2 = getContext();
        l.b(context2, "");
        StyleRecyclerView styleRecyclerView = new StyleRecyclerView(context2, (AttributeSet) null, 6);
        styleRecyclerView.getContext();
        styleRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        styleRecyclerView.setAdapter(new b());
        Context context3 = styleRecyclerView.getContext();
        l.b(context3, "");
        styleRecyclerView.b(new d((int) r.a(context3, 8.0f)));
        this.f95766j = styleRecyclerView;
        Context context4 = getContext();
        l.b(context4, "");
        int color = context4.getResources().getColor(R.color.u_);
        Context context5 = getContext();
        l.b(context5, "");
        int dimensionPixelSize = context5.getResources().getDimensionPixelSize(R.dimen.cl);
        float f2 = (float) dimensionPixelSize;
        styleRecyclerView.setBackground(b.a.a().b(color).a(color, 0).a(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}).a());
        Context context6 = getContext();
        l.b(context6, "");
        StyleRecyclerView styleRecyclerView2 = new StyleRecyclerView(context6, (AttributeSet) null, 6);
        styleRecyclerView2.getContext();
        styleRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        styleRecyclerView2.setAdapter(new a());
        Context context7 = styleRecyclerView2.getContext();
        l.b(context7, "");
        styleRecyclerView2.b(new d((int) r.a(context7, 8.0f)));
        this.f95767k = styleRecyclerView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(styleRecyclerView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(styleRecyclerView2, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        Context context8 = getContext();
        l.b(context8, "");
        Drawable drawable = context8.getResources().getDrawable(2131232212);
        Context context9 = getContext();
        l.b(context9, "");
        this.f95764c = g.a(drawable, context9.getResources().getColor(R.color.uc));
        Context context10 = getContext();
        l.b(context10, "");
        this.f95765d = context10.getResources().getDrawable(2131232202);
        MethodCollector.o(10535);
    }
}
