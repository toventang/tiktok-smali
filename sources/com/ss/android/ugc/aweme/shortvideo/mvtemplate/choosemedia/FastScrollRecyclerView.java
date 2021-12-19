package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n;
import com.ss.android.ugc.aweme.utils.fw;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class FastScrollRecyclerView extends RecyclerView {
    public static final a R = new a((byte) 0);
    public n O;
    public Boolean P;
    public n.a Q;
    private final h S;

    public interface b {
        static {
            Covode.recordClassIndex(84541);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(84538);
    }

    private final int getScreenHeight() {
        return ((Number) this.S.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84540);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {
        final /* synthetic */ FastScrollRecyclerView this$0;

        static {
            Covode.recordClassIndex(84544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FastScrollRecyclerView fastScrollRecyclerView) {
            super(0);
            this.this$0 = fastScrollRecyclerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.common.utility.n.b(this.this$0.getContext()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n nVar = this.O;
        if (nVar != null) {
            nVar.a((RecyclerView) this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        n nVar = this.O;
        if (!(nVar == null || nVar.f129155c == null)) {
            nVar.f129155c.b(nVar.s);
            nVar.f129155c = null;
        }
        super.onDetachedFromWindow();
    }

    public final void setFastScrollEnabled(boolean z) {
        n nVar = this.O;
        if (nVar != null) {
            nVar.setEnabled(z);
        }
        this.P = Boolean.valueOf(z);
    }

    public final void setFastScrollListener(n.a aVar) {
        n nVar = this.O;
        if (nVar != null) {
            nVar.setFastScrollListener(aVar);
        }
        this.Q = aVar;
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        n nVar = this.O;
        if (nVar != null) {
            nVar.setVisibility(i2);
        }
    }

    public final void a(Context context) {
        n nVar = new n(context);
        this.O = nVar;
        nVar.setId(R.id.b0e);
        n nVar2 = this.O;
        if (nVar2 != null) {
            nVar2.setEnabled(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(RecyclerView.a<?> aVar) {
        n nVar;
        super.setAdapter(aVar);
        if ((aVar instanceof n.c) && (nVar = this.O) != null) {
            nVar.setSectionIndexer((n.c) aVar);
        }
    }

    static final class c extends m implements h.f.a.m<Context, AttributeSet, z> {
        final /* synthetic */ FastScrollRecyclerView this$0;

        static {
            Covode.recordClassIndex(84542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FastScrollRecyclerView fastScrollRecyclerView) {
            super(2);
            this.this$0 = fastScrollRecyclerView;
        }

        public final void a(Context context) {
            n nVar;
            n nVar2;
            l.d(context, "");
            this.this$0.a(context);
            n nVar3 = this.this$0.O;
            if (nVar3 != null) {
                nVar3.a((RecyclerView) this.this$0);
            }
            if ((this.this$0.getAdapter() instanceof n.c) && (nVar2 = this.this$0.O) != null) {
                nVar2.setSectionIndexer((n.c) this.this$0.getAdapter());
            }
            Boolean bool = this.this$0.P;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                n nVar4 = this.this$0.O;
                if (nVar4 != null) {
                    nVar4.setEnabled(booleanValue);
                }
            }
            n.a aVar = this.this$0.Q;
            if (aVar != null && (nVar = this.this$0.O) != null) {
                nVar.setFastScrollListener(aVar);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Context context, AttributeSet attributeSet) {
            a(context);
            return z.f158842a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FastScrollRecyclerView f128819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f128820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f128821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AttributeSet f128822d;

        static {
            Covode.recordClassIndex(84543);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            this.f128819a.b(this);
            this.f128820b.a(this.f128821c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (i2 != 0 || i3 != 0) {
                this.f128819a.b(this);
                this.f128820b.a(this.f128821c);
            }
        }

        d(FastScrollRecyclerView fastScrollRecyclerView, c cVar, Context context, AttributeSet attributeSet) {
            this.f128819a = fastScrollRecyclerView;
            this.f128820b = cVar;
            this.f128821c = context;
            this.f128822d = attributeSet;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean b(int i2, int i3) {
        if (Math.abs(i3) > getScreenHeight() * 5) {
            if (com.ss.android.ugc.aweme.setting.i.a.a() == 2) {
                RecyclerView.a adapter = getAdapter();
                if (!(adapter instanceof b)) {
                    adapter = null;
                }
                b bVar = (b) adapter;
                if (bVar != null) {
                    bVar.a();
                }
            }
            fw.a("tool_album_scroll_high_speed", 500, -1);
        }
        if (((double) h.i.c.Default.nextFloat()) < 0.1d) {
            fw.a("tool_album_scroll", 500, -1);
        }
        return super.b(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FastScrollRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.S = i.a((h.f.a.a) new e(this));
        a(new d(this, new c(this), context, attributeSet));
        a(new RecyclerView.n(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FastScrollRecyclerView f128818a;

            static {
                Covode.recordClassIndex(84539);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f128818a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                l.d(recyclerView, "");
                super.a(recyclerView, i2);
                if (com.ss.android.ugc.aweme.setting.i.a.a() == 2) {
                    if (i2 != 2) {
                        RecyclerView.a adapter = this.f128818a.getAdapter();
                        if (!(adapter instanceof b)) {
                            adapter = null;
                        }
                        b bVar = (b) adapter;
                        if (bVar != null) {
                            bVar.b();
                        }
                    } else {
                        return;
                    }
                }
                if (i2 != 2) {
                    fw.a("tool_album_scroll");
                    fw.a("tool_album_scroll_high_speed");
                }
            }
        });
        addOnAttachStateChangeListener(new f());
    }
}
