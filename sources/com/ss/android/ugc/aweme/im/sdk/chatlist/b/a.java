package com.ss.android.ugc.aweme.im.sdk.chatlist.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class a implements Serializable {
    public static final C2533a Companion = new C2533a((byte) 0);
    @c(a = "create_at")
    private final Long create_at;
    @c(a = "idempotent_id")
    private final String idempotent_id;
    @c(a = "key")
    private final String key;
    @c(a = "mark_read")
    private Integer mark_read;
    @c(a = "message")
    private final ai message;
    @c(a = "message_id")
    private final String message_id;
    @c(a = "sender_sec_uid")
    private final String sender_sec_uid;
    @c(a = "sender_uid")
    private final String sender_uid;
    @c(a = "value")
    private final String value;

    static {
        Covode.recordClassIndex(65163);
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a$a  reason: collision with other inner class name */
    public static final class C2533a {
        static {
            Covode.recordClassIndex(65164);
        }

        private C2533a() {
        }

        public /* synthetic */ C2533a(byte b2) {
            this();
        }
    }

    public final Long getCreate_at() {
        return this.create_at;
    }

    public final String getIdempotent_id() {
        return this.idempotent_id;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getMark_read() {
        return this.mark_read;
    }

    public final ai getMessage() {
        return this.message;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getSender_sec_uid() {
        return this.sender_sec_uid;
    }

    public final String getSender_uid() {
        return this.sender_uid;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setMark_read(Integer num) {
        this.mark_read = num;
    }

    public a(String str, String str2, Long l2, String str3, String str4, String str5, String str6, ai aiVar, Integer num) {
        this.key = str;
        this.idempotent_id = str2;
        this.create_at = l2;
        this.value = str3;
        this.sender_uid = str4;
        this.sender_sec_uid = str5;
        this.message_id = str6;
        this.message = aiVar;
        this.mark_read = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, Long l2, String str3, String str4, String str5, String str6, ai aiVar, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : l2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : aiVar, (i2 & 256) == 0 ? num : null);
    }
}
