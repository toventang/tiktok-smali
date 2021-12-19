package com.ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.im.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.j.c;
import com.ss.android.ugc.aweme.share.improve.b.d;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.i;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.share.b f123820a;

    /* renamed from: b  reason: collision with root package name */
    private d f123821b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f123822c;

    static {
        Covode.recordClassIndex(81264);
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, com.ss.android.ugc.aweme.sharer.ui.i
    public void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.im.service.share.b bVar;
        super.onCreate(bundle);
        boolean a2 = a.a();
        boolean z = false;
        if (!this.n.f124658j || a2 || this.n.s) {
            d dVar = this.f123821b;
            if (dVar != null) {
                dVar.f123834b = false;
            }
        } else {
            Activity activity = this.f123822c;
            View findViewById = findViewById(R.id.e1l);
            if (findViewById == null) {
                l.b();
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            View findViewById2 = findViewById(R.id.e1g);
            if (findViewById2 == null) {
                l.b();
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById2;
            View findViewById3 = findViewById(R.id.e1i);
            if (findViewById3 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.im.b.a aVar = new com.ss.android.ugc.aweme.im.b.a(new com.ss.android.ugc.aweme.im.b.b(activity, this, viewGroup, viewGroup2, findViewById3, this.n.f124657i, this.n.f124661m));
            c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                Activity activity2 = this.f123822c;
                View findViewById4 = findViewById(R.id.e1s);
                if (findViewById4 == null) {
                    l.b();
                }
                ViewGroup viewGroup3 = (ViewGroup) findViewById4;
                View findViewById5 = findViewById(R.id.e1h);
                if (findViewById5 == null) {
                    l.b();
                }
                ViewGroup viewGroup4 = (ViewGroup) findViewById5;
                View findViewById6 = findViewById(R.id.e1j);
                if (findViewById6 == null) {
                    l.b();
                }
                FrameLayout frameLayout = (FrameLayout) findViewById6;
                SharePackage sharePackage = this.n.f124657i;
                boolean z2 = this instanceof c;
                View findViewById7 = findViewById(R.id.e1o);
                if (findViewById7 == null) {
                    l.b();
                }
                MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById7;
                View findViewById8 = findViewById(R.id.e1r);
                if (findViewById8 == null) {
                    l.b();
                }
                bVar = shareService.a(new com.ss.android.ugc.aweme.im.service.share.b.b(activity2, sharePackage, viewGroup3, viewGroup4, frameLayout, z2, measureLinearLayout, (TextView) findViewById8), aVar);
            } else {
                bVar = null;
            }
            this.f123820a = bVar;
            d dVar2 = this.f123821b;
            if (dVar2 != null) {
                dVar2.f123833a = bVar;
            }
        }
        Window window = getWindow();
        if (window != null) {
            fc.a(window);
        }
        StringBuilder append = new StringBuilder("config has supportIm: ").append(this.n.f124658j).append(", hideContacts: ").append(this.n.s).append("topView is null: ");
        if (this.n.f124659k == null) {
            z = true;
        }
        com.ss.android.ugc.aweme.framework.a.a.b("CommonShareDialog", append.append(z).append(", has channels size: ").append(this.n.f124649a).append(", has actions size: ").append(this.n.f124650b).toString());
        com.ss.android.ugc.aweme.cc.c.a("share_panel", (com.ss.android.ugc.aweme.cc.b) null, 6);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, e eVar, int i2) {
        super(activity, i2, eVar);
        l.d(activity, "");
        l.d(eVar, "");
        this.f123822c = activity;
        List<com.ss.android.ugc.aweme.sharer.b> list = eVar.f124649a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof d) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1 ? false : true) {
            Object obj = arrayList2.get(0);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            this.f123821b = (d) obj;
        }
        if (this.f123821b != null && a.a()) {
            List<com.ss.android.ugc.aweme.sharer.b> list2 = eVar.f124649a;
            d dVar = this.f123821b;
            if (dVar == null) {
                l.b();
            }
            list2.remove(dVar);
            this.f123821b = null;
        }
    }
}
