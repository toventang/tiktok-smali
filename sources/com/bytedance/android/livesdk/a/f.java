package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.s.b;
import com.bytedance.android.live.s.c;
import com.bytedance.android.live.s.g;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.o;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f extends RecyclerView.ViewHolder implements b, c, g {

    /* renamed from: a  reason: collision with root package name */
    VHeadView f13261a;

    /* renamed from: b  reason: collision with root package name */
    TextView f13262b;

    /* renamed from: c  reason: collision with root package name */
    View f13263c;

    /* renamed from: d  reason: collision with root package name */
    View f13264d;

    /* renamed from: e  reason: collision with root package name */
    TextView f13265e;

    /* renamed from: f  reason: collision with root package name */
    TextView f13266f;

    /* renamed from: g  reason: collision with root package name */
    public HSImageView f13267g;

    /* renamed from: h  reason: collision with root package name */
    Context f13268h;

    /* renamed from: i  reason: collision with root package name */
    List<User> f13269i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    String f13270j;

    /* renamed from: k  reason: collision with root package name */
    User f13271k;

    /* renamed from: l  reason: collision with root package name */
    long f13272l;

    /* renamed from: m  reason: collision with root package name */
    long f13273m;
    private b n;

    static {
        Covode.recordClassIndex(7386);
    }

    @Override // com.bytedance.android.live.s.b
    public final void a() {
    }

    @Override // com.bytedance.android.live.s.c
    public final void a(com.bytedance.android.live.s.a.c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.b
    public final void b(com.bytedance.android.live.s.a.c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.c
    public final void c() {
    }

    @Override // com.bytedance.android.live.s.b
    public final void d() {
    }

    @Override // com.bytedance.android.live.s.c
    public final void k_() {
    }

    public static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f13273m));
        hashMap.put("room_id", String.valueOf(this.f13272l));
        return hashMap;
    }

    static String a(User user) {
        if (user == null) {
            return null;
        }
        return com.bytedance.android.livesdk.ac.g.a(user);
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(Exception exc) {
        this.f13262b.setVisibility(0);
        this.f13264d.setVisibility(8);
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(boolean z) {
        if (!z) {
            c cVar = new c(this.f13271k.getId());
            a.a().a(cVar);
            b bVar = this.n;
            if (bVar != null) {
                bVar.a(cVar);
            }
            this.f13262b.setVisibility(0);
            this.f13264d.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.s.b
    public final void b(boolean z) {
        if (!z) {
            this.f13262b.setVisibility(0);
            this.f13264d.setVisibility(8);
            o oVar = new o(false, this.f13271k.getId());
            b bVar = this.n;
            if (bVar != null) {
                bVar.a(oVar);
            }
            a.a().a(oVar);
        }
    }

    @Override // com.bytedance.android.live.s.b
    public final void a(boolean z, Exception exc) {
        if (!z) {
            this.f13262b.setVisibility(0);
            this.f13264d.setVisibility(8);
            com.bytedance.android.livesdk.utils.f.a(this.f13268h, exc);
        }
    }

    public f(Context context, View view, String str, long j2, long j3, b bVar) {
        super(view);
        this.f13261a = (VHeadView) view.findViewById(R.id.bfb);
        this.f13262b = (TextView) view.findViewById(R.id.a1s);
        this.f13264d = view.findViewById(R.id.a1z);
        this.f13265e = (TextView) view.findViewById(R.id.cv_);
        this.f13266f = (TextView) view.findViewById(R.id.fdm);
        this.f13267g = (HSImageView) view.findViewById(R.id.fd6);
        this.f13263c = view.findViewById(R.id.a1x);
        this.f13268h = context;
        this.f13270j = str;
        this.f13272l = j2;
        this.f13273m = j3;
        this.n = bVar;
    }
}
