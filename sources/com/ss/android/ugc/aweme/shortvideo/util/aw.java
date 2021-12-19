package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.tools.f.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static final aw f132242a = new aw();

    private aw() {
    }

    static {
        Covode.recordClassIndex(86602);
    }

    public static final class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final int f132243a;

        static {
            Covode.recordClassIndex(86603);
        }

        public a(int i2) {
            this.f132243a = i2;
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (view instanceof TextView) {
                ((TextView) view).setHighlightColor(0);
            }
            Context context = view.getContext();
            l.b(context, "");
            aw.a(context, "post_page");
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f132243a);
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }
    }

    public static final a a(int i2) {
        return new a(i2);
    }

    public static final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        try {
            r.a("enter_music_usage_confimation", new b().a("enter_method", str).f149193a);
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            AdFeSettings adFeSettings = iESSettingsProxy.getAdFeSettings();
            if (adFeSettings != null) {
                String musicLegalPage = adFeSettings.getMusicLegalPage();
                String string = context.getResources().getString(R.string.esv);
                l.b(string, "");
                if (!TextUtils.isEmpty(musicLegalPage)) {
                    com.ss.android.ugc.aweme.port.in.c.f115633l.a(context, musicLegalPage, string);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
