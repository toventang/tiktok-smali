package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.emoji.a;
import com.bytedance.android.livesdkapi.host.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.sysemoji.g;
import com.ss.android.ugc.aweme.emoji.sysemoji.h;
import com.ss.android.ugc.aweme.emoji.sysemoji.i;
import java.util.ArrayList;
import java.util.List;

public final class t implements c {
    static {
        Covode.recordClassIndex(69529);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.c
    public final boolean b() {
        g.a.a();
        return h.b(4);
    }

    @Override // com.bytedance.android.livesdkapi.host.c
    public final List<a> a() {
        g.a.a();
        List<i> a2 = g.a(4);
        ArrayList arrayList = new ArrayList();
        for (i iVar : a2) {
            a aVar = new a();
            aVar.f7397a = iVar.getPreviewEmoji();
            List<String> emojiList = iVar.getEmojiList();
            if (emojiList == null) {
                emojiList = new ArrayList<>();
            }
            aVar.f7398b.addAll(emojiList);
            aVar.f7400d = iVar.getMiniSupportSysVersion();
            aVar.f7399c = iVar.getBusinessType();
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
