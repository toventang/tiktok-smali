package com.ss.android.ugc.aweme.story.edit.business.shared.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f137410e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f137411a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.asve.editor.g f137412b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.preview.a f137413c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.publish.a f137414d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f137415f = h.i.a((h.f.a.a) new g(this));

    /* renamed from: g  reason: collision with root package name */
    private final Activity f137416g;

    static {
        Covode.recordClassIndex(89868);
    }

    private final boolean b() {
        return ((Boolean) this.f137415f.getValue()).booleanValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89869);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements TypeEvaluator<Float> {
        static {
            Covode.recordClassIndex(89872);
        }

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = f3.floatValue();
            float floatValue2 = f4.floatValue();
            if (f2 >= 0.5f) {
                floatValue += (floatValue2 - floatValue) * ((f2 * 2.0f) - 1.0f);
            }
            return Float.valueOf(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f137434a = new j();

        static {
            Covode.recordClassIndex(89878);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (Build.VERSION.SDK_INT < 21 || !this.this$0.f137414d.f118606a) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class e implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.shortvideo.widget.a.a f137426a = new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.36d, 0.12d, 0.92d, 0.87d);

        /* renamed from: b  reason: collision with root package name */
        private final FloatEvaluator f137427b = new FloatEvaluator();

        static {
            Covode.recordClassIndex(89873);
        }

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f2, Float f3, Float f4) {
            Float evaluate = this.f137427b.evaluate(this.f137426a.getInterpolation(f2), (Number) f3, (Number) f4);
            l.b(evaluate, "");
            return evaluate;
        }
    }

    public static final class f implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.shortvideo.widget.a.a f137428a = new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.36d, 0.34d, 0.82d, 0.95d);

        /* renamed from: b  reason: collision with root package name */
        private final FloatEvaluator f137429b = new FloatEvaluator();

        static {
            Covode.recordClassIndex(89874);
        }

        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f2, Float f3, Float f4) {
            Float evaluate = this.f137429b.evaluate(this.f137428a.getInterpolation(f2), (Number) f3, (Number) f4);
            l.b(evaluate, "");
            return evaluate;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f137435a;

        static {
            Covode.recordClassIndex(89879);
        }

        k(z.e eVar) {
            this.f137435a = eVar;
        }

        public final void run() {
            for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(d.f137440a)) {
                l.b(iStoryPublishAnimateListener, "");
                iStoryPublishAnimateListener.onAnimateStart();
            }
            this.f137435a.element.start();
        }
    }

    public final b.i<h.z> a() {
        if (!b()) {
            b.i<h.z> a2 = b.i.a(h.z.f158842a);
            l.b(a2, "");
            return a2;
        }
        b.i<h.z> b2 = b.i.b(new h(this, this.f137416g.findViewById(16908290)), b.i.f4824a);
        l.b(b2, "");
        return b2;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f137423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f137424d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicBoolean f137425e = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(89871);
        }

        private final void a() {
            if (this.f137425e.compareAndSet(false, true)) {
                this.f137423c.getOverlay().remove(this.f137422b);
                this.f137422b.setAlpha(0.0f);
                this.f137422b.setImageDrawable(new ColorDrawable(0));
                this.f137421a.f137411a = null;
                for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(d.f137440a)) {
                    l.b(iStoryPublishAnimateListener, "");
                    iStoryPublishAnimateListener.onAnimateFinish();
                }
                this.f137424d.invoke();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            a();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a();
        }

        c(b bVar, c cVar, ViewGroup viewGroup, h.f.a.a aVar) {
            this.f137421a = bVar;
            this.f137422b = cVar;
            this.f137423c = viewGroup;
            this.f137424d = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f137431b;

        static {
            Covode.recordClassIndex(89876);
        }

        h(b bVar, View view) {
            this.f137430a = bVar;
            this.f137431b = view;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bitmap c2;
            Bitmap bitmap;
            MethodCollector.i(2893);
            b bVar = this.f137430a;
            com.ss.android.ugc.asve.editor.g gVar = bVar.f137412b;
            Bitmap bitmap2 = null;
            if (!(gVar == null || (c2 = gVar.c()) == null)) {
                View view = this.f137431b;
                l.b(view, "");
                l.d(view, "");
                if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                    bitmap = null;
                } else {
                    bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    if (view.getBackground() != null) {
                        view.getBackground().draw(canvas);
                    }
                    view.draw(canvas);
                }
                int b2 = this.f137430a.f137413c.b();
                int c3 = this.f137430a.f137413c.c();
                float f2 = (float) this.f137430a.f137413c.a().leftMargin;
                float f3 = (float) this.f137430a.f137413c.a().topMargin;
                if (bitmap == null) {
                    bitmap2 = c2;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(Math.max(c2.getWidth(), bitmap.getWidth()), Math.max(c2.getHeight(), bitmap.getHeight()), c2.getConfig());
                    Canvas canvas2 = new Canvas(createBitmap);
                    Matrix matrix = new Matrix();
                    matrix.postScale((((float) b2) * 1.0f) / ((float) c2.getWidth()), (((float) c3) * 1.0f) / ((float) c2.getHeight()));
                    matrix.postTranslate(f2, f3);
                    canvas2.drawBitmap(c2, matrix, null);
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    c2.recycle();
                    bitmap.recycle();
                    l.b(createBitmap, "");
                    bitmap2 = createBitmap;
                }
            }
            bVar.f137411a = bitmap2;
            h.z zVar = h.z.f158842a;
            MethodCollector.o(2893);
            return zVar;
        }
    }

    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f137433b;

        static {
            Covode.recordClassIndex(89877);
        }

        public i(b bVar, Intent intent) {
            this.f137432a = bVar;
            this.f137433b = intent;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            b.a(this.f137432a, this.f137433b, null, 2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$b  reason: collision with other inner class name */
    public static final class C3607b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f137418b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f137419c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f137420d;

        static {
            Covode.recordClassIndex(89870);
        }

        C3607b(b bVar, c cVar, ViewGroup viewGroup, h.f.a.a aVar) {
            this.f137417a = bVar;
            this.f137418b = cVar;
            this.f137419c = viewGroup;
            this.f137420d = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float height = (((float) (this.f137418b.getHeight() - this.f137418b.getWidth())) / 2.0f) * animatedFraction;
            this.f137418b.setRenderRadius((((float) this.f137418b.getWidth()) / 2.0f) * animatedFraction);
            c cVar = this.f137418b;
            cVar.f137436a[0] = 0.0f;
            cVar.f137436a[1] = height;
            cVar.f137436a[2] = 0.0f;
            cVar.f137436a[3] = height;
            this.f137418b.invalidate();
            for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(d.f137440a)) {
                l.b(iStoryPublishAnimateListener, "");
                iStoryPublishAnimateListener.onAnimateUpdate(animatedFraction);
            }
        }
    }

    public b(Activity activity, com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, com.ss.android.ugc.aweme.publish.a aVar2) {
        l.d(activity, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f137416g = activity;
        this.f137412b = gVar;
        this.f137413c = aVar;
        this.f137414d = aVar2;
    }

    public static /* synthetic */ void a(b bVar, Intent intent, h.f.a.a aVar, int i2) {
        boolean z;
        Window window;
        View decorView;
        h.f.a.a aVar2 = aVar;
        if ((i2 & 1) != 0) {
            intent = null;
        }
        if ((i2 & 2) != 0) {
            aVar2 = j.f137434a;
        }
        l.d(aVar2, "");
        z.e eVar = new z.e();
        eVar.element = null;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        l.b(applicationService, "");
        Class<? extends androidx.fragment.app.e> e2 = applicationService.e();
        l.b(e2, "");
        Activity findActivityInstance = com.ss.android.ugc.aweme.port.in.g.a().l().findActivityInstance(e2);
        if (!bVar.b() || bVar.f137411a == null || findActivityInstance == null) {
            z = false;
        } else {
            z = true;
            ViewGroup viewGroup = (ViewGroup) findActivityInstance.findViewById(16908290);
            l.b(viewGroup, "");
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            c cVar = new c(findActivityInstance);
            cVar.setImageBitmap(bVar.f137411a);
            cVar.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            cVar.layout(0, 0, width, height);
            viewGroup.getOverlay().add(cVar);
            f fVar = new f();
            e eVar2 = new e();
            d dVar = new d();
            float[] invoke = bVar.f137414d.f118607b.invoke();
            cVar.setPivotX(0.0f);
            cVar.setPivotY(((float) cVar.getHeight()) / 2.0f);
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.1f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.1f);
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("translationX", 0.0f, invoke[0] - ((((float) cVar.getWidth()) * 0.1f) / 2.0f));
            ofFloat3.setEvaluator(eVar2);
            PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("translationY", 0.0f, invoke[1] - ((float) (cVar.getHeight() / 2)));
            ofFloat4.setEvaluator(fVar);
            PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.3f);
            ofFloat5.setEvaluator(dVar);
            T t = (T) ObjectAnimator.ofPropertyValuesHolder(cVar, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
            t.setDuration(500);
            t.setInterpolator(new com.ss.android.ugc.aweme.shortvideo.widget.a.a(0.39d, 0.05d, 0.61d, 0.94d));
            t.addUpdateListener(new C3607b(bVar, cVar, viewGroup, aVar2));
            t.addListener(new c(bVar, cVar, viewGroup, aVar2));
            l.b(t, "");
            eVar.element = t;
        }
        Intent intent2 = new Intent(bVar.f137416g, e2);
        intent2.addFlags(603979776);
        if (z) {
            intent2.addFlags(65536);
        }
        Activity activity = bVar.f137416g;
        if (intent != null) {
            intent2 = intent;
        }
        com.ss.android.ugc.tiktok.security.a.a.a(intent2, activity);
        activity.startActivity(intent2);
        if (!z || eVar.element == null) {
            aVar2.invoke();
            return;
        }
        bVar.f137416g.overridePendingTransition(0, R.anim.e5);
        if (findActivityInstance != null && (window = findActivityInstance.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new k(eVar));
        }
    }
}
