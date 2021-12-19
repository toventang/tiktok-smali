package com.bytedance.android.livesdk.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.d.b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.event.h;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

public class LiveMaskLayerWidget extends LiveWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    public i.a f22500a;

    /* renamed from: b  reason: collision with root package name */
    public Room f22501b;

    /* renamed from: c  reason: collision with root package name */
    public b f22502c;

    /* renamed from: d  reason: collision with root package name */
    private LiveTextView f22503d;

    /* renamed from: e  reason: collision with root package name */
    private LiveTextView f22504e;

    /* renamed from: f  reason: collision with root package name */
    private LiveTextView f22505f;

    /* renamed from: g  reason: collision with root package name */
    private LiveTextView f22506g;

    static {
        Covode.recordClassIndex(13277);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bh5;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        show();
        b bVar = this.f22502c;
        if (bVar != null) {
            bVar.stop(false);
        }
    }

    public final void b() {
        hide();
        b bVar = this.f22502c;
        if (bVar != null) {
            bVar.start();
        }
    }

    private void c() {
        Room room = this.f22501b;
        if (room != null && room.maskLayer != null) {
            a(this.f22503d, this.f22501b.maskLayer.title);
            a(this.f22504e, this.f22501b.maskLayer.subTitle);
            LiveTextView liveTextView = this.f22505f;
            if (liveTextView != null) {
                liveTextView.setText(this.context.getString(R.string.e3f));
            }
            LiveTextView liveTextView2 = this.f22506g;
            if (liveTextView2 != null) {
                liveTextView2.setText(this.context.getString(R.string.efa));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f22503d = (LiveTextView) this.contentView.findViewById(R.id.cku);
        this.f22504e = (LiveTextView) this.contentView.findViewById(R.id.cks);
        this.f22505f = (LiveTextView) this.contentView.findViewById(R.id.ckv);
        this.f22506g = (LiveTextView) this.contentView.findViewById(R.id.ckr);
        this.contentView.findViewById(R.id.ckv).setOnClickListener(this);
        this.contentView.findViewById(R.id.ckr).setOnClickListener(this);
        a.a().a(h.class).d(new f<h>() {
            /* class com.bytedance.android.livesdk.widget.LiveMaskLayerWidget.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13278);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(h hVar) {
                h hVar2 = hVar;
                if (hVar2 != null && LiveMaskLayerWidget.this.f22501b != null && hVar2.f17195a == LiveMaskLayerWidget.this.f22501b.getId()) {
                    if (hVar2.f17196b) {
                        LiveMaskLayerWidget.this.a();
                    } else {
                        LiveMaskLayerWidget.this.b();
                    }
                }
            }
        });
        c();
    }

    public final void a(Room room) {
        this.f22501b = room;
        c();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ckv) {
            i.a aVar = this.f22500a;
            if (aVar != null) {
                aVar.m();
            }
            b.a.a("livesdk_mask_layer_click").a("click_icon", "watch").f("click").a(provideDataChannel()).b();
        } else if (id == R.id.ckr) {
            i.a aVar2 = this.f22500a;
            if (aVar2 != null) {
                aVar2.n();
            }
            b.a.a("livesdk_mask_layer_click").a("click_icon", "skip").f("click").a(provideDataChannel()).b();
        }
    }

    private static void a(TextView textView, com.bytedance.android.livesdk.model.message.c.b bVar) {
        String str;
        if (textView != null && bVar != null) {
            String str2 = bVar.f19422b;
            if (!TextUtils.isEmpty(bVar.f19421a)) {
                str = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            textView.setText(c.a(str2, bVar, null));
        }
    }
}
