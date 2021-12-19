package com.ss.android.ugc.aweme.tcm.impl.service;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.commercialize.util.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.profile.model.BCHashtag;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.ss.android.ugc.aweme.tcm.api.b.a;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.api.CheckBAApi;
import com.ss.android.ugc.aweme.tcm.impl.b.d;
import com.ss.android.ugc.aweme.tcm.impl.d.b;
import com.ss.android.ugc.aweme.tcm.impl.d.e;
import com.ss.android.ugc.aweme.tcm.impl.e.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TcmServiceImpl implements ITcmService {
    static {
        Covode.recordClassIndex(90703);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final boolean a(Activity activity, Context context, boolean z, List<? extends AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA) {
        String uid;
        String str = "";
        l.d(activity, str);
        l.d(context, str);
        l.d(checkBAShowLoading, str);
        l.d(checkBAHideLoading, str);
        l.d(checkBAToPublish, str);
        l.d(checkBADetagBA, str);
        l.d(activity, str);
        l.d(context, str);
        l.d(checkBAShowLoading, str);
        l.d(checkBAHideLoading, str);
        l.d(checkBAToPublish, str);
        l.d(checkBADetagBA, str);
        TcmConfig a2 = e.a();
        if (!(a2 == null || a2.getCheckBABeforePost())) {
            return false;
        }
        if (a.c() != null) {
            TagBAUser c2 = a.c();
            if (c2 == null || c2.getUid() == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            TagBAUser c3 = a.c();
            if (!(c3 == null || (uid = c3.getUid()) == null)) {
                str = uid;
            }
            arrayList.add(str);
            ((CheckBAApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(CheckBAApi.class, c.f75475a)).getCheckBA(new f().b(arrayList)).c(new a.C3658a(checkBAShowLoading)).a(new a.b(checkBAHideLoading, checkBAToPublish, context, checkBADetagBA), new a.c(checkBAToPublish));
            return true;
        }
        if (TextUtils.equals(com.ss.android.ugc.aweme.tcm.impl.e.a.a() ? com.ss.android.ugc.aweme.tcm.api.b.a.b() : com.ss.android.ugc.aweme.tcm.api.b.c.b(), "0") || list == null || list.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : list) {
            if (aVTextExtraStruct.getType() == 0) {
                String userId = aVTextExtraStruct.getUserId();
                l.b(userId, str);
                arrayList2.add(userId);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        ((CheckBAApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(CheckBAApi.class, c.f75475a)).getCheckBA(new f().b(arrayList2)).c(new a.d(checkBAShowLoading)).a(new a.e(checkBAHideLoading, checkBAToPublish, context, activity, z), new a.f(checkBAToPublish));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final boolean a(Aweme aweme, String str) {
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        d bizAccountInfo;
        return (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentViewInsights() || !com.ss.android.ugc.aweme.tcm.impl.e.a.a(str)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final TcmConfig i() {
        return e.a();
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final String b() {
        if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
            return com.ss.android.ugc.aweme.tcm.api.b.a.a();
        }
        return com.ss.android.ugc.aweme.tcm.api.b.c.a();
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final String d() {
        BrandedContentToolSchema a2 = b.a();
        if (a2 != null) {
            return a2.baBcSchema;
        }
        return null;
    }

    public static ITcmService j() {
        Object a2 = com.ss.android.ugc.b.a(ITcmService.class, false);
        if (a2 != null) {
            return (ITcmService) a2;
        }
        return new TcmServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final String c() {
        String str;
        if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
            str = com.ss.android.ugc.aweme.tcm.api.b.a.b();
            if (str == null) {
                return "0";
            }
        } else {
            str = com.ss.android.ugc.aweme.tcm.api.b.c.b();
            if (str == null) {
                return "0";
            }
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final BcAdModel f() {
        String str;
        BCHashtag bcHashtag;
        String partnerWith;
        BCHashtag bcHashtag2;
        TcmConfig a2 = e.a();
        TagBAUser tagBAUser = null;
        if (a2 == null || (bcHashtag2 = a2.getBcHashtag()) == null) {
            str = null;
        } else {
            str = bcHashtag2.getAd();
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        TcmConfig a3 = e.a();
        if (!(a3 == null || (bcHashtag = a3.getBcHashtag()) == null || (partnerWith = bcHashtag.getPartnerWith()) == null)) {
            str2 = partnerWith;
        }
        a.AbstractC3653a aVar = com.ss.android.ugc.aweme.tcm.api.b.a.f138554a;
        if (aVar != null) {
            tagBAUser = aVar.getShouldBeDetag();
        }
        return new BcAdModel(str, str2, tagBAUser);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final boolean g() {
        TcmConfig a2;
        TcmConfig a3;
        com.ss.android.ugc.aweme.tcm.api.a.a a4 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
        if ((a4 == null || !a4.a()) && (a2 = e.a()) != null && a2.isTcmCreator() && (a3 = e.a()) != null && !a3.getUseNewTcmToggle()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final int e() {
        User b2;
        String str;
        com.ss.android.ugc.aweme.commerce.e brandedContent;
        com.ss.android.ugc.aweme.notice.api.bean.a aVar = com.ss.android.ugc.aweme.tcm.impl.c.a.f138612c.a().f138613a;
        com.ss.android.ugc.aweme.tcm.api.a.a a2 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
        if (!(a2 == null || (b2 = a2.b()) == null)) {
            if (aVar != null) {
                str = aVar.getUid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, b2.getUid())) {
                com.ss.android.ugc.aweme.commerce.c a3 = com.ss.android.ugc.aweme.tcm.impl.d.a.a();
                if (!(a3 == null || (brandedContent = a3.getBrandedContent()) == null)) {
                    return brandedContent.getNewContentNum();
                }
            } else if (aVar != null) {
                return aVar.getNewContentNum();
            } else {
                return 0;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void h() {
        TcmConfig a2;
        TcmConfig a3;
        if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
            com.ss.android.ugc.aweme.tcm.api.b.a.a((String) null);
            com.ss.android.ugc.aweme.tcm.api.b.a.b("0");
            com.ss.android.ugc.aweme.tcm.api.b.a.a((TagBAUser) null);
            com.ss.android.ugc.aweme.tcm.api.b.a.d();
        }
        com.ss.android.ugc.aweme.tcm.api.a.a a4 = com.ss.android.ugc.aweme.tcm.impl.a.a.a();
        if ((a4 == null || !a4.a()) && (a2 = e.a()) != null && a2.isTcmCreator() && (a3 = e.a()) != null && a3.getUseNewTcmToggle()) {
            com.ss.android.ugc.aweme.tcm.api.b.c.b("0");
            com.ss.android.ugc.aweme.tcm.api.b.c.a(null);
            com.ss.android.ugc.aweme.tcm.api.b.a.a((TagBAUser) null);
            com.ss.android.ugc.aweme.tcm.api.b.a.d();
        }
        if (g()) {
            com.ss.android.ugc.aweme.tcm.api.b.c.b("0");
            com.ss.android.ugc.aweme.tcm.api.b.c.a(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final boolean a() {
        return com.ss.android.ugc.aweme.tcm.impl.e.a.a();
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final com.ss.android.ugc.aweme.tcm.api.service.b a(ViewStub viewStub) {
        l.d(viewStub, "");
        return new com.ss.android.ugc.aweme.tcm.impl.view.b(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void a(com.ss.android.ugc.aweme.tcm.api.a.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.tcm.impl.a.a.f138562a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void a(Activity activity, boolean z) {
        com.ss.android.ugc.aweme.tcm.impl.e.a.a();
        com.ss.android.ugc.aweme.tcm.impl.b.b.a(activity, z, null);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final com.ss.android.ugc.aweme.tcm.api.service.a a(ViewGroup viewGroup, Context context) {
        l.d(viewGroup, "");
        l.d(context, "");
        return new com.ss.android.ugc.aweme.tcm.impl.view.a(viewGroup, context);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final boolean b(Aweme aweme, String str) {
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        d bizAccountInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bizAccountInfo = commerceVideoAuthInfo.getBizAccountInfo()) == null || !bizAccountInfo.enableBrandedContentRemoveMe() || !com.ss.android.ugc.aweme.tcm.impl.e.a.a(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void a(Context context, Aweme aweme) {
        String str;
        String str2 = "";
        l.d(context, str2);
        l.d(context, str2);
        BrandedContentToolSchema a2 = b.a();
        String str3 = null;
        if (a2 != null) {
            str = a2.baViewInsightsSchema;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            if (aweme != null) {
                str3 = aweme.getAid();
            }
            bundle.putString("itemID", str3);
            bundle.putString("enter_from", "video_play");
            if (str != null) {
                str2 = str;
            }
            SmartRouter.buildRoute(context, com.ss.android.ugc.aweme.commercialize.util.d.a(str2, bundle)).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void a(ViewStub viewStub, ax.a aVar) {
        l.d(viewStub, "");
        l.d(aVar, "");
        new com.ss.android.ugc.aweme.tcm.impl.bc.view.a(viewStub, aVar);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void b(Context context, Aweme aweme) {
        l.d(context, "");
        l.d(context, "");
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(context);
        bVar.a(R.string.a3o, new a.g(aweme, context));
        bVar.b(R.string.a3d, a.h.f138640a);
        com.bytedance.tux.dialog.a a2 = ((com.bytedance.tux.dialog.b) a.C1094a.a(context).a(R.string.a3p).b(R.string.a3r)).a(bVar).a();
        a2.a();
        a2.b().show();
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final void a(Context context, com.bytedance.ies.web.a.a aVar, i iVar) {
        MethodCollector.i(7829);
        l.d(context, "");
        l.d(context, "");
        String string = context.getResources().getString(R.string.a3k);
        l.b(string, "");
        String string2 = context.getResources().getString(R.string.a3f, string);
        l.b(string2, "");
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a2;
        SpannableString spannableString = new SpannableString(string2);
        if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new TypefaceSpan(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g)), a2, length, 33);
        } else {
            spannableString.setSpan(new StyleSpan(com.ss.android.ugc.tools.view.style.a.MEDIUM.getVALUE()), a2, length, 33);
        }
        spannableString.setSpan(new d.C3656d(context), a2, length, 33);
        TextView textView = new TextView(context);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());
        int b2 = (int) n.b(context, 24.0f);
        int b3 = (int) n.b(context, 20.0f);
        textView.setPadding(b3, b2, b3, 0);
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(androidx.core.content.b.c(context, R.color.c4));
        textView.setLineSpacing(3.0f, 1.0f);
        textView.setGravity(17);
        a.C0731a aVar2 = new a.C0731a(context);
        aVar2.s = textView;
        a.C0731a b4 = aVar2.a(R.string.a3g, (DialogInterface.OnClickListener) new d.b(aVar, iVar), false).b(R.string.a3h, (DialogInterface.OnClickListener) new d.c(aVar, iVar), false);
        b4.E = true;
        b4.M = false;
        b4.a().c();
        MethodCollector.o(7829);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmService
    public final int a(Context context, Activity activity, boolean z, boolean z2, boolean z3, List<? extends AVTextExtraStruct> list) {
        String b2;
        TcmConfig a2;
        List<String> hashtagList;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        l.d(context, "");
        l.d(activity, "");
        l.d(context, "");
        l.d(activity, "");
        if ((!z || com.ss.android.ugc.aweme.tcm.impl.b.d.b()) && (com.ss.android.ugc.aweme.tcm.impl.e.a.a() || com.ss.android.ugc.aweme.tcm.impl.b.d.a())) {
            if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
                b2 = com.ss.android.ugc.aweme.tcm.api.b.a.b();
            } else {
                b2 = com.ss.android.ugc.aweme.tcm.api.b.c.b();
            }
            if (!TextUtils.equals(b2, "1") && !TextUtils.equals(b2, "2") && (a2 = e.a()) != null && (hashtagList = a2.getHashtagList()) != null && !hashtagList.isEmpty() && list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int i7 = 0;
                for (AVTextExtraStruct aVTextExtraStruct : list) {
                    if (aVTextExtraStruct.getType() == 1) {
                        Iterator<String> it = hashtagList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (TextUtils.equals("#" + aVTextExtraStruct.getHashTagName(), next)) {
                                sb.append(next).append(" ");
                                sb2.append(next).append(",");
                                i7++;
                                break;
                            }
                        }
                    }
                }
                if (i7 != 0) {
                    String sb3 = sb.toString();
                    l.b(sb3, "");
                    String sb4 = sb2.deleteCharAt(sb2.length() - 1).toString();
                    l.b(sb4, "");
                    com.ss.android.ugc.aweme.tcm.api.b.b bVar = new com.ss.android.ugc.aweme.tcm.api.b.b(i7, sb3, sb4);
                    if (com.ss.android.ugc.aweme.tcm.impl.b.d.b()) {
                        if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
                            com.ss.android.ugc.aweme.tcm.api.b.a.b("2");
                        } else {
                            com.ss.android.ugc.aweme.tcm.api.b.c.b("2");
                        }
                        if (z3) {
                            str = "commercial_music";
                        } else {
                            str = "original_sound";
                        }
                        r.a("tcm_bc_toggle", new com.ss.android.ugc.aweme.app.f.d().a("click_toggle", 4).f66730a);
                        r.a("tcm_bctoggle_auto_on", new com.ss.android.ugc.aweme.app.f.d().a("music_scen", str).a("bc_hashtag", bVar.f138557b).f66730a);
                        if (com.ss.android.ugc.aweme.tcm.impl.e.a.a()) {
                            com.ss.android.ugc.aweme.tcm.api.b.a.b("2");
                        } else {
                            com.ss.android.ugc.aweme.tcm.api.b.c.b("2");
                        }
                    }
                    boolean b3 = com.ss.android.ugc.aweme.tcm.impl.b.d.b();
                    if (!b3) {
                        if (!z) {
                            i2 = R.string.gdl;
                        }
                        return 1;
                    }
                    i2 = R.string.gdh;
                    String string = context.getString(i2, bVar.f138558c);
                    l.b(string, "");
                    if (bVar.f138556a == 1) {
                        if (b3) {
                            i6 = R.string.gdi;
                        } else {
                            i6 = R.string.gdm;
                        }
                        string = context.getString(i6, bVar.f138558c);
                        l.b(string, "");
                    }
                    String string2 = context.getString(R.string.gdg);
                    l.b(string2, "");
                    if (b3) {
                        i3 = R.string.gdj;
                    } else {
                        i3 = R.string.gdn;
                    }
                    String string3 = context.getString(i3, string2);
                    l.b(string3, "");
                    if (bVar.f138556a > 1) {
                        if (b3) {
                            i5 = R.string.gdk;
                        } else {
                            i5 = R.string.gdo;
                        }
                        string3 = context.getString(i5, string2);
                        l.b(string3, "");
                    }
                    String str2 = string + ' ' + string3;
                    int a3 = p.a((CharSequence) str2, string2);
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new a.k(context), a3, string2.length() + a3, 33);
                    com.bytedance.tux.dialog.b.b bVar2 = new com.bytedance.tux.dialog.b.b(context);
                    if (b3) {
                        i4 = R.string.gdr;
                    } else {
                        i4 = R.string.gdp;
                    }
                    String string4 = context.getString(i4);
                    l.b(string4, "");
                    bVar2.a(string4, new a.i(b3));
                    bVar2.b(R.string.gdq, new a.j(b3, activity, z2));
                    bVar2.f44820b = true;
                    com.bytedance.tux.dialog.a a4 = ((com.bytedance.tux.dialog.b) a.C1094a.a(context).a(R.string.gds)).d(spannableString).a(bVar2).a();
                    a4.a();
                    a4.b().show();
                    return 1;
                }
            }
        }
        return 0;
    }
}
