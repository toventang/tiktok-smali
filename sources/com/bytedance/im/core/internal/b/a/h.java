package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ax;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.l;
import com.bytedance.im.core.internal.a.g;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class h {
    @c(a = "conversation_id")

    /* renamed from: a  reason: collision with root package name */
    public String f38433a;
    @c(a = "command_type")

    /* renamed from: b  reason: collision with root package name */
    private int f38434b;
    @c(a = "inbox_type")

    /* renamed from: c  reason: collision with root package name */
    private int f38435c;
    @c(a = "conversation_type")

    /* renamed from: d  reason: collision with root package name */
    private int f38436d;
    @c(a = "message_id")

    /* renamed from: e  reason: collision with root package name */
    private long f38437e;
    @c(a = "read_index")

    /* renamed from: f  reason: collision with root package name */
    private long f38438f;
    @c(a = "read_index_v2")

    /* renamed from: g  reason: collision with root package name */
    private long f38439g;
    @c(a = "read_badge_count")

    /* renamed from: h  reason: collision with root package name */
    private int f38440h;
    @c(a = "unread_count")

    /* renamed from: i  reason: collision with root package name */
    private int f38441i;
    @c(a = "last_message_index")

    /* renamed from: j  reason: collision with root package name */
    private long f38442j;
    @c(a = "last_message_index_v2")

    /* renamed from: k  reason: collision with root package name */
    private long f38443k;
    @c(a = "conversation_version")

    /* renamed from: l  reason: collision with root package name */
    private long f38444l;
    @c(a = "group_version")

    /* renamed from: m  reason: collision with root package name */
    private long f38445m;
    @c(a = "added_participant")
    private List<Long> n;
    @c(a = "modified_participant")
    private List<Long> o;
    @c(a = "removed_participant")
    private List<Long> p;

    static {
        Covode.recordClassIndex(22995);
    }

    h() {
    }

    public static boolean a(MessageBody messageBody) {
        if (messageBody == null || messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            return false;
        }
        return true;
    }

    private static void d(MessageBody messageBody) {
        Map<String, String> map;
        try {
            Map<String, String> map2 = messageBody.ext;
            final ArrayList arrayList = new ArrayList();
            final HashMap hashMap = new HashMap();
            if (map2 != null && map2.containsKey("s:mark_message_new_ext") && map2.get("s:mark_message_new_ext") != null) {
                JSONObject jSONObject = new JSONObject(map2.get("s:mark_message_new_ext"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    ai a2 = i.a(Long.parseLong(next));
                    HashMap hashMap2 = null;
                    if (jSONObject.get(next) instanceof JSONObject) {
                        map = com.bytedance.im.core.internal.utils.h.a(((JSONObject) jSONObject.get(next)).toString());
                    } else {
                        map = null;
                    }
                    if (a2 != null) {
                        if (a2.getExt() != null) {
                            hashMap.put(String.valueOf(a2.getMsgId()), a2.getExt());
                        }
                        if (map != null) {
                            hashMap2 = new HashMap(map);
                        }
                        a2.putExt(hashMap2);
                        arrayList.add(a2);
                        i.a(a2, true, true);
                    }
                }
                x.a().a(new Runnable() {
                    /* class com.bytedance.im.core.internal.b.a.h.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(23009);
                    }

                    public final void run() {
                        q.a().a(arrayList, hashMap);
                    }
                });
            }
        } catch (Exception e2) {
            f.b("imsdk", "handle batch unmark", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        if (r4.removeMentionMessage(r3.getUuid()) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = com.bytedance.im.core.internal.a.i.a(r12.f38437e);
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.im.core.internal.b.a.h r12) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.h.a(com.bytedance.im.core.internal.b.a.h):void");
    }

    private static void c(MessageBody messageBody) {
        ai aiVar;
        final boolean z;
        final boolean z2;
        List<Long> mentionIds;
        try {
            Map<String, String> map = messageBody.ext;
            String str = "";
            if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = map.get("s:client_message_id");
            }
            if (map == null || !map.containsKey("s:server_message_id") || TextUtils.isEmpty(map.get("s:server_message_id")) || (aiVar = i.a(Long.parseLong(map.get("s:server_message_id")))) == null || messageBody.version.longValue() <= aiVar.getVersion()) {
                if (TextUtils.isEmpty(str)) {
                    aiVar = i.a(messageBody.server_message_id.longValue());
                } else {
                    aiVar = i.c(str);
                }
            }
            if (aiVar != null) {
                final Map<String, String> ext = aiVar.getExt();
                final ai a2 = com.bytedance.im.core.internal.utils.f.a(str, aiVar, messageBody, true, MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue());
                if (i.a(a2, true, true)) {
                    if (!a2.isRecalled() || (mentionIds = a2.getMentionIds()) == null || mentionIds.isEmpty()) {
                        z = false;
                    } else {
                        z = com.bytedance.im.core.internal.a.h.a(a2.getUuid());
                    }
                    final com.bytedance.im.core.d.h a3 = com.bytedance.im.core.internal.a.c.a(a2.getConversationId(), true);
                    if (!(a3 == null || a3.getLastMessage() == null)) {
                        long e2 = com.bytedance.im.core.internal.a.c.e(a3);
                        if (e2 != a3.getUnreadCount()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a3.setUnreadCount(e2);
                        if (a2.getUuid().equals(a3.getLastMessage().getUuid())) {
                            a3.setLastMessage(a2);
                            z2 = true;
                        }
                        com.bytedance.im.core.internal.a.c.a(a3, false);
                        x.a().a(new Runnable() {
                            /* class com.bytedance.im.core.internal.b.a.h.AnonymousClass7 */

                            static {
                                Covode.recordClassIndex(23007);
                            }

                            public final void run() {
                                List<ai> singletonList = Collections.singletonList(a2);
                                HashMap hashMap = new HashMap();
                                if (ext != null) {
                                    hashMap.put(String.valueOf(a2.getMsgId()), ext);
                                }
                                q.a().a(singletonList, hashMap);
                                if (z2 || z) {
                                    j.a().a(a3, 2);
                                }
                            }
                        });
                    }
                }
            }
            if ("true".equals(messageBody.ext.get("s:is_recalled")) || "true".equals(messageBody.ext.get("s:recalled"))) {
                String str2 = "ref_" + messageBody.ext.get("s:server_message_id");
                List<Pair<String, String>> a4 = com.bytedance.im.core.internal.a.j.a(str2);
                final ArrayList arrayList = new ArrayList();
                if (!(a4 == null || a4.isEmpty())) {
                    for (Pair<String, String> pair : a4) {
                        String str3 = (String) pair.first;
                        ReferenceInfo build = ((ReferenceInfo) com.bytedance.im.core.internal.utils.h.f38770a.a((String) pair.second, ReferenceInfo.class)).newBuilder().referenced_message_status(MessageStatus.RECALLED).build();
                        com.bytedance.im.core.internal.a.j.a(str3, str2, com.bytedance.im.core.internal.utils.h.f38770a.b(build));
                        ai c2 = i.c(str3);
                        if (c2 != null) {
                            c2.setRefMsg(build);
                        }
                        arrayList.add(c2);
                    }
                    if (!arrayList.isEmpty()) {
                        x.a().a(new Runnable() {
                            /* class com.bytedance.im.core.internal.b.a.h.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(22996);
                            }

                            public final void run() {
                                q.a().a(arrayList);
                            }
                        });
                    }
                }
            }
        } catch (Exception e3) {
            f.b("imsdk", "handle update", e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x05d4 A[Catch:{ Exception -> 0x060c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.bytedance.im.core.proto.MessageBody r14) {
        /*
        // Method dump skipped, instructions count: 1754
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.h.b(com.bytedance.im.core.proto.MessageBody):boolean");
    }

    static boolean a(ai aiVar, String str) {
        boolean z = false;
        if (aiVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ax axVar = (ax) com.bytedance.im.core.internal.utils.h.f38770a.a(str, ax.class);
            if (axVar == null) {
                return false;
            }
            if (axVar.checkCode != 0 && !TextUtils.equals(aiVar.getLocalExtValue("s:send_response_check_code"), String.valueOf(axVar.checkCode))) {
                aiVar.addLocalExt("s:send_response_check_code", String.valueOf(axVar.checkCode));
                z = true;
            }
            if (!TextUtils.isEmpty(axVar.checkMsg) && !TextUtils.equals(aiVar.getLocalExtValue("s:send_response_check_msg"), axVar.checkMsg)) {
                aiVar.addLocalExt("s:send_response_check_msg", axVar.checkMsg);
                return true;
            }
            return z;
        } catch (Exception e2) {
            f.b("imsdk", "CommandMessage updateCheck", e2);
        }
    }

    private static void a(h hVar, MessageBody messageBody, boolean z) {
        List<Long> list;
        l a2 = g.a(hVar.f38433a);
        if (a2 != null) {
            if (a2.getVersion() < hVar.f38444l || z) {
                a.a(hVar.f38435c, messageBody);
            }
        } else if (d.a().b().O && (list = hVar.n) != null && list.contains(Long.valueOf(d.a().f37562b.a()))) {
            a.a(hVar.f38435c, messageBody);
        }
    }
}
