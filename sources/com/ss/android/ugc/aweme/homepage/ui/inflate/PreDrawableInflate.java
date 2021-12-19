package com.ss.android.ugc.aweme.homepage.ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.s.a;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PreDrawableInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f99511a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Drawable> f99512b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Class<? extends Activity> f99513c;

    static {
        Covode.recordClassIndex(63469);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        Class<? extends Activity> cls = this.f99513c;
        if (cls != null) {
            return cls;
        }
        return HomePageUIFrameServiceImpl.e().a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private void b(int i2, Context context) {
        try {
            this.f99512b.put(Integer.valueOf(i2), context.getResources().getDrawable(i2));
        } catch (Exception unused) {
        }
    }

    public final Drawable a(int i2, Context context) {
        Drawable remove = this.f99512b.remove(Integer.valueOf(i2));
        if (remove == null) {
            return context.getResources().getDrawable(i2);
        }
        return remove;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        b(R.drawable.b0f, context);
        b(R.drawable.c4, context);
        b(2131232126, context);
        if (SearchServiceImpl.t().i()) {
            b(2131232115, context);
            b(2131232113, context);
            b(2131232114, context);
        } else {
            b(2131232129, context);
            b(2131232128, context);
            b(2131232131, context);
        }
        b(2131232125, context);
        b(2131232117, context);
        b(2131232122, context);
        b(R.drawable.aam, context);
        b(2131232137, context);
        if (((Boolean) a.f120731e.getValue()).booleanValue()) {
            b(2131232324, context);
            b(R.drawable.a_o, context);
            b(2131233141, context);
            b(R.drawable.b1s, context);
            b(2131233874, context);
            b(R.drawable.a_q, context);
            b(R.color.a2, context);
        }
        try {
            this.f99511a.put("status_bar_height", Integer.valueOf(context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
        } catch (Exception unused) {
        }
    }
}
