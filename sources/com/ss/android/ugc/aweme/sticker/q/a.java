package com.ss.android.ugc.aweme.sticker.q;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.camera.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class a implements com.ss.android.ugc.aweme.sticker.types.ar.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.effect.a f135429a;

    /* renamed from: b  reason: collision with root package name */
    public final d f135430b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Object, Object> f135431c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final h f135432d = i.a((h.f.a.a) new C3524a(this));

    static {
        Covode.recordClassIndex(88477);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.a
    public final com.ss.android.ugc.aweme.sticker.senor.a a() {
        return (com.ss.android.ugc.aweme.sticker.senor.a) this.f135432d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.a
    public final int b() {
        return this.f135429a.a((Bitmap) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.q.a$a  reason: collision with other inner class name */
    static final class C3524a extends m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.q.a.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3524a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.q.a.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.q.a.a(this.this$0.f135429a, this.this$0.f135430b);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.a
    public final void a(boolean z) {
        this.f135429a.d(z);
    }

    public a(com.ss.android.ugc.asve.recorder.effect.a aVar, d dVar) {
        l.d(aVar, "");
        l.d(dVar, "");
        this.f135429a = aVar;
        this.f135430b = dVar;
    }
}
