package com.ss.android.ugc.aweme.shortvideo.publish.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.publish.b.a;
import com.ss.android.ugc.aweme.shortvideo.upload.l;
import com.ss.android.ugc.aweme.shortvideo.upload.s;
import com.ss.android.ugc.aweme.utils.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass4 f129780a;

    static {
        Covode.recordClassIndex(85189);
    }

    i(a.AnonymousClass4 r1) {
        this.f129780a = r1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l.a
    public final void a(s sVar) {
        a.AnonymousClass4 r3 = this.f129780a;
        if (sVar == s.CANCEL) {
            d.a("user_cancel_publish", new com.ss.android.ugc.aweme.app.f.d().a("publish_id", a.this.f128568d).a("video_type", 0).a("video_upload_type", 1).a("cancel_step", "call_uploader").f66730a);
            a.this.f129744j.b();
        }
    }
}
