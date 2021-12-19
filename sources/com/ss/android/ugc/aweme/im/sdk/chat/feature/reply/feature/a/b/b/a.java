package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.g;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a;
import com.ss.android.ugc.aweme.im.service.model.h;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final /* synthetic */ class a implements a.AbstractC2506a {

    /* renamed from: a  reason: collision with root package name */
    private final h f100976a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f100977b;

    static {
        Covode.recordClassIndex(64588);
    }

    public a(h hVar, Context context) {
        this.f100976a = hVar;
        this.f100977b = context;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.b.a.a.AbstractC2506a
    public final void a(String str) {
        h hVar = this.f100976a;
        Context context = this.f100977b;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(CommentContent.obtain(hVar));
        arrayList.add(TextContent.obtain(str));
        g.a.a().a(hVar.f103903h.getUid()).a(arrayList).a();
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.ci6).a();
    }
}
