package com.ss.android.ugc.aweme.story.edit.business.shared.b.a;

import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.shortvideo.edit.i;
import com.ss.android.ugc.aweme.sticker.r;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class c extends i {

    /* renamed from: a  reason: collision with root package name */
    public r.a f137192a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f137193b = true;

    /* renamed from: c  reason: collision with root package name */
    public final j f137194c;

    /* renamed from: d  reason: collision with root package name */
    private final h f137195d = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(89715);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.i, com.bytedance.creativex.recorder.gesture.b
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final d f() {
        return (d) this.f137195d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.i
    public final void e() {
        r.a aVar = this.f137192a;
        if (aVar != null) {
            aVar.a();
        }
    }

    static final class a extends m implements h.f.a.a<d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(89716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            c cVar = this.this$0;
            return new d(cVar, cVar.f137194c.a());
        }
    }

    public c(j jVar) {
        l.d(jVar, "");
        this.f137194c = jVar;
    }
}
