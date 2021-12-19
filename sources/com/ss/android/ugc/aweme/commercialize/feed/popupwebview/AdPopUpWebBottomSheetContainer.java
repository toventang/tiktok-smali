package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class AdPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f74281i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final c f74282j = new c((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> f74283h;

    /* renamed from: k  reason: collision with root package name */
    private d f74284k;

    /* renamed from: l  reason: collision with root package name */
    private final h f74285l;

    /* renamed from: m  reason: collision with root package name */
    private b f74286m;

    public interface b {
        static {
            Covode.recordClassIndex(45834);
        }

        void a();

        void a(View view, float f2);

        void b();

        void c();

        void d();

        void e();
    }

    public interface d {
        static {
            Covode.recordClassIndex(45836);
        }

        boolean a();
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getActionMode() {
        return (a) this.f74285l.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(45835);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public final AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> getBehavior() {
        return this.f74283h;
    }

    public final b getCallback() {
        return this.f74286m;
    }

    public final d getOnInterceptListener() {
        return this.f74284k;
    }

    public final void a() {
        this.f74283h.c(3);
    }

    public final void b() {
        this.f74283h.c(6);
    }

    public final void c() {
        this.f74283h.c(4);
    }

    static final class e extends m implements h.f.a.a<a> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AdPopUpWebBottomSheetContainer this$0;

        static {
            Covode.recordClassIndex(45837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, Context context) {
            super(0);
            this.this$0 = adPopUpWebBottomSheetContainer;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.$context, this.this$0, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(45832);
    }

    public final boolean d() {
        if (this.f74283h.f74265f == 3 || this.f74283h.f74265f == 4) {
            return true;
        }
        return false;
    }

    public final void setCallback(b bVar) {
        this.f74286m = bVar;
    }

    public final void setOnInterceptListener(d dVar) {
        this.f74284k = dVar;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        l.d(adPopUpWebBottomSheetBehavior, "");
        this.f74283h = adPopUpWebBottomSheetBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f74284k;
        if (dVar != null) {
            return dVar.a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setWebViewForDragBehavior(WebView webView) {
        l.d(webView, "");
        this.f74283h.s = webView;
    }

    public final void b(int i2) {
        getActionMode().a(i2);
        this.f74283h.b(getActionMode().f74363a);
    }

    public static final class a extends AdPopUpWebBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f74287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f74288b;

        static {
            Covode.recordClassIndex(45833);
        }

        a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
            this.f74287a = adPopUpWebBottomSheetBehavior;
            this.f74288b = adPopUpWebBottomSheetContainer;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
            b callback = this.f74288b.getCallback();
            if (callback != null) {
                callback.a(view, f2);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a
        public final void a(View view, int i2) {
            b callback;
            l.d(view, "");
            String.valueOf(i2);
            if (i2 == 1) {
                if (!AdPopUpWebBottomSheetContainer.f74281i && !aa.f75538i) {
                    this.f74287a.c(3);
                }
                b callback2 = this.f74288b.getCallback();
                if (callback2 != null) {
                    callback2.c();
                }
            } else if (i2 == 3) {
                if (this.f74288b.getActionMode().f74364b != 0) {
                    if (this.f74288b.getActionMode().f74371i == 3) {
                        this.f74287a.f74264e = true;
                    } else {
                        this.f74287a.b(this.f74288b.getActionMode().f74364b);
                    }
                }
                b callback3 = this.f74288b.getCallback();
                if (callback3 != null) {
                    callback3.a();
                }
            } else if (i2 == 4) {
                b callback4 = this.f74288b.getCallback();
                if (callback4 != null) {
                    callback4.b();
                }
            } else if (i2 == 5) {
                b callback5 = this.f74288b.getCallback();
                if (callback5 != null) {
                    callback5.d();
                }
            } else if (i2 == 6 && (callback = this.f74288b.getCallback()) != null) {
                callback.e();
            }
        }
    }

    private /* synthetic */ AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f74270k = new a(adPopUpWebBottomSheetBehavior, this);
        this.f74283h = adPopUpWebBottomSheetBehavior;
        this.f74285l = i.a((h.f.a.a) new e(this, context));
        this.f74283h.f74263d = true;
        f74281i = true;
        this.f74283h.c(5);
        this.f74283h.b(getActionMode().f74363a);
    }
}
