package com.ss.android.ugc.aweme.im.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.discover.hitrank.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a implements com.ss.android.ugc.aweme.im.service.share.a.c {

    /* renamed from: g  reason: collision with root package name */
    public static final C2455a f100061g = new C2455a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.share.b f100062a;

    /* renamed from: b  reason: collision with root package name */
    public int f100063b;

    /* renamed from: c  reason: collision with root package name */
    public int f100064c;

    /* renamed from: d  reason: collision with root package name */
    public int f100065d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f100066e;

    /* renamed from: f  reason: collision with root package name */
    public final b f100067f;

    static {
        Covode.recordClassIndex(63773);
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void b(SharePackage sharePackage) {
        l.d(sharePackage, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.b.a$a  reason: collision with other inner class name */
    public static final class C2455a {
        static {
            Covode.recordClassIndex(63776);
        }

        private C2455a() {
        }

        public /* synthetic */ C2455a(byte b2) {
            this();
        }
    }

    private final boolean b() {
        return this.f100067f.f100074b instanceof com.ss.android.ugc.aweme.share.improve.c;
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void a() {
        this.f100067f.f100074b.dismiss();
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.im.service.share.b a(a aVar) {
        com.ss.android.ugc.aweme.im.service.share.b bVar = aVar.f100062a;
        if (bVar == null) {
            l.a("realImChannel");
        }
        return bVar;
    }

    private static Aweme d(SharePackage sharePackage) {
        String str = "";
        String string = sharePackage.f124595i.getString("aid", str);
        if (string != null) {
            str = string;
        }
        return AwemeService.b().d(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.c
    public final void a(com.ss.android.ugc.aweme.im.service.share.b bVar) {
        l.d(bVar, "");
        this.f100062a = bVar;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f100071b;

        static {
            Covode.recordClassIndex(63777);
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f100071b) {
                View a2 = a.a(this.f100070a).a();
                if (a2 != null) {
                    a2.setVisibility(8);
                }
                View b2 = a.a(this.f100070a).b();
                if (b2 != null) {
                    b2.setVisibility(8);
                }
            } else {
                this.f100070a.f100067f.f100076d.setVisibility(8);
            }
            a.a(this.f100070a);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f100071b) {
                this.f100070a.f100067f.f100076d.setVisibility(0);
                return;
            }
            View a2 = a.a(this.f100070a).a();
            if (a2 != null) {
                a2.setVisibility(0);
            }
            View b2 = a.a(this.f100070a).b();
            if (b2 != null) {
                b2.setVisibility(0);
            }
        }

        b(a aVar, boolean z) {
            this.f100070a = aVar;
            this.f100071b = z;
        }
    }

    private final boolean b(boolean z) {
        com.ss.android.ugc.aweme.im.service.share.b bVar = this.f100062a;
        if (bVar == null) {
            l.a("realImChannel");
        }
        View a2 = bVar.a();
        if (a2 == null) {
            l.b();
        }
        if (!this.f100066e) {
            if (z) {
                if (a2.getVisibility() != 0) {
                    return false;
                }
                return true;
            }
        } else if (z) {
            return false;
        }
        if (a2.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    private final void c(boolean z) {
        b bVar = this.f100067f;
        bVar.f100076d.setVisibility(8);
        if (z) {
            com.ss.android.ugc.aweme.im.service.share.b bVar2 = this.f100062a;
            if (bVar2 == null) {
                l.a("realImChannel");
            }
            bVar2.d();
            bVar.f100075c.setVisibility(0);
            bVar.f100077e.setVisibility(0);
        } else {
            bVar.f100075c.setVisibility(8);
            bVar.f100077e.setVisibility(8);
        }
        if (this.f100062a == null) {
            l.a("realImChannel");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.c
    public final void a(IMContact iMContact) {
        boolean z;
        l.d(iMContact, "");
        com.ss.android.ugc.aweme.im.service.share.b bVar = this.f100062a;
        if (bVar == null) {
            l.a("realImChannel");
        }
        List<IMContact> c2 = bVar.c();
        if (c2 == null || c2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        a(z);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100072a;

        static {
            Covode.recordClassIndex(63778);
        }

        c(a aVar) {
            this.f100072a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            float f2 = floatValue / ((float) this.f100072a.f100063b);
            this.f100072a.f100067f.f100076d.setAlpha(f2);
            View a2 = a.a(this.f100072a).a();
            if (a2 != null) {
                a2.setAlpha(1.0f - f2);
            }
            View b2 = a.a(this.f100072a).b();
            if (b2 != null) {
                b2.setAlpha(1.0f - f2);
            }
            ViewGroup.LayoutParams layoutParams = this.f100072a.f100067f.f100075c.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = (int) floatValue;
            marginLayoutParams.topMargin = (int) (((float) this.f100072a.f100064c) * f2);
            marginLayoutParams.bottomMargin = (int) (f2 * ((float) this.f100072a.f100065d));
            this.f100072a.f100067f.f100075c.setLayoutParams(marginLayoutParams);
        }
    }

    public a(b bVar) {
        FrameLayout frameLayout;
        l.d(bVar, "");
        this.f100067f = bVar;
        boolean a2 = l.a((Object) bVar.f100078f.f124590d, (Object) UGCMonitor.EVENT_COMMENT);
        this.f100066e = a2;
        View findViewById = bVar.f100074b.findViewById(R.id.epv);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f100068a;

                static {
                    Covode.recordClassIndex(63774);
                }

                {
                    this.f100068a = r1;
                }

                public final void onClick(View view) {
                    View a2;
                    ClickAgent.onClick(view);
                    if (this.f100068a.f100066e || (a2 = a.a(this.f100068a).a()) == null || a2.getVisibility() != 0) {
                        this.f100068a.f100067f.f100074b.cancel();
                    } else {
                        this.f100068a.a(true);
                    }
                }
            });
        }
        bVar.f100075c.post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.im.b.a.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f100069a;

            static {
                Covode.recordClassIndex(63775);
            }

            {
                this.f100069a = r1;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = this.f100069a.f100067f.f100075c.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                a aVar = this.f100069a;
                aVar.f100063b = aVar.f100067f.f100075c.getHeight();
                this.f100069a.f100064c = marginLayoutParams.topMargin;
                this.f100069a.f100065d = marginLayoutParams.bottomMargin;
            }
        });
        Dialog dialog = bVar.f100074b;
        if (!(dialog == null || !(dialog instanceof com.google.android.material.bottomsheet.a) || (frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.a) dialog).findViewById(R.id.akq)) == null)) {
            BottomSheetBehavior a3 = BottomSheetBehavior.a(frameLayout);
            l.b(a3, "");
            a3.b(frameLayout.getHeight());
            a3.f52333i = true;
        }
        if (a2) {
            bVar.f100077e.setVisibility(8);
        }
    }

    public final void a(boolean z) {
        if (!b(z)) {
            return;
        }
        if (b()) {
            c(z);
        } else {
            d(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final void c(SharePackage sharePackage) {
        l.d(sharePackage, "");
        if (l.a((Object) sharePackage.f124590d, (Object) "live")) {
            new com.bytedance.tux.g.b(this.f100067f.f100075c).e(R.string.ci6).b();
        }
        this.f100067f.f100074b.dismiss();
        Bundle bundle = sharePackage.f124595i;
        if (l.a((Object) bundle.getString("is_star"), (Object) "1")) {
            d.a(bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), 3, null);
        }
        com.ss.android.ugc.aweme.sharer.ui.d dVar = this.f100067f.f100079g;
        if (dVar != null) {
            dVar.a(sharePackage);
        }
    }

    private final void d(boolean z) {
        float f2;
        ValueAnimator ofFloat;
        com.ss.android.ugc.aweme.im.service.share.b bVar = this.f100062a;
        if (bVar == null) {
            l.a("realImChannel");
        }
        View b2 = bVar.b();
        if (b2 != null) {
            f2 = ((float) b2.getHeight()) + n.b(b2.getContext(), 5.0f);
        } else {
            f2 = 0.0f;
        }
        int i2 = 0;
        if (z) {
            com.ss.android.ugc.aweme.im.service.share.b bVar2 = this.f100062a;
            if (bVar2 == null) {
                l.a("realImChannel");
            }
            bVar2.d();
            ofFloat = ValueAnimator.ofFloat(f2, (float) this.f100063b);
            l.b(ofFloat, "");
        } else {
            ofFloat = ValueAnimator.ofFloat(((float) this.f100063b) - f2, 0.0f);
            l.b(ofFloat, "");
        }
        View view = this.f100067f.f100077e;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.f100067f.f100074b.setCancelable(z);
        ofFloat.addListener(new b(this, z));
        ofFloat.addUpdateListener(new c(this));
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    public final boolean a(SharePackage sharePackage) {
        l.d(sharePackage, "");
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(d(sharePackage))) {
            new com.bytedance.tux.g.b(this.f100067f.f100075c).e(R.string.og).b();
            return false;
        }
        com.ss.android.ugc.aweme.sharer.ui.d dVar = this.f100067f.f100079g;
        if (dVar != null) {
            return dVar.b(sharePackage);
        }
        l.d(sharePackage, "");
        l.d(sharePackage, "");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    @Override // com.ss.android.ugc.aweme.im.service.share.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, com.ss.android.ugc.aweme.sharer.ui.SharePackage r10) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b.a.a(java.lang.String, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
