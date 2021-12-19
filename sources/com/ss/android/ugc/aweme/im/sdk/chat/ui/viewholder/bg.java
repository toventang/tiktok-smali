package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.c.c;
import com.bytedance.tux.icon.TuxIconView;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public final TuxIconView f101395a;

    /* renamed from: b  reason: collision with root package name */
    private ai f101396b;

    /* renamed from: c  reason: collision with root package name */
    private final h f101397c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f101398d = i.a((h.f.a.a) b.f101400a);

    static {
        Covode.recordClassIndex(64841);
    }

    private final View.OnAttachStateChangeListener b() {
        return (View.OnAttachStateChangeListener) this.f101397c.getValue();
    }

    private final com.bytedance.tux.c.a c() {
        return (com.bytedance.tux.c.a) this.f101398d.getValue();
    }

    static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ bg this$0;

        static {
            Covode.recordClassIndex(64842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(bg bgVar) {
            super(0);
            this.this$0 = bgVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new View.OnAttachStateChangeListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bg.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f101399a;

                static {
                    Covode.recordClassIndex(64843);
                }

                public final void onViewDetachedFromWindow(View view) {
                    l.d(view, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f101399a = r1;
                }

                public final void onViewAttachedToWindow(View view) {
                    l.d(view, "");
                    this.f101399a.this$0.a();
                }
            };
        }
    }

    static final class b extends m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f101400a = new b();

        static {
            Covode.recordClassIndex(64844);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return c.a(AnonymousClass1.f101401a);
        }
    }

    private final void d() {
        TuxIconView tuxIconView = this.f101395a;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    private final void e() {
        TuxIconView tuxIconView = this.f101395a;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    private final void f() {
        TuxIconView tuxIconView = this.f101395a;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c());
            this.f101395a.setVisibility(0);
        }
    }

    public final void a() {
        Integer valueOf;
        ai aiVar = this.f101396b;
        if (aiVar != null && (valueOf = Integer.valueOf(aiVar.getMsgStatus())) != null) {
            if (valueOf.intValue() == 1 || valueOf.intValue() == 0) {
                d();
            } else if (valueOf.intValue() == 3) {
                f();
            } else if (valueOf.intValue() == 2 || valueOf.intValue() == 5) {
                e();
            }
        }
    }

    public final void a(ai aiVar) {
        TuxIconView tuxIconView = this.f101395a;
        if (tuxIconView != null) {
            tuxIconView.setTag(50331648, 6);
            tuxIconView.setTag(67108864, aiVar);
        }
        this.f101396b = aiVar;
        a();
    }

    public bg(TuxIconView tuxIconView) {
        this.f101395a = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.removeOnAttachStateChangeListener(b());
            tuxIconView.addOnAttachStateChangeListener(b());
        }
    }
}
