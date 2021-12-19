package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final b f75764e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f75765a;

    /* renamed from: b  reason: collision with root package name */
    public a f75766b;

    /* renamed from: c  reason: collision with root package name */
    public final Activity f75767c;

    /* renamed from: d  reason: collision with root package name */
    public final View f75768d;

    /* renamed from: f  reason: collision with root package name */
    private final h f75769f = i.a((h.f.a.a) new d(this));

    /* renamed from: g  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f75770g;

    /* renamed from: h  reason: collision with root package name */
    private int f75771h = 16;

    public interface a {
        static {
            Covode.recordClassIndex(46732);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(46731);
    }

    public final View a() {
        return (View) this.f75769f.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(46733);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(46735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            Window window = this.this$0.f75767c.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            return decorView;
        }
    }

    public final void c() {
        this.f75767c.getWindow().setSoftInputMode(this.f75771h);
        a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f75770g);
        this.f75770g = null;
    }

    public final void b() {
        Window window = this.f75767c.getWindow();
        this.f75771h = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        this.f75770g = new c(this);
        a().getViewTreeObserver().addOnGlobalLayoutListener(this.f75770g);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f75772a;

        static {
            Covode.recordClassIndex(46734);
        }

        c(g gVar) {
            this.f75772a = gVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f75772a.a().getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (this.f75772a.f75765a == 0) {
                this.f75772a.f75765a = height;
            } else if (this.f75772a.f75765a != height) {
                int i2 = height - this.f75772a.f75765a;
                if (i2 < -20) {
                    View view = this.f75772a.f75768d;
                    Rect rect2 = new Rect();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    rect2.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                    this.f75772a.f75768d.animate().translationYBy((float) (-((rect2.bottom - rect.bottom) + 30))).setDuration(100).start();
                    a aVar = this.f75772a.f75766b;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                } else if (i2 > 20) {
                    this.f75772a.f75768d.animate().translationY((((float) (this.f75772a.a().getHeight() - this.f75772a.f75768d.getHeight())) / 2.0f) - ((float) this.f75772a.f75768d.getTop())).setDuration(100).start();
                    a aVar2 = this.f75772a.f75766b;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                }
                this.f75772a.f75765a = height;
            }
        }
    }

    public g(Activity activity, View view) {
        l.d(activity, "");
        l.d(view, "");
        this.f75767c = activity;
        this.f75768d = view;
    }
}
