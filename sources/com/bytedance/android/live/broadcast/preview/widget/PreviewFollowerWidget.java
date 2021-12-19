package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class PreviewFollowerWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    boolean f8353a;

    static {
        Covode.recordClassIndex(4267);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f8353a) {
            super.show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, dg.class, (b) new a(this));
        }
    }

    static final class a extends h.f.b.m implements b<o, z> {
        final /* synthetic */ PreviewFollowerWidget this$0;

        static {
            Covode.recordClassIndex(4268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PreviewFollowerWidget previewFollowerWidget) {
            super(1);
            this.this$0 = previewFollowerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            String str;
            Integer valueOf;
            LiveTextView liveTextView;
            o oVar2 = oVar;
            l.d(oVar2, "");
            PreviewFollowerWidget previewFollowerWidget = this.this$0;
            com.bytedance.android.live.broadcast.model.a aVar = oVar2.f7948j;
            if (aVar == null || aVar.f7888a <= 0) {
                previewFollowerWidget.f8353a = false;
                previewFollowerWidget.hide();
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_takepage_fans_show_fail").a(previewFollowerWidget.dataChannel);
                if (!(aVar == null || (valueOf = Integer.valueOf(aVar.f7889b)) == null)) {
                    if (valueOf.intValue() == 1) {
                        str = "zero_online";
                    } else if (valueOf.intValue() == 2) {
                        str = "lower_than_10_percent";
                    } else if (valueOf.intValue() == 3) {
                        str = "lower_than_10";
                    } else if (valueOf.intValue() == 4) {
                        str = "in_control_group";
                    } else if (valueOf.intValue() == 6) {
                        str = "l1_anchor";
                    }
                    a2.a("fail_reason", str).b();
                }
                str = "tech_fail";
                a2.a("fail_reason", str).b();
            } else {
                previewFollowerWidget.f8353a = true;
                previewFollowerWidget.show();
                View view = previewFollowerWidget.getView();
                if (!(view == null || (liveTextView = (LiveTextView) view.findViewById(R.id.cr)) == null)) {
                    liveTextView.setShadowLayer((float) y.a(1.0f), 0.0f, (float) y.a(1.0f), androidx.core.content.b.c(liveTextView.getContext(), R.color.vi));
                    Context context = liveTextView.getContext();
                    l.b(context, "");
                    liveTextView.setText(context.getResources().getQuantityString(R.plurals.g3, aVar.f7888a, h.a(aVar.f7888a)));
                }
                b.a.a("livesdk_live_takepage_active_fans_show").a(previewFollowerWidget.dataChannel).a("show_active_fans_num", aVar.f7888a).b();
            }
            return z.f158842a;
        }
    }
}
