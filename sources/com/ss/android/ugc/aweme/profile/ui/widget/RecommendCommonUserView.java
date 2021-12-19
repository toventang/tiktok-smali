package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.d.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.fy;
import com.ss.android.ugc.aweme.friends.a.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.h;
import com.ss.android.ugc.aweme.profile.ui.widget.l;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendCommonUserView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    View f117369a;

    /* renamed from: b  reason: collision with root package name */
    View f117370b;

    /* renamed from: c  reason: collision with root package name */
    View f117371c;

    /* renamed from: d  reason: collision with root package name */
    TextView f117372d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView f117373e;

    /* renamed from: f  reason: collision with root package name */
    TextView f117374f;

    /* renamed from: g  reason: collision with root package name */
    public a f117375g;

    /* renamed from: h  reason: collision with root package name */
    public String f117376h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f117377i;

    /* renamed from: j  reason: collision with root package name */
    private ViewStub f117378j;

    /* renamed from: k  reason: collision with root package name */
    private View f117379k;

    /* renamed from: l  reason: collision with root package name */
    private View f117380l;

    /* renamed from: m  reason: collision with root package name */
    private View f117381m;
    private View n;
    private View o;
    private View p;
    private h q;
    private boolean r = true;
    private int s;
    private List<User> t;
    private int u;
    private f v = new f(this);

    public interface a {
        static {
            Covode.recordClassIndex(75843);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(75839);
    }

    public Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f117420g;
    }

    private void a() {
        this.o.setVisibility(0);
        this.n.setVisibility(8);
    }

    private h getAdapter() {
        if (this.q == null) {
            this.q = new h();
        }
        return this.q;
    }

    public List<User> getData() {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        return this.t;
    }

    public void setOnLookMoreUserListener(a aVar) {
        this.f117375g = aVar;
    }

    public void setOnItemOperationListener(h.b bVar) {
        getAdapter().f117415b = bVar;
    }

    public void setOnViewAttachedToWindowListener(c<l> cVar) {
        getAdapter().f117417d = cVar;
    }

    public void setReminderText(int i2) {
        TextView textView = this.f117372d;
        if (textView != null) {
            textView.setText(i2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i2) {
        a(getContext());
        findViewById(R.id.c7_).setBackgroundResource(i2);
    }

    public void setShowLookMore(boolean z) {
        int i2;
        a(getContext());
        this.r = z;
        View view = this.f117380l;
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        view.setVisibility(i2);
        View view2 = this.f117381m;
        if (!z) {
            i3 = 4;
        }
        view2.setVisibility(i3);
        getAdapter().d(z);
    }

    private void setFindMoreLayout(List<User> list) {
        if (list.size() <= 3) {
            findViewById(R.id.b3b).setVisibility(8);
            return;
        }
        AvatarImageView avatarImageView = (AvatarImageView) this.f117370b.findViewById(R.id.b3_);
        AvatarImageView avatarImageView2 = (AvatarImageView) this.f117370b.findViewById(R.id.b3a);
        e.a((RemoteImageView) this.f117370b.findViewById(R.id.b39), list.get(3).getAvatarThumb());
        if (list.size() >= 5) {
            e.a(avatarImageView, list.get(4).getAvatarThumb());
            if (list.size() >= 6) {
                e.a(avatarImageView2, list.get(5).getAvatarThumb());
            } else {
                avatarImageView2.setVisibility(8);
            }
        } else {
            avatarImageView.setVisibility(8);
            avatarImageView2.setVisibility(8);
        }
    }

    public void setPageType(int i2) {
        this.s = i2;
        getAdapter().f117419f = i2;
        f fVar = this.v;
        fVar.f117399a.f117369a.setVisibility(0);
        fVar.f117399a.f117370b.setVisibility(8);
        if (i2 == 0) {
            fVar.f117399a.f117369a.setVisibility(8);
            fVar.f117399a.f117370b.setVisibility(8);
            fVar.f117399a.f117374f.setVisibility(8);
            fVar.f117399a.f117371c.setVisibility(8);
            fVar.f117399a.f117372d.setText(R.string.ey_);
            fVar.f117399a.setShowLookMore(false);
        }
    }

    public void onClick(View view) {
        a aVar;
        a aVar2;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.cjd && this.r && (aVar2 = this.f117375g) != null) {
            aVar2.a();
        }
        if (view.getId() == R.id.b3d && (aVar = this.f117375g) != null) {
            aVar.a();
        }
        if (view.getId() == R.id.d9f) {
            HashMap hashMap = new HashMap();
            int i2 = this.s;
            if (i2 == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else if (i2 == 2) {
                hashMap.put("enter_from", "homepage_friends");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            r.a("click_privacy_tips", hashMap);
            String c2 = SharePrefCache.inst().getPrivacyReminderH5Url().c();
            if (c2 != null) {
                try {
                    SmartRouter.buildRoute(getContext(), "aweme://webview/?url=" + URLEncoder.encode(c2, "UTF-8")).withParam("show_load_dialog", true).withParam("hide_nav_bar", false).withParam("use_webview_title", true).open();
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
                }
            }
        }
    }

    private void a(final Context context) {
        int i2;
        MethodCollector.i(12310);
        if (this.f117379k != null) {
            MethodCollector.o(12310);
            return;
        }
        View inflate = this.f117378j.inflate();
        this.f117379k = inflate;
        this.f117380l = inflate.findViewById(R.id.cjd);
        this.f117381m = this.f117379k.findViewById(R.id.cje);
        this.f117370b = this.f117379k.findViewById(R.id.b3d);
        this.f117369a = this.f117379k.findViewById(R.id.cjf);
        RecyclerView recyclerView = (RecyclerView) this.f117379k.findViewById(R.id.djs);
        this.f117373e = recyclerView;
        recyclerView.setAdapter(getAdapter());
        this.p = this.f117379k.findViewById(R.id.cae);
        this.f117374f = (TextView) this.f117379k.findViewById(R.id.f4y);
        this.f117371c = this.f117379k.findViewById(R.id.d9f);
        this.f117372d = (TextView) this.f117379k.findViewById(R.id.f5k);
        this.o = this.f117379k.findViewById(R.id.fjf);
        this.n = this.f117379k.findViewById(R.id.fjg);
        int i3 = 0;
        ((ab) this.f117373e.getItemAnimator()).f3953m = false;
        getAdapter().f117416c = new h.a() {
            /* class com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75840);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.h.a
            public final void a() {
                if (RecommendCommonUserView.this.f117375g != null) {
                    RecommendCommonUserView.this.f117375g.a();
                }
            }
        };
        getAdapter().f117422i = new l.b() {
            /* class com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(75841);
            }

            @Override // com.ss.android.ugc.aweme.profile.ui.widget.l.b
            public final void a() {
                RecommendCommonUserView.this.f117373e.a((int) n.b(context, 130.0f), 0);
            }
        };
        RecyclerView recyclerView2 = this.f117373e;
        recyclerView2.setPadding((int) n.b(recyclerView2.getContext(), 8.0f), 0, 0, 0);
        this.f117373e.setClipToPadding(false);
        this.f117373e.a(new d(0, (int) n.b(context, 4.0f), 0));
        this.f117373e.setLayoutManager(new WrapLinearLayoutManager(0));
        this.f117380l.setOnClickListener(this);
        this.f117370b.setOnClickListener(this);
        if (!b.a().a(true, "enable_privacy_reminder", false)) {
            this.f117371c.setVisibility(8);
        } else {
            this.f117371c.setVisibility(0);
            this.f117371c.setOnClickListener(this);
        }
        if (!SharePrefCache.inst().getIsEuropeCountry().c().booleanValue() || (fy.b() && !com.ss.android.ugc.aweme.account.b.g().isLogin())) {
            this.f117374f.setVisibility(8);
        } else {
            this.f117374f.setVisibility(0);
            String string = getContext().getResources().getString(R.string.eue);
            String a2 = com.a.a(getContext().getString(R.string.eud), new Object[]{string});
            String[] split = a2.split(string);
            if (split == null || split.length != 2) {
                i2 = 0;
            } else {
                i3 = split[0].length();
                i2 = string.length() + i3;
            }
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new ClickableSpan() {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(75842);
                }

                public final void onClick(View view) {
                    SmartRouter.buildRoute(RecommendCommonUserView.this.getContext(), "//privacy/setting").open();
                }

                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(RecommendCommonUserView.this.getResources().getColor(R.color.b9));
                    textPaint.setUnderlineText(false);
                }
            }, i3, i2, 33);
            this.f117374f.setText(spannableString);
            this.f117374f.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.v.f117399a.f117370b.setVisibility(8);
        MethodCollector.o(12310);
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12170);
        ViewStub viewStub = new ViewStub(context);
        this.f117378j = viewStub;
        viewStub.setLayoutResource(R.layout.bk2);
        this.f117378j.setInflatedId(R.id.c7_);
        addView(this.f117378j);
        MethodCollector.o(12170);
    }

    public final void a(List<User> list, String str) {
        if (list != null) {
            a(getContext());
            if (list.size() > 0) {
                a();
            }
            this.f117376h = str;
            this.t = list;
            getAdapter().b_(this.t);
            getAdapter().f117418e = str;
            if (!this.r || this.t.size() < 10) {
                getAdapter().d(false);
            } else {
                getAdapter().d(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(12456);
        if (this.f117377i) {
            if (z && getHeight() > 0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                int top = getTop() - ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                if (this.u == 0) {
                    this.u = top;
                }
                if (top != this.u) {
                    getTop();
                    int i6 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                    getTop();
                    int i7 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                    ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin += this.u - top;
                    post(new e(this));
                    this.u = top;
                }
            } else if (getHeight() == 0) {
                this.u = 0;
            }
        }
        super.onLayout(z, i2, i3, i4, i5);
        MethodCollector.o(12456);
    }
}
