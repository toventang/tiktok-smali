package com.bytedance.android.livesdk.feed.viewmodel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.feed.e;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.i;
import com.bytedance.android.livesdk.feed.l;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.q;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.other.LiveSquareInboxRefreshIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

public class TabFeedViewModel extends BaseFeedDataViewModel {
    public h.a A;
    public boolean B;
    public String C;
    public boolean D;
    private long F;
    private q G;
    private boolean H;
    private long I = -1;
    protected m w;
    public int x;
    public int y;
    public e z;

    static {
        Covode.recordClassIndex(9823);
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final boolean g() {
        e();
        return false;
    }

    private void i() {
        if (this.D && this.f17697a != null) {
            this.f17697a.c();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final void c() {
        if (this.H && !this.D) {
            super.c();
            this.D = true;
        }
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.RxViewModel, androidx.lifecycle.ac
    public void onCleared() {
        this.f17697a.d().b(this.z);
        this.f17697a.d().b(this.A);
        this.z = null;
        super.onCleared();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final FeedDataKey f() {
        if (TextUtils.isEmpty(this.t) && this.w.a(this.F) != null) {
            this.t = this.w.a(this.F).getEvent();
        }
        if (TextUtils.isEmpty(this.t)) {
            this.t = "video";
        }
        return FeedDataKey.a(this.t, d(), this.F);
    }

    public final boolean h() {
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (this.I == -1) {
                this.I = SystemClock.elapsedRealtime();
                return false;
            } else if (SystemClock.elapsedRealtime() - this.I > ((long) (LiveSquareInboxRefreshIntervalSetting.INSTANCE.getValue() * 1000))) {
                this.f17697a.g();
                this.I = SystemClock.elapsedRealtime();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel
    public final String d() {
        if (!com.bytedance.common.utility.m.a(this.q) || this.w.a(this.F) == null) {
            this.q = c(this.q);
            return this.q;
        }
        String url = this.w.a(this.F).getUrl();
        if (d.a() != null) {
            if (com.bytedance.common.utility.m.a("referral_task", d.a().b())) {
                url = a(url, "channel_id", LiveFeedDraw.getChannelId("referral_task", "H5"));
            }
            if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                url = a(url, "channel_id", "96");
            }
        }
        return c(url);
    }

    public final void a(boolean z2) {
        this.H = z2;
        if (!z2) {
            i();
        } else {
            h();
        }
        c();
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/webcast/feed/")) {
            return str;
        }
        if (f.f23137c == null) {
            f.f23137c = Boolean.valueOf(((IHostContext) a.a(IHostContext.class)).isOffline());
        }
        if (!f.f23137c.booleanValue() || str.contains("&debug=true")) {
            return str;
        }
        return str + "&debug=true";
    }

    public static String a(String str, String str2, String str3) {
        if (com.bytedance.common.utility.m.a(str) || com.bytedance.common.utility.m.a(str3)) {
            return str;
        }
        return str.replaceAll("&" + str2 + "=[^&]*", "&" + str2 + "=" + str3);
    }

    public TabFeedViewModel(l lVar, i iVar, m mVar, com.bytedance.android.livesdk.feed.g.a aVar, q qVar, long j2) {
        super(lVar, iVar, aVar);
        this.w = mVar;
        this.F = j2;
        this.G = qVar;
    }
}
