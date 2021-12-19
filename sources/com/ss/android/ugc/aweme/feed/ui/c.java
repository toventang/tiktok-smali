package com.ss.android.ugc.aweme.feed.ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDuetWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoMoreWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoReportWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoSharerInfoWidget;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f94458a = new c();

    private c() {
    }

    public static Widget a() {
        return new VideoShareWidget();
    }

    public static Widget b() {
        return new VideoMoreWidget();
    }

    public static Widget c() {
        return new VideoReportWidget();
    }

    public static Widget d() {
        return new VideoAntiAddictionWidget();
    }

    public static Widget e() {
        return new VideoMusicTitleWidget();
    }

    public static Widget f() {
        return new VideoMusicCoverWidget();
    }

    public static Widget g() {
        return new VideoProgressBarWidget();
    }

    public static Widget h() {
        return new VideoCommentWidget();
    }

    public static Widget i() {
        return new VideoSharerInfoWidget();
    }

    public static Widget j() {
        return new FeedAvatarWidget();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements VideoDiggWidget.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f94459a;

        static {
            Covode.recordClassIndex(59985);
        }

        a(h.f.a.a aVar) {
            this.f94459a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.a
        public final long a() {
            return ((Number) this.f94459a.invoke()).longValue();
        }
    }

    static {
        Covode.recordClassIndex(59984);
    }

    public static Widget a(Bundle bundle) {
        l.d(bundle, "");
        return new VideoDuetWidget(bundle);
    }

    public static Widget a(Bundle bundle, h.f.a.a<Long> aVar) {
        l.d(bundle, "");
        l.d(aVar, "");
        return new VideoDiggWidget(bundle, new a(aVar));
    }

    public static Widget a(View.OnTouchListener onTouchListener, String str) {
        return new VideoAuthorInfoWidget(onTouchListener, str);
    }
}
