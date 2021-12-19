package com.ss.android.ugc.aweme.im.sdk.relations.ui.view;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.h;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.view.IndexView;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b extends c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f103310f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public IndexView f103311a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayoutManager f103312b;

    /* renamed from: c  reason: collision with root package name */
    public final float f103313c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f103314d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f103315e;
    private View v;
    private TextView w;
    private a x;

    static {
        Covode.recordClassIndex(66205);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66206);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void b() {
        super.b();
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar == null) {
            l.b();
        }
        aVar.f103182j = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void c() {
        super.c();
        if (this.f103324i) {
            IndexView indexView = this.f103311a;
            if (indexView == null) {
                l.a("mIndexView");
            }
            indexView.setVisibility(8);
            return;
        }
        IndexView indexView2 = this.f103311a;
        if (indexView2 == null) {
            l.a("mIndexView");
        }
        indexView2.setIndexLetters(this.f103315e);
        IndexView indexView3 = this.f103311a;
        if (indexView3 == null) {
            l.a("mIndexView");
        }
        indexView3.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void a() {
        View findViewById = this.t.findViewById(R.id.em8);
        l.b(findViewById, "");
        a((ImTextTitleBar) findViewById);
        View findViewById2 = this.t.findViewById(R.id.e_o);
        l.b(findViewById2, "");
        a((TuxStatusView) findViewById2);
        View findViewById3 = this.t.findViewById(R.id.djh);
        l.b(findViewById3, "");
        a((RecyclerView) findViewById3);
        this.f103312b = new LinearLayoutManager();
        f().setLayoutManager(this.f103312b);
        f().a(new C2621b(this, this.s));
        f().a(new c(this));
        View findViewById4 = this.t.findViewById(R.id.dv6);
        l.b(findViewById4, "");
        this.v = findViewById4;
        if (findViewById4 == null) {
            l.a("mSearchBar");
        }
        View findViewById5 = findViewById4.findViewById(R.id.dur);
        l.b(findViewById5, "");
        a((EditText) findViewById5);
        d().setTag("relation_search_tag");
        d().setHint(R.string.cag);
        View view = this.v;
        if (view == null) {
            l.a("mSearchBar");
        }
        View findViewById6 = view.findViewById(R.id.y0);
        l.b(findViewById6, "");
        a((ImageView) findViewById6);
        View findViewById7 = this.t.findViewById(R.id.bnz);
        l.b(findViewById7, "");
        this.f103311a = (IndexView) findViewById7;
        View findViewById8 = this.t.findViewById(R.id.bnw);
        l.b(findViewById8, "");
        this.w = (TextView) findViewById8;
        IndexView indexView = this.f103311a;
        if (indexView == null) {
            l.a("mIndexView");
        }
        indexView.setOnLetterTouchListener(new d(this));
        IndexView indexView2 = this.f103311a;
        if (indexView2 == null) {
            l.a("mIndexView");
        }
        TextView textView = this.w;
        if (textView == null) {
            l.a("mIndexLetterTv");
        }
        indexView2.setIndexLetterTv(textView);
    }

    public static final class c implements RecyclerView.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f103317a;

        static {
            Covode.recordClassIndex(66208);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.d(recyclerView, "");
            l.d(motionEvent, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f103317a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.d(recyclerView, "");
            l.d(motionEvent, "");
            if (motionEvent.getY() < this.f103317a.f103313c) {
                return true;
            }
            return false;
        }
    }

    static final class d implements IndexView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f103318a;

        static {
            Covode.recordClassIndex(66209);
        }

        d(b bVar) {
            this.f103318a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.IndexView.a
        public final void a(int i2) {
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.f103318a.o;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            int positionForSection = ((com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c) aVar).getPositionForSection(i2);
            if (this.f103318a.o != null) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.f103318a.o;
                if (aVar2 == null) {
                    l.b();
                }
                positionForSection += aVar2.b();
            }
            LinearLayoutManager linearLayoutManager = this.f103318a.f103312b;
            if (linearLayoutManager == null) {
                l.b();
            }
            linearLayoutManager.a(positionForSection, 0);
            r.onEventV3("index_bar_click");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void a(List<? extends IMContact> list) {
        l.d(list, "");
        this.f103324i = false;
        List<String> list2 = this.f103315e;
        List<Integer> list3 = this.f103314d;
        if (!(list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty())) {
            int[] iArr = new int[list3.size()];
            int size = list3.size();
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = list3.get(i2).intValue();
            }
            Object[] array = list2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            h hVar = new h((String[]) array, iArr);
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c cVar = (com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c) aVar;
            cVar.f103208m = hVar;
            cVar.n.f103210a = -1;
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.a((List<IMContact>) list);
            }
            if (this.x != null) {
                RecyclerView f2 = f();
                a aVar3 = this.x;
                if (aVar3 == null) {
                    l.b();
                }
                f2.c(aVar3);
            }
            this.x = new a(this.s, list2, list3);
            RecyclerView f3 = f();
            a aVar4 = this.x;
            if (aVar4 == null) {
                l.b();
            }
            f3.b(aVar4);
            c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.b$b  reason: collision with other inner class name */
    public static final class C2621b extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f103316a;

        static {
            Covode.recordClassIndex(66207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2621b(b bVar, Context context) {
            super(context);
            this.f103316a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            LinearLayoutManager linearLayoutManager = this.f103316a.f103312b;
            if (linearLayoutManager == null) {
                l.b();
            }
            int k2 = linearLayoutManager.k();
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.f103316a.o;
            if (aVar == null) {
                l.b();
            }
            int b2 = k2 - aVar.b();
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.f103316a.o;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
            int sectionForPosition = ((com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c) aVar2).getSectionForPosition(b2);
            List<String> list = this.f103316a.f103315e;
            if (list != null && !list.isEmpty() && sectionForPosition >= 0 && sectionForPosition < list.size()) {
                IndexView indexView = this.f103316a.f103311a;
                if (indexView == null) {
                    l.a("mIndexView");
                }
                indexView.setCurrentIndex(list.get(sectionForPosition));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (((float) i3) > n.b(this.f103316a.s, 10.0f)) {
                e.a(this.f103316a.s, this.f103316a.d());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void a(List<Integer> list, List<String> list2) {
        this.f103314d = list;
        this.f103315e = list2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c
    public final void a(List<? extends IMContact> list, CharSequence charSequence) {
        l.d(list, "");
        l.d(charSequence, "");
        this.f103324i = true;
        if (this.x != null) {
            RecyclerView f2 = f();
            a aVar = this.x;
            if (aVar == null) {
                l.b();
            }
            f2.c(aVar);
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.o;
        if (aVar2 == null) {
            l.b();
        }
        aVar2.a((List<IMContact>) list, charSequence);
        c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, View view, boolean z, List<Integer> list, List<String> list2) {
        super(activity, view, z);
        l.d(activity, "");
        l.d(view, "");
        this.f103314d = list;
        this.f103315e = list2;
        this.f103313c = n.b(activity, 32.0f);
    }
}
