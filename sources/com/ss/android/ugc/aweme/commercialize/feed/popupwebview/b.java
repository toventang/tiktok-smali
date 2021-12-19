package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f74372a;

    /* renamed from: b  reason: collision with root package name */
    public final AwemeRawAd f74373b;

    /* renamed from: c  reason: collision with root package name */
    public final int f74374c;

    /* renamed from: d  reason: collision with root package name */
    public final int f74375d;

    /* renamed from: e  reason: collision with root package name */
    public final String f74376e;

    /* renamed from: f  reason: collision with root package name */
    public final String f74377f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f74378g;

    /* renamed from: h  reason: collision with root package name */
    public final String f74379h;

    /* renamed from: i  reason: collision with root package name */
    public final Aweme f74380i;

    /* renamed from: j  reason: collision with root package name */
    public final AnchorLynxModel f74381j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f74382k;

    static {
        Covode.recordClassIndex(45885);
    }

    public b(Context context, AwemeRawAd awemeRawAd, int i2, int i3, String str, String str2, boolean z, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel, byte b2) {
        this(context, awemeRawAd, i2, i3, str, str2, z, str3, aweme, anchorLynxModel);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f74383a;

        /* renamed from: b  reason: collision with root package name */
        public AwemeRawAd f74384b;

        /* renamed from: c  reason: collision with root package name */
        public int f74385c = 2;

        /* renamed from: d  reason: collision with root package name */
        public int f74386d;

        /* renamed from: e  reason: collision with root package name */
        public String f74387e;

        /* renamed from: f  reason: collision with root package name */
        public String f74388f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f74389g;

        /* renamed from: h  reason: collision with root package name */
        public String f74390h = "";

        /* renamed from: i  reason: collision with root package name */
        public Aweme f74391i;

        /* renamed from: j  reason: collision with root package name */
        public AnchorLynxModel f74392j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f74393k;

        static {
            Covode.recordClassIndex(45886);
        }

        public final b a() {
            return new b(this.f74383a, this.f74384b, this.f74385c, this.f74386d, this.f74387e, this.f74388f, this.f74389g, this.f74390h, this.f74391i, this.f74392j, this.f74393k);
        }

        public final a a(int i2) {
            this.f74385c = i2;
            return this;
        }

        public final a b(int i2) {
            this.f74386d = i2;
            return this;
        }

        public final a a(Context context) {
            this.f74383a = context;
            return this;
        }

        public final a c(String str) {
            if (str == null) {
                str = "";
            }
            this.f74390h = str;
            return this;
        }

        public final a a(Aweme aweme) {
            this.f74391i = aweme;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f74388f = str;
            return this;
        }

        public final a a(AwemeRawAd awemeRawAd) {
            this.f74384b = awemeRawAd;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f74387e = str;
            return this;
        }

        public final a a(boolean z) {
            this.f74393k = z;
            return this;
        }
    }

    private /* synthetic */ b(Context context, AwemeRawAd awemeRawAd, int i2, int i3, String str, String str2, boolean z, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel) {
        this(context, awemeRawAd, i2, i3, str, str2, z, str3, aweme, anchorLynxModel, false);
    }

    public b(Context context, AwemeRawAd awemeRawAd, int i2, int i3, String str, String str2, boolean z, String str3, Aweme aweme, AnchorLynxModel anchorLynxModel, boolean z2) {
        this.f74372a = context;
        this.f74373b = awemeRawAd;
        this.f74374c = i2;
        this.f74375d = i3;
        this.f74376e = str;
        this.f74377f = str2;
        this.f74378g = z;
        this.f74379h = str3;
        this.f74380i = aweme;
        this.f74381j = anchorLynxModel;
        this.f74382k = z2;
    }
}
