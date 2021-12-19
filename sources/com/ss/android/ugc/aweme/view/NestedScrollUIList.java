package com.ss.android.ugc.aweme.view;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.h.p;
import androidx.core.h.q;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.ss.android.ugc.aweme.utils.da;
import h.f.b.l;

public class NestedScrollUIList extends UIList {

    /* renamed from: i  reason: collision with root package name */
    public final j f144018i;

    static {
        Covode.recordClassIndex(94237);
    }

    public static final class a extends RecyclerView implements p {
        private final q O = new q();
        private boolean P;
        private int Q;
        private final Choreographer R;
        private final Choreographer.FrameCallback S;

        static {
            Covode.recordClassIndex(94238);
        }

        @Override // androidx.core.h.o
        public final boolean a(View view, View view2, int i2, int i3) {
            l.d(view, "");
            l.d(view2, "");
            return (i2 & 2) != 0;
        }

        public final Choreographer getChoreographer() {
            return this.R;
        }

        public final boolean getNeedScroll() {
            return this.P;
        }

        public final Choreographer.FrameCallback getScrollFrameCallback() {
            return this.S;
        }

        public final int getScrollPixel() {
            return this.Q;
        }

        public final int getNestedScrollAxes() {
            return this.O.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.R.removeFrameCallback(this.S);
            this.P = false;
        }

        public final void q() {
            try {
                if (this.P) {
                    int i2 = this.Q;
                    if (i2 != 0) {
                        scrollBy(0, i2);
                        this.R.postFrameCallback(this.S);
                    }
                }
            } catch (Exception unused) {
                this.R.removeFrameCallback(this.S);
                this.P = false;
                this.Q = 0;
            }
        }

        public final void setNeedScroll(boolean z) {
            this.P = z;
        }

        public final void setScrollPixel(int i2) {
            this.Q = i2;
        }

        /* renamed from: com.ss.android.ugc.aweme.view.NestedScrollUIList$a$a  reason: collision with other inner class name */
        static final class Choreographer$FrameCallbackC3831a implements Choreographer.FrameCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f144019a;

            static {
                Covode.recordClassIndex(94239);
            }

            Choreographer$FrameCallbackC3831a(a aVar) {
                this.f144019a = aVar;
            }

            public final void doFrame(long j2) {
                this.f144019a.q();
            }
        }

        @Override // androidx.core.h.n
        public final void onStopNestedScroll(View view) {
            l.d(view, "");
            stopNestedScroll();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
            Choreographer instance = Choreographer.getInstance();
            l.b(instance, "");
            this.R = instance;
            this.S = new Choreographer$FrameCallbackC3831a(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ViewParent parent = getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            while (true) {
                View view = (View) parent;
                if (view == null) {
                    break;
                } else if (view instanceof RecyclerView) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    parent = view.getParent();
                    if (!(parent instanceof View)) {
                        parent = null;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.core.h.o
        public final void b(View view, int i2) {
            l.d(view, "");
            this.O.a(i2);
            a(i2);
        }

        @Override // androidx.core.h.n
        public final void onNestedScrollAccepted(View view, View view2, int i2) {
            l.d(view, "");
            l.d(view2, "");
            this.O.a(i2, 0);
            startNestedScroll(2);
        }

        @Override // androidx.core.h.o
        public final void b(View view, View view2, int i2, int i3) {
            l.d(view, "");
            l.d(view2, "");
            this.O.a(i2, i3);
        }

        @Override // androidx.core.h.n
        public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
            l.d(view, "");
            l.d(iArr, "");
            a(view, i2, i3, iArr, 0);
        }

        @Override // androidx.core.h.n
        public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
            l.d(view, "");
            a(view, i2, i3, i4, i5, 0);
        }

        @Override // androidx.core.h.o
        public final void a(View view, int i2, int i3, int[] iArr, int i4) {
            l.d(view, "");
            l.d(iArr, "");
            a(i2, i3, iArr, (int[]) null, i4);
        }

        @Override // androidx.core.h.o
        public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
            l.d(view, "");
            if (i6 != 1) {
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                scrollBy(i4, i5);
                int scrollX2 = getScrollX() - scrollX;
                int scrollY2 = getScrollY() - scrollY;
                a(scrollX2, scrollY2, i4 - scrollX2, i5 - scrollY2, i6);
            }
        }

        @Override // androidx.core.h.p
        public final void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            l.d(view, "");
            l.d(iArr, "");
            a(view, i2, i3, i4, i5, i6);
        }
    }

    public NestedScrollUIList(j jVar) {
        super(jVar);
        this.f144018i = jVar;
    }

    @Override // com.lynx.tasm.behavior.ui.list.UIList
    public final RecyclerView a(Context context) {
        l.d(context, "");
        a aVar = new a(context);
        da.a.a("eoy_list").a(aVar);
        return aVar;
    }

    @com.lynx.tasm.behavior.p
    public final void autoScroll(ReadableMap readableMap, Callback callback) {
        l.d(readableMap, "");
        l.d(callback, "");
        try {
            View view = this.mView;
            if (!(view instanceof a)) {
                view = null;
            }
            a aVar = (a) view;
            if (aVar != null) {
                aVar.setScrollPixel(readableMap.getInt("rate") / 60);
                aVar.setNeedScroll(readableMap.getBoolean("start", false));
                aVar.getChoreographer().removeFrameCallback(aVar.getScrollFrameCallback());
                if (aVar.getNeedScroll()) {
                    aVar.q();
                }
            }
            callback.invoke(0);
        } catch (Exception unused) {
            callback.invoke(1, "something went wrong.. see logs");
        }
    }
}
