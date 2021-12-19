package com.ss.android.ugc.aweme.discover.n;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.common.d.i;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.discover.a.as;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;

public abstract class a extends com.ss.android.ugc.aweme.common.a.a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f81957a;

    static {
        Covode.recordClassIndex(51008);
    }

    public abstract boolean D();

    public abstract void E();

    public abstract void G();

    public abstract void H();

    @Override // com.ss.android.ugc.aweme.common.a.a
    public int[] b() {
        return em.a(201);
    }

    public void I() {
        Video video;
        if (this.f76353m != null && (video = ((Aweme) this.f76353m).getVideo()) != null) {
            if (a(video, "AbsCellViewHolder")) {
                this.o = true;
            } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                this.n.setImageResource(R.color.f159926j);
            } else {
                a(video.getCover(), "AbsCellViewHolder");
            }
        }
    }

    public a(View view) {
        super(view);
        this.f81957a = view.getContext();
    }

    protected static void a(SmartImageView smartImageView) {
        float f2;
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) viewGroup;
            if (as.a() == 0 || as.a() == 1 || as.a() == 3) {
                f2 = 0.625f;
            } else {
                f2 = 0.75f;
            }
            fixedRatioFrameLayout.setWhRatio(f2);
        }
        PointF pointF = new PointF(0.5f, 0.0f);
        i.a(pointF);
        ((com.facebook.drawee.f.a) smartImageView.getHierarchy()).a(2).a(pointF);
    }
}
