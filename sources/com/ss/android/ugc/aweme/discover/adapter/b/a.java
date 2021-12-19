package com.ss.android.ugc.aweme.discover.adapter.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: h  reason: collision with root package name */
    public static final C1874a f80428h = new C1874a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f80429a = i.a((h.f.a.a) new c(this));

    /* renamed from: b  reason: collision with root package name */
    final h f80430b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    final String f80431c;

    /* renamed from: d  reason: collision with root package name */
    public final View f80432d;

    /* renamed from: e  reason: collision with root package name */
    public final String f80433e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.g.a f80434f;

    /* renamed from: g  reason: collision with root package name */
    public final SugCompletionView.a f80435g;

    /* renamed from: i  reason: collision with root package name */
    private final h f80436i = i.a((h.f.a.a) f.f80442a);

    /* renamed from: j  reason: collision with root package name */
    private final h f80437j = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(50063);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.discover.h.b a() {
        return (com.ss.android.ugc.aweme.discover.h.b) this.f80436i.getValue();
    }

    /* access modifiers changed from: package-private */
    public final SmartAvatarImageView b() {
        return (SmartAvatarImageView) this.f80437j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$a  reason: collision with other inner class name */
    public static final class C1874a {
        static {
            Covode.recordClassIndex(50064);
        }

        private C1874a() {
        }

        public /* synthetic */ C1874a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.f80432d.findViewById(R.id.dtw);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.f80432d.findViewById(R.id.dtx);
        }
    }

    static final class d extends m implements h.f.a.a<SmartAvatarImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.this$0.f80432d.findViewById(R.id.dtv);
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.discover.m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f80438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.e f80439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f80440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f80441d;

        static {
            Covode.recordClassIndex(50068);
        }

        @Override // com.ss.android.ugc.aweme.discover.m.c
        public final void a() {
            SugCompletionView.a aVar = this.f80438a.f80435g;
            if (aVar != null) {
                aVar.a(this.f80439b, this.f80441d);
            }
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.aj
        public final void a(View view) {
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && this.f80439b != null) {
                SugCompletionView.a aVar = this.f80438a.f80435g;
                if (aVar != null) {
                    aVar.a();
                }
                com.ss.android.ugc.aweme.discover.g.a aVar2 = this.f80438a.f80434f;
                if (aVar2 != null) {
                    com.ss.android.ugc.aweme.search.model.e eVar = this.f80439b;
                    String str = this.f80440c;
                    if (str == null) {
                        str = "";
                    }
                    aVar2.a(eVar, str, this.f80441d);
                }
            }
        }

        e(a aVar, com.ss.android.ugc.aweme.search.model.e eVar, String str, int i2) {
            this.f80438a = aVar;
            this.f80439b = eVar;
            this.f80440c = str;
            this.f80441d = i2;
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.h.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f80442a = new f();

        static {
            Covode.recordClassIndex(50069);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.h.b invoke() {
            return SearchServiceImpl.t().f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, String str, com.ss.android.ugc.aweme.discover.g.a aVar, SugCompletionView.a aVar2) {
        super(view);
        l.d(view, "");
        this.f80432d = view;
        this.f80433e = str;
        this.f80434f = aVar;
        this.f80435g = aVar2;
        this.f80431c = str;
    }
}
