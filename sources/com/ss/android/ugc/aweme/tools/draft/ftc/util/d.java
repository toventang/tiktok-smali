package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(91312);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f139666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f139667c;

        static {
            Covode.recordClassIndex(91313);
        }

        a(d dVar, float f2, VideoPublishEditModel videoPublishEditModel) {
            this.f139665a = dVar;
            this.f139666b = f2;
            this.f139667c = videoPublishEditModel;
        }

        public final void run() {
            if (this.f139666b <= 100.0f && c.f139654c) {
                d.a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b.a(2, this.f139667c, (int) this.f139666b));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f139669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f139670c;

        static {
            Covode.recordClassIndex(91314);
        }

        b(d dVar, Activity activity, VideoPublishEditModel videoPublishEditModel) {
            this.f139668a = dVar;
            this.f139669b = activity;
            this.f139670c = videoPublishEditModel;
        }

        public final void run() {
            if (c.f139655d) {
                new com.bytedance.tux.g.b(this.f139669b).a().b(R.raw.icon_tick_fill_small).d(R.attr.aw).e(R.string.cti).b();
            } else {
                d.a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b.a(4, this.f139670c, 0));
            }
            c.f139654c = false;
        }
    }

    public static void a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b bVar) {
        c.a(new b(bVar));
    }

    public static void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b.a(1, videoPublishEditModel, 0));
        c.f139654c = true;
    }

    public static void b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        c.f139654c = false;
        a(com.ss.android.ugc.aweme.tools.draft.ftc.pages.b.a(5, videoPublishEditModel, 0));
    }

    public final void a(Activity activity, VideoPublishEditModel videoPublishEditModel, float f2) {
        l.d(activity, "");
        l.d(videoPublishEditModel, "");
        new Handler().post(new a(this, f2, videoPublishEditModel));
    }
}
