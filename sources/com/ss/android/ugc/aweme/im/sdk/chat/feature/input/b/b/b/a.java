package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.m;
import com.ss.android.ugc.aweme.emoji.emojichoose.n;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputViewDelegate;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.k;
import com.zhiliaoapp.musically.R;
import h.c.f;
import h.f.b.l;
import h.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;

public final class a extends com.ss.android.ugc.aweme.emoji.b.e implements com.ss.android.ugc.aweme.emoji.b.g, com.ss.android.ugc.aweme.emoji.d.c, com.ss.android.ugc.aweme.emoji.systembigemoji.d {

    /* renamed from: c  reason: collision with root package name */
    final LinearLayoutManager f100640c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f100641d;

    /* renamed from: e  reason: collision with root package name */
    public final n f100642e;

    /* renamed from: f  reason: collision with root package name */
    int f100643f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b f100644g;

    /* renamed from: h  reason: collision with root package name */
    private final am f100645h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f100646i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f100647j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f100648k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f100649l;
    private final com.ss.android.ugc.aweme.emoji.emojichoose.d o;

    static {
        Covode.recordClassIndex(64380);
    }

    private SwipeControlledViewPager j() {
        return (SwipeControlledViewPager) this.f100647j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final m a() {
        return null;
    }

    public final Button c() {
        return (Button) this.f100646i.getValue();
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView d() {
        return (RecyclerView) this.f100648k.getValue();
    }

    public final ImageView e() {
        return (ImageView) this.f100649l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final n b() {
        return this.f100642e;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.emoji.emojichoose.d f100651a = new com.ss.android.ugc.aweme.emoji.emojichoose.d();

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b f100652b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f100653c;

        static {
            Covode.recordClassIndex(64383);
        }

        public final b e() {
            this.f100651a.f89229g = 1;
            return this;
        }

        public final a g() {
            return new a(this.f100652b, this.f100651a, this.f100653c, (byte) 0);
        }

        public final b a() {
            this.f100651a.f89223a = true;
            this.f100651a.f89230h.add(1);
            return this;
        }

        public final b b() {
            this.f100651a.f89227e = true;
            this.f100651a.f89230h.add(5);
            return this;
        }

        public final b c() {
            this.f100651a.f89224b = true;
            this.f100651a.f89230h.add(3);
            return this;
        }

        public final b d() {
            this.f100651a.f89225c = true;
            this.f100651a.f89230h.add(4);
            return this;
        }

        public final b f() {
            this.f100651a.f89226d = true;
            this.f100651a.f89230h.add(2);
            return this;
        }

        public b(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar, ViewGroup viewGroup) {
            l.d(bVar, "");
            l.d(viewGroup, "");
            this.f100652b = bVar;
            this.f100653c = viewGroup;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<SwipeControlledViewPager> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SwipeControlledViewPager invoke() {
            return this.this$0.f89109b.findViewById(R.id.ava);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Button> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Button invoke() {
            return this.this$0.f89109b.findViewById(R.id.avd);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.f89109b.findViewById(R.id.avg);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.f89109b.findViewById(R.id.avl);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<InputViewDelegate> {
        final /* synthetic */ ViewGroup $parentContainer;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, ViewGroup viewGroup) {
            super(0);
            this.this$0 = aVar;
            this.$parentContainer = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InputViewDelegate invoke() {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar = this.this$0.f100644g;
            this.$parentContainer.getContext();
            return new InputViewDelegate(bVar);
        }
    }

    public final void f() {
        if (!com.ss.android.ugc.aweme.emoji.systembigemoji.a.b()) {
            this.f100642e.a();
            k();
        }
    }

    private final void k() {
        SwipeControlledViewPager j2 = j();
        l.b(j2, "");
        PagerAdapter adapter = j2.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void g() {
        if (this.o.f89225c) {
            l.d(this, "");
        }
        if (this.o.f89226d) {
            com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(this);
        }
        an.b(this.f100645h);
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        long i2 = i();
        com.ss.android.ugc.aweme.emoji.b.f fVar = this.f100642e.f89283a;
        if (i2 > 0) {
            l.b(fVar, "");
            if (fVar.i()) {
                com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new k(i2), new j());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long i() {
        com.ss.android.ugc.aweme.emoji.b.f fVar = this.f100642e.f89283a;
        if (fVar.j() != 2) {
            return -1;
        }
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiType");
        com.ss.android.ugc.aweme.emoji.systembigemoji.c cVar = (com.ss.android.ugc.aweme.emoji.systembigemoji.c) fVar;
        if (cVar.f89432d == null) {
            return -1;
        }
        com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar = cVar.f89432d;
        l.b(bVar, "");
        return bVar.getId();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$a  reason: collision with other inner class name */
    public static final class C2488a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64382);
        }

        public C2488a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            if (!(th instanceof CancellationException)) {
                com.ss.android.ugc.aweme.im.service.m.a.a(th);
            }
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100654a;

        static {
            Covode.recordClassIndex(64388);
        }

        public final boolean onLongClick(View view) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f100654a = aVar;
        }

        public final void onClick(View view) {
            if (l.a(view, this.f100654a.c())) {
                ((InputViewDelegate) this.f100654a.f100641d.getValue()).q();
            }
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        e().setOnClickListener(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
    public final void a(LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap) {
        f();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final void a(int i2) {
        this.f100642e.a(i2);
        j().setCurrentItem(this.f100642e.f89285c, false);
    }

    public final void a(boolean z) {
        Button c2 = c();
        l.b(c2, "");
        c2.setEnabled(z);
        if (z) {
            Button c3 = c();
            Button c4 = c();
            l.b(c4, "");
            Context context = c4.getContext();
            l.b(context, "");
            c3.setTextColor(context.getResources().getColor(R.color.t));
            return;
        }
        Button c5 = c();
        Button c6 = c();
        l.b(c6, "");
        Context context2 = c6.getContext();
        l.b(context2, "");
        c5.setTextColor(context2.getResources().getColor(R.color.c2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
    public final void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
        l.d(bVar, "");
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            int c2 = this.f100642e.c();
            for (int i2 = 0; i2 < c2; i2++) {
                com.ss.android.ugc.aweme.emoji.b.f b2 = this.f100642e.b(i2);
                if (b2.j() == 2) {
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiType");
                    com.ss.android.ugc.aweme.emoji.systembigemoji.c cVar = (com.ss.android.ugc.aweme.emoji.systembigemoji.c) b2;
                    if (l.a(cVar.f89432d, bVar)) {
                        cVar.f89431c = list;
                        n nVar = this.f100642e;
                        nVar.a(nVar.f89285c);
                        k();
                        j().setCurrentItem(this.f100642e.f89285c, false);
                        h();
                        return;
                    }
                }
            }
        }
    }

    private a(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar, com.ss.android.ugc.aweme.emoji.emojichoose.d dVar, ViewGroup viewGroup) {
        super(viewGroup, R.layout.z0);
        this.f100644g = bVar;
        this.o = dVar;
        this.f89109b.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f100640c = linearLayoutManager;
        this.f100645h = an.a(new C2488a(CoroutineExceptionHandler.f158926c));
        this.f100641d = i.a((h.f.a.a) new h(this, viewGroup));
        this.f100646i = i.a((h.f.a.a) new d(this));
        this.f100647j = i.a((h.f.a.a) new c(this));
        this.f100648k = i.a((h.f.a.a) new f(this));
        this.f100649l = i.a((h.f.a.a) new e(this));
        this.f100642e = new n(dVar);
        SwipeControlledViewPager j2 = j();
        l.b(j2, "");
        SwipeControlledViewPager j3 = j();
        l.b(j3, "");
        j2.setAdapter(new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.a(bVar, j3, this));
        RecyclerView d2 = d();
        l.b(d2, "");
        d2.setLayoutManager(linearLayoutManager);
        RecyclerView d3 = d();
        l.b(d3, "");
        d3.setAdapter(new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b(this));
        j().addOnPageChangeListener(new ViewPager.h(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f100650a;

            static {
                Covode.recordClassIndex(64381);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f100650a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
                if (r1.getLeft() < 0) goto L_0x0061;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
                if (r1 > r0.getWidth()) goto L_0x0061;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x015c, code lost:
                if (r6 == false) goto L_0x006c;
             */
            @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r10) {
                /*
                // Method dump skipped, instructions count: 352
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a.AnonymousClass1.onPageSelected(int):void");
            }
        });
        if (!dVar.f89225c) {
            View findViewById = this.f89109b.findViewById(R.id.c5l);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
        }
        k();
        c().setOnClickListener(new g(this));
        a(c());
        if (dVar.f89225c) {
            l.d(this, "");
        }
        if (dVar.f89226d) {
            l.d(this, "");
            if (!com.ss.android.ugc.aweme.emoji.systembigemoji.a.f89423b.contains(this)) {
                com.ss.android.ugc.aweme.emoji.systembigemoji.a.f89423b.add(this);
            }
            if (com.ss.android.ugc.aweme.emoji.systembigemoji.b.f89429b.f89437d) {
                com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(false);
            }
        }
    }

    public /* synthetic */ a(com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar, com.ss.android.ugc.aweme.emoji.emojichoose.d dVar, ViewGroup viewGroup, byte b2) {
        this(bVar, dVar, viewGroup);
    }
}
