package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.h.v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ak;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.aweme.kids.choosemusic.a.g;
import com.ss.android.ugc.aweme.shortvideo.ui.q;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Banner> f105661a = Arrays.asList(new Banner());

    /* renamed from: b  reason: collision with root package name */
    ViewPager f105662b;

    /* renamed from: c  reason: collision with root package name */
    IndicatorView f105663c;

    /* renamed from: d  reason: collision with root package name */
    View f105664d;

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f105665e;

    /* renamed from: f  reason: collision with root package name */
    ViewGroup f105666f;

    /* renamed from: g  reason: collision with root package name */
    private g f105667g;

    /* renamed from: h  reason: collision with root package name */
    private final ak f105668h;

    /* renamed from: i  reason: collision with root package name */
    private Context f105669i;

    /* renamed from: j  reason: collision with root package name */
    private int f105670j;

    static {
        Covode.recordClassIndex(67677);
    }

    public final void a(List<Banner> list) {
        Context context = this.f105669i;
        if (!f105661a.equals(list)) {
            if (this.f105667g == null) {
                this.f105667g = new g(context, LayoutInflater.from(context), this.f105670j);
                this.f105662b.setAdapter(new q(this.f105667g));
            }
            boolean a2 = gb.a(context);
            if (a2) {
                Collections.reverse(list);
            }
            this.f105668h.f81079b = list.size();
            this.f105667g.a(list);
            this.f105663c.setUpViewPager(this.f105662b);
            if (a2) {
                this.f105662b.setCurrentItem(list.size() - 1);
            }
            this.f105668h.a();
        }
    }

    public a(View view, int i2) {
        this.f105669i = view.getContext();
        this.f105662b = (ViewPager) view.findViewById(R.id.fk_);
        this.f105663c = (IndicatorView) view.findViewById(R.id.aop);
        this.f105664d = view.findViewById(R.id.e_f);
        this.f105665e = (RelativeLayout) view.findViewById(R.id.re);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cf2);
        this.f105666f = viewGroup;
        this.f105670j = i2;
        Context context = this.f105669i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.leftMargin = (int) n.b(this.f105666f.getContext(), 16.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        int a2 = (int) (((float) (n.a(context) - ((int) (n.b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        ViewGroup.LayoutParams layoutParams = this.f105665e.getLayoutParams();
        layoutParams.height = a2;
        this.f105665e.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f105665e.setOutlineProvider(new gp((int) n.b(this.f105669i, 2.0f)));
            this.f105665e.setClipToOutline(true);
        }
        this.f105668h = new ak(this.f105662b, 3000);
        int i3 = Build.VERSION.SDK_INT;
        this.f105664d.getLayoutParams().height = n.e(view.getContext());
        v.b((View) this.f105663c, 0);
    }
}
