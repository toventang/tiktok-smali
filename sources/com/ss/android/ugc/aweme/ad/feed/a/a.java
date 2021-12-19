package com.ss.android.ugc.aweme.ad.feed.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;

public final class a extends b {

    /* renamed from: d  reason: collision with root package name */
    private long f65739d = -1;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f65740e;

    static {
        Covode.recordClassIndex(40450);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final long a() {
        return this.f65739d;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final void b() {
        this.f65739d = -1;
        this.f65740e = false;
        l.d("reset", "");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final void a(boolean z) {
        this.f65740e = z;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final boolean a(Aweme aweme) {
        if (!b.a.a(aweme) || this.f65739d < 0 || !this.f65740e) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final void a(Aweme aweme, boolean z) {
        String aid;
        String str;
        long n;
        if (b.a.a(aweme)) {
            String str2 = null;
            if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                i O = v.O();
                l.b(O, "");
                VideoUrlModel q = O.q();
                if (q != null) {
                    str2 = q.getSourceId();
                }
                if (l.a((Object) str, (Object) str2)) {
                    if (z) {
                        n = 0;
                    } else {
                        i O2 = v.O();
                        l.b(O2, "");
                        n = O2.n();
                    }
                    this.f65739d = n;
                    l.d("savePausePosition, mPausePositon:" + this.f65739d, "");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.a.b
    public final boolean a(Aweme aweme, int i2) {
        boolean z;
        if (!b.a.a(aweme)) {
            return false;
        }
        i O = v.O();
        if (aweme != null) {
            l.b(O, "");
            if (O.q() != null && i2 <= 0) {
                String aid = aweme.getAid();
                VideoUrlModel q = O.q();
                l.b(q, "");
                boolean z2 = !TextUtils.equals(aid, q.getSourceId());
                if (b.f65741a || b.f65742b) {
                    String aid2 = aweme.getAid();
                    VideoUrlModel q2 = O.q();
                    l.b(q2, "");
                    if (TextUtils.equals(aid2, q2.getSourceId())) {
                        z = true;
                        if (!z2 || z) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (!z2) {
                }
                return true;
            }
        }
        return false;
    }
}
