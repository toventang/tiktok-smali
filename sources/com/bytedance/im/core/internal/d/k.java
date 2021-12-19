package com.bytedance.im.core.internal.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.bd;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.b.a.z;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import java.lang.reflect.Field;

public final class k implements d, Comparable<k> {

    /* renamed from: a  reason: collision with root package name */
    public long f38720a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38721b;

    /* renamed from: c  reason: collision with root package name */
    public j f38722c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f38723d;

    /* renamed from: e  reason: collision with root package name */
    public Request f38724e;

    /* renamed from: f  reason: collision with root package name */
    public Response f38725f;

    /* renamed from: g  reason: collision with root package name */
    public bd f38726g;

    /* renamed from: h  reason: collision with root package name */
    public w f38727h;

    /* renamed from: i  reason: collision with root package name */
    public int f38728i;

    /* renamed from: j  reason: collision with root package name */
    public long f38729j = SystemClock.uptimeMillis();

    /* renamed from: k  reason: collision with root package name */
    public long f38730k;

    /* renamed from: l  reason: collision with root package name */
    public int f38731l;

    /* renamed from: m  reason: collision with root package name */
    public int f38732m;
    public boolean n;
    public int o;
    public int p;
    public long q;
    public long r;
    public String s;
    public long t;
    public volatile z u;

    static {
        Covode.recordClassIndex(23103);
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final int a() {
        return this.f38728i;
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final String g() {
        return this.s;
    }

    public final long i() {
        return this.r - this.q;
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final String f() {
        Response response = this.f38725f;
        if (response == null) {
            return "";
        }
        return response.log_id;
    }

    public final int h() {
        int i2 = this.o;
        if (i2 > 0) {
            return i2;
        }
        return d.a().b().n;
    }

    public final boolean j() {
        if (this.f38731l > 0 || this.f38732m > 0) {
            return true;
        }
        return false;
    }

    public final String m() {
        Response response = this.f38725f;
        if (response != null) {
            return response.error_desc;
        }
        return "";
    }

    public final int k() {
        Request request = this.f38724e;
        if (request == null || request.cmd == null) {
            return IMCMD.IMCMD_NOT_USED.getValue();
        }
        return this.f38724e.cmd.intValue();
    }

    public final boolean l() {
        Response response = this.f38725f;
        if (response == null || response.status_code == null) {
            return false;
        }
        if (this.f38725f.status_code.intValue() == e.b.f37585a || this.f38725f.status_code.intValue() == 200) {
            return true;
        }
        return false;
    }

    public final String n() {
        Request request = this.f38724e;
        if (request == null || request.cmd == null || IMCMD.fromValue(this.f38724e.cmd.intValue()) != IMCMD.SEND_MESSAGE || this.f38724e.body == null || this.f38724e.body.send_message_body == null) {
            return "";
        }
        return this.f38724e.body.send_message_body.client_message_id;
    }

    public final String toString() {
        return "RequestItem[cmd:" + k() + ", seqId:" + this.f38720a + "]";
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final String c() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f38724e.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f38725f.body.send_message_body.extra_info;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f38725f.body.create_conversation_v2_body.extra_info;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_add_participants_body.extra_info;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_remove_participants_body.extra_info;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f38725f.body.update_conversation_participant_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f38725f.body.set_conversation_core_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_core_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f38725f.body.set_conversation_setting_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_setting_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.CALL_VOIP) {
                String str = (String) a("extra_info", this.f38725f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                String str2 = (String) a("extra_info", this.f38725f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final int b() {
        Integer num;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f38724e.cmd.intValue());
            if (fromValue == null) {
                return e.b.f37585a;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f38725f.body.send_message_body.status.intValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f38725f.body.create_conversation_v2_body.status.intValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_add_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_remove_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f38725f.body.update_conversation_participant_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f38725f.body.set_conversation_core_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_core_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f38725f.body.set_conversation_setting_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_setting_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                Integer num2 = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (num2 != null) {
                    return num2.intValue();
                }
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                Integer num3 = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (num3 != null) {
                    return num3.intValue();
                }
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                Integer num4 = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (num4 != null) {
                    return num4.intValue();
                }
            } else if (fromValue == IMCMD.CALL_VOIP) {
                Integer num5 = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (num5 != null) {
                    return num5.intValue();
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                Integer num6 = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (num6 != null) {
                    return num6.intValue();
                }
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f38725f.body.previewer_get_conversation_info_list_body.status.intValue();
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f38725f.body.previewer_messages_in_conversation_body.status.intValue();
                }
                if (fromValue == IMCMD.SEND_FRIEND_APPLY && (num = (Integer) a("status", this.f38725f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) != null) {
                    return num.intValue();
                }
            }
            return e.b.f37585a;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final long d() {
        Long l2;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f38724e.cmd.intValue());
            if (fromValue == null) {
                return -1000;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f38725f.body.send_message_body.check_code.longValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f38725f.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f38725f.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f38725f.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f38725f.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                Long l3 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (l3 != null) {
                    return l3.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                Long l4 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (l4 != null) {
                    return l4.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                Long l5 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (l5 != null) {
                    return l5.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.CALL_VOIP) {
                Long l6 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (l6 != null) {
                    return l6.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                Long l7 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (l7 != null) {
                    return l7.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f38725f.body.previewer_get_conversation_info_list_body.check_code.longValue();
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f38725f.body.previewer_messages_in_conversation_body.check_code.longValue();
                }
                if (fromValue != IMCMD.SEND_FRIEND_APPLY || (l2 = (Long) a("check_code", this.f38725f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) == null) {
                    return 0;
                }
                return l2.longValue();
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.im.core.internal.d.d
    public final String e() {
        String str;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f38724e.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f38725f.body.send_message_body.check_message;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f38725f.body.create_conversation_v2_body.check_message;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_add_participants_body.check_message;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f38725f.body.conversation_remove_participants_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f38725f.body.update_conversation_participant_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f38725f.body.set_conversation_core_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_core_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f38725f.body.set_conversation_setting_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f38725f.body.upsert_conversation_setting_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                String str2 = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (str2 != null) {
                    return str2;
                }
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                String str3 = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (str3 != null) {
                    return str3;
                }
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                String str4 = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (str4 != null) {
                    return str4;
                }
            } else if (fromValue == IMCMD.CALL_VOIP) {
                String str5 = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (str5 != null) {
                    return str5;
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                String str6 = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (str6 != null) {
                    return str6;
                }
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f38725f.body.previewer_get_conversation_info_list_body.check_message;
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f38725f.body.previewer_messages_in_conversation_body.check_message;
                }
                if (fromValue != IMCMD.SEND_FRIEND_APPLY || (str = (String) a("check_message", this.f38725f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) == null) {
                    return "";
                }
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public static k a(int i2) {
        k kVar = new k(-1, null);
        kVar.f38728i = i2;
        kVar.f38722c = null;
        return kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(k kVar) {
        k kVar2 = kVar;
        if (equals(kVar2)) {
            return 0;
        }
        int k2 = k();
        if (k2 != kVar2.k()) {
            if (k2 == IMCMD.SEND_MESSAGE.getValue()) {
                return -1;
            }
            if (kVar2.k() == IMCMD.SEND_MESSAGE.getValue()) {
                return 1;
            }
        }
        long j2 = this.f38720a;
        long j3 = kVar2.f38720a;
        if (j2 - j3 > 0) {
            return 1;
        }
        if (j2 - j3 < 0) {
            return -1;
        }
        return 0;
    }

    public final void a(Response response) {
        int i2;
        this.f38725f = response;
        if (response != null) {
            if (response.status_code != null) {
                i2 = response.status_code.intValue();
            } else {
                i2 = e.b.f37591g;
            }
            this.f38728i = i2;
        }
    }

    public k(long j2, w wVar) {
        this.f38720a = j2;
        this.f38727h = wVar;
    }

    private static Object a(String str, Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void a(int i2, String str) {
        if (this.f38724e != null) {
            this.f38725f = new Response.Builder().cmd(this.f38724e.cmd).inbox_type(this.f38724e.inbox_type).error_desc(str).sequence_id(Long.valueOf(this.f38720a)).status_code(Integer.valueOf(i2)).build();
            this.f38728i = i2;
        }
    }
}
