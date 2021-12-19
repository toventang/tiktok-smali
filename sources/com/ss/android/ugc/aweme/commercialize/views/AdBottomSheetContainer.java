package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.f.b.l;

public final class AdBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: h  reason: collision with root package name */
    BottomSheetBehavior<FrameLayout> f75825h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f75826i;

    /* renamed from: j  reason: collision with root package name */
    private b f75827j;

    public interface b {
        static {
            Covode.recordClassIndex(46762);
        }

        void a();

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(46760);
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final BottomSheetBehavior<FrameLayout> getBehavior() {
        return this.f75825h;
    }

    public final b getCallback() {
        return this.f75827j;
    }

    public final boolean getHideable() {
        return this.f75826i;
    }

    public final boolean a() {
        if (this.f75825h.f52334j == 3) {
            return true;
        }
        return false;
    }

    public final void setCallback(b bVar) {
        this.f75827j = bVar;
    }

    public final void setHideable(boolean z) {
        this.f75826i = z;
    }

    public final void setBehavior(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
        l.d(bottomSheetBehavior, "");
        this.f75825h = bottomSheetBehavior;
    }

    public static final class a extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdBottomSheetContainer$behavior$1 f75828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdBottomSheetContainer f75829b;

        static {
            Covode.recordClassIndex(46761);
        }

        a(AdBottomSheetContainer$behavior$1 adBottomSheetContainer$behavior$1, AdBottomSheetContainer adBottomSheetContainer) {
            this.f75828a = adBottomSheetContainer$behavior$1;
            this.f75829b = adBottomSheetContainer;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
            b callback = this.f75829b.getCallback();
            if (callback != null) {
                callback.d();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            b callback;
            l.d(view, "");
            if (i2 == 1) {
                if (!this.f75829b.getHideable()) {
                    this.f75828a.c(3);
                }
                b callback2 = this.f75829b.getCallback();
                if (callback2 != null) {
                    callback2.c();
                }
            } else if (i2 == 3) {
                b callback3 = this.f75829b.getCallback();
                if (callback3 != null) {
                    callback3.a();
                }
            } else if (i2 == 4 && (callback = this.f75829b.getCallback()) != null) {
                callback.b();
            }
        }
    }

    private /* synthetic */ AdBottomSheetContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdBottomSheetContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f75826i = true;
        AdBottomSheetContainer$behavior$1 adBottomSheetContainer$behavior$1 = new AdBottomSheetContainer$behavior$1(this);
        adBottomSheetContainer$behavior$1.o = new a(adBottomSheetContainer$behavior$1, this);
        this.f75826i = true;
        adBottomSheetContainer$behavior$1.b(0);
        this.f75825h = adBottomSheetContainer$behavior$1;
    }
}
