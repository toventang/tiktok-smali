package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.a.b.a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.an;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.chatroom.c.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class LinkCrossGuestBgView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel f8657a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f8658b;

    static {
        Covode.recordClassIndex(4431);
    }

    public LinkCrossGuestBgView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LinkCrossGuestBgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private View a(int i2) {
        if (this.f8658b == null) {
            this.f8658b = new HashMap();
        }
        View view = (View) this.f8658b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f8658b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final DataChannel getDataChannel() {
        return this.f8657a;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f8657a = dataChannel;
    }

    public final void setTipText(String str) {
        l.d(str, "");
        LiveTextView liveTextView = (LiveTextView) a(R.id.f9i);
        l.b(liveTextView, "");
        liveTextView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LinkCrossGuestBgView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LinkCrossGuestBgView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8226);
        if (g.c()) {
            a.a(context, R.layout.bf4, this, true);
        } else {
            com.a.a(LayoutInflater.from(context), R.layout.bf4, this, true);
        }
        ((LiveTextView) a(R.id.f9i)).a(R.style.tt);
        ((LinearLayout) a(R.id.a1r)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.broadcast.view.LinkCrossGuestBgView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LinkCrossGuestBgView f8659a;

            static {
                Covode.recordClassIndex(4432);
            }

            {
                this.f8659a = r1;
            }

            public final void onClick(View view) {
                DataChannel dataChannel;
                DataChannel dataChannel2 = this.f8659a.getDataChannel();
                if (dataChannel2 != null) {
                    dataChannel2.c(an.class, "");
                }
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(b.class);
                l.b(a2, "");
                if (!((b) a2).isInRandomLinkMic() && (dataChannel = this.f8659a.getDataChannel()) != null) {
                    dataChannel.c(t.class, new p(1));
                }
            }
        });
        MethodCollector.o(8226);
    }
}
