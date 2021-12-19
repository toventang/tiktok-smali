package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class PreviewCloseWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<e> f8345a;

    static {
        Covode.recordClassIndex(4253);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewGroup.LayoutParams layoutParams;
        super.onCreate();
        View view = getView();
        if (view != null) {
            View view2 = getView();
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += ac.a(this.context);
            view.setLayoutParams(marginLayoutParams);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnClickListener(new a(this));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewCloseWidget f8346a;

        static {
            Covode.recordClassIndex(4254);
        }

        a(PreviewCloseWidget previewCloseWidget) {
            this.f8346a = previewCloseWidget;
        }

        public final void onClick(View view) {
            e invoke = this.f8346a.f8345a.invoke();
            if (invoke != null) {
                invoke.a();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewCloseWidget(h.f.a.a<? extends e> aVar) {
        l.d(aVar, "");
        this.f8345a = aVar;
    }
}
