package com.bytedance.android.live.broadcast.b;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.f.a;
import com.bytedance.android.live.broadcast.model.q;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class f extends v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f7586a;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f7587b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f7588c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f7589d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f7590e;

    /* renamed from: f  reason: collision with root package name */
    public LoadingStatusView f7591f;

    /* renamed from: g  reason: collision with root package name */
    public List<q> f7592g;

    /* renamed from: h  reason: collision with root package name */
    private View f7593h;

    /* renamed from: i  reason: collision with root package name */
    private LiveLoadingView f7594i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7595j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f7596k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f7597l;

    /* renamed from: m  reason: collision with root package name */
    private a f7598m;

    static {
        Covode.recordClassIndex(3743);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b72);
        bVar.f22374a = 0;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        bVar.a(new ColorDrawable(0));
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        a aVar = this.f7598m;
        if (!(aVar == null || aVar.f7855d == 1)) {
            aVar.f7856e = true;
        }
        super.onDismiss(dialogInterface);
    }

    public final void onClick(View view) {
        int i2;
        q qVar;
        if (view instanceof HSImageView) {
            if (view.getTag() != null) {
                i2 = ((Integer) view.getTag()).intValue();
            } else {
                i2 = -1;
            }
            List<q> list = this.f7592g;
            if (list != null && !list.isEmpty() && i2 >= 0 && i2 < this.f7592g.size() && (qVar = this.f7592g.get(i2)) != null && !TextUtils.isEmpty(qVar.f7953a)) {
                ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(getContext(), e.b(qVar.f7953a));
                if (qVar.f7953a.contains("health_score")) {
                    b.a.a("livesdk_know_health_score_page_show").a().a("enter_from", "shield").b();
                }
            }
        }
    }

    public static f a(Context context, a aVar) {
        f fVar = new f();
        fVar.f7586a = context;
        fVar.f7598m = aVar;
        return fVar;
    }

    public final void a(boolean z, CharSequence charSequence) {
        if (z) {
            this.f7597l.setVisibility(0);
            this.f7597l.setText(charSequence);
            return;
        }
        this.f7597l.setVisibility(8);
    }

    private static Spannable a(String str, int i2) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) y.b(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(y.b((int) R.color.k2));
        spannableString.setSpan(absoluteSizeSpan, 4, i2, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i2, 18);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = getView();
        this.f7593h = view2;
        this.f7587b = (RelativeLayout) view2.findViewById(R.id.ae6);
        this.f7588c = (TextView) this.f7593h.findViewById(R.id.bfs);
        this.f7589d = (TextView) this.f7593h.findViewById(R.id.bfp);
        this.f7594i = (LiveLoadingView) this.f7593h.findViewById(R.id.bfo);
        this.f7595j = (TextView) this.f7593h.findViewById(R.id.flp);
        this.f7596k = (TextView) this.f7593h.findViewById(R.id.flq);
        this.f7597l = (TextView) this.f7593h.findViewById(R.id.a3r);
        this.f7590e = (LinearLayout) this.f7593h.findViewById(R.id.vn);
        LoadingStatusView loadingStatusView = (LoadingStatusView) this.f7593h.findViewById(R.id.chf);
        this.f7591f = loadingStatusView;
        loadingStatusView.setBuilder(LoadingStatusView.a.a(getContext()).a(getResources().getDimensionPixelSize(R.dimen.va)));
        this.f7591f.setVisibility(0);
        this.f7591f.setStatus(0);
        this.f7591f.setVisibility(0);
        this.f7591f.setStatus(0);
        a aVar = this.f7598m;
        if (aVar != null) {
            aVar.f7854c.removeMessages(2);
            aVar.f7855d = 3;
            d.a.a().a().getReviewInfo(aVar.f7853b).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new com.bytedance.android.live.broadcast.f.d(aVar), new com.bytedance.android.live.broadcast.f.e(aVar));
        }
    }

    public final void a(boolean z, int i2, int i3) {
        if (z) {
            this.f7595j.setVisibility(0);
            this.f7595j.setText(a(y.a((int) R.string.guf, Integer.valueOf(i2)), String.valueOf(i2).length() + 4));
            this.f7596k.setVisibility(0);
            this.f7596k.setText(a(y.a((int) R.string.gug, Integer.valueOf(i3)), String.valueOf(i3).length() + 4));
            return;
        }
        this.f7595j.setVisibility(4);
        this.f7596k.setVisibility(4);
    }
}
