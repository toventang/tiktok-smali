package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f138035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f138036b = null;

    /* renamed from: c  reason: collision with root package name */
    public final String f138037c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Aweme f138038d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f138039e;

    /* renamed from: f  reason: collision with root package name */
    public String f138040f;

    /* renamed from: g  reason: collision with root package name */
    public String[] f138041g;

    /* renamed from: h  reason: collision with root package name */
    public CreateAwemeResponse.a f138042h;

    static {
        Covode.recordClassIndex(90269);
    }

    public final String toString() {
        return "state:" + this.f138035a + "  materialId:" + this.f138036b + " videoPath:" + this.f138037c;
    }

    public b(int i2, Aweme aweme) {
        this.f138035a = i2;
        this.f138038d = aweme;
    }
}
