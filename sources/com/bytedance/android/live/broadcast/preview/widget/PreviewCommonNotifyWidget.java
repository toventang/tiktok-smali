package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.af;
import com.bytedance.android.live.broadcast.f;
import com.bytedance.android.live.broadcast.model.k;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class PreviewCommonNotifyWidget extends LiveWidget implements au {
    static {
        Covode.recordClassIndex(4255);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(f.class, (h.f.a.b) new a(this)).a(af.class, (h.f.a.b) new b(this)).b(x.class, (h.f.a.b) new c(this));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, z> {
        final /* synthetic */ PreviewCommonNotifyWidget this$0;

        static {
            Covode.recordClassIndex(4258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewCommonNotifyWidget previewCommonNotifyWidget) {
            super(1);
            this.this$0 = previewCommonNotifyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            int i2;
            l.d(iVar, "");
            View view = this.this$0.getView();
            if (view != null) {
                if (iVar == com.bytedance.android.livesdkapi.depend.model.live.i.LIVE_STUDIO) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.l, z> {
        final /* synthetic */ PreviewCommonNotifyWidget this$0;

        static {
            Covode.recordClassIndex(4257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewCommonNotifyWidget previewCommonNotifyWidget) {
            super(1);
            this.this$0 = previewCommonNotifyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.l lVar) {
            MethodCollector.i(6859);
            com.bytedance.android.live.broadcast.model.l lVar2 = lVar;
            l.d(lVar2, "");
            PreviewCommonNotifyWidget previewCommonNotifyWidget = this.this$0;
            View a2 = previewCommonNotifyWidget.a(lVar2);
            if (a2 != null) {
                a2.startAnimation(AnimationUtils.loadAnimation(previewCommonNotifyWidget.context, R.anim.eb));
            }
            z zVar = z.f158842a;
            MethodCollector.o(6859);
            return zVar;
        }
    }

    public final View a(com.bytedance.android.live.broadcast.model.l lVar) {
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof com.bytedance.android.live.broadcast.view.a) && ((com.bytedance.android.live.broadcast.view.a) childAt).getTag() == lVar) {
                    return childAt;
                }
            }
        }
        return null;
    }

    static final class a extends h.f.b.m implements h.f.a.b<k, z> {
        final /* synthetic */ PreviewCommonNotifyWidget this$0;

        static {
            Covode.recordClassIndex(4256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PreviewCommonNotifyWidget previewCommonNotifyWidget) {
            super(1);
            this.this$0 = previewCommonNotifyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            MethodCollector.i(6943);
            k kVar2 = kVar;
            l.d(kVar2, "");
            if (kVar2.f7926a == 0) {
                this.this$0.show();
                View a2 = this.this$0.a(kVar2.f7927b);
                if (a2 != null) {
                    p.b(a2);
                } else {
                    View view = this.this$0.getView();
                    if (!(view instanceof ViewGroup)) {
                        view = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup != null) {
                        Context context = this.this$0.getContext();
                        l.b(context, "");
                        com.bytedance.android.live.broadcast.view.a aVar = new com.bytedance.android.live.broadcast.view.a(context, (byte) 0);
                        aVar.setTag(kVar2.f7927b);
                        aVar.setArrowVisibility(kVar2.f7929d);
                        aVar.setNotifyText(kVar2.f7928c);
                        viewGroup.addView(aVar);
                    }
                }
            } else {
                View a3 = this.this$0.a(kVar2.f7927b);
                if (a3 != null) {
                    p.a(a3);
                }
                View view2 = this.this$0.getView();
                if (view2 == null) {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.o(6943);
                    throw nullPointerException;
                } else if (((ViewGroup) view2).getChildCount() == 0) {
                    this.this$0.hide();
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(6943);
            return zVar;
        }
    }
}
