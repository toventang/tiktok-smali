package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.k;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class p extends MusNotice {

    /* renamed from: d  reason: collision with root package name */
    public static final a f113274d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<UrlModel> f113275a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f113276b;

    /* renamed from: c  reason: collision with root package name */
    public final String f113277c;

    static {
        Covode.recordClassIndex(72827);
    }

    public final String toString() {
        return "RecommendLiveNotice(avatarList=" + this.f113275a + ", enable=" + this.f113276b + ", requestId=" + this.f113277c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72828);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static p a(k kVar) {
            l.d(kVar, "");
            return new p(kVar.f112868a, kVar.f112869b, kVar.getRequestId());
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f113275a, Boolean.valueOf(this.f113276b));
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.type == pVar.type && Objects.equals(this.f113275a, pVar.f113275a) && this.f113276b == pVar.f113276b) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends UrlModel> list, boolean z, String str) {
        super(true);
        this.f113275a = list;
        this.f113276b = z;
        this.f113277c = str;
        ((MusNotice) this).type = 50;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        this.createTime = 9223372036854775806L;
    }
}
