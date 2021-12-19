package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;

public abstract class i extends com.bytedance.assem.arch.d.a {
    public static final b n = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f117608j = new com.bytedance.assem.arch.extensions.i(bQ_(), new a(this, null));

    /* renamed from: k  reason: collision with root package name */
    protected Context f117609k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f117610l;

    /* renamed from: m  reason: collision with root package name */
    public int f117611m;
    private final h o = h.i.a((h.f.a.a) new e(this));
    private final h p = h.i.a((h.f.a.a) new d(this));
    private final h q = h.i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(76047);
    }

    public abstract View A();

    public abstract com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a B();

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
    }

    public final c u() {
        return (c) this.o.getValue();
    }

    public final boolean v() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76049);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<c> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(c.class));
        }
    }

    public final Context w() {
        Context context = this.f117609k;
        if (context == null) {
            l.a("notNullContext");
        }
        return context;
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return u().d(B());
    }

    public final void y() {
        this.f117610l = true;
        u().a(B());
    }

    public final void z() {
        this.f117610l = false;
        u().b(B());
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.i.a.invoke():java.lang.Object");
        }
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.u().c(this.this$0.B());
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.this$0.f117608j.getValue();
            if (aVar != null) {
                z = aVar.f117878c;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        Context ar_ = ar_();
        if (ar_ != null) {
            this.f117609k = ar_;
            u().a(A(), this.f117611m, B());
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        u().a(onClickListener, B());
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        l.d(str, "");
        u().b(str, B());
    }

    public final void a(String str) {
        l.d(str, "");
        u().a(str, B());
    }

    /* access modifiers changed from: protected */
    public final View a(int i2, int i3, View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics())));
        Context context = this.f117609k;
        if (context == null) {
            l.a("notNullContext");
        }
        TuxButton tuxButton = new TuxButton(context, null, 0, 6);
        tuxButton.setButtonSize(2);
        tuxButton.setButtonVariant(1);
        tuxButton.setIconTintColorRes(R.attr.ay);
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        tuxButton.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        tuxButton.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system4.getDisplayMetrics())));
        tuxButton.setTag(B());
        tuxButton.setVisibility(8);
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        tuxButton.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 288.0f, system5.getDisplayMetrics())));
        Resources system6 = Resources.getSystem();
        l.a((Object) system6, "");
        tuxButton.setMinWidth(h.g.a.a(TypedValue.applyDimension(1, 88.0f, system6.getDisplayMetrics())));
        tuxButton.setLayoutParams(layoutParams);
        tuxButton.setText(y.a(i2));
        tuxButton.setButtonStartIcon(Integer.valueOf(i3));
        tuxButton.setOnClickListener(onClickListener);
        TextPaint paint = tuxButton.getPaint();
        l.b(paint, "");
        int measureText = (int) paint.measureText(tuxButton.getText().toString());
        Resources system7 = Resources.getSystem();
        l.a((Object) system7, "");
        int a2 = measureText + h.g.a.a(TypedValue.applyDimension(1, 46.0f, system7.getDisplayMetrics()));
        Resources system8 = Resources.getSystem();
        l.a((Object) system8, "");
        if (a2 < h.g.a.a(TypedValue.applyDimension(1, 88.0f, system8.getDisplayMetrics()))) {
            Resources system9 = Resources.getSystem();
            l.a((Object) system9, "");
            a2 = h.g.a.a(TypedValue.applyDimension(1, 88.0f, system9.getDisplayMetrics()));
        } else {
            Resources system10 = Resources.getSystem();
            l.a((Object) system10, "");
            if (a2 > h.g.a.a(TypedValue.applyDimension(1, 288.0f, system10.getDisplayMetrics()))) {
                Resources system11 = Resources.getSystem();
                l.a((Object) system11, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 288.0f, system11.getDisplayMetrics()));
            }
        }
        this.f117611m = a2;
        return tuxButton;
    }
}
