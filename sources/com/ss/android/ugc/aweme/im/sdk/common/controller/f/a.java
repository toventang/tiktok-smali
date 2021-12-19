package com.ss.android.ugc.aweme.im.sdk.common.controller.f;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.q;
import h.r;
import java.io.File;

public final class a implements com.ss.android.ugc.aweme.im.service.d.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2560a f102284a = new C2560a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final m<String, String, String> f102285b;

    /* renamed from: c  reason: collision with root package name */
    private final b<String, Boolean> f102286c;

    /* renamed from: d  reason: collision with root package name */
    private final String f102287d;

    /* renamed from: e  reason: collision with root package name */
    private final b<String, File> f102288e;

    static {
        Covode.recordClassIndex(65454);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$a  reason: collision with other inner class name */
    public static final class C2560a {
        static {
            Covode.recordClassIndex(65458);
        }

        private C2560a() {
        }

        public /* synthetic */ C2560a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.d.a
    public final boolean a() {
        return this.f102286c.invoke("tt_messaging_mt_emoji_zip").booleanValue();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$1 r3 = com.ss.android.ugc.aweme.im.sdk.common.controller.f.a.AnonymousClass1.f102289a
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$2 r2 = com.ss.android.ugc.aweme.im.sdk.common.controller.f.a.AnonymousClass2.f102290a
            com.ss.android.ugc.aweme.web.k r1 = com.ss.android.ugc.aweme.web.k.f145061a
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            java.lang.String r1 = r1.c()
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$3 r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.f.a.AnonymousClass3.f102291a
            r4.<init>(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.f.a.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.im.service.d.a
    public final Object a(String str) {
        l.d(str, "");
        if (!a()) {
            return q.m223constructorimpl(r.a((Throwable) new IllegalStateException("GeckoEmojiUtils: gecko small emoji not loaded yet")));
        }
        String invoke = this.f102285b.invoke(this.f102287d, "tt_messaging_mt_emoji_zip");
        if (invoke == null || invoke.length() == 0) {
            return q.m223constructorimpl(r.a((Throwable) new IllegalStateException("GeckoEmojiUtils: invalid parent channel path")));
        }
        File invoke2 = this.f102288e.invoke(invoke + File.separator + str);
        if (!invoke2.exists()) {
            return q.m223constructorimpl(r.a((Throwable) new IllegalStateException("GeckoEmojiUtils: emoji file does not exist")));
        }
        return q.m223constructorimpl(invoke2.getAbsolutePath());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.String, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, ? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(m<? super String, ? super String, String> mVar, b<? super String, Boolean> bVar, String str, b<? super String, ? extends File> bVar2) {
        l.d(mVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f102285b = mVar;
        this.f102286c = bVar;
        this.f102287d = str;
        this.f102288e = bVar2;
    }
}
