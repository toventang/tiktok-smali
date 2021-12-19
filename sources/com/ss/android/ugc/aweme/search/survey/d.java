package com.ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final a f121652a = null;

    static {
        Covode.recordClassIndex(79242);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f121652a, ((d) obj).f121652a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f121652a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SurveyDetailResponse(data=" + this.f121652a + ")";
    }

    private d() {
    }

    public static final class a {
        @c(a = "survey_title")

        /* renamed from: a  reason: collision with root package name */
        public final String f121653a;
        @c(a = "stars_title_array")

        /* renamed from: b  reason: collision with root package name */
        public List<String> f121654b;

        static {
            Covode.recordClassIndex(79243);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f121653a, aVar.f121653a) && l.a(this.f121654b, aVar.f121654b);
        }

        public final int hashCode() {
            String str = this.f121653a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.f121654b;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "Data(title=" + this.f121653a + ", starsTitleList=" + this.f121654b + ")";
        }

        private a() {
            this.f121653a = null;
            this.f121654b = null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
