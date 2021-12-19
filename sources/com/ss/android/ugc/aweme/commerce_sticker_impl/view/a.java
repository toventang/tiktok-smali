package com.ss.android.ugc.aweme.commerce_sticker_impl.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout;
import com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a implements com.ss.android.ugc.aweme.commerce_sticker_api.b.a {

    /* renamed from: a  reason: collision with root package name */
    private CommerceStickerDetailAuthorLayout f73611a;

    /* renamed from: b  reason: collision with root package name */
    private CommerceStickerDetailDescLayout f73612b;

    /* renamed from: c  reason: collision with root package name */
    private CommerceStickerDetailDisclaimerLayout f73613c;

    /* renamed from: d  reason: collision with root package name */
    private CommerceStickerDetailLinkLayout f73614d;

    /* renamed from: e  reason: collision with root package name */
    private CommerceStickerDetailMissionLayout f73615e;

    static {
        Covode.recordClassIndex(45305);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.b.a
    public final void a(c cVar) {
        boolean z;
        String str;
        ChallengeDisclaimer disclaimer;
        String title;
        ChallengeDisclaimer disclaimer2;
        String content;
        boolean z2;
        l.d(cVar, "");
        CommerceStickerDetailAuthorLayout commerceStickerDetailAuthorLayout = this.f73611a;
        if (commerceStickerDetailAuthorLayout == null || !commerceStickerDetailAuthorLayout.a(cVar)) {
            z = true;
        } else {
            z = false;
        }
        CommerceStickerDetailDescLayout commerceStickerDetailDescLayout = this.f73612b;
        if (commerceStickerDetailDescLayout != null) {
            l.d(cVar, "");
            String detailDesc = cVar.getDetailDesc();
            if (detailDesc != null) {
                if (detailDesc.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    TuxTextView tuxTextView = (TuxTextView) commerceStickerDetailDescLayout.a(R.id.ej4);
                    l.b(tuxTextView, "");
                    tuxTextView.setVisibility(8);
                } else {
                    TuxTextView tuxTextView2 = (TuxTextView) commerceStickerDetailDescLayout.a(R.id.ej4);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    com.ss.android.ugc.aweme.commerce_sticker_api.a.a a2 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
                    if (a2 != null) {
                        a2.a(detailDesc, (TextView) commerceStickerDetailDescLayout.a(R.id.ej4), (ViewGroup) commerceStickerDetailDescLayout.a(R.id.aym), (TextView) commerceStickerDetailDescLayout.a(R.id.fae), (ImageView) commerceStickerDetailDescLayout.a(R.id.bt8));
                    }
                }
            }
        }
        CommerceStickerDetailDisclaimerLayout commerceStickerDetailDisclaimerLayout = this.f73613c;
        if (commerceStickerDetailDisclaimerLayout != null) {
            l.d(cVar, "");
            if (!z || (disclaimer = cVar.getDisclaimer()) == null || (title = disclaimer.getTitle()) == null || title.length() <= 0 || (disclaimer2 = cVar.getDisclaimer()) == null || (content = disclaimer2.getContent()) == null || content.length() <= 0) {
                commerceStickerDetailDisclaimerLayout.setVisibility(8);
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) commerceStickerDetailDisclaimerLayout.a(R.id.amg);
                l.b(tuxTextView3, "");
                ChallengeDisclaimer disclaimer3 = cVar.getDisclaimer();
                l.b(disclaimer3, "");
                tuxTextView3.setText(disclaimer3.getTitle());
                TuxTextView tuxTextView4 = (TuxTextView) commerceStickerDetailDisclaimerLayout.a(R.id.amf);
                l.b(tuxTextView4, "");
                ChallengeDisclaimer disclaimer4 = cVar.getDisclaimer();
                l.b(disclaimer4, "");
                tuxTextView4.setText(disclaimer4.getContent());
            }
        }
        CommerceStickerDetailLinkLayout commerceStickerDetailLinkLayout = this.f73614d;
        if (commerceStickerDetailLinkLayout != null) {
            l.d(cVar, "");
            View a3 = commerceStickerDetailLinkLayout.a(R.id.v1);
            l.b(a3, "");
            a3.setVisibility(0);
            String detailLetters = cVar.getDetailLetters();
            if (TextUtils.isEmpty(detailLetters)) {
                LinearLayout linearLayout = (LinearLayout) commerceStickerDetailLinkLayout.a(R.id.c4m);
                l.b(linearLayout, "");
                linearLayout.setVisibility(8);
            } else {
                r.a("show_link", new d().a("enter_from", "prop_page").a(StringSet.type, "web_link").a("prop_id", cVar.getId()).f66730a);
                LinearLayout linearLayout2 = (LinearLayout) commerceStickerDetailLinkLayout.a(R.id.c4m);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
                TuxTextView tuxTextView5 = (TuxTextView) commerceStickerDetailLinkLayout.a(R.id.ej5);
                l.b(tuxTextView5, "");
                tuxTextView5.setText(detailLetters);
                if (commerceStickerDetailLinkLayout.a(R.id.ej5) instanceof TuxTextView) {
                    ((TuxTextView) commerceStickerDetailLinkLayout.a(R.id.ej5)).setTuxFont(72);
                }
                ((TuxTextView) commerceStickerDetailLinkLayout.a(R.id.ej5)).setOnClickListener(new CommerceStickerDetailLinkLayout.a(commerceStickerDetailLinkLayout, cVar));
            }
        }
        CommerceStickerDetailMissionLayout commerceStickerDetailMissionLayout = this.f73615e;
        if (commerceStickerDetailMissionLayout != null) {
            l.d(cVar, "");
            HTCMissionModule htcMissionModule = cVar.getHtcMissionModule();
            String str2 = null;
            if (htcMissionModule != null) {
                str = htcMissionModule.getMissionId();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                commerceStickerDetailMissionLayout.setVisibility(8);
                return;
            }
            commerceStickerDetailMissionLayout.setVisibility(0);
            if (commerceStickerDetailMissionLayout.f73607a == null) {
                commerceStickerDetailMissionLayout.f73607a = new HashMap();
            }
            View view = (View) commerceStickerDetailMissionLayout.f73607a.get(Integer.valueOf((int) R.id.cmn));
            if (view == null) {
                view = commerceStickerDetailMissionLayout.findViewById(R.id.cmn);
                commerceStickerDetailMissionLayout.f73607a.put(Integer.valueOf((int) R.id.cmn), view);
            }
            TuxTextView tuxTextView6 = (TuxTextView) view;
            l.b(tuxTextView6, "");
            HTCMissionModule htcMissionModule2 = cVar.getHtcMissionModule();
            if (htcMissionModule2 != null) {
                str2 = htcMissionModule2.getText();
            }
            tuxTextView6.setText(str2);
            CommerceStickerDetailMissionLayout.a(htcMissionModule, true);
            commerceStickerDetailMissionLayout.setOnClickListener(new CommerceStickerDetailMissionLayout.a(commerceStickerDetailMissionLayout, cVar, htcMissionModule));
        }
    }

    public a(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5) {
        l.d(viewStub, "");
        l.d(viewStub2, "");
        l.d(viewStub3, "");
        l.d(viewStub4, "");
        l.d(viewStub5, "");
        MethodCollector.i(9557);
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.r2);
            viewStub.setInflatedId(R.id.ft);
            View inflate = viewStub.inflate();
            if (inflate != null) {
                this.f73611a = (CommerceStickerDetailAuthorLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailAuthorLayout");
                MethodCollector.o(9557);
                throw nullPointerException;
            }
        } else {
            this.f73611a = (CommerceStickerDetailAuthorLayout) viewStub.findViewById(R.id.ft);
        }
        if (viewStub2.getParent() != null) {
            viewStub2.setLayoutResource(R.layout.r4);
            viewStub2.setInflatedId(R.id.c8z);
            View inflate2 = viewStub2.inflate();
            if (inflate2 != null) {
                this.f73612b = (CommerceStickerDetailDescLayout) inflate2;
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailDescLayout");
                MethodCollector.o(9557);
                throw nullPointerException2;
            }
        } else {
            this.f73612b = (CommerceStickerDetailDescLayout) viewStub2.findViewById(R.id.c8z);
        }
        if (viewStub3.getParent() != null) {
            viewStub3.setLayoutResource(R.layout.r6);
            viewStub3.setInflatedId(R.id.fl1);
            View inflate3 = viewStub3.inflate();
            if (inflate3 != null) {
                this.f73613c = (CommerceStickerDetailDisclaimerLayout) inflate3;
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailDisclaimerLayout");
                MethodCollector.o(9557);
                throw nullPointerException3;
            }
        } else {
            this.f73613c = (CommerceStickerDetailDisclaimerLayout) viewStub3.findViewById(R.id.fl1);
        }
        if (viewStub4.getParent() != null) {
            viewStub4.setLayoutResource(R.layout.r8);
            viewStub4.setInflatedId(R.id.c6g);
            View inflate4 = viewStub4.inflate();
            if (inflate4 != null) {
                this.f73614d = (CommerceStickerDetailLinkLayout) inflate4;
            } else {
                NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailLinkLayout");
                MethodCollector.o(9557);
                throw nullPointerException4;
            }
        } else {
            this.f73614d = (CommerceStickerDetailLinkLayout) viewStub4.findViewById(R.id.c6g);
        }
        if (viewStub5.getParent() != null) {
            viewStub5.setLayoutResource(R.layout.r_);
            viewStub5.setInflatedId(R.id.c8j);
            View inflate5 = viewStub5.inflate();
            if (inflate5 != null) {
                this.f73615e = (CommerceStickerDetailMissionLayout) inflate5;
                MethodCollector.o(9557);
                return;
            }
            NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce_sticker_impl.view.CommerceStickerDetailMissionLayout");
            MethodCollector.o(9557);
            throw nullPointerException5;
        }
        this.f73615e = (CommerceStickerDetailMissionLayout) viewStub5.findViewById(R.id.c8j);
        MethodCollector.o(9557);
    }
}
