package com.ss.android.ugc.aweme.video.hashtag;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public AVChallenge f143397a;

    /* renamed from: b  reason: collision with root package name */
    public int f143398b;

    /* renamed from: c  reason: collision with root package name */
    public int f143399c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f143400d;

    /* renamed from: e  reason: collision with root package name */
    public a f143401e;

    /* renamed from: f  reason: collision with root package name */
    public String f143402f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f143403g;

    public interface a {
        static {
            Covode.recordClassIndex(93846);
        }

        void a(Context context, int i2);

        void b(Context context, int i2);
    }

    static {
        Covode.recordClassIndex(93845);
    }

    public static b a(g gVar, boolean z) {
        b bVar = new b();
        bVar.f143402f = "search";
        if (z) {
            bVar.f143398b = 3;
        } else {
            bVar.f143398b = 2;
        }
        bVar.f143397a = gVar.f128515a;
        bVar.f143403g = gVar.f128517c;
        return bVar;
    }
}
