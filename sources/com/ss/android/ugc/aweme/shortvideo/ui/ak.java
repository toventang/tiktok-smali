package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a;
import com.bytedance.tux.navigation.a.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.setting.bm;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.zhiliaoapp.musically.R;
import h.z;

public final class ak extends Fragment implements a {
    TextView A;
    Drawable B;
    Drawable C;
    TuxButton D;
    TuxTextView E;
    String F;
    int G;
    int H;
    String I;
    String J;
    String K;
    String L;
    String M;
    boolean N;
    String O;
    boolean P;
    boolean Q;
    int R;
    String S;
    int T;
    j U;
    public h.f.a.a<z> V;
    i W;
    private VideoPublishEditModel X;

    /* renamed from: a  reason: collision with root package name */
    String f131395a = "mission_requirement_toast";

    /* renamed from: b  reason: collision with root package name */
    String f131396b = "mission_requirement_modified";

    /* renamed from: c  reason: collision with root package name */
    String f131397c = "mission_id";

    /* renamed from: d  reason: collision with root package name */
    String f131398d = "reason";

    /* renamed from: e  reason: collision with root package name */
    String f131399e = "value";

    /* renamed from: f  reason: collision with root package name */
    int f131400f = 1;

    /* renamed from: g  reason: collision with root package name */
    int f131401g = 2;

    /* renamed from: h  reason: collision with root package name */
    int f131402h = 3;

    /* renamed from: i  reason: collision with root package name */
    int f131403i = 4;

    /* renamed from: j  reason: collision with root package name */
    int f131404j = 5;

    /* renamed from: k  reason: collision with root package name */
    int f131405k = 6;

    /* renamed from: l  reason: collision with root package name */
    int f131406l = 7;

    /* renamed from: m  reason: collision with root package name */
    int f131407m = 10;
    String n = "page_source";
    String o = "creator_followers";
    String p = "creator_type";
    String q = "0";
    String r = "1";
    ImageView s;
    ImageView t;
    ImageView u;
    LinearLayout v;
    LinearLayout w;
    LinearLayout x;
    TextView y;
    TextView z;

    static {
        Covode.recordClassIndex(86086);
    }

    private boolean g() {
        int i2 = this.R;
        if (i2 == 5 || i2 == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        j jVar = this.U;
        if (jVar != null) {
            jVar.a(this.T);
        }
    }

    static boolean d() {
        boolean publishPermissionDialogPrivate = g.a().e().getPublishPermissionDialogPrivate(true);
        if (publishPermissionDialogPrivate) {
            g.a().e().setPublishPermissionDialogPrivate(false);
        }
        return publishPermissionDialogPrivate;
    }

    static boolean e() {
        boolean publishPermissionDialogFriend = g.a().e().getPublishPermissionDialogFriend(true);
        if (publishPermissionDialogFriend) {
            g.a().e().setPublishPermissionDialogFriend(false);
        }
        return publishPermissionDialogFriend;
    }

    private boolean f() {
        int i2 = this.R;
        if (i2 == 1 || i2 == 3 || i2 == 7 || i2 == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (this.P) {
            return this.Q;
        }
        VideoPublishEditModel videoPublishEditModel = this.X;
        if (videoPublishEditModel == null || b.a(videoPublishEditModel.getMainBusinessContext()) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a a2 = new TuxNavBar.a().b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((d) new ar(this))).a(new com.bytedance.tux.navigation.a.g().a(getString(R.string.gig)));
        a2.f45188d = true;
        if (getArguments() != null && getArguments().getBoolean("extra.showTuxNavBarBack", false)) {
            a2.a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_chevron_left_offset_ltr).a((d) new as(this)));
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c(int i2) {
        if (i2 == 1) {
            b(1);
        } else if (i2 == 2) {
            b(2);
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        ImageView imageView = this.u;
        if (i2 == 0) {
            drawable = this.B;
        } else {
            drawable = this.C;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = this.t;
        if (i2 == 2) {
            drawable2 = this.B;
        } else {
            drawable2 = this.C;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = this.s;
        if (i2 == 1) {
            drawable3 = this.B;
        } else {
            drawable3 = this.C;
        }
        imageView3.setImageDrawable(drawable3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z d(int i2) {
        h.f.a.a<z> aVar = this.V;
        if (aVar != null) {
            aVar.invoke();
        }
        b.b(this.X);
        if (i2 == 1) {
            b(1);
        } else if (i2 == 2) {
            b(2);
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        Object valueOf;
        if ((f() || g()) && (i2 == 2 || i2 == 1)) {
            com.ss.android.ugc.aweme.account.model.a e2 = c.u.e();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("reason", 8).a("mission_id", this.S);
            String str = "0";
            if (e2 == null) {
                valueOf = str;
            } else {
                valueOf = Integer.valueOf(e2.m());
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("creator_followers", valueOf);
            if (!l.f115658a.z().j()) {
                str = "1";
            }
            r.a("mission_requirement_toast", a3.a("creator_type", str).f66730a);
        }
        this.T = i2;
        a(i2);
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.T = arguments.getInt("extra.PERMISSION");
            this.H = arguments.getInt("extra.Private.DESCRIPTION");
            this.G = arguments.getInt("extra.Friend.DESCRIPTION");
            this.I = arguments.getString("extra.Private.DESCRIPTION.STRING");
            this.J = arguments.getString("extra.Friend.DESCRIPTION.STRING");
            this.K = arguments.getString("extra.mix.nopublic.string");
            this.L = arguments.getString("extra.qna.nopublic.string");
            this.M = arguments.getString("extra.qna.public.string");
            this.N = arguments.getBoolean("prevent_self_see");
            this.O = arguments.getString("prevent_self_see_reason");
            this.X = (VideoPublishEditModel) arguments.getParcelable("extra.edit_model");
            this.P = arguments.getBoolean("extra_is_from_video_permission");
            this.Q = arguments.getBoolean("extra_aweme_have_duet_sticker");
            this.R = arguments.getInt("extra_mission_status");
            this.S = arguments.getString("extra_mission_id");
            if (this.T != 0) {
                this.K = "";
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(getContext());
        bVar.a(getContext().getResources().getString(R.string.n5), new ao(this, i2));
        bVar.b(getContext().getResources().getString(R.string.be9), ap.f131413a);
        com.bytedance.tux.dialog.c.a(getContext()).b(getContext().getResources().getString(R.string.bea)).d(getContext().getResources().getString(i3)).a(bVar).a().b().show();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(getContext());
        bVar.a(getContext().getResources().getString(R.string.bee), new aw(this, i2));
        bVar.b(getContext().getResources().getString(R.string.be9), an.f131410a);
        bVar.f44820b = true;
        com.bytedance.tux.dialog.a a2 = com.bytedance.tux.dialog.c.a(getContext()).d(getContext().getResources().getString(i3)).a(bVar).a();
        a2.a();
        a2.b().show();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (ImageView) view.findViewById(R.id.d3j);
        this.t = (ImageView) view.findViewById(R.id.d3f);
        this.u = (ImageView) view.findViewById(R.id.d3i);
        this.v = (LinearLayout) view.findViewById(R.id.c6w);
        this.w = (LinearLayout) view.findViewById(R.id.c6x);
        this.x = (LinearLayout) view.findViewById(R.id.c6y);
        this.y = (TextView) view.findViewById(R.id.d9v);
        this.z = (TextView) view.findViewById(R.id.f4a);
        this.A = (TextView) view.findViewById(R.id.ffn);
        this.B = getResources().getDrawable(R.drawable.bh7);
        this.C = getResources().getDrawable(R.drawable.bh9);
        this.D = (TuxButton) view.findViewById(R.id.dxt);
        this.F = getResources().getString(R.string.f0x);
        this.E = (TuxTextView) view.findViewById(R.id.cmr);
        this.w.setOnClickListener(new al(this));
        this.v.setOnClickListener(new am(this));
        this.x.setOnClickListener(new aq(this));
        this.w.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        this.v.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        this.x.setBackground(com.bytedance.ies.dmt.ui.common.c.c(getContext()));
        a(this.T);
        com.ss.android.ugc.aweme.account.model.a e2 = c.u.e();
        if (e2 != null && e2.e()) {
            this.z.setText(R.string.f0g);
        }
        if (this.W != null) {
            this.D.setVisibility(0);
            this.D.setIconTintColorRes(R.attr.bd);
            this.D.setOnClickListener(new at(this));
        }
        if (this.N) {
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                linearLayout.setEnabled(false);
                this.x.setClickable(false);
            }
            TextView textView = this.y;
            if (textView != null) {
                textView.setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
            }
            if (this.A != null) {
                if (!TextUtils.isEmpty(this.O)) {
                    this.A.setText(this.O);
                }
                this.A.setVisibility(0);
            }
        }
        if (f() || g()) {
            this.E.setVisibility(0);
            if (f()) {
                this.E.setText(R.string.d4z);
            } else {
                this.E.setText(R.string.d50);
            }
        } else {
            this.E.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        if (getContext() != null) {
            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(getContext());
            bVar.a(getResources().getString(R.string.asg), new au(this, i2));
            bVar.b(R.string.a9e, av.f131420a);
            int i3 = R.string.did;
            if (i2 == 2) {
                i3 = R.string.f5l;
            } else if (i2 == 1) {
                i3 = R.string.f5m;
            } else if (i2 == 0) {
                i3 = R.string.f5n;
            }
            ((com.bytedance.tux.dialog.b) a.C1094a.a(getContext()).a(i3)).d(str).a(bVar).a().b().show();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            a(i2, getContext().getString(i3));
        } else {
            a(i2, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m a2 = com.ss.android.ugc.aweme.compliance.api.a.s().a("video_visibility_select");
        if (bm.a() == 2 && a2 != null && a2.f76684a == 1) {
            return com.a.a(layoutInflater, R.layout.a1i, viewGroup, false);
        }
        return com.a.a(layoutInflater, R.layout.a1h, viewGroup, false);
    }

    public static ak a(int i2, int i3, boolean z2, String str, int i4, int i5, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, j jVar, i iVar, VideoPublishEditModel videoPublishEditModel, boolean z4, boolean z5, int i6, String str8) {
        ak akVar = new ak();
        Bundle bundle = new Bundle();
        bundle.putInt("extra.TYPE", i2);
        bundle.putInt("extra.PERMISSION", i3);
        bundle.putBoolean("prevent_self_see", z2);
        bundle.putString("prevent_self_see_reason", str);
        bundle.putInt("extra.Private.DESCRIPTION", i4);
        bundle.putInt("extra.Friend.DESCRIPTION", i5);
        bundle.putString("extra.Private.DESCRIPTION.STRING", str2);
        bundle.putString("extra.Friend.DESCRIPTION.STRING", str3);
        bundle.putString("extra.mix.nopublic.string", str4);
        bundle.putString("extra.qna.nopublic.string", str5);
        bundle.putString("extra.qna.public.string", str6);
        bundle.putString("extra.getStickerID", str7);
        bundle.putBoolean("extra.showTuxNavBarBack", z3);
        bundle.putParcelable("extra.edit_model", videoPublishEditModel);
        bundle.putBoolean("extra_is_from_video_permission", z4);
        bundle.putBoolean("extra_aweme_have_duet_sticker", z5);
        bundle.putInt("extra_mission_status", i6);
        bundle.putString("extra_mission_id", str8);
        akVar.setArguments(bundle);
        akVar.U = jVar;
        akVar.W = iVar;
        return akVar;
    }
}
