package com.bytedance.android.livesdk.chatroom.behavior;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class SuctionBottomBehavior extends CoordinatorLayout.b<View> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15049d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f15050a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15051b;

    /* renamed from: c  reason: collision with root package name */
    public int f15052c = 1;

    /* renamed from: e  reason: collision with root package name */
    private int f15053e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15054f = true;

    /* renamed from: g  reason: collision with root package name */
    private final long f15055g = 500;

    /* renamed from: h  reason: collision with root package name */
    private final b f15056h = new b(this);

    static {
        Covode.recordClassIndex(8362);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8363);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public SuctionBottomBehavior() {
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SuctionBottomBehavior f15057a;

        static {
            Covode.recordClassIndex(8364);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SuctionBottomBehavior suctionBottomBehavior) {
            this.f15057a = suctionBottomBehavior;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f15057a.f15050a = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f15057a.f15050a = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f15057a.f15050a = true;
        }
    }

    private static boolean c(View view, int i2) {
        if (((int) view.getTranslationY()) >= 0 && i2 < 0) {
            return false;
        }
        if (((int) view.getTranslationY()) > (-view.getMeasuredHeight()) || i2 <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuctionBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k_});
        l.b(obtainStyledAttributes, "");
        this.f15052c = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }

    private final void b(View view, int i2) {
        if (view.animate() != null && this.f15050a) {
            view.animate().cancel();
        }
        float translationY = view.getTranslationY() - ((float) i2);
        if (translationY < ((float) (-view.getHeight()))) {
            translationY = -((float) view.getHeight());
        } else if (translationY > 0.0f) {
            translationY = 0.0f;
        }
        view.setTranslationY(translationY);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        l.d(coordinatorLayout, "");
        l.d(view, "");
        view.layout(0, coordinatorLayout.getMeasuredHeight(), view.getMeasuredWidth(), coordinatorLayout.getMeasuredHeight() + view.getMeasuredHeight());
        if (this.f15054f) {
            view.animate().setDuration(this.f15055g).translationY(-((float) view.getMeasuredHeight())).withLayer().setListener(this.f15056h).start();
            this.f15054f = false;
        } else if (this.f15050a && this.f15053e != view.getMeasuredHeight()) {
            view.animate().cancel();
            view.animate().setDuration((long) ((Math.abs(((float) view.getMeasuredHeight()) + view.getTranslationY()) / ((float) view.getMeasuredHeight())) * ((float) this.f15055g))).setListener(this.f15056h).translationY(-((float) view.getMeasuredHeight())).start();
        } else if (!(this.f15053e != (-((int) view.getTranslationY())) || (i3 = this.f15053e) == 0 || i3 == view.getMeasuredHeight())) {
            view.setTranslationY(-((float) view.getMeasuredHeight()));
        }
        this.f15053e = view.getMeasuredHeight();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        l.d(coordinatorLayout, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        if (!this.f15051b || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        l.d(coordinatorLayout, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(iArr, "");
        if (view2 instanceof RecyclerView) {
            if (this.f15052c == 2) {
                RecyclerView recyclerView = (RecyclerView) view2;
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int n = ((LinearLayoutManager) layoutManager).n();
                RecyclerView.a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    l.b();
                }
                l.b(adapter, "");
                if (n != adapter.getItemCount() - 1) {
                    return;
                }
            }
            if (c(view, i3)) {
                b(view, i3);
                iArr[1] = i3;
            }
        } else if (c(view, i3)) {
            b(view, i3);
            iArr[1] = i3;
        }
    }
}
