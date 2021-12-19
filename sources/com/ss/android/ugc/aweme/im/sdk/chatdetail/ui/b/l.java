package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.m;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class l extends t<a> implements i, j {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a f101723h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f101724i;

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.b<? super IMUser, z> f101725j;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.a<z> f101726k;

    /* renamed from: l  reason: collision with root package name */
    private a f101727l;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h.k.i[] f101728a = {new y(a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", 0), new y(a.class, "tvName", "getTvName()Landroid/widget/TextView;", 0), new y(a.class, "tvInviter", "getTvInviter()Landroid/widget/TextView;", 0), new y(a.class, "btAccept", "getBtAccept()Lcom/bytedance/tux/button/TuxButton;", 0), new y(a.class, "btDelete", "getBtDelete()Lcom/bytedance/tux/button/TuxButton;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final h.h.d f101729b = a((int) R.id.x8);

        /* renamed from: c  reason: collision with root package name */
        private final h.h.d f101730c = a((int) R.id.or);

        /* renamed from: d  reason: collision with root package name */
        private final h.h.d f101731d = a((int) R.id.f3c);

        /* renamed from: e  reason: collision with root package name */
        private final h.h.d f101732e = a((int) R.id.f11);

        /* renamed from: f  reason: collision with root package name */
        private final h.h.d f101733f = a((int) R.id.x4);

        static {
            Covode.recordClassIndex(65039);
        }

        public final AvatarImageView b() {
            return (AvatarImageView) this.f101730c.a(this, f101728a[0]);
        }

        public final TextView c() {
            return (TextView) this.f101731d.a(this, f101728a[1]);
        }

        public final TextView d() {
            return (TextView) this.f101732e.a(this, f101728a[2]);
        }

        public final TuxButton e() {
            return (TuxButton) this.f101733f.a(this, f101728a[3]);
        }
    }

    static {
        Covode.recordClassIndex(65038);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a58;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(73, new g(l.class, "onUserUpdate", m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public void b(a aVar) {
        h.f.b.l.d(aVar, "");
        EventBus.a().b(this);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f101734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101735b;

        static {
            Covode.recordClassIndex(65040);
        }

        b(l lVar, a aVar) {
            this.f101734a = lVar;
            this.f101735b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Boolean, z> bVar = this.f101734a.f101724i;
            if (bVar != null) {
                bVar.invoke(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f101736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101737b;

        static {
            Covode.recordClassIndex(65041);
        }

        c(l lVar, a aVar) {
            this.f101736a = lVar;
            this.f101737b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super Boolean, z> bVar = this.f101736a.f101724i;
            if (bVar != null) {
                bVar.invoke(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a f101738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f101739b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f101740c;

        static {
            Covode.recordClassIndex(65042);
        }

        d(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar, l lVar, a aVar2) {
            this.f101738a = aVar;
            this.f101739b = lVar;
            this.f101740c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super IMUser, z> bVar = this.f101739b.f101725j;
            if (bVar != null) {
                bVar.invoke(this.f101738a.f101513a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a f101741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f101742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f101743c;

        static {
            Covode.recordClassIndex(65043);
        }

        e(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar, l lVar, a aVar2) {
            this.f101741a = aVar;
            this.f101742b = lVar;
            this.f101743c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super IMUser, z> bVar = this.f101742b.f101725j;
            if (bVar != null) {
                bVar.invoke(this.f101741a.f101513a);
            }
        }
    }

    private final SpannableStringBuilder a(IMUser iMUser) {
        a aVar;
        ApplyStatusCode applyStatusCode = null;
        if (iMUser == null || (aVar = this.f101727l) == null) {
            return null;
        }
        Context context = aVar.d().getContext();
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar2 = this.f101723h;
        if (aVar2 != null) {
            applyStatusCode = aVar2.f101518f;
        }
        String str = "";
        if (applyStatusCode != null && m.f101745b[applyStatusCode.ordinal()] == 1) {
            a.C0730a aVar3 = new a.C0730a();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bd));
            String string = context.getString(R.string.c97);
            h.f.b.l.b(string, str);
            aVar3.a(string, foregroundColorSpan, 33);
            aVar3.a("·");
            Object[] objArr = new Object[1];
            String displayName = iMUser.getDisplayName();
            if (displayName == null) {
                displayName = str;
            }
            objArr[0] = displayName;
            String string2 = context.getString(R.string.c88, objArr);
            h.f.b.l.b(string2, str);
            aVar3.a(string2);
            return aVar3.f33382a;
        }
        Object[] objArr2 = new Object[1];
        String displayName2 = iMUser.getDisplayName();
        if (displayName2 != null) {
            str = displayName2;
        }
        objArr2[0] = str;
        return new SpannableStringBuilder(context.getString(R.string.c88, objArr2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(a aVar) {
        h.f.b.l.d(aVar, "");
        EventBus.a(EventBus.a(), this);
        this.f101727l = aVar;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar2 = this.f101723h;
        if (aVar2 != null) {
            a(aVar, aVar2.f101513a);
            ApplyStatusCode applyStatusCode = aVar2.f101518f;
            if (applyStatusCode != null && m.f101744a[applyStatusCode.ordinal()] == 1) {
                aVar.e().setVisibility(8);
            } else {
                aVar.e().setVisibility(0);
            }
            b(aVar, aVar2.f101522j);
            aVar.e().setOnClickListener(new b(this, aVar));
            ((TuxButton) aVar.f101729b.a(aVar, a.f101728a[4])).setOnClickListener(new c(this, aVar));
            aVar.b().setOnClickListener(new d(aVar2, this, aVar));
            aVar.c().setOnClickListener(new e(aVar2, this, aVar));
        }
        h.f.a.a<z> aVar3 = this.f101726k;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }

    @r
    public final void onUserUpdate(m mVar) {
        String str;
        IMUser a2;
        a aVar;
        a aVar2;
        h.f.b.l.d(mVar, "");
        String str2 = mVar.f102282a;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar3 = this.f101723h;
        String str3 = null;
        if (aVar3 != null) {
            str = aVar3.f101514b;
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) str2, (Object) str)) {
            IMUser a3 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(mVar.f102282a, mVar.f102283b);
            if (a3 != null && (aVar2 = this.f101727l) != null) {
                a(aVar2, a3);
                return;
            }
            return;
        }
        String str4 = mVar.f102282a;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar4 = this.f101723h;
        if (aVar4 != null) {
            str3 = aVar4.f101520h;
        }
        if (h.f.b.l.a((Object) str4, (Object) str3) && (a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(mVar.f102282a, mVar.f102283b)) != null && (aVar = this.f101727l) != null) {
            b(aVar, a2);
        }
    }

    private static void a(a aVar, IMUser iMUser) {
        String str;
        TextView c2 = aVar.c();
        UrlModel urlModel = null;
        if (iMUser != null) {
            str = iMUser.getDisplayName();
        } else {
            str = null;
        }
        c2.setText(str);
        AvatarImageView b2 = aVar.b();
        if (iMUser != null) {
            urlModel = iMUser.getDisplayAvatar();
        }
        com.ss.android.ugc.aweme.base.e.a(b2, urlModel);
    }

    private final void b(a aVar, IMUser iMUser) {
        if (iMUser != null) {
            aVar.d().setText(a(iMUser));
            aVar.d().setVisibility(0);
            return;
        }
        aVar.d().setVisibility(8);
    }
}
