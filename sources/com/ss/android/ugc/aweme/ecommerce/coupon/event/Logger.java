package com.ss.android.ugc.aweme.ecommerce.coupon.event;

import android.os.SystemClock;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class Logger implements au {

    /* renamed from: a  reason: collision with root package name */
    public String f85760a;

    /* renamed from: b  reason: collision with root package name */
    private String f85761b;

    /* renamed from: c  reason: collision with root package name */
    private String f85762c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f85763d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f85764e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f85765f;

    /* renamed from: g  reason: collision with root package name */
    private final LinkedHashMap<String, Object> f85766g;

    /* renamed from: h  reason: collision with root package name */
    private b f85767h;

    static {
        Covode.recordClassIndex(53631);
    }

    private Logger(char c2) {
        this((byte) 0);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    private Logger() {
        this.f85765f = new ArrayList();
        this.f85766g = new LinkedHashMap<>();
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        String str;
        b bVar = this.f85767h;
        if (bVar != null) {
            bVar.a(this.f85766g);
            bVar.a(this.f85763d);
            if (this.f85764e) {
                str = "return";
            } else {
                str = "close";
            }
            l.d(str, "");
            bVar.f87523k.put("quit_type", str);
            if (bVar.f85769b > 0) {
                bVar.f87523k.put("stay_time", Long.valueOf(SystemClock.uptimeMillis() - bVar.f85769b));
                bVar.d();
            }
        }
        this.f85767h = null;
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        b bVar = new b();
        bVar.a(this.f85766g);
        String str = this.f85761b;
        if (str == null) {
            l.a("pageName");
        }
        l.d(str, "");
        bVar.f87523k.put("page_name", str);
        String str2 = this.f85762c;
        if (str2 == null) {
            l.a("previousPage");
        }
        l.d(str2, "");
        bVar.f87523k.put("previous_page", str2);
        String str3 = this.f85760a;
        if (str3 != null) {
            bVar.f87523k.put("entrance_info", str3);
        }
        bVar.a(true);
        bVar.f85769b = SystemClock.uptimeMillis();
        this.f85767h = bVar;
    }

    private /* synthetic */ Logger(byte b2) {
        this();
    }
}
