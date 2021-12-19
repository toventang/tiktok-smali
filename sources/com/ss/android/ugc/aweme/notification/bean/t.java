package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.f.b.l;
import java.util.Objects;

public final class t extends MusNotice {

    /* renamed from: g  reason: collision with root package name */
    public static final a f113291g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f113292a;

    /* renamed from: b  reason: collision with root package name */
    public final String f113293b;

    /* renamed from: c  reason: collision with root package name */
    public final String f113294c;

    /* renamed from: d  reason: collision with root package name */
    public final String f113295d;

    /* renamed from: e  reason: collision with root package name */
    public final String f113296e;

    /* renamed from: f  reason: collision with root package name */
    public final String f113297f;

    static {
        Covode.recordClassIndex(72833);
    }

    public final String toString() {
        return "TutorialVideoNotice(msgId=" + this.f113292a + ", icon=" + this.f113293b + ", title=" + this.f113294c + ", desc=" + this.f113295d + ", button=" + this.f113296e + ", deepLink=" + this.f113297f + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72834);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t a(TutorialVideoInfo tutorialVideoInfo) {
            l.d(tutorialVideoInfo, "");
            return new t(tutorialVideoInfo.getMsgId(), tutorialVideoInfo.getIcon(), tutorialVideoInfo.getTitle(), tutorialVideoInfo.getDesc(), tutorialVideoInfo.getButton(), tutorialVideoInfo.getDeepLink());
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f113292a, this.f113293b, this.f113294c, this.f113295d, this.f113296e, this.f113297f);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.type != tVar.type || !l.a((Object) this.f113292a, (Object) tVar.f113292a) || !l.a((Object) this.f113293b, (Object) tVar.f113293b) || !l.a((Object) this.f113294c, (Object) tVar.f113294c) || !l.a((Object) this.f113295d, (Object) tVar.f113295d) || !l.a((Object) this.f113296e, (Object) tVar.f113296e) || !l.a((Object) this.f113297f, (Object) tVar.f113297f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(String str, String str2, String str3, String str4, String str5, String str6) {
        super(true);
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.f113292a = str;
        this.f113293b = str2;
        this.f113294c = str3;
        this.f113295d = str4;
        this.f113296e = str5;
        this.f113297f = str6;
        ((MusNotice) this).type = 1000;
        ((MusNotice) this).nid = String.valueOf(hashCode());
    }
}
