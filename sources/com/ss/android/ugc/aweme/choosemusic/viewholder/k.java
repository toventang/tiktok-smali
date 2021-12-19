package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.ck.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class k extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public int f70907a;

    /* renamed from: b  reason: collision with root package name */
    SmartImageView f70908b;

    /* renamed from: c  reason: collision with root package name */
    protected Banner f70909c;

    /* renamed from: d  reason: collision with root package name */
    private int f70910d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f70911e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    private int f70912f;

    static {
        Covode.recordClassIndex(43682);
    }

    class a implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f70914b;

        static {
            Covode.recordClassIndex(43683);
        }

        private void a() {
            this.f70914b = false;
            k.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = k.this.f70909c;
            Rect rect = new Rect();
            if (!k.a(k.this.itemView) || !k.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f70914b) {
                    r.a("banner_show", new d().a("enter_from", "change_music_page").a("banner_id", k.this.f70909c.getBid()).a("client_order", Integer.toString(k.this.f70907a)).f66730a);
                }
                this.f70914b = z;
            }
            k.this.itemView.postDelayed(this, 250);
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

        /* synthetic */ a(k kVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        String str;
        Banner banner = this.f70909c;
        if (banner != null && !TextUtils.isEmpty(banner.getSchema())) {
            String schema = this.f70909c.getSchema();
            String str2 = "";
            if (schema != null && schema.startsWith("aweme://assmusic/category/")) {
                if (!schema.contains("?")) {
                    str = schema + "?musicType=" + this.f70910d;
                } else {
                    str = schema + "&musicType=" + this.f70910d;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), str);
                buildRoute.withParam("sound_page_scene", this.f70912f).withParam("extra_music_from", "choose_music_with_banner");
                buildRoute.open(10086);
                String b2 = v.b(this.f70909c.getSchema(), StringSet.name);
                String bid = this.f70909c.getBid();
                List<String> a2 = v.a(str);
                if (!b.a((Collection) a2) && a2.size() >= 2) {
                    str2 = a2.get(1);
                }
                com.ss.android.ugc.aweme.choosemusic.utils.b.a(b2, "click_banner", bid, "change_music_page", str2);
            } else if (TextUtils.isEmpty(schema) || (!schema.startsWith("http://") && !schema.startsWith("https://"))) {
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.itemView.getContext(), this.f70909c.getSchema()).withParam("process_id", uuid).withParam("extra_music_from", "choose_music_with_banner").open(10086);
                List<String> a3 = v.a(this.f70909c.getSchema());
                if (!b.a((Collection) a3) && a3.size() > 1) {
                    com.ss.android.ugc.aweme.choosemusic.utils.b.a(new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", str2, "click_banner", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a), a3.get(1), true, uuid);
                }
            } else {
                try {
                    SmartRouter.buildRoute(this.itemView.getContext(), "aweme://webview/?url=" + URLEncoder.encode(schema, "UTF-8")).open(10086);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            r.a("banner_click", new d().a("enter_from", "change_music_page").a("banner_id", this.f70909c.getBid()).a("client_order", Integer.toString(this.f70907a)).f66730a);
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

    public final void a(Banner banner, int i2) {
        if (banner != null && banner != this.f70909c) {
            this.f70909c = banner;
            if (banner.getBannerUrl() != null && !b.a((Collection) this.f70909c.getBannerUrl().getUrlList())) {
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(this.f70909c.getBannerUrl())).b(em.a(601)).a(this.f70911e);
                a2.f39907c = true;
                com.bytedance.lighten.a.v a3 = a2.a("MusicBannerViewHolder");
                a3.E = this.f70908b;
                a3.c();
            }
            new com.ss.android.ugc.aweme.commercialize.ad.b((float) n.a(4.0d), this.itemView.getContext().getResources().getColor(R.color.oa)).setAlpha(76);
            this.f70907a = i2 + 1;
        }
    }

    public k(View view, int i2, int i3) {
        super(view);
        this.f70910d = i2;
        this.f70912f = i3;
        a aVar = new a(this, (byte) 0);
        view.addOnAttachStateChangeListener(aVar);
        if (androidx.core.h.v.y(view)) {
            aVar.run();
        }
        this.f70908b = (SmartImageView) view.findViewById(R.id.dtl);
        View findViewById = view.findViewById(R.id.dtl);
        if (findViewById != null) {
            findViewById.setOnClickListener(new l(this));
        }
        this.f70911e[0] = com.bytedance.common.utility.n.a(view.getContext()) - ((int) (com.bytedance.common.utility.n.b(view.getContext(), 16.0f) * 2.0f));
        int[] iArr = this.f70911e;
        iArr[1] = (int) (((float) iArr[0]) * 0.26239067f);
    }
}
