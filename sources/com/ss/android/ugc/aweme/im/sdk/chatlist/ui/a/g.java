package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.g;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends b {

    /* renamed from: f  reason: collision with root package name */
    private final int f102095f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final int f102096g = R.string.chg;

    /* renamed from: h  reason: collision with root package name */
    private final int f102097h = R.raw.icon_flag;

    static {
        Covode.recordClassIndex(65330);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int a() {
        return this.f102096g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int b() {
        return this.f102097h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int c() {
        return this.f102095f;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final boolean e() {
        int a2 = e.a();
        if (2 <= a2 && 5 >= a2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final void d() {
        boolean z;
        int i2;
        String str;
        String str2;
        h hVar = this.f102071a;
        if (hVar != null) {
            Context context = this.f102073c;
            while (true) {
                String str3 = null;
                if (context == null) {
                    return;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        l.d(hVar, "");
                        String valueOf = String.valueOf(hVar.getConversationShortId());
                        if (hVar.getConversationType() == e.a.f37582b) {
                            z = true;
                            i2 = 3;
                        } else {
                            z = false;
                            if (hVar.isStranger()) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                        }
                        if (z) {
                            valueOf = String.valueOf(com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a());
                        }
                        String conversationId = hVar.getConversationId();
                        l.b(conversationId, "");
                        i coreInfo = hVar.getCoreInfo();
                        if (coreInfo != null) {
                            str3 = coreInfo.getName();
                        }
                        if (z) {
                            str = "im_group_chat";
                        } else {
                            str = "im";
                        }
                        com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(new g.a(valueOf, "", conversationId, (String) null, (Boolean) null, str, i2, str3, 24), activity, "2");
                        int c2 = this.f102075e.c();
                        a.d dVar = a.d.f101073a;
                        l.d(dVar, "");
                        androidx.c.a aVar = new androidx.c.a();
                        aVar.put("enter_from", "chat_list");
                        if (c2 == 20) {
                            str2 = "group";
                        } else {
                            str2 = "private";
                        }
                        aVar.put("chat_type", str2);
                        aVar.put("enter_method", "button");
                        dVar.invoke("click_report", aVar);
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        super(context, bVar, aVar, (byte) 0);
        l.d(context, "");
        l.d(bVar, "");
        l.d(aVar, "");
    }
}
