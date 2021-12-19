package com.ss.android.ugc.aweme.im.sdk.notification.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.sdk.notification.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final Queue<i> f102836a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    static final List<ai> f102837b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    public static final c f102838c = new c();

    private c() {
    }

    public static void a() {
        f102837b.clear();
    }

    public static void b() {
        f102836a.clear();
    }

    static {
        Covode.recordClassIndex(65932);
    }

    public static boolean c() {
        if (!f102836a.isEmpty() || !f102837b.isEmpty()) {
            return false;
        }
        return true;
    }

    public static k d() {
        i poll;
        h a2;
        String name;
        h a3;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a a4;
        String displayName;
        String refmsg_uid;
        String string;
        IMContact a5;
        List<ai> list = f102837b;
        String str = "";
        l.b(list, str);
        String str2 = null;
        UrlModel urlModel = null;
        if (!(!list.isEmpty())) {
            Queue<i> queue = f102836a;
            if ((!queue.isEmpty()) && !queue.isEmpty() && (poll = queue.poll()) != null) {
                int i2 = d.f102840a[poll.f102862a.ordinal()];
                if (i2 == 1) {
                    b bVar = poll.f102866e;
                    if (!(bVar == null || (a2 = a.C0745a.a().a(bVar.f102886a)) == null)) {
                        Integer valueOf = Integer.valueOf(a2.getConversationType());
                        String str3 = bVar.f102886a;
                        e.a.a();
                        UrlModel b2 = e.b(a2);
                        i coreInfo = a2.getCoreInfo();
                        if (!(coreInfo == null || (name = coreInfo.getName()) == null)) {
                            str = name;
                        }
                        return new k(0, valueOf, str3, null, b2, null, null, str, bVar.f102887b, false, null, null, null, 2063080);
                    }
                } else if (i2 == 2) {
                    return com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(poll);
                } else {
                    if (i2 == 3) {
                        ai aiVar = poll.f102863b;
                        if (aiVar != null) {
                            int conversationType = aiVar.getConversationType();
                            if (conversationType == e.a.f37581a) {
                                IMUser b3 = g.b(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
                                if (b3 != null) {
                                    return new k(0, Integer.valueOf(e.a.f37581a), aiVar.getConversationId(), Integer.valueOf(aiVar.getMsgType()), b3.getAvatarThumb(), null, null, b3.getDisplayName(), com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(b.f.b(aiVar), aiVar, true), false, null, 1, String.valueOf(aiVar.getSender()), 490208);
                                }
                            } else if (conversationType == e.a.f37582b && !com.ss.android.ugc.aweme.im.service.c.c.a() && (a3 = a.C0745a.a().a(aiVar.getConversationId())) != null) {
                                StringBuilder sb = new StringBuilder();
                                int msgType = aiVar.getMsgType();
                                if (!(msgType == 1 || msgType == 1030 || msgType == 1031 || (a4 = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.a(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b.AT_MOST_DB, new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c(aiVar.getConversationId(), String.valueOf(aiVar.getSender()), aiVar.getSecSender()), (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.g) null)) == null || (displayName = a4.getDisplayName()) == null)) {
                                    if (aiVar.getReferenceInfo() != null) {
                                        ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
                                        l.b(referenceInfo, str);
                                        ReferenceInfoHint a6 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
                                        if (!(a6 == null || (refmsg_uid = a6.getRefmsg_uid()) == null)) {
                                            User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
                                            if (l.a((Object) refmsg_uid, (Object) (d2 != null ? d2.getUid() : null))) {
                                                sb.append(d.a().getResources().getString(R.string.b_3, displayName, str));
                                            }
                                        }
                                    }
                                    sb.append(displayName).append(": ");
                                }
                                sb.append(com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(b.f.b(aiVar), aiVar, true));
                                Integer valueOf2 = Integer.valueOf(aiVar.getMsgType());
                                Integer valueOf3 = Integer.valueOf(e.a.f37582b);
                                String conversationId = aiVar.getConversationId();
                                e.a.a();
                                UrlModel b4 = com.ss.android.ugc.aweme.im.sdk.group.a.e.b(a3);
                                i coreInfo2 = a3.getCoreInfo();
                                if (coreInfo2 != null) {
                                    str2 = coreInfo2.getName();
                                }
                                return new k(0, valueOf3, conversationId, valueOf2, b4, null, null, str2, sb.toString(), false, null, 1, String.valueOf(aiVar.getSender()), 490208);
                            }
                        }
                        return null;
                    }
                    throw new n();
                }
            }
        } else if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            list.clear();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h.a.n.a();
                }
                ai aiVar2 = (ai) obj;
                l.b(aiVar2, str);
                if (aiVar2.getConversationType() == e.a.f37581a) {
                    IMUser b5 = g.b(String.valueOf(aiVar2.getSender()), aiVar2.getSecSender());
                    if (b5 != null && !linkedHashSet.contains(b5)) {
                        linkedHashSet.add(b5);
                    }
                } else if (aiVar2.getConversationType() == e.a.f37582b) {
                    com.bytedance.ies.im.core.api.b.a a7 = a.C0745a.a();
                    Object obj2 = arrayList.get(i3);
                    l.b(obj2, str);
                    h a8 = a7.a(((ai) obj2).getConversationId());
                    if (!(a8 == null || (a5 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.a(a8)) == null || linkedHashSet.contains(a5))) {
                        linkedHashSet.add(a5);
                    }
                }
                sb3.append(aiVar2.getSender());
                if (i3 != h.a.n.a((List) arrayList)) {
                    sb3.append(",");
                }
                i3 = i4;
            }
            if (!linkedHashSet.isEmpty()) {
                int i5 = 0;
                for (Object obj3 : linkedHashSet) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        h.a.n.a();
                    }
                    sb2.append(((IMContact) obj3).getDisplayName());
                    if (i5 != linkedHashSet.size() - 1) {
                        sb2.append(", ");
                    }
                    i5 = i6;
                }
                ai aiVar3 = (ai) h.a.n.i((List) arrayList);
                int size = arrayList.size();
                String sb4 = sb2.toString();
                if (linkedHashSet.size() == 1 && size == 1) {
                    l.b(aiVar3, str);
                    string = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(b.f.b(aiVar3), aiVar3, true);
                } else {
                    string = d.a().getResources().getString(R.string.ck4, Integer.valueOf(size));
                    l.b(string, str);
                }
                UrlModel displayAvatar = linkedHashSet.size() == 1 ? ((IMContact) h.a.n.b(linkedHashSet, 0)).getDisplayAvatar() : null;
                UrlModel displayAvatar2 = linkedHashSet.size() > 1 ? ((IMContact) h.a.n.b(linkedHashSet, 0)).getDisplayAvatar() : null;
                if (linkedHashSet.size() > 1) {
                    urlModel = ((IMContact) h.a.n.b(linkedHashSet, 1)).getDisplayAvatar();
                }
                l.b(aiVar3, str);
                Integer valueOf4 = Integer.valueOf(aiVar3.getConversationType());
                Integer valueOf5 = Integer.valueOf(size);
                String sb5 = sb3.toString();
                l.b(sb5, str);
                return new k(1, valueOf4, null, null, displayAvatar, displayAvatar2, urlModel, sb4, string, true, linkedHashSet, valueOf5, sb5, 227884);
            }
        }
        return null;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class a extends Enum<a> {
        public static final a ASSEMBLE;
        public static final a NORMAL;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ a[] f102839a;

        static {
            Covode.recordClassIndex(65933);
            b bVar = new b("NORMAL");
            NORMAL = bVar;
            C2597a aVar = new C2597a("ASSEMBLE");
            ASSEMBLE = aVar;
            f102839a = new a[]{bVar, aVar};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f102839a.clone();
        }

        public abstract void enqueue(List<ai> list);

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.c$a$a  reason: collision with other inner class name */
        static final class C2597a extends a {
            static {
                Covode.recordClassIndex(65934);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2597a(String str) {
                super(str, 1, null);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.notification.a.c.a
            public final void enqueue(List<ai> list) {
                l.d(list, "");
                c.f102837b.addAll(list);
            }
        }

        static final class b extends a {
            static {
                Covode.recordClassIndex(65935);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(String str) {
                super(str, 0, null);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.notification.a.c.a
            public final void enqueue(List<ai> list) {
                l.d(list, "");
                for (T t : list) {
                    Queue<i> queue = c.f102836a;
                    l.d(t, "");
                    queue.offer(new i(j.Message, t, null, null, null, 28));
                }
            }
        }

        private a(String str, int i2) {
        }

        public /* synthetic */ a(String str, int i2, h.f.b.g gVar) {
            this(str, i2);
        }
    }

    public static void a(i iVar) {
        l.d(iVar, "");
        f102836a.offer(iVar);
    }

    public static final boolean a(ai aiVar) {
        l.d(aiVar, "");
        h a2 = a.C0745a.a().a(aiVar.getConversationId());
        if (a2 == null || !a2.isMute()) {
            return true;
        }
        return false;
    }

    public static void a(a aVar, List<ai> list) {
        l.d(aVar, "");
        l.d(list, "");
        aVar.enqueue(list);
    }
}
