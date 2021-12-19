package com.bytedance.android.live.liveinteract.match.ui.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<z> f10820a;

    /* renamed from: b  reason: collision with root package name */
    public b.EnumC0251b f10821b = b.EnumC0251b.PK_ICON;

    static {
        Covode.recordClassIndex(5786);
    }

    public final void a(b.EnumC0251b bVar) {
        l.d(bVar, "");
        this.f10821b = bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0203a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10822a;

        static {
            Covode.recordClassIndex(5787);
        }

        View$OnClickListenerC0203a(a aVar) {
            this.f10822a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10822a.f10821b, false);
            this.f10822a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, R.style.a31);
        l.d(context, "");
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10823a;

        static {
            Covode.recordClassIndex(5788);
        }

        b(a aVar) {
            this.f10823a = aVar;
        }

        public final void onClick(View view) {
            HashMap hashMap = new HashMap();
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
            com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_pk_guide_popup_click", hashMap);
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f10823a.f10821b, true);
            h.f.a.a<z> aVar = this.f10823a.f10820a;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f10823a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b76);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        HashMap hashMap = new HashMap();
        com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
        com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_pk_guide_popup_show", hashMap);
        HSImageView hSImageView = (HSImageView) findViewById(R.id.bxk);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() == 0) {
            aVar.width = y.a(154.0f);
            aVar.height = y.a(130.0f);
            k.a(hSImageView, "tiktok_live_interaction_resource", "ttlive_ic_interact_pk_guide.png");
        } else {
            aVar.width = y.a(311.5f);
            aVar.height = y.a(132.0f);
            k.a(hSImageView, "tiktok_live_interaction_resource", "ttlive_ic_interact_pk_guide_2.png");
        }
        l.b(hSImageView, "");
        hSImageView.setLayoutParams(aVar);
        findViewById(R.id.bve).setOnClickListener(new View$OnClickListenerC0203a(this));
        findViewById(R.id.a05).setOnClickListener(new b(this));
    }
}
