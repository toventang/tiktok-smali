package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class e implements c<GiphyViewModel.a> {

    /* renamed from: a  reason: collision with root package name */
    private final a<a.d> f100751a;

    static {
        Covode.recordClassIndex(64461);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a(this.f100751a.get());
    }

    public static GiphyViewModel.a a(a.d dVar) {
        return (GiphyViewModel.a) f.a(d.a(dVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
