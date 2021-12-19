package com.ss.android.ugc.aweme.feed.assem.base;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import org.json.JSONObject;

public abstract class FeedBaseViewModel<S extends j> extends AssemViewModelWithItem<S, VideoItemParams> implements com.bytedance.ext_power_list.j<S, VideoItemParams> {

    /* renamed from: k  reason: collision with root package name */
    private final boolean f92075k = true;
    public int o;
    public String p;
    public JSONObject q;
    public boolean r;
    public String s;
    public Fragment t;
    public int u;

    static {
        Covode.recordClassIndex(58042);
    }

    public S a(S s2, VideoItemParams videoItemParams) {
        l.d(s2, "");
        l.d(videoItemParams, "");
        return s2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bL_() {
        return this.f92075k;
    }

    /* renamed from: b */
    public final S a(S s2, VideoItemParams videoItemParams) {
        l.d(s2, "");
        l.d(videoItemParams, "");
        if (videoItemParams != null) {
            this.o = videoItemParams.mPageType;
            this.p = videoItemParams.mEventType;
            this.q = videoItemParams.mRequestId;
            this.r = videoItemParams.isMyProfile;
            this.s = videoItemParams.mEnterMethodValue;
            this.t = videoItemParams.fragment;
            this.u = videoItemParams.mAwemeFromPage;
        }
        return a((j) s2, videoItemParams);
    }
}
