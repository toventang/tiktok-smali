package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiApi;
import com.ss.android.ugc.aweme.emoji.sysemoji.h;
import com.ss.android.ugc.aweme.emoji.sysemoji.n;
import com.ss.android.ugc.aweme.im.service.j.d;
import f.a.ab;
import f.a.x;
import h.f.b.l;

public final class e implements d {
    static {
        Covode.recordClassIndex(65640);
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.d
    public final Runnable a() {
        return new a(this);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f102495a;

        static {
            Covode.recordClassIndex(65641);
        }

        a(e eVar) {
            this.f102495a = eVar;
        }

        public final void run() {
            n.a();
            if (n.c() || !n.b()) {
                h.a();
                com.ss.android.ugc.aweme.emoji.utils.d a2 = com.ss.android.ugc.aweme.emoji.utils.d.a();
                l.b(a2, "");
                a2.e();
                return;
            }
            ImSysEmojiApi imSysEmojiApi = com.ss.android.ugc.aweme.emoji.sysemoji.e.f89381a;
            com.ss.android.ugc.aweme.emoji.utils.d a3 = com.ss.android.ugc.aweme.emoji.utils.d.a();
            l.b(a3, "");
            ab.a((x) imSysEmojiApi.getResources(a3.e())).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(new h.e());
        }
    }
}
