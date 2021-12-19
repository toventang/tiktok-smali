package com.ss.android.ugc.aweme.setting.unit.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;

public final class c extends com.ss.android.ugc.aweme.dc.a<com.ss.android.ugc.aweme.setting.ui.b.c> {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.setting.ui.b.c f122948a;

    static {
        Covode.recordClassIndex(80733);
    }

    private /* synthetic */ c() {
        this(null);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.c b() {
        com.ss.android.ugc.aweme.setting.ui.b.c cVar = this.f122948a;
        if (cVar != null) {
            return cVar;
        }
        throw new RuntimeException("pls pass settingUnLoginItem or extends the SettingUnLoginUnit");
    }

    public c(com.ss.android.ugc.aweme.setting.ui.b.c cVar) {
        this.f122948a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.dc.a
    public final void a(boolean z) {
        a(new b(this, z));
    }

    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.c, com.ss.android.ugc.aweme.setting.ui.b.c> {
        final /* synthetic */ View.OnClickListener $listener;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(80734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View.OnClickListener onClickListener) {
            super(1);
            this.this$0 = cVar;
            this.$listener = onClickListener;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.c invoke(com.ss.android.ugc.aweme.setting.ui.b.c cVar) {
            l.d(cVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.c.a((com.ss.android.ugc.aweme.setting.ui.b.c) this.this$0.l(), null, false, this.$listener, false, null, 27);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.ui.b.c, com.ss.android.ugc.aweme.setting.ui.b.c> {
        final /* synthetic */ boolean $isVisible;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(80735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, boolean z) {
            super(1);
            this.this$0 = cVar;
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.setting.ui.b.c invoke(com.ss.android.ugc.aweme.setting.ui.b.c cVar) {
            l.d(cVar, "");
            return com.ss.android.ugc.aweme.setting.ui.b.c.a((com.ss.android.ugc.aweme.setting.ui.b.c) this.this$0.l(), null, this.$isVisible, null, false, null, 29);
        }
    }
}
