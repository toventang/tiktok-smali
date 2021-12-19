package com.ss.android.ugc.aweme.crossplatform.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;
import com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.ss.android.ugc.aweme.crossplatform.d.a.b;
import com.zhiliaoapp.musically.R;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    public MixActivityContainer f78546a;

    /* renamed from: b  reason: collision with root package name */
    private a f78547b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f78548c;

    static {
        Covode.recordClassIndex(48780);
    }

    public final void a(Runnable runnable) {
        this.f78548c = runnable;
        MixActivityContainer mixActivityContainer = this.f78546a;
        if (mixActivityContainer != null) {
            mixActivityContainer.f78510f = runnable;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.putBoolean("webview_progress_bar", com.ss.android.ugc.aweme.crossplatform.a.a.a(arguments));
        a a2 = b.C1830b.a(arguments);
        this.f78547b = a2;
        IMixActivityContainerProvider a3 = MixActivityContainerProvider.a();
        if (a3 != null) {
            this.f78546a = a3.a(getActivity(), a2);
        }
        if (this.f78546a == null) {
            this.f78546a = new MixActivityContainer(getActivity(), a2);
        }
        this.f78546a.f78507c = getArguments();
        this.f78546a.f78510f = this.f78548c;
        getLifecycle().a(this.f78546a);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f78546a.k();
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.v1, viewGroup, false);
    }
}
