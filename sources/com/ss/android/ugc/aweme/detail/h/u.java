package com.ss.android.ugc.aweme.detail.h;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.MarqueeView2;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;

public final class u extends y {

    /* renamed from: a  reason: collision with root package name */
    private MvModel f79753a;
    private String bx;

    static {
        Covode.recordClassIndex(49562);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.h7y;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
        if (this.bv == null || !MSAdaptionService.c().b(this.bv)) {
            IMovieReuseService a2 = MovieReuseServiceImpl.a();
            if (this.f79753a != null) {
                a2.a(az_(), this.f79753a.getMvId());
                r.a("shoot", new d().a("enter_method", "mv_feed").a("mv_id", this.f79753a.getMvId()).a("enter_from", "mv_page").a("shoot_way", "mv_page").a("content_type", "mv").a("group_id", this.bx).f66730a);
                return;
            }
            return;
        }
        Toast makeText = Toast.makeText(this.bv, this.bv.getString(R.string.bey), 0);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
    }

    public u(Bundle bundle) {
        this.f79753a = (MvModel) bundle.getSerializable("feed_data_movie_model");
        this.bx = bundle.getString("feed_data_movie_group_id", "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        View a2 = a.a(LayoutInflater.from(this.bv), R.layout.wp, relativeLayout, false);
        if (this.f79753a != null) {
            e.a((RemoteImageView) a2.findViewById(R.id.col), this.f79753a.getIconUrl());
            a((MarqueeView2) a2.findViewById(R.id.b1o), this.f79753a.getName());
        }
        return a2;
    }
}
