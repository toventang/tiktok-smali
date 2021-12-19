package com.ss.android.ugc.aweme.ug.guide;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.tooltip.b;
import com.ss.android.ugc.aweme.experiment.gl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.ug.guide.a.a;
import com.ss.android.ugc.aweme.utils.bo;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Long f141919a;

    /* renamed from: b  reason: collision with root package name */
    public static Long f141920b;

    /* renamed from: c  reason: collision with root package name */
    public static Handler f141921c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    static a f141922d;

    /* renamed from: e  reason: collision with root package name */
    public static Runnable f141923e = b.f141929a;

    /* renamed from: f  reason: collision with root package name */
    public static final g f141924f = new g();

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, Long> f141925g;

    /* renamed from: h  reason: collision with root package name */
    private static final Type f141926h;

    /* renamed from: i  reason: collision with root package name */
    private static SharedPreferences f141927i;

    /* renamed from: j  reason: collision with root package name */
    private static List<String> f141928j;

    public interface a {
        static {
            Covode.recordClassIndex(92733);
        }

        void a();
    }

    public static final class e extends com.google.gson.b.a<Map<String, Long>> {
        static {
            Covode.recordClassIndex(92737);
        }

        e() {
        }
    }

    private g() {
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141929a = new b();

        static {
            Covode.recordClassIndex(92734);
        }

        b() {
        }

        public final void run() {
            a aVar = g.f141922d;
            if (aVar != null) {
                g.c();
                aVar.a();
            }
        }
    }

    public static final class d implements b.AbstractC0734b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f141931a;

        static {
            Covode.recordClassIndex(92736);
        }

        @Override // com.bytedance.ies.dmt.ui.tooltip.b.AbstractC0734b
        public final void a() {
            f fVar = this.f141931a;
            if (fVar != null) {
                fVar.accept(false);
            }
        }

        d(f fVar) {
            this.f141931a = fVar;
        }
    }

    public static void b() {
        Long l2 = f141919a;
        if (l2 != null) {
            f141921c.postDelayed(f141923e, l2.longValue());
        }
    }

    public static void c() {
        f141921c.removeCallbacks(f141923e);
        f141920b = null;
        f141919a = null;
    }

    public static void a() {
        f141920b = Long.valueOf(System.currentTimeMillis());
        f141919a = 5000L;
        f141921c.postDelayed(f141923e, 5000);
    }

    private static List<String> d() {
        if (f141928j == null) {
            f141928j = com.ss.android.ugc.aweme.base.h.d.g().a("stay_home_ids", String.class);
        }
        return f141928j;
    }

    static {
        Map<String, Long> map;
        Covode.recordClassIndex(92732);
        f141925g = new LinkedHashMap();
        Type type = new e().type;
        f141926h = type;
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "sp_stay_home_guide_cache", 0);
        l.b(a2, "");
        f141927i = a2;
        try {
            Object a3 = new com.google.gson.f().a(a2.getString("sp_stay_home_cache_video_id", ""), type);
            l.b(a3, "");
            map = (Map) a3;
        } catch (Exception unused) {
            map = new LinkedHashMap<>();
        }
        f141925g = map;
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        f141922d = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f141930a;

        static {
            Covode.recordClassIndex(92735);
        }

        c(f fVar) {
            this.f141930a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f fVar = this.f141930a;
            if (fVar != null) {
                fVar.accept(true);
            }
        }
    }

    private static Long a(String str) {
        return f141925g.get(str);
    }

    private static void b(String str) {
        if (!f141925g.containsKey(str)) {
            if (f141925g.size() >= 20) {
                f141925g.entrySet().remove(n.c((Iterable) f141925g.entrySet()));
            }
            f141925g.put(str, Long.valueOf(System.currentTimeMillis()));
            f141927i.edit().putString("sp_stay_home_cache_video_id", new com.google.gson.f().b(f141925g, f141926h)).apply();
        }
    }

    public static boolean c(Aweme aweme) {
        if (e(aweme)) {
            return false;
        }
        if (!d(aweme) || gl.a()) {
            return true;
        }
        if (!(aweme == null || aweme.getAid() == null)) {
            String aid = aweme.getAid();
            l.b(aid, "");
            Long a2 = a(aid);
            if (a2 != null) {
                a2.longValue();
                if (System.currentTimeMillis() - a2.longValue() > 86400000) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        List<String> d2;
        String cid;
        if (!(aweme == null || (textExtra = aweme.getTextExtra()) == null || textExtra.size() <= 0 || (d2 = d()) == null || d2.size() <= 0)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                Iterator<String> it = d2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (!(textExtraStruct == null || (cid = textExtraStruct.getCid()) == null || !cid.equals(next))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean e(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.guide.g.e(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || f141925g.containsKey(aweme.getAid())) {
            return false;
        }
        int d2 = (int) (bo.d(System.currentTimeMillis()) / 86400000);
        if (f141927i.getInt("sp_modified_button_date", -1) != d2) {
            f141927i.edit().putInt("sp_modified_button_date", d2).apply();
            f141927i.edit().putInt("sp_modified_button_count", 0).apply();
        } else {
            f141927i.edit().putInt("sp_modified_button_count", f141927i.getInt("sp_modified_button_count", 0) + 1).apply();
        }
        if (f141927i.getInt("sp_modified_button_count", 0) < 7) {
            String aid = aweme.getAid();
            l.b(aid, "");
            b(aid);
            return true;
        }
        return false;
    }

    public static boolean b(Aweme aweme) {
        int d2;
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || f141925g.containsKey(aweme.getAid()) || f141927i.getInt("sp_toast_guide_date", -1) == (d2 = (int) (bo.d(System.currentTimeMillis()) / 86400000))) {
            return false;
        }
        f141927i.edit().putInt("sp_toast_guide_date", d2).apply();
        String aid = aweme.getAid();
        l.b(aid, "");
        b(aid);
        return true;
    }

    public static PopupWindow a(Activity activity, View view, f<Boolean> fVar) {
        l.d(activity, "");
        l.d(view, "");
        if (a.C3776a.a(activity)) {
            return null;
        }
        com.bytedance.ies.dmt.ui.tooltip.a a2 = new com.bytedance.ies.dmt.ui.tooltip.b(activity).a(R.string.hab).a(view).a(false).c(androidx.core.content.b.c(activity, R.color.f159928l)).a(-1001L).b(8388611).a(new c(fVar)).a(new d(fVar)).a();
        a2.a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.PopupWindow");
        return (PopupWindow) a2;
    }
}
