package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.InteractStickerParent;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.k.d;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.z;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class InteractStickerWidget extends AbsInteractStickerWidget implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.j f130647h;

    /* renamed from: i  reason: collision with root package name */
    public InteractStickerParent f130648i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g f130649j;

    /* renamed from: k  reason: collision with root package name */
    public Aweme f130650k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a f130651l;

    /* renamed from: m  reason: collision with root package name */
    private List<? extends InteractStickerStruct> f130652m;
    private List<? extends InteractStickerStruct> n;
    private InteractStickerViewModel o;
    private List<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c> p = new ArrayList();
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e q;
    private final Map<Integer, Integer> r = ag.a(new p(6, 1), new p(4, 2), new p(7, 2), new p(10, 3), new p(3, 4));

    public interface a {
        static {
            Covode.recordClassIndex(85664);
        }

        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a();
    }

    static {
        Covode.recordClassIndex(85663);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int c() {
        return R.layout.bkn;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(202, new org.greenrobot.eventbus.g(InteractStickerWidget.class, "onDissmissInteractWindow", com.ss.android.ugc.aweme.feed.i.i.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e a() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        EventBus.a(EventBus.a(), this);
        this.f130648i = view != null ? (InteractStickerParent) view.findViewById(R.id.dqe) : null;
        int i2 = Build.VERSION.SDK_INT;
        InteractStickerParent interactStickerParent = this.f130648i;
        if (interactStickerParent != null) {
            interactStickerParent.setLayoutDirection(0);
        }
        Activity d2 = d();
        h.f.b.l.b(d2, "");
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a(d2, this.p, this.f130647h, this.f130649j, this);
        this.f130651l = aVar;
        InteractStickerParent interactStickerParent2 = this.f130648i;
        if (interactStickerParent2 != null) {
            interactStickerParent2.setOnTouchListener(aVar);
        }
        if (this.f67010e != null) {
            this.f130647h = (com.ss.android.ugc.aweme.sticker.j) this.f67010e.a("interact_sticker_data");
            this.f130652m = (List) this.f67010e.a("interact_sticker_aweme_data");
            this.n = (List) this.f67010e.a("interact_sticker_video_data");
        } else {
            this.f130647h = (com.ss.android.ugc.aweme.sticker.j) e().a("interact_sticker_data");
            this.f130652m = (List) e().a("interact_sticker_aweme_data");
            this.n = (List) e().a("interact_sticker_video_data");
        }
        a(this.f130647h);
        a(this.f130652m, this.n);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void a(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g gVar) {
        h.f.b.l.d(gVar, "");
        this.f130649j = gVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a
    public final void a(long j2, MotionEvent motionEvent) {
        float f2;
        float f3;
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar : h.a.n.h((Iterable) this.p)) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e eVar = cVar.f130346d;
            int b2 = cVar.f130346d.b();
            if (motionEvent != null) {
                f2 = motionEvent.getX();
                f3 = motionEvent.getY();
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (eVar.a(j2, b2, f2, f3, new o(cVar, this, j2, motionEvent))) {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    private void h() {
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void i() {
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().f130346d.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final InteractStickerViewModel e() {
        if (this.o == null) {
            InteractStickerViewModel interactStickerViewModel = new InteractStickerViewModel();
            this.o = interactStickerViewModel;
            interactStickerViewModel.f130639a = this;
        }
        InteractStickerViewModel interactStickerViewModel2 = this.o;
        if (interactStickerViewModel2 == null) {
            h.f.b.l.b();
        }
        return interactStickerViewModel2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.f
    public final void f() {
        for (T t : this.p) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e eVar = t.f130346d;
            t.f130346d.b();
            eVar.i();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.f
    public final void g() {
        for (T t : this.p) {
            t.f130346d.b(t.f130346d.b());
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onPause() {
        super.onPause();
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().f130346d.k();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onResume() {
        super.onResume();
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().f130346d.j();
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130654b;

        static {
            Covode.recordClassIndex(85665);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            Context context = this.f130654b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130654b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130653a;
            InteractStickerParent interactStickerParent = this.f130654b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            return d.a.a(context, jVar, interactStickerStruct, interactStickerParent, this.f130654b.f130649j, this.f130654b.f130650k);
        }

        b(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130653a = interactStickerStruct;
            this.f130654b = interactStickerWidget;
        }
    }

    public static final class h implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130666b;

        static {
            Covode.recordClassIndex(85671);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            Context context = this.f130666b.f67007b;
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130666b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130665a;
            InteractStickerParent interactStickerParent = this.f130666b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g gVar = this.f130666b.f130649j;
            d.a a2 = jVar.n.a();
            jVar.f134920a = (float) a2.f134941a;
            jVar.f134921b = (float) a2.f134942b;
            return new com.ss.android.ugc.aweme.shortvideo.sticker.comment.a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        h(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130665a = interactStickerStruct;
            this.f130666b = interactStickerWidget;
        }
    }

    public static final class j implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130670b;

        static {
            Covode.recordClassIndex(85673);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            Context context = this.f130670b.f67007b;
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130670b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130669a;
            InteractStickerParent interactStickerParent = this.f130670b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g gVar = this.f130670b.f130649j;
            d.a a2 = jVar.n.a();
            jVar.f134920a = (float) a2.f134941a;
            jVar.f134921b = (float) a2.f134942b;
            return new com.ss.android.ugc.aweme.shortvideo.sticker.c.a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        j(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130669a = interactStickerStruct;
            this.f130670b = interactStickerWidget;
        }
    }

    public static final class k implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130672b;

        static {
            Covode.recordClassIndex(85674);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            Context context = this.f130672b.f67007b;
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130672b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130671a;
            InteractStickerParent interactStickerParent = this.f130672b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g gVar = this.f130672b.f130649j;
            d.a a2 = jVar.n.a();
            jVar.f134920a = (float) a2.f134941a;
            jVar.f134921b = (float) a2.f134942b;
            return new com.ss.android.ugc.aweme.shortvideo.sticker.question.c(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, gVar);
        }

        k(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130671a = interactStickerStruct;
            this.f130672b = interactStickerWidget;
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130656b;

        static {
            Covode.recordClassIndex(85666);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130656b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130656b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130655a;
            InteractStickerParent interactStickerParent = this.f130656b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            Aweme aweme = this.f130656b.f130650k;
            if (aweme == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            h.f.b.l.d(aweme, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.question.a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        c(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130655a = interactStickerStruct;
            this.f130656b = interactStickerWidget;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130658b;

        static {
            Covode.recordClassIndex(85667);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130658b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130658b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130657a;
            InteractStickerParent interactStickerParent = this.f130658b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            Aweme aweme = this.f130658b.f130650k;
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        d(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130657a = interactStickerStruct;
            this.f130658b = interactStickerWidget;
        }
    }

    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130660b;

        static {
            Covode.recordClassIndex(85668);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130660b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130660b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130659a;
            InteractStickerParent interactStickerParent = this.f130660b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            InteractStickerWidget interactStickerWidget = this.f130660b;
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            h.f.b.l.d(interactStickerWidget, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, interactStickerWidget);
        }

        e(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130659a = interactStickerStruct;
            this.f130660b = interactStickerWidget;
        }
    }

    public static final class f implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130662b;

        static {
            Covode.recordClassIndex(85669);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130662b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130662b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130661a;
            InteractStickerParent interactStickerParent = this.f130662b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            Aweme aweme = this.f130662b.f130650k;
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        f(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130661a = interactStickerStruct;
            this.f130662b = interactStickerWidget;
        }
    }

    public static final class g implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130664b;

        static {
            Covode.recordClassIndex(85670);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130664b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130664b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130663a;
            InteractStickerParent interactStickerParent = this.f130664b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            Aweme aweme = this.f130664b.f130650k;
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar, aweme);
        }

        g(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130663a = interactStickerStruct;
            this.f130664b = interactStickerWidget;
        }
    }

    public static final class i implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130668b;

        static {
            Covode.recordClassIndex(85672);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130668b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130668b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130667a;
            InteractStickerParent interactStickerParent = this.f130668b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new r(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        i(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130667a = interactStickerStruct;
            this.f130668b = interactStickerWidget;
        }
    }

    public static final class l implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f130673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130674b;

        static {
            Covode.recordClassIndex(85675);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.a
        public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a() {
            d.a aVar;
            float f2;
            Context context = this.f130674b.f67007b;
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130674b.f130647h;
            InteractStickerStruct interactStickerStruct = this.f130673a;
            InteractStickerParent interactStickerParent = this.f130674b.f130648i;
            if (interactStickerParent == null) {
                h.f.b.l.b();
            }
            h.f.b.l.d(context, "");
            h.f.b.l.d(interactStickerStruct, "");
            h.f.b.l.d(interactStickerParent, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            return new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.n(interactStickerStruct.getType(), context, interactStickerParent, interactStickerStruct, jVar);
        }

        l(InteractStickerStruct interactStickerStruct, InteractStickerWidget interactStickerWidget) {
            this.f130673a = interactStickerStruct;
            this.f130674b = interactStickerWidget;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget
    public final void onCreate() {
        super.onCreate();
        if (this.f67010e != null) {
            this.f67010e.a("interact_sticker_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.f67010e.a("interact_sticker_video_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.f67010e.a("interact_sticker_aweme_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.f67010e.a("interact_sticker_clear_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            this.f67010e.a("interact_sticker_update_intro_layout_y", this, true);
            this.f67010e.a("viewholder_select_status_changed", this, true);
            return;
        }
        e().a("interact_sticker_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e().a("interact_sticker_video_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e().a("interact_sticker_aweme_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e().a("interact_sticker_clear_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        e().a("interact_sticker_update_intro_layout_y", this, true);
        e().a("viewholder_select_status_changed", this, true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void a(Aweme aweme) {
        this.f130650k = aweme;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f
    public final void a(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.e eVar) {
        h.f.b.l.d(eVar, "");
        this.q = eVar;
    }

    @org.greenrobot.eventbus.r
    public final void onDissmissInteractWindow(com.ss.android.ugc.aweme.feed.i.i iVar) {
        h.f.b.l.d(iVar, "");
        int i2 = iVar.f93482a;
        for (T t : this.p) {
            if (t.f130346d.m() != i2) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e eVar = t.f130346d;
                t.f130346d.b();
                eVar.i();
            }
        }
    }

    public static final class o implements com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c f130676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130677b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f130678c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MotionEvent f130679d;

        static {
            Covode.recordClassIndex(85678);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b
        public final void a(boolean z) {
            com.ss.android.ugc.aweme.sticker.k.a aVar;
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130677b.f130647h;
            if (!(jVar == null || (aVar = jVar.o) == null)) {
                this.f130676a.f130346d.b();
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e eVar = this.f130676a.f130346d;
                this.f130676a.f130346d.b();
                eVar.a();
                MotionEvent motionEvent = this.f130679d;
                if (motionEvent != null) {
                    motionEvent.getX();
                }
                MotionEvent motionEvent2 = this.f130679d;
                if (motionEvent2 != null) {
                    motionEvent2.getY();
                }
                this.f130676a.f130346d.l();
                aVar.a(z);
            }
            com.ss.android.ugc.aweme.sticker.j jVar2 = this.f130677b.f130647h;
            if (jVar2 != null && jVar2.o != null) {
                this.f130676a.f130346d.b();
            }
        }

        o(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar, InteractStickerWidget interactStickerWidget, long j2, MotionEvent motionEvent) {
            this.f130676a = cVar;
            this.f130677b = interactStickerWidget;
            this.f130678c = j2;
            this.f130679d = motionEvent;
        }
    }

    private final void a(com.ss.android.ugc.aweme.sticker.j jVar) {
        d.a aVar;
        int i2;
        boolean z;
        float f2;
        com.ss.android.ugc.aweme.sticker.k.d dVar;
        if (jVar == null || (dVar = jVar.n) == null) {
            aVar = null;
        } else {
            aVar = dVar.a();
        }
        float f3 = 0.0f;
        if (jVar != null) {
            if (aVar != null) {
                f2 = (float) aVar.f134941a;
            } else {
                f2 = 0.0f;
            }
            jVar.f134920a = f2;
            if (aVar != null) {
                f3 = (float) aVar.f134942b;
            }
            jVar.f134921b = f3;
        }
        InteractStickerParent interactStickerParent = this.f130648i;
        if (interactStickerParent != null) {
            if (jVar != null) {
                z = jVar.f134932m;
            } else {
                z = true;
            }
            interactStickerParent.setNeedConsumeEvent(z);
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar2 = this.f130651l;
        if (aVar2 != null) {
            aVar2.p = jVar;
        }
        if (jVar != null) {
            for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar : this.p) {
                cVar.f130346d.a(jVar);
                View view = cVar.f130344b;
                int i3 = 0;
                if (aVar != null) {
                    i2 = aVar.f134943c;
                    i3 = aVar.f134944d;
                } else {
                    i2 = 0;
                }
                a(view, i2, i3);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null) {
            switch (str.hashCode()) {
                case -1213045287:
                    if (str.equals("interact_sticker_video_data")) {
                        List<? extends InteractStickerStruct> list = (List) bVar2.a();
                        this.n = list;
                        a((List<? extends InteractStickerStruct>) null, list);
                        return;
                    }
                    return;
                case -949174003:
                    if (str.equals("interact_sticker_aweme_data")) {
                        List<? extends InteractStickerStruct> list2 = (List) bVar2.a();
                        this.f130652m = list2;
                        a(list2, (List<? extends InteractStickerStruct>) null);
                        return;
                    }
                    return;
                case -821385854:
                    if (str.equals("interact_sticker_update_intro_layout_y")) {
                        Object a2 = bVar2.a();
                        h.f.b.l.b(a2, "");
                        a((p) a2);
                        return;
                    }
                    return;
                case -328001721:
                    if (str.equals("interact_sticker_clear_data")) {
                        InteractStickerParent interactStickerParent = this.f130648i;
                        if (interactStickerParent != null) {
                            interactStickerParent.removeAllViews();
                        }
                        this.f130652m = null;
                        this.n = null;
                        this.p = new ArrayList();
                        return;
                    }
                    return;
                case -153749291:
                    if (str.equals("interact_sticker_data")) {
                        com.ss.android.ugc.aweme.sticker.j jVar = (com.ss.android.ugc.aweme.sticker.j) bVar2.a();
                        this.f130647h = jVar;
                        a(jVar);
                        return;
                    }
                    return;
                case 1341960156:
                    if (str.equals("viewholder_select_status_changed")) {
                        Object a3 = bVar2.a();
                        h.f.b.l.b(a3, "");
                        if (((Boolean) a3).booleanValue()) {
                            h();
                            return;
                        } else {
                            i();
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private final void a(p<Integer, Integer> pVar) {
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar : this.p) {
            if (cVar.f130345c.getType() == 11) {
                cVar.f130346d.b(pVar.getFirst().intValue(), pVar.getSecond().intValue());
            }
        }
    }

    public final int a(int i2) {
        for (Map.Entry<Integer, Integer> entry : this.r.entrySet()) {
            if (entry.getKey().intValue() == i2) {
                return entry.getValue().intValue();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a
    public final void b(long j2, MotionEvent motionEvent) {
        a(j2, motionEvent);
    }

    public static final class m<T> implements Comparator {
        static {
            Covode.recordClassIndex(85676);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.getIndex()), Integer.valueOf(t2.getIndex()));
        }
    }

    public static final class n<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InteractStickerWidget f130675a;

        static {
            Covode.recordClassIndex(85677);
        }

        public n(InteractStickerWidget interactStickerWidget) {
            this.f130675a = interactStickerWidget;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(this.f130675a.a(t.getType())), Integer.valueOf(this.f130675a.a(t2.getType())));
        }
    }

    private final void a(InteractStickerStruct interactStickerStruct, a aVar) {
        if (com.bytedance.common.utility.collection.b.a((Collection) this.p)) {
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a2 = aVar.a();
            if (a2 != null) {
                a2.b();
                View a3 = a2.a();
                if (a3 == null) {
                    h.f.b.l.b();
                }
                a(0, a3, interactStickerStruct, a2, false);
                return;
            }
            return;
        }
        int i2 = 0;
        for (T t : this.p) {
            if (h.f.b.l.a(t.f130345c, interactStickerStruct)) {
                t.f130346d.a(interactStickerStruct);
                return;
            } else if (interactStickerStruct.getType() != 5 && interactStickerStruct.getType() != 9 && interactStickerStruct.getType() != 8 && t.f130345c.getType() == interactStickerStruct.getType()) {
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a4 = aVar.a();
                if (a4 != null) {
                    a4.b();
                    View a5 = a4.a();
                    if (a5 == null) {
                        h.f.b.l.b();
                    }
                    a(i2, a5, interactStickerStruct, a4, true);
                    return;
                }
                return;
            } else if (i2 == this.p.size() - 1 || a(interactStickerStruct.getType()) >= a(t.f130345c.getType())) {
                if (i2 == this.p.size() - 1 && a(interactStickerStruct.getType()) >= a(t.f130345c.getType())) {
                    i2++;
                }
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e a6 = aVar.a();
                if (a6 != null) {
                    a6.b();
                    View a7 = a6.a();
                    if (a7 == null) {
                        h.f.b.l.b();
                    }
                    a(i2, a7, interactStickerStruct, a6, false);
                    return;
                }
                return;
            } else {
                i2++;
            }
        }
    }

    private final void a(List<? extends InteractStickerStruct> list, List<? extends InteractStickerStruct> list2) {
        List list3;
        List list4;
        int i2;
        int i3;
        com.ss.android.ugc.aweme.sticker.k.d dVar;
        ArrayList<InteractStickerStruct> arrayList = new ArrayList();
        d.a aVar = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                if (t.getType() == 5) {
                    arrayList2.add(t);
                }
            }
            list4 = h.a.n.a((Iterable) arrayList2, (Comparator) new m());
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : list) {
                if (t2.getType() != 5) {
                    arrayList3.add(t2);
                }
            }
            list3 = h.a.n.a((Iterable) arrayList3, (Comparator) new n(this));
        } else {
            list4 = null;
            list3 = null;
        }
        if (list2 == null) {
            list2 = z.INSTANCE;
        }
        arrayList.addAll(list2);
        if (list4 == null) {
            list4 = z.INSTANCE;
        }
        arrayList.addAll(list4);
        if (list3 == null) {
            list3 = z.INSTANCE;
        }
        arrayList.addAll(list3);
        for (InteractStickerStruct interactStickerStruct : arrayList) {
            int type = interactStickerStruct.getType();
            if (type != 16) {
                if (type != 17) {
                    switch (type) {
                        case 2:
                            a(interactStickerStruct, new b(interactStickerStruct, this));
                            continue;
                        case 3:
                            a(interactStickerStruct, new e(interactStickerStruct, this));
                            continue;
                        case 4:
                            a(interactStickerStruct, new h(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            a(interactStickerStruct, new i(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            a(interactStickerStruct, new j(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            a(interactStickerStruct, new k(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            a(interactStickerStruct, new l(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            a(interactStickerStruct, new g(interactStickerStruct, this));
                            continue;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            if (com.ss.android.ugc.aweme.feed.x.g.d(this.f130650k)) {
                                a(interactStickerStruct, new d(interactStickerStruct, this));
                                break;
                            } else {
                                continue;
                            }
                    }
                } else {
                    a(interactStickerStruct, new c(interactStickerStruct, this));
                }
            } else if (AVExternalServiceImpl.a().configService().avsettingsConfig().getDuetStickerAB()) {
                a(interactStickerStruct, new f(interactStickerStruct, this));
            }
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a aVar2 = this.f130651l;
        if (aVar2 != null) {
            aVar2.a(this.p);
        }
        com.ss.android.ugc.aweme.sticker.j jVar = this.f130647h;
        if (!(jVar == null || (dVar = jVar.n) == null)) {
            aVar = dVar.a();
        }
        for (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c cVar : this.p) {
            View view = cVar.f130344b;
            if (aVar != null) {
                i2 = aVar.f134943c;
                i3 = aVar.f134944d;
            } else {
                i2 = 0;
                i3 = 0;
            }
            a(view, i2, i3);
        }
    }

    private static void a(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i2;
            layoutParams2.topMargin = i3;
            view.setLayoutParams(layoutParams2);
        }
    }

    private final void a(int i2, View view, InteractStickerStruct interactStickerStruct, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e eVar, boolean z) {
        if (i2 >= 0 && i2 < this.p.size() && z) {
            try {
                this.p.remove(i2);
                InteractStickerParent interactStickerParent = this.f130648i;
                if (interactStickerParent != null) {
                    interactStickerParent.removeViewAt(i2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        this.p.add(i2, new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c(i2, view, interactStickerStruct, eVar));
        InteractStickerParent interactStickerParent2 = this.f130648i;
        if (interactStickerParent2 != null) {
            interactStickerParent2.addView(view, i2);
        }
    }
}
