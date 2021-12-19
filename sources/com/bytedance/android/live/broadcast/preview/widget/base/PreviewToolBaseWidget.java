package com.bytedance.android.live.broadcast.preview.widget.base;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;

public abstract class PreviewToolBaseWidget extends LiveWidget implements au {

    public final /* synthetic */ class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f8457a;

        static {
            Covode.recordClassIndex(4338);
        }

        public b(h.f.a.b bVar) {
            this.f8457a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f8457a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(4336);
    }

    public abstract int a();

    public abstract void a(View view);

    public abstract int b();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void d() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.fmi);
        } else {
            view = null;
        }
        p.b(view);
    }

    public final void e() {
        View view;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.fmi);
        } else {
            view = null;
        }
        p.a(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            ((ImageView) view.findViewById(R.id.fmh)).setImageResource(b());
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.fmj);
            l.b(liveTextView, "");
            liveTextView.setText(y.a(a()));
            view.setOnClickListener(new b(new a(this)));
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class a extends j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(4337);
        }

        a(PreviewToolBaseWidget previewToolBaseWidget) {
            super(1, previewToolBaseWidget, PreviewToolBaseWidget.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            ((PreviewToolBaseWidget) this.receiver).a(view2);
            return z.f158842a;
        }
    }
}
