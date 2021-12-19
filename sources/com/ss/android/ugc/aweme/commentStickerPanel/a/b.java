package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public final k f73116a = null;
    @c(a = "text")

    /* renamed from: b  reason: collision with root package name */
    public final String f73117b = null;
    @c(a = "cid")

    /* renamed from: c  reason: collision with root package name */
    public final String f73118c = null;
    @c(a = "aweme_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f73119d = null;
    @c(a = "reply_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f73120e = null;
    @c(a = "reply_to_reply_id")

    /* renamed from: f  reason: collision with root package name */
    public final String f73121f = null;
    @c(a = "aweme_uid")

    /* renamed from: g  reason: collision with root package name */
    public final String f73122g = null;

    static {
        Covode.recordClassIndex(45052);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f73116a, bVar.f73116a) && l.a(this.f73117b, bVar.f73117b) && l.a(this.f73118c, bVar.f73118c) && l.a(this.f73119d, bVar.f73119d) && l.a(this.f73120e, bVar.f73120e) && l.a(this.f73121f, bVar.f73121f) && l.a(this.f73122g, bVar.f73122g);
    }

    public final int hashCode() {
        k kVar = this.f73116a;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        String str = this.f73117b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f73118c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73119d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f73120e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f73121f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f73122g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "CommentStickerForPanel(user=" + this.f73116a + ", text=" + this.f73117b + ", cid=" + this.f73118c + ", awemeId=" + this.f73119d + ", replyId=" + this.f73120e + ", replyToReplyId=" + this.f73121f + ", awemeUserId=" + this.f73122g + ")";
    }

    private b() {
    }
}
