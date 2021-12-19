package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.dialogv2.b.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.b;
import com.bytedance.android.livesdk.service.animation.a.a;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

public final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    private TextView f20081a = ((TextView) this.f20065m.findViewById(R.id.dd4));

    /* renamed from: b  reason: collision with root package name */
    private CountDownTextView f20082b;

    static {
        Covode.recordClassIndex(11856);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(b.a aVar) {
        this.f20065m.setOnClickListener(new k(this));
        this.f20065m.setOnTouchListener(new l(this));
        this.f20063k = aVar;
    }

    public j(View view) {
        super(view);
        CountDownTextView countDownTextView = (CountDownTextView) this.itemView.findViewById(R.id.f9g);
        this.f20082b = countDownTextView;
        countDownTextView.setCountDownListener(new CountDownTextView.a() {
            /* class com.bytedance.android.livesdk.olddialog.giftpanellist.c.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11857);
            }

            @Override // com.bytedance.android.livesdk.widget.CountDownTextView.a
            public final void a(TextView textView) {
                long j2;
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                com.bytedance.android.livesdk.service.assets.j a2 = com.bytedance.android.livesdk.service.assets.j.a();
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                a2.b(j2);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        if (this.q) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            a.a(view).start();
        } else if (1 == motionEvent.getAction()) {
            a.b(view).start();
        } else if (3 == motionEvent.getAction()) {
            a.b(view).start();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar, int i2) {
        String quantityString;
        this.f20059g.setVisibility(0);
        super.a(bVar, i2);
        if (bVar instanceof d) {
            int i3 = ((Prop) bVar.f17864b).count;
            if (i3 == 0) {
                this.f20065m.setAlpha(0.5f);
            }
            this.f20081a.setText("x".concat(String.valueOf(i3)));
            if (((Prop) bVar.f17864b).nextExpire > 0) {
                long currentTimeMillis = ((Prop) bVar.f17864b).nextExpire - ((System.currentTimeMillis() / 1000) + ((Prop) bVar.f17864b).getNowTimeDiff());
                if (currentTimeMillis <= 0) {
                    quantityString = this.f20082b.getContext().getResources().getString(R.string.gr2, "00:00");
                } else if (currentTimeMillis < 3600) {
                    quantityString = this.f20082b.getContext().getResources().getString(R.string.gr2, an.a(currentTimeMillis));
                    CountDownTextView countDownTextView = this.f20082b;
                    long j2 = (currentTimeMillis - 0) + 1;
                    if (j2 > 0) {
                        countDownTextView.f22471a = com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(j2).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new CountDownTextView.b(countDownTextView, currentTimeMillis), CountDownTextView.c.f22477a);
                    }
                } else if (currentTimeMillis < 86400) {
                    int i4 = (int) (currentTimeMillis / 3600);
                    quantityString = this.f20082b.getContext().getResources().getQuantityString(R.plurals.il, i4, Integer.valueOf(i4));
                } else {
                    int i5 = (int) (currentTimeMillis / 86400);
                    quantityString = this.f20082b.getContext().getResources().getQuantityString(R.plurals.ik, i5, Integer.valueOf(i5));
                }
                this.f20082b.setText(quantityString);
                this.f20082b.setVisibility(0);
                return;
            }
            this.f20082b.setVisibility(4);
        }
    }
}
