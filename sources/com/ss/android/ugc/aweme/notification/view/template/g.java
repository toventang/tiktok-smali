package com.ss.android.ugc.aweme.notification.view.template;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.inbox.d.h;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.h.a.a;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public abstract class g extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private e f114040a;

    /* renamed from: b  reason: collision with root package name */
    private MusNotice f114041b;

    /* renamed from: c  reason: collision with root package name */
    private a f114042c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f114043d;

    static {
        Covode.recordClassIndex(73321);
    }

    public View a(int i2) {
        if (this.f114043d == null) {
            this.f114043d = new SparseArray();
        }
        View view = (View) this.f114043d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f114043d.put(i2, findViewById);
        return findViewById;
    }

    public abstract boolean a(View view);

    public abstract String b(View view);

    public abstract h getTemplatePosition();

    /* access modifiers changed from: protected */
    public final MusNotice getMBaseNotice() {
        return this.f114041b;
    }

    /* access modifiers changed from: protected */
    public final a getMBridge() {
        return this.f114042c;
    }

    /* access modifiers changed from: protected */
    public final e getTemplateNotice() {
        return this.f114040a;
    }

    private final void a() {
        a aVar = this.f114042c;
        if (aVar != null) {
            aVar.o();
        }
    }

    /* access modifiers changed from: protected */
    public final void setMBaseNotice(MusNotice musNotice) {
        this.f114041b = musNotice;
    }

    /* access modifiers changed from: protected */
    public final void setMBridge(a aVar) {
        this.f114042c = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setTemplateNotice(e eVar) {
        this.f114040a = eVar;
    }

    public void onClick(View view) {
        e eVar;
        String str;
        int i2;
        e eVar2;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            a aVar = this.f114042c;
            if (!(aVar == null || (eVar2 = this.f114040a) == null)) {
                String b2 = b(view);
                h templatePosition = getTemplatePosition();
                int l2 = aVar.l();
                String m2 = aVar.m();
                String j2 = aVar.j();
                String i3 = aVar.i();
                if (i3 == null) {
                    i3 = "";
                }
                f fVar = new f(eVar2, view, b2, templatePosition, l2, m2, j2, i3, aVar.k());
                aVar.n();
                List<c> h2 = aVar.h();
                if (h2 != null) {
                    Iterator<T> it = h2.iterator();
                    while (it.hasNext()) {
                        if (it.next().a(fVar)) {
                            a();
                            return;
                        }
                    }
                }
            }
            if (!a(view) && (eVar = this.f114040a) != null && (str = eVar.f112850h) != null) {
                a aVar2 = this.f114042c;
                if (aVar2 != null) {
                    e eVar3 = this.f114040a;
                    if (eVar3 != null) {
                        i2 = eVar3.f112855m;
                    } else {
                        i2 = -1;
                    }
                    aVar2.d(i2);
                }
                a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        Integer num;
        String str2;
        l.d(str, "");
        MusNotice musNotice = this.f114041b;
        String str3 = null;
        if (musNotice != null) {
            num = Integer.valueOf(musNotice.type);
        } else {
            num = null;
        }
        MusNotice musNotice2 = this.f114041b;
        if (musNotice2 != null) {
            str2 = musNotice2.nid;
        } else {
            str2 = null;
        }
        h.a(str, num, str2);
        c.HandlerC2905c b2 = c.b();
        if (b2 != null) {
            b2.b(this.f114041b);
        }
        a();
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        t a2 = t.a();
        u a3 = u.a(str);
        a aVar = this.f114042c;
        if (aVar != null) {
            str3 = aVar.j();
        }
        u a4 = a3.a("second_tab_name", str3);
        String queryParameter = parse.getQueryParameter("show_comment");
        if (queryParameter == null) {
            queryParameter = "0";
        }
        u a5 = a4.a("comment_force_open_reply", queryParameter);
        String queryParameter2 = parse.getQueryParameter("enter_method");
        if (queryParameter2 == null) {
            queryParameter2 = "click";
        }
        u a6 = a5.a("enter_method", queryParameter2);
        l.b(a6, "");
        t.a(a2, activity, c.a(a6, str).f71178a.a());
    }

    /* access modifiers changed from: protected */
    public final void a(View view, View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a aVar = this.f114042c;
            if (aVar != null) {
                view.setOnLongClickListener(aVar.p());
            }
        }
    }

    public void a(MusNotice musNotice, a aVar) {
        l.d(musNotice, "");
        l.d(aVar, "");
        this.f114041b = musNotice;
        this.f114040a = musNotice.templateNotice;
        this.f114042c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
