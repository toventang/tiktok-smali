package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import h.z;
import java.util.HashMap;

public abstract class a extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f101620a = {new r(a.class, "mIsMute", "getMIsMute()Z", 0), new r(a.class, "mIsStickTop", "getMIsStickTop()Z", 0)};

    /* renamed from: b  reason: collision with root package name */
    protected ImTextTitleBar f101621b;

    /* renamed from: c  reason: collision with root package name */
    public SwitchCompat f101622c;

    /* renamed from: d  reason: collision with root package name */
    public SwitchCompat f101623d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.ies.im.core.api.b.b f101624e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f101625f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f101626g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f101627h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.e f101628i = new C2527a(false, false, this);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.e f101629j = new b(false, false, this);

    /* renamed from: k  reason: collision with root package name */
    private HashMap f101630k;

    static {
        Covode.recordClassIndex(65002);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f101630k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f101630k == null) {
            this.f101630k = new HashMap();
        }
        View view = (View) this.f101630k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101630k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void a(boolean z) {
        this.f101628i.a(f101620a[0], Boolean.valueOf(z));
    }

    public final boolean a() {
        return ((Boolean) this.f101628i.a(this, f101620a[0])).booleanValue();
    }

    public final void b(boolean z) {
        this.f101629j.a(f101620a[1], Boolean.valueOf(z));
    }

    public final boolean b() {
        return ((Boolean) this.f101629j.a(this, f101620a[1])).booleanValue();
    }

    public void c() {
    }

    public static final class e implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101637a;

        static {
            Covode.recordClassIndex(65007);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            this.f101637a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f101637a = aVar;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        String str;
        super.onDestroy();
        com.bytedance.ies.im.core.api.b.b bVar = this.f101624e;
        if (bVar != null) {
            str = bVar.b();
        } else {
            str = null;
        }
        HashMap<String, Integer> hashMap = com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.f101018b;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.a(str);
    }

    public void e() {
        TextView textView = this.f101626g;
        if (textView == null) {
            l.a("mMuteText");
        }
        textView.setOnClickListener(this);
        TextView textView2 = this.f101627h;
        if (textView2 == null) {
            l.a("mStickTopText");
        }
        textView2.setOnClickListener(this);
        SwitchCompat switchCompat = this.f101622c;
        if (switchCompat == null) {
            l.a("mMuteSwitch");
        }
        switchCompat.setOnCheckedChangeListener(this);
        SwitchCompat switchCompat2 = this.f101623d;
        if (switchCompat2 == null) {
            l.a("mStickTopSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(this);
        ImTextTitleBar imTextTitleBar = this.f101621b;
        if (imTextTitleBar == null) {
            l.a("mTitleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new e(this));
    }

    public void d() {
        int i2;
        int i3;
        boolean z;
        h c2;
        h c3;
        View findViewById = findViewById(R.id.em8);
        l.b(findViewById, "");
        this.f101621b = (ImTextTitleBar) findViewById;
        View findViewById2 = findViewById(R.id.c6o);
        l.b(findViewById2, "");
        this.f101625f = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.f3_);
        l.b(findViewById3, "");
        this.f101626g = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.egv);
        l.b(findViewById4, "");
        this.f101622c = (SwitchCompat) findViewById4;
        View findViewById5 = findViewById(R.id.f7z);
        l.b(findViewById5, "");
        this.f101627h = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.egw);
        l.b(findViewById6, "");
        this.f101623d = (SwitchCompat) findViewById6;
        if (com.bytedance.ies.dmt.ui.common.b.a()) {
            i2 = R.color.fg;
        } else {
            i2 = R.color.ff;
        }
        if (com.bytedance.ies.dmt.ui.common.b.a()) {
            i3 = R.color.fe;
        } else {
            i3 = R.color.fd;
        }
        SwitchCompat switchCompat = this.f101622c;
        if (switchCompat == null) {
            l.a("mMuteSwitch");
        }
        switchCompat.setTrackTintList(androidx.appcompat.a.a.a.a(this, i2));
        SwitchCompat switchCompat2 = this.f101622c;
        if (switchCompat2 == null) {
            l.a("mMuteSwitch");
        }
        switchCompat2.setThumbTintList(androidx.appcompat.a.a.a.a(this, i3));
        SwitchCompat switchCompat3 = this.f101623d;
        if (switchCompat3 == null) {
            l.a("mStickTopSwitch");
        }
        switchCompat3.setTrackTintList(androidx.appcompat.a.a.a.a(this, i2));
        SwitchCompat switchCompat4 = this.f101623d;
        if (switchCompat4 == null) {
            l.a("mStickTopSwitch");
        }
        switchCompat4.setThumbTintList(androidx.appcompat.a.a.a.a(this, i3));
        com.bytedance.ies.im.core.api.b.b bVar = this.f101624e;
        boolean z2 = false;
        if (bVar == null || (c3 = bVar.c()) == null || !c3.isStickTop()) {
            z = false;
        } else {
            z = true;
        }
        b(z);
        com.bytedance.ies.im.core.api.b.b bVar2 = this.f101624e;
        if (!(bVar2 == null || (c2 = bVar2.c()) == null || !c2.isMute())) {
            z2 = true;
        }
        a(z2);
    }

    public static final class c implements com.bytedance.im.core.a.a.b<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101635a;

        static {
            Covode.recordClassIndex(65005);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f101635a = aVar;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(this.f101635a, uVar);
            a.a(this.f101635a).setChecked(this.f101635a.a());
            a.a(this.f101635a).setEnabled(true);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(h hVar) {
            a aVar = this.f101635a;
            aVar.a(!aVar.a());
            a.a(this.f101635a).setEnabled(true);
        }
    }

    public static final class d implements com.bytedance.im.core.a.a.b<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101636a;

        static {
            Covode.recordClassIndex(65006);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f101636a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(h hVar) {
            a aVar = this.f101636a;
            aVar.b(!aVar.b());
            a.b(this.f101636a).setEnabled(true);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            l.d(uVar, "");
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(this.f101636a, uVar);
            a.b(this.f101636a).setChecked(this.f101636a.b());
            a.b(this.f101636a).setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f101638a = new f();

        static {
            Covode.recordClassIndex(65008);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f101639a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ SwitchCompat a(a aVar) {
        SwitchCompat switchCompat = aVar.f101622c;
        if (switchCompat == null) {
            l.a("mMuteSwitch");
        }
        return switchCompat;
    }

    public static final /* synthetic */ SwitchCompat b(a aVar) {
        SwitchCompat switchCompat = aVar.f101623d;
        if (switchCompat == null) {
            l.a("mStickTopSwitch");
        }
        return switchCompat;
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        activityConfiguration(f.f101638a);
        super.onCreate(bundle);
        setContentView(R.layout.a4_);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(this);
        c();
        d();
        e();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        int id = view.getId();
        if (id == R.id.f3_) {
            SwitchCompat switchCompat = this.f101622c;
            if (switchCompat == null) {
                l.a("mMuteSwitch");
            }
            SwitchCompat switchCompat2 = this.f101622c;
            if (switchCompat2 == null) {
                l.a("mMuteSwitch");
            }
            switchCompat.setChecked(!switchCompat2.isChecked());
        } else if (id == R.id.f7z) {
            SwitchCompat switchCompat3 = this.f101623d;
            if (switchCompat3 == null) {
                l.a("mStickTopSwitch");
            }
            SwitchCompat switchCompat4 = this.f101623d;
            if (switchCompat4 == null) {
                l.a("mStickTopSwitch");
            }
            switchCompat3.setChecked(!switchCompat4.isChecked());
        }
    }

    private final void a(boolean z, String str) {
        String str2;
        h c2;
        h c3;
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        com.bytedance.ies.im.core.api.b.b bVar = this.f101624e;
        String str3 = null;
        if (bVar == null || (c3 = bVar.c()) == null || c3.getConversationType() != e.a.f37582b) {
            com.bytedance.ies.im.core.api.b.b bVar2 = this.f101624e;
            if (bVar2 != null && (c2 = bVar2.c()) != null && c2.getConversationType() == e.a.f37581a) {
                com.bytedance.ies.im.core.api.b.b bVar3 = this.f101624e;
                if (bVar3 != null) {
                    str3 = bVar3.b();
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b(str3, "private", str2, str);
                return;
            }
            return;
        }
        com.bytedance.ies.im.core.api.b.b bVar4 = this.f101624e;
        if (bVar4 != null) {
            str3 = bVar4.b();
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b(str3, "group", str2, str);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.egv) {
                if (z != a()) {
                    SwitchCompat switchCompat = this.f101622c;
                    if (switchCompat == null) {
                        l.a("mMuteSwitch");
                    }
                    switchCompat.setEnabled(false);
                    a(!a(), "chat_mute_click");
                    com.bytedance.ies.im.core.api.b.b bVar = this.f101624e;
                    if (bVar != null) {
                        bVar.b(!a(), new c(this));
                    }
                }
            } else if (id == R.id.egw && z != b()) {
                SwitchCompat switchCompat2 = this.f101623d;
                if (switchCompat2 == null) {
                    l.a("mStickTopSwitch");
                }
                switchCompat2.setEnabled(false);
                a(!b(), "chat_top_click");
                com.bytedance.ies.im.core.api.b.b bVar2 = this.f101624e;
                if (bVar2 != null) {
                    bVar2.a(!b(), new d(this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a$a  reason: collision with other inner class name */
    public static final class C2527a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f101631a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101632b;

        static {
            Covode.recordClassIndex(65003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2527a(Object obj, Object obj2, a aVar) {
            super(obj2);
            this.f101631a = obj;
            this.f101632b = aVar;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, Boolean bool, Boolean bool2) {
            l.d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (a.a(this.f101632b).isChecked() ^ booleanValue) {
                a.a(this.f101632b).setChecked(booleanValue);
            }
        }
    }

    public static final class b extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f101633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101634b;

        static {
            Covode.recordClassIndex(65004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, a aVar) {
            super(obj2);
            this.f101633a = obj;
            this.f101634b = aVar;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, Boolean bool, Boolean bool2) {
            l.d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (a.b(this.f101634b).isChecked() ^ booleanValue) {
                a.b(this.f101634b).setChecked(booleanValue);
            }
        }
    }
}
