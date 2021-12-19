package com.ss.android.ugc.aweme.sticker.types.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.android.ugc.aweme.sticker.model.h;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f135741a;

    /* renamed from: b  reason: collision with root package name */
    private b f135742b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f135743c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f135744d;

    /* renamed from: e  reason: collision with root package name */
    private SimpleDraweeView f135745e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f135746f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f135747g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, c> f135748h = new HashMap();

    static {
        Covode.recordClassIndex(88731);
    }

    private void a(c cVar, boolean z) {
        if (cVar == null) {
            this.f135744d.setVisibility(8);
            return;
        }
        this.f135742b.a(cVar.getId());
        this.f135744d.setVisibility(0);
        UrlModel screenIcon = cVar.getScreenIcon();
        if (screenIcon != null) {
            this.f135745e.setVisibility(0);
            com.ss.android.ugc.tools.c.a.b(this.f135745e, screenIcon);
        } else {
            this.f135745e.setVisibility(8);
        }
        this.f135746f.setText(cVar.getScreenDesc());
        long expireTime = cVar.getExpireTime();
        String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
        if (expireTime == 0 || TextUtils.isEmpty(format) || !z) {
            this.f135747g.setVisibility(8);
            return;
        }
        this.f135747g.setVisibility(0);
        this.f135747g.setText(this.f135741a.getString(R.string.dnt, format));
    }

    public final boolean a(Effect effect, int i2) {
        if (com.ss.android.ugc.aweme.port.in.c.u.a()) {
            this.f135744d.setVisibility(8);
            return false;
        } else if (com.ss.android.ugc.aweme.shortvideo.sticker.c.e(effect)) {
            return false;
        } else {
            if (effect == null || i2 == 0 || !effect.isBusiness()) {
                this.f135744d.setVisibility(8);
                return false;
            } else if (this.f135748h.containsKey(effect.getEffectId())) {
                a(this.f135748h.get(effect.getEffectId()), com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect));
                return true;
            } else {
                this.f135743c = effect;
                String effectId = effect.getEffectId();
                i.b(new b(effectId), i.f4824a).a(new c(this, effectId, effect), i.f4826c, null);
                return true;
            }
        }
    }

    public a(LinearLayout linearLayout, b bVar, Context context) {
        this.f135741a = context;
        this.f135742b = bVar;
        this.f135744d = linearLayout;
        this.f135745e = (SimpleDraweeView) linearLayout.findViewById(R.id.abm);
        this.f135746f = (TextView) linearLayout.findViewById(R.id.abl);
        this.f135747g = (TextView) linearLayout.findViewById(R.id.abo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(String str, Effect effect, i iVar) {
        if (!TextUtils.equals(this.f135743c.getEffectId(), str)) {
            return null;
        }
        if (iVar.b() || iVar.c()) {
            a(this.f135748h.get(str), com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect));
            return null;
        }
        try {
            c cVar = ((h) iVar.d()).mStickers.get(0).commerceSticker;
            this.f135748h.put(str, cVar);
            a(cVar, com.ss.android.ugc.aweme.shortvideo.sticker.c.c(effect));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
