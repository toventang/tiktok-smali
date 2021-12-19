package com.ss.android.ugc.aweme.profile.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class p extends a {

    /* renamed from: a  reason: collision with root package name */
    Context f115881a;

    /* renamed from: b  reason: collision with root package name */
    public String f115882b;

    /* renamed from: c  reason: collision with root package name */
    TuxIconView f115883c;

    /* renamed from: d  reason: collision with root package name */
    TextView f115884d;

    /* renamed from: e  reason: collision with root package name */
    TextView f115885e;

    /* renamed from: f  reason: collision with root package name */
    ViewGroup f115886f;

    /* renamed from: g  reason: collision with root package name */
    private View f115887g;

    /* renamed from: h  reason: collision with root package name */
    private View f115888h;

    /* renamed from: i  reason: collision with root package name */
    private View f115889i;

    static {
        Covode.recordClassIndex(74741);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        f();
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final int[] b() {
        return em.a(200);
    }

    public final void f() {
        List<ImageInfo> imageInfos;
        ImageInfo imageInfo;
        if (this.f76353m != null && (imageInfos = ((Aweme) this.f76353m).getImageInfos()) != null && !imageInfos.isEmpty() && (imageInfo = imageInfos.get(0)) != null) {
            v b2 = r.a(com.ss.android.ugc.aweme.base.v.a(imageInfo.getLabelThumb())).b(em.a(200));
            b2.E = this.n;
            b2.a(this.n.getWidth(), this.n.getHeight()).a("ImageViewHolder").c();
        }
    }

    public p(View view, String str, final d dVar) {
        super(view);
        this.f115881a = view.getContext();
        this.f115882b = str;
        this.f115887g = view.findViewById(R.id.ad7);
        this.f115888h = view.findViewById(R.id.d7o);
        this.n = (SmartImageView) view.findViewById(R.id.agf);
        this.f115884d = (TextView) view.findViewById(R.id.f4l);
        this.f115883c = (TuxIconView) view.findViewById(R.id.fgn);
        this.f115885e = (TextView) view.findViewById(R.id.f9s);
        this.f115886f = (ViewGroup) view.findViewById(R.id.bmc);
        this.n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.profile.a.p.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74742);
            }

            public final void onClick(View view) {
                d dVar;
                ClickAgent.onClick(view);
                if (p.this.f76353m != null && (dVar = dVar) != null) {
                    dVar.a(view, (Aweme) p.this.f76353m, p.this.f115882b);
                }
            }
        });
        this.n.setAnimationListener(this.f76348l);
        this.f115889i = view.findViewById(R.id.c4d);
    }
}
