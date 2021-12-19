package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f143261a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<v> f143262b;

    static {
        Covode.recordClassIndex(93769);
    }

    public static void a(v vVar) {
        f143262b = new WeakReference<>(vVar);
    }

    public static void a(Video video) {
        if (video != null && video.getPlayAddr() != null) {
            f143261a = video.getPlayAddr().getSourceId();
        }
    }
}
