package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.vm.d;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f119490a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119491b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119492c;

    /* renamed from: d  reason: collision with root package name */
    public final d f119493d;

    /* renamed from: e  reason: collision with root package name */
    public final List<k> f119494e;

    static {
        Covode.recordClassIndex(77663);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f119490a, eVar.f119490a) && l.a(this.f119491b, eVar.f119491b) && l.a(this.f119492c, eVar.f119492c) && l.a(this.f119493d, eVar.f119493d) && l.a(this.f119494e, eVar.f119494e);
    }

    public final int hashCode() {
        String str = this.f119490a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119491b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119492c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        d dVar = this.f119493d;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        List<k> list = this.f119494e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "QnaCellDataAnswersSubsection(avatarUrlThumbnail=" + this.f119490a + ", avatarAdjacentTextDisplayName=" + this.f119491b + ", avatarAdjacentTextTimestamp=" + this.f119492c + ", profileData=" + this.f119493d + ", videoThumbnail=" + this.f119494e + ")";
    }

    public e(String str, String str2, String str3, d dVar, List<k> list) {
        l.d(dVar, "");
        this.f119490a = str;
        this.f119491b = str2;
        this.f119492c = str3;
        this.f119493d = dVar;
        this.f119494e = list;
    }
}
