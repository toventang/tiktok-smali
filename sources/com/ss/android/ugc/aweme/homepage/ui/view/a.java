package com.ss.android.ugc.aweme.homepage.ui.view;

import android.content.Context;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.profile.f.ai;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static float f99524a;

    /* renamed from: b  reason: collision with root package name */
    public static float f99525b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f99526c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final a f99527d = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(63476);
    }

    private static SpecialTopicEntry a() {
        try {
            return (SpecialTopicEntry) b.a().a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static float b(Context context, float f2) {
        float b2;
        l.d(context, "");
        if (b.a().a(true, "i18n_following_badge_type_number", false)) {
            b2 = n.b(context, 82.0f);
        } else {
            b2 = n.b(context, 57.0f);
        }
        return f2 + b2;
    }

    public static float a(Context context, boolean z) {
        float f2;
        l.d(context, "");
        SpecialTopicEntry a2 = a();
        float b2 = n.b(context, 20.0f);
        if (a2 == null || !a2.getEnable() || a2.getLandingRoute().length() <= 0 || a2.getIconUrl().length() <= 0 || (ai.d() && !a2.getChildViewable())) {
            f2 = 0.0f;
        } else if (z) {
            f2 = n.b(context, 56.0f);
        } else {
            f2 = n.b(context, 40.0f);
        }
        return b2 + f2;
    }

    public static int a(Context context, float f2) {
        l.d(context, "");
        float b2 = b(context, f2);
        int a2 = n.a(context);
        float f3 = f99524a;
        if (f3 == 0.0f) {
            f3 = a(context, true);
        }
        float f4 = f99525b;
        if (f4 == 0.0f) {
            f4 = a(context, false);
        }
        float f5 = (float) a2;
        if (b2 <= f5 - (f3 * 2.0f)) {
            f99526c = true;
            return 17;
        } else if (b2 <= f5 - (f4 * 2.0f)) {
            f99526c = false;
            return 17;
        } else if (b2 < f5 - n.b(context, 72.0f)) {
            f99526c = false;
            return 16;
        } else {
            f99526c = false;
            return 14;
        }
    }
}
