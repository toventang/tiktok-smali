package com.ss.android.ugc.aweme.share.gif.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoShare2GifEditActivity.AnonymousClass1 f123546a;

    /* renamed from: b  reason: collision with root package name */
    private final AsyncAVService f123547b;

    static {
        Covode.recordClassIndex(81106);
    }

    f(VideoShare2GifEditActivity.AnonymousClass1 r1, AsyncAVService asyncAVService) {
        this.f123546a = r1;
        this.f123547b = asyncAVService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoShare2GifEditActivity.AnonymousClass1 r3 = this.f123546a;
        VideoShare2GifEditActivity.this.getSupportFragmentManager().a().a(R.id.b4y, this.f123547b.uiService().abilityUiService().video2GifFragment(VideoShare2GifEditActivity.this.f123532b)).e();
        return null;
    }
}
