package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.story.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.x;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.j;
import com.ss.android.ugc.aweme.im.service.model.l;
import com.ss.android.ugc.aweme.im.service.model.m;
import com.ss.android.ugc.aweme.im.service.share.ImWebSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Handler f103359a = new Handler(Looper.getMainLooper(), c.f103364a);

    /* renamed from: b  reason: collision with root package name */
    private static e f103360b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.a$a  reason: collision with other inner class name */
    public interface AbstractC2624a {
        static {
            Covode.recordClassIndex(66243);
        }

        void a(String str);
    }

    public static void a(List<IMContact> list, String str, SharePackage sharePackage, String str2, boolean z, com.ss.android.ugc.aweme.im.sdk.share.b.a.a aVar) {
        String str3;
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sendShareMsgCanUndo".concat(String.valueOf(str2)));
        boolean z2 = true;
        if (sharePackage == null || TextUtils.equals(sharePackage.f124595i.getString("enter_method"), "publish_share") || !TextUtils.equals(sharePackage.f124590d, "aweme") || z) {
            com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sendShareMsgCanUndo go direct send");
            a(list, str, sharePackage, (BaseContent) null, str2, (String) null, aVar);
            return;
        }
        e eVar = new e(m.DEFAULT, UUID.randomUUID().toString(), sharePackage.f124595i.getString("aid"), list, str, sharePackage, str2, aVar);
        if (eVar.f103365a == m.DEFAULT) {
            e eVar2 = f103360b;
            if (!(eVar2 == null || eVar2.f103366b.equals(eVar.f103366b) || (f103360b.f103365a == m.SENT && f103360b.f103365a == m.UNDO))) {
                com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "realSendShareMsg because shareId not same" + eVar.f103366b);
                a(f103360b);
            }
            f103360b = eVar;
            boolean z3 = eVar.f103370f.f124595i.getBoolean("is_ad");
            com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "showShareSendingTips is direct".concat(String.valueOf(z3)));
            if (z3) {
                a(eVar);
                return;
            }
            eVar.a(m.SENDING);
            Message obtainMessage = f103359a.obtainMessage(100);
            obtainMessage.obj = eVar;
            f103359a.sendMessageDelayed(obtainMessage, 3000);
            com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "showShareSendingTips" + eVar.f103366b);
            String str4 = null;
            IMContact iMContact = com.bytedance.framwork.core.d.a.a(eVar.f103368d) ? null : eVar.f103368d.get(0);
            if (eVar.f103368d == null || eVar.f103368d.size() <= 0) {
                z2 = false;
            } else if (e.a((IMContact[]) eVar.f103368d.toArray(new IMContact[0])).size() <= 1) {
                z2 = false;
            }
            SharePackage sharePackage2 = eVar.f103370f;
            if (sharePackage2 != null) {
                str4 = sharePackage2.f124595i.getString("enter_from");
                str3 = sharePackage2.f124595i.getString("enter_method");
            } else {
                str3 = null;
            }
            c.a(new l(eVar.f103367c, eVar.f103366b, iMContact, z2, new b(eVar, sharePackage2, iMContact), str4, str3));
        }
    }

    public static void a(List<IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent, String str2, String str3, com.ss.android.ugc.aweme.im.sdk.share.b.a.a aVar) {
        BaseContent baseContent2 = baseContent;
        if (aVar != null) {
            aVar.a();
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "shareContent=".concat(String.valueOf(baseContent2)));
        c(sharePackage);
        if (baseContent2 instanceof TextContent) {
            baseContent2 = TextContent.obtain((TextContent) baseContent2);
        } else if (baseContent2 == null) {
            baseContent2 = a(sharePackage);
        }
        if (!TextUtils.isEmpty(str2) && baseContent2 != null) {
            String sb = new StringBuilder().append(baseContent2.hashCode()).toString();
            x.a(sb, "process_id", str2);
            x.a(sb, "enter_from", sharePackage.f124595i.getString("enter_from"));
            x.a(sb, "message_type", sharePackage.f124595i.getString("message_type"));
            x.a(sb, "enter_method", sharePackage.f124595i.getString("enter_method"));
            x.a(sb, "is_share_pop_up", sharePackage.f124595i.getString("is_share_pop_up"));
        }
        if (list != null && !list.isEmpty() && baseContent2 != null) {
            List<String> a2 = e.a((IMContact[]) list.toArray(new IMContact[0]));
            a(a2, str, baseContent2, sharePackage, list, a2.size() > 1, str3);
            if (TextUtils.equals(sharePackage.f124590d, "aweme")) {
                ai.b("im_channel");
            }
        }
    }

    private static void a(List<String> list, String str, BaseContent baseContent, SharePackage sharePackage, List<IMContact> list2, boolean z, String str2) {
        a(list, sharePackage, str, baseContent);
        a(sharePackage, list2, z, str2);
        e eVar = f103360b;
        if (eVar != null && eVar.f103366b.equals(str2)) {
            f103360b = null;
        }
        if (sharePackage.f124590d.equals(UGCMonitor.EVENT_COMMENT)) {
            a(sharePackage, str, list);
        }
    }

    private static void a(List<String> list, SharePackage sharePackage, String str, BaseContent baseContent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            TextContent obtain = TextContent.obtain(str);
            arrayList.add(obtain);
            if (baseContent != null) {
                String a2 = x.a(new StringBuilder().append(baseContent.hashCode()).toString(), "process_id");
                if (!TextUtils.isEmpty(a2)) {
                    String sb = new StringBuilder().append(obtain.hashCode()).toString();
                    x.a(sb, "process_id", a2);
                    x.a(sb, "is_share_pop_up", sharePackage.f124595i.getString("is_share_pop_up"));
                }
            }
        }
        for (String str2 : list) {
            b.a(str2, "");
            g.a.a().b(str2).a(arrayList).a();
        }
    }

    static {
        Covode.recordClassIndex(66242);
    }

    private static ShareAwemeContent b(SharePackage sharePackage) {
        if (sharePackage.f124595i.getInt("aweme_type") != 40) {
            return ShareAwemeContent.fromSharePackage(sharePackage);
        }
        return ShareStoryContent.fromSharePackage(sharePackage);
    }

    private static List<IMContact> a(List<IMContact> list) {
        if (com.bytedance.framwork.core.d.a.a(list)) {
            return null;
        }
        if (list.size() == 1) {
            return list.subList(0, 1);
        }
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMConversation) {
                return Collections.singletonList(iMContact);
            }
        }
        return list.subList(0, 2);
    }

    private static void c(SharePackage sharePackage) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.itemType=" + sharePackage.f124590d);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.identifier=" + sharePackage.f124591e);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.title=" + sharePackage.f124592f);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.description=" + sharePackage.f124593g);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.url=" + sharePackage.f124594h);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareHelper", "sharePackage.extras=" + sharePackage.f124595i);
    }

    public static BaseContent a(SharePackage sharePackage) {
        BaseContent a2 = d.a(sharePackage);
        if (a2 != null) {
            return a2;
        }
        String str = sharePackage.f124590d;
        if (TextUtils.equals("aweme", str)) {
            return b(sharePackage);
        }
        if (TextUtils.equals("music", str)) {
            return ShareMusicContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("challenge", str)) {
            return ShareChallengeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("qna", str) && d.a()) {
            return ShareQnAContent.Companion.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live_event", str)) {
            return ShareLiveEventContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("search", str)) {
            return ShareSearchContent.Companion.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("user", str)) {
            return ShareUserContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live", str)) {
            return ShareLiveContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("mix", str)) {
            return ShareCompilationContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("sticker", str)) {
            return ShareStickerContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("group", str)) {
            return GroupInviteCardContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, str)) {
            return CommentContent.fromSharePackage(sharePackage);
        }
        return null;
    }

    public static void a(e eVar) {
        if (eVar.f103365a != m.SENT && eVar.f103365a != m.UNDO) {
            eVar.a(m.SENT);
            f103359a.removeMessages(100);
            a(eVar.f103368d, eVar.f103369e, eVar.f103370f, eVar.f103371g, eVar.f103372h, eVar.f103366b, eVar.f103373i);
        }
    }

    private static void a(SharePackage sharePackage, String str, List<String> list) {
        String str2;
        HashMap hashMap = new HashMap();
        Bundle bundle = sharePackage.f124595i;
        hashMap.put("author_id", bundle.getString("comment_author_id"));
        hashMap.put("enter_from", "comment_panel");
        hashMap.put("enter_method", "icon");
        hashMap.put("group_id", bundle.getString("aweme_id"));
        hashMap.put("comment_id", bundle.getString("comment_id"));
        hashMap.put("comment_author_id", bundle.getString("comment_author_id"));
        String str3 = "1";
        if (!str.isEmpty()) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("is_with_text", str2);
        if (list.size() <= 1) {
            str3 = "0";
        }
        hashMap.put("is_multi", str3);
        hashMap.put("conversation_id", list.toString());
        r.a("share_comment", hashMap);
    }

    public static void a(List<IMContact> list, String str, SharePackage sharePackage, String str2) {
        a(list, str, sharePackage, (BaseContent) null, str2, (String) null, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) null);
    }

    private static void b(SharePackage sharePackage, List<IMContact> list, boolean z, String str) {
        IMContact iMContact;
        if (!TextUtils.equals(sharePackage.f124595i.getString("enter_method"), "publish_share")) {
            String string = sharePackage.f124595i.getString("aid");
            if (com.bytedance.framwork.core.d.a.a(list)) {
                iMContact = null;
            } else {
                iMContact = list.get(0);
            }
            j jVar = new j(a(list), iMContact, list.size(), z, sharePackage.f124590d, sharePackage.f124595i.getString("enter_from"), sharePackage.f124595i.getString("enter_method"), string, str, sharePackage.f124595i.getBoolean("is_new_group", false));
            jVar.f103923k = sharePackage.f124595i.getBoolean("show_tips_until_cancel", false);
            c.a(jVar);
        }
    }

    private static void a(SharePackage sharePackage, List<IMContact> list, boolean z, String str) {
        if (TextUtils.equals(sharePackage.f124590d, "game")) {
            n.a(com.bytedance.ies.ugc.appcontext.d.a(), (int) R.string.ci6);
        } else if (!TextUtils.equals(sharePackage.f124590d, "web") || !(sharePackage instanceof ImWebSharePackage) || ((ImWebSharePackage) sharePackage).f103937b) {
            b(sharePackage, list, z, str);
        }
    }

    public static void a(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, AbstractC2624a aVar, AbstractC2624a aVar2) {
        a.C2579a a2 = new a.C2579a(context).a(iMContactArr);
        a2.f102590d = sharePackage;
        a2.f102591e = aVar2;
        a2.f102592f = aVar;
        a2.a().b().a(str).c().show();
    }
}
