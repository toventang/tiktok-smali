package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.j.dx;
import com.bytedance.android.livesdk.j.dz;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import h.z;

public final class PortraitPublicScreenWidget extends PublicScreenWidget implements au {
    static {
        Covode.recordClassIndex(6881);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.h.a
    public final boolean e() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void i() {
        super.i();
        this.f12508d.setHasFixedSize(true);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PortraitPublicScreenWidget f12504a;

        static {
            Covode.recordClassIndex(6884);
        }

        c(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            this.f12504a = portraitPublicScreenWidget;
        }

        public final void run() {
            View view;
            ViewGroup.LayoutParams layoutParams;
            if (this.f12504a.isViewValid && (view = this.f12504a.getView()) != null && (layoutParams = view.getLayoutParams()) != null) {
                PortraitPublicScreenWidget.a("init", "height: " + layoutParams.height + ", width: " + layoutParams.width);
            }
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ PortraitPublicScreenWidget this$0;

        static {
            Covode.recordClassIndex(6882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            super(1);
            this.this$0 = portraitPublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.f(num.intValue());
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ PortraitPublicScreenWidget this$0;

        static {
            Covode.recordClassIndex(6883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PortraitPublicScreenWidget portraitPublicScreenWidget) {
            super(1);
            this.this$0 = portraitPublicScreenWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            PortraitPublicScreenWidget portraitPublicScreenWidget = this.this$0;
            if (portraitPublicScreenWidget.getView() != null) {
                ((ViewGroup.MarginLayoutParams) portraitPublicScreenWidget.getView().getLayoutParams()).topMargin = intValue;
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, dx.class, (h.f.a.b) new a(this)).b((m) this, dz.class, (h.f.a.b) new b(this));
        }
        View view = getView();
        if (view != null) {
            view.post(new c(this));
        }
    }
}
