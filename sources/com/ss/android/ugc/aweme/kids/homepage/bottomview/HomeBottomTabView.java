package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.kids.common.c.b;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public class HomeBottomTabView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    a f106540a;

    /* renamed from: b  reason: collision with root package name */
    String f106541b;

    /* renamed from: c  reason: collision with root package name */
    g f106542c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, a> f106543d;

    /* renamed from: e  reason: collision with root package name */
    private View f106544e;

    /* renamed from: f  reason: collision with root package name */
    private a f106545f;

    /* renamed from: g  reason: collision with root package name */
    private a f106546g;

    /* renamed from: h  reason: collision with root package name */
    private a f106547h;

    /* renamed from: i  reason: collision with root package name */
    private a f106548i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f106549j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap<String, String> f106550k;

    static {
        Covode.recordClassIndex(68084);
    }

    public void setTabSelectListener(g gVar) {
        this.f106542c = gVar;
    }

    private void setUpDivider(LinearLayout linearLayout) {
        MethodCollector.i(12350);
        View view = new View(getContext());
        this.f106544e = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        linearLayout.addView(this.f106544e);
        MethodCollector.o(12350);
    }

    private void setUpTabContainer(LinearLayout linearLayout) {
        MethodCollector.i(12495);
        this.f106549j = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f106549j.setLayoutParams(layoutParams);
        this.f106549j.setOrientation(0);
        linearLayout.addView(this.f106549j);
        MethodCollector.o(12495);
    }

    public void setCurrentTab(String str) {
        c a2 = new c().a("enter_from", "click_tab").a("previous_page", this.f106541b);
        if (TextUtils.equals("homepage_hot", this.f106541b)) {
            a2.a("group_id", b.f105886a).a("author_id", b.f105887b);
        }
        String str2 = this.f106550k.get(str);
        if (!TextUtils.isEmpty(str2)) {
            e.a(str2, a2.a());
        }
        post(new f(this, str, this.f106541b));
    }

    public final void a(String str) {
        boolean z;
        boolean z2 = false;
        if (TextUtils.equals(str, "homepage_hot") || TextUtils.equals(str, "tab_draft")) {
            z = true;
            setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.a2));
            this.f106544e.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.b3));
        } else {
            z = false;
            setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
            this.f106544e.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.b2));
        }
        this.f106545f.setSelected(TextUtils.equals(str, "homepage_hot"));
        this.f106546g.setSelected(TextUtils.equals(str, "discovery"));
        this.f106547h.setSelected(TextUtils.equals(str, "liked"));
        a aVar = this.f106548i;
        if (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "tab_draft")) {
            z2 = true;
        }
        aVar.setSelected(z2);
        this.f106545f.a(z);
        this.f106546g.a(z);
        this.f106540a.a(z);
        this.f106547h.a(z);
        this.f106548i.a(z);
    }

    public HomeBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private HomeBottomTabView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12209);
        this.f106541b = "homepage_hot";
        this.f106543d = new HashMap<>();
        this.f106550k = new HashMap<>();
        setOrientation(1);
        setUpDivider(this);
        setUpTabContainer(this);
        this.f106545f = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c(getContext(), getContext().getString(R.string.csp), 2131233001, 2131233002, 2131233003, 2131233003);
        if (((Integer) com.ss.android.ugc.aweme.kids.experiment.abmock.a.a(com.ss.android.ugc.aweme.kids.experiment.abmock.a.a.f106530a)).intValue() == 0) {
            this.f106546g = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c(getContext(), getContext().getString(R.string.csq), 2131232994, 2131232996, 2131232999, 2131232999);
        } else {
            this.f106546g = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c(getContext(), getContext().getString(R.string.csq), 2131232995, 2131232997, 2131233000, 2131233000);
        }
        this.f106540a = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.b(getContext());
        this.f106547h = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c(getContext(), getContext().getString(R.string.csr), 2131233004, 2131233005, 2131233007, 2131233007);
        this.f106548i = new com.ss.android.ugc.aweme.kids.homepage.bottomview.a.c(getContext(), getContext().getString(R.string.csu), 2131233008, 2131233009, 2131233011, 2131233010);
        if (this.f106549j.getChildCount() > 0) {
            this.f106549j.removeAllViews();
        }
        this.f106545f.setOnClickListener(new a(this));
        this.f106546g.setOnClickListener(new b(this));
        this.f106540a.setOnClickListener(new c(this));
        this.f106547h.setOnClickListener(new d(this));
        this.f106548i.setOnClickListener(new e(this));
        this.f106549j.addView(this.f106545f);
        this.f106549j.addView(this.f106546g);
        this.f106549j.addView(this.f106540a);
        this.f106549j.addView(this.f106547h);
        this.f106549j.addView(this.f106548i);
        int d2 = (int) (((float) i.d(getContext())) / 5.0f);
        this.f106545f.setLayoutParams(new LinearLayout.LayoutParams(d2, -1));
        this.f106546g.setLayoutParams(new LinearLayout.LayoutParams(d2, -1));
        this.f106540a.setLayoutParams(new LinearLayout.LayoutParams(d2, -1));
        this.f106547h.setLayoutParams(new LinearLayout.LayoutParams(d2, -1));
        this.f106548i.setLayoutParams(new LinearLayout.LayoutParams(d2, -1));
        this.f106543d.put("homepage_hot", this.f106545f);
        this.f106543d.put("discovery", this.f106546g);
        this.f106543d.put("tab_publish", this.f106540a);
        this.f106543d.put("liked", this.f106547h);
        this.f106543d.put("personal_homepage", this.f106548i);
        this.f106550k.put("homepage_hot", "enter_home_hot_page");
        this.f106550k.put("discovery", "enter_discovery_page");
        this.f106550k.put("liked", "enter_liked_page");
        this.f106550k.put("personal_homepage", "enter_personal_homepage");
        a(this.f106541b);
        MethodCollector.o(12209);
    }
}
