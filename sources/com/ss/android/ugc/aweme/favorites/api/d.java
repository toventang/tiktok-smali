package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse implements c {
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final String f90449a;
    @com.google.gson.a.c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public String f90450b;
    @com.google.gson.a.c(a = "covers")

    /* renamed from: c  reason: collision with root package name */
    public final List<UrlModel> f90451c;
    @com.google.gson.a.c(a = "status")

    /* renamed from: d  reason: collision with root package name */
    public final b f90452d;
    @com.google.gson.a.c(a = "statistic")

    /* renamed from: e  reason: collision with root package name */
    public final a f90453e;

    static {
        Covode.recordClassIndex(56780);
    }

    public d() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f90449a, dVar.f90449a) && l.a(this.f90450b, dVar.f90450b) && l.a(this.f90451c, dVar.f90451c) && l.a(this.f90452d, dVar.f90452d) && l.a(this.f90453e, dVar.f90453e);
    }

    public final int hashCode() {
        String str = this.f90449a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90450b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<UrlModel> list = this.f90451c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        b bVar = this.f90452d;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a aVar = this.f90453e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionDetail(id=" + this.f90449a + ", name=" + this.f90450b + ", covers=" + this.f90451c + ", status=" + this.f90452d + ", statistic=" + this.f90453e + ")";
    }

    public static final class b {
        @com.google.gson.a.c(a = "state")

        /* renamed from: a  reason: collision with root package name */
        public final Integer f90456a;

        static {
            Covode.recordClassIndex(56782);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f90456a, ((b) obj).f90456a);
            }
            return true;
        }

        public final int hashCode() {
            Integer num = this.f90456a;
            if (num != null) {
                return num.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Status(state=" + this.f90456a + ")";
        }

        private /* synthetic */ b() {
            this(null);
        }

        public b(Integer num) {
            this.f90456a = num;
        }
    }

    public static final class a {
        @com.google.gson.a.c(a = "total")

        /* renamed from: a  reason: collision with root package name */
        public Long f90454a;
        @com.google.gson.a.c(a = "has_videos")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f90455b;

        static {
            Covode.recordClassIndex(56781);
        }

        public a() {
            this(null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f90454a, aVar.f90454a) && this.f90455b == aVar.f90455b;
        }

        public final int hashCode() {
            Long l2 = this.f90454a;
            int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
            boolean z = this.f90455b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "Statistic(total=" + this.f90454a + ", hasVideos=" + this.f90455b + ")";
        }

        private a(Long l2) {
            this.f90454a = l2;
            this.f90455b = false;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Long l2, int i2) {
            this((i2 & 1) != 0 ? null : l2);
        }
    }

    private d(String str, String str2, b bVar, a aVar) {
        this.f90449a = str;
        this.f90450b = str2;
        this.f90451c = null;
        this.f90452d = bVar;
        this.f90453e = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, String str2, b bVar, a aVar, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 8) != 0 ? null : bVar, (i2 & 16) != 0 ? null : aVar);
    }
}
