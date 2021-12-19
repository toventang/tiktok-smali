package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import org.json.JSONObject;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f94768a;

    /* renamed from: b  reason: collision with root package name */
    protected String f94769b;

    /* renamed from: c  reason: collision with root package name */
    protected JSONObject f94770c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f94771d;

    /* renamed from: e  reason: collision with root package name */
    protected int f94772e;

    /* renamed from: f  reason: collision with root package name */
    protected DataCenter f94773f;

    /* renamed from: g  reason: collision with root package name */
    protected final Context f94774g;

    /* renamed from: h  reason: collision with root package name */
    public final View f94775h;

    /* renamed from: i  reason: collision with root package name */
    protected String f94776i = "click";

    /* renamed from: j  reason: collision with root package name */
    protected Fragment f94777j;

    /* renamed from: k  reason: collision with root package name */
    protected int f94778k;

    static {
        Covode.recordClassIndex(60127);
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(View view);

    /* access modifiers changed from: protected */
    public abstract void a(DataCenter dataCenter);

    public void b() {
    }

    public final void b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f94773f = dataCenter;
            a(dataCenter);
        }
    }

    public g(View view) {
        this.f94774g = view.getContext();
        this.f94775h = view;
        a(view);
    }

    public void a(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f94768a = videoItemParams.mAweme;
            this.f94772e = videoItemParams.mPageType;
            this.f94769b = videoItemParams.mEventType;
            this.f94770c = videoItemParams.mRequestId;
            this.f94771d = videoItemParams.isMyProfile;
            this.f94776i = videoItemParams.mEnterMethodValue;
            this.f94777j = videoItemParams.fragment;
            this.f94778k = videoItemParams.mAwemeFromPage;
        }
    }
}
