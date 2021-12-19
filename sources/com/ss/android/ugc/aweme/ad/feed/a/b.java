package com.ss.android.ugc.aweme.ad.feed.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f65741a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f65742b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f65743c = new a((byte) 0);

    static {
        Covode.recordClassIndex(40451);
    }

    public abstract long a();

    public abstract void a(Aweme aweme, boolean z);

    public abstract void a(boolean z);

    public abstract boolean a(Aweme aweme);

    public abstract boolean a(Aweme aweme, int i2);

    public abstract void b();

    public static final class a {
        static {
            Covode.recordClassIndex(40452);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Aweme aweme) {
            AwemeRawAd awemeRawAd;
            if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isEnableVideoResume()) {
                return false;
            }
            return true;
        }
    }
}
