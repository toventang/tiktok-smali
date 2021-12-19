package com.bytedance.android.live.effect.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class BeautyIconWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private TextView f9891a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f9892b;

    /* renamed from: c  reason: collision with root package name */
    private View f9893c;

    /* renamed from: d  reason: collision with root package name */
    private int f9894d;

    /* renamed from: e  reason: collision with root package name */
    private int f9895e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9896f;

    /* renamed from: g  reason: collision with root package name */
    private final b<View, z> f9897g;

    final /* synthetic */ class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f9898a;

        static {
            Covode.recordClassIndex(5066);
        }

        a(b bVar) {
            this.f9898a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f9898a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(5065);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b5f;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        View view = this.f9893c;
        if (view == null) {
            l.a("mBackground");
        }
        view.setBackgroundResource(R.drawable.box);
        TextView textView = this.f9891a;
        if (textView == null) {
            l.a("mIconName");
        }
        textView.setTextColor(y.b((int) R.color.v7));
    }

    public final void b() {
        View view = this.f9893c;
        if (view == null) {
            l.a("mBackground");
        }
        view.setBackgroundResource(R.drawable.boy);
        TextView textView = this.f9891a;
        if (textView == null) {
            l.a("mIconName");
        }
        textView.setTextColor(y.b((int) R.color.xg));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.android.live.effect.widget.BeautyIconWidget$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.widget.BeautyIconWidget.onCreate():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public BeautyIconWidget(b<? super View, z> bVar) {
        l.d(bVar, "");
        this.f9897g = bVar;
    }

    public final void a(int i2, int i3, boolean z) {
        this.f9894d = i2;
        this.f9895e = i3;
        this.f9896f = z;
    }
}
