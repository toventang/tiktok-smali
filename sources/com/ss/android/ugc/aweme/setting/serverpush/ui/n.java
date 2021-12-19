package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;

public final class n extends com.ss.android.ugc.aweme.dc.h {

    /* renamed from: a  reason: collision with root package name */
    public String f122661a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.be.h f122662b;

    static {
        Covode.recordClassIndex(80487);
    }

    @Override // com.ss.android.ugc.aweme.dc.h
    public final com.ss.android.ugc.aweme.be.h a() {
        return this.f122662b;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.h, com.ss.android.ugc.aweme.dc.a
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.be.h b() {
        return this.f122662b;
    }

    public n(com.ss.android.ugc.aweme.be.h hVar) {
        l.d(hVar, "");
        this.f122662b = hVar;
    }

    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        a((h.f.a.b) new d(this, onClickListener));
    }

    public final void b(String str) {
        l.d(str, "");
        a((h.f.a.b) new e(this, str));
    }

    public final void c(String str) {
        l.d(str, "");
        a((h.f.a.b) new f(this, str));
    }

    public final void a(Object obj) {
        a((h.f.a.b) new g(this, obj));
    }

    public final void b(boolean z) {
        a((h.f.a.b) new a(this, z));
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void c(boolean z) {
        a((h.f.a.b) new b(this, z));
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ boolean $boolean;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, boolean z) {
            super(1);
            this.this$0 = nVar;
            this.$boolean = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), this.$boolean, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ boolean $boolean;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, boolean z) {
            super(1);
            this.this$0 = nVar;
            this.$boolean = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, null, false, null, null, null, null, null, false, null, this.$boolean, false, null, 14335);
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ String $string;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, String str) {
            super(1);
            this.this$0 = nVar;
            this.$string = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, this.$string, null, false, null, null, null, null, null, false, null, false, false, null, 16381);
        }
    }

    static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ View.OnClickListener $listener;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar, View.OnClickListener onClickListener) {
            super(1);
            this.this$0 = nVar;
            this.$listener = onClickListener;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            View.OnClickListener onClickListener = this.$listener;
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, onClickListener, false, null, null, onClickListener, null, null, false, null, false, false, null, 16315);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ String $string;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar, String str) {
            super(1);
            this.this$0 = nVar;
            this.$string = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, null, false, null, null, null, null, null, false, null, false, false, this.$string, 8191);
        }
    }

    static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ String $string;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(n nVar, String str) {
            super(1);
            this.this$0 = nVar;
            this.$string = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, null, false, null, null, null, null, null, false, this.$string, false, false, null, 15359);
        }
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ Object $objects;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar, Object obj) {
            super(1);
            this.this$0 = nVar;
            this.$objects = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, null, false, null, this.$objects, null, null, null, false, null, false, false, null, 16351);
        }
    }

    static final class h extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(80495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(n nVar, boolean z) {
            super(1);
            this.this$0 = nVar;
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            l.d(hVar, "");
            return com.ss.android.ugc.aweme.be.h.a((com.ss.android.ugc.aweme.be.h) this.this$0.l(), false, null, null, this.$isVisible, null, null, null, null, null, false, null, false, false, null, 16375);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a((h.f.a.b) new c(this, str));
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void a(boolean z) {
        a((h.f.a.b) new h(this, z));
    }
}
