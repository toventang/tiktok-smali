package com.bytedance.android;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.b.a.b;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public class a implements b {
    static {
        Covode.recordClassIndex(3173);
    }

    @Override // com.bytedance.android.b.a.b
    public Fragment createDrawerFeedFragment(com.bytedance.android.livesdkapi.g.b bVar) {
        return null;
    }

    public Fragment createLiveFeedFragment() {
        return null;
    }

    @Override // com.bytedance.android.b.a.b
    public void delayInit() {
    }

    @Override // com.bytedance.android.b.a.b
    public n getStartLiveRoomInterceptor() {
        return null;
    }

    public String getTopLiveTitle(Context context) {
        return "";
    }

    @Override // com.bytedance.android.b.a.b
    public void init() {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.b.a.b
    public void preloadInboxTopLivesFeedAction(int i2) {
    }

    @Override // com.bytedance.android.b.a.b
    public void requestTabListForyouPage() {
    }

    @Override // com.bytedance.android.b.a.b
    public Map<String, Object> getFeedTab(long j2) {
        return new LinkedHashMap();
    }

    @Override // com.bytedance.android.b.a.b
    public Map<String, Object> getFeedTabForyouPage(long j2) {
        return new LinkedHashMap();
    }
}
