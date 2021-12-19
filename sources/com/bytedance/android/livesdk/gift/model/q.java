package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Long f17927a = 0L;

    /* renamed from: b  reason: collision with root package name */
    public static final Long f17928b = 0L;

    /* renamed from: c  reason: collision with root package name */
    public static final Long f17929c = 0L;

    /* renamed from: d  reason: collision with root package name */
    public static final Long f17930d = 0L;

    /* renamed from: e  reason: collision with root package name */
    public static final Long f17931e = 0L;
    @c(a = "display_text")

    /* renamed from: f  reason: collision with root package name */
    public b f17932f;
    @c(a = "describe")

    /* renamed from: g  reason: collision with root package name */
    public String f17933g;
    @c(a = "gift_id")

    /* renamed from: h  reason: collision with root package name */
    public Long f17934h;
    @c(a = "group_count")

    /* renamed from: i  reason: collision with root package name */
    public Long f17935i;
    @c(a = "repeat_count")

    /* renamed from: j  reason: collision with root package name */
    public Long f17936j;
    @c(a = "combo_count")

    /* renamed from: k  reason: collision with root package name */
    public Long f17937k;
    @c(a = "msg_id")

    /* renamed from: l  reason: collision with root package name */
    public Long f17938l;

    static {
        Covode.recordClassIndex(9974);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17932f != null) {
            sb.append(", display_text=").append(this.f17932f);
        }
        if (this.f17933g != null) {
            sb.append(", describe=").append(this.f17933g);
        }
        if (this.f17934h != null) {
            sb.append(", gift_id=").append(this.f17934h);
        }
        if (this.f17935i != null) {
            sb.append(", group_count=").append(this.f17935i);
        }
        if (this.f17936j != null) {
            sb.append(", repeat_count=").append(this.f17936j);
        }
        if (this.f17937k != null) {
            sb.append(", combo_count=").append(this.f17937k);
        }
        if (this.f17938l != null) {
            sb.append(", msg_id=").append(this.f17938l);
        }
        return sb.replace(0, 2, "HotfixGiftDataForProp{").append('}').toString();
    }
}
