package com.ss.android.ugc.aweme.setting.unit.a;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class a extends com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.setting.ui.b.a> {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.setting.ui.b.a f122946a;

    static {
        Covode.recordClassIndex(80715);
    }

    private /* synthetic */ a() {
        this(null);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a b() {
        com.ss.android.ugc.aweme.setting.ui.b.a aVar = this.f122946a;
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("pls pass CommonItemViewItem or extends the I18nSettingUnit");
    }

    public a(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
        this.f122946a = aVar;
    }

    public final void a(int i2) {
        a(new j(this, i2));
    }

    public final void a(Drawable drawable) {
        l.d(drawable, "");
        a(new C3184a(this, drawable));
    }

    public final void b(String str) {
        l.d(str, "");
        a(new k(this, str));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.a.a$a  reason: collision with other inner class name */
    static final class C3184a extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ Drawable $d;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3184a(a aVar, Drawable drawable) {
            super(1);
            this.this$0 = aVar;
            this.$d = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, null, this.$d, 0, false, false, 0, false, 0, null, false, null, null, false, 1048319);
        }
    }

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ int $colorRes = R.color.c5;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, null, null, 0, false, true, this.$colorRes, false, 0, null, false, null, null, false, 1042431);
        }
    }

    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ Drawable $d;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, Drawable drawable) {
            super(1);
            this.this$0 = aVar;
            this.$d = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, null, null, 0, false, false, 0, false, 0, this.$d, false, null, null, false, 1015807);
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ int $v = 0;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, null, null, 0, false, false, 0, true, this.$v, null, false, null, null, false, 1023999);
        }
    }

    public static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ int $leftIconResId = 2131233696;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), this.$leftIconResId, null, null, null, false, false, 0, null, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048574);
        }
    }

    public static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ CommonItemView.a $crop;
        final /* synthetic */ String $url;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(a aVar, String str, CommonItemView.a aVar2) {
            super(1);
            this.this$0 = aVar;
            this.$url = str;
            this.$crop = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, null, null, 0, false, false, 0, false, 0, null, true, this.$url, this.$crop, false, 589823);
        }
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, boolean z) {
            super(1);
            this.this$0 = aVar;
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, this.$isVisible, false, 0, null, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048559);
        }
    }

    static final class h extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ boolean $b;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, boolean z) {
            super(1);
            this.this$0 = aVar;
            this.$b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, this.$b, 0, null, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048543);
        }
    }

    static final class i extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ String $s;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$s = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, this.$s, null, null, false, false, 0, null, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048573);
        }
    }

    static final class j extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ int $rightIconResId;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$rightIconResId = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, this.$rightIconResId, null, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048511);
        }
    }

    static final class k extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.a, com.ss.android.ugc.aweme.setting.ui.b.a> {
        final /* synthetic */ String $s;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$s = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.a invoke(com.ss.android.ugc.aweme.setting.ui.b.a aVar) {
            l.d(aVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.a.a((com.ss.android.ugc.aweme.setting.ui.b.a) this.this$0.l(), 0, null, null, null, false, false, 0, this.$s, null, 0, false, false, 0, false, 0, null, false, null, null, false, 1048447);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        a(new i(this, str));
    }

    public final void b(boolean z) {
        a(new h(this, z));
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void a(boolean z) {
        a(new g(this, z));
    }
}
