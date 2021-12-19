package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class g extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public int f105760a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f105761b;

    /* renamed from: c  reason: collision with root package name */
    protected Banner f105762c;

    /* renamed from: d  reason: collision with root package name */
    private int f105763d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f105764e = new int[2];

    static {
        Covode.recordClassIndex(67712);
    }

    class a implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f105766b;

        static {
            Covode.recordClassIndex(67713);
        }

        private void a() {
            this.f105766b = false;
            g.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = g.this.f105762c;
            Rect rect = new Rect();
            if (!g.a(g.this.itemView) || !g.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f105766b) {
                    r.a("banner_show", new d().a("enter_from", "change_music_page").a("banner_id", g.this.f105762c.getBid()).a("client_order", Integer.toString(g.this.f105760a)).f66730a);
                }
                this.f105766b = z;
            }
            g.this.itemView.postDelayed(this, 250);
        }

        public final void onViewDetachedFromWindow(View view) {
            a();
        }

        private a() {
        }

        public final void onViewAttachedToWindow(View view) {
            a();
            run();
        }

        /* synthetic */ a(g gVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        String str;
        Banner banner = this.f105762c;
        if (banner != null && !TextUtils.isEmpty(banner.getSchema())) {
            String schema = this.f105762c.getSchema();
            String str2 = "";
            if (schema != null && schema.startsWith("aweme://assmusic/category/")) {
                if (!schema.contains("?")) {
                    str = schema + "?musicType=" + this.f105763d;
                } else {
                    str = schema + "&musicType=" + this.f105763d;
                }
                SmartRouter.buildRoute(this.itemView.getContext(), str).open(10086);
                String b2 = v.b(this.f105762c.getSchema(), StringSet.name);
                String bid = this.f105762c.getBid();
                List<String> a2 = v.a(str);
                if (!b.a((Collection) a2) && a2.size() >= 2) {
                    str2 = a2.get(1);
                }
                c.a(b2, "click_banner", bid, "change_music_page", str2);
            } else if (TextUtils.isEmpty(schema) || (!schema.startsWith("http://") && !schema.startsWith("https://"))) {
                SmartRouter.buildRoute(this.itemView.getContext(), this.f105762c.getSchema()).withParam("process_id", UUID.randomUUID().toString()).open(10086);
                List<String> a3 = v.a(this.f105762c.getSchema());
                if (!b.a((Collection) a3) && a3.size() > 1) {
                    new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", str2, "click_banner", c.f105649a);
                }
            } else {
                try {
                    SmartRouter.buildRoute(this.itemView.getContext(), "aweme://webview/?url=" + URLEncoder.encode(schema, "UTF-8")).open(10086);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static boolean a(View view) {
        if (view == null || !androidx.core.h.v.y(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    public g(View view, int i2) {
        super(view);
        this.f105763d = i2;
        a aVar = new a(this, (byte) 0);
        view.addOnAttachStateChangeListener(aVar);
        if (androidx.core.h.v.y(view)) {
            aVar.run();
        }
        this.f105761b = (SmartImageView) view.findViewById(R.id.dtl);
        View findViewById = view.findViewById(R.id.dtl);
        if (findViewById != null) {
            findViewById.setOnClickListener(new h(this));
        }
        this.f105764e[0] = n.a(view.getContext()) - ((int) (n.b(view.getContext(), 16.0f) * 2.0f));
        int[] iArr = this.f105764e;
        iArr[1] = (int) (((float) iArr[0]) * 0.26239067f);
    }

    public final void a(Banner banner, int i2) {
        if (banner != null && banner != this.f105762c) {
            this.f105762c = banner;
            if (banner.getBannerUrl() != null && !b.a((Collection) this.f105762c.getBannerUrl().getUrlList())) {
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(this.f105762c.getBannerUrl())).b(em.a(601)).a(this.f105764e);
                a2.f39907c = true;
                com.bytedance.lighten.a.v a3 = a2.a("MusicBannerViewHolder");
                a3.E = this.f105761b;
                a3.c();
            }
            new com.ss.android.ugc.aweme.commercialize.ad.b((float) com.ss.android.ugc.aweme.base.utils.n.a(4.0d), this.itemView.getContext().getResources().getColor(R.color.oa)).setAlpha(76);
            this.f105760a = i2 + 1;
        }
    }
}
