package com.ss.android.ugc.aweme.commercialize.egg.impl.view;

import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.commercialize.egg.e.a {

    /* renamed from: a  reason: collision with root package name */
    private CommerceEggLayout f74032a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.egg.impl.b.a f74033b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.egg.impl.b.a f74034c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.egg.impl.b.a f74035d;

    /* renamed from: e  reason: collision with root package name */
    private String f74036e = "";

    /* renamed from: f  reason: collision with root package name */
    private final ViewStub f74037f;

    static {
        Covode.recordClassIndex(45594);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.e.a
    public final void a() {
        String str = this.f74036e;
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -906336856) {
            if (hashCode == 3321751 && str.equals("like")) {
                com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73966a = null;
            }
        } else if (str.equals("search")) {
            com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73967b = null;
        }
        com.ss.android.ugc.aweme.commercialize.egg.impl.b.a aVar = this.f74033b;
        if (aVar != null) {
            aVar.c();
        }
        com.ss.android.ugc.aweme.commercialize.egg.impl.b.a aVar2 = this.f74034c;
        if (aVar2 != null) {
            aVar2.c();
        }
        com.ss.android.ugc.aweme.commercialize.egg.impl.b.a aVar3 = this.f74035d;
        if (aVar3 != null) {
            aVar3.c();
        }
        CommerceEggLayout commerceEggLayout = this.f74032a;
        if (commerceEggLayout != null) {
            commerceEggLayout.removeAllViews();
            commerceEggLayout.setVisibility(8);
        }
    }

    public a(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f74037f = viewStub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r3 == null) goto L_0x0027;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.egg.e.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.commercialize.egg.d.d r9) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.egg.impl.view.a.a(com.ss.android.ugc.aweme.commercialize.egg.d.d):void");
    }
}
