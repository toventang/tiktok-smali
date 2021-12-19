package com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f101076a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f101077b = i.a((h.f.a.a) C2511a.f101078a);

    public static Keva a() {
        return (Keva) f101077b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a$a  reason: collision with other inner class name */
    static final class C2511a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2511a f101078a = new C2511a();

        static {
            Covode.recordClassIndex(64666);
        }

        C2511a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("chat_top_notice_ack");
        }
    }

    static {
        Covode.recordClassIndex(64665);
    }
}
