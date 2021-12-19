package com.ss.android.ugc.trill.share.base;

import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.share.m.e;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C4057a f150612f = new C4057a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UrlModel f150613a;

    /* renamed from: b  reason: collision with root package name */
    public String f150614b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150615c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f150616d;

    /* renamed from: e  reason: collision with root package name */
    public String f150617e;

    static {
        Covode.recordClassIndex(99050);
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$a  reason: collision with other inner class name */
    public static final class C4057a {
        static {
            Covode.recordClassIndex(99051);
        }

        private C4057a() {
        }

        public /* synthetic */ C4057a(byte b2) {
            this();
        }
    }

    private final void a(Aweme aweme) {
        String str;
        String str2 = this.f150617e;
        String str3 = null;
        if (str2 != null) {
            Locale locale = Locale.US;
            l.b(locale, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            str = str2.toLowerCase(locale);
            l.b(str, "");
        } else {
            str = null;
        }
        VideoUrlModel a2 = e.a(aweme, str);
        this.f150613a = a2;
        if (a2 == null) {
            VideoUrlModel a3 = e.a(aweme);
            this.f150613a = a3;
            if (a3 == null) {
                if (this.f150616d) {
                    a(aweme, false);
                    this.f150615c = this.f150616d;
                } else {
                    Video video = aweme.getVideo();
                    l.b(video, "");
                    this.f150613a = video.getDownloadAddr();
                }
            }
        }
        UrlModel urlModel = this.f150613a;
        if (urlModel != null) {
            str3 = urlModel.getUri();
        }
        this.f150614b = d.b(str3);
    }

    private final void a(Aweme aweme, boolean z) {
        Video video = aweme.getVideo();
        l.b(video, "");
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        this.f150613a = playAddrH264;
        if (playAddrH264 != null) {
            String b2 = in.b(aweme.getAuthor());
            String str = null;
            if (z) {
                this.f150615c = false;
                StringBuilder sb = new StringBuilder();
                UrlModel urlModel = this.f150613a;
                if (urlModel != null) {
                    str = urlModel.getUri();
                }
                this.f150614b = d.b(sb.append(str).append(b2).append("tag_no_water").toString());
                return;
            }
            UrlModel urlModel2 = this.f150613a;
            if (urlModel2 != null) {
                str = urlModel2.getUri();
            }
            this.f150614b = d.b(l.a(str, (Object) b2));
        }
    }

    private final void a(Aweme aweme, boolean z, boolean z2) {
        if (z || com.ss.android.ugc.aweme.feed.share.a.a.b(aweme) || z2) {
            a(aweme, z2);
        } else {
            a(aweme);
        }
    }

    public final void a(Aweme aweme, boolean z, boolean z2, boolean z3, ACLCommonShare aCLCommonShare, boolean z4) {
        l.d(aweme, "");
        this.f150615c = z;
        this.f150616d = z2;
        if (z3) {
            l.d(aweme, "");
            if (aCLCommonShare == null) {
                a(aweme, z, z4);
            } else if (z || z4) {
                a(aweme, z4);
            } else {
                a(aweme);
            }
        } else {
            a(aweme, z, z4);
        }
    }
}
