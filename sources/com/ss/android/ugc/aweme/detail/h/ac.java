package com.ss.android.ugc.aweme.detail.h;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.b;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.detail.ui.MarqueeView2;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class ac extends y {

    /* renamed from: a  reason: collision with root package name */
    private List<g> f79664a;
    private String bx;
    private View by;

    static {
        Covode.recordClassIndex(49498);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.h7n;
    }

    private g ab() {
        List<g> list = this.f79664a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f79664a.get(0);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.c.e, com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.h.y
    public final void bm_() {
        View view;
        super.bm_();
        if (c.n == 0 && (view = this.by) != null) {
            view.setBackgroundColor(b.c(this.bv, R.color.f159924h));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
        String str;
        int i2 = 0;
        if (this.bv == null || !MSAdaptionService.c().b(this.bv)) {
            IPropReuseService c2 = PropReuseServiceImpl.c();
            if (ab() != null) {
                Aweme aD = aD();
                String str2 = "";
                Music music = null;
                if (aD != null) {
                    music = aD.getMusic();
                    str = aD.getAid();
                    if (dq.a() && !in.e() && Aweme.containsGreenScreenGiphyAnchor(aD.getAnchors())) {
                        str2 = aD.getGiphyGifIds();
                    }
                    if (aD.getVideo() != null) {
                        i2 = aD.getVideo().getVideoLength();
                    }
                } else {
                    str = null;
                    i2 = 0;
                }
                c2.a(this.bv, new ArrayList<>(this.f79664a), str2, music, this.aJ.getPreviousPage(), str, i2, AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
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

    public ac(Bundle bundle) {
        this.f79664a = (List) bundle.getSerializable("feed_data_sticker_model");
        this.bx = bundle.getString("feed_data_sticker_group_id", "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        View a2 = a.a(LayoutInflater.from(this.bv), R.layout.wt, relativeLayout, false);
        this.by = a2.findViewById(R.id.eb5);
        g ab = ab();
        if (ab != null) {
            e.a((RemoteImageView) a2.findViewById(R.id.eb4), ab.iconUrl);
            a((MarqueeView2) a2.findViewById(R.id.b1o), ab.name);
        }
        return a2;
    }
}
