package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e;
import com.ss.android.ugc.tools.utils.a.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final GestureDetector$OnDoubleTapListenerC3367a f129328a = new GestureDetector$OnDoubleTapListenerC3367a(this);

    /* renamed from: b  reason: collision with root package name */
    public final g f129329b = new g(this);

    /* renamed from: c  reason: collision with root package name */
    public final c f129330c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    public final e f129331d = new e(this);

    /* renamed from: e  reason: collision with root package name */
    final h f129332e;

    /* renamed from: f  reason: collision with root package name */
    final h f129333f;

    /* renamed from: g  reason: collision with root package name */
    final h f129334g;

    /* renamed from: h  reason: collision with root package name */
    public final b f129335h;

    static {
        Covode.recordClassIndex(84892);
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.tools.utils.a.b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(84896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.utils.a.b invoke() {
            return new com.ss.android.ugc.tools.utils.a.b(this.$context, this.this$0.f129331d);
        }
    }

    static final class f extends m implements h.f.a.a<e> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(84898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e(this.this$0.f129329b);
        }
    }

    static final class b extends m implements h.f.a.a<androidx.core.h.d> {
        final /* synthetic */ Context $context;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(84894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, Context context) {
            super(0);
            this.this$0 = aVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.core.h.d invoke() {
            androidx.core.h.d dVar = new androidx.core.h.d(this.$context, this.this$0.f129330c);
            dVar.a(this.this$0.f129328a);
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$a  reason: collision with other inner class name */
    public static final class GestureDetector$OnDoubleTapListenerC3367a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129336a;

        static {
            Covode.recordClassIndex(84893);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        GestureDetector$OnDoubleTapListenerC3367a(a aVar) {
            this.f129336a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return this.f129336a.f129335h.b(motionEvent);
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return this.f129336a.f129335h.a(motionEvent);
        }
    }

    public static final class c implements GestureDetector.OnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129337a;

        static {
            Covode.recordClassIndex(84895);
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f129337a = aVar;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            return this.f129337a.f129335h.c(motionEvent);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            this.f129337a.f129335h.d(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            return this.f129337a.f129335h.a(motionEvent, motionEvent2, f2, f3);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            return this.f129337a.f129335h.b(motionEvent, motionEvent2, f2, f3);
        }
    }

    public static final class e implements b.AbstractC4046b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129338a;

        static {
            Covode.recordClassIndex(84897);
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
            l.d(bVar, "");
            return true;
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
            l.d(bVar, "");
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f129338a = aVar;
        }

        @Override // com.ss.android.ugc.tools.utils.a.b.AbstractC4046b
        public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
            l.d(bVar, "");
            this.f129338a.f129335h.a(bVar);
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129339a;

        static {
            Covode.recordClassIndex(84899);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(a aVar) {
            this.f129339a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e.b
        public final void c(View view, e eVar) {
            l.d(view, "");
            l.d(eVar, "");
            this.f129339a.f129335h.b(eVar);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e.b
        public final boolean a(View view, e eVar) {
            l.d(view, "");
            l.d(eVar, "");
            return this.f129339a.f129335h.c(eVar);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e.b
        public final boolean b(View view, e eVar) {
            l.d(view, "");
            l.d(eVar, "");
            return this.f129339a.f129335h.a(eVar);
        }
    }

    public a(Context context, b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        this.f129335h = bVar;
        this.f129332e = i.a((h.f.a.a) new b(this, context));
        this.f129333f = i.a((h.f.a.a) new d(this, context));
        this.f129334g = i.a((h.f.a.a) new f(this));
    }
}
