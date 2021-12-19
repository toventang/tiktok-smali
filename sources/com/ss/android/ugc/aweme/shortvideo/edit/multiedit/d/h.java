package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a f127965a;

    /* renamed from: b  reason: collision with root package name */
    public d f127966b;

    /* renamed from: c  reason: collision with root package name */
    final a f127967c = new a();

    static {
        Covode.recordClassIndex(83869);
    }

    private final void a() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127965a;
        if (aVar == null) {
            l.a("viewManager");
        }
        aVar.i();
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f127968a;

        static {
            Covode.recordClassIndex(83870);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(h hVar) {
            this.f127968a = hVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            super.onAnimationEnd(animator);
            h.a(this.f127968a).g();
            h.b(this.f127968a);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a a(h hVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = hVar.f127965a;
        if (aVar == null) {
            l.a("viewManager");
        }
        return aVar;
    }

    public static final /* synthetic */ d b(h hVar) {
        d dVar = hVar.f127966b;
        if (dVar == null) {
            l.a("statusChangeListener");
        }
        return dVar;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f127969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f127970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f127971c;

        static {
            Covode.recordClassIndex(83871);
        }

        public final void onAnimationEnd(Animator animator) {
            if (animator != null) {
                super.onAnimationEnd(animator);
            }
            h.b(this.f127969a).a(this.f127970b, this.f127971c);
            h.a(this.f127969a).h();
            h.b(this.f127969a).b();
        }

        b(h hVar, boolean z, boolean z2) {
            this.f127969a = hVar;
            this.f127970b = z;
            this.f127971c = z2;
        }
    }

    public final void a(VideoSegment videoSegment) {
        b(videoSegment);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127965a;
        if (aVar == null) {
            l.a("viewManager");
        }
        aVar.g();
        if (this.f127966b == null) {
            l.a("statusChangeListener");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127965a;
            if (aVar == null) {
                l.a("viewManager");
            }
            aVar.j();
        }
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f127966b = dVar;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar) {
        l.d(aVar, "");
        this.f127965a = aVar;
    }

    public final void a(e eVar, int i2, boolean z, boolean z2) {
        a();
        b(eVar, i2, z, z2);
    }

    private final void b(e eVar, int i2, boolean z, boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127965a;
        if (aVar == null) {
            l.a("viewManager");
        }
        aVar.a(eVar, i2, new b(this, z, z2));
    }
}
