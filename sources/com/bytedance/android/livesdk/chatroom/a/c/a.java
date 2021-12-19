package com.bytedance.android.livesdk.chatroom.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.utils.ag;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.barrage.a.c;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final View f14897a;

    /* renamed from: b  reason: collision with root package name */
    public c f14898b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f14899c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f14900d;

    /* renamed from: e  reason: collision with root package name */
    final ImageView f14901e;

    /* renamed from: f  reason: collision with root package name */
    final TextView f14902f;

    /* renamed from: g  reason: collision with root package name */
    final ImageView f14903g;

    /* renamed from: h  reason: collision with root package name */
    final TextView f14904h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f14905i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f14906j;

    /* renamed from: k  reason: collision with root package name */
    private final ImageView f14907k;

    static {
        Covode.recordClassIndex(8256);
    }

    public a(View view, cc ccVar) {
        ImageModel background;
        FansClubData fansClubData;
        this.f14897a = view;
        TextView textView = (TextView) view.findViewById(R.id.exf);
        this.f14906j = textView;
        textView.setText(ccVar.f19463f);
        int i2 = Build.VERSION.SDK_INT;
        if (!com.bytedance.android.live.uikit.c.a.a(y.e())) {
            textView.setTextDirection(3);
        }
        this.f14899c = (ImageView) view.findViewById(R.id.bf0);
        ImageView imageView = (ImageView) view.findViewById(R.id.bxp);
        this.f14900d = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.b04);
        this.f14901e = imageView2;
        TextView textView2 = (TextView) view.findViewById(R.id.b05);
        this.f14902f = textView2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.b9r);
        this.f14903g = imageView3;
        TextView textView3 = (TextView) view.findViewById(R.id.b9s);
        this.f14904h = textView3;
        ImageView imageView4 = (ImageView) view.findViewById(R.id.sz);
        this.f14905i = imageView4;
        TextView textView4 = (TextView) view.findViewById(R.id.f3f);
        this.f14907k = (ImageView) view.findViewById(R.id.e7y);
        ((e) com.bytedance.android.live.t.a.a(e.class)).a(ccVar.f19464g.getAvatarThumb(), new e.b() {
            /* class com.bytedance.android.livesdk.chatroom.a.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8257);
            }

            @Override // com.bytedance.android.livesdkapi.host.e.b
            public final void a(Bitmap bitmap) {
                Bitmap a2;
                if (bitmap != null && !bitmap.isRecycled() && (a2 = com.bytedance.android.livesdk.gift.c.a.a.a.a(bitmap)) != null && !a2.isRecycled()) {
                    a.this.f14899c.setImageBitmap(a2);
                    if (a.this.f14898b != null) {
                        a.this.f14898b.a(a.this.f14897a);
                    }
                }
            }
        });
        if (ccVar.f19464g.getUserHonor() == null || ccVar.f19464g.getUserHonor().f19046m <= 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            ((e) com.bytedance.android.live.t.a.a(e.class)).a(ccVar.f19464g.getUserHonor().n(), new e.b() {
                /* class com.bytedance.android.livesdk.chatroom.a.c.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8258);
                }

                @Override // com.bytedance.android.livesdkapi.host.e.b
                public final void a(Bitmap bitmap) {
                    MethodCollector.i(6223);
                    if (bitmap == null || bitmap.isRecycled()) {
                        MethodCollector.o(6223);
                        return;
                    }
                    ImageView imageView = a.this.f14900d;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    RectF rectF = new RectF(rect);
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    canvas.drawOval(rectF, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                    imageView.setImageBitmap(createBitmap);
                    a.this.f14900d.setVisibility(0);
                    if (a.this.f14898b != null) {
                        a.this.f14898b.a(a.this.f14897a);
                    }
                    MethodCollector.o(6223);
                }
            });
        }
        textView4.setText(ccVar.f19464g.getNickName());
        textView4.measure(0, 0);
        textView.measure(0, 0);
        if (textView.getMeasuredWidth() < textView4.getMeasuredWidth()) {
            textView.setWidth(textView4.getMeasuredWidth());
        }
        if (ccVar.f19467j != null) {
            if (!(ccVar.f19467j.f19626a == null || ccVar.f19467j.f19626a.getUrls() == null)) {
                ag.a(ccVar.f19467j.f19626a, textView, com.bytedance.android.live.uikit.c.a.a(y.e()), new b(this));
            }
            if (!(ccVar.f19467j.f19627b == null || imageView4 == null)) {
                ((e) com.bytedance.android.live.t.a.a(e.class)).a(ccVar.f19467j.f19627b, new e.b() {
                    /* class com.bytedance.android.livesdk.chatroom.a.c.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(8259);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.e.b
                    public final void a(Bitmap bitmap) {
                        MethodCollector.i(6132);
                        if (bitmap == null || bitmap.isRecycled()) {
                            MethodCollector.o(6132);
                            return;
                        }
                        a.this.f14905i.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
                        if (a.this.f14898b != null) {
                            a.this.f14898b.a(a.this.f14897a);
                        }
                        MethodCollector.o(6132);
                    }
                });
            }
        }
        User user = ccVar.f19464g;
        if (user != null) {
            if (user.getFansClub() != null) {
                if (FansClubData.isValid(user.getFansClub().getData())) {
                    fansClubData = user.getFansClub().getData();
                } else if (user.getFansClub().getPreferData() != null) {
                    fansClubData = user.getFansClub().getPreferData().get(1);
                } else {
                    fansClubData = null;
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel = fansClubData.badge.icons.get(2);
                    if (imageModel != null) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f22991a = fansClubData.clubName;
                        g.a(textImageModel).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, fansClubData), new d(this));
                    }
                } else if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
            FraternityInfo fraternityInfo = user.getFraternityInfo();
            if (!(imageView3 == null || textView3 == null)) {
                if (fraternityInfo == null || !fraternityInfo.isValid() || (background = fraternityInfo.getBackground()) == null) {
                    this.f14903g.setVisibility(8);
                    this.f14904h.setVisibility(8);
                } else {
                    TextImageModel textImageModel2 = new TextImageModel(background, 4);
                    textImageModel2.f22991a = fraternityInfo.getName();
                    try {
                        textImageModel2.f22992b = Color.parseColor(fraternityInfo.getFontColor());
                    } catch (IllegalArgumentException e2) {
                        com.bytedance.android.live.core.c.a.a(5, "BarrageViewHolder", null, e2);
                    }
                    g.a(textImageModel2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this, textImageModel2), new f(this));
                }
            }
        }
        if (ccVar.f19464g == null || TextUtils.isEmpty(ccVar.f19464g.getSpecialId())) {
            this.f14907k.setVisibility(8);
        } else {
            this.f14907k.setVisibility(0);
        }
        c cVar = new c(this.f14897a);
        this.f14898b = cVar;
        cVar.f154066i = ccVar.c();
        UserProfileEvent userProfileEvent = new UserProfileEvent(ccVar.f19464g);
        userProfileEvent.mSource = "live_barrage";
        this.f14898b.f154064g = new g(userProfileEvent);
    }
}
