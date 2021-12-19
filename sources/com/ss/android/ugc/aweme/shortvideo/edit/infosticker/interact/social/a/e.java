package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.tools.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class e<T> extends g {
    private d<T> q;
    private float r;
    private boolean s;

    static {
        Covode.recordClassIndex(83656);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return false;
    }

    public final d<T> getBaseView() {
        return this.q;
    }

    public final d<T> getMBaseView() {
        return this.q;
    }

    public final boolean getMIsAutoAdd() {
        return this.s;
    }

    public final void r() {
        View view = this.f88218g;
        l.b(view, "");
        this.r = (float) view.getMeasuredHeight();
    }

    public final float getNewLayoutHeight() {
        d<T> dVar = this.q;
        if (dVar == null) {
            return 0.0f;
        }
        return ((this.r - ((float) dVar.getHeight())) * this.f88213b) / 2.0f;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final void b() {
        int i2;
        View childAt;
        View childAt2;
        Rect rect = new Rect();
        View view = this.f88218g;
        FrameLayout frameLayout = null;
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        int i3 = 0;
        if (frameLayout2 == null || (childAt2 = frameLayout2.getChildAt(0)) == null) {
            i2 = 0;
        } else {
            i2 = childAt2.getMeasuredWidth();
        }
        View view2 = this.f88218g;
        if (view2 instanceof FrameLayout) {
            frameLayout = view2;
        }
        FrameLayout frameLayout3 = frameLayout;
        if (!(frameLayout3 == null || (childAt = frameLayout3.getChildAt(0)) == null)) {
            i3 = childAt.getMeasuredHeight();
        }
        View view3 = this.f88218g;
        l.b(view3, "");
        int x = (int) view3.getX();
        View view4 = this.f88218g;
        l.b(view4, "");
        int y = (int) view4.getY();
        rect.set(x, y, i2 + x, i3 + y);
        this.f88217f.a(rect);
        this.f88217f.a(this.f88213b, this.f88214c);
        this.f88217f.setStickerShowHelpboxCallback(new a(this));
    }

    public final void setMBaseView(d<T> dVar) {
        this.q = dVar;
    }

    public final void setMIsAutoAdd(boolean z) {
        this.s = z;
    }

    public e(Context context) {
        this(context, (byte) 0);
    }

    private e(Context context, byte b2) {
        this(context, (char) 0);
    }

    private e(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(5166);
        this.f88212a = getContext();
        LayoutInflater.from(this.f88212a).inflate(R.layout.aie, this);
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        MethodCollector.o(5166);
    }

    public final void a(d<T> dVar, boolean z) {
        MethodCollector.i(5092);
        this.s = z;
        if (dVar != null) {
            this.q = dVar;
            View view = this.f88218g;
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
                View view2 = this.f88218g;
                if (view2 != null) {
                    ((ViewGroup) view2).addView(dVar);
                    MethodCollector.o(5092);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(5092);
                throw nullPointerException;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(5092);
            throw nullPointerException2;
        }
        MethodCollector.o(5092);
    }

    static final class a implements StickerHelpBoxView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f127616a;

        static {
            Covode.recordClassIndex(83657);
        }

        a(e eVar) {
            this.f127616a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r3 != false) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
        @Override // com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r3, boolean r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r0 = r0.f88219h
                if (r0 == 0) goto L_0x0026
                if (r3 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                boolean r0 = r0.d()
                if (r0 == 0) goto L_0x0018
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r1 = r0.f88219h
                r0 = 1
                r1.a(r0)
            L_0x0018:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                boolean r0 = r0.d()
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                r0.c()
                return
            L_0x0026:
                if (r3 == 0) goto L_0x0031
                goto L_0x0018
            L_0x0029:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                com.ss.android.ugc.aweme.editSticker.interact.a.a r1 = r0.f88219h
                r0 = 0
                r1.a(r0)
            L_0x0031:
                if (r4 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                com.ss.android.ugc.aweme.editSticker.a.b r0 = r0.p
                r0.b()
                return
            L_0x003b:
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e r0 = r2.f127616a
                com.ss.android.ugc.aweme.editSticker.a.b r0 = r0.p
                r0.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e.a.a(boolean, boolean):void");
        }
    }

    public final void a(View view, d<T> dVar) {
        l.d(view, "");
        l.d(dVar, "");
        if (c.a(getContext())) {
            View view2 = this.f88218g;
            l.b(view2, "");
            view2.setX(-((((float) (view.getWidth() - dVar.getWidth())) / 2.0f) - n.b(getContext(), 12.0f)));
        } else {
            View view3 = this.f88218g;
            l.b(view3, "");
            view3.setX((((float) (view.getWidth() - dVar.getWidth())) / 2.0f) - n.b(getContext(), 12.0f));
        }
        View view4 = this.f88218g;
        l.b(view4, "");
        view4.setY((((float) (view.getHeight() - dVar.getHeight())) / 2.0f) - n.b(getContext(), 12.0f));
    }
}
