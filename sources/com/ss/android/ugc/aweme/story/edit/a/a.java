package com.ss.android.ugc.aweme.story.edit.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.interact.view.f;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.en;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class a extends com.ss.android.ugc.aweme.sticker.view.a {

    /* renamed from: g  reason: collision with root package name */
    public static final C3588a f137042g = new C3588a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final RectF f137043h;

    /* renamed from: i  reason: collision with root package name */
    private final h f137044i;

    /* renamed from: j  reason: collision with root package name */
    private final h f137045j;

    static {
        Covode.recordClassIndex(89596);
    }

    private final DashPathEffect getDashPathEffect() {
        return (DashPathEffect) this.f137044i.getValue();
    }

    private final int getFakeViewStyle() {
        return ((Number) this.f137045j.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.a.a$a  reason: collision with other inner class name */
    public static final class C3588a {
        static {
            Covode.recordClassIndex(89597);
        }

        private C3588a() {
        }

        public /* synthetic */ C3588a(byte b2) {
            this();
        }
    }

    private final boolean d() {
        if (getFakeViewStyle() == 0) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<DashPathEffect> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137046a = new b();

        static {
            Covode.recordClassIndex(89598);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DashPathEffect invoke() {
            return new DashPathEffect(new float[]{(float) en.a(4.0d, i.f115645a), (float) en.a(4.0d, i.f115645a)}, 0.0f);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137047a = new c();

        static {
            Covode.recordClassIndex(89599);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            return Integer.valueOf(!createIAVServiceProxybyMonsterPlugin.getStoryService().a());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a
    public final boolean a() {
        if (super.a() || this.f136188d.top <= this.f136185a.top) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a
    public final void a(Canvas canvas) {
        Paint paint = this.f136186b;
        l.b(paint, "");
        paint.setPathEffect(getDashPathEffect());
        super.a(canvas);
        Paint paint2 = this.f136186b;
        l.b(paint2, "");
        paint2.setPathEffect(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null);
        l.d(context, "");
        this.f137043h = new RectF();
        this.f137044i = h.i.a((h.f.a.a) b.f137046a);
        this.f137045j = h.i.a((h.f.a.a) c.f137047a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a
    public final void c(Context context) {
        f dVar;
        com.ss.android.ugc.tools.view.b bVar;
        if (this.f136190f == null && getEnableFakeFeedView()) {
            if (d()) {
                if (context == null) {
                    l.b();
                }
                dVar = new c(context, (byte) 0);
            } else {
                if (context == null) {
                    l.b();
                }
                dVar = new d(context, (byte) 0);
            }
            this.f136190f = dVar;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh.b(getContext()), com.ss.android.ugc.aweme.sticker.view.a.a(context));
            layoutParams.gravity = 1;
            if (d() && (bVar = g.f88154a) != null && !bVar.e()) {
                layoutParams.topMargin = dh.c(context);
            }
            this.f136190f.getContentView().setLayoutParams(layoutParams);
            addView(this.f136190f.getContentView());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a
    public final void b(Context context) {
        float f2;
        int i2;
        if (!d()) {
            super.b(context);
        } else if (this.f136185a == null) {
            com.ss.android.ugc.tools.view.b bVar = g.f88154a;
            if (bVar == null || bVar.e()) {
                f2 = 0.0f;
            } else {
                f2 = (float) dh.c(context);
            }
            float a2 = (float) en.a(8.0d, i.f115645a);
            float a3 = ((float) en.a(60.0d, i.f115645a)) + f2;
            float b2 = ((float) dh.b(context)) - ((float) en.a(8.0d, i.f115645a));
            float e2 = ((float) dh.e(context)) - ((float) en.a(8.0d, i.f115645a));
            com.ss.android.ugc.tools.view.b bVar2 = g.f88154a;
            int i3 = 0;
            if (bVar2 != null) {
                i2 = bVar2.f();
            } else {
                i2 = 0;
            }
            float f3 = e2 - ((float) i2);
            com.ss.android.ugc.tools.view.b bVar3 = g.f88154a;
            if (bVar3 != null) {
                i3 = bVar3.d();
            }
            this.f136185a = new RectF(a2, a3, b2, f3 - ((float) i3));
            this.f137043h.set(this.f136185a.left, -((float) dh.a(getContext())), this.f136185a.right, this.f136185a.bottom);
        }
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.e, com.ss.android.ugc.aweme.sticker.view.a
    public final boolean b(PointF[] pointFArr, float f2, float f3) {
        if (!d()) {
            return super.b(pointFArr, f2, f3);
        }
        if (pointFArr == null) {
            return true;
        }
        RectF a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(pointFArr);
        l.b(a2, "");
        if (a2.isEmpty()) {
            return true;
        }
        a2.offset(((float) this.f136187c) + f2, f3);
        return this.f137043h.contains(a2);
    }
}
