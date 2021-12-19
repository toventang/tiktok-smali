package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f89143a;

    /* renamed from: b  reason: collision with root package name */
    public final d f89144b;

    /* renamed from: c  reason: collision with root package name */
    public final m f89145c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f89146d;

    /* renamed from: e  reason: collision with root package name */
    public final SwipeControlledViewPager f89147e;

    /* renamed from: f  reason: collision with root package name */
    public final int f89148f;

    /* renamed from: g  reason: collision with root package name */
    public final p f89149g;

    /* renamed from: h  reason: collision with root package name */
    private final h f89150h = i.a((h.f.a.a) new a(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f89151i = i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f89152j;

    static {
        Covode.recordClassIndex(56061);
    }

    public final View a() {
        return (View) this.f89150h.getValue();
    }

    public final SwipeControlledRecycleView b() {
        return (SwipeControlledRecycleView) this.f89151i.getValue();
    }

    public final a<com.ss.android.ugc.aweme.emoji.b.a> c() {
        return (a) this.f89152j.getValue();
    }

    static final class d extends h.f.b.m implements h.f.a.a<SwipeControlledRecycleView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SwipeControlledRecycleView invoke() {
            return this.this$0.a().findViewById(R.id.djj);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return com.a.a(LayoutInflater.from(this.this$0.f89146d.getContext()), R.layout.amu, this.this$0.f89146d, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c$c  reason: collision with other inner class name */
    static final class C2156c extends h.f.b.m implements h.f.a.a<a<com.ss.android.ugc.aweme.emoji.b.a>> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2156c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a<com.ss.android.ugc.aweme.emoji.b.a> invoke() {
            c cVar = this.this$0;
            int i2 = cVar.f89148f;
            if (i2 == 1) {
                return new i(cVar.f89145c);
            }
            if (i2 == 2) {
                return new h(cVar.f89145c);
            }
            if (i2 == 3) {
                return new e(cVar.f89145c);
            }
            if (i2 == 4) {
                return new g(cVar.f89145c);
            }
            if (i2 != 5) {
                return null;
            }
            m mVar = cVar.f89145c;
            SwipeControlledRecycleView b2 = cVar.b();
            l.b(b2, "");
            return new com.ss.android.ugc.aweme.emoji.sysemoji.p(mVar, b2, cVar.f89147e);
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f89153a;

        static {
            Covode.recordClassIndex(56063);
        }

        public b(c cVar) {
            this.f89153a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89153a.f89149g.a();
        }
    }

    public c(m mVar, ViewGroup viewGroup, SwipeControlledViewPager swipeControlledViewPager, int i2, p pVar) {
        l.d(mVar, "");
        l.d(viewGroup, "");
        l.d(swipeControlledViewPager, "");
        l.d(pVar, "");
        this.f89145c = mVar;
        this.f89146d = viewGroup;
        this.f89147e = swipeControlledViewPager;
        this.f89148f = i2;
        this.f89149g = pVar;
        View findViewById = a().findViewById(R.id.ajs);
        l.b(findViewById, "");
        this.f89143a = (ImageView) findViewById;
        this.f89152j = i.a((h.f.a.a) new C2156c(this));
        this.f89144b = new d();
    }
}
