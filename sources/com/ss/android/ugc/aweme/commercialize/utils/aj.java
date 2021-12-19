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

public final class aj {

    /* renamed from: f  reason: collision with root package name */
    public static final b f75569f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f75570a;

    /* renamed from: b  reason: collision with root package name */
    public int f75571b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f75572c = new d(this);

    /* renamed from: d  reason: collision with root package name */
    public a f75573d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f75574e;

    /* renamed from: g  reason: collision with root package name */
    private final h f75575g = i.a((h.f.a.a) new c(this));

    public interface a {
        static {
            Covode.recordClassIndex(46618);
        }

        void a(int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(46617);
    }

    public final View a() {
        return (View) this.f75575g.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(46619);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void b() {
        a().getViewTreeObserver().removeOnGlobalLayoutListener(this.f75572c);
    }

    static final class c extends m implements h.f.a.a<View> {
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(46620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            Window window = this.this$0.f75574e.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            return decorView;
        }
    }

    public final int c() {
        Rect rect = new Rect();
        a().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f75576a;

        static {
            Covode.recordClassIndex(46621);
        }

        d(aj ajVar) {
            this.f75576a = ajVar;
        }

        public final void onGlobalLayout() {
            a aVar;
            int c2 = this.f75576a.c();
            if (this.f75576a.f75570a == 0) {
                this.f75576a.f75570a = c2;
            } else if (this.f75576a.f75570a != c2) {
                if (Math.abs(c2 - this.f75576a.f75570a) > 20 && (aVar = this.f75576a.f75573d) != null) {
                    aVar.a(this.f75576a.f75570a, c2, this.f75576a.f75571b);
                }
                this.f75576a.f75570a = c2;
            }
        }
    }

    public aj(Activity activity) {
        l.d(activity, "");
        this.f75574e = activity;
    }
}
