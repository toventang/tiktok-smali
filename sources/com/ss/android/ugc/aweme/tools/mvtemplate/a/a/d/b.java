package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f140692d = new a((byte) 0);

    static {
        Covode.recordClassIndex(91877);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91878);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        MvThemeData mvThemeData;
        if (obj instanceof ArrayList) {
            if (SettingsManager.a().a("enable_1080p_photo_mv", false) || cy.a.a().f118429a) {
                mvThemeData = a((ArrayList) obj, 1080);
            } else {
                mvThemeData = a((ArrayList) obj, 720);
            }
            if (mvThemeData != null) {
                e eVar = this.f140640a;
                if (eVar != null) {
                    eVar.a(mvThemeData);
                    return;
                }
                return;
            }
            e eVar2 = this.f140640a;
            if (eVar2 != null) {
                eVar2.a(((ArrayList) obj).get(0));
                return;
            }
            return;
        }
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140743l = "mv list pass error";
        }
        d dVar2 = this.f140642c.f140677f;
        if (dVar2 != null) {
            dVar2.f140742k = 3;
        }
        c cVar = this.f140642c.f140679h;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static MvThemeData a(ArrayList<?> arrayList, int i2) {
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MvThemeData) {
                MvThemeData mvThemeData = (MvThemeData) next;
                if (mvThemeData.f140624g == i2) {
                    return mvThemeData;
                }
            }
        }
        return null;
    }
}
