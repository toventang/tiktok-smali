package com.ss.android.ugc.aweme.discover.api;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.List;
import l.b.f;
import l.b.t;
import org.json.JSONArray;

public final class SearchSugApi {

    /* renamed from: a  reason: collision with root package name */
    public static final SearchSugApi f80799a = new SearchSugApi();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80800b = i.a((h.f.a.a) b.f80811a);

    public interface Api {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f80801a = a.f80802a;

        static {
            Covode.recordClassIndex(50244);
        }

        @f(a = "/aweme/v1/search/sug/")
        q<SearchSugResponse> fetchSug(@t(a = "keyword") String str, @t(a = "source") String str2, @t(a = "history_list") String str3, @t(a = "from_group_id") String str4, @t(a = "count") Integer num, @t(a = "sug_signal") String str5, @t(a = "rich_sug_count") Integer num2, @t(a = "request_order") Long l2);

        @f(a = "/aweme/v1/search/user/sug/")
        com.bytedance.retrofit2.b<com.ss.android.ugc.aweme.search.model.h> fetchUserSug(@t(a = "mention_type") long j2, @t(a = "aweme_id") Long l2, @t(a = "keyword") String str, @t(a = "source") String str2, @t(a = "count") long j3, @t(a = "uid_filter_list") String str3);

        @f(a = "/aweme/v1/search/user/sug/")
        b.i<com.ss.android.ugc.aweme.search.model.h> fetchUserSugAsync(@t(a = "mention_type") long j2, @t(a = "aweme_id") Long l2, @t(a = "keyword") String str, @t(a = "source") String str2, @t(a = "count") long j3, @t(a = "uid_filter_list") String str3);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f80802a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(50245);
            }
        }
    }

    public static Api a() {
        return (Api) f80800b.getValue();
    }

    private SearchSugApi() {
    }

    static final class b extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80811a = new b();

        static {
            Covode.recordClassIndex(50247);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.a().b(com.ss.android.c.b.f59138b).d().a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(50243);
    }

    public static String a(List<String> list) {
        List d2;
        if (list == null || !(!list.isEmpty()) || (d2 = n.d((Iterable) list, 100)) == null) {
            return "";
        }
        String encode = Uri.encode(new JSONArray((Collection) d2).toString());
        l.b(encode, "");
        return encode;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f80803a;

        /* renamed from: b  reason: collision with root package name */
        public final String f80804b;

        /* renamed from: c  reason: collision with root package name */
        public final String f80805c;

        /* renamed from: d  reason: collision with root package name */
        public final String f80806d;

        /* renamed from: e  reason: collision with root package name */
        public final Integer f80807e;

        /* renamed from: f  reason: collision with root package name */
        public final String f80808f;

        /* renamed from: g  reason: collision with root package name */
        public final Integer f80809g;

        /* renamed from: h  reason: collision with root package name */
        public final Long f80810h;

        static {
            Covode.recordClassIndex(50246);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f80803a, aVar.f80803a) && l.a(this.f80804b, aVar.f80804b) && l.a(this.f80805c, aVar.f80805c) && l.a(this.f80806d, aVar.f80806d) && l.a(this.f80807e, aVar.f80807e) && l.a(this.f80808f, aVar.f80808f) && l.a(this.f80809g, aVar.f80809g) && l.a(this.f80810h, aVar.f80810h);
        }

        public final int hashCode() {
            String str = this.f80803a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f80804b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f80805c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f80806d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Integer num = this.f80807e;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            String str5 = this.f80808f;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Integer num2 = this.f80809g;
            int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Long l2 = this.f80810h;
            if (l2 != null) {
                i2 = l2.hashCode();
            }
            return hashCode7 + i2;
        }

        public final String toString() {
            return "Param(keywords=" + this.f80803a + ", source=" + this.f80804b + ", gid=" + this.f80805c + ", historyJson=" + this.f80806d + ", totalCount=" + this.f80807e + ", signal=" + this.f80808f + ", richSugCount=" + this.f80809g + ", requestOrder=" + this.f80810h + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, String str3, String str4, Integer num, Integer num2, int i2) {
            this(str, str2, str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? null : num, null, (i2 & 64) == 0 ? num2 : null, null);
        }

        public a(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Long l2) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            this.f80803a = str;
            this.f80804b = str2;
            this.f80805c = str3;
            this.f80806d = str4;
            this.f80807e = num;
            this.f80808f = str5;
            this.f80809g = num2;
            this.f80810h = l2;
        }
    }
}
