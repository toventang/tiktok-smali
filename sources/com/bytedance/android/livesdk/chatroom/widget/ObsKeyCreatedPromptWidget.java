package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.api.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;

public final class ObsKeyCreatedPromptWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16612a = new a((byte) 0);

    static {
        Covode.recordClassIndex(9211);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bd8;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9212);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        DataChannelGlobal.f34575d.b(this);
    }

    static final class b extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ObsKeyCreatedPromptWidget this$0;

        static {
            Covode.recordClassIndex(9213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ObsKeyCreatedPromptWidget obsKeyCreatedPromptWidget) {
            super(1);
            this.this$0 = obsKeyCreatedPromptWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.show();
            } else {
                this.this$0.hide();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String a2 = y.a((int) R.string.e__, "tiktok.com");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FFFFFFE6"));
        l.b(a2, "");
        spannableStringBuilder.setSpan(foregroundColorSpan, p.a((CharSequence) a2, "tiktok.com", 0, false, 6), p.a((CharSequence) a2, "tiktok.com", 0, false, 6) + 10, 33);
        View findViewById = findViewById(R.id.dcp);
        l.b(findViewById, "");
        ((LiveTextView) findViewById).setText(spannableStringBuilder);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
        b bVar = new b(this);
        l.c(this, "");
        l.c(this, "");
        l.c(f.class, "");
        l.c(bVar, "");
        dataChannelGlobal.a(this, this, f.class, true, bVar);
    }
}
