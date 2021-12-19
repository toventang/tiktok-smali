package com.ss.android.ugc.aweme.feed.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.helper.c;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.sticker.k.d;
import h.f.b.l;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f91455a;

    /* renamed from: b  reason: collision with root package name */
    private final Video f91456b;

    /* renamed from: c  reason: collision with root package name */
    private final c f91457c;

    /* renamed from: d  reason: collision with root package name */
    private final OcrLocation f91458d;

    static {
        Covode.recordClassIndex(57546);
    }

    @Override // com.ss.android.ugc.aweme.sticker.k.d
    public final d.a a() {
        Video video = this.f91456b;
        if (video == null) {
            return new d.a(0, 0);
        }
        d.a a2 = this.f91457c.a(this.f91455a, video);
        l.b(a2, "");
        return a2;
    }

    public a(Context context, Video video, c cVar, OcrLocation ocrLocation) {
        l.d(context, "");
        l.d(cVar, "");
        this.f91455a = context;
        this.f91456b = video;
        this.f91457c = cVar;
        this.f91458d = ocrLocation;
    }
}
