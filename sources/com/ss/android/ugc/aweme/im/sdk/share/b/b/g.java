package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f103378a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static f f103379b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, f> f103380c = new LinkedHashMap();

    private g() {
    }

    static {
        Covode.recordClassIndex(66249);
    }

    public static final synchronized void a(ai aiVar) {
        Map<String, f> map;
        f fVar;
        Boolean remove;
        boolean z;
        f fVar2;
        Boolean remove2;
        boolean z2;
        synchronized (g.class) {
            MethodCollector.i(8035);
            if (f103379b == null || aiVar == null) {
                MethodCollector.o(8035);
            } else if (aiVar.getMsgStatus() == 2 || aiVar.getMsgStatus() == 3) {
                if (TextUtils.isEmpty(aiVar.getLocalExtValue("process_id")) || (fVar2 = f103380c.get(aiVar.getLocalExtValue("process_id"))) == null || !l.a((Object) fVar2.f103374a, (Object) "aweme") || aiVar.getMsgType() != 8) {
                    f fVar3 = f103379b;
                    if (fVar3 == null) {
                        l.b();
                    }
                    if (l.a((Object) fVar3.f103374a, (Object) "aweme") && aiVar.getMsgType() == 8) {
                        f fVar4 = f103379b;
                        if (fVar4 == null) {
                            l.b();
                        }
                        if (fVar4.f103375b.containsKey(aiVar.getConversationId()) && (remove = fVar4.f103375b.remove(aiVar.getConversationId())) != null) {
                            remove.booleanValue();
                            long c2 = b.a.c(aiVar.getConversationId());
                            SharePackage sharePackage = fVar4.f103376c;
                            String conversationId = aiVar.getConversationId();
                            l.b(conversationId, "");
                            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage, conversationId, c2);
                            if (aiVar.getMsgStatus() == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            SharePackage sharePackage2 = fVar4.f103376c;
                            String conversationId2 = aiVar.getConversationId();
                            l.b(conversationId2, "");
                            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage2, conversationId2, c2, z, aiVar.getLocalExt().get("s:err_code"));
                        }
                    }
                } else if (fVar2.f103375b.containsKey(aiVar.getConversationId()) && (remove2 = fVar2.f103375b.remove(aiVar.getConversationId())) != null) {
                    remove2.booleanValue();
                    long c3 = b.a.c(aiVar.getConversationId());
                    SharePackage sharePackage3 = fVar2.f103376c;
                    String conversationId3 = aiVar.getConversationId();
                    l.b(conversationId3, "");
                    com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage3, conversationId3, c3);
                    if (aiVar.getMsgStatus() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    SharePackage sharePackage4 = fVar2.f103376c;
                    String conversationId4 = aiVar.getConversationId();
                    l.b(conversationId4, "");
                    com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(sharePackage4, conversationId4, c3, z2, aiVar.getLocalExt().get("s:err_code"));
                }
                if (TextUtils.isEmpty(aiVar.getLocalExtValue("process_id")) || (fVar = (map = f103380c).get(aiVar.getLocalExtValue("process_id"))) == null || !fVar.f103375b.isEmpty()) {
                    f fVar5 = f103379b;
                    if (fVar5 == null) {
                        l.b();
                    }
                    if (fVar5.f103375b.isEmpty()) {
                        f103379b = null;
                    }
                    MethodCollector.o(8035);
                    return;
                }
                map.remove(aiVar.getLocalExtValue("process_id"));
                MethodCollector.o(8035);
            } else {
                MethodCollector.o(8035);
            }
        }
    }

    public static final synchronized void a(String str, SharePackage sharePackage, List<IMContact> list) {
        synchronized (g.class) {
            MethodCollector.i(7981);
            l.d(sharePackage, "");
            l.d(list, "");
            if (f103379b != null) {
                a.a("ShareStateHelper", "markShare lastShareState not null");
            }
            if (list.isEmpty()) {
                MethodCollector.o(7981);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list) {
                if (t instanceof IMUser) {
                    String uid = t.getUid();
                    l.b(uid, "");
                    linkedHashMap.put(b.a.a(Long.parseLong(uid)), false);
                } else if (t instanceof IMConversation) {
                    String conversationId = t.getConversationId();
                    l.b(conversationId, "");
                    linkedHashMap.put(conversationId, true);
                }
            }
            f103379b = new f(sharePackage.f124590d, linkedHashMap, sharePackage, list);
            if (!TextUtils.isEmpty(str)) {
                Map<String, f> map = f103380c;
                if (str == null) {
                    l.b();
                }
                map.put(str, f103379b);
            }
            MethodCollector.o(7981);
        }
    }
}
