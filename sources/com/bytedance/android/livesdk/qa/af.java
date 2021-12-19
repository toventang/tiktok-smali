package com.bytedance.android.livesdk.qa;

import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class af {
    @c(a = "question")

    /* renamed from: a  reason: collision with root package name */
    public bj f20351a;
    @c(a = "like_cnt")

    /* renamed from: b  reason: collision with root package name */
    public long f20352b;
    @c(a = "self_like_status")

    /* renamed from: c  reason: collision with root package name */
    public int f20353c;

    static {
        Covode.recordClassIndex(12014);
    }

    public af() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return l.a(this.f20351a, afVar.f20351a) && this.f20352b == afVar.f20352b && this.f20353c == afVar.f20353c;
    }

    public final String toString() {
        return "QuestionEx(question=" + this.f20351a + ", likeCount=" + this.f20352b + ", selfLikeStatus=" + this.f20353c + ")";
    }

    public final int hashCode() {
        int i2;
        bj bjVar = this.f20351a;
        if (bjVar != null) {
            i2 = bjVar.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f20352b;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f20353c;
    }

    public af(bj bjVar) {
        l.d(bjVar, "");
        this.f20351a = bjVar;
        this.f20352b = 0;
        this.f20353c = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af(bj bjVar, int i2) {
        this((i2 & 1) != 0 ? new bj() : bjVar);
    }
}
