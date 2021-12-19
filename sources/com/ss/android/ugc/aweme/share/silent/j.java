package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.silent.t;
import com.ss.android.ugc.aweme.sharer.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;

public class j extends b {

    /* renamed from: a  reason: collision with root package name */
    String f124345a = "";

    /* renamed from: b  reason: collision with root package name */
    ImageView f124346b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f124347c;

    /* renamed from: d  reason: collision with root package name */
    RadioGroup f124348d;

    /* renamed from: e  reason: collision with root package name */
    CanCancelRadioButton f124349e;

    /* renamed from: f  reason: collision with root package name */
    CanCancelRadioButton f124350f;

    /* renamed from: i  reason: collision with root package name */
    CanCancelRadioButton f124351i;

    /* renamed from: j  reason: collision with root package name */
    TextView f124352j;

    /* renamed from: k  reason: collision with root package name */
    public int f124353k = 44;

    /* renamed from: l  reason: collision with root package name */
    public int f124354l = 30;

    /* renamed from: m  reason: collision with root package name */
    private a f124355m;
    private int n;
    private boolean o;
    private int p;

    static {
        Covode.recordClassIndex(81647);
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(boolean z) {
        this.f124349e.setChecked(z);
        if (z) {
            this.f124348d.check(R.id.zk);
        } else if (this.f124348d.getCheckedRadioButtonId() == R.id.zk) {
            this.f124348d.clearCheck();
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutResId() {
        if (this.n == 0) {
            return R.layout.b0a;
        }
        return R.layout.azc;
    }

    private String getUserName() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.getCurrentUser() == null) {
            return "";
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getNickname();
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public int getSaveUploadType() {
        RadioGroup radioGroup = this.f124348d;
        if (radioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.zk) {
            return 1;
        }
        if (checkedRadioButtonId == R.id.yr) {
            return 2;
        }
        if (checkedRadioButtonId == R.id.ys) {
            return 3;
        }
        return 0;
    }

    private boolean f() {
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().enableSaveUploadVideo()) {
            return true;
        }
        setVisibility(8);
        this.f124348d.setVisibility(8);
        s.a.f66880a.j().b(0);
        return false;
    }

    private boolean g() {
        if (!SettingsManager.a().a("disable_save_at_post", false)) {
            return true;
        }
        this.f124349e.setVisibility(8);
        s.a.f66880a.j().b(0);
        return false;
    }

    private boolean getTwitterRealStatus() {
        if (!b.g().getCurUser().isHasTwitterToken() || b.g().getCurUser().isTwitterExpire() || !SharePrefCache.inst().getAutoSendTwitter().c().booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        boolean z;
        if (this.f124348d.getCheckedRadioButtonId() == R.id.zk) {
            z = true;
        } else {
            z = false;
        }
        a(z, "download");
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final String c() {
        ArrayList arrayList = new ArrayList();
        if (a(this.f124346b)) {
            arrayList.add(101);
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return com.ss.android.ugc.aweme.share.silent.b.a.a(";", arrayList);
    }

    private String getUserAvatarUrl() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.getCurrentUser() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList() == null || createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList().size() == 0) {
            return "";
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getAvatarMedium().getUrlList().get(0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        boolean z;
        if (SharePrefCache.inst().getIsAwemePrivate().c().booleanValue()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getContext().getString(R.string.evw)).a();
            return;
        }
        if (this.f124348d.getCheckedRadioButtonId() == R.id.ys) {
            z = true;
        } else {
            z = false;
        }
        a(z, "ins_story");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        boolean z;
        if (SharePrefCache.inst().getIsAwemePrivate().c().booleanValue()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getContext().getString(R.string.evw)).a();
            return;
        }
        if (this.f124348d.getCheckedRadioButtonId() == R.id.yr) {
            z = true;
        } else {
            z = false;
        }
        a(z, "ins");
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(CanCancelRadioButton.a aVar) {
        this.f124349e.f68448b.add(aVar);
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTextColor(int i2) {
        TextView textView = this.f124352j;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTextSize(float f2) {
        TextView textView = this.f124352j;
        if (textView != null) {
            textView.setTextSize(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.f124352j;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSaveLocalEnabled(boolean z) {
        int i2;
        CanCancelRadioButton canCancelRadioButton = this.f124349e;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        canCancelRadioButton.setVisibility(i2);
    }

    private static boolean a(ImageView imageView) {
        if (imageView == null || imageView.getAlpha() != 1.0f) {
            return false;
        }
        return true;
    }

    private void b(boolean z) {
        if (z) {
            int checkedRadioButtonId = this.f124348d.getCheckedRadioButtonId();
            this.f124350f.setCanChecked(false);
            this.f124351i.setCanChecked(false);
            if (checkedRadioButtonId == this.f124350f.getId() || checkedRadioButtonId == this.f124351i.getId()) {
                this.f124348d.check(-1);
                return;
            }
            return;
        }
        this.f124350f.setCanChecked(true);
        this.f124351i.setCanChecked(true);
    }

    public void setSilentShareChannelDrawable(Context context) {
        this.f124349e.setBackground(t.a.a(context, R.raw.icon_arrow_to_down, R.raw.icon_color_download_circle, this.f124353k, this.f124354l));
        this.f124350f.setBackground(t.a.a(context, R.raw.icon_instagram, R.raw.icon_color_instagram_circle, this.f124353k, this.f124354l));
        this.f124351i.setBackground(t.a.a(context, R.raw.icon_instagram_story, R.raw.icon_color_instagram_story_circle, this.f124353k, this.f124354l));
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public void setSyncIconSize(int i2) {
        ViewGroup.LayoutParams layoutParams = this.f124346b.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        ViewGroup.LayoutParams layoutParams2 = this.f124350f.getLayoutParams();
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        ViewGroup.LayoutParams layoutParams3 = this.f124351i.getLayoutParams();
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        ViewGroup.LayoutParams layoutParams4 = this.f124349e.getLayoutParams();
        layoutParams4.width = i2;
        layoutParams4.height = i2;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.b
    public final void a(int i2) {
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        this.p = i2;
        SharePrefCache.inst().getIsAwemePrivate().b(Boolean.valueOf(z));
        ShareDependService.a.a().a(getContext(), z);
        b(z);
        if (z) {
            a(this.f124346b, false);
        } else {
            a(this.f124346b, getTwitterRealStatus());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(View view) {
        if (view.getId() != R.id.a07) {
            return;
        }
        if (a(this.f124346b)) {
            a(this.f124346b, false);
            SharePrefCache.inst().getAutoSendTwitter().b(false);
            a(false, "twitter");
        } else if (SharePrefCache.inst().getIsAwemePrivate().c().booleanValue()) {
            if (this.p == 2) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getContext().getString(R.string.a9c)).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getContext().getString(R.string.evw)).a();
            }
        } else if (!b.g().getCurUser().isHasTwitterToken() || b.g().getCurUser().isTwitterExpire()) {
            this.f124355m.b();
            r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("show"));
        } else {
            a(this.f124346b, true);
            SharePrefCache.inst().getAutoSendTwitter().b(true);
            a(true, "twitter");
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        this.f124352j = (TextView) view.findViewById(R.id.eh1);
    }

    public j(Context context) {
        super(context);
        boolean z;
        boolean z2 = false;
        this.n = 0;
        View a2 = com.a.a(LayoutInflater.from(context), getLayoutResId(), this, true);
        this.f124346b = (ImageView) a2.findViewById(R.id.a07);
        this.f124347c = (LinearLayout) a2.findViewById(R.id.c4r);
        this.f124348d = (RadioGroup) a2.findViewById(R.id.dgr);
        this.f124349e = (CanCancelRadioButton) a2.findViewById(R.id.zk);
        this.f124350f = (CanCancelRadioButton) a2.findViewById(R.id.yr);
        this.f124351i = (CanCancelRadioButton) a2.findViewById(R.id.ys);
        View findViewById = a2.findViewById(R.id.a07);
        if (findViewById != null) {
            findViewById.setOnClickListener(new k(this));
        }
        a(a2);
        setSilentShareChannelDrawable(context);
        if (!f()) {
            a2.setVisibility(8);
        } else if (g()) {
            SharePrefCache inst = SharePrefCache.inst();
            a(this.f124346b, getTwitterRealStatus());
            SharePrefCache.inst().getAutoSendTwitter().b(Boolean.valueOf(getTwitterRealStatus()));
            if (inst.getIsAwemePrivate().c().booleanValue()) {
                a(this.f124346b, false);
            }
            a.C0731a aVar = new a.C0731a(getContext());
            if (b.g().getCurUser().isHasTwitterToken()) {
                aVar.f33402b = getContext().getString(R.string.cc7, "Twitter");
            } else {
                aVar.f33402b = getContext().getString(R.string.cc6, "Twitter", "Twitter");
            }
            aVar.a(getContext().getString(R.string.cc4), (DialogInterface.OnClickListener) new l(this), false);
            aVar.b(getContext().getString(R.string.cc5), m.f124358a, false);
            this.f124355m = aVar.a();
            if (f() && g()) {
                com.ss.android.ugc.aweme.sharer.b a3 = c.a("instagram", null);
                if (a3 == null || !a3.b(getContext())) {
                    this.f124350f.setVisibility(8);
                    z = false;
                } else {
                    z = true;
                }
                com.ss.android.ugc.aweme.sharer.b a4 = c.a("instagram_story", null);
                if (a4 == null || !a4.b(getContext())) {
                    this.f124351i.setVisibility(8);
                } else {
                    z2 = true;
                }
                if (!AVExternalServiceImpl.a().configService().avsettingsConfig().enableUploadSyncTwitter()) {
                    this.f124346b.setVisibility(8);
                }
                int intValue = s.a.f66880a.j().c().intValue();
                if (intValue == 1) {
                    this.f124349e.setChecked(true);
                } else if (intValue != 2) {
                    if (intValue != 3) {
                        this.f124348d.clearCheck();
                    } else if (!z2) {
                        s.a.f66880a.j().b(0);
                    } else {
                        this.f124351i.setChecked(true);
                    }
                } else if (!z) {
                    s.a.f66880a.j().b(0);
                } else {
                    this.f124350f.setChecked(true);
                }
                if (SharePrefCache.inst().getIsAwemePrivate().c().booleanValue()) {
                    b(true);
                }
            }
            this.f124350f.setOnClickListener(new n(this));
            this.f124351i.setOnClickListener(new o(this));
            this.f124349e.setOnClickListener(new p(this));
            this.f124348d.setOnCheckedChangeListener(new q(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!this.o) {
            this.o = true;
            AVExternalServiceImpl.a().publishService().cancelSynthesis(getContext(), str);
        }
    }

    private void a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (tag instanceof Map) {
            Map map = (Map) tag;
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            r.a(str2, new d().a("creation_id", a(map.get("creation_id"))).a("enter_from", a(map.get("enter_from"))).a("content_type", a(map.get("content_type"))).a("shoot_way", a(map.get("shoot_way"))).a("share_to", str).f66730a);
            if (z) {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ImageView imageView, boolean z) {
        if (imageView.getId() == R.id.a07) {
            imageView.setImageDrawable(t.a.a(getContext(), R.raw.icon_twitter, R.raw.icon_color_twitter_circle, this.f124353k, this.f124354l));
        }
        if (z) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.99f);
        }
    }
}
