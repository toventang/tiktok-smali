package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.nita.c.a;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.o;
import java.util.Iterator;

public final class r {
    static {
        Covode.recordClassIndex(23166);
    }

    private static String a(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("\t");
        }
        return sb.toString();
    }

    private static void a(o oVar) {
        o f2;
        try {
            if (oVar.b("reference_info") && (f2 = oVar.f("reference_info")) != null) {
                f2.a("hint", "");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (i2 > 0 && '\n' == sb.charAt(sb.length() - 1)) {
                sb.append(a(i2));
            }
            if (charAt != ',') {
                if (charAt != '[') {
                    if (charAt != ']') {
                        if (charAt != '{') {
                            if (charAt != '}') {
                                sb.append(charAt);
                            }
                        }
                    }
                    sb.append("\n");
                    i2--;
                    sb.append(a(i2));
                    sb.append(charAt);
                }
                sb.append(charAt).append("\n");
                i2++;
            } else {
                sb.append(charAt).append("\n");
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == '\\') {
                i2 = i3 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 'u') {
                    int i4 = 0;
                    int i5 = 0;
                    do {
                        int i6 = i2 + 1;
                        char charAt3 = str.charAt(i2);
                        switch (charAt3) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i5 = ((i5 << 4) + charAt3) - 48;
                                break;
                            default:
                                switch (charAt3) {
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i5 = (((i5 << 4) + 10) + charAt3) - 65;
                                        break;
                                    default:
                                        switch (charAt3) {
                                            default:
                                                throw new IllegalArgumentException("Malformed   \\uxxxx   encoding.");
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case a.f41622a:
                                            case 'e':
                                            case 'f':
                                                i5 = (((i5 << 4) + 10) + charAt3) - 97;
                                                break;
                                        }
                                }
                        }
                        i4++;
                        i2 = i6;
                    } while (i4 < 4);
                    sb.append((char) i5);
                } else {
                    if (charAt2 == 't') {
                        charAt2 = '\t';
                    } else if (charAt2 == 'r') {
                        charAt2 = '\r';
                    } else if (charAt2 == 'n') {
                        charAt2 = '\n';
                    } else if (charAt2 == 'f') {
                        charAt2 = '\f';
                    }
                    sb.append(charAt2);
                }
            } else {
                sb.append(charAt);
                i2 = i3;
            }
        }
        return sb.toString();
    }

    public static void a(Integer num, String str, Object obj) {
        o oVar;
        i e2;
        o f2;
        try {
            if (!e.a(num)) {
                String str2 = "";
                String str3 = str2;
                if (obj != null) {
                    String b2 = h.f38770a.b(obj);
                    o oVar2 = b2;
                    if (d.a().b().f37596d) {
                        if (obj instanceof Request) {
                            Request request = (Request) obj;
                            o oVar3 = (o) h.f38770a.a(b2, o.class);
                            oVar3.a("channel");
                            oVar3.a("device_id");
                            oVar3.a("device_platform");
                            oVar3.a("device_type");
                            oVar3.a("os_version");
                            oVar3.a("token");
                            o f3 = oVar3.f("token_info");
                            if (f3 != null) {
                                f3.a("app_id");
                            }
                            oVar2 = oVar3;
                            if (request.body != null) {
                                if (request.body.send_message_body == null || TextUtils.isEmpty(request.body.send_message_body.content)) {
                                    if (request.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                                        o f4 = oVar3.f("body").f("extensionMsgs");
                                        if (f4.b("BroadcastSendMessageRequestBody")) {
                                            o f5 = f4.f("BroadcastSendMessageRequestBody");
                                            if (f5.b("content")) {
                                                f5.a("content", str2);
                                                oVar2 = oVar3;
                                            }
                                        }
                                    }
                                    oVar2 = oVar3;
                                    if (request.body.send_message_p2p_body != null) {
                                        oVar2 = oVar3;
                                        if (!TextUtils.isEmpty(request.body.send_message_p2p_body.content)) {
                                            oVar3.f("body").f("send_message_p2p_body").a("content", str2);
                                            oVar2 = oVar3;
                                        }
                                    }
                                } else {
                                    o f6 = oVar3.f("body").f("send_message_body");
                                    f6.a("content", str2);
                                    if (!(request.body.send_message_body.ref_msg_info == null || TextUtils.isEmpty(request.body.send_message_body.ref_msg_info.hint) || (f2 = f6.f("ref_msg_info")) == null)) {
                                        f2.a("hint", str2);
                                    }
                                    f6.a("content", str2);
                                    oVar2 = oVar3;
                                }
                            }
                        } else {
                            if (obj instanceof Response) {
                                Response response = (Response) obj;
                                if (response.body != null) {
                                    if (response.body.has_new_message_notify != null && response.body.has_new_message_notify.message != null && !TextUtils.isEmpty(response.body.has_new_message_notify.message.content)) {
                                        oVar = (o) h.f38770a.a(b2, o.class);
                                        o f7 = oVar.f("body").f("has_new_message_notify").f("message");
                                        f7.a("content", str2);
                                        a(f7);
                                    } else if (response.body.messages_per_user_body != null && response.body.messages_per_user_body.messages != null && !response.body.messages_per_user_body.messages.isEmpty()) {
                                        oVar = (o) h.f38770a.a(b2, o.class);
                                        Iterator<l> it = oVar.f("body").f("messages_per_user_body").e("messages").iterator();
                                        while (it.hasNext()) {
                                            o oVar4 = (o) it.next();
                                            oVar4.a("content", str2);
                                            a(oVar4);
                                        }
                                    } else if (response.body.messages_per_user_init_v2_body != null && response.body.messages_per_user_init_v2_body.messages != null && !response.body.messages_per_user_init_v2_body.messages.isEmpty()) {
                                        oVar = (o) h.f38770a.a(b2, o.class);
                                        Iterator<l> it2 = oVar.f("body").f("messages_per_user_init_v2_body").e("messages").iterator();
                                        while (it2.hasNext()) {
                                            o oVar5 = (o) it2.next();
                                            oVar5.a("content", str2);
                                            a(oVar5);
                                        }
                                    } else if (response.body.messages_in_conversation_body == null || response.body.messages_in_conversation_body.messages == null || response.body.messages_in_conversation_body.messages.isEmpty()) {
                                        if (response.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()) != null) {
                                            o oVar6 = (o) h.f38770a.a(b2, o.class);
                                            o f8 = oVar6.f("body").f("extensionMsgs");
                                            if (f8.b("BroadcastSendMessageResponseBody")) {
                                                o f9 = f8.f("BroadcastSendMessageResponseBody");
                                                if (f9.b("messages") && (e2 = f9.e("messages")) != null) {
                                                    Iterator<l> it3 = e2.iterator();
                                                    while (it3.hasNext()) {
                                                        o oVar7 = (o) it3.next();
                                                        if (oVar7.b("content")) {
                                                            oVar7.a("content", str2);
                                                        }
                                                        a(oVar7);
                                                    }
                                                    str3 = oVar6;
                                                }
                                            }
                                        }
                                        if (response.body.get_stranger_messages_body != null && response.body.get_stranger_messages_body.messages != null && !response.body.get_stranger_messages_body.messages.isEmpty()) {
                                            oVar = (o) h.f38770a.a(b2, o.class);
                                            Iterator<l> it4 = oVar.f("body").f("get_stranger_messages_body").e("messages").iterator();
                                            while (it4.hasNext()) {
                                                o oVar8 = (o) it4.next();
                                                oVar8.a("content", str2);
                                                a(oVar8);
                                            }
                                        } else if (response.body.get_stranger_conversation_body != null && response.body.get_stranger_conversation_body.conversation_list != null && !response.body.get_stranger_conversation_body.conversation_list.isEmpty()) {
                                            oVar = (o) h.f38770a.a(b2, o.class);
                                            Iterator<l> it5 = oVar.f("body").f("get_stranger_conversation_body").e("conversation_list").iterator();
                                            while (it5.hasNext()) {
                                                o f10 = ((o) it5.next()).f("last_message");
                                                f10.a("content", str2);
                                                a(f10);
                                            }
                                        } else if (response.body.get_recent_message_body != null && response.body.get_recent_message_body.messages != null && !response.body.get_recent_message_body.messages.isEmpty()) {
                                            oVar = (o) h.f38770a.a(b2, o.class);
                                            Iterator<l> it6 = oVar.f("body").f("get_recent_message_body").e("messages").iterator();
                                            while (it6.hasNext()) {
                                                i e3 = ((o) it6.next()).e("messages");
                                                if (e3 != null) {
                                                    Iterator<l> it7 = e3.iterator();
                                                    while (it7.hasNext()) {
                                                        o oVar9 = (o) it7.next();
                                                        if (oVar9 != null) {
                                                            oVar9.a("content", str2);
                                                            a(oVar9);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (response.body.get_message_info_by_index_v2_range_body != null && response.body.get_message_info_by_index_v2_range_body.infos != null && !response.body.get_message_info_by_index_v2_range_body.infos.isEmpty()) {
                                            oVar = (o) h.f38770a.a(b2, o.class);
                                            Iterator<l> it8 = oVar.f("body").f("get_message_info_by_index_v2_range_body").e("infos").iterator();
                                            while (it8.hasNext()) {
                                                o f11 = ((o) it8.next()).f("body");
                                                if (f11 != null) {
                                                    f11.a("content", str2);
                                                    a(f11);
                                                }
                                            }
                                        } else if (!(response.body.get_message_by_id_body == null || response.body.get_message_by_id_body.msg_info == null || response.body.get_message_by_id_body.msg_info.body == null)) {
                                            oVar = (o) h.f38770a.a(b2, o.class);
                                            o f12 = oVar.f("body").f("get_message_by_id_body").f("msg_info").f("body");
                                            f12.a("content", str2);
                                            a(f12);
                                        }
                                    } else {
                                        oVar = (o) h.f38770a.a(b2, o.class);
                                        Iterator<l> it9 = oVar.f("body").f("messages_in_conversation_body").e("messages").iterator();
                                        while (it9.hasNext()) {
                                            o oVar10 = (o) it9.next();
                                            oVar10.a("content", str2);
                                            a(oVar10);
                                        }
                                    }
                                    str3 = oVar;
                                }
                            }
                            str3 = obj;
                        }
                    }
                    str3 = oVar2;
                }
                if (e.f37627a != null) {
                    e.f37627a.a(str3);
                }
                if (!TextUtils.isEmpty(str)) {
                    f.b("imsdk", "PBLogUtils ".concat(String.valueOf(str)), (Throwable) null);
                }
                if (d.a().b().f37594b == 0) {
                    f.b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : " + str3.toString(), (Throwable) null);
                    return;
                }
                String b3 = h.f38770a.b(str3);
                if (d.a().b().f37594b == 2) {
                    b3 = b(a(b3));
                }
                if (b3.length() < 1996) {
                    f.b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : " + b3, (Throwable) null);
                    return;
                }
                f.b("imsdk", "PBLogUtils " + obj.getClass().getSimpleName() + " : ", (Throwable) null);
                while (b3.length() > 1996) {
                    f.b("imsdk", "PBLogUtils " + b3.substring(0, 1996), (Throwable) null);
                    b3 = b3.substring(1996);
                }
                f.b("imsdk", "PBLogUtils ".concat(String.valueOf(b3)), (Throwable) null);
            }
        } catch (Throwable th) {
            j.b("PBLogUtils", th);
        }
    }
}
