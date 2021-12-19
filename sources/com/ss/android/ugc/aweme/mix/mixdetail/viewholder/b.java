package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public String f110063a;

    /* renamed from: b  reason: collision with root package name */
    public UrlModel f110064b;

    /* renamed from: c  reason: collision with root package name */
    public String f110065c;

    /* renamed from: d  reason: collision with root package name */
    public String f110066d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f110067e;

    static {
        Covode.recordClassIndex(70612);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f110067e, ((b) obj).f110067e);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f110067e;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MixFeedItem(aweme=" + this.f110067e + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public b(Aweme aweme) {
        UrlModel urlModel;
        l.d(aweme, "");
        this.f110067e = aweme;
        String aid = aweme.getAid();
        l.b(aid, "");
        this.f110063a = aid;
        Video video = this.f110067e.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        this.f110064b = urlModel;
        this.f110065c = this.f110067e.getDesc();
        AwemeStatistics statistics = this.f110067e.getStatistics();
        l.b(statistics, "");
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(statistics.getPlayCount());
        l.b(a2, "");
        this.f110066d = a2;
    }
}
