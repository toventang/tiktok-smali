package com.ss.android.ugc.aweme.canvas.guide;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import f.a.d.f;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.concurrent.TimeUnit;

public final class CanvasGestureGuideWidget {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f69686a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.fragment.app.e f69687b;

    /* renamed from: c  reason: collision with root package name */
    final SimpleDraweeView f69688c;

    /* renamed from: d  reason: collision with root package name */
    public final View f69689d;

    /* renamed from: e  reason: collision with root package name */
    private final h f69690e = i.a(m.NONE, new c(this));

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f69695a = new e();

        static {
            Covode.recordClassIndex(42979);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(42973);
    }

    public final t<Boolean> a() {
        return (t) this.f69690e.getValue();
    }

    static final class c extends h.f.b.m implements h.f.a.a<t<Boolean>> {
        final /* synthetic */ CanvasGestureGuideWidget this$0;

        static {
            Covode.recordClassIndex(42977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            super(0);
            this.this$0 = canvasGestureGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return EditPhotoCanvasPromptViewModel.a.a(this.this$0.f69687b).f69697a;
        }
    }

    static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CanvasGestureGuideWidget f69694a;

        static {
            Covode.recordClassIndex(42978);
        }

        d(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f69694a = canvasGestureGuideWidget;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f69694a.a().setValue(false);
        }
    }

    public final class CanvasGestureGuideObserver implements au {
        static {
            Covode.recordClassIndex(42974);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            if (aVar == i.a.ON_DESTROY) {
                onDestroy();
            }
        }

        @v(a = i.a.ON_DESTROY)
        public final void onDestroy() {
            f.a.b.b bVar = CanvasGestureGuideWidget.this.f69686a;
            if (bVar != null) {
                bVar.dispose();
            }
            CanvasGestureGuideWidget.this.f69687b.getLifecycle().b(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CanvasGestureGuideObserver() {
        }
    }

    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CanvasGestureGuideWidget f69692a;

        static {
            Covode.recordClassIndex(42975);
        }

        public a(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f69692a = canvasGestureGuideWidget;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.d("guide change ".concat(String.valueOf(bool)), "");
            l.b(bool, "");
            if (bool.booleanValue()) {
                CanvasGestureGuideWidget canvasGestureGuideWidget = this.f69692a;
                f.a.b.b bVar = canvasGestureGuideWidget.f69686a;
                if (bVar != null) {
                    bVar.dispose();
                }
                View view = canvasGestureGuideWidget.f69689d;
                if (view != null) {
                    view.setVisibility(0);
                }
                Uri parse = Uri.parse("asset:///edit_photo_gesture_guide.webp");
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47322j = true;
                com.facebook.drawee.c.a c2 = b2.b(parse).e();
                SimpleDraweeView simpleDraweeView = canvasGestureGuideWidget.f69688c;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setController(c2);
                }
                canvasGestureGuideWidget.f69686a = f.a.h.a.a(f.a.e.e.a.d.f157241a).a(5, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(canvasGestureGuideWidget), e.f69695a);
                return;
            }
            CanvasGestureGuideWidget canvasGestureGuideWidget2 = this.f69692a;
            f.a.b.b bVar2 = canvasGestureGuideWidget2.f69686a;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            View view2 = canvasGestureGuideWidget2.f69689d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    public static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CanvasGestureGuideWidget f69693a;

        static {
            Covode.recordClassIndex(42976);
        }

        public b(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f69693a = canvasGestureGuideWidget;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            if (motionEvent.getAction() == 0) {
                this.f69693a.a().setValue(false);
            }
            return false;
        }
    }

    public CanvasGestureGuideWidget(androidx.fragment.app.e eVar, SimpleDraweeView simpleDraweeView, View view) {
        l.d(eVar, "");
        this.f69687b = eVar;
        this.f69688c = simpleDraweeView;
        this.f69689d = view;
    }
}
