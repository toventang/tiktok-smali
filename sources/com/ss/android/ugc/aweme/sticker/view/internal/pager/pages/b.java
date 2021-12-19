package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.b.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class b extends g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f136443l = new a((byte) 0);

    static {
        Covode.recordClassIndex(89101);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89102);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> n() {
        return new FavoriteStickerListViewModel(this, d(), e(), f());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final void a(List<? extends Effect> list) {
        l.d(list, "");
        ADAPTER adapter = this.f136429d;
        if (adapter != null && getActivity() != null) {
            adapter.f136368i = this.f136430e;
            adapter.a(list);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        l.d(view, "");
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b2 = super.b(view);
        if (b2 instanceof d) {
            ((d) b2).a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, new C3563b(this));
        }
        return b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b$b  reason: collision with other inner class name */
    static final class C3563b extends m implements h.f.a.b<ViewGroup, View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3563b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            Object obj;
            MethodCollector.i(11420);
            l.d(viewGroup, "");
            h.f.a.b<? super ViewGroup, ? extends View> bVar = this.this$0.i().f136210f.f135205e;
            if (bVar == null || (obj = bVar.invoke(viewGroup)) == null) {
                obj = this.this$0.getLayoutInflater().inflate(R.layout.ab5, (ViewGroup) null);
                l.b(obj, "");
            }
            MethodCollector.o(11420);
            return obj;
        }
    }
}
