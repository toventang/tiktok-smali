package com.ss.android.ugc.aweme.sticker.view.internal.pager.b;

import android.animation.ValueAnimator;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.tools.view.style.j;
import h.f.b.l;
import java.util.Objects;

public final class c implements u<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    TabLayout f136415a;

    /* renamed from: b  reason: collision with root package name */
    final m f136416b;

    /* renamed from: c  reason: collision with root package name */
    final o f136417c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.favorite.b f136418d;

    /* renamed from: e  reason: collision with root package name */
    private final StickerPreferences f136419e;

    static {
        Covode.recordClassIndex(89084);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f136420a;

        static {
            Covode.recordClassIndex(89085);
        }

        a(j jVar) {
            this.f136420a = jVar;
        }

        public final void run() {
            j jVar = this.f136420a;
            jVar.b(jVar.getSelectColor());
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabLayout.f f136421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f136422b;

        static {
            Covode.recordClassIndex(89086);
        }

        b(TabLayout.f fVar, j jVar) {
            this.f136421a = fVar;
            this.f136422b = jVar;
        }

        public final void run() {
            if (!this.f136421a.b()) {
                this.f136421a.f130753h.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f136423a;

                    static {
                        Covode.recordClassIndex(89087);
                    }

                    {
                        this.f136423a = r1;
                    }

                    public final void run() {
                        this.f136423a.f136422b.b(this.f136423a.f136422b.getUnSelectColor());
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c$c  reason: collision with other inner class name */
    static final class C3560c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabLayout.f f136424a;

        static {
            Covode.recordClassIndex(89088);
        }

        C3560c(TabLayout.f fVar) {
            this.f136424a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.i iVar = this.f136424a.f130753h;
            l.b(iVar, "");
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            iVar.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabLayout.f f136425a;

        static {
            Covode.recordClassIndex(89089);
        }

        d(TabLayout.f fVar) {
            this.f136425a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.i iVar = this.f136425a.f130753h;
            l.b(iVar, "");
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            iVar.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    @Override // androidx.lifecycle.u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Boolean r11) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c.onChanged(java.lang.Object):void");
    }

    public c(m mVar, com.ss.android.ugc.aweme.sticker.favorite.b bVar, o oVar, StickerPreferences stickerPreferences) {
        l.d(mVar, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(stickerPreferences, "");
        this.f136416b = mVar;
        this.f136418d = bVar;
        this.f136417c = oVar;
        this.f136419e = stickerPreferences;
    }
}
