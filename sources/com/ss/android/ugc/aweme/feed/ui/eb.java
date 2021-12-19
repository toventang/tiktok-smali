package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;

public final class eb extends g {

    /* renamed from: l  reason: collision with root package name */
    private View f94680l;

    /* renamed from: m  reason: collision with root package name */
    private TuxIconView f94681m;
    private TextView n;
    private TuxIconView o;

    static {
        Covode.recordClassIndex(60083);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(DataCenter dataCenter) {
    }

    public eb(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(View view) {
        MethodCollector.i(7330);
        if (view instanceof FrameLayout) {
            View a2 = c.a((Activity) this.f94774g, (int) R.layout.tq);
            this.f94680l = a2;
            this.f94681m = (TuxIconView) a2.findViewById(R.id.fh5);
            this.n = (TextView) this.f94680l.findViewById(R.id.fh6);
            this.o = (TuxIconView) this.f94680l.findViewById(R.id.fh4);
            ((FrameLayout) view).addView(this.f94680l);
        }
        MethodCollector.o(7330);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(VideoItemParams videoItemParams) {
        String str;
        super.a(videoItemParams);
        if (this.f94768a == null) {
            o.a(this.f94680l, 8);
            return;
        }
        String str2 = "";
        if (this.f94768a.isProhibitedAndShouldTell()) {
            View view = this.f94680l;
            view.setBackgroundColor(b.c(view.getContext(), R.color.c8));
            this.f94681m.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            this.o.setVisibility(0);
            if (!TextUtils.isEmpty(this.f94768a.getVideoDetailNoticeBottom())) {
                this.n.setText(this.f94768a.getVideoDetailNoticeBottom());
            } else {
                this.n.setText(R.string.h_8);
                n.a("notice_content_empty", str2, new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "video_detail_notice_bottom").a("log_id", this.f94768a.getRequestId()).a("item_id", this.f94768a.getAid()).a());
            }
            this.f94680l.setOnClickListener(new ec(this));
            o.a(this.f94680l, 0);
        } else if (y.a(this.f94768a)) {
            Aweme aweme = this.f94768a;
            if (aweme.getStatus() == null || aweme.getStatus().getVideoMuteInfo() == null || TextUtils.isEmpty(aweme.getStatus().getVideoMuteInfo().getMuteDetailNotice())) {
                o.a(this.f94680l, 8);
            } else if (aweme.getStatus().getMusicEditStatus() == 2) {
                View view2 = this.f94680l;
                view2.setBackgroundColor(b.c(view2.getContext(), R.color.a4));
                this.f94680l.setOnClickListener(ed.f94683a);
                this.f94681m.setVisibility(8);
                this.n.setText(R.string.fdd);
                o.a(this.f94680l, 0);
            } else {
                String muteDetailNotice = aweme.getStatus().getVideoMuteInfo().getMuteDetailNotice();
                String muteDetailUrl = aweme.getStatus().getVideoMuteInfo().getMuteDetailUrl();
                View view3 = this.f94680l;
                view3.setBackgroundColor(b.c(view3.getContext(), R.color.a4));
                this.f94681m.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
                this.n.setText(muteDetailNotice);
                if (TextUtils.isEmpty(muteDetailUrl)) {
                    this.o.setVisibility(8);
                    this.f94680l.setOnClickListener(ee.f94684a);
                } else {
                    this.o.setVisibility(0);
                    this.f94680l.setOnClickListener(new ef(muteDetailUrl, aweme));
                }
                o.a(this.f94680l, 0);
                if (TextUtils.isEmpty(muteDetailUrl)) {
                    str = "2";
                } else {
                    str = "1";
                }
                d dVar = new d();
                if (!TextUtils.isEmpty(this.f94768a.getAid())) {
                    str2 = this.f94768a.getAid();
                }
                r.a("video_play_page_mute_tag_show", dVar.a("object_id", str2).a("tag_type", str).f66730a);
            }
        } else {
            o.a(this.f94680l, 8);
        }
    }
}
