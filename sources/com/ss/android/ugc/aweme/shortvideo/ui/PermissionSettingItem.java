package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.model.a;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.da;
import com.ss.android.ugc.aweme.shortvideo.k.f;
import com.ss.android.ugc.aweme.shortvideo.k.l;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PermissionSettingItem extends PublishSettingItem implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f131122a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f131123b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f131124c;
    private ArrayList<View.OnClickListener> n;
    private int o = -1;
    private List<User> p;
    private int q;
    private String r;
    private int s;
    private String t = "0";

    static {
        Covode.recordClassIndex(85927);
    }

    public int getAllowRecommend() {
        return this.q;
    }

    public List<User> getExcludeUserList() {
        return this.p;
    }

    public String getMissionId() {
        return this.t;
    }

    public int getMissionStatus() {
        return this.s;
    }

    public int getPermission() {
        return this.o;
    }

    public String getPreventSelfSeeReason() {
        return this.r;
    }

    private static int b() {
        if (f.a()) {
            return 2131232507;
        }
        return 2131230993;
    }

    private static int d() {
        if (f.a()) {
            return 2131232509;
        }
        return 2131230959;
    }

    private static int e() {
        if (f.a()) {
            return 2131232508;
        }
        return 2131232381;
    }

    private static int f() {
        if (f.a()) {
            return 2131232509;
        }
        return 2131232397;
    }

    private void a() {
        if (!this.f131124c) {
            Keva repo = Keva.getRepo("publish_exclude");
            if (l.f128634a && !repo.getBoolean("exclude_guide_showed", false)) {
                a(true);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f99000d.getLayoutParams();
                layoutParams.bottomMargin = 0;
                this.f99000d.setLayoutParams(layoutParams);
                setSubtitle(b.a().getString(R.string.f10));
                this.f99003g.postDelayed(new Runnable() {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(85928);
                    }

                    public final void run() {
                        PermissionSettingItem permissionSettingItem = PermissionSettingItem.this;
                        permissionSettingItem.f99003g.postDelayed(new ab(permissionSettingItem), 500);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(permissionSettingItem.f99003g, "alpha", 1.0f, 0.0f, 1.0f);
                        ofFloat.setDuration(1000L);
                        ofFloat.start();
                    }
                }, 3500);
                Keva.getRepo("publish_exclude").storeBoolean("exclude_guide_showed", true);
            }
        }
    }

    public void setAdvPromotable(boolean z) {
        this.f131123b = z;
    }

    public void setAllowRecommend(int i2) {
        this.q = i2;
    }

    public void setFromChangePrivacy(boolean z) {
        this.f131124c = z;
    }

    public void setMissionId(String str) {
        this.t = str;
    }

    public void setMissionStatus(int i2) {
        this.s = i2;
    }

    public final void a(View.OnClickListener onClickListener) {
        if (this.n == null) {
            this.n = new ArrayList<>();
        }
        this.n.add(onClickListener);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        a(false);
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.n)) {
            Iterator<View.OnClickListener> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
        }
    }

    public PermissionSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDrawableLeft(androidx.core.content.b.a(context, b()));
        setTitle(R.string.gig);
        a e2 = g.a().A().e();
        if (e2 == null || !e2.e()) {
            setSubtitle(R.string.sm);
        } else {
            setSubtitle(R.string.f0g);
        }
        this.f99004h.setBackground(c.c(context));
        if (!da.a()) {
            setVisibility(8);
        }
        setOnClickListener(this);
    }

    public final void a(int i2, List<User> list, int i3) {
        String str;
        this.o = i2;
        this.p = list;
        this.q = i3;
        if (list != null) {
            str = bb.a(list.size(), list);
        } else {
            str = "";
        }
        setTitle(R.string.gig);
        boolean z = true;
        if (this.f131123b) {
            if (com.ss.android.ugc.aweme.port.in.c.u.e() == null || !com.ss.android.ugc.aweme.port.in.c.u.e().e()) {
                z = false;
            }
            if (i2 != 0 || z) {
                setSubtitle(R.string.dgn);
                setDrawableLeft(f());
                return;
            }
            setSubtitle(R.string.f0f);
            setDrawableLeft(b());
            return;
        }
        if (i2 == -1) {
            setSubtitle(R.string.esj);
        } else if (i2 == 0) {
            a e2 = g.a().A().e();
            if (e2 == null || !e2.e()) {
                setSubtitle(R.string.sm);
            } else {
                setSubtitle(R.string.f0g);
            }
            setDrawableLeft(b());
        } else if (i2 == 1) {
            setSubtitle(R.string.ha_);
            setDrawableLeft(f());
        } else if (i2 == 3) {
            setTitle(b.a().getString(R.string.f0u));
            setDrawableLeft(d());
            setSubtitle(str);
        } else {
            setSubtitle(R.string.c1s);
            setDrawableLeft(e());
        }
        a();
    }

    public final void a(int i2, List<User> list, int i3, boolean z, String str) {
        this.r = str;
        this.f131122a = z;
        this.q = i3;
        a(i2, list, i3);
    }
}
