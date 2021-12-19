package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.j;
import com.ss.android.ugc.aweme.editSticker.text.bean.k;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(55647);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.editSticker.text.bean.p a(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.p> r10) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.d.a(java.util.List):com.ss.android.ugc.aweme.editSticker.text.bean.p");
    }

    private static Paint.Join a(int i2) {
        if (i2 != Paint.Join.ROUND.ordinal()) {
            if (i2 == Paint.Join.BEVEL.ordinal()) {
                return Paint.Join.BEVEL;
            }
            if (i2 == Paint.Join.MITER.ordinal()) {
                return Paint.Join.MITER;
            }
        }
        return Paint.Join.ROUND;
    }

    private static Paint.Style b(int i2) {
        if (i2 != Paint.Style.FILL.ordinal()) {
            if (i2 == Paint.Style.STROKE.ordinal()) {
                return Paint.Style.STROKE;
            }
            if (i2 == Paint.Style.FILL_AND_STROKE.ordinal()) {
                return Paint.Style.FILL_AND_STROKE;
            }
        }
        return Paint.Style.FILL;
    }

    private static InnerEffectTextCoverConfig a(OuterEffectTextCoverConfig outerEffectTextCoverConfig, Context context) {
        InnerEffectTextShadowConfig innerEffectTextShadowConfig;
        l.d(outerEffectTextCoverConfig, "");
        l.d(context, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outerEffectTextCoverConfig.getStrokeConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(a((OuterEffectTextStrokeConfig) it.next(), context));
        }
        int parseColor = Color.parseColor(outerEffectTextCoverConfig.getTextColorStart());
        int parseColor2 = Color.parseColor(outerEffectTextCoverConfig.getTextColorEnd());
        k a2 = k.a.a(outerEffectTextCoverConfig.getGradientType());
        j a3 = j.a.a(outerEffectTextCoverConfig.getGradientOrientation());
        Paint.Style b2 = b(outerEffectTextCoverConfig.getPaintStyle());
        float a4 = r.a(context, outerEffectTextCoverConfig.getOffsetX());
        float a5 = r.a(context, outerEffectTextCoverConfig.getOffsetY());
        OuterEffectTextShadowConfig shadowConfig = outerEffectTextCoverConfig.getShadowConfig();
        if (shadowConfig != null) {
            innerEffectTextShadowConfig = a(shadowConfig, context);
        } else {
            innerEffectTextShadowConfig = null;
        }
        return new InnerEffectTextCoverConfig(parseColor, parseColor2, a2, a3, b2, a4, a5, arrayList, innerEffectTextShadowConfig);
    }

    private static InnerEffectTextShadowConfig a(OuterEffectTextShadowConfig outerEffectTextShadowConfig, Context context) {
        l.d(outerEffectTextShadowConfig, "");
        l.d(context, "");
        return new InnerEffectTextShadowConfig(r.a(context, outerEffectTextShadowConfig.getRadius()), r.a(context, outerEffectTextShadowConfig.getOffsetX()), r.a(context, outerEffectTextShadowConfig.getOffsetY()), Color.parseColor(outerEffectTextShadowConfig.getColor()));
    }

    private static InnerEffectTextStrokeConfig a(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, Context context) {
        l.d(outerEffectTextStrokeConfig, "");
        l.d(context, "");
        return new InnerEffectTextStrokeConfig(r.a(context, outerEffectTextStrokeConfig.getStrokeWidth()), Color.parseColor(outerEffectTextStrokeConfig.getStrokeColor()), a(outerEffectTextStrokeConfig.getStrokeJoin()));
    }

    public static final InnerEffectTextLayoutConfig a(OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, Context context, String str, List<p<String, String>> list) {
        l.d(outerEffectTextLayoutConfig, "");
        l.d(context, "");
        l.d(str, "");
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outerEffectTextLayoutConfig.getTextConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(a((OuterEffectTextConfig) it.next(), context, str, list));
        }
        outerEffectTextLayoutConfig.getLayoutType();
        m.LINEAR.getType();
        return new InnerEffectTextLayoutConfig(m.LINEAR, outerEffectTextLayoutConfig.getOrientation(), outerEffectTextLayoutConfig.getRotation(), (int) r.a(context, (float) outerEffectTextLayoutConfig.getPaddingStart()), (int) r.a(context, (float) outerEffectTextLayoutConfig.getPaddingEnd()), (int) r.a(context, (float) outerEffectTextLayoutConfig.getPaddingTop()), (int) r.a(context, (float) outerEffectTextLayoutConfig.getPaddingBottom()), arrayList, null, 256, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig a(com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig r46, android.content.Context r47, java.lang.String r48, java.util.List<h.p<java.lang.String, java.lang.String>> r49) {
        /*
        // Method dump skipped, instructions count: 643
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.d.a(com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig, android.content.Context, java.lang.String, java.util.List):com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig");
    }
}
