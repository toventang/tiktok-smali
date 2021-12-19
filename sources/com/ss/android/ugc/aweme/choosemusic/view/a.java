package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.g;
import com.ss.android.ugc.aweme.discover.helper.ak;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.shortvideo.ui.q;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Banner> f70771a = Arrays.asList(new Banner());

    /* renamed from: b  reason: collision with root package name */
    ViewPager f70772b;

    /* renamed from: c  reason: collision with root package name */
    IndicatorView f70773c;

    /* renamed from: d  reason: collision with root package name */
    View f70774d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f70775e;

    /* renamed from: f  reason: collision with root package name */
    private g f70776f;

    /* renamed from: g  reason: collision with root package name */
    private final ak f70777g;

    /* renamed from: h  reason: collision with root package name */
    private Context f70778h;

    /* renamed from: i  reason: collision with root package name */
    private int f70779i;

    /* renamed from: j  reason: collision with root package name */
    private int f70780j;

    static {
        Covode.recordClassIndex(43624);
    }

    public final void a(List<Banner> list) {
        Context context = this.f70778h;
        if (!f70771a.equals(list)) {
            if (this.f70776f == null) {
                this.f70776f = new g(context, LayoutInflater.from(context), this.f70779i, this.f70780j);
                this.f70772b.setAdapter(new q(this.f70776f));
            }
            boolean a2 = gb.a(context);
            if (a2) {
                Collections.reverse(list);
            }
            this.f70777g.f81079b = list.size();
            this.f70776f.a(list);
            this.f70773c.setUpViewPager(this.f70772b);
            if (a2) {
                this.f70772b.setCurrentItem(list.size() - 1);
            }
            this.f70777g.a();
        }
    }

    public a(View view, int i2, int i3) {
        this.f70778h = view.getContext();
        this.f70772b = (ViewPager) view.findViewById(R.id.fk_);
        this.f70773c = (IndicatorView) view.findViewById(R.id.aop);
        this.f70774d = view.findViewById(R.id.e_f);
        this.f70775e = (FrameLayout) view.findViewById(R.id.re);
        this.f70779i = i2;
        this.f70780j = i3;
        Context context = this.f70778h;
        int a2 = (int) (((float) (n.a(context) - ((int) (n.b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        ViewGroup.LayoutParams layoutParams = this.f70775e.getLayoutParams();
        layoutParams.height = a2;
        this.f70775e.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f70775e.setOutlineProvider(new gp((int) n.b(this.f70778h, 2.0f)));
            this.f70775e.setClipToOutline(true);
        }
        this.f70777g = new ak(this.f70772b, 3000);
        int i4 = Build.VERSION.SDK_INT;
        this.f70774d.getLayoutParams().height = n.e(view.getContext());
        v.b((View) this.f70773c, 0);
    }
}
