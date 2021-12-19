package com.ss.android.ugc.aweme.comment.translatorinfo.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import h.f.b.l;
import l.b.f;
import l.b.o;
import l.b.t;

public interface CommentTranslatorInfoApi {

    /* renamed from: a  reason: collision with root package name */
    public static final b f72448a = b.f72453a;

    static {
        Covode.recordClassIndex(44656);
    }

    @f(a = "/tiktok/cla/translation_like/get/v1/")
    ab<a> fetchTranslationLikeInfo(@t(a = "item_id") String str, @t(a = "subtitle_id") String str2, @t(a = "translator_id") String str3);

    @o(a = "/tiktok/cla/translation_like/create/v1/")
    ab<BaseResponse> updateTranslationLikeInfo(@t(a = "item_id") String str, @t(a = "subtitle_id") String str2, @t(a = "translator_id") String str3, @t(a = "is_cancel") Boolean bool);

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f72453a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final com.bytedance.ies.ugc.aweme.network.f f72454b;

        private b() {
        }

        public static CommentTranslatorInfoApi a() {
            Object a2 = f72454b.a(CommentTranslatorInfoApi.class);
            l.b(a2, "");
            return (CommentTranslatorInfoApi) a2;
        }

        static {
            Covode.recordClassIndex(44658);
            String str = com.ss.android.c.b.f59141e;
            l.b(str, "");
            f72454b = com.bytedance.ies.ugc.aweme.network.ext.a.a(str);
        }
    }

    public static final class a extends BaseResponse {
        @c(a = "translator_nickname")

        /* renamed from: a  reason: collision with root package name */
        public final String f72449a;
        @c(a = "translator_id")

        /* renamed from: b  reason: collision with root package name */
        public final String f72450b;
        @c(a = "is_liked")

        /* renamed from: c  reason: collision with root package name */
        public final boolean f72451c;
        @c(a = "display_message")

        /* renamed from: d  reason: collision with root package name */
        public final String f72452d;

        static {
            Covode.recordClassIndex(44657);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f72449a, aVar.f72449a) && l.a(this.f72450b, aVar.f72450b) && this.f72451c == aVar.f72451c && l.a(this.f72452d, aVar.f72452d);
        }

        public final int hashCode() {
            String str = this.f72449a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f72450b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f72451c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode2 + i3) * 31;
            String str3 = this.f72452d;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return i6 + i2;
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            return "CommentTranslatiorInfoResponse(translatorNickname=" + this.f72449a + ", translatorId=" + this.f72450b + ", isLiked=" + this.f72451c + ", displayMessage=" + this.f72452d + ")";
        }

        private /* synthetic */ a() {
            this("", "", "");
        }

        private a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f72449a = str;
            this.f72450b = str2;
            this.f72451c = false;
            this.f72452d = str3;
        }
    }
}
