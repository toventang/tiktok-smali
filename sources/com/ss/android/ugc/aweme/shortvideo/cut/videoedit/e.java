package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b;

final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f126164a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f126165b;

    /* renamed from: c  reason: collision with root package name */
    private final String f126166c;

    /* renamed from: d  reason: collision with root package name */
    private final int f126167d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.core.g.e f126168e;

    /* renamed from: f  reason: collision with root package name */
    private final String f126169f;

    static {
        Covode.recordClassIndex(82831);
    }

    e(b.a aVar, b.a aVar2, String str, int i2, androidx.core.g.e eVar, String str2) {
        this.f126164a = aVar;
        this.f126165b = aVar2;
        this.f126166c = str;
        this.f126167d = i2;
        this.f126168e = eVar;
        this.f126169f = str2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.a
    public final void a(com.facebook.common.h.a aVar) {
        b.a aVar2 = this.f126164a;
        b.a aVar3 = this.f126165b;
        String str = this.f126166c;
        int i2 = this.f126167d;
        androidx.core.g.e eVar = this.f126168e;
        String str2 = this.f126169f;
        if (aVar3.f126158a != null && aVar3.f126158a.getTag().equals(str)) {
            aVar2.a((com.facebook.common.h.a<com.facebook.imagepipeline.j.b>) aVar, false);
        }
        if (i2 == eVar.f2398b.intValue()) {
            b.this.f126149e.a(str2);
        }
    }
}
