package com.ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.eu;
import java.util.Map;

final /* synthetic */ class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f71950a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f71951b;

    /* renamed from: c  reason: collision with root package name */
    private final IMContact f71952c;

    /* renamed from: d  reason: collision with root package name */
    private final IIMService f71953d;

    static {
        Covode.recordClassIndex(44232);
    }

    i(b bVar, Aweme aweme, IMContact iMContact, IIMService iIMService) {
        this.f71950a = bVar;
        this.f71951b = aweme;
        this.f71952c = iMContact;
        this.f71953d = iIMService;
    }

    @Override // com.ss.android.ugc.aweme.base.c
    public final void a(Object obj) {
        b bVar = this.f71950a;
        Aweme aweme = this.f71951b;
        IMContact iMContact = this.f71952c;
        IIMService iIMService = this.f71953d;
        String d2 = b.d("share_prop" + System.currentTimeMillis());
        d a2 = new d().a("enter_from", bVar.f71475i).a("platform", "chat").a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid());
        String str = "";
        if (!(iMContact instanceof IMUser)) {
            if (iMContact instanceof IMConversation) {
                int conversationType = ((IMConversation) iMContact).getConversationType();
                if (conversationType != 1) {
                    if (conversationType == 2) {
                        str = "group";
                    }
                }
            }
            d a3 = a2.a("chat_type", str).a("chat_cnt", 1).a("is_with_text", 0).a("enter_method", "comment_at").a("bind_id", d2);
            eu.a(a3, aweme.getAuthor());
            Map<String, String> map = a3.f66730a;
            r.a("share_video_to_chat", map);
            r.a("share_video_success", map);
            d a4 = new d().a("conversation_id", iIMService.getIMContactConversationId(iMContact)).a("to_user_id", iIMService.getIMContactUserId(iMContact)).a("bind_id", d2);
            eu.a(a4, aweme.getAuthor());
            Map<String, String> map2 = a4.f66730a;
            r.a("share_video_to_chat_info", map2);
            r.a("share_video_success_info", map2);
        }
        str = "private";
        d a32 = a2.a("chat_type", str).a("chat_cnt", 1).a("is_with_text", 0).a("enter_method", "comment_at").a("bind_id", d2);
        eu.a(a32, aweme.getAuthor());
        Map<String, String> map3 = a32.f66730a;
        r.a("share_video_to_chat", map3);
        r.a("share_video_success", map3);
        d a42 = new d().a("conversation_id", iIMService.getIMContactConversationId(iMContact)).a("to_user_id", iIMService.getIMContactUserId(iMContact)).a("bind_id", d2);
        eu.a(a42, aweme.getAuthor());
        Map<String, String> map22 = a42.f66730a;
        r.a("share_video_to_chat_info", map22);
        r.a("share_video_success_info", map22);
    }
}
