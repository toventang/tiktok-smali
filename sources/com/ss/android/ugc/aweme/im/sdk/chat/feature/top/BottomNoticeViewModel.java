package com.ss.android.ugc.aweme.im.sdk.chat.feature.top;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.data.a;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import h.f.b.l;

public final class BottomNoticeViewModel extends SessionListTopNoticeViewModel {

    /* renamed from: a  reason: collision with root package name */
    public a f101058a;

    /* renamed from: b  reason: collision with root package name */
    public String f101059b = "notice_code";

    /* renamed from: c  reason: collision with root package name */
    final Context f101060c;

    static {
        Covode.recordClassIndex(64649);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNoticeViewModel(Context context) {
        super(null, null, null, null, null, null, 63);
        l.d(context, "");
        this.f101060c = context;
    }

    public final void a(int i2) {
        String str;
        String str2 = this.f101059b;
        TopChatNoticeSourceType topChatNoticeSourceType = TopChatNoticeSourceType.DM_CHAT;
        a aVar = this.f101058a;
        if (aVar != null) {
            str = aVar.getConversationId();
        } else {
            str = null;
        }
        a(str2, topChatNoticeSourceType, i2, str);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        a(i2);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a.a(Integer.valueOf(i2), a.e.f101074a);
        if (i2 == 3) {
            a.b bVar = a.b.f101071a;
            l.d(bVar, "");
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("enter_from", "chat");
            aVar.put("enter_method", "pop_up");
            bVar.invoke("click_report", aVar);
        }
    }
}
