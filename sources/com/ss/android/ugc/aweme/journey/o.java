package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class o extends BaseResponse {
    @c(a = "new_user_interest_page")

    /* renamed from: a  reason: collision with root package name */
    public final v f104873a;
    @c(a = "new_user_content_language_page")

    /* renamed from: b  reason: collision with root package name */
    public final k f104874b;
    @c(a = "gender_selection_page")

    /* renamed from: c  reason: collision with root package name */
    public final n f104875c;
    @c(a = "pers_ad")

    /* renamed from: d  reason: collision with root package name */
    public final ae f104876d;
    @c(a = "journey_flow")

    /* renamed from: e  reason: collision with root package name */
    public final m f104877e;
    @c(a = "ordered_flow")

    /* renamed from: f  reason: collision with root package name */
    public final ad f104878f;
    @c(a = "log_pb")

    /* renamed from: g  reason: collision with root package name */
    public final t f104879g;
    @c(a = "topic_interest")

    /* renamed from: h  reason: collision with root package name */
    public final List<ai> f104880h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f104881i;

    static {
        Covode.recordClassIndex(67254);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f104873a, oVar.f104873a) && l.a(this.f104874b, oVar.f104874b) && l.a(this.f104875c, oVar.f104875c) && l.a(this.f104876d, oVar.f104876d) && l.a(this.f104877e, oVar.f104877e) && l.a(this.f104878f, oVar.f104878f) && l.a(this.f104879g, oVar.f104879g) && l.a(this.f104880h, oVar.f104880h) && this.f104881i == oVar.f104881i;
    }

    public final int hashCode() {
        v vVar = this.f104873a;
        int i2 = 0;
        int hashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        k kVar = this.f104874b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        n nVar = this.f104875c;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        ae aeVar = this.f104876d;
        int hashCode4 = (hashCode3 + (aeVar != null ? aeVar.hashCode() : 0)) * 31;
        m mVar = this.f104877e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        ad adVar = this.f104878f;
        int hashCode6 = (hashCode5 + (adVar != null ? adVar.hashCode() : 0)) * 31;
        t tVar = this.f104879g;
        int hashCode7 = (hashCode6 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        List<ai> list = this.f104880h;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (hashCode7 + i2) * 31;
        boolean z = this.f104881i;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "JourneyResponse(new_user_interest_page=" + this.f104873a + ", new_user_content_language_page=" + this.f104874b + ", gender_selection_page=" + this.f104875c + ", personalizationAd=" + this.f104876d + ", journey_flow=" + this.f104877e + ", orderedFlow=" + this.f104878f + ", logPb=" + this.f104879g + ", topicInterestList=" + this.f104880h + ", isDefault=" + this.f104881i + ")";
    }
}
