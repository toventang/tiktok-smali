package com.ss.android.ugc.aweme.i18n.language.a;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.l;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f99767a = ((RecyclerView) findViewById(R.id.cbe));

    /* renamed from: b  reason: collision with root package name */
    boolean f99768b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f99769c;

    static {
        Covode.recordClassIndex(63612);
    }

    @Override // com.ss.android.ugc.aweme.views.o
    public final void aj_() {
        this.f144695l = (int) n.b(d.a(), 280.0f);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f99768b) {
            v.O().y();
            this.f99768b = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (v.O().o()) {
            v.O().B();
            this.f99768b = true;
            return;
        }
        this.f99769c.postDelayed(new d(this), 1000);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, String[] strArr) {
        super(context, R.style.vc, false, true);
        setContentView(R.layout.md);
        findViewById(R.id.a1s).setOnClickListener(new b(this));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(c.f99771a);
        ArrayList arrayList = new ArrayList();
        Map<String, b> j2 = SettingServiceImpl.v().j();
        HashMap hashMap = new HashMap();
        for (b bVar : j2.values()) {
            hashMap.put(bVar.a(), bVar);
        }
        for (String str : strArr) {
            Object obj = hashMap.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        this.f99767a.setLayoutManager(new WrapLinearLayoutManager());
        this.f99767a.b(new l(com.ss.android.ugc.aweme.base.utils.n.a(0.5d), Color.parseColor("#20161823")));
        this.f99767a.setAdapter(new e(context, arrayList, this));
        this.f99769c = new Handler();
        r.a("show_language_popup", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").f66730a);
    }
}
