package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import androidx.f.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import f.a.aa;
import javax.a.a;

public final class f implements b<GiphyViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a> f100752a;

    /* renamed from: b  reason: collision with root package name */
    private final a<GiphyAnalytics> f100753b;

    /* renamed from: c  reason: collision with root package name */
    private final a<GiphyViewModel.a> f100754c;

    /* renamed from: d  reason: collision with root package name */
    private final a<aa> f100755d;

    static {
        Covode.recordClassIndex(64462);
    }

    /* Return type fixed from 'androidx.lifecycle.ac' to match base method */
    @Override // androidx.f.a.b
    public final /* synthetic */ GiphyViewModel a() {
        return new GiphyViewModel(this.f100752a.get(), this.f100753b.get(), this.f100754c.get(), this.f100755d.get());
    }

    f(a<com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a> aVar, a<GiphyAnalytics> aVar2, a<GiphyViewModel.a> aVar3, a<aa> aVar4) {
        this.f100752a = aVar;
        this.f100753b = aVar2;
        this.f100754c = aVar3;
        this.f100755d = aVar4;
    }
}
