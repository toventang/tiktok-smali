package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.im.service.k.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f101935a = new a((byte) 0);

    static {
        Covode.recordClassIndex(65225);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final String bF_() {
        return "show_previous_message";
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final int c() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final void d() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65226);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.b$b  reason: collision with other inner class name */
    public static final class C2541b implements com.ss.android.ugc.aweme.im.service.k.b {
        static {
            Covode.recordClassIndex(65227);
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            l.d(eVar, "");
            l.d(aVar, "");
        }

        C2541b() {
        }
    }

    public b() {
        this.f103869k = "show_previous_message";
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final com.ss.android.ugc.aweme.im.service.k.b b() {
        return new C2541b();
    }
}
