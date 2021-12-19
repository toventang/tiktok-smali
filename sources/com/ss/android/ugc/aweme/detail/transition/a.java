package com.ss.android.ugc.aweme.detail.transition;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.detail.transition.d;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79858a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(49682);
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f79861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f79862b;

        static {
            Covode.recordClassIndex(49684);
        }

        public final boolean onPreDraw() {
            this.f79861a.getViewTreeObserver().removeOnPreDrawListener(this);
            try {
                androidx.core.app.a.c(this.f79862b);
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        b(View view, Activity activity) {
            this.f79861a = view;
            this.f79862b = activity;
        }
    }

    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f79863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f79864b;

        static {
            Covode.recordClassIndex(49685);
        }

        public final boolean onPreDraw() {
            this.f79863a.getViewTreeObserver().removeOnPreDrawListener(this);
            try {
                androidx.core.app.a.c(this.f79864b);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        c(View view, Activity activity) {
            this.f79863a = view;
            this.f79864b = activity;
        }
    }

    public static final class e implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataCenter f79869a;

        static {
            Covode.recordClassIndex(49687);
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        e(DataCenter dataCenter) {
            this.f79869a = dataCenter;
        }

        public final void onTransitionCancel(Transition transition) {
            d.a.a().a();
        }

        public final void onTransitionStart(Transition transition) {
            d.a.a().a();
        }

        public final void onTransitionEnd(Transition transition) {
            this.f79869a.a("feed_enter_transition_end", (Object) null);
        }
    }

    public static final void a(Activity activity) {
        l.d(activity, "");
        Window window = activity.getWindow();
        l.b(window, "");
        View decorView = window.getDecorView();
        l.b(decorView, "");
        decorView.getViewTreeObserver().addOnPreDrawListener(new c(decorView, activity));
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$a  reason: collision with other inner class name */
    public static final class SharedElementCallbackC1863a extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f79859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f79860b;

        static {
            Covode.recordClassIndex(49683);
        }

        public SharedElementCallbackC1863a(Activity activity, c cVar) {
            this.f79859a = activity;
            this.f79860b = cVar;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            a.a(this.f79859a, this.f79860b, list, map);
            super.onMapSharedElements(list, map);
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Parcelable onCaptureSharedElementSnapshot;
            MethodCollector.i(8892);
            if (view != null) {
                view.setAlpha(1.0f);
                if (!view.isAttachedToWindow()) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    l.b(createBitmap, "");
                    view.draw(new Canvas(createBitmap));
                    MethodCollector.o(8892);
                    return createBitmap;
                }
            }
            FeedShareElementInfo a2 = FeedShareElementInfo.a(view);
            if (a2 == null || (onCaptureSharedElementSnapshot = super.onCaptureSharedElementSnapshot(view, matrix, rectF)) == null) {
                Parcelable onCaptureSharedElementSnapshot2 = super.onCaptureSharedElementSnapshot(view, matrix, rectF);
                l.b(onCaptureSharedElementSnapshot2, "");
                MethodCollector.o(8892);
                return onCaptureSharedElementSnapshot2;
            }
            a2.f79856b = onCaptureSharedElementSnapshot;
            MethodCollector.o(8892);
            return a2;
        }
    }

    public static final class d extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f79865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f79866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f79867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DataCenter f79868d;

        static {
            Covode.recordClassIndex(49686);
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            a.a(this.f79865a, this.f79866b, list, map);
            super.onMapSharedElements(list, map);
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            if (parcelable instanceof FeedShareElementInfo) {
                FeedShareElementInfo feedShareElementInfo = (FeedShareElementInfo) parcelable;
                View onCreateSnapshotView = super.onCreateSnapshotView(context, feedShareElementInfo.f79856b);
                FeedShareElementInfo.a(onCreateSnapshotView, feedShareElementInfo);
                l.b(onCreateSnapshotView, "");
                return onCreateSnapshotView;
            }
            View onCreateSnapshotView2 = super.onCreateSnapshotView(context, parcelable);
            l.b(onCreateSnapshotView2, "");
            return onCreateSnapshotView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<? extends View> list2, List<? extends View> list3) {
            l.d(list, "");
            l.d(list2, "");
            l.d(list3, "");
            super.onSharedElementEnd(list, list2, list3);
            this.f79867c.set(false);
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<? extends View> list2, List<? extends View> list3) {
            FeedShareElementInfo a2;
            super.onSharedElementStart(list, list2, list3);
            if (list2 != null) {
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = (View) list2.get(i2);
                    if (this.f79867c.get()) {
                        View view2 = null;
                        if (list3 != null && !com.ss.android.ugc.aweme.base.utils.d.a(list3) && i2 < list3.size()) {
                            view2 = (View) list3.get(i2);
                        }
                        a2 = FeedShareElementInfo.a(view2);
                    } else {
                        a2 = FeedShareElementInfo.a(view);
                    }
                    if (a2 != null) {
                        a2.f79857c = this.f79867c.get();
                        FeedShareElementInfo.a(view, a2);
                    }
                }
            }
            Activity activity = this.f79865a;
            DataCenter dataCenter = this.f79868d;
            l.b(dataCenter, "");
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeClipBounds());
            transitionSet.addTransition(new ChangeTransform());
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.addTransition(new ChangeImageTransform());
            transitionSet.setDuration(300L);
            transitionSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            Window window = activity.getWindow();
            l.b(window, "");
            window.setSharedElementEnterTransition(transitionSet);
            Fade fade = new Fade();
            fade.setDuration(300);
            fade.setInterpolator(new AccelerateDecelerateInterpolator());
            Window window2 = activity.getWindow();
            l.b(window2, "");
            window2.setEnterTransition(fade);
            Fade fade2 = new Fade();
            fade2.setDuration(300);
            fade2.setInterpolator(new AccelerateDecelerateInterpolator());
            Window window3 = activity.getWindow();
            l.b(window3, "");
            window3.setExitTransition(fade2);
            Window window4 = activity.getWindow();
            l.b(window4, "");
            Transition enterTransition = window4.getEnterTransition();
            Window window5 = activity.getWindow();
            l.b(window5, "");
            Transition exitTransition = window5.getExitTransition();
            if (enterTransition != null) {
                enterTransition.excludeTarget("android:status:background", true);
                enterTransition.excludeTarget("android:navigation:background", true);
            }
            if (exitTransition != null) {
                exitTransition.excludeTarget("android:status:background", true);
                exitTransition.excludeTarget("android:navigation:background", true);
            }
            transitionSet.addListener((Transition.TransitionListener) new e(dataCenter));
            if (this.f79867c.get()) {
                this.f79868d.a("feed_transition_state", (Object) true);
            }
        }

        public d(Activity activity, c cVar, AtomicBoolean atomicBoolean, DataCenter dataCenter) {
            this.f79865a = activity;
            this.f79866b = cVar;
            this.f79867c = atomicBoolean;
            this.f79868d = dataCenter;
        }
    }

    public static final void a(Activity activity, int i2) {
        l.d(activity, "");
        if (i2 == -1) {
            androidx.core.app.a.b(activity);
            Window window = activity.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            decorView.getViewTreeObserver().addOnPreDrawListener(new b(decorView, activity));
        }
    }

    public static void a(Activity activity, c cVar, List<String> list, Map<String, View> map) {
        FeedShareElementInfo<?>[] e2 = cVar.e();
        if (list != null) {
            list.clear();
        }
        if (map != null) {
            map.clear();
        }
        for (FeedShareElementInfo<?> feedShareElementInfo : e2) {
            View view = feedShareElementInfo.f79855a;
            if (view != null) {
                Window window = activity.getWindow();
                l.b(window, "");
                View decorView = window.getDecorView();
                l.b(decorView, "");
                Rect rect = new Rect();
                decorView.getHitRect(rect);
                if (view.getLocalVisibleRect(rect)) {
                    if (list != null) {
                        list.add(String.valueOf(v.l(view)));
                    }
                    if (map != null) {
                        map.put(String.valueOf(v.l(view)), view);
                    }
                }
            }
        }
    }
}
