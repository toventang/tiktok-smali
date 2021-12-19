package com.ss.android.ugc.aweme.discover.adapter.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.n.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f80483e = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static final int f80484i;

    /* renamed from: a  reason: collision with root package name */
    SearchSugMobHelper f80485a;

    /* renamed from: b  reason: collision with root package name */
    final int f80486b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final String f80487c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.g.a f80488d;

    /* renamed from: f  reason: collision with root package name */
    private Integer f80489f;

    /* renamed from: g  reason: collision with root package name */
    private final String f80490g;

    /* renamed from: h  reason: collision with root package name */
    private final h f80491h;

    public interface b {
        static {
            Covode.recordClassIndex(50086);
        }

        void a(int i2);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.discover.h.b a() {
        return (com.ss.android.ugc.aweme.discover.h.b) this.f80491h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50085);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.f$f  reason: collision with other inner class name */
    static final class C1877f extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.h.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1877f f80503a = new C1877f();

        static {
            Covode.recordClassIndex(50090);
        }

        C1877f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.h.b invoke() {
            return SearchServiceImpl.t().f();
        }
    }

    static {
        Covode.recordClassIndex(50084);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f80484i = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.e f80502b;

        static {
            Covode.recordClassIndex(50089);
        }

        e(f fVar, com.ss.android.ugc.aweme.search.model.e eVar) {
            this.f80501a = fVar;
            this.f80502b = eVar;
        }

        public final void run() {
            ImageView imageView;
            f fVar = this.f80501a;
            int i2 = 8;
            if (!this.f80502b.a()) {
                View view = fVar.itemView;
                l.b(view, "");
                imageView = (ImageView) view.findViewById(R.id.bxr);
                l.b(imageView, "");
            } else {
                View view2 = fVar.itemView;
                l.b(view2, "");
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.adx);
                l.b(linearLayout, "");
                float width = (float) linearLayout.getWidth();
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                float applyDimension = width - TypedValue.applyDimension(1, 15.0f, system.getDisplayMetrics());
                View view3 = fVar.itemView;
                l.b(view3, "");
                TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.exf);
                l.b(tuxTextView, "");
                TextPaint paint = tuxTextView.getPaint();
                l.b(paint, "");
                View view4 = fVar.itemView;
                l.b(view4, "");
                TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.exf);
                l.b(tuxTextView2, "");
                float measureText = paint.measureText(tuxTextView2.getText().toString());
                View view5 = fVar.itemView;
                l.b(view5, "");
                imageView = (ImageView) view5.findViewById(R.id.bxr);
                l.b(imageView, "");
                if (measureText < applyDimension) {
                    i2 = 0;
                }
            }
            imageView.setVisibility(i2);
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.discover.m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.e f80493b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f80494c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f80495d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f80496e;

        static {
            Covode.recordClassIndex(50087);
        }

        @Override // com.ss.android.ugc.aweme.discover.m.c
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.aj
        public final void a(View view) {
            com.ss.android.ugc.aweme.search.model.e eVar;
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (eVar = this.f80493b) != null) {
                com.ss.android.ugc.aweme.discover.g.a aVar = this.f80492a.f80488d;
                if (aVar != null) {
                    aVar.a(eVar, this.f80494c, this.f80495d);
                }
                g.b(this.f80492a.f80487c, this.f80495d, eVar, this.f80496e);
            }
        }

        c(f fVar, com.ss.android.ugc.aweme.search.model.e eVar, String str, int i2, String str2) {
            this.f80492a = fVar;
            this.f80493b = eVar;
            this.f80494c = str;
            this.f80495d = i2;
            this.f80496e = str2;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.e f80498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f80499c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f80500d;

        static {
            Covode.recordClassIndex(50088);
        }

        d(f fVar, com.ss.android.ugc.aweme.search.model.e eVar, int i2, b bVar) {
            this.f80497a = fVar;
            this.f80498b = eVar;
            this.f80499c = i2;
            this.f80500d = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f80497a;
            com.ss.android.ugc.aweme.search.model.e eVar = this.f80498b;
            int i2 = this.f80499c;
            this.f80500d.a(fVar.getAdapterPosition());
            SearchHistoryManager.inst("").deleteSearchHistory(new SearchHistory(eVar.f121519b, fVar.f80488d.a()));
            SearchSugMobHelper searchSugMobHelper = fVar.f80485a;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.a("history", Integer.valueOf(i2), "clear", eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 <= 0) {
            i2 = f80484i;
        }
        Integer num = this.f80489f;
        if (num == null || num.intValue() != i2) {
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f80489f = Integer.valueOf(i2);
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, String str, int i2, com.ss.android.ugc.aweme.discover.g.a aVar) {
        super(view);
        String searchPosition;
        l.d(view, "");
        l.d(aVar, "");
        this.f80488d = aVar;
        this.f80490g = str;
        this.f80491h = i.a((h.f.a.a) C1877f.f80503a);
        View view2 = this.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) (!(context instanceof androidx.fragment.app.e) ? null : context);
        if (eVar != null) {
            this.f80485a = (SearchSugMobHelper) ae.a(eVar, (ad.b) null).a(SearchSugMobHelper.class);
        }
        a(i2);
        com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
        if (!(b2 == null || (searchPosition = b2.getSearchPosition()) == null || searchPosition.length() <= 0)) {
            str = searchPosition;
        }
        this.f80487c = str;
    }
}
