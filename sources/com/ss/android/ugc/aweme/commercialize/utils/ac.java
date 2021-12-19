package com.ss.android.ugc.aweme.commercialize.utils;

import android.os.Bundle;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public final String f75546a;

    /* renamed from: b  reason: collision with root package name */
    public final m f75547b;

    /* renamed from: c  reason: collision with root package name */
    public final int f75548c;

    /* renamed from: d  reason: collision with root package name */
    public final String f75549d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f75550e;

    /* renamed from: f  reason: collision with root package name */
    public final AwemeRawAd f75551f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f75552g;

    /* renamed from: h  reason: collision with root package name */
    public final AnchorLynxModel f75553h;

    static {
        Covode.recordClassIndex(46607);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f75554a = "about:blank";

        /* renamed from: b  reason: collision with root package name */
        public int f75555b;

        /* renamed from: c  reason: collision with root package name */
        public String f75556c = "";

        /* renamed from: d  reason: collision with root package name */
        public Bundle f75557d;

        /* renamed from: e  reason: collision with root package name */
        public AwemeRawAd f75558e;

        /* renamed from: f  reason: collision with root package name */
        public m f75559f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f75560g;

        /* renamed from: h  reason: collision with root package name */
        public AnchorLynxModel f75561h;

        static {
            Covode.recordClassIndex(46608);
        }

        public final ac a() {
            return new ac(this.f75554a, this.f75559f, this.f75555b, this.f75556c, this.f75557d, this.f75558e, this.f75560g, this.f75561h);
        }

        public final a a(int i2) {
            this.f75555b = i2;
            return this;
        }

        public final a a(m mVar) {
            this.f75559f = mVar;
            return this;
        }

        public final a a(Bundle bundle) {
            l.d(bundle, "");
            this.f75557d = bundle;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f75556c = str;
            return this;
        }

        public final a a(AnchorLynxModel anchorLynxModel) {
            this.f75561h = anchorLynxModel;
            return this;
        }

        public final a a(AwemeRawAd awemeRawAd) {
            this.f75558e = awemeRawAd;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f75554a = str;
            return this;
        }
    }

    public ac(String str, m mVar, int i2, String str2, Bundle bundle, AwemeRawAd awemeRawAd, boolean z, AnchorLynxModel anchorLynxModel) {
        l.d(str, "");
        l.d(str2, "");
        this.f75546a = str;
        this.f75547b = mVar;
        this.f75548c = i2;
        this.f75549d = str2;
        this.f75550e = bundle;
        this.f75551f = awemeRawAd;
        this.f75552g = z;
        this.f75553h = anchorLynxModel;
    }
}
