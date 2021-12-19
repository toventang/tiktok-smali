package com.ss.android.ugc.aweme.im.sdk.chat.ui.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.b.b.d;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.b;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.d;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.a;
import com.ss.android.ugc.d.a.c;
import f.a.d.g;
import f.a.e.e.c.f;
import f.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class e implements d {
    static {
        Covode.recordClassIndex(64742);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d
    public final void a(String str) {
        l.d(str, "");
        c.a(new a(str));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d
    public final void a(List<ai> list) {
        l.d(list, "");
        if (b.a().a(true, "im_preload_strategy", 0) == 2) {
            com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "preloadFromChatPie QueryMessageFromPie");
            d.b(list);
        }
        if (list != null && com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100168a != null) {
            bz unused = i.a(com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100171d, bf.f159041b, null, new b.g(list, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d
    public final n<List<ai>> b(List<ai> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            n<List<ai>> a2 = f.a.h.a.a((n) f.f157355a);
            l.b(a2, "");
            return a2;
        }
        n<List<ai>> a3 = n.a((Callable) new d.b(list)).c(d.c.f100194a).a((g) d.C2464d.f100196a);
        l.b(a3, "");
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d
    public final void a(h hVar) {
        String str;
        Map<String, String> localExt;
        StringBuilder sb = new StringBuilder("markAuthorSupporterChatLocal: ");
        String str2 = null;
        if (hVar != null) {
            str = hVar.getConversationId();
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append(", ");
        if (!(hVar == null || (localExt = hVar.getLocalExt()) == null)) {
            str2 = localExt.get("a:s_author_im_supporter");
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("AuthorSupporterHelper", append.append(str2).toString());
        if (hVar != null && l.a((Object) com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.f100158a, (Object) hVar.getConversationId()) && (!l.a((Object) "1", (Object) hVar.getLocalExt().get("a:s_author_im_supporter")))) {
            Map<String, String> localExt2 = hVar.getLocalExt();
            l.b(localExt2, "");
            localExt2.put("a:s_author_im_supporter", "1");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.d
    public final void a(SystemContent systemContent, String str) {
        l.d(systemContent, "");
        l.d(str, "");
        c.a(new com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.b(systemContent, str));
    }
}
