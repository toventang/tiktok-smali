package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.util.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public long f75781a;

    /* renamed from: b  reason: collision with root package name */
    public String f75782b;

    /* renamed from: c  reason: collision with root package name */
    public long f75783c;

    /* renamed from: d  reason: collision with root package name */
    public String f75784d;

    /* renamed from: e  reason: collision with root package name */
    public String f75785e;

    /* renamed from: f  reason: collision with root package name */
    public String f75786f;

    /* renamed from: g  reason: collision with root package name */
    public String f75787g;

    /* renamed from: h  reason: collision with root package name */
    public String f75788h;

    /* renamed from: i  reason: collision with root package name */
    public String f75789i;

    /* renamed from: j  reason: collision with root package name */
    public String f75790j;

    /* renamed from: k  reason: collision with root package name */
    public int f75791k;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f75792l;

    /* renamed from: m  reason: collision with root package name */
    public Aweme f75793m;

    static {
        Covode.recordClassIndex(46740);
    }

    public static final class a extends f<k> {
        static {
            Covode.recordClassIndex(46741);
        }

        public a() {
            super(new k((byte) 0));
        }

        public final a a(Aweme aweme) {
            a(new C1727a(aweme));
            return this;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k$a$a  reason: collision with other inner class name */
        static final class C1727a extends m implements b<k, z> {
            final /* synthetic */ Aweme $aweme$inlined;

            static {
                Covode.recordClassIndex(46742);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1727a(Aweme aweme) {
                super(1);
                this.$aweme$inlined = aweme;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(k kVar) {
                long j2;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                int i2;
                AwemeRawAd awemeRawAd;
                UrlModel clickTrackUrlList;
                AwemeRawAd awemeRawAd2;
                AwemeRawAd awemeRawAd3;
                AwemeRawAd awemeRawAd4;
                AwemeRawAd awemeRawAd5;
                AwemeRawAd awemeRawAd6;
                AwemeRawAd awemeRawAd7;
                AwemeRawAd awemeRawAd8;
                AwemeRawAd awemeRawAd9;
                AwemeRawAd awemeRawAd10;
                Long groupId;
                AwemeRawAd awemeRawAd11;
                AwemeRawAd awemeRawAd12;
                Long creativeId;
                k kVar2 = kVar;
                l.d(kVar2, "");
                kVar2.f75793m = this.$aweme$inlined;
                Aweme aweme = this.$aweme$inlined;
                long j3 = 0;
                if (aweme == null || (awemeRawAd12 = aweme.getAwemeRawAd()) == null || (creativeId = awemeRawAd12.getCreativeId()) == null) {
                    j2 = 0;
                } else {
                    j2 = creativeId.longValue();
                }
                kVar2.f75781a = j2;
                Aweme aweme2 = this.$aweme$inlined;
                List<String> list = null;
                if (aweme2 == null || (awemeRawAd11 = aweme2.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd11.getLogExtra();
                }
                kVar2.f75782b = str;
                Aweme aweme3 = this.$aweme$inlined;
                if (!(aweme3 == null || (awemeRawAd10 = aweme3.getAwemeRawAd()) == null || (groupId = awemeRawAd10.getGroupId()) == null)) {
                    j3 = groupId.longValue();
                }
                kVar2.f75783c = j3;
                Aweme aweme4 = this.$aweme$inlined;
                if (aweme4 == null || (awemeRawAd9 = aweme4.getAwemeRawAd()) == null) {
                    str2 = null;
                } else {
                    str2 = awemeRawAd9.getOpenUrl();
                }
                kVar2.f75784d = str2;
                Aweme aweme5 = this.$aweme$inlined;
                if (aweme5 == null || (awemeRawAd8 = aweme5.getAwemeRawAd()) == null) {
                    str3 = null;
                } else {
                    str3 = awemeRawAd8.getWebUrl();
                }
                kVar2.f75785e = str3;
                Aweme aweme6 = this.$aweme$inlined;
                if (aweme6 == null || (awemeRawAd7 = aweme6.getAwemeRawAd()) == null) {
                    str4 = null;
                } else {
                    str4 = awemeRawAd7.getWebTitle();
                }
                kVar2.f75786f = str4;
                Aweme aweme7 = this.$aweme$inlined;
                if (aweme7 == null || (awemeRawAd6 = aweme7.getAwemeRawAd()) == null) {
                    str5 = null;
                } else {
                    str5 = awemeRawAd6.getDownloadUrl();
                }
                kVar2.f75787g = str5;
                Aweme aweme8 = this.$aweme$inlined;
                if (aweme8 == null || (awemeRawAd5 = aweme8.getAwemeRawAd()) == null) {
                    str6 = null;
                } else {
                    str6 = awemeRawAd5.getPackageName();
                }
                kVar2.f75788h = str6;
                Aweme aweme9 = this.$aweme$inlined;
                if (aweme9 == null || (awemeRawAd4 = aweme9.getAwemeRawAd()) == null) {
                    str7 = null;
                } else {
                    str7 = awemeRawAd4.getAppName();
                }
                kVar2.f75789i = str7;
                Aweme aweme10 = this.$aweme$inlined;
                if (aweme10 == null || (awemeRawAd3 = aweme10.getAwemeRawAd()) == null) {
                    str8 = null;
                } else {
                    str8 = awemeRawAd3.getType();
                }
                kVar2.f75790j = str8;
                Aweme aweme11 = this.$aweme$inlined;
                if (aweme11 == null || (awemeRawAd2 = aweme11.getAwemeRawAd()) == null) {
                    i2 = 0;
                } else {
                    i2 = awemeRawAd2.getSystemOrigin();
                }
                kVar2.f75791k = i2;
                Aweme aweme12 = this.$aweme$inlined;
                if (!(aweme12 == null || (awemeRawAd = aweme12.getAwemeRawAd()) == null || (clickTrackUrlList = awemeRawAd.getClickTrackUrlList()) == null)) {
                    list = clickTrackUrlList.getUrlList();
                }
                kVar2.f75792l = list;
                return z.f158842a;
            }
        }
    }

    private k() {
        this.f75781a = 0;
        this.f75782b = null;
        this.f75783c = 0;
        this.f75784d = null;
        this.f75785e = null;
        this.f75786f = null;
        this.f75787g = null;
        this.f75788h = null;
        this.f75789i = null;
        this.f75790j = null;
        this.f75791k = 0;
        this.f75792l = null;
        this.f75793m = null;
    }

    /* synthetic */ k(byte b2) {
        this();
    }
}
