package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public abstract class u extends t<b> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f101771k = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public int f101772h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f101773i = true;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f101774j;

    static {
        Covode.recordClassIndex(65055);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8d;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65056);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        l.d(bVar, "");
        ((TextView) bVar.f101776b.a(bVar, b.f101775a[0])).setText(this.f101772h);
        bVar.b().setChecked(this.f101773i);
        bVar.a().setOnClickListener(this.f101774j);
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101775a = {new y(b.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new y(b.class, "switch", "getSwitch()Lcom/bytedance/ies/dmt/ui/widget/setting/checkable/DmtSettingSwitch;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101776b = a((int) R.id.blp);

        /* renamed from: c  reason: collision with root package name */
        private final d f101777c = a((int) R.id.blo);

        static {
            Covode.recordClassIndex(65057);
        }

        public final DmtSettingSwitch b() {
            return (DmtSettingSwitch) this.f101777c.a(this, f101775a[1]);
        }

        @Override // com.airbnb.epoxy.q, com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.c
        public final void a(View view) {
            int i2;
            l.d(view, "");
            super.a(view);
            DmtSettingSwitch b2 = b();
            b2.setTrackRadius((int) n.b(b2.getContext(), 42.0f));
            b2.setEnableTouch(false);
            b2.setTrackPadding((int) n.b(b2.getContext(), 3.0f));
            b2.setThumbDrawable(b2.getResources().getDrawable(R.drawable.cde));
            Context context = b2.getContext();
            l.b(context, "");
            l.d(context, "");
            Resources resources = context.getResources();
            if (com.bytedance.ies.dmt.ui.common.b.b(context)) {
                i2 = R.color.fi;
            } else {
                i2 = R.color.fh;
            }
            b2.setTrackTintList(resources.getColorStateList(i2));
            v.a(view);
        }
    }
}
