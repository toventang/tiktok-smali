package com.bytedance.ies.xelement.banner;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.view.UIView;
import h.f.b.l;
import h.w;
import java.lang.ref.WeakReference;

public final class LynxSwiperItemView extends UIView {
    static {
        Covode.recordClassIndex(22045);
    }

    public final void a() {
        View view = this.mView;
        l.a((Object) view, "");
        if (((com.lynx.tasm.behavior.ui.view.a) view).getParent() instanceof ViewGroup) {
            View view2 = this.mView;
            l.a((Object) view2, "");
            ViewParent parent = ((com.lynx.tasm.behavior.ui.view.a) view2).getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (getOverflow() != 0) {
                    viewGroup.setClipChildren(false);
                }
                v.a(this.mView, getBoundRectForOverflow());
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<LynxSwiperItemView> f36709a;

        static {
            Covode.recordClassIndex(22048);
        }

        public final void onViewDetachedFromWindow(View view) {
            l.c(view, "");
        }

        public a(LynxSwiperItemView lynxSwiperItemView) {
            l.c(lynxSwiperItemView, "");
            this.f36709a = new WeakReference<>(lynxSwiperItemView);
        }

        public final void onViewAttachedToWindow(View view) {
            l.c(view, "");
            WeakReference<LynxSwiperItemView> weakReference = this.f36709a;
            if (weakReference == null) {
                l.a();
            }
            LynxSwiperItemView lynxSwiperItemView = weakReference.get();
            if (lynxSwiperItemView != null) {
                lynxSwiperItemView.a();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i2) {
        super.setOverflow(i2);
        ((com.lynx.tasm.behavior.ui.view.a) this.mView).addOnAttachStateChangeListener(new a(this));
        a();
    }
}
