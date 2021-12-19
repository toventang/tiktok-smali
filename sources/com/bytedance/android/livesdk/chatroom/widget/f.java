package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.a;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.aj;
import com.bytedance.android.livesdk.chatroom.widget.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition;
import com.bytedance.android.livesdk.livesetting.decoration.DefaultDonationStickerPositionSetting;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class f extends a {
    static {
        Covode.recordClassIndex(9234);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final View c() {
        return a.a(LayoutInflater.from(getContext()), R.layout.b8m, this, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        super.a(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ar arVar) {
        String str;
        if (!TextUtils.isEmpty(arVar.f18991e)) {
            com.bytedance.android.livesdk.an.a.a().a(new aj(arVar.f18991e));
            HashMap hashMap = new HashMap();
            if (this.f16641h) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_anchor", str);
            hashMap.put("position", "donation_sticker");
            hashMap.put("NGO_name", arVar.f18987a);
            b.a.a("livesdk_donation_icon_click").a((Map<String, String>) hashMap).a().b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void a(boolean z) {
        if (z) {
            super.a(true);
            return;
        }
        b.a b2 = new b.a(getContext()).a(R.string.ei7).b(R.string.e0v).a(R.string.ei6, (DialogInterface.OnClickListener) new h(this), false).b(R.string.gle, i.f16659a, false);
        b2.f18289f = j.f16660a;
        b2.f18290g = k.f16661a;
        b2.a().show();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.a
    public final void b(View view) {
        ar a2;
        int i2;
        float f2;
        ImageView imageView = (ImageView) view.findViewById(R.id.eao);
        TextView textView = (TextView) view.findViewById(R.id.eaq);
        if (this.f16640g != null && (a2 = this.f16640g.a()) != null) {
            textView.setText(a2.f18987a);
            if (a2.f18989c != null) {
                p.a(imageView, a2.f18989c);
            }
            int d2 = y.d(R.dimen.yd);
            view.measure(View.MeasureSpec.makeMeasureSpec(d2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f16646m, Integer.MIN_VALUE));
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = d2;
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            DefaultDonationStickerPosition value = DefaultDonationStickerPositionSetting.INSTANCE.getValue();
            float xRatio = value.getXRatio();
            float yRatio = value.getYRatio();
            float f3 = 1.0f;
            if (xRatio < 0.0f || xRatio > 1.0f) {
                xRatio = DefaultDonationStickerPosition.getDEFAULT_POSITION();
            }
            if (yRatio < 0.0f || yRatio > 1.0f) {
                yRatio = DefaultDonationStickerPosition.getDEFAULT_POSITION();
            }
            if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
                xRatio = 1.0f - xRatio;
            }
            int i3 = d2 / 2;
            int i4 = ((int) (((float) measuredWidth) * xRatio)) - i3;
            int i5 = measuredHeight / 2;
            int i6 = ((int) (((float) measuredHeight2) * yRatio)) - i5;
            if (this.f16640g != null) {
                if (this.f16640g.f19007i != -1 || this.f16640g.f19008j != -1) {
                    if (this.f16640g.f19009k > 0) {
                        f2 = ((float) this.f16645l) / ((float) this.f16640g.f19009k);
                    } else {
                        f2 = 1.0f;
                    }
                    if (this.f16640g.f19010l > 0) {
                        f3 = ((float) this.f16646m) / ((float) this.f16640g.f19010l);
                    }
                    i4 = ((int) (((float) this.f16640g.f19007i) * f2)) - i3;
                    i2 = (int) (((float) this.f16640g.f19008j) * f3);
                } else if (this.f16640g.o != null && this.f16640g.o.size() > 1) {
                    double d3 = (double) measuredWidth;
                    double doubleValue = this.f16640g.o.get(0).doubleValue();
                    Double.isNaN(d3);
                    i4 = ((int) (d3 * doubleValue)) - i3;
                    double d4 = (double) measuredHeight2;
                    double doubleValue2 = this.f16640g.o.get(1).doubleValue();
                    Double.isNaN(d4);
                    i2 = (int) (d4 * doubleValue2);
                }
                i6 = i2 - i5;
            }
            if (i4 < this.f16644k[2]) {
                i4 = this.f16644k[2];
            } else if (i4 + d2 > this.f16644k[3]) {
                i4 = this.f16644k[3] - d2;
            }
            if (i6 < this.f16644k[0]) {
                i6 = this.f16644k[0];
            } else if (i6 + measuredHeight > this.f16644k[1]) {
                i6 = this.f16644k[1] - measuredHeight;
            }
            view.setX((float) i4);
            view.setY((float) i6);
            if (this.f16640g != null) {
                this.f16640g.f19007i = i4 + i3;
                this.f16640g.f19008j = i6 + i5;
            }
            if (this.f16641h && this.f16642i != null) {
                this.f16642i.d();
            }
            view.setOnClickListener(new g(this, a2));
        }
    }

    public f(Context context, av avVar, boolean z, int[] iArr, a.AbstractC0333a aVar, boolean z2) {
        super(context, avVar, z, iArr, aVar, z2);
    }
}
