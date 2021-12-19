package com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class CommonPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f76193i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final c f76194j = new c((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> f76195h;

    /* renamed from: k  reason: collision with root package name */
    private d f76196k;

    /* renamed from: l  reason: collision with root package name */
    private final h f76197l;

    /* renamed from: m  reason: collision with root package name */
    private b f76198m;

    public interface b {
        static {
            Covode.recordClassIndex(46988);
        }

        void a();

        void a(View view, float f2);

        void b();

        void c();

        void d();
    }

    public interface d {
        static {
            Covode.recordClassIndex(46990);
        }

        boolean a();
    }

    public CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getActionMode() {
        return (a) this.f76197l.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(46989);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public final AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> getBehavior() {
        return this.f76195h;
    }

    public final b getCallback() {
        return this.f76198m;
    }

    public final d getOnInterceptListener() {
        return this.f76196k;
    }

    public final void a() {
        this.f76195h.c(3);
    }

    static final class e extends m implements h.f.a.a<a> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CommonPopUpWebBottomSheetContainer this$0;

        static {
            Covode.recordClassIndex(46991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer, Context context) {
            super(0);
            this.this$0 = commonPopUpWebBottomSheetContainer;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.$context, this.this$0, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(46986);
    }

    public final boolean b() {
        if (this.f76195h.f74265f == 3 || this.f76195h.f74265f == 4) {
            return true;
        }
        return false;
    }

    public final void setCallback(b bVar) {
        this.f76198m = bVar;
    }

    public final void setOnInterceptListener(d dVar) {
        this.f76196k = dVar;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        l.d(adPopUpWebBottomSheetBehavior, "");
        this.f76195h = adPopUpWebBottomSheetBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f76196k;
        if (dVar != null) {
            return dVar.a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setWebViewForDragBehavior(WebView webView) {
        l.d(webView, "");
        this.f76195h.s = webView;
    }

    public static final class a extends AdPopUpWebBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f76199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonPopUpWebBottomSheetContainer f76200b;

        static {
            Covode.recordClassIndex(46987);
        }

        a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer) {
            this.f76199a = adPopUpWebBottomSheetBehavior;
            this.f76200b = commonPopUpWebBottomSheetContainer;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
            b callback = this.f76200b.getCallback();
            if (callback != null) {
                callback.a(view, f2);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.a
        public final void a(View view, int i2) {
            b callback;
            l.d(view, "");
            if (i2 == 1) {
                if (!CommonPopUpWebBottomSheetContainer.f76193i && !b.f76247f) {
                    this.f76199a.c(3);
                }
                b callback2 = this.f76200b.getCallback();
                if (callback2 != null) {
                    callback2.c();
                }
            } else if (i2 == 3) {
                if (this.f76200b.getActionMode().f76234b != 0) {
                    this.f76199a.b(this.f76200b.getActionMode().f76234b);
                }
                b callback3 = this.f76200b.getCallback();
                if (callback3 != null) {
                    callback3.a();
                }
            } else if (i2 == 4) {
                b callback4 = this.f76200b.getCallback();
                if (callback4 != null) {
                    callback4.b();
                }
            } else if (i2 == 5 && (callback = this.f76200b.getCallback()) != null) {
                callback.d();
            }
        }
    }

    private /* synthetic */ CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f74270k = new a(adPopUpWebBottomSheetBehavior, this);
        this.f76195h = adPopUpWebBottomSheetBehavior;
        this.f76197l = i.a((h.f.a.a) new e(this, context));
        this.f76195h.f74263d = true;
        f76193i = true;
        this.f76195h.c(5);
        this.f76195h.b(getActionMode().f76233a);
    }
}
