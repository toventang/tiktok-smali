package com.ss.android.ugc.aweme.sticker;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.ss.android.ugc.aweme.shortvideo.edit.i;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import h.f.b.l;

public class s implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f135668a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private View f135669b;

    /* renamed from: c  reason: collision with root package name */
    private i f135670c;

    /* renamed from: d  reason: collision with root package name */
    private int f135671d;

    /* renamed from: e  reason: collision with root package name */
    private int f135672e;

    /* renamed from: f  reason: collision with root package name */
    private int f135673f;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.a<Rect> f135674g;

    static {
        Covode.recordClassIndex(88684);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar, float f2, float f3) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(c cVar) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void b(b bVar) {
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean d(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void e(MotionEvent motionEvent) {
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean f(MotionEvent motionEvent) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88685);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (com.bytedance.ies.abmock.b.a().a(true, "enable_mention_hashtag_sticker", 0) == 1 || com.bytedance.ies.abmock.b.a().a(true, "enable_mention_hashtag_sticker", 0) == 3) {
            return true;
        }
        return false;
    }

    public /* synthetic */ s(i iVar, View view) {
        this(iVar, view, null);
    }

    public s(i iVar, View view, h.f.a.a<Rect> aVar) {
        this.f135670c = iVar;
        this.f135669b = view;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(com.ss.android.ugc.aweme.port.in.i.f115645a);
        l.b(viewConfiguration, "");
        this.f135671d = viewConfiguration.getScaledPagingTouchSlop();
        Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
        l.b(application, "");
        Resources resources = application.getResources();
        l.b(resources, "");
        float f2 = resources.getDisplayMetrics().density;
        this.f135672e = (int) (300.0f * f2);
        this.f135673f = (int) (f2 * 20.0f);
        this.f135674g = aVar;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!c() || motionEvent == null || motionEvent2 == null || Math.abs(f3) < ((float) this.f135672e)) {
            return false;
        }
        float y = motionEvent.getY();
        float y2 = motionEvent2.getY();
        int i2 = (int) y;
        int i3 = (int) y2;
        h.f.a.a<Rect> aVar = this.f135674g;
        if (aVar != null) {
            Rect invoke = aVar.invoke();
            if (i2 < invoke.bottom + this.f135673f || i3 < invoke.bottom + this.f135673f) {
                return false;
            }
        }
        if (y > y2 && Math.abs(y - y2) > Math.abs(motionEvent.getX() - motionEvent2.getX())) {
            i iVar = this.f135670c;
            if (iVar != null) {
                iVar.e();
            }
            return true;
        }
        return false;
    }
}
