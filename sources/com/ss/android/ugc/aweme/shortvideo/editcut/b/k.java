package com.ss.android.ugc.aweme.shortvideo.editcut.b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class k extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f128239h = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private final String f128240i = "SingleClipAdjustBottomScene";

    /* renamed from: j  reason: collision with root package name */
    private final h f128241j;

    static {
        Covode.recordClassIndex(84062);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final int E() {
        return R.layout.d6;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84063);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128240i;
    }

    static final class b extends m implements h.f.a.a<r> {
        final /* synthetic */ f $diContainer;
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(84064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, f fVar) {
            super(0);
            this.this$0 = kVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            return new r(this.$diContainer, this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final void P() {
        super.P();
        View c2 = c(R.id.ffa);
        l.b(c2, "");
        a((com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a) c2);
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final void a(Bundle bundle) {
        super.a(bundle);
        O().d();
        ((com.ss.android.ugc.aweme.shortvideo.editcut.b.a.a) this.f128241j.getValue()).b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar);
        l.d(fVar, "");
        l.d(bVar, "");
        this.f128241j = i.a((h.f.a.a) new b(this, fVar));
    }
}
